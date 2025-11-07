package d2;

/* renamed from: d2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0240h implements C1.d {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ m f3018J;

    @Override // C1.d
    public void q(Exception exc) {
        n nVar = this.f3018J.f3029d;
        String localizedMessage = exc.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = exc.toString();
        }
        nVar.h(localizedMessage);
    }
}
