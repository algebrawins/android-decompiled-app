package a2;

import A0.C0001b;
import h2.J;
import i2.d;
import n2.InterfaceC0394a;
import q2.n;
import r2.f;
import r2.g;
import r2.h;
import r2.m;

/* renamed from: a2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0073a implements InterfaceC0394a, m, h, o2.a {

    /* renamed from: J  reason: collision with root package name */
    public C0001b f1836J;

    /* renamed from: K  reason: collision with root package name */
    public C0001b f1837K;

    /* renamed from: L  reason: collision with root package name */
    public g f1838L;

    /* renamed from: M  reason: collision with root package name */
    public d f1839M;

    /* renamed from: N  reason: collision with root package name */
    public String f1840N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f1841O = false;

    /* renamed from: P  reason: collision with root package name */
    public String f1842P;

    @Override // o2.a
    public final void a(d dVar) {
        this.f1839M = dVar;
        dVar.f3445e.add(this);
        j(dVar.f3441a.getIntent());
    }

    @Override // r2.h
    public final void b(g gVar) {
        String str;
        this.f1838L = gVar;
        if (!this.f1841O && (str = this.f1840N) != null) {
            this.f1841O = true;
            gVar.a(str);
        }
    }

    @Override // o2.a
    public final void c(d dVar) {
        this.f1839M = dVar;
        dVar.f3445e.add(this);
    }

    @Override // o2.a
    public final void d() {
        d dVar = this.f1839M;
        if (dVar != null) {
            dVar.f3445e.remove(this);
        }
        this.f1839M = null;
    }

    @Override // r2.h
    public final void e() {
        this.f1838L = null;
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        this.f1836J.U(null);
        this.f1837K.V(null);
    }

    @Override // o2.a
    public final void g() {
        d();
    }

    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        C0001b c0001b2 = new C0001b((f) c0001b.f84K, "com.llfbandit.app_links/messages", 26);
        this.f1836J = c0001b2;
        c0001b2.U(this);
        C0001b c0001b3 = new C0001b((f) c0001b.f84K, "com.llfbandit.app_links/events", 25);
        this.f1837K = c0001b3;
        c0001b3.V(this);
    }

    @Override // r2.m
    public final void i(J j3, n nVar) {
        if (((String) j3.f3303K).equals("getLatestLink")) {
            nVar.c(this.f1842P);
        } else if (((String) j3.f3303K).equals("getInitialLink")) {
            nVar.c(this.f1840N);
        } else {
            nVar.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(android.content.Intent r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r8.toString()
            java.lang.String r2 = "com.llfbandit.app_links"
            android.util.Log.d(r2, r1)
            int r1 = r8.getFlags()
            r3 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r3
            if (r1 != r3) goto L17
            return r0
        L17:
            java.lang.String r1 = "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA"
            byte[] r1 = r8.getByteArrayExtra(r1)
            r3 = 0
            if (r1 == 0) goto L54
            int r4 = r1.length
            if (r4 != 0) goto L24
            goto L54
        L24:
            android.os.Parcel r4 = android.os.Parcel.obtain()
            int r5 = r1.length
            r4.unmarshall(r1, r0, r5)
            r4.setDataPosition(r0)
            int r1 = r4.readInt()
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r1 & r5
            if (r6 == r5) goto L40
            int r1 = r1 >> 16
            r5 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r5
            goto L44
        L40:
            int r1 = r4.readInt()
        L44:
            if (r1 != 0) goto L47
            goto L54
        L47:
            int r5 = r4.dataPosition()
            java.lang.String r6 = r4.readString()
            int r5 = r5 + r1
            r4.setDataPosition(r5)
            goto L55
        L54:
            r6 = r3
        L55:
            if (r6 == 0) goto L61
            java.lang.String r8 = "handleIntent: (Data) (short deep link)"
            java.lang.String r8 = r8.concat(r6)
            android.util.Log.d(r2, r8)
            goto L9e
        L61:
            java.lang.String r1 = r8.getAction()
            java.lang.String r4 = "android.intent.action.SEND"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L9d
            java.lang.String r4 = "android.intent.action.SEND_MULTIPLE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L9d
            java.lang.String r4 = "android.intent.action.SENDTO"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L7e
            goto L9d
        L7e:
            java.lang.String r3 = r8.getDataString()
            if (r3 == 0) goto L9d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r4 = "Handled intent: action: "
            r8.<init>(r4)
            r8.append(r1)
            java.lang.String r1 = " / data: "
            r8.append(r1)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r2, r8)
        L9d:
            r6 = r3
        L9e:
            if (r6 != 0) goto La1
            return r0
        La1:
            java.lang.String r8 = r7.f1840N
            if (r8 != 0) goto La7
            r7.f1840N = r6
        La7:
            r7.f1842P = r6
            r2.g r8 = r7.f1838L
            r0 = 1
            if (r8 == 0) goto Lb3
            r7.f1841O = r0
            r8.a(r6)
        Lb3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.C0073a.j(android.content.Intent):boolean");
    }
}
