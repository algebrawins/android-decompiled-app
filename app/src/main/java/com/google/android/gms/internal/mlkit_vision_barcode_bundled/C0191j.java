package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191j extends AbstractC0347a {
    public static final Parcelable.Creator<C0191j> CREATOR = new C0185g(4);

    /* renamed from: a  reason: collision with root package name */
    public final String f2914a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2915b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2916c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2917d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2918e;

    /* renamed from: f  reason: collision with root package name */
    public final i f2919f;
    public final i g;

    public C0191j(String str, String str2, String str3, String str4, String str5, i iVar, i iVar2) {
        this.f2914a = str;
        this.f2915b = str2;
        this.f2916c = str3;
        this.f2917d = str4;
        this.f2918e = str5;
        this.f2919f = iVar;
        this.g = iVar2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f2914a);
        G4.c(parcel, 2, this.f2915b);
        G4.c(parcel, 3, this.f2916c);
        G4.c(parcel, 4, this.f2917d);
        G4.c(parcel, 5, this.f2918e);
        G4.b(parcel, 6, this.f2919f, r5);
        G4.b(parcel, 7, this.g, r5);
        G4.h(parcel, g);
    }
}
