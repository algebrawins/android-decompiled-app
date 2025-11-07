package N0;

import M2.l;
import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class d extends N2.h implements l {

    /* renamed from: K  reason: collision with root package name */
    public static final d f961K = new N2.h(1);

    @Override // M2.l
    /* renamed from: b */
    public final Boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        N2.g.e(sidecarDisplayFeature, "$this$require");
        boolean z3 = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
