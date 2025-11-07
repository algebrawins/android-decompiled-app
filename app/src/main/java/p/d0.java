package p;

import android.os.Parcel;
import android.os.Parcelable;
import m0.AbstractC0351b;

/* loaded from: classes.dex */
public final class d0 extends AbstractC0351b {
    public static final Parcelable.Creator<d0> CREATOR = new A0.H(2);

    /* renamed from: c  reason: collision with root package name */
    public boolean f4589c;

    public d0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4589c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f4589c + "}";
    }

    @Override // m0.AbstractC0351b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r22) {
        super.writeToParcel(parcel, r22);
        parcel.writeValue(Boolean.valueOf(this.f4589c));
    }
}
