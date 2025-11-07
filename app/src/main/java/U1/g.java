package U1;

import android.util.Log;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f1338a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1339b;

    public /* synthetic */ g(String str, String str2, boolean z3) {
        this.f1338a = str;
        this.f1339b = str2;
    }

    public void a(String str, String str2, Exception exc) {
        if (Log.isLoggable(this.f1338a, 6)) {
            Log.e(str, b(str2), exc);
        }
    }

    public String b(String str) {
        String str2 = this.f1339b;
        if (str2 == null) {
            return str;
        }
        return str2.concat(str);
    }

    public g(String str, String str2) {
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            this.f1338a = str;
            if (str2 == null || str2.length() <= 0) {
                this.f1339b = null;
                return;
            } else {
                this.f1339b = str2;
                return;
            }
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }
}
