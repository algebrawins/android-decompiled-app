package R;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends Q1.e {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1106d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1107e;

    public /* synthetic */ a(int r12, Object obj) {
        this.f1106d = r12;
        this.f1107e = obj;
    }

    @Override // Q1.e
    public final void b() {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((b) this.f1107e).clear();
                return;
            default:
                ((c) this.f1107e).clear();
                return;
        }
    }

    @Override // Q1.e
    public final Object c(int r22, int r3) {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((b) this.f1107e).f1148K[(r22 << 1) + r3];
            default:
                return ((c) this.f1107e).f1116K[r22];
        }
    }

    @Override // Q1.e
    public final Map d() {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return (b) this.f1107e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // Q1.e
    public final int e() {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((b) this.f1107e).f1149L;
            default:
                return ((c) this.f1107e).f1117L;
        }
    }

    @Override // Q1.e
    public final int f(Object obj) {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((b) this.f1107e).d(obj);
            default:
                return ((c) this.f1107e).indexOf(obj);
        }
    }

    @Override // Q1.e
    public final int g(Object obj) {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((b) this.f1107e).f(obj);
            default:
                return ((c) this.f1107e).indexOf(obj);
        }
    }

    @Override // Q1.e
    public final void h(Object obj, Object obj2) {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((b) this.f1107e).put(obj, obj2);
                return;
            default:
                ((c) this.f1107e).add(obj);
                return;
        }
    }

    @Override // Q1.e
    public final void i(int r22) {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((b) this.f1107e).h(r22);
                return;
            default:
                ((c) this.f1107e).k(r22);
                return;
        }
    }

    @Override // Q1.e
    public final Object j(int r3, Object obj) {
        switch (this.f1106d) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                int r32 = (r3 << 1) + 1;
                Object[] objArr = ((b) this.f1107e).f1148K;
                Object obj2 = objArr[r32];
                objArr[r32] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}
