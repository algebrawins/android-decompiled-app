package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class m0 implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f2390J;

    /* renamed from: K  reason: collision with root package name */
    public int f2391K = -1;

    /* renamed from: L  reason: collision with root package name */
    public boolean f2392L;

    /* renamed from: M  reason: collision with root package name */
    public Iterator f2393M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f2394N;

    public /* synthetic */ m0(AbstractMap abstractMap, int r22) {
        this.f2390J = r22;
        this.f2394N = abstractMap;
    }

    public Iterator a() {
        if (this.f2393M == null) {
            this.f2393M = ((k0) this.f2394N).f2378K.entrySet().iterator();
        }
        return this.f2393M;
    }

    public Iterator b() {
        if (this.f2393M == null) {
            this.f2393M = ((P0) this.f2394N).f2837L.entrySet().iterator();
        }
        return this.f2393M;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f2390J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                int r02 = this.f2391K + 1;
                k0 k0Var = (k0) this.f2394N;
                if (r02 < k0Var.f2377J.size()) {
                    return true;
                }
                if (!k0Var.f2378K.isEmpty() && a().hasNext()) {
                    return true;
                }
                return false;
            default:
                boolean z3 = true;
                int r03 = this.f2391K + 1;
                P0 p02 = (P0) this.f2394N;
                if (r03 >= p02.f2836K.size()) {
                    if (!p02.f2837L.isEmpty()) {
                        if (!b().hasNext()) {
                            return false;
                        }
                    } else {
                        z3 = false;
                    }
                }
                return z3;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2390J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f2392L = true;
                int r12 = this.f2391K + 1;
                this.f2391K = r12;
                k0 k0Var = (k0) this.f2394N;
                if (r12 < k0Var.f2377J.size()) {
                    return (Map.Entry) k0Var.f2377J.get(this.f2391K);
                }
                return (Map.Entry) a().next();
            default:
                this.f2392L = true;
                int r13 = this.f2391K + 1;
                this.f2391K = r13;
                P0 p02 = (P0) this.f2394N;
                if (r13 < p02.f2836K.size()) {
                    return (Map.Entry) p02.f2836K.get(this.f2391K);
                }
                return (Map.Entry) b().next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f2394N;
        switch (this.f2390J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (this.f2392L) {
                    this.f2392L = false;
                    int r02 = k0.f2376O;
                    k0 k0Var = (k0) abstractMap;
                    k0Var.b();
                    if (this.f2391K < k0Var.f2377J.size()) {
                        int r03 = this.f2391K;
                        this.f2391K = r03 - 1;
                        k0Var.h(r03);
                        return;
                    }
                    a().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
            default:
                if (this.f2392L) {
                    this.f2392L = false;
                    int r04 = P0.f2834P;
                    P0 p02 = (P0) abstractMap;
                    p02.h();
                    if (this.f2391K < p02.f2836K.size()) {
                        int r05 = this.f2391K;
                        this.f2391K = r05 - 1;
                        p02.f(r05);
                        return;
                    }
                    b().remove();
                    return;
                }
                throw new IllegalStateException("remove() was called before next()");
        }
    }
}
