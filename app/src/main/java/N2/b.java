package N2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class b implements S2.a, Serializable {

    /* renamed from: J  reason: collision with root package name */
    public transient S2.a f988J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f989K;

    /* renamed from: L  reason: collision with root package name */
    public final Class f990L;

    /* renamed from: M  reason: collision with root package name */
    public final String f991M;

    /* renamed from: N  reason: collision with root package name */
    public final String f992N;

    /* renamed from: O  reason: collision with root package name */
    public final boolean f993O;

    public b(Object obj, Class cls, String str, String str2, boolean z3) {
        this.f989K = obj;
        this.f990L = cls;
        this.f991M = str;
        this.f992N = str2;
        this.f993O = z3;
    }

    public abstract S2.a b();

    public final c c() {
        Class cls = this.f990L;
        if (this.f993O) {
            p.f1008a.getClass();
            return new i(cls);
        }
        return p.a(cls);
    }
}
