package y;

import D.C0042x;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import x1.AbstractC0624h4;

/* renamed from: y.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0774c implements InterfaceC0773b {

    /* renamed from: a  reason: collision with root package name */
    public final DynamicRangeProfiles f6165a;

    public C0774c(Object obj) {
        this.f6165a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            C0042x b3 = AbstractC0772a.b(longValue);
            AbstractC0624h4.e(b3, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(b3);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // y.InterfaceC0773b
    public final DynamicRangeProfiles a() {
        return this.f6165a;
    }

    @Override // y.InterfaceC0773b
    public final Set b(C0042x c0042x) {
        boolean z3;
        Long a4 = AbstractC0772a.a(c0042x, this.f6165a);
        if (a4 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.a("DynamicRange is not supported: " + c0042x, z3);
        return d(this.f6165a.getProfileCaptureRequestConstraints(a4.longValue()));
    }

    @Override // y.InterfaceC0773b
    public final Set c() {
        return d(this.f6165a.getSupportedProfiles());
    }
}
