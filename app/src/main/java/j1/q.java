package j1;

import A0.RunnableC0004e;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import h2.J;

/* loaded from: classes.dex */
public final class q extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f3836a;

    /* renamed from: b  reason: collision with root package name */
    public final J f3837b;

    public q(J j3) {
        this.f3837b = j3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if (!"com.google.android.gms".equals(str)) {
            return;
        }
        ((RunnableC0004e) this.f3837b.f3304L).getClass();
        throw null;
    }
}
