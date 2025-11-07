package S;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Object f1187a;

    /* renamed from: b  reason: collision with root package name */
    public l f1188b;

    /* renamed from: c  reason: collision with root package name */
    public m f1189c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1190d;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            r4.f1190d = r0
            S.l r1 = r4.f1188b
            r2 = 0
            if (r1 == 0) goto L1d
            S.k r1 = r1.f1193K
            r1.getClass()
            if (r5 != 0) goto L11
            java.lang.Object r5 = S.h.f1183P
        L11:
            x1.r0 r3 = S.h.f1182O
            boolean r5 = r3.b(r1, r2, r5)
            if (r5 == 0) goto L1d
            S.h.c(r1)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L26
            r4.f1187a = r2
            r4.f1188b = r2
            r4.f1189c = r2
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S.i.a(java.lang.Object):boolean");
    }

    public final boolean b(Throwable th) {
        boolean z3 = true;
        this.f1190d = true;
        l lVar = this.f1188b;
        z3 = (lVar == null || !lVar.f1193K.i(th)) ? false : false;
        if (z3) {
            this.f1187a = null;
            this.f1188b = null;
            this.f1189c = null;
        }
        return z3;
    }

    public final void finalize() {
        m mVar;
        l lVar = this.f1188b;
        if (lVar != null) {
            k kVar = lVar.f1193K;
            if (!kVar.isDone()) {
                kVar.i(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1187a, 1));
            }
        }
        if (!this.f1190d && (mVar = this.f1189c) != null) {
            mVar.j(null);
        }
    }
}
