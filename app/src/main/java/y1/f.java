package Y1;

import D.N;
import android.content.Context;
import android.os.Trace;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.engine.FlutterJNI;
import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import x1.AbstractC0681p5;
import y1.J4;
import y1.K4;
import y1.R4;
import y1.S4;
import y2.AbstractC0938a;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1672a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1673b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1674c;

    public /* synthetic */ f(W1.a aVar, X1.a aVar2) {
        this.f1673b = aVar;
        this.f1674c = aVar2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        K4 k4;
        String str;
        Object obj = this.f1674c;
        Object obj2 = this.f1673b;
        switch (this.f1672a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                X1.a aVar = (X1.a) obj;
                W1.a aVar2 = (W1.a) obj2;
                HashMap hashMap = K4.f6254O;
                S4.b();
                int r5 = R4.f6294a;
                S4.b();
                if (!Boolean.parseBoolean("")) {
                    k4 = J4.f6251P;
                } else {
                    HashMap hashMap2 = K4.f6254O;
                    if (hashMap2.get("detectorTaskWithResource#run") == null) {
                        hashMap2.put("detectorTaskWithResource#run", new K4("detectorTaskWithResource#run"));
                    }
                    k4 = (K4) hashMap2.get("detectorTaskWithResource#run");
                }
                k4.a();
                try {
                    List m3 = aVar2.f1667K.m(aVar);
                    k4.close();
                    return m3;
                } catch (Throwable th) {
                    try {
                        k4.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
            default:
                Context context = (Context) obj2;
                l2.c cVar = (l2.c) obj;
                AbstractC0938a.b("FlutterLoader initTask");
                try {
                    cVar.getClass();
                    FlutterJNI flutterJNI = cVar.f4113e;
                    try {
                        flutterJNI.loadLibrary(context);
                        flutterJNI.updateRefreshRate();
                        cVar.f4114f.execute(new N(16, this));
                        File filesDir = context.getFilesDir();
                        if (filesDir == null) {
                            filesDir = new File(AbstractC0681p5.a(context), "files");
                        }
                        String path = filesDir.getPath();
                        File codeCacheDir = context.getCodeCacheDir();
                        if (codeCacheDir == null) {
                            codeCacheDir = context.getCacheDir();
                        }
                        if (codeCacheDir == null) {
                            codeCacheDir = new File(AbstractC0681p5.a(context), "cache");
                        }
                        String path2 = codeCacheDir.getPath();
                        File dir = context.getDir("flutter", 0);
                        if (dir == null) {
                            dir = new File(AbstractC0681p5.a(context), "app_flutter");
                        }
                        dir.getPath();
                        l2.b bVar = new l2.b(path, path2);
                        Trace.endSection();
                        return bVar;
                    } catch (UnsatisfiedLinkError e4) {
                        if (!e4.toString().contains("couldn't find \"libflutter.so\"") && !e4.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                            throw e4;
                        }
                        String property = System.getProperty("os.arch");
                        File file = new File((String) cVar.f4112d.f1534e);
                        String[] list = file.list();
                        StringBuilder sb = new StringBuilder("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: ");
                        sb.append(property);
                        sb.append(", and the native libraries directory (with path ");
                        sb.append(file.getAbsolutePath());
                        sb.append(") ");
                        if (file.exists()) {
                            str = "contains the following files: " + Arrays.toString(list);
                        } else {
                            str = "does not exist.";
                        }
                        sb.append(str);
                        throw new UnsupportedOperationException(sb.toString(), e4);
                    }
                } catch (Throwable th3) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }

    public f(l2.c cVar, Context context) {
        this.f1674c = cVar;
        this.f1673b = context;
    }
}
