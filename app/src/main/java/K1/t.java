package k1;

import A0.C0015q;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.zzd;

/* loaded from: classes.dex */
public final class t implements InterfaceC0339g {

    /* renamed from: l  reason: collision with root package name */
    public final IBinder f4081l;

    public t(IBinder iBinder) {
        this.f4081l = iBinder;
    }

    @Override // k1.InterfaceC0339g
    public final void N(zzd zzdVar, C0335c c0335c) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(zzdVar);
            obtain.writeInt(1);
            C0015q.a(c0335c, obtain, 0);
            this.f4081l.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f4081l;
    }
}
