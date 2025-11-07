package androidx.lifecycle;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0132e implements p {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f2457J = 0;

    /* renamed from: K  reason: collision with root package name */
    public final q f2458K;

    /* renamed from: L  reason: collision with root package name */
    public final Object f2459L;

    public C0132e(DefaultLifecycleObserver defaultLifecycleObserver, p pVar) {
        N2.g.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f2458K = defaultLifecycleObserver;
        this.f2459L = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void h(r rVar, EnumC0137k enumC0137k) {
        switch (this.f2457J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                int r02 = AbstractC0131d.f2456a[enumC0137k.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f2458K;
                switch (r02) {
                    case 1:
                        defaultLifecycleObserver.f(rVar);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(rVar);
                        break;
                    case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                        defaultLifecycleObserver.onResume(rVar);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(rVar);
                        break;
                    case q0.k.STRING_FIELD_NUMBER /* 5 */:
                        defaultLifecycleObserver.onStop(rVar);
                        break;
                    case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                        defaultLifecycleObserver.onDestroy(rVar);
                        break;
                    case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                p pVar = (p) this.f2459L;
                if (pVar != null) {
                    pVar.h(rVar, enumC0137k);
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0128a) this.f2459L).f2449a;
                q qVar = this.f2458K;
                C0128a.a((List) hashMap.get(enumC0137k), rVar, enumC0137k, qVar);
                C0128a.a((List) hashMap.get(EnumC0137k.ON_ANY), rVar, enumC0137k, qVar);
                return;
        }
    }

    public C0132e(q qVar) {
        this.f2458K = qVar;
        C0130c c0130c = C0130c.f2453c;
        Class<?> cls = qVar.getClass();
        C0128a c0128a = (C0128a) c0130c.f2454a.get(cls);
        this.f2459L = c0128a == null ? c0130c.a(cls, null) : c0128a;
    }
}
