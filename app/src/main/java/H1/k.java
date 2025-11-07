package h1;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.zzy;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import k1.L;
import s1.InterfaceC0453b;

/* loaded from: classes.dex */
public abstract class k extends zzy {

    /* renamed from: l  reason: collision with root package name */
    public final int f3273l;

    public k(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        if (bArr.length == 25) {
            this.f3273l = Arrays.hashCode(bArr);
            return;
        }
        throw new IllegalArgumentException();
    }

    public static byte[] Q(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    public abstract byte[] Y();

    @Override // k1.L
    public final int b() {
        return this.f3273l;
    }

    public final boolean equals(Object obj) {
        InterfaceC0453b h3;
        if (obj != null && (obj instanceof L)) {
            try {
                L l3 = (L) obj;
                if (l3.b() != this.f3273l || (h3 = l3.h()) == null) {
                    return false;
                }
                return Arrays.equals(Y(), (byte[]) ObjectWrapper.unwrap(h3));
            } catch (RemoteException e4) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e4);
            }
        }
        return false;
    }

    @Override // k1.L
    public final InterfaceC0453b h() {
        return ObjectWrapper.wrap(Y());
    }

    public final int hashCode() {
        return this.f3273l;
    }
}
