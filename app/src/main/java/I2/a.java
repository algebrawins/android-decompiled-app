package i2;

import android.util.SparseArray;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f3417a;

    public a(c cVar) {
        this.f3417a = cVar;
    }

    @Override // i2.b
    public final void a() {
        c cVar = this.f3417a;
        Iterator it = cVar.f3438t.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a();
        }
        while (true) {
            io.flutter.plugin.platform.j jVar = cVar.f3436r;
            SparseArray sparseArray = jVar.f3585j;
            if (sparseArray.size() <= 0) {
                break;
            }
            jVar.f3595t.z(sparseArray.keyAt(0));
        }
        while (true) {
            io.flutter.plugin.platform.i iVar = cVar.f3437s;
            SparseArray sparseArray2 = iVar.g;
            if (sparseArray2.size() > 0) {
                iVar.f3576m.l(sparseArray2.keyAt(0));
            } else {
                cVar.f3429k.f4826b = null;
                return;
            }
        }
    }

    @Override // i2.b
    public final void b() {
    }
}
