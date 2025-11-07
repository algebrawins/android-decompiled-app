package C2;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class b implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f254J;

    /* renamed from: K  reason: collision with root package name */
    public int f255K;

    /* renamed from: L  reason: collision with root package name */
    public final Object f256L;

    public /* synthetic */ b(int r12, Object obj) {
        this.f254J = r12;
        this.f256L = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f254J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (this.f255K < ((e) this.f256L).e()) {
                    return true;
                }
                return false;
            default:
                if (this.f255K < ((Object[]) this.f256L).length) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f254J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (hasNext()) {
                    int r02 = this.f255K;
                    this.f255K = r02 + 1;
                    return ((e) this.f256L).get(r02);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int r12 = this.f255K;
                    this.f255K = r12 + 1;
                    return ((Object[]) this.f256L)[r12];
                } catch (ArrayIndexOutOfBoundsException e4) {
                    this.f255K--;
                    throw new NoSuchElementException(e4.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f254J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
