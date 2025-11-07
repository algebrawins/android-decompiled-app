package b0;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: b0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0139a {
    public static LocaleList a(Configuration configuration) {
        return configuration.getLocales();
    }

    public static void b(Configuration configuration, C0142d c0142d) {
        configuration.setLocales((LocaleList) c0142d.f2601a.a());
    }
}
