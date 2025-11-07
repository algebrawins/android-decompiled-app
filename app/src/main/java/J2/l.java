package j2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f3894a;

    public l() {
        Handler handler;
        Looper mainLooper = Looper.getMainLooper();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = Handler.createAsync(mainLooper);
        } else {
            handler = new Handler(mainLooper);
        }
        this.f3894a = handler;
    }

    @Override // j2.e
    public final void a(c cVar) {
        this.f3894a.post(cVar);
    }
}
