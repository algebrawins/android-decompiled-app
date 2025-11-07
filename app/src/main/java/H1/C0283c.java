package h1;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import h2.J;
import java.util.Arrays;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: h1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283c extends AbstractC0347a {
    public static final Parcelable.Creator<C0283c> CREATOR = new C0015q(10);

    /* renamed from: a  reason: collision with root package name */
    public final String f3256a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3257b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3258c;

    public C0283c(long j3, String str, int r4) {
        this.f3256a = str;
        this.f3257b = r4;
        this.f3258c = j3;
    }

    public final long a() {
        long j3 = this.f3258c;
        if (j3 == -1) {
            return this.f3257b;
        }
        return j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0283c) {
            C0283c c0283c = (C0283c) obj;
            String str = this.f3256a;
            if (((str != null && str.equals(c0283c.f3256a)) || (str == null && c0283c.f3256a == null)) && a() == c0283c.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3256a, Long.valueOf(a())});
    }

    public final String toString() {
        J j3 = new J(this);
        j3.n(this.f3256a, "name");
        j3.n(Long.valueOf(a()), "version");
        return j3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.c(parcel, 1, this.f3256a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f3257b);
        long a4 = a();
        G4.i(parcel, 3, 8);
        parcel.writeLong(a4);
        G4.h(parcel, g);
    }

    public C0283c(String str, long j3) {
        this.f3256a = str;
        this.f3258c = j3;
        this.f3257b = -1;
    }
}
