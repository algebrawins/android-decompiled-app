package r2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class t implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f4897a = Charset.forName("UTF8");

    /* renamed from: b  reason: collision with root package name */
    public static final t f4898b = new Object();

    public static String c(ByteBuffer byteBuffer) {
        byte[] bArr;
        int r4;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            r4 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            r4 = 0;
        }
        return new String(bArr, r4, remaining, f4897a);
    }

    public static ByteBuffer d(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f4897a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }

    @Override // r2.l
    public final /* bridge */ /* synthetic */ Object a(ByteBuffer byteBuffer) {
        return c(byteBuffer);
    }

    @Override // r2.l
    public final /* bridge */ /* synthetic */ ByteBuffer b(Object obj) {
        return d((String) obj);
    }
}
