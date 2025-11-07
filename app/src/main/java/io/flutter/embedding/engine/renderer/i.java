package io.flutter.embedding.engine.renderer;

import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ImageReader f3469a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque f3470b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public boolean f3471c = false;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ FlutterRenderer$ImageReaderSurfaceProducer f3472d;

    public i(FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer, ImageReader imageReader) {
        this.f3472d = flutterRenderer$ImageReaderSurfaceProducer;
        this.f3469a = imageReader;
        imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.h
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader2) {
                Image image;
                boolean z3;
                i iVar = i.this;
                iVar.getClass();
                try {
                    image = imageReader2.acquireLatestImage();
                } catch (IllegalStateException e4) {
                    Log.e("ImageReaderSurfaceProducer", "onImageAvailable acquireLatestImage failed: " + e4);
                    image = null;
                }
                if (image != null) {
                    FlutterRenderer$ImageReaderSurfaceProducer flutterRenderer$ImageReaderSurfaceProducer2 = iVar.f3472d;
                    z3 = flutterRenderer$ImageReaderSurfaceProducer2.released;
                    if (!z3 && !iVar.f3471c) {
                        flutterRenderer$ImageReaderSurfaceProducer2.onImage(imageReader2, image);
                    } else {
                        image.close();
                    }
                }
            }
        }, new Handler(Looper.getMainLooper()));
    }
}
