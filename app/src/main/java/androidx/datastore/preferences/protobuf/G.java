package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f2298a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f2299b;

    static {
        Charset.forName("US-ASCII");
        f2298a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f2299b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new i(bArr, 0, 0, false).e(0);
        } catch (I e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw new NullPointerException(str);
    }

    public static int b(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }
}
