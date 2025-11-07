package k1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class z implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f4087a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f4088b;

    public z(com.google.android.gms.common.internal.a aVar, int r22) {
        this.f4088b = aVar;
        this.f4087a = r22;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC0339g tVar;
        com.google.android.gms.common.internal.a aVar = this.f4088b;
        if (iBinder == null) {
            com.google.android.gms.common.internal.a.u(aVar);
            return;
        }
        synchronized (aVar.g) {
            try {
                com.google.android.gms.common.internal.a aVar2 = this.f4088b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0339g)) {
                    tVar = (InterfaceC0339g) queryLocalInterface;
                } else {
                    tVar = new t(iBinder);
                }
                aVar2.f2746h = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.common.internal.a aVar3 = this.f4088b;
        int r5 = this.f4087a;
        aVar3.getClass();
        C0332B c0332b = new C0332B(aVar3, 0);
        y yVar = aVar3.f2744e;
        yVar.sendMessage(yVar.obtainMessage(7, r5, -1, c0332b));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.a aVar;
        synchronized (this.f4088b.g) {
            aVar = this.f4088b;
            aVar.f2746h = null;
        }
        y yVar = aVar.f2744e;
        yVar.sendMessage(yVar.obtainMessage(6, this.f4087a, 1));
    }
}
