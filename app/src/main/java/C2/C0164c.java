package c2;

import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import w2.C0532b;

/* renamed from: c2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0164c implements M2.a {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f2659J;

    public /* synthetic */ C0164c(int r12) {
        this.f2659J = r12;
    }

    @Override // M2.a
    public final Object a() {
        int r02;
        switch (this.f2659J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (Build.VERSION.SDK_INT >= 23) {
                    r02 = 33554432;
                } else {
                    r02 = 0;
                }
                return Integer.valueOf(r02);
            default:
                return new C0532b(1);
        }
    }
}
