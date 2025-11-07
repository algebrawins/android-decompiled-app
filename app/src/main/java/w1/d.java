package W1;

import F1.t;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements F1.d {

    /* renamed from: K  reason: collision with root package name */
    public static final /* synthetic */ d f1504K = new d(0);

    /* renamed from: L  reason: collision with root package name */
    public static final /* synthetic */ d f1505L = new d(1);

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f1506J;

    public /* synthetic */ d(int r12) {
        this.f1506J = r12;
    }

    @Override // F1.d
    public final Object a(t tVar) {
        switch (this.f1506J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new f((Q1.g) tVar.a(Q1.g.class));
            default:
                return new e((f) tVar.a(f.class), (Q1.d) tVar.a(Q1.d.class), (Q1.g) tVar.a(Q1.g.class));
        }
    }
}
