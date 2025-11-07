package E;

import A.f;
import A0.C0001b;
import C2.j;
import D.C;
import D.C0042x;
import D.N;
import D.b0;
import D.f0;
import D.l0;
import I.h;
import N2.g;
import U2.i;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0095x;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.L;
import androidx.camera.core.impl.Q;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.a0;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.k0;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import b1.InterfaceC0147c;
import c1.InterfaceC0161c;
import c2.AbstractC0162a;
import c2.C0164c;
import c2.C0166e;
import com.google.android.libraries.barhopper.RecognitionOptions;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import h2.AbstractActivityC0292d;
import h2.J;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import q0.k;
import q2.n;
import w.C0485A;
import w.C0502l;
import w.S;
import w.X;
import x.C0559n;
import x1.AbstractC0612g0;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;
import x1.AbstractC0652m0;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public final class c implements X0.b {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f501J;

    /* renamed from: K  reason: collision with root package name */
    public Object f502K;

    /* renamed from: L  reason: collision with root package name */
    public Object f503L;

    /* renamed from: M  reason: collision with root package name */
    public Object f504M;

    /* renamed from: N  reason: collision with root package name */
    public Object f505N;

    /* renamed from: O  reason: collision with root package name */
    public Object f506O;

    public /* synthetic */ c(int r12) {
        this.f501J = r12;
    }

    public static String h(String str) {
        if (str != null && i.a(str, "/")) {
            String substring = str.substring(0, i.e(6, str, "/", false));
            g.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return "*";
    }

    public void a(Q.b bVar, List list, List list2, B.a aVar) {
        synchronized (this.f502K) {
            AbstractC0624h4.b(!list2.isEmpty());
            this.f506O = aVar;
            r q3 = bVar.q();
            Set<Q.a> set = (Set) ((HashMap) this.f504M).get(f(q3));
            B.a aVar2 = (B.a) this.f506O;
            if (aVar2 == null || aVar2.f171J != 2) {
                for (Q.a aVar3 : set) {
                    Q.b bVar2 = (Q.b) ((HashMap) this.f503L).get(aVar3);
                    bVar2.getClass();
                    if (!bVar2.equals(bVar) && !bVar2.r().isEmpty()) {
                        throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner.");
                    }
                }
            }
            try {
                bVar.f1041L.F();
                bVar.f1041L.D(list);
                bVar.p(list2);
                if (((AbstractActivityC0292d) q3).f3316L.f2467c.a(l.STARTED)) {
                    l(q3);
                }
            } catch (I.e e4) {
                throw new IllegalArgumentException(e4.getMessage());
            }
        }
    }

    public void b() {
        AbstractC0612g0.a();
        f fVar = (f) this.f503L;
        fVar.getClass();
        AbstractC0612g0.a();
        a aVar = (a) fVar.f11L;
        Objects.requireNonNull(aVar);
        f0 f0Var = (f0) fVar.f10K;
        Objects.requireNonNull(f0Var);
        l0 l0Var = aVar.f493a;
        Objects.requireNonNull(l0Var);
        l0Var.a();
        l0 l0Var2 = aVar.f493a;
        Objects.requireNonNull(l0Var2);
        H.f.d(l0Var2.f2113e).a(new N(23, f0Var), AbstractC0636k0.d());
        ((R1.a) this.f504M).getClass();
        ((d) this.f505N).getClass();
    }

    public Q.b c(AbstractActivityC0292d abstractActivityC0292d, h hVar) {
        boolean z3;
        Q.b bVar;
        synchronized (this.f502K) {
            try {
                if (((HashMap) this.f503L).get(new Q.a(abstractActivityC0292d, hVar.f756M)) == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0624h4.a("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z3);
                if (abstractActivityC0292d.f3316L.f2467c != l.DESTROYED) {
                    bVar = new Q.b(abstractActivityC0292d, hVar);
                    if (((ArrayList) hVar.x()).isEmpty()) {
                        bVar.t();
                    }
                    k(bVar);
                } else {
                    throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    public c0 d() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.f505N;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        Z d4 = Z.d((X) this.f504M, size);
        d4.f2159b.f2239c = 1;
        l0 l0Var = new l0(surface);
        this.f502K = l0Var;
        E1.a d5 = H.f.d(l0Var.f2113e);
        J j3 = new J(surface, surfaceTexture, 25, false);
        d5.a(new H.e(0, d5, j3), AbstractC0636k0.a());
        d4.b((l0) this.f502K, C0042x.f480d);
        d4.f2162e.add(new a0() { // from class: w.W
            @Override // androidx.camera.core.impl.a0
            public final void a() {
                E.c cVar = E.c.this;
                cVar.f503L = cVar.d();
                C0502l c0502l = (C0502l) cVar.f506O;
                if (c0502l != null) {
                    C0511v c0511v = c0502l.f5201J;
                    c0511v.getClass();
                    try {
                        if (((Boolean) AbstractC0699s0.a(new C0502l(c0511v)).f1193K.get()).booleanValue()) {
                            E.c cVar2 = c0511v.a0;
                            c0511v.f5245L.execute(new RunnableC0505o(c0511v, C0511v.t(cVar2), (androidx.camera.core.impl.c0) cVar2.f503L, (X) cVar2.f504M, 0));
                        }
                    } catch (InterruptedException | ExecutionException e4) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e4);
                    }
                }
            }
        });
        return d4.c();
    }

    public Context e() {
        AbstractActivityC0292d abstractActivityC0292d = (AbstractActivityC0292d) this.f503L;
        if (abstractActivityC0292d == null) {
            return (Context) this.f502K;
        }
        return abstractActivityC0292d;
    }

    public Q.c f(r rVar) {
        synchronized (this.f502K) {
            try {
                for (Q.c cVar : ((HashMap) this.f504M).keySet()) {
                    if (rVar.equals(cVar.f1044K)) {
                        return cVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection g() {
        Collection unmodifiableCollection;
        synchronized (this.f502K) {
            unmodifiableCollection = Collections.unmodifiableCollection(((HashMap) this.f503L).values());
        }
        return unmodifiableCollection;
    }

    @Override // A2.a
    public Object get() {
        return new Z0.b((Executor) ((A2.a) this.f502K).get(), (W0.g) ((A2.a) this.f503L).get(), (a1.d) ((C0001b) this.f504M).get(), (InterfaceC0147c) ((A2.a) this.f505N).get(), (InterfaceC0161c) ((A2.a) this.f506O).get());
    }

    public File i() {
        return new File(e().getCacheDir(), "share_plus");
    }

    public boolean j(r rVar) {
        synchronized (this.f502K) {
            try {
                Q.c f2 = f(rVar);
                if (f2 == null) {
                    return false;
                }
                for (Q.a aVar : (Set) ((HashMap) this.f504M).get(f2)) {
                    Q.b bVar = (Q.b) ((HashMap) this.f503L).get(aVar);
                    bVar.getClass();
                    if (!bVar.r().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(Q.b bVar) {
        Set hashSet;
        synchronized (this.f502K) {
            try {
                r q3 = bVar.q();
                Q.a aVar = new Q.a(q3, bVar.f1041L.f756M);
                Q.c f2 = f(q3);
                if (f2 != null) {
                    hashSet = (Set) ((HashMap) this.f504M).get(f2);
                } else {
                    hashSet = new HashSet();
                }
                hashSet.add(aVar);
                ((HashMap) this.f503L).put(aVar, bVar);
                if (f2 == null) {
                    Q.c cVar = new Q.c(q3, this);
                    ((HashMap) this.f504M).put(cVar, hashSet);
                    ((AbstractActivityC0292d) q3).f3316L.a(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(r rVar) {
        synchronized (this.f502K) {
            try {
                if (!j(rVar)) {
                    return;
                }
                if (((ArrayDeque) this.f505N).isEmpty()) {
                    ((ArrayDeque) this.f505N).push(rVar);
                } else {
                    B.a aVar = (B.a) this.f506O;
                    if (aVar == null || aVar.f171J != 2) {
                        r rVar2 = (r) ((ArrayDeque) this.f505N).peek();
                        if (!rVar.equals(rVar2)) {
                            q(rVar2);
                            ((ArrayDeque) this.f505N).remove(rVar);
                            ((ArrayDeque) this.f505N).push(rVar);
                        }
                    }
                }
                r(rVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(r rVar) {
        synchronized (this.f502K) {
            try {
                ((ArrayDeque) this.f505N).remove(rVar);
                q(rVar);
                if (!((ArrayDeque) this.f505N).isEmpty()) {
                    r((r) ((ArrayDeque) this.f505N).peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(String str, String str2, boolean z3) {
        Intent createChooser;
        g.e(str, "text");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (z3) {
            Context context = (Context) this.f502K;
            createChooser = AbstractC0162a.a(intent, PendingIntent.getBroadcast(context, 0, new Intent(context, SharePlusPendingIntent.class), ((Number) ((B2.f) this.f506O).a()).intValue() | 134217728).getIntentSender());
        } else {
            createChooser = Intent.createChooser(intent, null);
        }
        g.b(createChooser);
        p(createChooser, z3);
    }

    public void o(List list, List list2, String str, String str2, boolean z3) {
        boolean z4;
        Intent createChooser;
        boolean z5;
        boolean z6;
        boolean z7;
        File i3 = i();
        File[] listFiles = i3.listFiles();
        if (i3.exists() && listFiles != null && listFiles.length != 0) {
            for (File file : listFiles) {
                file.delete();
            }
            i3.delete();
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = new File((String) it.next());
            try {
                String canonicalPath = file2.getCanonicalPath();
                g.b(canonicalPath);
                String canonicalPath2 = i().getCanonicalPath();
                g.d(canonicalPath2, "getCanonicalPath(...)");
                z7 = canonicalPath.startsWith(canonicalPath2);
            } catch (IOException unused) {
                z7 = false;
            }
            if (!z7) {
                File i4 = i();
                if (!i4.exists()) {
                    i4.mkdirs();
                }
                File file3 = new File(i4, file2.getName());
                if (file2.exists()) {
                    if (file3.exists() && !file3.delete()) {
                        throw new K2.b(file2, file3, "Tried to overwrite the destination, but failed to delete it.");
                    }
                    if (file2.isDirectory()) {
                        if (!file3.mkdirs()) {
                            throw new K2.b(file2, file3, "Failed to create target directory.");
                        }
                    } else {
                        File parentFile = file3.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file3);
                            byte[] bArr = new byte[8192];
                            for (int read = fileInputStream.read(bArr); read >= 0; read = fileInputStream.read(bArr)) {
                                fileOutputStream.write(bArr, 0, read);
                            }
                            AbstractC0652m0.a(fileOutputStream, null);
                            AbstractC0652m0.a(fileInputStream, null);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC0652m0.a(fileInputStream, th);
                                throw th2;
                            }
                        }
                    }
                    arrayList.add(W.g.d(e(), (String) ((B2.f) this.f505N).a(), file3));
                } else {
                    throw new K2.b(file2, null, "The source file doesn't exist.");
                }
            } else {
                throw new IOException("Shared file can not be located in '" + i().getCanonicalPath() + '\'');
            }
        }
        Intent intent = new Intent();
        if (arrayList.isEmpty()) {
            if (str != null && !i.g(str)) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (!z6) {
                n(str, str2, z3);
                return;
            }
        }
        String str3 = "*/*";
        if (arrayList.size() == 1) {
            List list3 = list2;
            if (list3 != null && !list3.isEmpty()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5) {
                str3 = (String) C2.i.h(list2);
            }
            intent.setAction("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.STREAM", (Parcelable) C2.i.h(arrayList));
        } else {
            intent.setAction("android.intent.action.SEND_MULTIPLE");
            if (list2 != null) {
                z4 = list2.isEmpty();
            } else {
                z4 = true;
            }
            if (!z4) {
                g.b(list2);
                if (list2.size() == 1) {
                    str3 = (String) C2.i.h(list2);
                } else {
                    String str4 = (String) C2.i.h(list2);
                    int a4 = j.a(list2);
                    if (1 <= a4) {
                        int r8 = 1;
                        while (true) {
                            if (!g.a(str4, list2.get(r8))) {
                                if (!h(str4).equals(h((String) list2.get(r8)))) {
                                    break;
                                }
                                str4 = h((String) list2.get(r8)).concat("/*");
                            }
                            if (r8 == a4) {
                                break;
                            }
                            r8++;
                        }
                    }
                    str3 = str4;
                }
            }
            intent.setType(str3);
            intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        intent.addFlags(1);
        if (z3) {
            Context context = (Context) this.f502K;
            createChooser = AbstractC0162a.a(intent, PendingIntent.getBroadcast(context, 0, new Intent(context, SharePlusPendingIntent.class), ((Number) ((B2.f) this.f506O).a()).intValue() | 134217728).getIntentSender());
        } else {
            createChooser = Intent.createChooser(intent, null);
        }
        List<ResolveInfo> queryIntentActivities = e().getPackageManager().queryIntentActivities(createChooser, 65536);
        g.d(queryIntentActivities, "queryIntentActivities(...)");
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str5 = resolveInfo.activityInfo.packageName;
            Iterator<? extends Parcelable> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                e().grantUriPermission(str5, (Uri) it2.next(), 3);
            }
        }
        g.b(createChooser);
        p(createChooser, z3);
    }

    public void p(Intent intent, boolean z3) {
        n nVar;
        AbstractActivityC0292d abstractActivityC0292d = (AbstractActivityC0292d) this.f503L;
        if (abstractActivityC0292d != null) {
            if (z3) {
                abstractActivityC0292d.startActivityForResult(intent, 22643);
                return;
            } else {
                abstractActivityC0292d.startActivity(intent);
                return;
            }
        }
        intent.addFlags(268435456);
        if (z3) {
            C0166e c0166e = (C0166e) this.f504M;
            if (c0166e.f2664K.compareAndSet(false, true) && (nVar = c0166e.f2663J) != null) {
                nVar.c("dev.fluttercommunity.plus/share/unavailable");
                c0166e.f2663J = null;
            }
        }
        ((Context) this.f502K).startActivity(intent);
    }

    public void q(r rVar) {
        synchronized (this.f502K) {
            try {
                Q.c f2 = f(rVar);
                if (f2 == null) {
                    return;
                }
                for (Q.a aVar : (Set) ((HashMap) this.f504M).get(f2)) {
                    Q.b bVar = (Q.b) ((HashMap) this.f503L).get(aVar);
                    bVar.getClass();
                    bVar.t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void r(r rVar) {
        synchronized (this.f502K) {
            try {
                for (Q.a aVar : (Set) ((HashMap) this.f504M).get(f(rVar))) {
                    Q.b bVar = (Q.b) ((HashMap) this.f503L).get(aVar);
                    bVar.getClass();
                    if (!bVar.r().isEmpty()) {
                        bVar.v();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.f501J) {
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f502K) + ", mProviderPackage: " + ((String) this.f503L) + ", mQuery: " + ((String) this.f504M) + ", mCertificates:");
                int r22 = 0;
                while (true) {
                    List list = (List) this.f505N;
                    if (r22 < list.size()) {
                        sb.append(" [");
                        List list2 = (List) list.get(r22);
                        for (int r4 = 0; r4 < list2.size(); r4++) {
                            sb.append(" \"");
                            sb.append(Base64.encodeToString((byte[]) list2.get(r4), 0));
                            sb.append("\"");
                        }
                        sb.append(" ]");
                        r22++;
                    } else {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                }
            default:
                return super.toString();
        }
    }

    public c(Context context, C0166e c0166e) {
        this.f501J = 4;
        g.e(context, "context");
        g.e(c0166e, "manager");
        this.f502K = context;
        this.f503L = null;
        this.f504M = c0166e;
        this.f505N = new B2.f(new M2.a() { // from class: c2.b
            @Override // M2.a
            public final Object a() {
                return E.c.this.e().getPackageName() + ".flutter.share_provider";
            }
        });
        this.f506O = new B2.f(new C0164c(0));
    }

    public c(A2.a aVar, A2.a aVar2, C0001b c0001b, A2.a aVar3, A2.a aVar4) {
        this.f501J = 2;
        this.f502K = aVar;
        this.f503L = aVar2;
        this.f504M = c0001b;
        this.f505N = aVar3;
        this.f506O = aVar4;
    }

    public c(String str, String str2, String str3, List list) {
        this.f501J = 3;
        this.f502K = str;
        this.f503L = str2;
        this.f504M = str3;
        list.getClass();
        this.f505N = list;
        this.f506O = str + "-" + str2 + "-" + str3;
    }

    public c() {
        this.f501J = 1;
        this.f502K = new Object();
        this.f503L = new HashMap();
        this.f504M = new HashMap();
        this.f505N = new ArrayDeque();
    }

    public c(C0559n c0559n, S s3, C0502l c0502l) {
        Size size;
        this.f501J = 5;
        A.i iVar = new A.i();
        this.f504M = new X();
        this.f506O = c0502l;
        Size[] c4 = c0559n.b().c(34);
        if (c4 == null) {
            x1.X.b("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (iVar.f16a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size2 : c4) {
                    if (A.i.f15c.compare(size2, A.i.f14b) >= 0) {
                        arrayList.add(size2);
                    }
                }
                c4 = (Size[]) arrayList.toArray(new Size[0]);
            }
            List asList = Arrays.asList(c4);
            Collections.sort(asList, new Q(2));
            Size e4 = s3.e();
            long min = Math.min(e4.getWidth() * e4.getHeight(), 307200L);
            int length = c4.length;
            Size size3 = null;
            int r5 = 0;
            while (true) {
                if (r5 >= length) {
                    break;
                }
                Size size4 = c4[r5];
                int r9 = ((size4.getWidth() * size4.getHeight()) > min ? 1 : ((size4.getWidth() * size4.getHeight()) == min ? 0 : -1));
                if (r9 == 0) {
                    size = size4;
                    break;
                } else if (r9 <= 0) {
                    r5++;
                    size3 = size4;
                } else if (size3 != null) {
                    size = size3;
                }
            }
            size = (Size) asList.get(0);
        }
        this.f505N = size;
        x1.X.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
        this.f503L = d();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, E.d] */
    public c(G g, Size size, boolean z3) {
        b bVar;
        L l3;
        this.f501J = 0;
        AbstractC0612g0.a();
        this.f502K = g;
        C0485A c0485a = (C0485A) g.i0(k0.f2211A, null);
        if (c0485a != null) {
            C0095x c0095x = new C0095x();
            c0485a.a(g, c0095x);
            c0095x.d();
            f fVar = new f(4);
            this.f503L = fVar;
            this.f504M = new Object();
            Executor executor = (Executor) ((androidx.camera.core.impl.S) g.V()).i0(I.i.f769a, AbstractC0636k0.c());
            Objects.requireNonNull(executor);
            A0.Q q3 = K.b.f808a;
            ?? obj = new Object();
            if (q3.b(K.f.class) != null) {
                new G.l(executor);
            }
            obj.f508b = q3;
            obj.f507a = q3.a(K.d.class);
            this.f505N = obj;
            int b02 = g.b0();
            Integer num = (Integer) ((androidx.camera.core.impl.S) g.V()).i0(G.f2130M, null);
            int intValue = num != null ? num.intValue() : RecognitionOptions.QR_CODE;
            if (((androidx.camera.core.impl.S) g.V()).i0(G.f2131N, null) == null) {
                N.g gVar = new N.g();
                N.g gVar2 = new N.g();
                a aVar = new a(size, b02, intValue, z3, gVar, gVar2);
                this.f506O = aVar;
                AbstractC0624h4.f("CaptureNode does not support recreation yet.", ((a) fVar.f11L) == null && ((f0) fVar.f10K) == null);
                fVar.f11L = aVar;
                if (!z3) {
                    L b0Var = new b0(size.getWidth(), size.getHeight(), b02, 4);
                    bVar = new b(fVar, 0);
                    l3 = b0Var;
                } else {
                    A.c cVar = new A.c(10, new B0.e(ImageReader.newInstance(size.getWidth(), size.getHeight(), b02, 4)));
                    bVar = new b(fVar, cVar);
                    l3 = cVar;
                }
                Surface surface = l3.getSurface();
                Objects.requireNonNull(surface);
                AbstractC0624h4.f("The surface is already set.", aVar.f493a == null);
                aVar.f493a = new l0(surface, size, b02);
                fVar.f10K = new f0(l3);
                l3.t(new A.k(3, fVar), AbstractC0636k0.d());
                gVar.f899b = bVar;
                gVar2.f899b = new b(fVar, 2);
                K.d dVar = (K.d) ((A0.Q) obj.f508b).b(K.d.class);
                return;
            }
            throw new ClassCastException();
        }
        throw new IllegalStateException("Implementation is missing option unpacker for " + C.k(g, g.toString()));
    }
}
