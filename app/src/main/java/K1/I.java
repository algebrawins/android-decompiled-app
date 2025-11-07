package k1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class i extends AbstractC0347a {
    public static final Parcelable.Creator<i> CREATOR = new C0015q(15);

    /* renamed from: a  reason: collision with root package name */
    public final int f4041a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4042b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4043c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4044d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4045e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4046f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4047h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4048i;

    public i(int r12, int r22, int r3, long j3, long j4, String str, String str2, int r10, int r11) {
        this.f4041a = r12;
        this.f4042b = r22;
        this.f4043c = r3;
        this.f4044d = j3;
        this.f4045e = j4;
        this.f4046f = str;
        this.g = str2;
        this.f4047h = r10;
        this.f4048i = r11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f4041a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f4042b);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f4043c);
        G4.i(parcel, 4, 8);
        parcel.writeLong(this.f4044d);
        G4.i(parcel, 5, 8);
        parcel.writeLong(this.f4045e);
        G4.c(parcel, 6, this.f4046f);
        G4.c(parcel, 7, this.g);
        G4.i(parcel, 8, 4);
        parcel.writeInt(this.f4047h);
        G4.i(parcel, 9, 4);
        parcel.writeInt(this.f4048i);
        G4.h(parcel, g);
    }
}
