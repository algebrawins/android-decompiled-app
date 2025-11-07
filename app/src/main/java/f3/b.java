package f3;

import D.C;
import e3.l;
import x1.AbstractC0640k4;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final e3.b f3203a;

    /* renamed from: b  reason: collision with root package name */
    public static final e3.b f3204b;

    /* renamed from: c  reason: collision with root package name */
    public static final e3.b f3205c;

    /* renamed from: d  reason: collision with root package name */
    public static final e3.b f3206d;

    /* renamed from: e  reason: collision with root package name */
    public static final e3.b f3207e;

    static {
        e3.b bVar = e3.b.f3099M;
        f3203a = AbstractC0640k4.a("/");
        f3204b = AbstractC0640k4.a("\\");
        f3205c = AbstractC0640k4.a("/\\");
        f3206d = AbstractC0640k4.a(".");
        f3207e = AbstractC0640k4.a("..");
    }

    public static final int a(l lVar) {
        if (lVar.f3124J.b() == 0) {
            return -1;
        }
        e3.b bVar = lVar.f3124J;
        if (bVar.g(0) != 47) {
            if (bVar.g(0) == 92) {
                if (bVar.b() > 2 && bVar.g(1) == 92) {
                    e3.b bVar2 = f3204b;
                    N2.g.e(bVar2, "other");
                    int d4 = bVar.d(bVar2.f3100J, 2);
                    if (d4 == -1) {
                        return bVar.b();
                    }
                    return d4;
                }
            } else if (bVar.b() <= 2 || bVar.g(1) != 58 || bVar.g(2) != 92) {
                return -1;
            } else {
                char g = (char) bVar.g(0);
                if (('a' > g || g >= '{') && ('A' > g || g >= '[')) {
                    return -1;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, e3.a] */
    public static final l b(l lVar, l lVar2, boolean z3) {
        N2.g.e(lVar, "<this>");
        N2.g.e(lVar2, "child");
        if (a(lVar2) != -1 || lVar2.g() != null) {
            return lVar2;
        }
        e3.b c4 = c(lVar);
        if (c4 == null && (c4 = c(lVar2)) == null) {
            c4 = f(l.f3123K);
        }
        ?? obj = new Object();
        obj.q(lVar.f3124J);
        if (obj.f3098K > 0) {
            obj.q(c4);
        }
        obj.q(lVar2.f3124J);
        return d(obj, z3);
    }

    public static final e3.b c(l lVar) {
        e3.b bVar = lVar.f3124J;
        e3.b bVar2 = f3203a;
        if (e3.b.e(bVar, bVar2) == -1) {
            e3.b bVar3 = f3204b;
            if (e3.b.e(lVar.f3124J, bVar3) == -1) {
                return null;
            }
            return bVar3;
        }
        return bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0101, code lost:
        if (N2.g.a(r4.get(C2.j.a(r4)), r9) != false) goto L55;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, e3.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final e3.l d(e3.a r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f3.b.d(e3.a, boolean):e3.l");
    }

    public static final e3.b e(byte b3) {
        if (b3 != 47) {
            if (b3 == 92) {
                return f3204b;
            }
            throw new IllegalArgumentException(C.w("not a directory separator: ", b3));
        }
        return f3203a;
    }

    public static final e3.b f(String str) {
        if (N2.g.a(str, "/")) {
            return f3203a;
        }
        if (N2.g.a(str, "\\")) {
            return f3204b;
        }
        throw new IllegalArgumentException(C.I("not a directory separator: ", str));
    }
}
