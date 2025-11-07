package x2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* renamed from: x2.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0768g extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f6160a;

    public C0768g(WebViewActivity webViewActivity) {
        this.f6160a = webViewActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("close action".equals(intent.getAction())) {
            this.f6160a.finish();
        }
    }
}
