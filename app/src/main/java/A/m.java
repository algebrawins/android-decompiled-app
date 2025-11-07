package A;

import A0.Q;
import android.hardware.camera2.CameraDevice;
import h2.AbstractActivityC0292d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.d0;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;
import y.v;
import z.C0954g;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f25a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f27c;

    /* renamed from: d  reason: collision with root package name */
    public Object f28d;

    /* renamed from: e  reason: collision with root package name */
    public Object f29e;

    /* renamed from: f  reason: collision with root package name */
    public Object f30f;

    public m(Q q3) {
        this.f27c = new Object();
        this.f30f = new l(0, this);
        boolean a4 = q3.a(C0954g.class);
        this.f25a = a4;
        if (a4) {
            this.f28d = AbstractC0699s0.a(new k(0, this));
        } else {
            this.f28d = H.h.f701L;
        }
    }

    public static H.d a(CameraDevice cameraDevice, v vVar, List list, ArrayList arrayList, k kVar) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((d0) it.next()).k());
        }
        H.d b3 = H.d.b(new H.j(new ArrayList(arrayList2), false, AbstractC0636k0.a()));
        j jVar = new j(kVar, cameraDevice, vVar, list);
        G.a a4 = AbstractC0636k0.a();
        b3.getClass();
        return H.f.f(b3, jVar, a4);
    }

    public m(AbstractActivityC0292d abstractActivityC0292d) {
        this.f25a = true;
        this.f26b = false;
        this.f27c = abstractActivityC0292d;
    }
}
