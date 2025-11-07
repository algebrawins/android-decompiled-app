package A;

import A0.A;
import A0.C0001b;
import A0.Q;
import A0.V;
import A0.z;
import D.C;
import D.O;
import M2.p;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.graphics.Rect;
import android.media.Image;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0077d;
import androidx.camera.core.impl.EnumC0097z;
import androidx.camera.core.impl.InterfaceC0087o;
import androidx.camera.core.impl.S;
import b1.C0145a;
import b1.C0149e;
import c0.InterfaceC0157a;
import c1.InterfaceC0160b;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p.t0;
import s.InterfaceC0447a;
import x1.A0;
import x1.AbstractC0624h4;
import x1.C0569a5;
import x1.C0570a6;
import x1.C0597e1;
import x1.C0614g2;
import x1.C0729v6;
import x1.C0760z5;
import x1.D4;
import x1.F1;
import x1.H2;
import x1.J3;
import x1.J6;
import x1.i3;
import x1.i4;
import z.AbstractC0957j;
import z.C0948a;
import z.C0953f;

/* loaded from: classes.dex */
public class a implements V, androidx.camera.core.impl.V, C1.e, H.c, H.a, S.j, V1.a, Y2.d, InterfaceC0160b, InterfaceC0087o, X0.b, InterfaceC0157a {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f0J;

    /* renamed from: K  reason: collision with root package name */
    public Object f1K;

    public /* synthetic */ a(int r12, Object obj) {
        this.f0J = r12;
        this.f1K = obj;
    }

    @Override // A0.V
    public View C(int r22) {
        return ((z) this.f1K).o(r22);
    }

    @Override // V1.a
    public U1.c D() {
        i3 i3Var = ((J6) this.f1K).f5632n;
        if (i3Var == null) {
            return null;
        }
        return new U1.c(i3Var.f5920a, i3Var.f5921b, i3Var.f5922c, i3Var.f5923d, i3Var.f5924e, i3Var.f5925f, i3Var.g, i3Var.f5926h, i3Var.f5927i, i3Var.f5928j, i3Var.f5929k, i3Var.f5930l, i3Var.f5931m, i3Var.f5932n);
    }

    @Override // androidx.camera.core.impl.A
    public /* synthetic */ Object E(C0076c c0076c, EnumC0097z enumC0097z) {
        int r02 = this.f0J;
        return C.q(this, c0076c, enumC0097z);
    }

    @Override // A0.V
    public int F() {
        z zVar = (z) this.f1K;
        return zVar.g - zVar.r();
    }

    @Override // V1.a
    public U1.g G() {
        C0760z5 c0760z5 = ((J6) this.f1K).f5626h;
        if (c0760z5 != null) {
            return new U1.g(c0760z5.f6149a, c0760z5.f6150b, false);
        }
        return null;
    }

    @Override // A0.V
    public int H() {
        return ((z) this.f1K).u();
    }

    @Override // V1.a
    public String I() {
        return ((J6) this.f1K).f5622c;
    }

    @Override // androidx.camera.core.impl.A
    public /* synthetic */ Set J(C0076c c0076c) {
        int r02 = this.f0J;
        return C.g(this, c0076c);
    }

    @Override // A0.V
    public int P(View view) {
        ((z) this.f1K).getClass();
        return view.getBottom() + ((A) view.getLayoutParams()).f31a.bottom + ((ViewGroup.MarginLayoutParams) ((A) view.getLayoutParams())).bottomMargin;
    }

