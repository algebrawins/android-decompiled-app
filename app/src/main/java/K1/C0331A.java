package k1;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import h1.C0281a;

/* renamed from: k1.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331A extends r {
    public final IBinder g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3991h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0331A(com.google.android.gms.common.internal.a aVar, int r22, IBinder iBinder, Bundle bundle) {
        super(aVar, r22, bundle);
        this.f3991h = aVar;
        this.g = iBinder;
    }

    @Override // k1.r
    public final void a(C0281a c0281a) {
        C0341j c0341j = this.f3991h.f2753o;
        if (c0341j != null) {
            ((i1.h) c0341j.f4051a).D(c0281a);
        }
        System.currentTimeMillis();
    }

    @Override // k1.r
    public final boolean b() {
        IBinder iBinder = this.g;
        try {
            w.e(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            com.google.android.gms.common.internal.a aVar = this.f3991h;
            if (!aVar.r().equals(interfaceDescriptor)) {
                String r3 = aVar.r();
                Log.w("GmsClient", "service descriptor mismatch: " + r3 + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface n3 = aVar.n(iBinder);
            if (n3 == null || (!com.google.android.gms.common.internal.a.v(aVar, 2, 4, n3) && !com.google.android.gms.common.internal.a.v(aVar, 3, 4, n3))) {
                return false;
            }
            aVar.f2757s = null;
            C0341j c0341j = aVar.f2752n;
            if (c0341j != null) {
                ((i1.g) c0341j.f4051a).Y();
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
