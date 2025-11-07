package b0;

import D.C;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: b0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143e implements InterfaceC0144f {

    /* renamed from: b  reason: collision with root package name */
    public static final Locale[] f2602b = new Locale[0];

    /* renamed from: a  reason: collision with root package name */
    public final Locale[] f2603a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        int r12 = C0142d.f2600b;
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public C0143e(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f2603a = f2602b;
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int r3 = 0; r3 < localeArr.length; r3++) {
            Locale locale = localeArr[r3];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    locale2.getLanguage();
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        locale2.getCountry();
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(C.v(r3, "list[", "] is null"));
            }
        }
        this.f2603a = (Locale[]) arrayList.toArray(new Locale[0]);
    }

    @Override // b0.InterfaceC0144f
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0143e)) {
            return false;
        }
        Locale[] localeArr = ((C0143e) obj).f2603a;
        Locale[] localeArr2 = this.f2603a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int r3 = 0; r3 < localeArr2.length; r3++) {
            if (!localeArr2[r3].equals(localeArr[r3])) {
                return false;
            }
        }
        return true;
    }

    @Override // b0.InterfaceC0144f
    public final Locale get(int r3) {
        if (r3 >= 0) {
            Locale[] localeArr = this.f2603a;
            if (r3 < localeArr.length) {
                return localeArr[r3];
            }
        }
        return null;
    }

    public final int hashCode() {
        int r22 = 1;
        for (Locale locale : this.f2603a) {
            r22 = (r22 * 31) + locale.hashCode();
        }
        return r22;
    }

    @Override // b0.InterfaceC0144f
    public final int size() {
        return this.f2603a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int r12 = 0;
        while (true) {
            Locale[] localeArr = this.f2603a;
            if (r12 < localeArr.length) {
                sb.append(localeArr[r12]);
                if (r12 < localeArr.length - 1) {
                    sb.append(',');
                }
                r12++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
