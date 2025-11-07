package N2;

/* loaded from: classes.dex */
public final class j extends k implements S2.c, M2.l {
    @Override // N2.b
    public final S2.a b() {
        p.f1008a.getClass();
        return this;
    }

    public final void f() {
        if (!this.f1003P) {
            S2.a e4 = e();
            if (e4 != this) {
                ((j) ((S2.c) e4)).f();
                return;
            }
            throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    @Override // M2.l
    public final Object h(Object obj) {
        f();
        throw null;
    }
}
