package p;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a  reason: collision with root package name */
    public int f4571a;

    /* renamed from: b  reason: collision with root package name */
    public int f4572b;

    /* renamed from: c  reason: collision with root package name */
    public int f4573c;

    /* renamed from: d  reason: collision with root package name */
    public int f4574d;

    /* renamed from: e  reason: collision with root package name */
    public int f4575e;

    /* renamed from: f  reason: collision with root package name */
    public int f4576f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4577h;

    public final void a(int r3, int r4) {
        this.f4573c = r3;
        this.f4574d = r4;
        this.f4577h = true;
        if (this.g) {
            if (r4 != Integer.MIN_VALUE) {
                this.f4571a = r4;
            }
            if (r3 != Integer.MIN_VALUE) {
                this.f4572b = r3;
                return;
            }
            return;
        }
        if (r3 != Integer.MIN_VALUE) {
            this.f4571a = r3;
        }
        if (r4 != Integer.MIN_VALUE) {
            this.f4572b = r4;
        }
    }
}
