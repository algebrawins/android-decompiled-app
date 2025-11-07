package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213s extends AbstractC0347a {
    public static final Parcelable.Creator<C0213s> CREATOR = new C0185g(13);

    /* renamed from: a  reason: collision with root package name */
    public final String f2962a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2963b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2964c;

    public C0213s(int r12, String str, String str2) {
        this.f2962a = str;
        this.f2963b = str2;
        this.f2964c = r12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f2962a);
        G4.c(parcel, 2, this.f2963b);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f2964c);
        G4.h(parcel, g);
    }
}
