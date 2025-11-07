package G0;

import B2.c;
import H0.l;
import K0.j;
import N2.g;
import N2.h;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e3.f;
import e3.i;
import e3.p;
import f3.d;
import h1.C0287g;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import q0.k;
import t0.e;
import w1.u;
import x1.AbstractC0648l4;
import x1.AbstractC0652m0;

/* loaded from: classes.dex */
public final class a extends h implements M2.a {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f688K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f689L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int r12, Object obj) {
        super(0);
        this.f688K = r12;
        this.f689L = obj;
    }

    @Override // M2.a
    public final Object a() {
        boolean z3;
        Iterator it;
        c cVar;
        int a4;
        c cVar2;
        Object obj = this.f689L;
        switch (this.f688K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                A.a aVar = (A.a) obj;
                Class<?> loadClass = ((ClassLoader) aVar.f1K).loadClass("androidx.window.extensions.WindowExtensionsProvider");
                g.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = ((ClassLoader) aVar.f1K).loadClass("androidx.window.extensions.WindowExtensions");
                g.d(loadClass2, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
                g.d(declaredMethod, "getWindowExtensionsMethod");
                if (declaredMethod.getReturnType().equals(loadClass2) && Modifier.isPublic(declaredMethod.getModifiers())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            case 1:
                l lVar = (l) obj;
                return BigInteger.valueOf(lVar.f734J).shiftLeft(32).or(BigInteger.valueOf(lVar.f735K)).shiftLeft(32).or(BigInteger.valueOf(lVar.f736L));
            case 2:
                ((e) obj).getClass();
                throw new IllegalStateException("Can't access ViewModels from detached fragment");
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                e3.l lVar2 = d.f3210c;
                ClassLoader classLoader = (ClassLoader) obj;
                Enumeration<URL> resources = classLoader.getResources("");
                g.d(resources, "getResources(\"\")");
                ArrayList<URL> list = Collections.list(resources);
                g.d(list, "list(this)");
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    e3.l lVar3 = d.f3210c;
                    g.d(url, "it");
                    if (!g.a(url.getProtocol(), "file")) {
                        cVar2 = null;
                    } else {
                        i iVar = f.f3115a;
                        String str = e3.l.f3123K;
                        cVar2 = new c(iVar, C0287g.d(new File(url.toURI())));
                    }
                    if (cVar2 != null) {
                        arrayList.add(cVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                g.d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
                ArrayList list2 = Collections.list(resources2);
                g.d(list2, "list(this)");
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    URL url2 = (URL) it2.next();
                    e3.l lVar4 = d.f3210c;
                    g.d(url2, "it");
                    String url3 = url2.toString();
                    g.d(url3, "toString()");
                    if (url3.startsWith("jar:file:")) {
                        int c4 = U2.i.c(url3);
                        g.e(url3, "<this>");
                        int lastIndexOf = url3.lastIndexOf("!", c4);
                        if (lastIndexOf != -1) {
                            String str2 = e3.l.f3123K;
                            String substring = url3.substring(4, lastIndexOf);
                            g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            e3.l d4 = C0287g.d(new File(URI.create(substring)));
                            i iVar2 = f.f3115a;
                            g.e(iVar2, "fileSystem");
                            e3.h e4 = iVar2.e(d4);
                            try {
                                long f2 = e4.f() - 22;
                                if (f2 >= 0) {
                                    it = it2;
                                    long max = Math.max(f2 - 65536, 0L);
                                    while (true) {
                                        p a5 = AbstractC0648l4.a(e4.h(f2));
                                        if (a5.a() == 101010256) {
                                            int f4 = a5.f() & 65535;
                                            int f5 = a5.f() & 65535;
                                            long f6 = a5.f() & 65535;
                                            if (f6 == (a5.f() & 65535) && f4 == 0 && f5 == 0) {
                                                a5.k(4L);
                                                int f7 = a5.f() & 65535;
                                                f3.c cVar3 = new f3.c(f6, a5.a() & 4294967295L, f7);
                                                a5.h(f7);
                                                a5.close();
                                                long j3 = f2 - 20;
                                                if (j3 > 0) {
                                                    p a6 = AbstractC0648l4.a(e4.h(j3));
                                                    if (a6.a() == 117853008) {
                                                        int a7 = a6.a();
                                                        long b3 = a6.b();
                                                        if (a6.a() == 1 && a7 == 0) {
                                                            p a8 = AbstractC0648l4.a(e4.h(b3));
                                                            try {
                                                                if (a8.a() == 101075792) {
                                                                    a8.k(12L);
                                                                    int a9 = a8.a();
                                                                    int a10 = a8.a();
                                                                    long b4 = a8.b();
                                                                    if (b4 == a8.b() && a9 == 0 && a10 == 0) {
                                                                        a8.k(8L);
                                                                        f3.c cVar4 = new f3.c(b4, a8.b(), f7);
                                                                        AbstractC0652m0.a(a8, null);
                                                                        cVar3 = cVar4;
                                                                    } else {
                                                                        throw new IOException("unsupported zip: spanned");
                                                                    }
                                                                } else {
                                                                    throw new IOException("bad zip: expected " + f3.a.b(101075792) + " but was " + f3.a.b(a4));
                                                                }
                                                            } finally {
                                                            }
                                                        } else {
                                                            throw new IOException("unsupported zip: spanned");
                                                        }
                                                    }
                                                    AbstractC0652m0.a(a6, null);
                                                }
                                                long j4 = cVar3.f3209b;
                                                ArrayList arrayList3 = new ArrayList();
                                                p a11 = AbstractC0648l4.a(e4.h(j4));
                                                long j5 = cVar3.f3208a;
                                                long j6 = 0;
                                                while (j6 < j5) {
                                                    f3.e c5 = f3.a.c(a11);
                                                    long j7 = j5;
                                                    if (c5.f3216e < j4) {
                                                        e3.l lVar5 = d.f3210c;
                                                        if (u.n(c5.f3212a)) {
                                                            arrayList3.add(c5);
                                                        }
                                                        j6++;
                                                        j5 = j7;
                                                    } else {
                                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                                    }
                                                }
                                                AbstractC0652m0.a(a11, null);
                                                e3.u uVar = new e3.u(d4, iVar2, f3.a.a(arrayList3));
                                                AbstractC0652m0.a(e4, null);
                                                cVar = new c(uVar, d.f3210c);
                                            } else {
                                                throw new IOException("unsupported zip: spanned");
                                            }
                                        } else {
                                            a5.close();
                                            f2--;
                                            if (f2 < max) {
                                                throw new IOException("not a zip: end of central directory signature not found");
                                            }
                                        }
                                    }
                                } else {
                                    throw new IOException("not a zip: size=" + e4.f());
                                }
                            } finally {
                            }
                        }
                    }
                    it = it2;
                    cVar = null;
                    if (cVar != null) {
                        arrayList2.add(cVar);
                    }
                    it2 = it;
                }
                ArrayList arrayList4 = new ArrayList(arrayList2.size() + arrayList.size());
                arrayList4.addAll(arrayList);
                arrayList4.addAll(arrayList2);
                return arrayList4;
            default:
                File file = (File) ((j) obj).a();
                String name = file.getName();
                g.d(name, "getName(...)");
                if (U2.i.k(name, "").equals("preferences_pb")) {
                    String str3 = e3.l.f3123K;
                    File absoluteFile = file.getAbsoluteFile();
                    g.d(absoluteFile, "file.absoluteFile");
                    return C0287g.d(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
