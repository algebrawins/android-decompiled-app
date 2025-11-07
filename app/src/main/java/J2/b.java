package j2;

import android.content.res.AssetManager;
import android.os.Trace;
import android.util.Log;
import d2.C0235c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import y2.AbstractC0938a;

/* loaded from: classes.dex */
public final class b implements r2.f {

    /* renamed from: J  reason: collision with root package name */
    public final FlutterJNI f3859J;

    /* renamed from: K  reason: collision with root package name */
    public final AssetManager f3860K;

    /* renamed from: L  reason: collision with root package name */
    public final long f3861L;

    /* renamed from: M  reason: collision with root package name */
    public final j f3862M;

    /* renamed from: N  reason: collision with root package name */
    public final A.c f3863N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f3864O;

    public b(FlutterJNI flutterJNI, AssetManager assetManager, long j3) {
        this.f3864O = false;
        C0235c c0235c = new C0235c(5, this);
        this.f3859J = flutterJNI;
        this.f3860K = assetManager;
        this.f3861L = j3;
        j jVar = new j(flutterJNI);
        this.f3862M = jVar;
        jVar.d("flutter/isolate", c0235c, null);
        this.f3863N = new A.c(29, jVar);
        if (flutterJNI.isAttached()) {
            this.f3864O = true;
        }
    }

    public final void a(C0307a c0307a, List list) {
        if (this.f3864O) {
            Log.w("DartExecutor", "Attempted to run a DartExecutor that is already running.");
            return;
        }
        AbstractC0938a.b("DartExecutor#executeDartEntrypoint");
        try {
            Objects.toString(c0307a);
            this.f3859J.runBundleAndSnapshotFromLibrary(c0307a.f3856a, c0307a.f3858c, c0307a.f3857b, this.f3860K, list, this.f3861L);
            this.f3864O = true;
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // r2.f
    public final void d(String str, r2.d dVar, R1.a aVar) {
        this.f3863N.d(str, dVar, aVar);
    }

    @Override // r2.f
    public final void e(String str, r2.d dVar) {
        this.f3863N.e(str, dVar);
    }

    @Override // r2.f
    public final void h(String str, ByteBuffer byteBuffer) {
        this.f3863N.h(str, byteBuffer);
    }

    @Override // r2.f
    public final void i(String str, ByteBuffer byteBuffer, r2.e eVar) {
        this.f3863N.i(str, byteBuffer, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [r2.k, java.lang.Object] */
    @Override // r2.f
    public final R1.a j() {
        return ((j) this.f3863N.f5K).b(new Object());
    }
}
