package b0;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class g implements InterfaceC0144f {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f2604a;

    public g(Object obj) {
        this.f2604a = O0.a.h(obj);
    }

    @Override // b0.InterfaceC0144f
    public final Object a() {
        return this.f2604a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f2604a.equals(((InterfaceC0144f) obj).a());
        return equals;
    }

    @Override // b0.InterfaceC0144f
    public final Locale get(int r22) {
        Locale locale;
        locale = this.f2604a.get(r22);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f2604a.hashCode();
        return hashCode;
    }

    @Override // b0.InterfaceC0144f
    public final int size() {
        int size;
        size = this.f2604a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f2604a.toString();
        return localeList;
    }
}
