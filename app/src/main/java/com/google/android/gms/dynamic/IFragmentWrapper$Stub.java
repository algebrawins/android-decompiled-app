package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import q0.k;
import s1.InterfaceC0452a;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;
import v1.AbstractC0483a;

/* loaded from: classes.dex */
public abstract class IFragmentWrapper$Stub extends zzb implements InterfaceC0452a {
    public IFragmentWrapper$Stub() {
        super("com.google.android.gms.dynamic.IFragmentWrapper");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [s1.a, u1.a] */
    public static InterfaceC0452a asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
        if (queryLocalInterface instanceof InterfaceC0452a) {
            return (InterfaceC0452a) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.dynamic.IFragmentWrapper", 1);
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean D(int r3, Parcel parcel, Parcel parcel2) {
        boolean z3 = false;
        switch (r3) {
            case 2:
                InterfaceC0453b d02 = d0();
                parcel2.writeNoException();
                AbstractC0483a.c(parcel2, d02);
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                Bundle h3 = h();
                parcel2.writeNoException();
                int r4 = AbstractC0483a.f5045a;
                if (h3 == null) {
                    parcel2.writeInt(0);
                    break;
                } else {
                    parcel2.writeInt(1);
                    h3.writeToParcel(parcel2, 1);
                    break;
                }
            case 4:
                int a4 = a();
                parcel2.writeNoException();
                parcel2.writeInt(a4);
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0452a c4 = c();
                parcel2.writeNoException();
                AbstractC0483a.c(parcel2, c4);
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                InterfaceC0453b f2 = f();
                parcel2.writeNoException();
                AbstractC0483a.c(parcel2, f2);
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                boolean K3 = K();
                parcel2.writeNoException();
                int r42 = AbstractC0483a.f5045a;
                parcel2.writeInt(K3 ? 1 : 0);
                break;
            case 8:
                String t3 = t();
                parcel2.writeNoException();
                parcel2.writeString(t3);
                break;
            case 9:
                InterfaceC0452a C3 = C();
                parcel2.writeNoException();
                AbstractC0483a.c(parcel2, C3);
                break;
            case 10:
                int b3 = b();
                parcel2.writeNoException();
                parcel2.writeInt(b3);
                break;
            case 11:
                boolean u02 = u0();
                parcel2.writeNoException();
                int r43 = AbstractC0483a.f5045a;
                parcel2.writeInt(u02 ? 1 : 0);
                break;
            case 12:
                InterfaceC0453b j0 = j0();
                parcel2.writeNoException();
                AbstractC0483a.c(parcel2, j0);
                break;
            case 13:
                boolean M3 = M();
                parcel2.writeNoException();
                int r44 = AbstractC0483a.f5045a;
                parcel2.writeInt(M3 ? 1 : 0);
                break;
            case 14:
                boolean e02 = e0();
                parcel2.writeNoException();
                int r45 = AbstractC0483a.f5045a;
                parcel2.writeInt(e02 ? 1 : 0);
                break;
            case 15:
                boolean x3 = x();
                parcel2.writeNoException();
                int r46 = AbstractC0483a.f5045a;
                parcel2.writeInt(x3 ? 1 : 0);
                break;
            case 16:
                boolean k02 = k0();
                parcel2.writeNoException();
                int r47 = AbstractC0483a.f5045a;
                parcel2.writeInt(k02 ? 1 : 0);
                break;
            case 17:
                boolean E3 = E();
                parcel2.writeNoException();
                int r48 = AbstractC0483a.f5045a;
                parcel2.writeInt(E3 ? 1 : 0);
                break;
            case 18:
                boolean X3 = X();
                parcel2.writeNoException();
                int r49 = AbstractC0483a.f5045a;
                parcel2.writeInt(X3 ? 1 : 0);
                break;
            case 19:
                boolean r02 = r0();
                parcel2.writeNoException();
                int r410 = AbstractC0483a.f5045a;
                parcel2.writeInt(r02 ? 1 : 0);
                break;
            case 20:
                InterfaceC0453b asInterface = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                AbstractC0483a.b(parcel);
                v(asInterface);
                parcel2.writeNoException();
                break;
            case 21:
                int r32 = AbstractC0483a.f5045a;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                AbstractC0483a.b(parcel);
                l(z3);
                parcel2.writeNoException();
                break;
            case 22:
                int r33 = AbstractC0483a.f5045a;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                AbstractC0483a.b(parcel);
                L(z3);
                parcel2.writeNoException();
                break;
            case 23:
                int r34 = AbstractC0483a.f5045a;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                AbstractC0483a.b(parcel);
                o0(z3);
                parcel2.writeNoException();
                break;
            case 24:
                int r35 = AbstractC0483a.f5045a;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                AbstractC0483a.b(parcel);
                O(z3);
                parcel2.writeNoException();
                break;
            case 25:
                AbstractC0483a.b(parcel);
                s((Intent) AbstractC0483a.a(parcel, Intent.CREATOR));
                parcel2.writeNoException();
                break;
            case 26:
                int readInt = parcel.readInt();
                AbstractC0483a.b(parcel);
                B((Intent) AbstractC0483a.a(parcel, Intent.CREATOR), readInt);
                parcel2.writeNoException();
                break;
            case 27:
                InterfaceC0453b asInterface2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                AbstractC0483a.b(parcel);
                t0(asInterface2);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
