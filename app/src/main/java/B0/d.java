package B0;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f179a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f180b;

    /* renamed from: c  reason: collision with root package name */
    public Object f181c;

    /* renamed from: d  reason: collision with root package name */
    public Object f182d;

    public Bundle a(String str) {
        if (this.f180b) {
            Bundle bundle = (Bundle) this.f182d;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.f182d;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.f182d;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.f182d = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }
}
