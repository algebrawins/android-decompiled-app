package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194k extends AbstractC0347a {
    public static final Parcelable.Creator<C0194k> CREATOR = new C0185g(5);

    /* renamed from: a  reason: collision with root package name */
    public final C0206o f2922a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2923b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2924c;

    /* renamed from: d  reason: collision with root package name */
    public final C0208p[] f2925d;

    /* renamed from: e  reason: collision with root package name */
    public final C0200m[] f2926e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f2927f;
    public final C0188h[] g;

    public C0194k(C0206o c0206o, String str, String str2, C0208p[] c0208pArr, C0200m[] c0200mArr, String[] strArr, C0188h[] c0188hArr) {
        this.f2922a = c0206o;
        this.f2923b = str;
        this.f2924c = str2;
        this.f2925d = c0208pArr;
        this.f2926e = c0200mArr;
        this.f2927f = strArr;
        this.g = c0188hArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.b(parcel, 1, this.f2922a, r5);
        G4.c(parcel, 2, this.f2923b);
        G4.c(parcel, 3, this.f2924c);
        G4.e(parcel, 4, this.f2925d, r5);
        G4.e(parcel, 5, this.f2926e, r5);
        G4.d(parcel, 6, this.f2927f);
        G4.e(parcel, 7, this.g, r5);
        G4.h(parcel, g);
    }
}
