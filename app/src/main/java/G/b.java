package G;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Random;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class b extends ThreadLocal {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f665a;

    public /* synthetic */ b(int r12) {
        this.f665a = r12;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f665a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return AbstractC0636k0.d();
                }
                if (Looper.myLooper() != null) {
                    return new e(new Handler(Looper.myLooper()));
                }
                return null;
            case 1:
                return new Random();
            default:
                return 0L;
        }
    }
}
