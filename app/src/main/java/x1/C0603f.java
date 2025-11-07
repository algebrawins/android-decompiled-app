package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* renamed from: x1.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603f extends AbstractC0347a {
    public static final Parcelable.Creator<C0603f> CREATOR = new C0563a(8);

    /* renamed from: a  reason: collision with root package name */
    public int f5883a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5884b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5885c;

    /* renamed from: d  reason: collision with root package name */
    public final long f5886d;

    /* renamed from: e  reason: collision with root package name */
    public final int f5887e;

    public C0603f(int r12, int r22, int r3, int r4, long j3) {
        this.f5883a = r12;
        this.f5884b = r22;
        this.f5885c = r3;
        this.f5886d = j3;
        this.f5887e = r4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        int r02 = this.f5883a;
        G4.i(parcel, 2, 4);
        parcel.writeInt(r02);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f5884b);
        G4.i(parcel, 4, 4);
        parcel.writeInt(this.f5885c);
        G4.i(parcel, 5, 8);
        parcel.writeLong(this.f5886d);
        G4.i(parcel, 6, 4);
        parcel.writeInt(this.f5887e);
        G4.h(parcel, g);
    }
}
