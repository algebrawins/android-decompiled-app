package io.flutter.view;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.Settings;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class d extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f3672a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, Handler handler) {
        super(handler);
        this.f3672a = qVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3, Uri uri) {
        q qVar = this.f3672a;
        if (qVar.f3758t) {
            return;
        }
        if (Settings.Global.getFloat(qVar.f3745f, "transition_animation_scale", 1.0f) == 0.0f) {
            qVar.f3749k = g.DISABLE_ANIMATIONS.value | qVar.f3749k;
        } else {
            qVar.f3749k = (~g.DISABLE_ANIMATIONS.value) & qVar.f3749k;
        }
        ((FlutterJNI) qVar.f3741b.f84K).setAccessibilityFeatures(qVar.f3749k);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        onChange(z3, null);
    }
}
