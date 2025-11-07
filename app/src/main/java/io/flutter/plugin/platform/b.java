package io.flutter.plugin.platform;

import android.view.MotionEvent;
import h2.C0299l;

/* loaded from: classes.dex */
public final class b extends C0299l {

    /* renamed from: P  reason: collision with root package name */
    public a f3559P;

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        boolean d4;
        a aVar = this.f3559P;
        if (aVar != null) {
            io.flutter.view.q qVar = aVar.f3558a;
            if (qVar == null) {
                d4 = false;
            } else {
                d4 = qVar.d(motionEvent, true);
            }
            if (d4) {
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }
}
