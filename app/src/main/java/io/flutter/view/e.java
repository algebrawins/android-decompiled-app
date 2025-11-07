package io.flutter.view;

import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.barhopper.RecognitionOptions;
import d2.C0235c;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AccessibilityManager f3673a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f3674b;

    public e(q qVar, AccessibilityManager accessibilityManager) {
        this.f3674b = qVar;
        this.f3673a = accessibilityManager;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z3) {
        q qVar = this.f3674b;
        if (qVar.f3758t) {
            return;
        }
        boolean z4 = false;
        if (!z3) {
            qVar.h(false);
            l lVar = qVar.f3752n;
            if (lVar != null) {
                qVar.f(lVar.f3709b, RecognitionOptions.QR_CODE);
                qVar.f3752n = null;
            }
        }
        C0235c c0235c = qVar.f3756r;
        if (c0235c != null) {
            boolean isEnabled = this.f3673a.isEnabled();
            h2.t tVar = (h2.t) c0235c.f3003K;
            if (!tVar.f3362Q.f3421b.f3498a.getIsSoftwareRenderingEnabled()) {
                if (!isEnabled && !z3) {
                    z4 = true;
                }
                tVar.setWillNotDraw(z4);
                return;
            }
            tVar.setWillNotDraw(false);
        }
    }
}
