package A0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class S implements Parcelable {
    public static final Parcelable.Creator<S> CREATOR = new C0015q(2);

    /* renamed from: a  reason: collision with root package name */
    public int f62a;

    /* renamed from: b  reason: collision with root package name */
    public int f63b;

    /* renamed from: c  reason: collision with root package name */
    public int f64c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f65d;

    /* renamed from: e  reason: collision with root package name */
    public int f66e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f67f;
    public ArrayList g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f68h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f69i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f70j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r22) {
        parcel.writeInt(this.f62a);
        parcel.writeInt(this.f63b);
        parcel.writeInt(this.f64c);
        if (this.f64c > 0) {
            parcel.writeIntArray(this.f65d);
        }
        parcel.writeInt(this.f66e);
        if (this.f66e > 0) {
            parcel.writeIntArray(this.f67f);
        }
        parcel.writeInt(this.f68h ? 1 : 0);
        parcel.writeInt(this.f69i ? 1 : 0);
        parcel.writeInt(this.f70j ? 1 : 0);
        parcel.writeList(this.g);
    }
}
