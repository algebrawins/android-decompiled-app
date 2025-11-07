package x1;

import java.util.Map;

/* renamed from: x1.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0714u extends AbstractC0667o {

    /* renamed from: J  reason: collision with root package name */
    public final Object f6097J;

    /* renamed from: K  reason: collision with root package name */
    public int f6098K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ C0730w f6099L;

    public C0714u(C0730w c0730w, int r22) {
        this.f6099L = c0730w;
        Object[] objArr = c0730w.f6116L;
        objArr.getClass();
        this.f6097J = objArr[r22];
        this.f6098K = r22;
    }

    public final void a() {
        int r02 = this.f6098K;
        Object obj = this.f6097J;
        C0730w c0730w = this.f6099L;
        if (r02 != -1 && r02 < c0730w.size()) {
            int r03 = this.f6098K;
            Object[] objArr = c0730w.f6116L;
            objArr.getClass();
            if (AbstractC0617g5.a(obj, objArr[r03])) {
                return;
            }
        }
        Object obj2 = C0730w.f6113S;
        this.f6098K = c0730w.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6097J;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0730w c0730w = this.f6099L;
        Map a4 = c0730w.a();
        if (a4 != null) {
            return a4.get(this.f6097J);
        }
        a();
        int r12 = this.f6098K;
        if (r12 == -1) {
            return null;
        }
        Object[] objArr = c0730w.f6117M;
        objArr.getClass();
        return objArr[r12];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0730w c0730w = this.f6099L;
        Map a4 = c0730w.a();
        Object obj2 = this.f6097J;
        if (a4 != null) {
            return a4.put(obj2, obj);
        }
        a();
        int r12 = this.f6098K;
        if (r12 == -1) {
            c0730w.put(obj2, obj);
            return null;
        }
        Object[] objArr = c0730w.f6117M;
        objArr.getClass();
        Object obj3 = objArr[r12];
        objArr[r12] = obj;
        return obj3;
    }
}
