package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.hardware.SyncFence;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.u;
import io.flutter.view.v;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@Keep
@TargetApi(29)
/* loaded from: classes.dex */
public final class FlutterRenderer$ImageReaderSurfaceProducer implements TextureRegistry$SurfaceProducer, TextureRegistry$ImageConsumer, u {
    private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
    private static final int MAX_DEQUEUED_IMAGES = 2;
    private static final int MAX_IMAGES = 6;
    private static final String TAG = "ImageReaderSurfaceProducer";
    private static final boolean VERBOSE_LOGS = false;
    private static final boolean trimOnMemoryPressure = true;
    private v callback;
    private final long id;
    private boolean released;
    final /* synthetic */ n this$0;
    private boolean ignoringFence = VERBOSE_LOGS;
    private int requestedWidth = 1;
    private int requestedHeight = 1;
    private boolean createNewReader = true;
    private boolean notifiedDestroy = VERBOSE_LOGS;
    private long lastDequeueTime = 0;
    private long lastQueueTime = 0;
    private long lastScheduleTime = 0;
    private int numTrims = 0;
    private final Object lock = new Object();
    private final ArrayDeque<i> imageReaderQueue = new ArrayDeque<>();
    private final HashMap<ImageReader, i> perImageReaders = new HashMap<>();
    private ArrayList<g> lastDequeuedImage = new ArrayList<>();
    private i lastReaderDequeuedFrom = null;

    public FlutterRenderer$ImageReaderSurfaceProducer(n nVar, long j3) {
        this.this$0 = nVar;
        this.id = j3;
    }

    public static /* synthetic */ v access$200(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer) {
        flutterRenderer$ImageReaderSurfaceProducer.getClass();
        return null;
    }

