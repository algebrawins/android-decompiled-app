package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import y1.C0819f;

/* loaded from: classes.dex */
public final class W implements H1.g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5788a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5789b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5790c = false;

    /* renamed from: d  reason: collision with root package name */
    public H1.c f5791d;

    /* renamed from: e  reason: collision with root package name */
    public final H1.e f5792e;

    public /* synthetic */ W(H1.e eVar, int r22) {
        this.f5788a = r22;
        this.f5792e = eVar;
    }

    @Override // H1.g
    public final H1.g a(String str) {
        switch (this.f5788a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (!this.f5789b) {
                    this.f5789b = true;
                    ((U) this.f5792e).a(this.f5791d, str, this.f5790c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f5789b) {
                    this.f5789b = true;
                    ((C0819f) this.f5792e).a(this.f5791d, str, this.f5790c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }

    @Override // H1.g
    public final H1.g b(boolean z3) {
        switch (this.f5788a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (!this.f5789b) {
                    this.f5789b = true;
                    ((U) this.f5792e).b(this.f5791d, z3 ? 1 : 0, this.f5790c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
            default:
                if (!this.f5789b) {
                    this.f5789b = true;
                    ((C0819f) this.f5792e).b(this.f5791d, z3 ? 1 : 0, this.f5790c);
                    return this;
                }
                throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
        }
    }
}
