package h1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.util.Log;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public final class i extends HandlerC0477e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3268a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0284d f3269b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(h1.C0284d r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f3269b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto Ld
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L11
        Ld:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L11:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f3268a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.i.<init>(h1.d, android.content.Context):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int r6 = message.what;
        if (r6 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + r6);
            return;
        }
        int r62 = C0285e.f3261a;
        C0284d c0284d = this.f3269b;
        Context context = this.f3268a;
        int c4 = c0284d.c(context, r62);
        int r3 = AbstractC0286f.f3265c;
        if (c4 != 1 && c4 != 2 && c4 != 3 && c4 != 9) {
            return;
        }
        Intent b3 = c0284d.b(c4, context, "n");
        if (b3 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, b3, v1.b.f5046a | 134217728);
        }
        c0284d.g(context, c4, activity);
    }
}
