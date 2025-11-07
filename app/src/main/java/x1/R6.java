package x1;

import android.os.Parcel;
import android.os.Parcelable;
import l1.AbstractC0347a;

/* loaded from: classes.dex */
public final class R6 extends AbstractC0347a {
    public static final Parcelable.Creator<R6> CREATOR = new C0563a(15);

    /* renamed from: a  reason: collision with root package name */
    public final V6 f5725a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5726b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5727c;

    /* renamed from: d  reason: collision with root package name */
    public final W6[] f5728d;

    /* renamed from: e  reason: collision with root package name */
    public final T6[] f5729e;

    /* renamed from: f  reason: collision with root package name */
    public final String[] f5730f;
    public final O6[] g;

    public R6(V6 v6, String str, String str2, W6[] w6Arr, T6[] t6Arr, String[] strArr, O6[] o6Arr) {
        this.f5725a = v6;
        this.f5726b = str;
        this.f5727c = str2;
        this.f5728d = w6Arr;
        this.f5729e = t6Arr;
        this.f5730f = strArr;
        this.g = o6Arr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.b(parcel, 1, this.f5725a, r5);
        G4.c(parcel, 2, this.f5726b);
        G4.c(parcel, 3, this.f5727c);
        G4.e(parcel, 4, this.f5728d, r5);
        G4.e(parcel, 5, this.f5729e, r5);
        G4.d(parcel, 6, this.f5730f);
        G4.e(parcel, 7, this.g, r5);
        G4.h(parcel, g);
    }
}
