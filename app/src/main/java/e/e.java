package E;

import A.f;
import D.A;
import D.C;
import D.InterfaceC0044z;
import D.N;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import x1.AbstractC0612g0;
import x1.AbstractC0636k0;

/* loaded from: classes.dex */
public final class e implements InterfaceC0044z {

    /* renamed from: K  reason: collision with root package name */
    public c f510K;

    /* renamed from: L  reason: collision with root package name */
    public final ArrayList f511L;

    /* renamed from: J  reason: collision with root package name */
    public final ArrayDeque f509J = new ArrayDeque();

    /* renamed from: M  reason: collision with root package name */
    public boolean f512M = false;

    public e(R1.a aVar) {
        AbstractC0612g0.a();
        this.f511L = new ArrayList();
    }

    @Override // D.InterfaceC0044z
    public final void a(A a4) {
        AbstractC0636k0.d().execute(new N(2, this));
    }

    public final void b() {
        AbstractC0612g0.a();
        new Exception("Camera is closed.", null);
        ArrayDeque arrayDeque = this.f509J;
        Iterator it = arrayDeque.iterator();
        if (!it.hasNext()) {
            arrayDeque.clear();
            Iterator it2 = new ArrayList(this.f511L).iterator();
            if (!it2.hasNext()) {
                return;
            }
            C.G(it2.next());
            throw null;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final void c() {
        AbstractC0612g0.a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (this.f512M) {
            Log.d("TakePictureManager", "The class is paused.");
            return;
        }
        c cVar = this.f510K;
        cVar.getClass();
        AbstractC0612g0.a();
        if (((f) cVar.f503L).r() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
        } else if (this.f509J.poll() == null) {
            Log.d("TakePictureManager", "No new request.");
        } else {
            throw new ClassCastException();
        }
    }
}
