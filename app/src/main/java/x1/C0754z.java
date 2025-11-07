package x1;

import java.util.Arrays;

/* renamed from: x1.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0754z {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f6142a = new Object[4];

    /* renamed from: b  reason: collision with root package name */
    public int f6143b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6144c;

    public final void a(Object obj) {
        obj.getClass();
        b(this.f6143b + 1);
        Object[] objArr = this.f6142a;
        int r12 = this.f6143b;
        this.f6143b = r12 + 1;
        objArr[r12] = obj;
    }

    public final void b(int r5) {
        Object[] objArr = this.f6142a;
        int length = objArr.length;
        if (length < r5) {
            int r12 = length + (length >> 1) + 1;
            if (r12 < r5) {
                int highestOneBit = Integer.highestOneBit(r5 - 1);
                r12 = highestOneBit + highestOneBit;
            }
            if (r12 < 0) {
                r12 = Integer.MAX_VALUE;
            }
            this.f6142a = Arrays.copyOf(objArr, r12);
            this.f6144c = false;
        } else if (this.f6144c) {
            this.f6142a = (Object[]) objArr.clone();
            this.f6144c = false;
        }
    }

    public final G c() {
        this.f6144c = true;
        Object[] objArr = this.f6142a;
        int r12 = this.f6143b;
        C0562A c0562a = C.f5509K;
        if (r12 == 0) {
            return G.f5558N;
        }
        return new G(r12, objArr);
    }
}
