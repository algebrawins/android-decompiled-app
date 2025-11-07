package A0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import m0.AbstractC0351b;
import p.d0;
import p.p0;

/* loaded from: classes.dex */
public final class H implements Parcelable.ClassLoaderCreator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f41a;

    public /* synthetic */ H(int r12) {
        this.f41a = r12;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f41a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new I(parcel, classLoader);
            case 1:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0351b.f4116b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new d0(parcel, classLoader);
            default:
                return new p0(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r22) {
        switch (this.f41a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new I[r22];
            case 1:
                return new AbstractC0351b[r22];
            case 2:
                return new d0[r22];
            default:
                return new p0[r22];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f41a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new I(parcel, null);
            case 1:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0351b.f4116b;
                }
                throw new IllegalStateException("superState must be null");
            case 2:
                return new d0(parcel, null);
            default:
                return new p0(parcel, null);
        }
    }
}
