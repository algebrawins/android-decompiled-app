package dev.fluttercommunity.plus.share;

import N2.g;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* loaded from: classes.dex */
public final class SharePlusPendingIntent extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static String f3085a = "";

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        Object parcelableExtra;
        g.e(context, "context");
        g.e(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT", ComponentName.class);
            componentName = (ComponentName) parcelableExtra;
        } else {
            componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        }
        if (componentName != null) {
            f3085a = componentName.flattenToString();
        }
    }
}
