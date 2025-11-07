package d3;

import a3.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class j extends u {

    /* renamed from: N  reason: collision with root package name */
    public final AtomicReferenceArray f3084N;

    public j(long j3, j jVar, int r4) {
        super(j3, jVar, r4);
        this.f3084N = new AtomicReferenceArray(i.f3083f);
    }

    @Override // a3.u
    public final int f() {
        return i.f3083f;
    }

    @Override // a3.u
    public final void g(int r22, D2.i iVar) {
        this.f3084N.set(r22, i.f3082e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1884L + ", hashCode=" + hashCode() + ']';
    }
}
