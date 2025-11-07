package r2;

import android.util.Log;
import h2.J;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class s implements n {

    /* renamed from: a  reason: collision with root package name */
    public static final s f4896a;

    /* JADX WARN: Type inference failed for: r0v0, types: [r2.s, java.lang.Object] */
    static {
        r rVar = r.f4893a;
        f4896a = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, r2.q] */
    @Override // r2.n
    public final ByteBuffer a(Object obj) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(0);
        r.f4893a.k(byteArrayOutputStream, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // r2.n
    public final J b(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        r rVar = r.f4893a;
        Object e4 = rVar.e(byteBuffer);
        Object e5 = rVar.e(byteBuffer);
        if ((e4 instanceof String) && !byteBuffer.hasRemaining()) {
            return new J((String) e4, e5, 17, false);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 == 1) goto L8;
     */
    @Override // r2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L46
            goto L1e
        L11:
            r2.r r0 = r2.r.f4893a
            java.lang.Object r0 = r0.e(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            r2.r r0 = r2.r.f4893a
            java.lang.Object r1 = r0.e(r5)
            java.lang.Object r2 = r0.e(r5)
            java.lang.Object r0 = r0.e(r5)
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L46
            if (r2 == 0) goto L36
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L46
        L36:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L46
            r2.i r5 = new r2.i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r5.<init>(r1, r2, r0)
            throw r5
        L46:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: r2.s.c(java.nio.ByteBuffer):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.ByteArrayOutputStream, r2.q] */
    @Override // r2.n
    public final ByteBuffer d(J j3) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        r rVar = r.f4893a;
        rVar.k(byteArrayOutputStream, (String) j3.f3303K);
        rVar.k(byteArrayOutputStream, j3.f3304L);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, r2.q] */
    @Override // r2.n
    public final ByteBuffer e(String str, String str2) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        r rVar = r.f4893a;
        rVar.k(byteArrayOutputStream, "error");
        rVar.k(byteArrayOutputStream, str);
        byteArrayOutputStream.write(0);
        rVar.k(byteArrayOutputStream, str2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, r2.q] */
    @Override // r2.n
    public final ByteBuffer f(String str, String str2, Object obj) {
        ?? byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        r rVar = r.f4893a;
        rVar.k(byteArrayOutputStream, str);
        rVar.k(byteArrayOutputStream, str2);
        if (obj instanceof Throwable) {
            rVar.k(byteArrayOutputStream, Log.getStackTraceString((Throwable) obj));
        } else {
            rVar.k(byteArrayOutputStream, obj);
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
        allocateDirect.put(byteArrayOutputStream.a(), 0, byteArrayOutputStream.size());
        return allocateDirect;
    }
}
