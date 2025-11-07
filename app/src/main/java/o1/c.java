package o1;

import android.os.Parcel;
import android.os.Parcelable;
import h1.C0283c;
import java.util.ArrayList;
import x1.F4;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int o3 = F4.o(parcel);
        ArrayList arrayList = null;
        String str = null;
        String str2 = null;
        boolean z3 = false;
        while (parcel.dataPosition() < o3) {
            int readInt = parcel.readInt();
            char c4 = (char) readInt;
            if (c4 != 1) {
                if (c4 != 2) {
                    if (c4 != 3) {
                        if (c4 != 4) {
                            F4.n(parcel, readInt);
                        } else {
                            str2 = F4.c(parcel, readInt);
                        }
                    } else {
                        str = F4.c(parcel, readInt);
                    }
                } else {
                    z3 = F4.h(parcel, readInt);
                }
            } else {
                arrayList = F4.f(parcel, readInt, C0283c.CREATOR);
            }
        }
        F4.g(parcel, o3);
        return new C0398a(arrayList, z3, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r12) {
        return new C0398a[r12];
    }
}
