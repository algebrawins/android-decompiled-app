package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class r extends AbstractC0347a {
    public static final Parcelable.Creator<r> CREATOR = new C0185g(12);

    /* renamed from: a  reason: collision with root package name */
    public final String f2960a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2961b;

    public r(String str, String str2) {
        this.f2960a = str;
        this.f2961b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f2960a);
        G4.c(parcel, 2, this.f2961b);
        G4.h(parcel, g);
    }
}
