package x1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l1.AbstractC0347a;

/* renamed from: x1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571b extends AbstractC0347a {
    public static final Parcelable.Creator<C0571b> CREATOR = new C0563a(7);

    /* renamed from: a  reason: collision with root package name */
    public int f5850a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f5851b;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0571b)) {
            return false;
        }
        C0571b c0571b = (C0571b) obj;
        if (this.f5850a == c0571b.f5850a && k1.w.h(Boolean.valueOf(this.f5851b), Boolean.valueOf(c0571b.f5851b))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5850a), Boolean.valueOf(this.f5851b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        int r02 = this.f5850a;
        G4.i(parcel, 2, 4);
        parcel.writeInt(r02);
        G4.i(parcel, 3, 4);
        parcel.writeInt(this.f5851b ? 1 : 0);
        G4.h(parcel, g);
    }
}
