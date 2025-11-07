package k1;

import A0.C0015q;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;
import h1.C0281a;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class q extends AbstractC0347a {
    public static final Parcelable.Creator<q> CREATOR = new C0015q(17);

    /* renamed from: a  reason: collision with root package name */
    public final int f4070a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f4071b;

    /* renamed from: c  reason: collision with root package name */
    public final C0281a f4072c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4073d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4074e;

    public q(int r12, IBinder iBinder, C0281a c0281a, boolean z3, boolean z4) {
        this.f4070a = r12;
        this.f4071b = iBinder;
        this.f4072c = c0281a;
        this.f4073d = z3;
        this.f4074e = z4;
    }

    public final boolean equals(Object obj) {
        InterfaceC0336d asInterface;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f4072c.equals(qVar.f4072c)) {
            InterfaceC0336d interfaceC0336d = null;
            IBinder iBinder = this.f4071b;
            if (iBinder == null) {
                asInterface = null;
            } else {
                asInterface = IAccountAccessor$Stub.asInterface(iBinder);
            }
            IBinder iBinder2 = qVar.f4071b;
            if (iBinder2 != null) {
                interfaceC0336d = IAccountAccessor$Stub.asInterface(iBinder2);
            }
            if (w.h(asInterface, interfaceC0336d)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4070a);
        IBinder iBinder = this.f4071b;
        if (iBinder != null) {
            int g3 = G4.g(parcel, 2);
            parcel.writeStrongBinder(iBinder);
            G4.h(parcel, g3);
        }
        G4.b(parcel, 3, this.f4072c, r6);
        G4.i(parcel, 4, 4);
        parcel.writeInt(this.f4073d ? 1 : 0);
        G4.i(parcel, 5, 4);
        parcel.writeInt(this.f4074e ? 1 : 0);
        G4.h(parcel, g);
    }
}
