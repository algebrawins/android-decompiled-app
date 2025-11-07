package Z1;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0180e0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import x1.E0;
import x1.T3;

/* loaded from: classes.dex */
public final class h implements InterfaceC0180e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final h f1766b = new h(0);

    /* renamed from: c  reason: collision with root package name */
    public static final h f1767c = new h(1);

    /* renamed from: d  reason: collision with root package name */
    public static final h f1768d = new h(2);

    /* renamed from: e  reason: collision with root package name */
    public static final h f1769e = new h(3);

    /* renamed from: f  reason: collision with root package name */
    public static final h f1770f = new h(4);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1771a;

    public /* synthetic */ h(int r12) {
        this.f1771a = r12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC0180e0
    public final boolean a(int r3) {
        switch (this.f1771a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (r3 == 0 || r3 == 1 || r3 == 2) {
                    return true;
                }
                return false;
            case 1:
                if (r3 == 0 || r3 == 1 || r3 == 2 || r3 == 3) {
                    return true;
                }
                return false;
            case 2:
                if (E0.a(r3) != 0) {
                    return true;
                }
                return false;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                if (T3.a(r3) != 0) {
                    return true;
                }
                return false;
            default:
                if (r3 == 0 || r3 == 1 || r3 == 2) {
                    return true;
                }
                return false;
        }
    }
}
