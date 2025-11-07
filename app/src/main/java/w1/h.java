package W1;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import k1.m;
import k1.w;
import x1.C0727v4;
import x1.I6;
import x1.N4;

/* loaded from: classes.dex */
public final class h extends Q1.e {

    /* renamed from: j  reason: collision with root package name */
    public static final Y1.b f1516j = Y1.b.f1664b;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f1517k = true;

    /* renamed from: d  reason: collision with root package name */
    public final S1.b f1518d;

    /* renamed from: e  reason: collision with root package name */
    public final i f1519e;

    /* renamed from: f  reason: collision with root package name */
    public final I6 f1520f;
    public final C0727v4 g;

    /* renamed from: h  reason: collision with root package name */
    public final Y1.a f1521h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1522i;

    /* JADX WARN: Type inference failed for: r4v1, types: [x1.v4, java.lang.Object] */
    public h(Q1.g gVar, S1.b bVar, i iVar, I6 r6) {
        this.f1067b = new AtomicInteger(0);
        this.f1068c = new AtomicBoolean(false);
        this.f1066a = new Q1.k();
        this.f1521h = new Y1.a();
        w.f(gVar, "MlKitContext can not be null");
        w.f(bVar, "BarcodeScannerOptions can not be null");
        this.f1518d = bVar;
        this.f1519e = iVar;
        this.f1520f = r6;
        Context b3 = gVar.b();
        ?? obj = new Object();
        obj.f6109K = new AtomicLong(-1L);
        obj.f6108J = new i1.f(b3, m1.b.f4118i, new m("mlkit:vision"), i1.e.f3407b);
        this.g = obj;
    }

    public final List m(X1.a aVar) {
        N4 n4;
        ArrayList c4;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f1521h.a(aVar);
            try {
                c4 = this.f1519e.c(aVar);
                n(N4.zza, elapsedRealtime, aVar, c4);
                f1517k = false;
            } catch (M1.a e4) {
                if (e4.f871J == 14) {
                    n4 = N4.zzk;
                } else {
                    n4 = N4.zzX;
                }
                n(n4, elapsedRealtime, aVar, null);
                throw e4;
            }
        }
        return c4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r3 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(final x1.N4 r35, long r36, final X1.a r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.h.n(x1.N4, long, X1.a, java.util.List):void");
    }
}
