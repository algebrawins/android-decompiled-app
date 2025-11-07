package F1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collections;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements L1.a {

    /* renamed from: b  reason: collision with root package name */
    public static final g f623b = new g(0);

    /* renamed from: c  reason: collision with root package name */
    public static final g f624c = new g(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f625a;

    public /* synthetic */ g(int r12) {
        this.f625a = r12;
    }

    @Override // L1.a
    public final Object get() {
        switch (this.f625a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return Collections.emptySet();
            default:
                return null;
        }
    }
}
