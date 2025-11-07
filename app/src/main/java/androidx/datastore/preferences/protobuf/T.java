package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final S f2310a;

    public T(D0 d02, D0 d03, q0.k kVar) {
        this.f2310a = new S(d02, d03, kVar);
    }

    public static int a(S s3, Object obj, Object obj2) {
        int B3;
        int a4;
        int z3;
        int a5;
        int z4;
        int r4 = 1;
        int r5 = C0122u.f2417c;
        int x3 = C0116n.x(1);
        D0 d02 = D0.GROUP;
        D0 d03 = s3.f2307a;
        if (d03 == d02) {
            x3 *= 2;
        }
        int[] r8 = AbstractC0121t.f2416b;
        switch (r8[d03.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                B3 = 8;
                break;
            case 2:
                ((Float) obj).getClass();
                B3 = 4;
                break;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                B3 = C0116n.B(((Long) obj).longValue());
                break;
            case 4:
                B3 = C0116n.B(((Long) obj).longValue());
                break;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                B3 = C0116n.B(((Integer) obj).intValue());
                break;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Long) obj).getClass();
                B3 = 8;
                break;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj).getClass();
                B3 = 4;
                break;
            case 8:
                ((Boolean) obj).getClass();
                B3 = 1;
                break;
            case 9:
                B3 = ((D) ((AbstractC0098a) obj)).a(null);
                break;
            case 10:
                a4 = ((D) ((AbstractC0098a) obj)).a(null);
                z3 = C0116n.z(a4);
                B3 = a4 + z3;
                break;
            case 11:
                if (obj instanceof C0111h) {
                    B3 = C0116n.i((C0111h) obj);
                    break;
                } else {
                    B3 = C0116n.w((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof C0111h) {
                    B3 = C0116n.i((C0111h) obj);
                    break;
                } else {
                    a4 = ((byte[]) obj).length;
                    z3 = C0116n.z(a4);
                    B3 = a4 + z3;
                    break;
                }
            case 13:
                B3 = C0116n.z(((Integer) obj).intValue());
                break;
            case 14:
                ((Integer) obj).getClass();
                B3 = 4;
                break;
            case 15:
                ((Long) obj).getClass();
                B3 = 8;
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                B3 = C0116n.z((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                B3 = C0116n.B((longValue << 1) ^ (longValue >> 63));
                break;
            case 18:
                B3 = C0116n.B(((Integer) obj).intValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        int r12 = B3 + x3;
        int x4 = C0116n.x(2);
        D0 d04 = s3.f2308b;
        if (d04 == d02) {
            x4 *= 2;
        }
        switch (r8[d04.ordinal()]) {
            case 1:
                ((Double) obj2).getClass();
                r4 = 8;
                break;
            case 2:
                ((Float) obj2).getClass();
                r4 = 4;
                break;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                r4 = C0116n.B(((Long) obj2).longValue());
                break;
            case 4:
                r4 = C0116n.B(((Long) obj2).longValue());
                break;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                r4 = C0116n.B(((Integer) obj2).intValue());
                break;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((Long) obj2).getClass();
                r4 = 8;
                break;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Integer) obj2).getClass();
                r4 = 4;
                break;
            case 8:
                ((Boolean) obj2).getClass();
                break;
            case 9:
                r4 = ((D) ((AbstractC0098a) obj2)).a(null);
                break;
            case 10:
                a5 = ((D) ((AbstractC0098a) obj2)).a(null);
                z4 = C0116n.z(a5);
                r4 = z4 + a5;
                break;
            case 11:
                if (obj2 instanceof C0111h) {
                    r4 = C0116n.i((C0111h) obj2);
                    break;
                } else {
                    r4 = C0116n.w((String) obj2);
                    break;
                }
            case 12:
                if (obj2 instanceof C0111h) {
                    r4 = C0116n.i((C0111h) obj2);
                    break;
                } else {
                    a5 = ((byte[]) obj2).length;
                    z4 = C0116n.z(a5);
                    r4 = z4 + a5;
                    break;
                }
            case 13:
                r4 = C0116n.z(((Integer) obj2).intValue());
                break;
            case 14:
                ((Integer) obj2).getClass();
                r4 = 4;
                break;
            case 15:
                ((Long) obj2).getClass();
                r4 = 8;
                break;
            case 16:
                int intValue2 = ((Integer) obj2).intValue();
                r4 = C0116n.z((intValue2 >> 31) ^ (intValue2 << 1));
                break;
            case 17:
                long longValue2 = ((Long) obj2).longValue();
                r4 = C0116n.B((longValue2 >> 63) ^ (longValue2 << 1));
                break;
            case 18:
                r4 = C0116n.B(((Integer) obj2).intValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return r4 + x4 + r12;
    }
}
