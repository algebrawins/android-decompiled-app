package x1;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class a7 extends AbstractC0347a {
    public static final Parcelable.Creator<a7> CREATOR = new C0563a(12);

    /* renamed from: a  reason: collision with root package name */
    public final int f5836a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5837b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5838c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f5839d;

    /* renamed from: e  reason: collision with root package name */
    public final Point[] f5840e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5841f;
    public final T6 g;

    /* renamed from: h  reason: collision with root package name */
    public final W6 f5842h;

    /* renamed from: i  reason: collision with root package name */
    public final X6 f5843i;

    /* renamed from: j  reason: collision with root package name */
    public final Z6 f5844j;

    /* renamed from: k  reason: collision with root package name */
    public final Y6 f5845k;

    /* renamed from: l  reason: collision with root package name */
    public final U6 f5846l;

    /* renamed from: m  reason: collision with root package name */
    public final Q6 f5847m;

    /* renamed from: n  reason: collision with root package name */
    public final R6 f5848n;

    /* renamed from: o  reason: collision with root package name */
    public final S6 f5849o;

    public a7(int r12, String str, String str2, byte[] bArr, Point[] pointArr, int r6, T6 t6, W6 w6, X6 x6, Z6 z6, Y6 y6, U6 u6, Q6 q6, R6 r62, S6 s6) {
        this.f5836a = r12;
        this.f5837b = str;
        this.f5838c = str2;
        this.f5839d = bArr;
        this.f5840e = pointArr;
        this.f5841f = r6;
        this.g = t6;
        this.f5842h = w6;
        this.f5843i = x6;
        this.f5844j = z6;
        this.f5845k = y6;
        this.f5846l = u6;
        this.f5847m = q6;
        this.f5848n = r62;
        this.f5849o = s6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f5836a);
        G4.c(parcel, 2, this.f5837b);
        G4.c(parcel, 3, this.f5838c);
        G4.a(parcel, 4, this.f5839d);
        G4.e(parcel, 5, this.f5840e, r6);
        G4.i(parcel, 6, 4);
        parcel.writeInt(this.f5841f);
        G4.b(parcel, 7, this.g, r6);
        G4.b(parcel, 8, this.f5842h, r6);
        G4.b(parcel, 9, this.f5843i, r6);
        G4.b(parcel, 10, this.f5844j, r6);
        G4.b(parcel, 11, this.f5845k, r6);
        G4.b(parcel, 12, this.f5846l, r6);
        G4.b(parcel, 13, this.f5847m, r6);
        G4.b(parcel, 14, this.f5848n, r6);
        G4.b(parcel, 15, this.f5849o, r6);
        G4.h(parcel, g);
    }
}
