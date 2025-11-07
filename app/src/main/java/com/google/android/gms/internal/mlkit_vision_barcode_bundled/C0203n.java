package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0203n extends AbstractC0347a {
    public static final Parcelable.Creator<C0203n> CREATOR = new C0185g(8);

    /* renamed from: a  reason: collision with root package name */
    public final double f2946a;

    /* renamed from: b  reason: collision with root package name */
    public final double f2947b;

    public C0203n(double d4, double d5) {
        this.f2946a = d4;
        this.f2947b = d5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 8);
        parcel.writeDouble(this.f2946a);
        G4.i(parcel, 2, 8);
        parcel.writeDouble(this.f2947b);
        G4.h(parcel, g);
    }
}
