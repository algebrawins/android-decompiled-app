package k1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: e  reason: collision with root package name */
    public static final Uri f3996e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f3997a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3998b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3999c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4000d;

    public D(String str, boolean z3) {
        w.c(str);
        this.f3997a = str;
        w.c("com.google.android.gms");
        this.f3998b = "com.google.android.gms";
        this.f3999c = 4225;
        this.f4000d = z3;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        String str = this.f3997a;
        if (str != null) {
            if (this.f4000d) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    bundle = context.getContentResolver().call(f3996e, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e4) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
                }
            }
            if (intent == null) {
                return new Intent(str).setPackage(this.f3998b);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d4 = (D) obj;
        if (w.h(this.f3997a, d4.f3997a) && w.h(this.f3998b, d4.f3998b) && w.h(null, null) && this.f3999c == d4.f3999c && this.f4000d == d4.f4000d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3997a, this.f3998b, null, Integer.valueOf(this.f3999c), Boolean.valueOf(this.f4000d)});
    }

    public final String toString() {
        String str = this.f3997a;
        if (str != null) {
            return str;
        }
        w.e(null);
        throw null;
    }
}
