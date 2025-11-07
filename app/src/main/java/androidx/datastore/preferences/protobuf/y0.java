package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final w0 f2430a;

    static {
        w0 w0Var;
        if (v0.f2427e && v0.f2426d && !AbstractC0102c.a()) {
            w0Var = new w0(1);
        } else {
            w0Var = new w0(0);
        }
        f2430a = w0Var;
    }

    public static int a(String str) {
        int length = str.length();
        int r12 = 0;
        int r22 = 0;
        while (r22 < length && str.charAt(r22) < 128) {
            r22++;
        }
        int r3 = length;
        while (true) {
            if (r22 >= length) {
                break;
            }
            char charAt = str.charAt(r22);
            if (charAt < 2048) {
                r3 += (127 - charAt) >>> 31;
                r22++;
            } else {
                int length2 = str.length();
                while (r22 < length2) {
                    char charAt2 = str.charAt(r22);
                    if (charAt2 < 2048) {
                        r12 += (127 - charAt2) >>> 31;
                    } else {
                        r12 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, r22) >= 65536) {
                                r22++;
                            } else {
                                throw new x0(r22, length2);
                            }
                        }
                    }
                    r22++;
                }
                r3 += r12;
            }
        }
        if (r3 >= length) {
            return r3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r3 + 4294967296L));
    }
}
