package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import k1.C;
import k1.C0331A;
import k1.C0334b;
import k1.C0341j;
import k1.C0342k;
import k1.InterfaceC0338f;
import k1.w;
import k1.y;
import o1.h;
import v1.AbstractC0483a;

/* loaded from: classes.dex */
public abstract class zzab extends zzb implements InterfaceC0338f {
    @Override // com.google.android.gms.internal.common.zzb
    public final boolean D(int r10, Parcel parcel, Parcel parcel2) {
        C0342k c0342k;
        if (r10 != 1) {
            if (r10 != 2) {
                if (r10 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                C c4 = (C) AbstractC0483a.a(parcel, C.CREATOR);
                AbstractC0483a.b(parcel);
                zzd zzdVar = (zzd) this;
                a aVar = zzdVar.f2762l;
                w.f(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                w.e(c4);
                aVar.f2759u = c4;
                if (aVar instanceof h) {
                    C0334b c0334b = c4.f3995d;
                    C0341j b3 = C0341j.b();
                    if (c0334b == null) {
                        c0342k = null;
                    } else {
                        c0342k = c0334b.f4017a;
                    }
                    synchronized (b3) {
                        if (c0342k == null) {
                            c0342k = C0341j.f4050c;
                        } else {
                            C0342k c0342k2 = (C0342k) b3.f4051a;
                            if (c0342k2 != null) {
                                if (c0342k2.f4052a < c0342k.f4052a) {
                                }
                            }
                        }
                        b3.f4051a = c0342k;
                    }
                }
                Bundle bundle = c4.f3992a;
                w.f(zzdVar.f2762l, "onPostInitComplete can be called only once per call to getRemoteService");
                a aVar2 = zzdVar.f2762l;
                aVar2.getClass();
                C0331A c0331a = new C0331A(aVar2, readInt, readStrongBinder, bundle);
                y yVar = aVar2.f2744e;
                yVar.sendMessage(yVar.obtainMessage(1, zzdVar.f2763m, -1, c0331a));
                zzdVar.f2762l = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) AbstractC0483a.a(parcel, Bundle.CREATOR);
                AbstractC0483a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            AbstractC0483a.b(parcel);
            zzd zzdVar2 = (zzd) this;
            w.f(zzdVar2.f2762l, "onPostInitComplete can be called only once per call to getRemoteService");
            a aVar3 = zzdVar2.f2762l;
            aVar3.getClass();
            C0331A c0331a2 = new C0331A(aVar3, parcel.readInt(), parcel.readStrongBinder(), (Bundle) AbstractC0483a.a(parcel, Bundle.CREATOR));
            y yVar2 = aVar3.f2744e;
            yVar2.sendMessage(yVar2.obtainMessage(1, zzdVar2.f2763m, -1, c0331a2));
            zzdVar2.f2762l = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
