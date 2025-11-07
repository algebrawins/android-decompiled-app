package g0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: g0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f3228a;

    /* renamed from: b  reason: collision with root package name */
    public final h f3229b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3230c;

    public C0272a(int r12, h hVar, int r3) {
        this.f3228a = r12;
        this.f3229b = hVar;
        this.f3230c = r3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3228a);
        this.f3229b.f3238a.performAction(this.f3230c, bundle);
    }
}
