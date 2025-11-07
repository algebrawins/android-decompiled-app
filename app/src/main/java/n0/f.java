package N0;

import C2.q;
import K0.l;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final H0.k f963a;

    public f() {
        H0.k kVar = H0.k.QUIET;
        N2.g.e(kVar, "verificationMode");
        this.f963a = kVar;
    }

    public static boolean a(SidecarDeviceState sidecarDeviceState, SidecarDeviceState sidecarDeviceState2) {
        if (N2.g.a(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState != null && sidecarDeviceState2 != null && a.b(sidecarDeviceState) == a.b(sidecarDeviceState2)) {
            return true;
        }
        return false;
    }

    public static boolean b(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (N2.g.a(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return N2.g.a(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    public static boolean c(List list, List list2) {
        if (list == list2) {
            return true;
        }
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int r22 = 0; r22 < size; r22++) {
            if (!b((SidecarDisplayFeature) list.get(r22), (SidecarDisplayFeature) list2.get(r22))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (N2.g.a(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        return c(a.c(sidecarWindowLayoutInfo), a.c(sidecarWindowLayoutInfo2));
    }

    public final l e(SidecarWindowLayoutInfo sidecarWindowLayoutInfo, SidecarDeviceState sidecarDeviceState) {
        N2.g.e(sidecarDeviceState, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new l(q.f272J);
        }
        SidecarDeviceState sidecarDeviceState2 = new SidecarDeviceState();
        a.d(sidecarDeviceState2, a.b(sidecarDeviceState));
        return new l(f(a.c(sidecarWindowLayoutInfo), sidecarDeviceState2));
    }

    public final ArrayList f(List list, SidecarDeviceState sidecarDeviceState) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            K0.c g = g((SidecarDisplayFeature) it.next(), sidecarDeviceState);
            if (g != null) {
                arrayList.add(g);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r6 == 4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final K0.c g(androidx.window.sidecar.SidecarDisplayFeature r5, androidx.window.sidecar.SidecarDeviceState r6) {
        /*
            r4 = this;
            java.lang.String r0 = "feature"
            N2.g.e(r5, r0)
            H0.k r0 = r4.f963a
            H0.j r0 = H0.a.a(r5, r0)
            N0.b r1 = N0.b.f959K
            java.lang.String r2 = "Type must be either TYPE_FOLD or TYPE_HINGE"
            H0.i r0 = r0.d(r2, r1)
            N0.c r1 = N0.c.f960K
            java.lang.String r2 = "Feature bounds must not be 0"
            H0.i r0 = r0.d(r2, r1)
            N0.d r1 = N0.d.f961K
            java.lang.String r2 = "TYPE_FOLD must have 0 area"
            H0.i r0 = r0.d(r2, r1)
            N0.e r1 = N0.e.f962K
            java.lang.String r2 = "Feature be pinned to either left or top"
            H0.i r0 = r0.d(r2, r1)
            java.lang.Object r0 = r0.a()
            androidx.window.sidecar.SidecarDisplayFeature r0 = (androidx.window.sidecar.SidecarDisplayFeature) r0
            r1 = 0
            if (r0 != 0) goto L35
            return r1
        L35:
            int r0 = r0.getType()
            r2 = 2
            r3 = 1
            if (r0 == r3) goto L43
            if (r0 == r2) goto L40
            return r1
        L40:
            K0.b r0 = K0.b.f819Q
            goto L45
        L43:
            K0.b r0 = K0.b.f818P
        L45:
            int r6 = N0.a.b(r6)
            if (r6 == 0) goto L6e
            if (r6 == r3) goto L6e
            if (r6 == r2) goto L58
            K0.b r2 = K0.b.f816N
            r3 = 3
            if (r6 == r3) goto L5a
            r3 = 4
            if (r6 == r3) goto L6e
            goto L5a
        L58:
            K0.b r2 = K0.b.f817O
        L5a:
            K0.c r6 = new K0.c
            H0.b r1 = new H0.b
            android.graphics.Rect r5 = r5.getRect()
            java.lang.String r3 = "feature.rect"
            N2.g.d(r5, r3)
            r1.<init>(r5)
            r6.<init>(r1, r0, r2)
            return r6
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.f.g(androidx.window.sidecar.SidecarDisplayFeature, androidx.window.sidecar.SidecarDeviceState):K0.c");
    }
}
