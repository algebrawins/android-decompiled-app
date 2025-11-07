package Q1;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public final class b implements C1.d, F1.d {

    /* renamed from: K  reason: collision with root package name */
    public static final /* synthetic */ b f1060K = new b(1);

    /* renamed from: L  reason: collision with root package name */
    public static final /* synthetic */ b f1061L = new b(2);

    /* renamed from: M  reason: collision with root package name */
    public static final /* synthetic */ b f1062M = new b(3);

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f1063J;

    public /* synthetic */ b(int r12) {
        this.f1063J = r12;
    }

    @Override // F1.d
    public Object a(F1.t tVar) {
        return new j((Context) tVar.a(Context.class));
    }

    @Override // C1.d
    public void q(Exception exc) {
        switch (this.f1063J) {
            case 1:
                Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                return;
            default:
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
                return;
        }
    }
}
