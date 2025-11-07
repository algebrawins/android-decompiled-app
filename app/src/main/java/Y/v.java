package y;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w.C0490F;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final u f6193a;

    public v(ArrayList arrayList, G.l lVar, C0490F c0490f) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f6193a = new t(arrayList, lVar, c0490f);
        } else {
            this.f6193a = new s(arrayList, lVar, c0490f);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(O0.a.e(((C0780i) it.next()).f6170a.c()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        return this.f6193a.equals(((v) obj).f6193a);
    }

    public final int hashCode() {
        return this.f6193a.hashCode();
    }
}
