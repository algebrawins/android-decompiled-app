package D2;

import M2.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: J  reason: collision with root package name */
    public static final j f492J = new Object();

    @Override // D2.i
    public final g f(h hVar) {
        N2.g.e(hVar, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // D2.i
    public final i k(i iVar) {
        N2.g.e(iVar, "context");
        return iVar;
    }

    @Override // D2.i
    public final i n(h hVar) {
        N2.g.e(hVar, "key");
        return this;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // D2.i
    public final Object j(Object obj, p pVar) {
        return obj;
    }
}
