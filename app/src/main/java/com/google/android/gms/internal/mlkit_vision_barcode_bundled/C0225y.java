package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225y extends AbstractC0347a {
    public static final Parcelable.Creator<C0225y> CREATOR = new C0185g(14);

    /* renamed from: a  reason: collision with root package name */
    public final int f2989a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2990b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2991c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2992d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2993e;

    public C0225y(int r12, int r22, int r3, int r4, long j3) {
        this.f2989a = r12;
        this.f2990b = r22;
        this.f2991c = r3;
        this.f2992d = r4;
        this.f2993e = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2989a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f2990b);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f2991c);
        G4.i(parcel, 4, 4);
        parcel.writeInt(this.f2992d);
        G4.i(parcel, 5, 8);
        parcel.writeLong(this.f2993e);
        G4.h(parcel, g);
    }
}
