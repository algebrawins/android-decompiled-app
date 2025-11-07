package V2;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: V2.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059p extends N2.h implements M2.p {

    /* renamed from: L  reason: collision with root package name */
    public static final C0059p f1454L = new C0059p(2, 0);

    /* renamed from: M  reason: collision with root package name */
    public static final C0059p f1455M = new C0059p(2, 1);

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f1456K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0059p(int r12, int r22) {
        super(r12);
        this.f1456K = r22;
    }

    @Override // M2.p
    public final Object g(Object obj, Object obj2) {
        switch (this.f1456K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((D2.i) obj).k((D2.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                D2.g gVar = (D2.g) obj2;
                return bool;
            default:
                return ((D2.i) obj).k((D2.g) obj2);
        }
    }
}
