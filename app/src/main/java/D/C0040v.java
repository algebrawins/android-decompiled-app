package D;

import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import h2.AbstractActivityC0292d;
import java.util.concurrent.Executor;
import p.t0;
import w.C0489E;
import x1.AbstractC0624h4;
import x1.AbstractC0699s0;

/* renamed from: D.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040v {

    /* renamed from: l  reason: collision with root package name */
    public static final Object f459l = new Object();

    /* renamed from: m  reason: collision with root package name */
    public static final SparseArray f460m = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    public final C0041w f463c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f464d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f465e;

    /* renamed from: f  reason: collision with root package name */
    public t0 f466f;
    public h2.J g;

    /* renamed from: h  reason: collision with root package name */
    public C0489E f467h;

    /* renamed from: i  reason: collision with root package name */
    public Context f468i;

    /* renamed from: j  reason: collision with root package name */
    public final S.l f469j;

    /* renamed from: a  reason: collision with root package name */
    public final A.f f461a = new A.f(20);

    /* renamed from: b  reason: collision with root package name */
    public final Object f462b = new Object();

    /* renamed from: k  reason: collision with root package name */
    public EnumC0039u f470k = EnumC0039u.UNINITIALIZED;

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0040v(h2.AbstractActivityC0292d r8) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0040v.<init>(h2.d):void");
    }

    public final S.l a(AbstractActivityC0292d abstractActivityC0292d) {
        boolean z3;
        S.l a4;
        synchronized (this.f462b) {
            if (this.f470k == EnumC0039u.UNINITIALIZED) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0624h4.f("CameraX.initInternal() should only be called once per instance", z3);
            this.f470k = EnumC0039u.INITIALIZING;
            a4 = AbstractC0699s0.a(new C.f(1, this, abstractActivityC0292d));
        }
        return a4;
    }

    public final void b() {
        synchronized (this.f462b) {
            this.f470k = EnumC0039u.INITIALIZED;
        }
    }
}
