package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208p extends AbstractC0347a {
    public static final Parcelable.Creator<C0208p> CREATOR = new C0185g(10);

    /* renamed from: a  reason: collision with root package name */
    public final int f2955a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2956b;

    public C0208p(String str, int r22) {
        this.f2955a = r22;
        this.f2956b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2955a);
        G4.c(parcel, 2, this.f2956b);
        G4.h(parcel, g);
    }
}
