package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0197l extends AbstractC0347a {
    public static final Parcelable.Creator<C0197l> CREATOR = new C0185g(6);

    /* renamed from: a  reason: collision with root package name */
    public final String f2928a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2929b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2930c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2931d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2932e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2933f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2934h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2935i;

    /* renamed from: j  reason: collision with root package name */
    public final String f2936j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2937k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2938l;

    /* renamed from: m  reason: collision with root package name */
    public final String f2939m;

    /* renamed from: n  reason: collision with root package name */
    public final String f2940n;

    public C0197l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.f2928a = str;
        this.f2929b = str2;
        this.f2930c = str3;
        this.f2931d = str4;
        this.f2932e = str5;
        this.f2933f = str6;
        this.g = str7;
        this.f2934h = str8;
        this.f2935i = str9;
        this.f2936j = str10;
        this.f2937k = str11;
        this.f2938l = str12;
        this.f2939m = str13;
        this.f2940n = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f2928a);
        G4.c(parcel, 2, this.f2929b);
        G4.c(parcel, 3, this.f2930c);
        G4.c(parcel, 4, this.f2931d);
        G4.c(parcel, 5, this.f2932e);
        G4.c(parcel, 6, this.f2933f);
        G4.c(parcel, 7, this.g);
        G4.c(parcel, 8, this.f2934h);
        G4.c(parcel, 9, this.f2935i);
        G4.c(parcel, 10, this.f2936j);
        G4.c(parcel, 11, this.f2937k);
        G4.c(parcel, 12, this.f2938l);
        G4.c(parcel, 13, this.f2939m);
        G4.c(parcel, 14, this.f2940n);
        G4.h(parcel, g);
    }
}
