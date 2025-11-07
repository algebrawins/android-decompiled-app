package e3;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l implements Comparable {

    /* renamed from: K  reason: collision with root package name */
    public static final String f3123K;

    /* renamed from: J  reason: collision with root package name */
    public final b f3124J;

    static {
        String str = File.separator;
        N2.g.d(str, "separator");
        f3123K = str;
    }

    public l(b bVar) {
        N2.g.e(bVar, "bytes");
        this.f3124J = bVar;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int a4 = f3.b.a(this);
        b bVar = this.f3124J;
        if (a4 == -1) {
            a4 = 0;
        } else if (a4 < bVar.b() && bVar.g(a4) == 92) {
            a4++;
        }
        int b3 = bVar.b();
        int r5 = a4;
        while (a4 < b3) {
            if (bVar.g(a4) == 47 || bVar.g(a4) == 92) {
                arrayList.add(bVar.l(r5, a4));
                r5 = a4 + 1;
            }
            a4++;
        }
        if (r5 < bVar.b()) {
            arrayList.add(bVar.l(r5, bVar.b()));
        }
        return arrayList;
    }

    public final String b() {
        b bVar = f3.b.f3203a;
        b bVar2 = f3.b.f3203a;
        b bVar3 = this.f3124J;
        int i3 = b.i(bVar3, bVar2);
        if (i3 == -1) {
            i3 = b.i(bVar3, f3.b.f3204b);
        }
        if (i3 != -1) {
            bVar3 = b.m(bVar3, i3 + 1, 0, 2);
        } else if (g() != null && bVar3.b() == 2) {
            bVar3 = b.f3099M;
        }
        return bVar3.n();
    }

    public final l c() {
        b bVar = f3.b.f3206d;
        b bVar2 = this.f3124J;
        if (N2.g.a(bVar2, bVar)) {
            return null;
        }
        b bVar3 = f3.b.f3203a;
        if (N2.g.a(bVar2, bVar3)) {
            return null;
        }
        b bVar4 = f3.b.f3204b;
        if (N2.g.a(bVar2, bVar4)) {
            return null;
        }
        b bVar5 = f3.b.f3207e;
        bVar2.getClass();
        N2.g.e(bVar5, "suffix");
        int b3 = bVar2.b();
        byte[] bArr = bVar5.f3100J;
        if (bVar2.k(b3 - bArr.length, bVar5, bArr.length) && (bVar2.b() == 2 || bVar2.k(bVar2.b() - 3, bVar3, 1) || bVar2.k(bVar2.b() - 3, bVar4, 1))) {
            return null;
        }
        int i3 = b.i(bVar2, bVar3);
        if (i3 == -1) {
            i3 = b.i(bVar2, bVar4);
        }
        if (i3 == 2 && g() != null) {
            if (bVar2.b() == 3) {
                return null;
            }
            return new l(b.m(bVar2, 0, 3, 1));
        }
        if (i3 == 1) {
            N2.g.e(bVar4, "prefix");
            if (bVar2.k(0, bVar4, bVar4.f3100J.length)) {
                return null;
            }
        }
        if (i3 == -1 && g() != null) {
            if (bVar2.b() == 2) {
                return null;
            }
            return new l(b.m(bVar2, 0, 2, 1));
        } else if (i3 == -1) {
            return new l(bVar);
        } else {
            if (i3 == 0) {
                return new l(b.m(bVar2, 0, 1, 1));
            }
            return new l(b.m(bVar2, 0, i3, 1));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        l lVar = (l) obj;
        N2.g.e(lVar, "other");
        return this.f3124J.compareTo(lVar.f3124J);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, e3.a] */
    public final l d(String str) {
        N2.g.e(str, "child");
        ?? obj = new Object();
        obj.t(str);
        return f3.b.b(this, f3.b.d(obj, false), false);
    }

    public final File e() {
        return new File(this.f3124J.n());
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof l) && N2.g.a(((l) obj).f3124J, this.f3124J)) {
            return true;
        }
        return false;
    }

    public final Path f() {
        Path path;
        path = Paths.get(this.f3124J.n(), new String[0]);
        N2.g.d(path, "get(toString())");
        return path;
    }

    public final Character g() {
        b bVar = f3.b.f3203a;
        b bVar2 = this.f3124J;
        if (b.e(bVar2, bVar) != -1 || bVar2.b() < 2 || bVar2.g(1) != 58) {
            return null;
        }
        char g = (char) bVar2.g(0);
        if (('a' > g || g >= '{') && ('A' > g || g >= '[')) {
            return null;
        }
        return Character.valueOf(g);
    }

    public final int hashCode() {
        return this.f3124J.hashCode();
    }

    public final String toString() {
        return this.f3124J.n();
    }
}
