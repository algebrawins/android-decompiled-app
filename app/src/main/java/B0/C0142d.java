package b0;

import android.os.Build;
import java.util.Locale;

/* renamed from: b0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0142d {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2600b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0144f f2601a;

    static {
        Locale[] localeArr = new Locale[0];
        if (Build.VERSION.SDK_INT >= 24) {
            O0.a.h(AbstractC0141c.a(localeArr));
        } else {
            new C0143e(localeArr);
        }
    }

    public C0142d(InterfaceC0144f interfaceC0144f) {
        this.f2601a = interfaceC0144f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0142d) {
            if (this.f2601a.equals(((C0142d) obj).f2601a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2601a.hashCode();
    }

    public final String toString() {
        return this.f2601a.toString();
    }
}
