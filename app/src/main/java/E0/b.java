package E0;

import android.graphics.drawable.Drawable;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class b implements Drawable.Callback {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f523J = 1;

    /* renamed from: K  reason: collision with root package name */
    public Object f524K;

    public /* synthetic */ b() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f523J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((e) this.f524K).invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f523J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((e) this.f524K).scheduleSelf(runnable, j3);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f524K;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                    return;
                }
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f523J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((e) this.f524K).unscheduleSelf(runnable);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.f524K;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public b(e eVar) {
        this.f524K = eVar;
    }

    private final void a(Drawable drawable) {
    }
}
