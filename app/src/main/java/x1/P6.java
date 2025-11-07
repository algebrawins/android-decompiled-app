package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class P6 extends AbstractC0347a {
    public static final Parcelable.Creator<P6> CREATOR = new C0563a(13);

    /* renamed from: a  reason: collision with root package name */
    public final int f5704a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5705b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5706c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5707d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5708e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5709f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5710h;

    public P6(int r12, int r22, int r3, int r4, int r5, int r6, boolean z3, String str) {
        this.f5704a = r12;
        this.f5705b = r22;
        this.f5706c = r3;
        this.f5707d = r4;
        this.f5708e = r5;
        this.f5709f = r6;
        this.g = z3;
        this.f5710h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f5704a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f5705b);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f5706c);
        G4.i(parcel, 4, 4);
        parcel.writeInt(this.f5707d);
        G4.i(parcel, 5, 4);
        parcel.writeInt(this.f5708e);
        G4.i(parcel, 6, 4);
        parcel.writeInt(this.f5709f);
        G4.i(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        G4.c(parcel, 8, this.f5710h);
        G4.h(parcel, g);
    }
}
