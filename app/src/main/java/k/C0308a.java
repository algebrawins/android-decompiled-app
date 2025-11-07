package k;

import android.graphics.drawable.Animatable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import x1.AbstractC0759z4;

/* renamed from: k.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308a extends AbstractC0759z4 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3895a;

    /* renamed from: b  reason: collision with root package name */
    public final Animatable f3896b;

    public /* synthetic */ C0308a(Animatable animatable, int r22) {
        this.f3895a = r22;
        this.f3896b = animatable;
    }

    @Override // x1.AbstractC0759z4
    public final void c() {
        switch (this.f3895a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f3896b.start();
                return;
            default:
                ((E0.e) this.f3896b).start();
                return;
        }
    }

    @Override // x1.AbstractC0759z4
    public final void d() {
        switch (this.f3895a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f3896b.stop();
                return;
            default:
                ((E0.e) this.f3896b).stop();
                return;
        }
    }
}
