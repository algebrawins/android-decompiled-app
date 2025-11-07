package W1;

import x1.C0577b5;
import x1.H6;
import x1.M4;
import x1.N4;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements H6 {

    /* renamed from: a  reason: collision with root package name */
    public N4 f1499a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, V0.a] */
    /* JADX WARN: Type inference failed for: r1v3, types: [W1.b, java.lang.Object] */
    @Override // x1.H6
    public U1.h a() {
        M4 m4;
        ?? obj = new Object();
        if (c.c()) {
            m4 = M4.zzc;
        } else {
            m4 = M4.zzb;
        }
        obj.f1358L = m4;
        ?? obj2 = new Object();
        obj2.f1499a = this.f1499a;
        obj.f1360N = new C0577b5(obj2);
        return new U1.h(obj, 0);
    }
}
