package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122u {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f2417c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final k0 f2418a = k0.f();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2419b;

    static {
        new C0122u(0);
    }

    public C0122u() {
    }

    public static void b(C0116n c0116n, D0 d02, int r4, Object obj) {
        if (d02 == D0.GROUP) {
            c0116n.R(r4, 3);
            ((AbstractC0098a) obj).b(c0116n);
            c0116n.R(r4, 4);
            return;
        }
        c0116n.R(r4, d02.b());
        switch (AbstractC0121t.f2416b[d02.ordinal()]) {
            case 1:
                c0116n.M(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 2:
                c0116n.K(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                c0116n.V(((Long) obj).longValue());
                return;
            case 4:
                c0116n.V(((Long) obj).longValue());
                return;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                c0116n.O(((Integer) obj).intValue());
                return;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                c0116n.M(((Long) obj).longValue());
                return;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                c0116n.K(((Integer) obj).intValue());
                return;
            case 8:
                c0116n.E(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 9:
                ((AbstractC0098a) obj).b(c0116n);
                return;
            case 10:
                AbstractC0098a abstractC0098a = (AbstractC0098a) obj;
                c0116n.getClass();
                c0116n.T(((D) abstractC0098a).a(null));
                abstractC0098a.b(c0116n);
                return;
            case 11:
                if (obj instanceof C0111h) {
                    c0116n.I((C0111h) obj);
                    return;
                } else {
                    c0116n.Q((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof C0111h) {
                    c0116n.I((C0111h) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c0116n.T(length);
                c0116n.F(bArr, 0, length);
                return;
            case 13:
                c0116n.T(((Integer) obj).intValue());
                return;
            case 14:
                c0116n.K(((Integer) obj).intValue());
                return;
            case 15:
                c0116n.M(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c0116n.T((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                c0116n.V((longValue >> 63) ^ (longValue << 1));
                return;
            case 18:
                c0116n.O(((Integer) obj).intValue());
                return;
            default:
                return;
        }
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f2419b) {
            return;
        }
        k0 k0Var = this.f2418a;
        int size = k0Var.f2377J.size();
        for (int r3 = 0; r3 < size; r3++) {
            Map.Entry c4 = k0Var.c(r3);
            if (c4.getValue() instanceof D) {
                D d4 = (D) c4.getValue();
                d4.getClass();
                C0109f0 c0109f0 = C0109f0.f2342c;
                c0109f0.getClass();
                c0109f0.a(d4.getClass()).h(d4);
                d4.j();
            }
        }
        if (!k0Var.f2379L) {
            if (k0Var.f2377J.size() <= 0) {
                Iterator it = k0Var.d().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                k0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!k0Var.f2379L) {
            if (k0Var.f2378K.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(k0Var.f2378K);
            }
            k0Var.f2378K = unmodifiableMap;
            if (k0Var.f2381N.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(k0Var.f2381N);
            }
            k0Var.f2381N = unmodifiableMap2;
            k0Var.f2379L = true;
        }
        this.f2419b = true;
    }

    public final Object clone() {
        C0122u c0122u = new C0122u();
        k0 k0Var = this.f2418a;
        if (k0Var.f2377J.size() <= 0) {
            Iterator it = k0Var.d().iterator();
            if (!it.hasNext()) {
                return c0122u;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (entry.getKey() == null) {
                entry.getValue();
                throw null;
            }
            throw new ClassCastException();
        }
        Map.Entry c4 = k0Var.c(0);
        if (c4.getKey() == null) {
            c4.getValue();
            throw null;
        }
        throw new ClassCastException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0122u)) {
            return false;
        }
        return this.f2418a.equals(((C0122u) obj).f2418a);
    }

    public final int hashCode() {
        return this.f2418a.hashCode();
    }

    public C0122u(int r12) {
        a();
        a();
    }
}
