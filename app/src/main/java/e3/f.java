package e3;

import h1.C0287g;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final i f3115a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [e3.i] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r02;
        try {
            Class.forName("java.nio.file.Files");
            r02 = new Object();
        } catch (ClassNotFoundException unused) {
            r02 = new Object();
        }
        f3115a = r02;
        String str = l.f3123K;
        String property = System.getProperty("java.io.tmpdir");
        N2.g.d(property, "getProperty(\"java.io.tmpdir\")");
        C0287g.c(property, false);
        ClassLoader classLoader = f3.d.class.getClassLoader();
        N2.g.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        new f3.d(classLoader);
    }

    public final boolean a(l lVar) {
        N2.g.e(lVar, "path");
        if (b(lVar) != null) {
            return true;
        }
        return false;
    }

    public abstract e b(l lVar);
}
