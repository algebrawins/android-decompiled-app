package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class S6 extends AbstractC0347a {
    public static final Parcelable.Creator<S6> CREATOR = new C0563a(16);

    /* renamed from: a  reason: collision with root package name */
    public final String f5740a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5741b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5742c;

    /* renamed from: d  reason: collision with root package name */
    public final String f5743d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5744e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5745f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5746h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5747i;

    /* renamed from: j  reason: collision with root package name */
    public final String f5748j;

    /* renamed from: k  reason: collision with root package name */
    public final String f5749k;

    /* renamed from: l  reason: collision with root package name */
    public final String f5750l;

    /* renamed from: m  reason: collision with root package name */
    public final String f5751m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5752n;

    public S6(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f5740a = str;
        this.f5741b = str2;
        this.f5742c = str3;
        this.f5743d = str4;
        this.f5744e = str5;
        this.f5745f = str6;
        this.g = str7;
        this.f5746h = str8;
        this.f5747i = str9;
        this.f5748j = str10;
        this.f5749k = str11;
        this.f5750l = str12;
        this.f5751m = str13;
        this.f5752n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f5740a);
        G4.c(parcel, 2, this.f5741b);
        G4.c(parcel, 3, this.f5742c);
        G4.c(parcel, 4, this.f5743d);
        G4.c(parcel, 5, this.f5744e);
        G4.c(parcel, 6, this.f5745f);
        G4.c(parcel, 7, this.g);
        G4.c(parcel, 8, this.f5746h);
        G4.c(parcel, 9, this.f5747i);
        G4.c(parcel, 10, this.f5748j);
        G4.c(parcel, 11, this.f5749k);
        G4.c(parcel, 12, this.f5750l);
        G4.c(parcel, 13, this.f5751m);
        G4.c(parcel, 14, this.f5752n);
        G4.h(parcel, g);
    }
}
