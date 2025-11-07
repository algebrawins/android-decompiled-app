package w1;

/* renamed from: w1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f5288a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5289b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5290c;

    public C0520e(Object obj, Object obj2, Object obj3) {
        this.f5288a = obj;
        this.f5289b = obj2;
        this.f5290c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f5288a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f5289b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f5290c);
        return new IllegalArgumentException("Multiple entries with same key: " + valueOf + "=" + valueOf2 + " and " + valueOf3 + "=" + valueOf4);
    }
}
