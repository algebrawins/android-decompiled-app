package j1;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import h1.C0281a;
import k1.C0334b;
import k1.C0341j;
import k1.C0342k;
import u1.HandlerC0477e;

/* loaded from: classes.dex */
public final class t implements C1.c {

    /* renamed from: J  reason: collision with root package name */
    public final C0304c f3839J;

    /* renamed from: K  reason: collision with root package name */
    public final int f3840K;

    /* renamed from: L  reason: collision with root package name */
    public final C0302a f3841L;

    /* renamed from: M  reason: collision with root package name */
    public final long f3842M;

    /* renamed from: N  reason: collision with root package name */
    public final long f3843N;

    public t(C0304c c0304c, int r22, C0302a c0302a, long j3, long j4) {
        this.f3839J = c0304c;
        this.f3840K = r22;
        this.f3841L = c0302a;
        this.f3842M = j3;
        this.f3843N = j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k1.C0334b a(j1.m r5, com.google.android.gms.common.internal.a r6, int r7) {
        /*
            k1.C r6 = r6.f2759u
            r0 = 0
            if (r6 != 0) goto L7
            r6 = r0
            goto L9
        L7:
            k1.b r6 = r6.f3995d
        L9:
            if (r6 == 0) goto L36
            boolean r1 = r6.f4018b
            if (r1 == 0) goto L36
            int[] r1 = r6.f4020d
            r2 = 0
            if (r1 != 0) goto L24
            int[] r1 = r6.f4022f
            if (r1 != 0) goto L19
            goto L2b
        L19:
            int r3 = r1.length
        L1a:
            if (r2 >= r3) goto L2b
            r4 = r1[r2]
            if (r4 != r7) goto L21
            goto L36
        L21:
            int r2 = r2 + 1
            goto L1a
        L24:
            int r3 = r1.length
        L25:
            if (r2 >= r3) goto L36
            r4 = r1[r2]
            if (r4 != r7) goto L33
        L2b:
            int r5 = r5.f3826w
            int r7 = r6.f4021e
            if (r5 >= r7) goto L32
            return r6
        L32:
            return r0
        L33:
            int r2 = r2 + 1
            goto L25
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.t.a(j1.m, com.google.android.gms.common.internal.a, int):k1.b");
    }

    @Override // C1.c
    public final void e(C1.j jVar) {
        boolean z3;
        int r12;
        int r22;
        int r3;
        int r9;
        int r13;
        long j3;
        long j4;
        int r21;
        if (!this.f3839J.a()) {
            return;
        }
        C0342k c0342k = (C0342k) C0341j.b().f4051a;
        if (c0342k != null && !c0342k.f4053b) {
            return;
        }
        m mVar = (m) this.f3839J.f3807j.get(this.f3841L);
        if (mVar != null) {
            i1.c cVar = mVar.f3816m;
            if (cVar instanceof com.google.android.gms.common.internal.a) {
                com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) cVar;
                boolean z4 = true;
                int r92 = 0;
                if (this.f3842M > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                int r5 = aVar.f2754p;
                if (c0342k != null) {
                    z3 &= c0342k.f4054c;
                    int r11 = c0342k.f4055d;
                    int r122 = c0342k.f4056e;
                    r12 = c0342k.f4052a;
                    if (aVar.f2759u != null && !aVar.b()) {
                        C0334b a4 = a(mVar, aVar, this.f3840K);
                        if (a4 == null) {
                            return;
                        }
                        z4 = (!a4.f4019c || this.f3842M <= 0) ? false : false;
                        r122 = a4.f4021e;
                        z3 = z4;
                    }
                    r22 = r11;
                    r3 = r122;
                } else {
                    r12 = 0;
                    r22 = 5000;
                    r3 = 100;
                }
                C0304c c0304c = this.f3839J;
                if (jVar.f()) {
                    r13 = 0;
                } else {
                    if (jVar.f249d) {
                        r92 = 100;
                    } else {
                        Exception c4 = jVar.c();
                        if (c4 instanceof i1.d) {
                            Status status = ((i1.d) c4).f3406J;
                            int r10 = status.f2727b;
                            C0281a c0281a = status.f2730e;
                            if (c0281a == null) {
                                r9 = -1;
                            } else {
                                r9 = c0281a.f3250b;
                            }
                            r13 = r9;
                            r92 = r10;
                        } else {
                            r92 = 101;
                        }
                    }
                    r13 = -1;
                }
                if (z3) {
                    long j5 = this.f3842M;
                    long currentTimeMillis = System.currentTimeMillis();
                    r21 = (int) (SystemClock.elapsedRealtime() - this.f3843N);
                    j3 = j5;
                    j4 = currentTimeMillis;
                } else {
                    j3 = 0;
                    j4 = 0;
                    r21 = -1;
                }
                k1.i iVar = new k1.i(this.f3840K, r92, r13, j3, j4, null, null, r5, r21);
                long j6 = r22;
                HandlerC0477e handlerC0477e = c0304c.f3810m;
                handlerC0477e.sendMessage(handlerC0477e.obtainMessage(18, new u(iVar, r12, j6, r3)));
            }
        }
    }
}
