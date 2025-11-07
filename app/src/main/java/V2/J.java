package V2;

/* loaded from: classes.dex */
public abstract class J extends AbstractC0061s {

    /* renamed from: O  reason: collision with root package name */
    public static final /* synthetic */ int f1397O = 0;

    /* renamed from: L  reason: collision with root package name */
    public long f1398L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f1399M;

    /* renamed from: N  reason: collision with root package name */
    public C2.g f1400N;

    public final void m(boolean z3) {
        long j3;
        long j4 = this.f1398L;
        if (z3) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        long j5 = j4 - j3;
        this.f1398L = j5;
        if (j5 <= 0 && this.f1399M) {
            shutdown();
        }
    }

    public abstract Thread o();

    public final void p(boolean z3) {
        long j3;
        long j4 = this.f1398L;
        if (z3) {
            j3 = 4294967296L;
        } else {
            j3 = 1;
        }
        this.f1398L = j3 + j4;
        if (!z3) {
            this.f1399M = true;
        }
    }

    public abstract long q();

    public final boolean r() {
        Object removeFirst;
        C2.g gVar = this.f1400N;
        if (gVar == null) {
            return false;
        }
        if (gVar.isEmpty()) {
            removeFirst = null;
        } else {
            removeFirst = gVar.removeFirst();
        }
        C c4 = (C) removeFirst;
        if (c4 == null) {
            return false;
        }
        c4.run();
        return true;
    }

    public abstract void shutdown();
}
