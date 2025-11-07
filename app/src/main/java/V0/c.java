package V0;

import A0.C0001b;
import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f1368a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f1369b;

    /* renamed from: c  reason: collision with root package name */
    public final S0.c f1370c;

    public c(String str, byte[] bArr, S0.c cVar) {
        this.f1368a = str;
        this.f1369b = bArr;
        this.f1370c = cVar;
    }

    public static C0001b a() {
        C0001b c0001b = new C0001b(8, false);
        S0.c cVar = S0.c.DEFAULT;
        if (cVar != null) {
            c0001b.f86M = cVar;
            return c0001b;
        }
        throw new NullPointerException("Null priority");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1368a.equals(cVar.f1368a) && Arrays.equals(this.f1369b, cVar.f1369b) && this.f1370c.equals(cVar.f1370c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f1368a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1369b)) * 1000003) ^ this.f1370c.hashCode();
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.f1369b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        return "TransportContext(" + this.f1368a + ", " + this.f1370c + ", " + encodeToString + ")";
    }
}
