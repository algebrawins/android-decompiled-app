package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215t extends AbstractC0347a {
    public static final Parcelable.Creator<C0215t> CREATOR = new C0185g(1);

    /* renamed from: a  reason: collision with root package name */
    public final int f2967a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2968b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2969c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f2970d;

    /* renamed from: e  reason: collision with root package name */
    public final Point[] f2971e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2972f;
    public final C0200m g;

    /* renamed from: h  reason: collision with root package name */
    public final C0208p f2973h;

    /* renamed from: i  reason: collision with root package name */
    public final C0210q f2974i;

    /* renamed from: j  reason: collision with root package name */
    public final C0213s f2975j;

    /* renamed from: k  reason: collision with root package name */
    public final r f2976k;

    /* renamed from: l  reason: collision with root package name */
    public final C0203n f2977l;

    /* renamed from: m  reason: collision with root package name */
    public final C0191j f2978m;

    /* renamed from: n  reason: collision with root package name */
    public final C0194k f2979n;

    /* renamed from: o  reason: collision with root package name */
    public final C0197l f2980o;

    public C0215t(int r12, String str, String str2, byte[] bArr, Point[] pointArr, int r6, C0200m c0200m, C0208p c0208p, C0210q c0210q, C0213s c0213s, r rVar, C0203n c0203n, C0191j c0191j, C0194k c0194k, C0197l c0197l) {
        this.f2967a = r12;
        this.f2968b = str;
        this.f2969c = str2;
        this.f2970d = bArr;
        this.f2971e = pointArr;
        this.f2972f = r6;
        this.g = c0200m;
        this.f2973h = c0208p;
        this.f2974i = c0210q;
        this.f2975j = c0213s;
        this.f2976k = rVar;
        this.f2977l = c0203n;
        this.f2978m = c0191j;
        this.f2979n = c0194k;
        this.f2980o = c0197l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2967a);
        G4.c(parcel, 2, this.f2968b);
        G4.c(parcel, 3, this.f2969c);
        G4.a(parcel, 4, this.f2970d);
        G4.e(parcel, 5, this.f2971e, r6);
        G4.i(parcel, 6, 4);
        parcel.writeInt(this.f2972f);
        G4.b(parcel, 7, this.g, r6);
        G4.b(parcel, 8, this.f2973h, r6);
        G4.b(parcel, 9, this.f2974i, r6);
        G4.b(parcel, 10, this.f2975j, r6);
        G4.b(parcel, 11, this.f2976k, r6);
        G4.b(parcel, 12, this.f2977l, r6);
        G4.b(parcel, 13, this.f2978m, r6);
        G4.b(parcel, 14, this.f2979n, r6);
        G4.b(parcel, 15, this.f2980o, r6);
        G4.h(parcel, g);
    }
}
