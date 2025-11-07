package N0;

import M2.l;
import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class c extends N2.h implements l {

    /* renamed from: K  reason: collision with root package name */
    public static final c f960K = new N2.h(1);

    @Override // M2.l
    /* renamed from: b */
    public final Boolean h(SidecarDisplayFeature sidecarDisplayFeature) {
        boolean z3;
        N2.g.e(sidecarDisplayFeature, "$this$require");
        if (sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }
}
