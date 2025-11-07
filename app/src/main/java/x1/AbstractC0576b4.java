package x1;

import android.content.res.Configuration;
import android.os.Build;
import b0.AbstractC0139a;
import b0.AbstractC0141c;
import b0.C0142d;
import b0.C0143e;
import java.util.Locale;

/* renamed from: x1.b4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0576b4 {
    public static C0142d a(Configuration configuration) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 24) {
            return new C0142d(new b0.g(AbstractC0139a.a(configuration)));
        }
        Locale[] localeArr = {configuration.locale};
        if (r02 >= 24) {
            int r4 = C0142d.f2600b;
            return new C0142d(new b0.g(AbstractC0141c.a(localeArr)));
        }
        return new C0142d(new C0143e(localeArr));
    }
}
