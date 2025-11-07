package io.flutter.view;

import A0.C0001b;
import android.view.accessibility.AccessibilityManager;
import d2.C0235c;
import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes.dex */
public final class c implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f3671a;

    public c(q qVar) {
        this.f3671a = qVar;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z3) {
        q qVar = this.f3671a;
        if (qVar.f3758t) {
            return;
        }
        boolean z4 = false;
        C0001b c0001b = qVar.f3741b;
        if (z3) {
            b bVar = qVar.f3759u;
            c0001b.f86M = bVar;
            ((FlutterJNI) c0001b.f84K).setAccessibilityDelegate(bVar);
            ((FlutterJNI) c0001b.f84K).setSemanticsEnabled(true);
        } else {
            qVar.h(false);
            c0001b.f86M = null;
            ((FlutterJNI) c0001b.f84K).setAccessibilityDelegate(null);
            ((FlutterJNI) c0001b.f84K).setSemanticsEnabled(false);
        }
        C0235c c0235c = qVar.f3756r;
        if (c0235c != null) {
            boolean isTouchExplorationEnabled = qVar.f3742c.isTouchExplorationEnabled();
            h2.t tVar = (h2.t) c0235c.f3003K;
            if (!tVar.f3362Q.f3421b.f3498a.getIsSoftwareRenderingEnabled()) {
                if (!z3 && !isTouchExplorationEnabled) {
                    z4 = true;
                }
                tVar.setWillNotDraw(z4);
                return;
            }
            tVar.setWillNotDraw(false);
        }
    }
}
