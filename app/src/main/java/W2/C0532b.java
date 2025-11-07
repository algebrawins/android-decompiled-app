package w2;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: w2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532b extends r2.r {

    /* renamed from: e  reason: collision with root package name */
    public static final C0532b f5362e = new C0532b(0);

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5363d;

    public /* synthetic */ C0532b(int r12) {
        this.f5363d = r12;
    }

    @Override // r2.r
    public Object f(byte b3, ByteBuffer byteBuffer) {
        List list;
        List list2;
        M[] values;
        switch (this.f5363d) {
            case 1:
                N2.g.e(byteBuffer, "buffer");
                if (b3 == -127) {
                    Long l3 = (Long) e(byteBuffer);
                    if (l3 == null) {
                        return null;
                    }
                    int longValue = (int) l3.longValue();
                    M.Companion.getClass();
                    for (M m3 : M.values()) {
                        if (m3.a() == longValue) {
                            return m3;
                        }
                    }
                    return null;
                } else if (b3 == -126) {
                    Object e4 = e(byteBuffer);
                    if (e4 instanceof List) {
                        list2 = (List) e4;
                    } else {
                        list2 = null;
                    }
                    if (list2 == null) {
                        return null;
                    }
                    Object obj = list2.get(1);
                    N2.g.c(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    return new C0537g((String) list2.get(0), ((Boolean) obj).booleanValue());
                } else if (b3 == -125) {
                    Object e5 = e(byteBuffer);
                    if (e5 instanceof List) {
                        list = (List) e5;
                    } else {
                        list = null;
                    }
                    if (list == null) {
                        return null;
                    }
                    Object obj2 = list.get(1);
                    N2.g.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.StringListLookupResultType");
                    return new O((String) list.get(0), (M) obj2);
                } else {
                    return super.f(b3, byteBuffer);
                }
            default:
                return super.f(b3, byteBuffer);
        }
    }

    @Override // r2.r
    public void k(r2.q qVar, Object obj) {
        switch (this.f5363d) {
            case 1:
                if (obj instanceof M) {
                    qVar.write(129);
                    k(qVar, Integer.valueOf(((M) obj).a()));
                    return;
                } else if (obj instanceof C0537g) {
                    qVar.write(130);
                    C0537g c0537g = (C0537g) obj;
                    k(qVar, C2.j.c(c0537g.f5371a, Boolean.valueOf(c0537g.f5372b)));
                    return;
                } else if (obj instanceof O) {
                    qVar.write(131);
                    O o3 = (O) obj;
                    k(qVar, C2.j.c(o3.f5358a, o3.f5359b));
                    return;
                } else {
                    super.k(qVar, obj);
                    return;
                }
            default:
                super.k(qVar, obj);
                return;
        }
    }
}
