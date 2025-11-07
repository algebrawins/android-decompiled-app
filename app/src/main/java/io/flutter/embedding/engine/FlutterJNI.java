package io.flutter.embedding.engine;

import A0.C0001b;
import D.C;
import D.N;
import Q0.d;
import R0.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.util.SparseArray;
import android.view.AttachedSurfaceControl;
import android.view.Choreographer;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h1.C0287g;
import h2.C0299l;
import h2.EnumC0298k;
import h2.r;
import h2.t;
import i2.b;
import i2.k;
import i2.l;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.n;
import io.flutter.embedding.engine.renderer.o;
import io.flutter.plugin.platform.i;
import io.flutter.plugin.platform.j;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry$ImageConsumer;
import io.flutter.view.h;
import io.flutter.view.q;
import io.flutter.view.y;
import io.flutter.view.z;
import j2.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import k2.InterfaceC0344a;
import r2.e;
import s2.C0454a;

@Keep
/* loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static l asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private k accessibilityDelegate;
    private InterfaceC0344a deferredComponentManager;
    private C0454a localizationPlugin;
    private Long nativeShellHolderId;
    private j2.k platformMessageHandler;
    private j platformViewsController;
    private i platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<o> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    private static void asyncWaitForVsync(long j3) {
        l lVar = asyncWaitForVsyncDelegate;
        if (lVar != null) {
            io.flutter.view.b bVar = (io.flutter.view.b) lVar;
            bVar.getClass();
            Choreographer choreographer = Choreographer.getInstance();
            z zVar = (z) bVar.f3670a;
            y yVar = zVar.f3779c;
            if (yVar != null) {
                yVar.f3773a = j3;
                zVar.f3779c = null;
            } else {
                yVar = new y(zVar, j3);
            }
            choreographer.postFrameCallback(yVar);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [i2.j] */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j3) {
        ImageDecoder.Source createSource;
        Bitmap decodeBitmap;
        if (Build.VERSION.SDK_INT >= 28) {
            createSource = ImageDecoder.createSource(byteBuffer);
            try {
                decodeBitmap = ImageDecoder.decodeBitmap(createSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: i2.j
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.lambda$decodeImage$0(j3, imageDecoder, imageInfo, source);
                    }
                });
                return decodeBitmap;
            } catch (IOException e4) {
                Log.e(TAG, "Failed to decode image", e4);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    @Deprecated
    public static String getObservatoryUri() {
        return vmServiceUri;
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int r22, ByteBuffer byteBuffer) {
        e eVar;
        j2.k kVar = this.platformMessageHandler;
        if (kVar != null && (eVar = (e) ((j2.j) kVar).f3889O.remove(Integer.valueOf(r22))) != null) {
            try {
                eVar.a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Error e4) {
                Thread currentThread = Thread.currentThread();
                if (currentThread.getUncaughtExceptionHandler() != null) {
                    currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e4);
                    return;
                }
                throw e4;
            } catch (Exception e5) {
                Log.e("DartMessenger", "Uncaught exception in binary message reply handler", e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$0(long j3, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        ColorSpace.Named named;
        ColorSpace colorSpace;
        Size size;
        named = ColorSpace.Named.SRGB;
        colorSpace = ColorSpace.get(named);
        imageDecoder.setTargetColorSpace(colorSpace);
        imageDecoder.setAllocator(1);
        size = imageInfo.getSize();
        nativeImageHeaderCallback(j3, size.getWidth(), size.getHeight());
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j3);

    private native void nativeDeferredComponentInstallFailure(int r12, String str, boolean z3);

    private native void nativeDestroy(long j3);

    private native void nativeDispatchEmptyPlatformMessage(long j3, String str, int r4);

    private native void nativeDispatchPlatformMessage(long j3, String str, ByteBuffer byteBuffer, int r5, int r6);

    private native void nativeDispatchPointerDataPacket(long j3, ByteBuffer byteBuffer, int r4);

    private native void nativeDispatchSemanticsAction(long j3, int r3, int r4, ByteBuffer byteBuffer, int r6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int r12);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int r12);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int r12);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int r12);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int r12);

    private native Bitmap nativeGetBitmap(long j3);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j3, int r22, int r3);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j3, int r7);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j3, int r3);

    private native void nativeInvokePlatformMessageResponseCallback(long j3, int r3, ByteBuffer byteBuffer, int r5);

    private native boolean nativeIsSurfaceControlEnabled(long j3);

    private native void nativeLoadDartDeferredLibrary(long j3, int r3, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j3);

    private native void nativeMarkTextureFrameAvailable(long j3, long j4);

    private native void nativeNotifyLowMemoryWarning(long j3);

    private native void nativeOnVsync(long j3, long j4, long j5);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j3, long j4, WeakReference<TextureRegistry$ImageConsumer> weakReference, boolean z3);

    private native void nativeRegisterTexture(long j3, long j4, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j3, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4);

    private native void nativeScheduleFrame(long j3);

    private native void nativeSetAccessibilityFeatures(long j3, int r3);

    private native void nativeSetSemanticsEnabled(long j3, boolean z3);

    private native void nativeSetViewportMetrics(long j3, float f2, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int[] r19, int[] r20, int[] r21);

    private native FlutterJNI nativeSpawn(long j3, String str, String str2, String str3, List<String> list, long j4);

    private native void nativeSurfaceChanged(long j3, int r3, int r4);

    private native void nativeSurfaceCreated(long j3, Surface surface);

    private native void nativeSurfaceDestroyed(long j3);

    private native void nativeSurfaceWindowChanged(long j3, Surface surface);

    private native void nativeUnregisterTexture(long j3, long j4);

    private native void nativeUpdateDisplayMetrics(long j3);

    private native void nativeUpdateJavaAssetManager(long j3, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f2);

    private void onPreEngineRestart() {
        for (b bVar : this.engineLifecycleListeners) {
            bVar.a();
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        String str;
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            io.flutter.view.b bVar = (io.flutter.view.b) kVar;
            bVar.getClass();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            q qVar = (q) bVar.f3670a;
            qVar.getClass();
            while (byteBuffer.hasRemaining()) {
                io.flutter.view.i a4 = qVar.a(byteBuffer.getInt());
                a4.f3678c = byteBuffer.getInt();
                int r22 = byteBuffer.getInt();
                String str2 = null;
                if (r22 == -1) {
                    str = null;
                } else {
                    str = strArr[r22];
                }
                a4.f3679d = str;
                int r23 = byteBuffer.getInt();
                if (r23 != -1) {
                    str2 = strArr[r23];
                }
                a4.f3680e = str2;
            }
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        k kVar = this.accessibilityDelegate;
        if (kVar != null) {
            ((io.flutter.view.b) kVar).a(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(o oVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(oVar);
    }

    @SuppressLint({"NewApi"})
    public void applyTransactions() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            SurfaceControl.Transaction g = d.g();
            int r22 = 0;
            while (true) {
                ArrayList arrayList = iVar.f3572i;
                if (r22 < arrayList.size()) {
                    g = g.merge(d.i(arrayList.get(r22)));
                    r22++;
                } else {
                    g.apply();
                    arrayList.clear();
                    return;
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j3) {
        nativeCleanupMessageData(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0139, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
        if (r4.hasNext() == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0143, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0155, code lost:
        if (r3.getLanguage().equals(r5.toLanguageTag()) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0158, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
        if (r4.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0162, code lost:
        r5 = (java.util.Locale) r4.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0174, code lost:
        if (r3.getLanguage().equals(r5.getLanguage()) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0177, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a3, code lost:
        r10 = r3;
     */
    /* JADX WARN: Incorrect condition in loop: B:41:0x011a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.computePlatformResolvedLocale(java.lang.String[]):java.lang.String[]");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h2.l, java.lang.Object, io.flutter.plugin.platform.b] */
    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            jVar.getClass();
            ?? c0299l = new C0299l(jVar.f3579c.getContext(), jVar.f3579c.getWidth(), jVar.f3579c.getHeight(), EnumC0298k.overlay);
            c0299l.f3559P = jVar.g;
            int r22 = jVar.f3589n;
            jVar.f3589n = r22 + 1;
            jVar.f3587l.put(r22, c0299l);
            return new FlutterOverlaySurface(r22, c0299l.getSurface());
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public FlutterOverlaySurface createOverlaySurface2() {
        SurfaceControl build;
        AttachedSurfaceControl rootSurfaceControl;
        SurfaceControl.Transaction buildReparentTransaction;
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            if (iVar.f3574k == null) {
                SurfaceControl.Builder f2 = d.f();
                f2.setBufferSize(iVar.f3567c.getWidth(), iVar.f3567c.getHeight());
                f2.setFormat(1);
                f2.setName("Flutter Overlay Surface");
                f2.setOpaque(false);
                f2.setHidden(false);
                build = f2.build();
                rootSurfaceControl = iVar.f3567c.getRootSurfaceControl();
                buildReparentTransaction = rootSurfaceControl.buildReparentTransaction(build);
                buildReparentTransaction.setLayer(build, 1000);
                buildReparentTransaction.apply();
                iVar.f3574k = d.e(build);
                iVar.f3575l = build;
            }
            return new FlutterOverlaySurface(0, iVar.f3574k);
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    @SuppressLint({"NewApi"})
    public SurfaceControl.Transaction createTransaction() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            SurfaceControl.Transaction g = d.g();
            iVar.f3572i.add(g);
            return g;
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int r12, String str, boolean z3) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(r12, str, z3);
    }

    @SuppressLint({"NewApi"})
    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            Surface surface = iVar.f3574k;
            if (surface != null) {
                surface.release();
                iVar.f3574k = null;
                iVar.f3575l = null;
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            jVar.e();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int r4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, r4);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + r4);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int r11, int r12) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, r11, r12);
            return;
        }
        Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + r12);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int r4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, r4);
    }

    public void dispatchSemanticsAction(int r22, h hVar) {
        dispatchSemanticsAction(r22, hVar, null);
    }

    @SuppressLint({"NewApi"})
    public void endFrame2() {
        AttachedSurfaceControl rootSurfaceControl;
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            SurfaceControl.Transaction g = d.g();
            int r22 = 0;
            while (true) {
                ArrayList arrayList = iVar.f3573j;
                if (r22 < arrayList.size()) {
                    g = g.merge(d.i(arrayList.get(r22)));
                    r22++;
                } else {
                    arrayList.clear();
                    iVar.f3567c.invalidate();
                    rootSurfaceControl = iVar.f3567c.getRootSurfaceControl();
                    rootSurfaceControl.applyTransactionOnDraw(g);
                    return;
                }
            }
        } else {
            throw new RuntimeException("");
        }
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public float getScaledFontSize(float r7, int r8) {
        /*
            r6 = this;
            A0.b r0 = q2.r.f4834b
            java.lang.Object r1 = r0.f84K
            q2.p r1 = (q2.p) r1
            java.lang.Object r2 = r0.f85L
            java.util.concurrent.ConcurrentLinkedQueue r2 = (java.util.concurrent.ConcurrentLinkedQueue) r2
            if (r1 != 0) goto L14
            java.lang.Object r1 = r2.poll()
            q2.p r1 = (q2.p) r1
            r0.f84K = r1
        L14:
            java.lang.Object r1 = r0.f84K
            q2.p r1 = (q2.p) r1
            if (r1 == 0) goto L27
            int r3 = r1.f4832a
            if (r3 >= r8) goto L27
            java.lang.Object r1 = r2.poll()
            q2.p r1 = (q2.p) r1
            r0.f84K = r1
            goto L14
        L27:
            r2 = 0
            java.lang.String r3 = "Cannot find config with generation: "
            java.lang.String r4 = "SettingsChannel"
            if (r1 != 0) goto L48
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r0.append(r1)
            java.lang.String r1 = ", after exhausting the queue."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.e(r4, r0)
        L46:
            r1 = r2
            goto L72
        L48:
            int r5 = r1.f4832a
            if (r5 == r8) goto L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r1.append(r3)
            java.lang.String r3 = ", the oldest config is now: "
            r1.append(r3)
            java.lang.Object r0 = r0.f84K
            q2.p r0 = (q2.p) r0
            int r0 = r0.f4832a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r4, r0)
            goto L46
        L72:
            if (r1 != 0) goto L75
            goto L77
        L75:
            android.util.DisplayMetrics r2 = r1.f4833b
        L77:
            if (r2 != 0) goto L98
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "getScaledFontSize called with configurationId "
            r7.<init>(r0)
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r7.append(r8)
            java.lang.String r8 = ", which can't be found."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FlutterJNI"
            android.util.Log.e(r8, r7)
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            return r7
        L98:
            r8 = 2
            float r7 = android.util.TypedValue.applyDimension(r8, r7, r2)
            float r8 = r2.density
            float r7 = r7 / r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.FlutterJNI.getScaledFontSize(float, int):float");
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int r11, long j3) {
        f fVar;
        boolean z3;
        j2.k kVar = this.platformMessageHandler;
        if (kVar != null) {
            j2.j jVar = (j2.j) kVar;
            synchronized (jVar.f3887M) {
                try {
                    fVar = (f) jVar.f3885K.get(str);
                    if (jVar.f3888N.get() && fVar == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (!jVar.f3886L.containsKey(str)) {
                            jVar.f3886L.put(str, new LinkedList());
                        }
                        ((List) jVar.f3886L.get(str)).add(new j2.d(j3, byteBuffer, r11));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z3) {
                jVar.a(str, fVar, byteBuffer, r11, j3);
                return;
            }
            return;
        }
        nativeCleanupMessageData(j3);
    }

    @SuppressLint({"NewApi"})
    public void hideOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            if (iVar.f3575l != null) {
                SurfaceControl.Transaction g = d.g();
                g.setVisibility(iVar.f3575l, false);
                g.apply();
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j3, int r10) {
        if (initCalled) {
            Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j3, r10);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int r4) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), r4);
            } else {
                Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + r4);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int r8, ByteBuffer byteBuffer, int r10) {
        if (byteBuffer.isDirect()) {
            this.shellHolderLock.readLock().lock();
            try {
                if (isAttached()) {
                    nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), r8, byteBuffer, r10);
                } else {
                    Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + r8);
                }
                this.shellHolderLock.readLock().unlock();
                return;
            } catch (Throwable th) {
                this.shellHolderLock.readLock().unlock();
                throw th;
            }
        }
        throw new IllegalArgumentException("Expected a direct ByteBuffer.");
    }

    public boolean isAttached() {
        if (this.nativeShellHolderId != null) {
            return true;
        }
        return false;
    }

    public boolean isCodePointEmoji(int r12) {
        return nativeFlutterTextUtilsIsEmoji(r12);
    }

    public boolean isCodePointEmojiModifier(int r12) {
        return nativeFlutterTextUtilsIsEmojiModifier(r12);
    }

    public boolean isCodePointEmojiModifierBase(int r12) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(r12);
    }

    public boolean isCodePointRegionalIndicator(int r12) {
        return nativeFlutterTextUtilsIsRegionalIndicator(r12);
    }

    public boolean isCodePointVariantSelector(int r12) {
        return nativeFlutterTextUtilsIsVariationSelector(r12);
    }

    public void loadDartDeferredLibrary(int r3, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), r3, strArr);
    }

    public void loadLibrary(Context context) {
        A.f fVar;
        A.f l3;
        String[] strArr;
        ZipFile zipFile;
        InputStream inputStream;
        InputStream inputStream2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        char c4 = 0;
        if (loadLibraryCalled) {
            Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        C0001b c0001b = new C0001b(7);
        if (context != null) {
            C0001b.O("Beginning load of %s...", "flutter");
            C0287g c0287g = (C0287g) c0001b.f84K;
            HashSet hashSet = (HashSet) c0001b.f85L;
            if (hashSet.contains("flutter")) {
                C0001b.O("%s already loaded previously!", "flutter");
            } else {
                try {
                    c0287g.getClass();
                    System.loadLibrary("flutter");
                    hashSet.add("flutter");
                    C0001b.O("%s (%s) was loaded normally!", "flutter", null);
                } catch (UnsatisfiedLinkError e4) {
                    C0001b.O("Loading the library normally failed: %s", Log.getStackTraceString(e4));
                    C0001b.O("%s (%s) was not loaded normally, re-linking...", "flutter", null);
                    File J3 = c0001b.J(context);
                    if (!J3.exists()) {
                        File dir = context.getDir("lib", 0);
                        File J4 = c0001b.J(context);
                        c0287g.getClass();
                        File[] listFiles = dir.listFiles(new a(System.mapLibraryName("flutter")));
                        if (listFiles != null) {
                            for (File file : listFiles) {
                                if (!file.getAbsolutePath().equals(J4.getAbsolutePath())) {
                                    file.delete();
                                }
                            }
                        }
                        String[] strArr2 = Build.SUPPORTED_ABIS;
                        if (strArr2.length <= 0) {
                            String str = Build.CPU_ABI2;
                            if (str != null && str.length() != 0) {
                                strArr2 = new String[]{Build.CPU_ABI, str};
                            } else {
                                strArr2 = new String[]{Build.CPU_ABI};
                            }
                        }
                        String mapLibraryName = System.mapLibraryName("flutter");
                        ((R1.a) c0001b.f86M).getClass();
                        try {
                            l3 = R1.a.l(context, strArr2, mapLibraryName, c0001b);
                        } catch (Throwable th) {
                            th = th;
                            fVar = null;
                        }
                        try {
                            if (l3 != null) {
                                int r12 = 0;
                                while (true) {
                                    int r9 = r12 + 1;
                                    zipFile = (ZipFile) l3.f10K;
                                    if (r12 < 5) {
                                        Object[] objArr = new Object[1];
                                        objArr[c4] = mapLibraryName;
                                        C0001b.O("Found %s! Extracting...", objArr);
                                        try {
                                            if (J3.exists() || J3.createNewFile()) {
                                                try {
                                                    inputStream2 = zipFile.getInputStream((ZipEntry) l3.f11L);
                                                } catch (FileNotFoundException unused) {
                                                    inputStream2 = null;
                                                } catch (IOException unused2) {
                                                    inputStream2 = null;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    inputStream = null;
                                                }
                                                try {
                                                    fileOutputStream2 = new FileOutputStream(J3);
                                                } catch (FileNotFoundException unused3) {
                                                    fileOutputStream2 = null;
                                                    R1.a.k(inputStream2);
                                                    R1.a.k(fileOutputStream2);
                                                    r12 = r9;
                                                    c4 = 0;
                                                } catch (IOException unused4) {
                                                    fileOutputStream2 = null;
                                                    R1.a.k(inputStream2);
                                                    R1.a.k(fileOutputStream2);
                                                    r12 = r9;
                                                    c4 = 0;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = null;
                                                    R1.a.k(inputStream);
                                                    R1.a.k(fileOutputStream);
                                                    throw th;
                                                }
                                                try {
                                                    byte[] bArr = new byte[RecognitionOptions.AZTEC];
                                                    long j3 = 0;
                                                    while (true) {
                                                        int read = inputStream2.read(bArr);
                                                        if (read == -1) {
                                                            break;
                                                        }
                                                        fileOutputStream2.write(bArr, 0, read);
                                                        j3 += read;
                                                    }
                                                    fileOutputStream2.flush();
                                                    fileOutputStream2.getFD().sync();
                                                    if (j3 != J3.length()) {
                                                        R1.a.k(inputStream2);
                                                        R1.a.k(fileOutputStream2);
                                                    } else {
                                                        R1.a.k(inputStream2);
                                                        R1.a.k(fileOutputStream2);
                                                        J3.setReadable(true, false);
                                                        J3.setExecutable(true, false);
                                                        J3.setWritable(true);
                                                        break;
                                                    }
                                                } catch (FileNotFoundException unused5) {
                                                    R1.a.k(inputStream2);
                                                    R1.a.k(fileOutputStream2);
                                                    r12 = r9;
                                                    c4 = 0;
                                                } catch (IOException unused6) {
                                                    R1.a.k(inputStream2);
                                                    R1.a.k(fileOutputStream2);
                                                    r12 = r9;
                                                    c4 = 0;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    inputStream = inputStream2;
                                                    fileOutputStream = fileOutputStream2;
                                                    R1.a.k(inputStream);
                                                    R1.a.k(fileOutputStream);
                                                    throw th;
                                                }
                                            }
                                        } catch (IOException unused7) {
                                        }
                                        r12 = r9;
                                        c4 = 0;
                                    }
                                }
                                try {
                                    zipFile.close();
                                } catch (IOException unused8) {
                                    String absolutePath = J3.getAbsolutePath();
                                    c0287g.getClass();
                                    System.load(absolutePath);
                                    hashSet.add("flutter");
                                    C0001b.O("%s (%s) was re-linked!", "flutter", null);
                                    loadLibraryCalled = true;
                                    return;
                                }
                            } else {
                                try {
                                    strArr = R1.a.m(context, mapLibraryName);
                                } catch (Exception e5) {
                                    strArr = new String[]{e5.toString()};
                                }
                                StringBuilder sb = new StringBuilder("Could not find '");
                                sb.append(mapLibraryName);
                                sb.append("'. Looked for: ");
                                sb.append(Arrays.toString(strArr2));
                                sb.append(", but only found: ");
                                throw new RuntimeException(C.z(sb, Arrays.toString(strArr), "."));
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fVar = l3;
                            if (fVar != null) {
                                try {
                                    ((ZipFile) fVar.f10K).close();
                                } catch (IOException unused9) {
                                }
                            }
                            throw th;
                        }
                    }
                    String absolutePath2 = J3.getAbsolutePath();
                    c0287g.getClass();
                    System.load(absolutePath2);
                    hashSet.add("flutter");
                    C0001b.O("%s (%s) was re-linked!", "flutter", null);
                }
            }
            loadLibraryCalled = true;
            return;
        }
        throw new IllegalArgumentException("Given context is null");
    }

    public void markTextureFrameAvailable(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j3);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            jVar.f3592q.clear();
            jVar.f3593r.clear();
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
    }

    public void onDisplayOverlaySurface(int r4, int r5, int r6, int r7, int r8) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            SparseArray sparseArray = jVar.f3587l;
            if (sparseArray.get(r4) != null) {
                jVar.g();
                View view = (io.flutter.plugin.platform.b) sparseArray.get(r4);
                if (view.getParent() == null) {
                    jVar.f3579c.addView(view);
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(r7, r8);
                layoutParams.leftMargin = r5;
                layoutParams.topMargin = r6;
                view.setLayoutParams(layoutParams);
                view.setVisibility(0);
                view.bringToFront();
                jVar.f3592q.add(Integer.valueOf(r4));
                return;
            }
            throw new IllegalStateException(C.v(r4, "The overlay surface (id:", ") doesn't exist"));
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public void onDisplayPlatformView(int r12, int r22, int r3, int r4, int r5, int r6, int r7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            jVar.g();
            if (jVar.f3585j.get(r12) == null) {
                return;
            }
            throw new ClassCastException();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    @SuppressLint({"NewApi"})
    public void onDisplayPlatformView2(int r12, int r22, int r3, int r4, int r5, int r6, int r7, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            if (iVar.g.get(r12) == null) {
                return;
            }
            throw new ClassCastException();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [io.flutter.embedding.engine.renderer.p, android.view.View] */
    public void onEndFrame() {
        boolean z3;
        ?? r3;
        ensureRunningOnMainThread();
        j jVar = this.platformViewsController;
        if (jVar != null) {
            boolean z4 = false;
            if (jVar.f3590o && jVar.f3593r.isEmpty()) {
                jVar.f3590o = false;
                t tVar = jVar.f3579c;
                N n3 = new N(15, jVar);
                C0299l c0299l = tVar.f3357L;
                if (c0299l != null && (r3 = tVar.f3359N) != 0) {
                    tVar.f3358M = r3;
                    tVar.f3359N = null;
                    n nVar = tVar.f3362Q.f3421b;
                    if (nVar == null) {
                        c0299l.c();
                        C0299l c0299l2 = tVar.f3357L;
                        if (c0299l2 != null) {
                            c0299l2.f3334J.close();
                            tVar.removeView(tVar.f3357L);
                            tVar.f3357L = null;
                        }
                        n3.run();
                        return;
                    }
                    r3.d();
                    r rVar = new r(tVar, nVar, n3);
                    nVar.f3498a.addIsDisplayingFlutterUiListener(rVar);
                    if (nVar.f3501d) {
                        rVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (jVar.f3590o) {
                C0299l c0299l3 = jVar.f3579c.f3357L;
                if (c0299l3 != null) {
                    z3 = c0299l3.e();
                } else {
                    z3 = false;
                }
                if (z3) {
                    z4 = true;
                }
            }
            jVar.f(z4);
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        for (o oVar : this.flutterUiDisplayListeners) {
            oVar.b();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        for (o oVar : this.flutterUiDisplayListeners) {
            oVar.a();
        }
    }

    public void onSurfaceChanged(int r3, int r4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), r3, r4);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j3, long j4, long j5) {
        nativeOnVsync(j3, j4, j5);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j3, TextureRegistry$ImageConsumer textureRegistry$ImageConsumer, boolean z3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(textureRegistry$ImageConsumer), z3);
    }

    public void registerTexture(long j3, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j3, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(o oVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(oVar);
    }

    public void requestDartDeferredLibrary(int r22) {
        Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j3);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(k kVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = kVar;
    }

    public void setAccessibilityFeatures(int r22) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(r22);
        }
    }

    public void setAccessibilityFeaturesInNative(int r3) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), r3);
    }

    public void setAsyncWaitForVsyncDelegate(l lVar) {
        asyncWaitForVsyncDelegate = lVar;
    }

    public void setDeferredComponentManager(InterfaceC0344a interfaceC0344a) {
        ensureRunningOnMainThread();
        if (interfaceC0344a != null) {
            interfaceC0344a.a();
        }
    }

    public void setLocalizationPlugin(C0454a c0454a) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c0454a;
    }

    public void setPlatformMessageHandler(j2.k kVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = kVar;
    }

    public void setPlatformViewsController(j jVar) {
        ensureRunningOnMainThread();
        this.platformViewsController = jVar;
    }

    public void setPlatformViewsController2(i iVar) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = iVar;
    }

    public void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z3);
        }
    }

    public void setSemanticsEnabledInNative(boolean z3) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z3);
    }

    public void setViewportMetrics(float f2, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int[] r41, int[] r42, int[] r43) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f2, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43);
    }

    @SuppressLint({"NewApi"})
    public void showOverlaySurface2() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            if (iVar.f3575l != null) {
                SurfaceControl.Transaction g = d.g();
                g.setVisibility(iVar.f3575l, true);
                g.apply();
                return;
            }
            return;
        }
        throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j3) {
        boolean z3;
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j3);
        Long l3 = nativeSpawn.nativeShellHolderId;
        if (l3 != null && l3.longValue() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return nativeSpawn;
        }
        throw new IllegalStateException("Failed to spawn new JNI connected shell from existing shell.");
    }

    @SuppressLint({"NewApi"})
    public void swapTransactions() {
        i iVar = this.platformViewsController2;
        if (iVar != null) {
            synchronized (iVar) {
                try {
                    iVar.f3573j.clear();
                    for (int r12 = 0; r12 < iVar.f3572i.size(); r12++) {
                        iVar.f3573j.add(d.i(iVar.f3572i.get(r12)));
                    }
                    iVar.f3572i.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new RuntimeException("");
    }

    public void unregisterTexture(long j3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j3);
    }

    public void updateDisplayMetrics(int r12, float f2, float f4, float f5) {
        displayWidth = f2;
        displayHeight = f4;
        displayDensity = f5;
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (!loadLibraryCalled) {
            return;
        }
        nativeUpdateRefreshRate(refreshRateFPS);
    }

    public void dispatchSemanticsAction(int r22, h hVar, Object obj) {
        ByteBuffer byteBuffer;
        int r02;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = r2.r.f4893a.b(obj);
            r02 = byteBuffer.position();
        } else {
            byteBuffer = null;
            r02 = 0;
        }
        dispatchSemanticsAction(r22, hVar.value, byteBuffer, r02);
    }

    public void dispatchSemanticsAction(int r9, int r10, ByteBuffer byteBuffer, int r12) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), r9, r10, byteBuffer, r12);
    }
}
