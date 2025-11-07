package S;

/* loaded from: classes.dex */
public final class k extends h {

    /* renamed from: Q  reason: collision with root package name */
    public final /* synthetic */ l f1191Q;

    public k(l lVar) {
        this.f1191Q = lVar;
    }

    @Override // S.h
    public final String g() {
        i iVar = (i) this.f1191Q.f1192J.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f1187a + "]";
    }
}
