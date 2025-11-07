package C;

import G.l;
import S.i;
import androidx.camera.core.impl.S;
import v.C0479a;
import w.C0501k;
import w.RunnableC0496e;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public final C0501k f223c;

    /* renamed from: d  reason: collision with root package name */
    public final l f224d;
    public i g;

    /* renamed from: a  reason: collision with root package name */
    public boolean f221a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f222b = false;

    /* renamed from: e  reason: collision with root package name */
    public final Object f225e = new Object();

    /* renamed from: f  reason: collision with root package name */
    public g f226f = new g(4);

    /* renamed from: h  reason: collision with root package name */
    public final c f227h = new c(0, this);

    public e(C0501k c0501k, l lVar) {
        this.f223c = c0501k;
        this.f224d = lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [A.a, v.a] */
    public final C0479a a() {
        ?? aVar;
        synchronized (this.f225e) {
            try {
                i iVar = this.g;
                if (iVar != null) {
                    this.f226f.f232b.g(C0479a.f5041R, Integer.valueOf(iVar.hashCode()));
                }
                g gVar = this.f226f;
                gVar.getClass();
                aVar = new A.a(7, S.a(gVar.f232b));
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final void b(i iVar) {
        this.f222b = true;
        i iVar2 = this.g;
        if (iVar2 == null) {
            iVar2 = null;
        }
        this.g = iVar;
        if (this.f221a) {
            C0501k c0501k = this.f223c;
            c0501k.getClass();
            c0501k.f5178K.execute(new RunnableC0496e(c0501k, 0));
            this.f222b = false;
        }
        if (iVar2 != null) {
            iVar2.b(new Exception("Camera2CameraControl was updated with new options."));
        }
    }
}
