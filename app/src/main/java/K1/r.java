package k1;

import android.os.Bundle;
import h1.C0281a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public Boolean f4075a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4076b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f4077c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4078d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f4079e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f4080f;

    public r(com.google.android.gms.common.internal.a aVar, int r3, Bundle bundle) {
        this.f4080f = aVar;
        Boolean bool = Boolean.TRUE;
        this.f4077c = aVar;
        this.f4075a = bool;
        this.f4076b = false;
        this.f4078d = r3;
        this.f4079e = bundle;
    }

    public abstract void a(C0281a c0281a);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f4075a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f4077c.f2749k) {
            this.f4077c.f2749k.remove(this);
        }
    }
}
