package x2;

import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: x2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0770i extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0771j f6161a;

    public C0770i(C0771j c0771j) {
        this.f6161a = c0771j;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        this.f6161a.f6162a.f3668L.loadUrl(webResourceRequest.getUrl().toString());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f6161a.f6162a.f3668L.loadUrl(str);
        return true;
    }
}
