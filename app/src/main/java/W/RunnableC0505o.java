package w;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.LinkedHashMap;

/* renamed from: w.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0505o implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5215J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0511v f5216K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ String f5217L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.c0 f5218M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ androidx.camera.core.impl.k0 f5219N;

    public /* synthetic */ RunnableC0505o(C0511v c0511v, String str, androidx.camera.core.impl.c0 c0Var, androidx.camera.core.impl.k0 k0Var, int r5) {
        this.f5215J = r5;
        this.f5216K = c0511v;
        this.f5217L = str;
        this.f5218M = c0Var;
        this.f5219N = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5215J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0511v c0511v = this.f5216K;
                String str = this.f5217L;
                androidx.camera.core.impl.c0 c0Var = this.f5218M;
                androidx.camera.core.impl.k0 k0Var = this.f5219N;
                c0511v.getClass();
                c0511v.q("Use case " + str + " RESET", null);
                c0511v.f5243J.y(str, c0Var, k0Var);
                c0511v.f();
                c0511v.B();
                c0511v.I();
                if (c0511v.f5246M == EnumC0508s.OPENED) {
                    c0511v.y();
                    return;
                }
                return;
            default:
                C0511v c0511v2 = this.f5216K;
                c0511v2.getClass();
                StringBuilder sb = new StringBuilder("Use case ");
                String str2 = this.f5217L;
                sb.append(str2);
                sb.append(" ACTIVE");
                c0511v2.q(sb.toString(), null);
                A.f fVar = c0511v2.f5243J;
                LinkedHashMap linkedHashMap = (LinkedHashMap) fVar.f11L;
                androidx.camera.core.impl.i0 i0Var = (androidx.camera.core.impl.i0) linkedHashMap.get(str2);
                androidx.camera.core.impl.c0 c0Var2 = this.f5218M;
                androidx.camera.core.impl.k0 k0Var2 = this.f5219N;
                if (i0Var == null) {
                    i0Var = new androidx.camera.core.impl.i0(c0Var2, k0Var2);
                    linkedHashMap.put(str2, i0Var);
                }
                i0Var.f2210d = true;
                fVar.y(str2, c0Var2, k0Var2);
                c0511v2.I();
                return;
        }
    }
}
