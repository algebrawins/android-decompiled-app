package A0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class P implements Parcelable {
    public static final Parcelable.Creator<P> CREATOR = new C0015q(1);

    /* renamed from: a  reason: collision with root package name */
    public int f57a;

    /* renamed from: b  reason: collision with root package name */
    public int f58b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f59c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f60d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f57a + ", mGapDir=" + this.f58b + ", mHasUnwantedGapAfter=" + this.f60d + ", mGapPerSpan=" + Arrays.toString(this.f59c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r3) {
        parcel.writeInt(this.f57a);
        parcel.writeInt(this.f58b);
        parcel.writeInt(this.f60d ? 1 : 0);
        int[] r32 = this.f59c;
        if (r32 != null && r32.length > 0) {
            parcel.writeInt(r32.length);
            parcel.writeIntArray(this.f59c);
            return;
        }
        parcel.writeInt(0);
    }
}
