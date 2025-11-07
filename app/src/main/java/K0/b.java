package K0;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: L  reason: collision with root package name */
    public static final b f814L = new b("NONE", 0);

    /* renamed from: M  reason: collision with root package name */
    public static final b f815M = new b("FULL", 0);

    /* renamed from: N  reason: collision with root package name */
    public static final b f816N = new b("FLAT", 1);

    /* renamed from: O  reason: collision with root package name */
    public static final b f817O = new b("HALF_OPENED", 1);

    /* renamed from: P  reason: collision with root package name */
    public static final b f818P = new b("FOLD", 2);

    /* renamed from: Q  reason: collision with root package name */
    public static final b f819Q = new b("HINGE", 2);

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f820J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f821K;

    public /* synthetic */ b(String str, int r22) {
        this.f820J = r22;
        this.f821K = str;
    }

    public String toString() {
        switch (this.f820J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return (String) this.f821K;
            case 1:
                return (String) this.f821K;
            case 2:
                return (String) this.f821K;
            default:
                return super.toString();
        }
    }

    public b(L0.a aVar) {
        this.f820J = 3;
        int r02 = q.f849b;
        this.f821K = aVar;
    }
}
