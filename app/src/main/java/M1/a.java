package M1;

import k1.w;

/* loaded from: classes.dex */
public final class a extends Exception {

    /* renamed from: J  reason: collision with root package name */
    public final int f871J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int r3) {
        super(str);
        w.d(str, "Provided message must not be empty.");
        this.f871J = r3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, Exception exc) {
        super(str, exc);
        w.d(str, "Provided message must not be empty.");
        this.f871J = 13;
    }
}
