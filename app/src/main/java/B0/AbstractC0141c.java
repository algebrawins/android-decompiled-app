package b0;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: b0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0141c {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static LocaleList b() {
        return LocaleList.getAdjustedDefault();
    }

    public static LocaleList c() {
        return LocaleList.getDefault();
    }
}
