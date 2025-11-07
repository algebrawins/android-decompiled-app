package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* renamed from: x1.g2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0614g2 extends AbstractC0347a {
    public static final Parcelable.Creator<C0614g2> CREATOR = new C0563a(25);

    /* renamed from: a  reason: collision with root package name */
    public String f5893a;

    /* renamed from: b  reason: collision with root package name */
    public String f5894b;

    /* renamed from: c  reason: collision with root package name */
    public String f5895c;

    /* renamed from: d  reason: collision with root package name */
    public String f5896d;

    /* renamed from: e  reason: collision with root package name */
    public String f5897e;

    /* renamed from: f  reason: collision with root package name */
    public F1 f5898f;
    public F1 g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 2, this.f5893a);
        G4.c(parcel, 3, this.f5894b);
        G4.c(parcel, 4, this.f5895c);
        G4.c(parcel, 5, this.f5896d);
        G4.c(parcel, 6, this.f5897e);
        G4.b(parcel, 7, this.f5898f, r5);
        G4.b(parcel, 8, this.g, r5);
        G4.h(parcel, g);
    }
}
