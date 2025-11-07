package Q1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import h1.C0283c;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements i1.j {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f1102J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0283c[] f1103K;

    public /* synthetic */ s(C0283c[] c0283cArr, int r22) {
        this.f1102J = r22;
        this.f1103K = c0283cArr;
    }

    @Override // i1.j
    public final C0283c[] a() {
        C0283c[] c0283cArr = this.f1103K;
        switch (this.f1102J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0283c[] c0283cArr2 = i.f1077a;
                return c0283cArr;
            default:
                C0283c[] c0283cArr3 = i.f1077a;
                return c0283cArr;
        }
    }
}
