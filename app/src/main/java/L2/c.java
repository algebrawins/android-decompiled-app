package l2;

import W1.k;
import Y1.f;
import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h1.C0287g;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import y2.AbstractC0938a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4109a;

    /* renamed from: b  reason: collision with root package name */
    public C0287g f4110b;

    /* renamed from: c  reason: collision with root package name */
    public long f4111c;

    /* renamed from: d  reason: collision with root package name */
    public k f4112d;

    /* renamed from: e  reason: collision with root package name */
    public FlutterJNI f4113e;

    /* renamed from: f  reason: collision with root package name */
    public ExecutorService f4114f;
    public Future g;

    public final void a(Context context, String[] strArr) {
        int r3;
        boolean z3;
        String str;
        if (this.f4109a) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f4110b != null) {
                try {
                    AbstractC0938a.b("FlutterLoader#ensureInitializationComplete");
                    b bVar = (b) this.g.get();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                    StringBuilder sb = new StringBuilder("--icu-native-lib-path=");
                    sb.append((String) this.f4112d.f1534e);
                    String str2 = File.separator;
                    sb.append(str2);
                    sb.append("libflutter.so");
                    arrayList.add(sb.toString());
                    if (strArr != null) {
                        Collections.addAll(arrayList, strArr);
                    }
                    arrayList.add("--aot-shared-library-name=".concat((String) this.f4112d.f1531b));
                    arrayList.add("--aot-shared-library-name=" + ((String) this.f4112d.f1534e) + str2 + ((String) this.f4112d.f1531b));
                    StringBuilder sb2 = new StringBuilder("--cache-dir-path=");
                    sb2.append(bVar.f4108b);
                    arrayList.add(sb2.toString());
                    arrayList.add("--domain-network-policy=".concat((String) this.f4112d.f1533d));
                    this.f4110b.getClass();
                    Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecognitionOptions.ITF).metaData;
                    if (bundle != null) {
                        r3 = bundle.getInt("io.flutter.embedding.android.OldGenHeapSize");
                    } else {
                        r3 = 0;
                    }
                    if (r3 == 0) {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        r3 = (int) ((memoryInfo.totalMem / 1000000.0d) / 2.0d);
                    }
                    arrayList.add("--old-gen-heap-size=" + r3);
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                    arrayList.add("--prefetched-default-font-manager");
                    if (bundle != null) {
                        if (bundle.containsKey("io.flutter.embedding.android.EnableImpeller")) {
                            if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller")) {
                                arrayList.add("--enable-impeller=true");
                            } else {
                                arrayList.add("--enable-impeller=false");
                            }
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                            arrayList.add("--enable-vulkan-validation");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                            arrayList.add("--enable-opengl-gpu-tracing");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                            arrayList.add("--enable-vulkan-gpu-tracing");
                        }
                        if (bundle.containsKey("io.flutter.embedding.android.DisableMergedPlatformUIThread") && bundle.getBoolean("io.flutter.embedding.android.DisableMergedPlatformUIThread")) {
                            arrayList.add("--no-enable-merged-platform-ui-thread");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.EnableSurfaceControl", false)) {
                            arrayList.add("--enable-surface-control");
                        }
                        String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                        if (string != null) {
                            arrayList.add("--impeller-backend=".concat(string));
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.ImpellerLazyShaderInitialization")) {
                            arrayList.add("--impeller-lazy-shader-mode");
                        }
                        if (bundle.getBoolean("io.flutter.embedding.android.ImpellerAntialiasLines")) {
                            arrayList.add("--impeller-antialias-lines");
                        }
                    }
                    if (bundle == null) {
                        z3 = true;
                    } else {
                        z3 = bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
                    }
                    if (z3) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    arrayList.add("--leak-vm=".concat(str));
                    this.f4113e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f4107a, bVar.f4108b, SystemClock.uptimeMillis() - this.f4111c, Build.VERSION.SDK_INT);
                    this.f4109a = true;
                    Trace.endSection();
                    return;
                } catch (Exception e4) {
                    Log.e("FlutterLoader", "Flutter initialization failed.", e4);
                    throw new RuntimeException(e4);
                }
            }
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [h1.g, java.lang.Object] */
    public final void b(Context context) {
        ?? obj = new Object();
        if (this.f4110b == null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                AbstractC0938a.b("FlutterLoader#startInitialization");
                try {
                    Context applicationContext = context.getApplicationContext();
                    this.f4110b = obj;
                    this.f4111c = SystemClock.uptimeMillis();
                    this.f4112d = AbstractC0348a.a(applicationContext);
                    z a4 = z.a((DisplayManager) applicationContext.getSystemService("display"), this.f4113e);
                    a4.f3778b.setAsyncWaitForVsyncDelegate(a4.f3780d);
                    this.g = this.f4114f.submit(new f(this, applicationContext));
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
    }
}
