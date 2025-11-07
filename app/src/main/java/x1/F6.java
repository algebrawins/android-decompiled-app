package x1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class F6 implements E6 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5557a;

    public F6(Context context, D6 d6) {
        ArrayList arrayList = new ArrayList();
        this.f5557a = arrayList;
        d6.getClass();
        arrayList.add(new L6(context, d6));
    }

    @Override // x1.E6
    public final void a(U1.h hVar) {
        Iterator it = this.f5557a.iterator();
        while (it.hasNext()) {
            ((E6) it.next()).a(hVar);
        }
    }
}
