package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0200m extends AbstractC0347a {
    public static final Parcelable.Creator<C0200m> CREATOR = new C0185g(7);

    /* renamed from: a  reason: collision with root package name */
    public final int f2942a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2943b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2944c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2945d;

    public C0200m(int r12, String str, String str2, String str3) {
        this.f2942a = r12;
        this.f2943b = str;
        this.f2944c = str2;
        this.f2945d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2942a);
        G4.c(parcel, 2, this.f2943b);
        G4.c(parcel, 3, this.f2944c);
        G4.c(parcel, 4, this.f2945d);
        G4.h(parcel, g);
    }
}
