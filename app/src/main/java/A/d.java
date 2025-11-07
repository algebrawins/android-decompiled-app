package A;

import A0.Q;
import androidx.camera.core.impl.D;
import java.util.ArrayList;
import java.util.Iterator;
import x1.X;
import z.C0944E;
import z.C0955h;
import z.z;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8c;

    public d(Q q3, Q q4) {
        this.f6a = q4.a(C0944E.class);
        this.f7b = q3.a(z.class);
        this.f8c = q3.a(C0955h.class);
    }

    public final void a(ArrayList arrayList) {
        if ((this.f6a || this.f7b || this.f8c) && arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((D) it.next()).a();
            }
            X.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
