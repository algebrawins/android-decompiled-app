package V2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class T extends CancellationException {

    /* renamed from: J  reason: collision with root package name */
    public final transient b0 f1408J;

    public T(String str, Throwable th, b0 b0Var) {
        super(str);
        this.f1408J = b0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof T) {
                T t3 = (T) obj;
                if (!N2.g.a(t3.getMessage(), getMessage()) || !N2.g.a(t3.f1408J, this.f1408J) || !N2.g.a(t3.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int r02;
        String message = getMessage();
        N2.g.b(message);
        int hashCode = (this.f1408J.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            r02 = cause.hashCode();
        } else {
            r02 = 0;
        }
        return hashCode + r02;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1408J;
    }
}
