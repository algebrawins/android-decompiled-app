package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class V6 extends AbstractC0347a {
    public static final Parcelable.Creator<V6> CREATOR = new C0563a(19);

    /* renamed from: a  reason: collision with root package name */
    public final String f5782a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5783b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5784c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5785d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5786e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5787f;
    public final String g;

    public V6(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f5782a = str;
        this.f5783b = str2;
        this.f5784c = str3;
        this.f5785d = str4;
        this.f5786e = str5;
        this.f5787f = str6;
        this.g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f5782a);
        G4.c(parcel, 2, this.f5783b);
        G4.c(parcel, 3, this.f5784c);
        G4.c(parcel, 4, this.f5785d);
        G4.c(parcel, 5, this.f5786e);
        G4.c(parcel, 6, this.f5787f);
        G4.c(parcel, 7, this.g);
        G4.h(parcel, g);
    }
}
