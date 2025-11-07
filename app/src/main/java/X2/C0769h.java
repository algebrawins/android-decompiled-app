package x2;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: x2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769h extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webView.loadUrl(webResourceRequest.getUrl().toString());
        return false;
    }
}
