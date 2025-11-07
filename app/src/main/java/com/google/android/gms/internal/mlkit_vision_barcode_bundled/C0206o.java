package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0206o extends AbstractC0347a {
    public static final Parcelable.Creator<C0206o> CREATOR = new C0185g(9);

    /* renamed from: a  reason: collision with root package name */
    public final String f2949a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2950b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2951c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2952d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2953e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2954f;
    public final String g;

    public C0206o(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f2949a = str;
        this.f2950b = str2;
        this.f2951c = str3;
        this.f2952d = str4;
        this.f2953e = str5;
        this.f2954f = str6;
        this.g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f2949a);
        G4.c(parcel, 2, this.f2950b);
        G4.c(parcel, 3, this.f2951c);
        G4.c(parcel, 4, this.f2952d);
        G4.c(parcel, 5, this.f2953e);
        G4.c(parcel, 6, this.f2954f);
        G4.c(parcel, 7, this.g);
        G4.h(parcel, g);
    }
}
