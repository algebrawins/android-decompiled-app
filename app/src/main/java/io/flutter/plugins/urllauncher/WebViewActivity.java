package io.flutter.plugins.urllauncher;

import W.b;
import W.d;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import x2.C0768g;
import x2.C0769h;
import x2.C0771j;

/* loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* renamed from: N  reason: collision with root package name */
    public static final /* synthetic */ int f3665N = 0;

    /* renamed from: L  reason: collision with root package name */
    public WebView f3668L;

    /* renamed from: J  reason: collision with root package name */
    public final C0768g f3666J = new C0768g(this);

    /* renamed from: K  reason: collision with root package name */
    public final C0769h f3667K = new WebViewClient();

    /* renamed from: M  reason: collision with root package name */
    public final IntentFilter f3669M = new IntentFilter("close action");

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        Map<String, String> map;
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f3668L = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        Bundle bundleExtra = intent.getBundleExtra("com.android.browser.headers");
        if (bundleExtra == null) {
            map = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String str : bundleExtra.keySet()) {
                hashMap.put(str, bundleExtra.getString(str));
            }
            map = hashMap;
        }
        this.f3668L.loadUrl(stringExtra, map);
        this.f3668L.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f3668L.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f3668L.setWebViewClient(this.f3667K);
        this.f3668L.getSettings().setSupportMultipleWindows(true);
        this.f3668L.setWebChromeClient(new C0771j(this));
        IntentFilter intentFilter = this.f3669M;
        int r8 = Build.VERSION.SDK_INT;
        BroadcastReceiver broadcastReceiver = this.f3666J;
        if (r8 >= 33) {
            d.a(this, broadcastReceiver, intentFilter, null, null, 2);
        } else if (r8 >= 26) {
            b.a(this, broadcastReceiver, intentFilter, null, null, 2);
        } else {
            registerReceiver(broadcastReceiver, intentFilter, null, null);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f3666J);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r22, KeyEvent keyEvent) {
        if (r22 == 4 && this.f3668L.canGoBack()) {
            this.f3668L.goBack();
            return true;
        }
        return super.onKeyDown(r22, keyEvent);
    }
}
