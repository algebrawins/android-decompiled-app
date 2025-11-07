package androidx.camera.core.impl;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2190a = new ArrayList();

    public static void b(ArrayList arrayList, int r5, int[] r6, int r7) {
        if (r7 >= r6.length) {
            arrayList.add((int[]) r6.clone());
            return;
        }
        for (int r12 = 0; r12 < r5; r12++) {
            int r22 = 0;
            while (true) {
                if (r22 < r7) {
                    if (r12 == r6[r22]) {
                        break;
                    }
                    r22++;
                } else {
                    r6[r7] = r12;
                    b(arrayList, r5, r6, r7 + 1);
                    break;
                }
            }
        }
    }

    public final void a(C0080g c0080g) {
        this.f2190a.add(c0080g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List c(java.util.List r14) {
        /*
            r13 = this;
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lc
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            return r14
        Lc:
            int r0 = r14.size()
            java.util.ArrayList r1 = r13.f2190a
            int r2 = r1.size()
            r3 = 0
            if (r0 == r2) goto L1a
            return r3
        L1a:
            int r0 = r1.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int[] r4 = new int[r0]
            r5 = 0
            b(r2, r0, r4, r5)
            int r0 = r14.size()
            androidx.camera.core.impl.g[] r0 = new androidx.camera.core.impl.C0080g[r0]
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L88
            java.lang.Object r4 = r2.next()
            int[] r4 = (int[]) r4
            r6 = 1
            r7 = 0
            r8 = 1
        L42:
            int r9 = r1.size()
            if (r7 >= r9) goto L85
            r9 = r4[r7]
            int r10 = r14.size()
            if (r9 >= r10) goto L82
            java.lang.Object r9 = r1.get(r7)
            androidx.camera.core.impl.g r9 = (androidx.camera.core.impl.C0080g) r9
            r10 = r4[r7]
            java.lang.Object r10 = r14.get(r10)
            androidx.camera.core.impl.g r10 = (androidx.camera.core.impl.C0080g) r10
            r9.getClass()
            androidx.camera.core.impl.g0 r11 = r10.f2196a
            androidx.camera.core.impl.f0 r10 = r10.f2197b
            int r10 = r10.mId
            androidx.camera.core.impl.f0 r12 = r9.f2197b
            int r12 = r12.mId
            if (r10 > r12) goto L73
            androidx.camera.core.impl.g0 r9 = r9.f2196a
            if (r11 != r9) goto L73
            r9 = 1
            goto L74
        L73:
            r9 = 0
        L74:
            r8 = r8 & r9
            if (r8 != 0) goto L78
            goto L85
        L78:
            r9 = r4[r7]
            java.lang.Object r10 = r1.get(r7)
            androidx.camera.core.impl.g r10 = (androidx.camera.core.impl.C0080g) r10
            r0[r9] = r10
        L82:
            int r7 = r7 + 1
            goto L42
        L85:
            if (r8 == 0) goto L33
            r5 = 1
        L88:
            if (r5 == 0) goto L8e
            java.util.List r3 = java.util.Arrays.asList(r0)
        L8e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.e0.c(java.util.List):java.util.List");
    }
}
