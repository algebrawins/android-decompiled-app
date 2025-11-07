package r;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Iterator;

/* renamed from: r.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0437b extends AbstractC0440e implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public C0438c f4856J;

    /* renamed from: K  reason: collision with root package name */
    public C0438c f4857K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ int f4858L;

    public C0437b(C0438c c0438c, C0438c c0438c2, int r3) {
        this.f4858L = r3;
        this.f4856J = c0438c2;
        this.f4857K = c0438c;
    }

    @Override // r.AbstractC0440e
    public final void a(C0438c c0438c) {
        C0438c c0438c2;
        C0438c c0438c3 = null;
        if (this.f4856J == c0438c && c0438c == this.f4857K) {
            this.f4857K = null;
            this.f4856J = null;
        }
        C0438c c0438c4 = this.f4856J;
        if (c0438c4 == c0438c) {
            switch (this.f4858L) {
                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                    c0438c2 = c0438c4.f4862M;
                    break;
                default:
                    c0438c2 = c0438c4.f4861L;
                    break;
            }
            this.f4856J = c0438c2;
        }
        C0438c c0438c5 = this.f4857K;
        if (c0438c5 == c0438c) {
            C0438c c0438c6 = this.f4856J;
            if (c0438c5 != c0438c6 && c0438c6 != null) {
                c0438c3 = b(c0438c5);
            }
            this.f4857K = c0438c3;
        }
    }

    public final C0438c b(C0438c c0438c) {
        switch (this.f4858L) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return c0438c.f4861L;
            default:
                return c0438c.f4862M;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4857K != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0438c c0438c;
        C0438c c0438c2 = this.f4857K;
        C0438c c0438c3 = this.f4856J;
        if (c0438c2 != c0438c3 && c0438c3 != null) {
            c0438c = b(c0438c2);
        } else {
            c0438c = null;
        }
        this.f4857K = c0438c;
        return c0438c2;
    }
}
