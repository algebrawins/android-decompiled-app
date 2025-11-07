package c3;

import V2.AbstractC0066x;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: L  reason: collision with root package name */
    public final Runnable f2694L;

    public l(Runnable runnable, long j3, k kVar) {
        super(j3, kVar);
        this.f2694L = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2694L.run();
        } finally {
            this.f2692K.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f2694L;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0066x.b(runnable));
        sb.append(", ");
        sb.append(this.f2691J);
        sb.append(", ");
        sb.append(this.f2692K);
        sb.append(']');
        return sb.toString();
    }
}
