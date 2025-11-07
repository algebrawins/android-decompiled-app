package r;

import java.util.Iterator;

/* renamed from: r.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0439d extends AbstractC0440e implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public C0438c f4863J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f4864K = true;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ C0441f f4865L;

    public C0439d(C0441f c0441f) {
        this.f4865L = c0441f;
    }

    @Override // r.AbstractC0440e
    public final void a(C0438c c0438c) {
        boolean z3;
        C0438c c0438c2 = this.f4863J;
        if (c0438c == c0438c2) {
            C0438c c0438c3 = c0438c2.f4862M;
            this.f4863J = c0438c3;
            if (c0438c3 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f4864K = z3;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4864K) {
            if (this.f4865L.f4866J == null) {
                return false;
            }
            return true;
        }
        C0438c c0438c = this.f4863J;
        if (c0438c == null || c0438c.f4861L == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0438c c0438c;
        if (this.f4864K) {
            this.f4864K = false;
            this.f4863J = this.f4865L.f4866J;
        } else {
            C0438c c0438c2 = this.f4863J;
            if (c0438c2 != null) {
                c0438c = c0438c2.f4861L;
            } else {
                c0438c = null;
            }
            this.f4863J = c0438c;
        }
        return this.f4863J;
    }
}
