package a3;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: J  reason: collision with root package name */
    public final transient D2.i f1855J;

    public g(D2.i iVar) {
        this.f1855J = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1855J.toString();
    }
}