    private void cleanup() {
        synchronized (this.lock) {
            try {
                for (i iVar : this.perImageReaders.values()) {
                    if (this.lastReaderDequeuedFrom == iVar) {
                        this.lastReaderDequeuedFrom = null;
                    }
                    iVar.f3471c = true;
                    iVar.f3469a.close();
                    iVar.f3470b.clear();
                }
                this.perImageReaders.clear();
                if (this.lastDequeuedImage.size() > 0) {
                    Iterator<g> it = this.lastDequeuedImage.iterator();
                    while (it.hasNext()) {
                        it.next().f3466a.close();
                    }
                    this.lastDequeuedImage.clear();
                }
                i iVar2 = this.lastReaderDequeuedFrom;
                if (iVar2 != null) {
                    iVar2.f3471c = true;
                    iVar2.f3469a.close();
                    iVar2.f3470b.clear();
                    this.lastReaderDequeuedFrom = null;
                }
                this.imageReaderQueue.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private ImageReader createImageReader() {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 33) {
            return createImageReader33();
        }
        if (r02 >= 29) {
            return createImageReader29();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    @TargetApi(29)
    private ImageReader createImageReader29() {
        ImageReader newInstance;
        newInstance = ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 6, 256L);
        return newInstance;
    }

    @TargetApi(33)
    private ImageReader createImageReader33() {
        ImageReader build;
        Q0.e.o();
        ImageReader.Builder h3 = Q0.e.h(this.requestedWidth, this.requestedHeight);
        h3.setMaxImages(6);
        h3.setImageFormat(34);
        h3.setUsage(256L);
        build = h3.build();
        return build;
    }

    private i getActiveReader() {
        synchronized (this.lock) {
            try {
                if (this.createNewReader) {
                    this.createNewReader = VERBOSE_LOGS;
                    return getOrCreatePerImageReader(createImageReader());
                }
                return this.imageReaderQueue.peekLast();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void lambda$dequeueImage$0() {
        if (!this.released) {
            this.this$0.f3498a.scheduleFrame();
        }
    }

    private void maybeWaitOnFence(Image image) {
        if (image == null || this.ignoringFence) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            waitOnFence(image);
        } else {
            this.ignoringFence = true;
        }
    }

    private void releaseInternal() {
        cleanup();
        this.released = true;
        this.this$0.b(this);
        this.this$0.g.remove(this);
    }

    @TargetApi(33)
    private void waitOnFence(Image image) {
        SyncFence fence;
        try {
            fence = image.getFence();
            fence.awaitForever();
        } catch (IOException unused) {
        }
    }

    @Override // io.flutter.view.TextureRegistry$ImageConsumer
    @TargetApi(29)
    public Image acquireLatestImage() {
        g dequeueImage = dequeueImage();
        if (dequeueImage == null) {
            return null;
        }
        Image image = dequeueImage.f3466a;
        maybeWaitOnFence(image);
        return image;
    }

    public double deltaMillis(long j3) {
        return j3 / 1000000.0d;
    }

    public g dequeueImage() {
        g gVar;
        boolean z3;
        g gVar2;
        synchronized (this.lock) {
            try {
                Iterator<i> it = this.imageReaderQueue.iterator();
                gVar = null;
                while (true) {
                    boolean hasNext = it.hasNext();
                    z3 = VERBOSE_LOGS;
                    if (!hasNext) {
                        break;
                    }
                    i next = it.next();
                    ArrayDeque arrayDeque = next.f3470b;
                    if (arrayDeque.isEmpty()) {
                        gVar2 = null;
                    } else {
                        gVar2 = (g) arrayDeque.removeFirst();
                    }
                    if (gVar2 == null) {
                        gVar = gVar2;
                    } else {
                        while (this.lastDequeuedImage.size() > 2) {
                            this.lastDequeuedImage.remove(0).f3466a.close();
                        }
                        this.lastDequeuedImage.add(gVar2);
                        this.lastReaderDequeuedFrom = next;
                        gVar = gVar2;
                    }
                }
                pruneImageReaderQueue();
                Iterator<i> it2 = this.imageReaderQueue.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().f3470b.isEmpty()) {
                        z3 = true;
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            this.this$0.f3502e.post(new f(this, 0));
        }
        return gVar;
    }

    public void disableFenceForTest() {
        this.ignoringFence = true;
    }

    public void finalize() {
        try {
            if (this.released) {
                return;
            }
            releaseInternal();
            n nVar = this.this$0;
            nVar.f3502e.post(new l(this.id, nVar.f3498a));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getForcedNewSurface() {
        this.createNewReader = true;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getHeight() {
        return this.requestedHeight;
    }

    public i getOrCreatePerImageReader(ImageReader imageReader) {
        i iVar = this.perImageReaders.get(imageReader);
        if (iVar == null) {
            i iVar2 = new i(this, imageReader);
            this.perImageReaders.put(imageReader, iVar2);
            this.imageReaderQueue.add(iVar2);
            return iVar2;
        }
        return iVar;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public Surface getSurface() {
        return getActiveReader().f3469a.getSurface();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public int getWidth() {
        return this.requestedWidth;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public boolean handlesCropAndRotation() {
        return VERBOSE_LOGS;
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public long id() {
        return this.id;
    }

    public int numImageReaders() {
        int size;
        synchronized (this.lock) {
            size = this.imageReaderQueue.size();
        }
        return size;
    }

    public int numImages() {
        int r22;
        synchronized (this.lock) {
            try {
                Iterator<i> it = this.imageReaderQueue.iterator();
                r22 = 0;
                while (it.hasNext()) {
                    r22 += it.next().f3470b.size();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r22;
    }

    public int numTrims() {
        int r12;
        synchronized (this.lock) {
            r12 = this.numTrims;
        }
        return r12;
    }

    public void onImage(ImageReader imageReader, Image image) {
        g gVar;
        synchronized (this.lock) {
            i orCreatePerImageReader = getOrCreatePerImageReader(imageReader);
            if (orCreatePerImageReader.f3471c) {
                gVar = null;
            } else {
                FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer = orCreatePerImageReader.f3472d;
                System.nanoTime();
                g gVar2 = new g(flutterRenderer$ImageReaderSurfaceProducer, image);
                ArrayDeque arrayDeque = orCreatePerImageReader.f3470b;
                arrayDeque.add(gVar2);
                while (arrayDeque.size() > 2) {
                    ((g) arrayDeque.removeFirst()).f3466a.close();
                }
                gVar = gVar2;
            }
        }
        if (gVar == null) {
            return;
        }
        this.this$0.f3498a.scheduleFrame();
    }

    @Override // io.flutter.view.u
    public void onTrimMemory(int r3) {
        if (r3 < 40) {
            return;
        }
        synchronized (this.lock) {
            this.numTrims++;
        }
        cleanup();
        this.createNewReader = true;
    }

    public int pendingDequeuedImages() {
        return this.lastDequeuedImage.size();
    }

    public void pruneImageReaderQueue() {
        i peekFirst;
        while (this.imageReaderQueue.size() > 1 && (peekFirst = this.imageReaderQueue.peekFirst()) != null) {
            ArrayDeque arrayDeque = peekFirst.f3470b;
            if (arrayDeque.isEmpty() && peekFirst.f3472d.lastReaderDequeuedFrom != peekFirst) {
                this.imageReaderQueue.removeFirst();
                HashMap<ImageReader, i> hashMap = this.perImageReaders;
                ImageReader imageReader = peekFirst.f3469a;
                hashMap.remove(imageReader);
                peekFirst.f3471c = true;
                imageReader.close();
                arrayDeque.clear();
            } else {
                return;
            }
        }
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void release() {
        if (this.released) {
            return;
        }
        releaseInternal();
        n nVar = this.this$0;
        nVar.f3498a.unregisterTexture(this.id);
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void scheduleFrame() {
        this.this$0.f3498a.scheduleFrame();
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setCallback(v vVar) {
    }

    @Override // io.flutter.view.TextureRegistry$SurfaceProducer
    public void setSize(int r3, int r4) {
        int max = Math.max(1, r3);
        int max2 = Math.max(1, r4);
        if (this.requestedWidth == max && this.requestedHeight == max2) {
            return;
        }
        this.createNewReader = true;
        this.requestedHeight = max2;
        this.requestedWidth = max;
    }
}
