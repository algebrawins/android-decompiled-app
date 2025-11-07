package J1;

import H1.f;
import H1.g;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final b f791b = new b(0);

    /* renamed from: c  reason: collision with root package name */
    public static final b f792c = new b(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f793a;

    public /* synthetic */ b(int r12) {
        this.f793a = r12;
    }

    @Override // H1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f793a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                c cVar = d.f795e;
                ((g) obj2).a((String) obj);
                return;
            default:
                c cVar2 = d.f795e;
                ((g) obj2).b(((Boolean) obj).booleanValue());
                return;
        }
    }
}
