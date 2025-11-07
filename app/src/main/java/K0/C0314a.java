package k0;

/* renamed from: k0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0314a {

    /* renamed from: a  reason: collision with root package name */
    public int f3956a;

    /* renamed from: b  reason: collision with root package name */
    public int f3957b;

    /* renamed from: c  reason: collision with root package name */
    public float f3958c;

    /* renamed from: d  reason: collision with root package name */
    public float f3959d;

    /* renamed from: e  reason: collision with root package name */
    public long f3960e;

    /* renamed from: f  reason: collision with root package name */
    public long f3961f;
    public long g;

    /* renamed from: h  reason: collision with root package name */
    public float f3962h;

    /* renamed from: i  reason: collision with root package name */
    public int f3963i;

    public final float a(long j3) {
        long j4 = this.f3960e;
        if (j3 < j4) {
            return 0.0f;
        }
        long j5 = this.g;
        if (j5 >= 0 && j3 >= j5) {
            float f2 = this.f3962h;
            return (View$OnTouchListenerC0319f.b(((float) (j3 - j5)) / this.f3963i, 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
        return View$OnTouchListenerC0319f.b(((float) (j3 - j4)) / this.f3956a, 0.0f, 1.0f) * 0.5f;
    }
}
