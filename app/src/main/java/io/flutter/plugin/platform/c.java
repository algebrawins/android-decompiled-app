package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public final class c implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3560a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ B.a f3561b;

    public c(B.a aVar, View view) {
        this.f3561b = aVar;
        this.f3560a = view;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int r3) {
        this.f3560a.post(new io.flutter.plugins.imagepicker.d(this, r3, 2));
    }
}
