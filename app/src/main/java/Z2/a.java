package Z2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: J  reason: collision with root package name */
    public final transient Y2.e f1772J;

    public a(Y2.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f1772J = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
