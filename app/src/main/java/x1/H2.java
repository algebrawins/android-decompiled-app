package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class H2 extends AbstractC0347a {
    public static final Parcelable.Creator<H2> CREATOR = new C0563a(26);

    /* renamed from: a  reason: collision with root package name */
    public D4 f5573a;

    /* renamed from: b  reason: collision with root package name */
    public String f5574b;

    /* renamed from: c  reason: collision with root package name */
    public String f5575c;

    /* renamed from: d  reason: collision with root package name */
    public C0569a5[] f5576d;

    /* renamed from: e  reason: collision with root package name */
    public J3[] f5577e;

    /* renamed from: f  reason: collision with root package name */
    public String[] f5578f;
    public C0597e1[] g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.b(parcel, 2, this.f5573a, r5);
        G4.c(parcel, 3, this.f5574b);
        G4.c(parcel, 4, this.f5575c);
        G4.e(parcel, 5, this.f5576d, r5);
        G4.e(parcel, 6, this.f5577e, r5);
        G4.d(parcel, 7, this.f5578f);
        G4.e(parcel, 8, this.g, r5);
        G4.h(parcel, g);
    }
}
