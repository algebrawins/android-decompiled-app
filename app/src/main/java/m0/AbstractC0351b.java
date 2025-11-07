package m0;

import A0.H;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0351b implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final Parcelable f4117a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0350a f4116b = new AbstractC0351b();
    public static final Parcelable.Creator<AbstractC0351b> CREATOR = new H(1);

    public AbstractC0351b() {
        this.f4117a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r3) {
        parcel.writeParcelable(this.f4117a, r3);
    }

    public AbstractC0351b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f4117a = parcelable == f4116b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0351b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f4117a = readParcelable == null ? f4116b : readParcelable;
    }
}
