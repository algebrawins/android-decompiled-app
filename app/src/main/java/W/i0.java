package w;

import D.AbstractC0024d;
import android.os.Looper;
import x.C0559n;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0501k f5168a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.lifecycle.z f5169b = new androidx.lifecycle.z(0);

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5170c;

    /* renamed from: d  reason: collision with root package name */
    public final G.l f5171d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5172e;

    /* renamed from: f  reason: collision with root package name */
    public S.i f5173f;
    public boolean g;

    public i0(C0501k c0501k, C0559n c0559n, G.l lVar) {
        this.f5168a = c0501k;
        this.f5171d = lVar;
        this.f5170c = AbstractC0024d.a(new A.k(19, c0559n));
        c0501k.a(new C.c(1, this));
    }

    public static void a(androidx.lifecycle.z zVar, Integer num) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            zVar.k(num);
        } else {
            zVar.h(num);
        }
    }
}
