package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188h extends AbstractC0347a {
    public static final Parcelable.Creator<C0188h> CREATOR = new C0185g(0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2905a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f2906b;

    public C0188h(int r12, String[] strArr) {
        this.f2905a = r12;
        this.f2906b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2905a);
        G4.d(parcel, 2, this.f2906b);
        G4.h(parcel, g);
    }
}
