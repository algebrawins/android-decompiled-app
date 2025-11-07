package s2;

import A0.C0001b;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import d2.C0235c;
import h2.AbstractActivityC0292d;
import h2.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: s2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454a {

    /* renamed from: a  reason: collision with root package name */
    public final J f4973a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractActivityC0292d f4974b;

    public C0454a(AbstractActivityC0292d abstractActivityC0292d, J j3) {
        C0235c c0235c = new C0235c(25, this);
        this.f4974b = abstractActivityC0292d;
        this.f4973a = j3;
        j3.f3304L = c0235c;
    }

    public static Locale a(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int r4 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = "";
        } else {
            str2 = split[1];
            r4 = 2;
        }
        if (split.length > r4 && split[r4].length() >= 2 && split[r4].length() <= 3) {
            str4 = split[r4];
        }
        return new Locale(str3, str4, str2);
    }

    public final void b(Configuration configuration) {
        LocaleList locales;
        int size;
        Locale locale;
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = configuration.getLocales();
            size = locales.size();
            for (int r22 = 0; r22 < size; r22++) {
                locale = locales.get(r22);
                arrayList.add(locale);
            }
        } else {
            arrayList.add(configuration.locale);
        }
        J j3 = this.f4973a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            locale2.getLanguage();
            locale2.getCountry();
            locale2.getVariant();
            arrayList2.add(locale2.getLanguage());
            arrayList2.add(locale2.getCountry());
            arrayList2.add(locale2.getScript());
            arrayList2.add(locale2.getVariant());
        }
        ((C0001b) j3.f3303K).M("setLocale", arrayList2, null);
    }
}
