package W;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class d {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int r5) {
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, r5);
    }
}
