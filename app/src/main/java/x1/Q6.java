package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class Q6 extends AbstractC0347a {
    public static final Parcelable.Creator<Q6> CREATOR = new C0563a(14);

    /* renamed from: a  reason: collision with root package name */
    public final String f5715a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5716b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5717c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5718d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5719e;

    /* renamed from: f  reason: collision with root package name */
    public final P6 f5720f;
    public final P6 g;

    public Q6(String str, String str2, String str3, String str4, String str5, P6 p6, P6 p62) {
        this.f5715a = str;
        this.f5716b = str2;
        this.f5717c = str3;
        this.f5718d = str4;
        this.f5719e = str5;
        this.f5720f = p6;
        this.g = p62;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f5715a);
        G4.c(parcel, 2, this.f5716b);
        G4.c(parcel, 3, this.f5717c);
        G4.c(parcel, 4, this.f5718d);
        G4.c(parcel, 5, this.f5719e);
        G4.b(parcel, 6, this.f5720f, r5);
        G4.b(parcel, 7, this.g, r5);
        G4.h(parcel, g);
    }
}
