package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217u extends AbstractC0347a {
    public static final Parcelable.Creator<C0217u> CREATOR = new C0185g(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f2981a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2982b;

    public C0217u(int r12, boolean z3) {
        this.f2981a = r12;
        this.f2982b = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2981a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f2982b ? 1 : 0);
        G4.h(parcel, g);
    }
}
