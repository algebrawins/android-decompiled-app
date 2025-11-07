package A;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.C0095x;
import androidx.camera.core.impl.C0096y;
import androidx.camera.core.impl.D;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.S;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import v.C0479a;
import z.AbstractC0957j;
import z.C0943D;
import z.C0945F;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13a;

    public h(int r22) {
        boolean z3;
        boolean z4;
        boolean z5;
        switch (r22) {
            case 1:
                if (AbstractC0957j.f6565a.b(C0945F.class) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f13a = z3;
                return;
            case 2:
                if (K.b.f808a.b(K.i.class) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f13a = z4;
                return;
            default:
                if (((C0943D) AbstractC0957j.f6565a.b(C0943D.class)) != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f13a = z5;
                return;
        }
    }

    public static C0096y a(C0096y c0096y) {
        C0095x c0095x = new C0095x();
        c0095x.f2239c = c0096y.f2248c;
        for (D d4 : Collections.unmodifiableList(c0096y.f2246a)) {
            c0095x.f2237a.add(d4);
        }
        c0095x.c(c0096y.f2247b);
        O b3 = O.b();
        b3.g(C0479a.r0(CaptureRequest.FLASH_MODE), 0);
        c0095x.c(new a(7, S.a(b3)));
        return c0095x.d();
    }

    public boolean b(ArrayList arrayList, boolean z3) {
        if (this.f13a && z3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) ((CaptureRequest) it.next()).get(CaptureRequest.FLASH_MODE);
                if (num != null && num.intValue() == 2) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean c(java.util.ArrayList r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.f13a
            r1 = 0
            if (r0 == 0) goto L2c
            if (r4 != 0) goto L8
            goto L2c
        L8:
            java.util.Iterator r3 = r3.iterator()
        Lc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L2c
            java.lang.Object r4 = r3.next()
            android.hardware.camera2.CaptureRequest r4 = (android.hardware.camera2.CaptureRequest) r4
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Object r4 = r4.get(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r0 = 2
            if (r4 == r0) goto L2a
            r0 = 3
            if (r4 != r0) goto Lc
        L2a:
            r3 = 1
            return r3
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: A.h.c(java.util.ArrayList, boolean):boolean");
    }
}
