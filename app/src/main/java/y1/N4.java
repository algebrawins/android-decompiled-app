package y1;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import x1.C0727v4;

/* loaded from: classes.dex */
public final class N4 implements M4 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6269a;

    public N4(Context context, L4 l4) {
        ArrayList arrayList = new ArrayList();
        this.f6269a = arrayList;
        l4.getClass();
        arrayList.add(new P4(context, l4));
    }

    @Override // y1.M4
    public final void a(C0727v4 c0727v4) {
        Iterator it = this.f6269a.iterator();
        while (it.hasNext()) {
            ((M4) it.next()).a(c0727v4);
        }
    }
}
