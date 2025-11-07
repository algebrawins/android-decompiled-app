package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class i extends AbstractC0347a {
    public static final Parcelable.Creator<i> CREATOR = new C0185g(3);

    /* renamed from: a  reason: collision with root package name */
    public final int f2907a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2908b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2909c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2910d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2911e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2912f;
    public final boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2913h;

    public i(int r12, int r22, int r3, int r4, int r5, int r6, boolean z3, String str) {
        this.f2907a = r12;
        this.f2908b = r22;
        this.f2909c = r3;
        this.f2910d = r4;
        this.f2911e = r5;
        this.f2912f = r6;
        this.g = z3;
        this.f2913h = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2907a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f2908b);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f2909c);
        G4.i(parcel, 4, 4);
        parcel.writeInt(this.f2910d);
        G4.i(parcel, 5, 4);
        parcel.writeInt(this.f2911e);
        G4.i(parcel, 6, 4);
        parcel.writeInt(this.f2912f);
        G4.i(parcel, 7, 4);
        parcel.writeInt(this.g ? 1 : 0);
        G4.c(parcel, 8, this.f2913h);
        G4.h(parcel, g);
    }
}
