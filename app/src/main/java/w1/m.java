package w1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class m implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5311J;

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5311J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
