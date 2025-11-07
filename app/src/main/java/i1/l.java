package i1;

import h1.C0283c;

/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: J  reason: collision with root package name */
    public final C0283c f3416J;

    public l(C0283c c0283c) {
        this.f3416J = c0283c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f3416J));
    }
}
