package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public final class q0 {
    public static p0 a(Object obj) {
        D d4 = (D) obj;
        p0 p0Var = d4.unknownFields;
        if (p0Var == p0.f2404f) {
            p0 p0Var2 = new p0(0, new int[8], new Object[8], true);
            d4.unknownFields = p0Var2;
            return p0Var2;
        }
        return p0Var;
    }

    public static void b(Object obj) {
        p0 p0Var = ((D) obj).unknownFields;
        if (p0Var.f2409e) {
            p0Var.f2409e = false;
        }
    }

    public static boolean c(int r8, C0115m c0115m, Object obj) {
        int r02 = c0115m.f2387b;
        int r12 = r02 >>> 3;
        int r03 = r02 & 7;
        AbstractC0113k abstractC0113k = c0115m.f2386a;
        if (r03 != 0) {
            if (r03 != 1) {
                if (r03 != 2) {
                    if (r03 != 3) {
                        if (r03 == 4) {
                            return false;
                        }
                        if (r03 == 5) {
                            c0115m.w(5);
                            ((p0) obj).c(5 | (r12 << 3), Integer.valueOf(abstractC0113k.j()));
                            return true;
                        }
                        throw I.b();
                    }
                    p0 p0Var = new p0(0, new int[8], new Object[8], true);
                    int r13 = r12 << 3;
                    int r5 = r13 | 4;
                    int r82 = r8 + 1;
                    if (r82 < 100) {
                        while (c0115m.a() != Integer.MAX_VALUE && c(r82, c0115m, p0Var)) {
                        }
                        if (r5 == c0115m.f2387b) {
                            if (p0Var.f2409e) {
                                p0Var.f2409e = false;
                            }
                            ((p0) obj).c(r13 | 3, p0Var);
                            return true;
                        }
                        throw new IOException("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                ((p0) obj).c((r12 << 3) | 2, c0115m.e());
                return true;
            }
            c0115m.w(1);
            ((p0) obj).c((r12 << 3) | 1, Long.valueOf(abstractC0113k.k()));
            return true;
        }
        c0115m.w(0);
        ((p0) obj).c(r12 << 3, Long.valueOf(abstractC0113k.n()));
        return true;
    }
}
