package a3;

import a.AbstractC0069a;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f1885a = 0;

    static {
        Object a4;
        Object a5;
        Exception exc = new Exception();
        String simpleName = AbstractC0069a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a4 = F2.b.class.getCanonicalName();
        } catch (Throwable th) {
            a4 = P1.a.a(th);
        }
        if (B2.e.a(a4) != null) {
            a4 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) a4;
        try {
            a5 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            a5 = P1.a.a(th2);
        }
        if (B2.e.a(a5) != null) {
            a5 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) a5;
    }
}