    @Override // V1.a
    public U1.h T() {
        C0729v6 c0729v6 = ((J6) this.f1K).f5627i;
        if (c0729v6 != null) {
            return new U1.h(c0729v6.f6112c, c0729v6.f6110a, c0729v6.f6111b);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.V
    public androidx.camera.core.impl.A V() {
        switch (this.f0J) {
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return (androidx.camera.core.impl.A) this.f1K;
            default:
                return S.f2152L;
        }
    }

    @Override // androidx.camera.core.impl.A
    public void X(C.f fVar) {
        switch (this.f0J) {
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                V().X(fVar);
                return;
            default:
                C.b(this, fVar);
                return;
        }
    }

    @Override // c1.InterfaceC0160b
    public Object Y() {
        a1.h hVar = (a1.h) this.f1K;
        SQLiteDatabase a4 = ((b1.h) hVar.f1829b).a();
        a4.beginTransaction();
        try {
            List<V0.c> list = (List) b1.h.k(a4.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C0149e.f2617L);
            a4.setTransactionSuccessful();
            a4.endTransaction();
            for (V0.c cVar : list) {
                hVar.f1830c.a(cVar, 1, false);
            }
            return null;
        } catch (Throwable th) {
            a4.endTransaction();
            throw th;
        }
    }

    @Override // A0.V
    public int Z(View view) {
        ((z) this.f1K).getClass();
        return (view.getTop() - ((A) view.getLayoutParams()).f31a.top) - ((ViewGroup.MarginLayoutParams) ((A) view.getLayoutParams())).topMargin;
    }

    @Override // V1.a
    public int a() {
        return ((J6) this.f1K).f5623d;
    }

    @Override // S.j
    public Object a0(S.i iVar) {
        boolean z3;
        H.j jVar = (H.j) this.f1K;
        if (jVar.f712O == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("The result can only set once!", z3);
        jVar.f712O = iVar;
        return "ListFuture[" + this + "]";
    }

    @Override // H.a
    public E1.a apply(Object obj) {
        return H.f.c(((InterfaceC0447a) this.f1K).apply(obj));
    }

    @Override // C1.e, H.c
    public void b(Object obj) {
        switch (this.f0J) {
            case 8:
                Void r22 = (Void) obj;
                ((C1.g) ((c) this.f1K).f5K).f239a.i();
                return;
            case 11:
                Void r23 = (Void) obj;
                return;
            default:
                Void r24 = (Void) obj;
                ((N.i) this.f1K).run();
                return;
        }
    }

    @Override // V1.a
    public int c() {
        return ((J6) this.f1K).f5620a;
    }

    @Override // H.c
    public void c0(Throwable th) {
        switch (this.f0J) {
            case 11:
                ((O) this.f1K).close();
                return;
            default:
                return;
        }
    }

    @Override // c0.InterfaceC0157a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f1K;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override // V1.a
    public t0 d0() {
        Object arrayList;
        H2 h22 = ((J6) this.f1K).f5631m;
        t0 t0Var = null;
        if (h22 == null) {
            return null;
        }
        D4 d4 = h22.f5573a;
        if (d4 != null) {
            t0Var = new t0(d4.f5525a, d4.f5526b, d4.f5527c, d4.f5528d, d4.f5529e, d4.f5530f, d4.g);
        }
        t0 t0Var2 = t0Var;
        ArrayList arrayList2 = new ArrayList();
        C0569a5[] c0569a5Arr = h22.f5576d;
        if (c0569a5Arr != null) {
            for (C0569a5 c0569a5 : c0569a5Arr) {
                if (c0569a5 != null) {
                    arrayList2.add(new U1.f(c0569a5.f5833b, c0569a5.f5832a));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        J3[] j3Arr = h22.f5577e;
        if (j3Arr != null) {
            for (J3 j3 : j3Arr) {
                if (j3 != null) {
                    arrayList3.add(new U1.d(j3.f5616a, j3.f5617b, j3.f5618c, j3.f5619d));
                }
            }
        }
        String[] strArr = h22.f5578f;
        if (strArr != null) {
            arrayList = Arrays.asList(strArr);
        } else {
            arrayList = new ArrayList();
        }
        Object obj = arrayList;
        ArrayList arrayList4 = new ArrayList();
        C0597e1[] c0597e1Arr = h22.g;
        if (c0597e1Arr != null) {
            for (C0597e1 c0597e1 : c0597e1Arr) {
                if (c0597e1 != null) {
                    arrayList4.add(new U1.a(c0597e1.f5879a, c0597e1.f5880b));
                }
            }
        }
        return new t0(t0Var2, h22.f5574b, h22.f5575c, arrayList2, arrayList3, obj, arrayList4);
    }

    @Override // androidx.camera.core.impl.A
    public /* synthetic */ Object e(C0076c c0076c) {
        int r02 = this.f0J;
        return C.o(this, c0076c);
    }

    @Override // V1.a
    public Rect e0() {
        J6 j6 = (J6) this.f1K;
        if (j6.f5624e != null) {
            int r12 = 0;
            int r22 = Integer.MIN_VALUE;
            int r3 = Integer.MIN_VALUE;
            int r4 = Integer.MAX_VALUE;
            int r5 = Integer.MAX_VALUE;
            while (true) {
                Point[] pointArr = j6.f5624e;
                if (r12 < pointArr.length) {
                    Point point = pointArr[r12];
                    r4 = Math.min(r4, point.x);
                    r22 = Math.max(r22, point.x);
                    r5 = Math.min(r5, point.y);
                    r3 = Math.max(r3, point.y);
                    r12++;
                } else {
                    return new Rect(r4, r5, r22, r3);
                }
            }
        } else {
            return null;
        }
    }

    @Override // V1.a
    public Point[] f() {
        return ((J6) this.f1K).f5624e;
    }

    @Override // V1.a
    public U1.f g() {
        C0569a5 c0569a5 = ((J6) this.f1K).g;
        if (c0569a5 != null) {
            return new U1.f(c0569a5.f5833b, c0569a5.f5832a);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.A
    public /* synthetic */ EnumC0097z g0(C0076c c0076c) {
        int r02 = this.f0J;
        return C.f(this, c0076c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, d1.a] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, d1.a] */
    @Override // A2.a
    public Object get() {
        return new b1.h(new Object(), new Object(), C0145a.f2606f, (b1.k) ((W0.f) this.f1K).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Type inference failed for: r7v4, types: [M2.p, F2.g] */
    @Override // Y2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(Y2.e r7, D2.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof Y2.a
            if (r0 == 0) goto L13
            r0 = r8
            Y2.a r0 = (Y2.a) r0
            int r1 = r0.f1679P
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1679P = r1
            goto L18
        L13:
            Y2.a r0 = new Y2.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f1677N
            E2.a r1 = E2.a.COROUTINE_SUSPENDED
            int r2 = r0.f1679P
            B2.i r3 = B2.i.f210a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            Z2.n r7 = r0.f1676M
            P1.a.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r8 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            P1.a.b(r8)
            Z2.n r8 = new Z2.n
            D2.i r2 = r0.f655K
            N2.g.b(r2)
            r8.<init>(r7, r2)
            r0.f1676M = r8     // Catch: java.lang.Throwable -> L5e
            r0.f1679P = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r6.f1K     // Catch: java.lang.Throwable -> L5e
            F2.g r7 = (F2.g) r7     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.g(r8, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r8
        L56:
            r7.n()
            return r3
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L5e:
            r7 = move-exception
            goto L5a
        L60:
            r7.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: A.a.h(Y2.e, D2.d):java.lang.Object");
    }

    @Override // V1.a
    public byte[] h0() {
        return ((J6) this.f1K).f5633o;
    }

    @Override // androidx.camera.core.impl.A
    public /* synthetic */ Object i0(C0076c c0076c, Object obj) {
        int r02 = this.f0J;
        return C.p(this, c0076c, obj);
    }

    @Override // V1.a
    public String j0() {
        return ((J6) this.f1K).f5621b;
    }

    @Override // V1.a
    public t0 k0() {
        U1.b bVar;
        C0614g2 c0614g2 = ((J6) this.f1K).f5630l;
        U1.b bVar2 = null;
        if (c0614g2 == null) {
            return null;
        }
        F1 f1 = c0614g2.f5898f;
        if (f1 == null) {
            bVar = null;
        } else {
            bVar = new U1.b(f1.f5549h, 0);
        }
        F1 f12 = c0614g2.g;
        if (f12 != null) {
            bVar2 = new U1.b(f12.f5549h, 0);
        }
        return new t0(c0614g2.f5893a, c0614g2.f5894b, c0614g2.f5895c, c0614g2.f5896d, c0614g2.f5897e, bVar, bVar2);
    }

    @Override // V1.a
    public U1.d l() {
        J3 j3 = ((J6) this.f1K).f5625f;
        if (j3 != null) {
            return new U1.d(j3.f5616a, j3.f5617b, j3.f5618c, j3.f5619d);
        }
        return null;
    }

    public T0.c l0(Object obj) {
        InputStream inputStream;
        T0.b bVar = (T0.b) obj;
        T0.d dVar = (T0.d) this.f1K;
        A0.a("CctTransportBackend", "Making request to: %s", bVar.f1208a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f1208a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(dVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/2.3.3 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = bVar.f1210c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                a aVar = dVar.f1214a;
                U0.i iVar = bVar.f1209b;
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                J1.d dVar2 = (J1.d) aVar.f1K;
                J1.e eVar = new J1.e(bufferedWriter, dVar2.f796a, dVar2.f797b, dVar2.f798c, dVar2.f799d);
                eVar.e(iVar);
                eVar.g();
                eVar.f801b.flush();
                gZIPOutputStream.close();
                if (outputStream != null) {
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Log.i("TransportRuntime.".concat("CctTransportBackend"), C.w("Status Code: ", responseCode));
                Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                    if (responseCode != 200) {
                        return new T0.c(responseCode, null, 0L);
                    }
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                            inputStream = new GZIPInputStream(inputStream2);
                        } else {
                            inputStream = inputStream2;
                        }
                        T0.c cVar = new T0.c(responseCode, null, U0.m.a(new BufferedReader(new InputStreamReader(inputStream))).f1310a);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (inputStream2 != null) {
                            inputStream2.close();
                        }
                        return cVar;
                    } catch (Throwable th) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable unused) {
                            }
                        }
                        throw th;
                    }
                }
                return new T0.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable unused2) {
                    }
                }
                throw th2;
            }
        } catch (H1.b e4) {
            e = e4;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new T0.c(400, null, 0L);
        } catch (ConnectException e5) {
            e = e5;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new T0.c(500, null, 0L);
        } catch (UnknownHostException e6) {
            e = e6;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new T0.c(500, null, 0L);
        } catch (IOException e7) {
            e = e7;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new T0.c(400, null, 0L);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [V0.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, V0.a] */
    public V0.d m0() {
        Context context = (Context) this.f1K;
        if (context != null) {
            ?? obj = new Object();
            obj.f1371J = X0.a.a(V0.g.f1378a);
            c cVar = new c(17, context);
            obj.f1372K = cVar;
            obj.f1373L = X0.a.a(new f(14, cVar, new W0.f(cVar, 0)));
            A2.a a4 = X0.a.a(new a(28, new W0.f(obj.f1372K, 1)));
            obj.f1374M = a4;
            Object obj2 = new Object();
            c cVar2 = obj.f1372K;
            C0001b c0001b = new C0001b(cVar2, a4, obj2, 12);
            A2.a aVar = obj.f1371J;
            A2.a aVar2 = obj.f1373L;
            E.c cVar3 = new E.c(aVar, aVar2, c0001b, a4, a4);
            ?? obj3 = new Object();
            obj3.f1356J = cVar2;
            obj3.f1357K = aVar2;
            obj3.f1358L = a4;
            obj3.f1359M = c0001b;
            obj3.f1360N = aVar;
            obj3.f1361O = a4;
            obj.f1375N = X0.a.a(new C0001b(cVar3, obj3, new a1.i(aVar, a4, c0001b, a4), 10));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }

    @Override // V1.a
    public U1.e n() {
        i4 i4Var = ((J6) this.f1K).f5629k;
        if (i4Var != null) {
            return new U1.e(i4Var.f5933a, i4Var.f5934b);
        }
        return null;
    }

    public ByteBuffer n0() {
        return ((Image.Plane) this.f1K).getBuffer();
    }

    @Override // androidx.camera.core.impl.A
    public /* synthetic */ Set o() {
        switch (this.f0J) {
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return C.n(this);
            default:
                return C.n(this);
        }
    }

    public int o0() {
        return ((Image.Plane) this.f1K).getPixelStride();
    }

    public int p0() {
        return ((Image.Plane) this.f1K).getRowStride();
    }

    @Override // androidx.camera.core.impl.A
    public /* synthetic */ boolean q(C0076c c0076c) {
        int r02 = this.f0J;
        return C.a(this, c0076c);
    }

    @Override // V1.a
    public U1.g r() {
        C0570a6 c0570a6 = ((J6) this.f1K).f5628j;
        if (c0570a6 != null) {
            return new U1.g(c0570a6.f5834a, c0570a6.f5835b, false);
        }
        return null;
    }

    @Override // c0.InterfaceC0157a
    public Cursor w(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f1K;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e4) {
            Log.w("FontsProvider", "Unable to query the content provider", e4);
            return null;
        }
    }

    public a(Q q3, int r22) {
        this.f0J = r22;
        switch (r22) {
            case 2:
                this.f1K = (C0953f) q3.b(C0953f.class);
                return;
            default:
                C0948a c0948a = (C0948a) q3.b(C0948a.class);
                if (c0948a == null) {
                    this.f1K = null;
                    return;
                } else {
                    this.f1K = c0948a.f6562a;
                    return;
                }
        }
    }

    public a(int r22) {
        this.f0J = r22;
        switch (r22) {
            case 9:
                this.f1K = new C1.j();
                return;
            case 19:
                return;
            case 25:
                this.f1K = new C0077d(new Object());
                return;
            case 26:
                this.f1K = new androidx.lifecycle.z();
                new HashMap();
                return;
            default:
                this.f1K = (z.m) AbstractC0957j.f6565a.b(z.m.class);
                return;
        }
    }

    public a(p pVar) {
        this.f0J = 23;
        this.f1K = (F2.g) pVar;
    }

    public a(Context context, Uri uri) {
        this.f0J = 29;
        this.f1K = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void q0(Throwable th) {
    }
}
