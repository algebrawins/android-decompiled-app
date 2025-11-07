package h2;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class C implements E {

    /* renamed from: J  reason: collision with root package name */
    public final r2.f f3285J;

    /* renamed from: K  reason: collision with root package name */
    public final HashMap f3286K = new HashMap();

    /* renamed from: L  reason: collision with root package name */
    public final HashMap f3287L;

    /* renamed from: M  reason: collision with root package name */
    public final c3.k f3288M;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [h2.G, java.lang.Object] */
    public C(r2.f fVar) {
        HashMap hashMap = new HashMap();
        this.f3287L = hashMap;
        this.f3288M = new c3.k();
        this.f3285J = fVar;
        N.o oVar = H.f3295a;
        ?? obj = new Object();
        obj.f3294a = false;
        Object[] objArr = new G[]{obj}[0];
        objArr.getClass();
        hashMap.put(4294967556L, objArr);
    }

    public final void a(y yVar, final E.d dVar) {
        r2.e eVar;
        int length;
        long j3;
        byte[] bArr = null;
        if (dVar == null) {
            eVar = null;
        } else {
            eVar = new r2.e() { // from class: h2.z
                @Override // r2.e
                public final void a(ByteBuffer byteBuffer) {
                    boolean z3;
                    Boolean bool = Boolean.FALSE;
                    if (byteBuffer != null) {
                        byteBuffer.rewind();
                        if (byteBuffer.capacity() != 0) {
                            if (byteBuffer.get() != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            bool = Boolean.valueOf(z3);
                        }
                    } else {
                        Log.w("KeyEmbedderResponder", "A null reply was received when sending a key event to the framework.");
                    }
                    E.d.this.a(bool.booleanValue());
                }
            };
        }
        try {
            String str = yVar.g;
            if (str != null) {
                bArr = str.getBytes("UTF-8");
            }
            if (bArr == null) {
                length = 0;
            } else {
                length = bArr.length;
            }
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 56);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(yVar.f3377a);
            allocateDirect.putLong(yVar.f3378b.a());
            allocateDirect.putLong(yVar.f3379c);
            allocateDirect.putLong(yVar.f3380d);
            if (yVar.f3381e) {
                j3 = 1;
            } else {
                j3 = 0;
            }
            allocateDirect.putLong(j3);
            allocateDirect.putLong(yVar.f3382f.a());
            if (bArr != null) {
                allocateDirect.put(bArr);
            }
            this.f3285J.i("flutter/keydata", allocateDirect, eVar);
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [h2.y, java.lang.Object] */
    public final void b(boolean z3, Long l3, Long l4, long j3) {
        x xVar;
        ?? obj = new Object();
        obj.f3377a = j3;
        if (z3) {
            xVar = x.kDown;
        } else {
            xVar = x.kUp;
        }
        obj.f3378b = xVar;
        obj.f3380d = l3.longValue();
        obj.f3379c = l4.longValue();
        obj.g = null;
        obj.f3381e = true;
        obj.f3382f = w.kKeyboard;
        if (l4.longValue() != 0 && l3.longValue() != 0) {
            if (!z3) {
                l3 = null;
            }
            c(l4, l3);
        }
        a(obj, null);
    }

    public final void c(Long l3, Long l4) {
        HashMap hashMap = this.f3286K;
        if (l4 != null) {
            if (((Long) hashMap.put(l3, l4)) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (((Long) hashMap.remove(l3)) != null) {
        } else {
            throw new AssertionError("The key was empty");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0379 A[LOOP:6: B:162:0x0373->B:164:0x0379, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v5, types: [h2.y, java.lang.Object] */
    @Override // h2.E
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(android.view.KeyEvent r30, E.d r31) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.C.e(android.view.KeyEvent, E.d):void");
    }
}
