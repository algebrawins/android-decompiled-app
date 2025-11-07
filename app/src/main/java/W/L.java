package w;

import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements S.j {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ Q f5056J;

    public void a() {
        Q q3 = this.f5056J;
        synchronized (q3.f5060a) {
            try {
                if (q3.f5070l == O.OPENED) {
                    q3.h(q3.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S.j
    public Object a0(S.i iVar) {
        boolean z3;
        String str;
        Q q3 = this.f5056J;
        synchronized (q3.f5060a) {
            if (q3.f5072n == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0624h4.f("Release completer expected to be null", z3);
            q3.f5072n = iVar;
            str = "Release[session=" + q3 + "]";
        }
        return str;
    }
}
