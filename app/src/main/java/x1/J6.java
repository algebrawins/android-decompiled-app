package x1;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class J6 extends AbstractC0347a {
    public static final Parcelable.Creator<J6> CREATOR = new C0563a(11);

    /* renamed from: a  reason: collision with root package name */
    public int f5620a;

    /* renamed from: b  reason: collision with root package name */
    public String f5621b;

    /* renamed from: c  reason: collision with root package name */
    public String f5622c;

    /* renamed from: d  reason: collision with root package name */
    public int f5623d;

    /* renamed from: e  reason: collision with root package name */
    public Point[] f5624e;

    /* renamed from: f  reason: collision with root package name */
    public J3 f5625f;
    public C0569a5 g;

    /* renamed from: h  reason: collision with root package name */
    public C0760z5 f5626h;

    /* renamed from: i  reason: collision with root package name */
    public C0729v6 f5627i;

    /* renamed from: j  reason: collision with root package name */
    public C0570a6 f5628j;

    /* renamed from: k  reason: collision with root package name */
    public i4 f5629k;

    /* renamed from: l  reason: collision with root package name */
    public C0614g2 f5630l;

    /* renamed from: m  reason: collision with root package name */
    public H2 f5631m;

    /* renamed from: n  reason: collision with root package name */
    public i3 f5632n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f5633o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5634p;

    /* renamed from: q  reason: collision with root package name */
    public double f5635q;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r7) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f5620a);
        G4.c(parcel, 3, this.f5621b);
        G4.c(parcel, 4, this.f5622c);
        G4.i(parcel, 5, 4);
        parcel.writeInt(this.f5623d);
        G4.e(parcel, 6, this.f5624e, r7);
        G4.b(parcel, 7, this.f5625f, r7);
        G4.b(parcel, 8, this.g, r7);
        G4.b(parcel, 9, this.f5626h, r7);
        G4.b(parcel, 10, this.f5627i, r7);
        G4.b(parcel, 11, this.f5628j, r7);
        G4.b(parcel, 12, this.f5629k, r7);
        G4.b(parcel, 13, this.f5630l, r7);
        G4.b(parcel, 14, this.f5631m, r7);
        G4.b(parcel, 15, this.f5632n, r7);
        G4.a(parcel, 16, this.f5633o);
        G4.i(parcel, 17, 4);
        parcel.writeInt(this.f5634p ? 1 : 0);
        G4.i(parcel, 18, 8);
        parcel.writeDouble(this.f5635q);
        G4.h(parcel, g);
    }
}
