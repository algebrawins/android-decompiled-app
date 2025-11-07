package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class s0 extends u0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2414b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(Unsafe unsafe, int r22) {
        super(unsafe);
        this.f2414b = r22;
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean c(long j3, Object obj) {
        switch (this.f2414b) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (v0.g) {
                    return v0.b(j3, obj);
                }
                return v0.c(j3, obj);
            default:
                if (v0.g) {
                    return v0.b(j3, obj);
                }
                return v0.c(j3, obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final double d(long j3, Object obj) {
        switch (this.f2414b) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return Double.longBitsToDouble(g(j3, obj));
            default:
                return Double.longBitsToDouble(g(j3, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final float e(long j3, Object obj) {
        switch (this.f2414b) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return Float.intBitsToFloat(f(j3, obj));
            default:
                return Float.intBitsToFloat(f(j3, obj));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void j(Object obj, long j3, boolean z3) {
        switch (this.f2414b) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (v0.g) {
                    v0.k(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    v0.l(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (v0.g) {
                    v0.k(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    v0.l(obj, j3, z3 ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void k(Object obj, long j3, byte b3) {
        switch (this.f2414b) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (v0.g) {
                    v0.k(obj, j3, b3);
                    return;
                } else {
                    v0.l(obj, j3, b3);
                    return;
                }
            default:
                if (v0.g) {
                    v0.k(obj, j3, b3);
                    return;
                } else {
                    v0.l(obj, j3, b3);
                    return;
                }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void l(Object obj, long j3, double d4) {
        switch (this.f2414b) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                o(obj, j3, Double.doubleToLongBits(d4));
                return;
            default:
                o(obj, j3, Double.doubleToLongBits(d4));
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final void m(Object obj, long j3, float f2) {
        switch (this.f2414b) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                n(Float.floatToIntBits(f2), j3, obj);
                return;
            default:
                n(Float.floatToIntBits(f2), j3, obj);
                return;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.u0
    public final boolean r() {
        switch (this.f2414b) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return false;
            default:
                return false;
        }
    }
}
