package x1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public abstract class G4 {
    public static void a(Parcel parcel, int r12, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int g = g(parcel, r12);
        parcel.writeByteArray(bArr);
        h(parcel, g);
    }

    public static void b(Parcel parcel, int r12, Parcelable parcelable, int r3) {
        if (parcelable == null) {
            return;
        }
        int g = g(parcel, r12);
        parcelable.writeToParcel(parcel, r3);
        h(parcel, g);
    }

    public static void c(Parcel parcel, int r12, String str) {
        if (str == null) {
            return;
        }
        int g = g(parcel, r12);
        parcel.writeString(str);
        h(parcel, g);
    }

    public static void d(Parcel parcel, int r12, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int g = g(parcel, r12);
        parcel.writeStringArray(strArr);
        h(parcel, g);
    }

    public static void e(Parcel parcel, int r7, Parcelable[] parcelableArr, int r9) {
        if (parcelableArr == null) {
            return;
        }
        int g = g(parcel, r7);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, r9);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        h(parcel, g);
    }

    public static void f(Parcel parcel, int r7, List list) {
        if (list == null) {
            return;
        }
        int g = g(parcel, r7);
        int size = list.size();
        parcel.writeInt(size);
        for (int r22 = 0; r22 < size; r22++) {
            Parcelable parcelable = (Parcelable) list.get(r22);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        h(parcel, g);
    }

    public static int g(Parcel parcel, int r22) {
        parcel.writeInt(r22 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void h(Parcel parcel, int r3) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(r3 - 4);
        parcel.writeInt(dataPosition - r3);
        parcel.setDataPosition(dataPosition);
    }

    public static void i(Parcel parcel, int r12, int r22) {
        parcel.writeInt(r12 | (r22 << 16));
    }
}
