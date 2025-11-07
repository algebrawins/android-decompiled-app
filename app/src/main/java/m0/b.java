package M0;

import B2.i;
import M2.l;
import N2.g;
import androidx.window.extensions.layout.WindowLayoutInfo;

/* loaded from: classes.dex */
public final /* synthetic */ class b extends N2.f implements l {
    public b(f fVar) {
        super(1, fVar, f.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    @Override // M2.l
    public final Object h(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        g.e(windowLayoutInfo, "p0");
        ((f) this.f989K).accept(windowLayoutInfo);
        return i.f210a;
    }
}
