package c2;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;
import q2.n;
import r2.o;

/* renamed from: c2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166e implements o {

    /* renamed from: J  reason: collision with root package name */
    public n f2663J;

    /* renamed from: K  reason: collision with root package name */
    public AtomicBoolean f2664K;

    public final boolean a(n nVar) {
        AtomicBoolean atomicBoolean = this.f2664K;
        if (atomicBoolean.compareAndSet(true, false)) {
            SharePlusPendingIntent.f3085a = "";
            atomicBoolean.set(false);
            this.f2663J = nVar;
            return true;
        }
        nVar.a("Share callback error", "prior share-sheet did not call back, did you await it? Maybe use non-result variant", null);
        return false;
    }

    @Override // r2.o
    public final boolean b(int r22, int r3, Intent intent) {
        n nVar;
        if (r22 != 22643) {
            return false;
        }
        String str = SharePlusPendingIntent.f3085a;
        if (this.f2664K.compareAndSet(false, true) && (nVar = this.f2663J) != null) {
            nVar.c(str);
            this.f2663J = null;
        }
        return true;
    }
}
