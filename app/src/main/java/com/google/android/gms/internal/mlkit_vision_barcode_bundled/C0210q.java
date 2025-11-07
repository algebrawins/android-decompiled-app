package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0210q extends AbstractC0347a {
    public static final Parcelable.Creator<C0210q> CREATOR = new C0185g(11);

    /* renamed from: a  reason: collision with root package name */
    public final String f2958a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2959b;

    public C0210q(String str, String str2) {
        this.f2958a = str;
        this.f2959b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f2958a);
        G4.c(parcel, 2, this.f2959b);
        G4.h(parcel, g);
    }
}
