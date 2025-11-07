package S;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class b extends Throwable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f1166J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int r22) {
        super(str);
        this.f1166J = r22;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f1166J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                a();
                return this;
            default:
                b();
                return this;
        }
    }
}
