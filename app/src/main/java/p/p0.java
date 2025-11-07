package p;

import android.os.Parcel;
import android.os.Parcelable;
import m0.AbstractC0351b;

/* loaded from: classes.dex */
public final class p0 extends AbstractC0351b {
    public static final Parcelable.Creator<p0> CREATOR = new A0.H(3);

    /* renamed from: c  reason: collision with root package name */
    public int f4675c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4676d;

    public p0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z3;
        this.f4675c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f4676d = z3;
    }

    @Override // m0.AbstractC0351b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r22) {
        super.writeToParcel(parcel, r22);
        parcel.writeInt(this.f4675c);
        parcel.writeInt(this.f4676d ? 1 : 0);
    }
}
