package x2;

import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* renamed from: x2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0771j extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f6162a;

    public C0771j(WebViewActivity webViewActivity) {
        this.f6162a = webViewActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z3, boolean z4, Message message) {
        C0770i c0770i = new C0770i(this);
        WebView webView2 = new WebView(this.f6162a.f3668L.getContext());
        webView2.setWebViewClient(c0770i);
        ((WebView.WebViewTransport) message.obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }
}
