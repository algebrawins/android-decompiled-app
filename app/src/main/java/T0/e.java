package t0;

import A0.AbstractC0017t;
import A0.C0001b;
import A0.RunnableC0004e;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.I;
import androidx.lifecycle.l;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C0322i;
import r.C0437b;
import r.C0438c;
import r.C0441f;

/* loaded from: classes.dex */
public abstract class e implements ComponentCallbacks, View.OnCreateContextMenuListener, r, B0.f {

    /* renamed from: X  reason: collision with root package name */
    public static final Object f4982X = new Object();

    /* renamed from: N  reason: collision with root package name */
    public boolean f4987N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f4988O;

    /* renamed from: R  reason: collision with root package name */
    public C0001b f4991R;

    /* renamed from: S  reason: collision with root package name */
    public final l f4992S;

    /* renamed from: T  reason: collision with root package name */
    public t f4993T;

    /* renamed from: U  reason: collision with root package name */
    public B0.e f4994U;

    /* renamed from: V  reason: collision with root package name */
    public final ArrayList f4995V;

    /* renamed from: W  reason: collision with root package name */
    public final C0322i f4996W;

    /* renamed from: J  reason: collision with root package name */
    public final int f4983J = -1;

    /* renamed from: K  reason: collision with root package name */
    public final String f4984K = UUID.randomUUID().toString();

    /* renamed from: L  reason: collision with root package name */
    public final String f4985L = null;

    /* renamed from: M  reason: collision with root package name */
    public final C0001b f4986M = new C0001b(28);

    /* renamed from: P  reason: collision with root package name */
    public boolean f4989P = true;

    /* renamed from: Q  reason: collision with root package name */
    public boolean f4990Q = true;

    /* JADX WARN: Type inference failed for: r1v14, types: [androidx.lifecycle.r, java.lang.Object] */
    public e() {
        Object obj;
        I r22;
        t b3;
        new RunnableC0004e(20, this);
        this.f4992S = l.RESUMED;
        new z();
        new AtomicInteger();
        this.f4995V = new ArrayList();
        this.f4996W = new C0322i(18, this);
        this.f4993T = new t(this);
        this.f4994U = new B0.e(this);
        ArrayList arrayList = this.f4995V;
        C0322i c0322i = this.f4996W;
        if (!arrayList.contains(c0322i)) {
            if (this.f4983J >= 0) {
                e eVar = (e) c0322i.f3983K;
                eVar.f4994U.e();
                l lVar = eVar.f4993T.f2467c;
                if (lVar != l.INITIALIZED && lVar != l.CREATED) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                B0.d dVar = (B0.d) eVar.f4994U.f185L;
                dVar.getClass();
                Iterator it = ((C0441f) dVar.f181c).iterator();
                while (true) {
                    C0437b c0437b = (C0437b) it;
                    obj = null;
                    if (c0437b.hasNext()) {
                        Map.Entry entry = (Map.Entry) c0437b.next();
                        N2.g.d(entry, "components");
                        r22 = (I) entry.getValue();
                        if (N2.g.a((String) entry.getKey(), "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                            break;
                        }
                    } else {
                        r22 = null;
                        break;
                    }
                }
                if (r22 == null) {
                    I r12 = new I((B0.d) eVar.f4994U.f185L, eVar);
                    C0441f c0441f = (C0441f) ((B0.d) eVar.f4994U.f185L).f181c;
                    C0438c e4 = c0441f.e("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (e4 != null) {
                        obj = e4.f4860K;
                    } else {
                        C0438c c0438c = new C0438c("androidx.lifecycle.internal.SavedStateHandlesProvider", r12);
                        c0441f.f4869M++;
                        C0438c c0438c2 = c0441f.f4867K;
                        if (c0438c2 == null) {
                            c0441f.f4866J = c0438c;
                            c0441f.f4867K = c0438c;
                        } else {
                            c0438c2.f4861L = c0438c;
                            c0438c.f4862M = c0438c2;
                            c0441f.f4867K = c0438c;
                        }
                    }
                    if (((I) obj) == null) {
                        eVar.f4993T.a(new B0.a(2, r12));
                    } else {
                        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                    }
                }
                B0.e eVar2 = eVar.f4994U;
                if (!eVar2.f184K) {
                    eVar2.e();
                }
                if (!eVar2.f183J.b().f2467c.a(l.STARTED)) {
                    B0.d dVar2 = (B0.d) eVar2.f185L;
                    if (dVar2.f179a) {
                        if (!dVar2.f180b) {
                            dVar2.f182d = null;
                            dVar2.f180b = true;
                            return;
                        }
                        throw new IllegalStateException("SavedStateRegistry was already restored.");
                    }
                    throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
                }
                throw new IllegalStateException(("performRestore cannot be called when owner is " + b3.f2467c).toString());
            }
            arrayList.add(c0322i);
        }
    }

    @Override // B0.f
    public final B0.d a() {
        return (B0.d) this.f4994U.f185L;
    }

    @Override // androidx.lifecycle.r
    public final t b() {
        return this.f4993T;
    }

    public final AbstractC0017t c() {
        e();
        throw null;
    }

    public final C0001b d() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final void e() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((int) RecognitionOptions.ITF);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f4984K);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
