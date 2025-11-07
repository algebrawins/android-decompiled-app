package x1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class F4 {
    public static byte[] a(Parcel parcel, int r3) {
        int m3 = m(parcel, r3);
        int dataPosition = parcel.dataPosition();
        if (m3 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + m3);
        return createByteArray;
    }

    public static Parcelable b(Parcel parcel, int r22, Parcelable.Creator creator) {
        int m3 = m(parcel, r22);
        int dataPosition = parcel.dataPosition();
        if (m3 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + m3);
        return parcelable;
    }

    public static String c(Parcel parcel, int r3) {
        int m3 = m(parcel, r3);
        int dataPosition = parcel.dataPosition();
        if (m3 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + m3);
        return readString;
    }

    public static String[] d(Parcel parcel, int r3) {
        int m3 = m(parcel, r3);
        int dataPosition = parcel.dataPosition();
        if (m3 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + m3);
        return createStringArray;
    }

    public static Object[] e(Parcel parcel, int r22, Parcelable.Creator creator) {
        int m3 = m(parcel, r22);
        int dataPosition = parcel.dataPosition();
        if (m3 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + m3);
        return createTypedArray;
    }

    public static ArrayList f(Parcel parcel, int r22, Parcelable.Creator creator) {
        int m3 = m(parcel, r22);
        int dataPosition = parcel.dataPosition();
        if (m3 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + m3);
        return createTypedArrayList;
    }

    public static void g(Parcel parcel, int r3) {
        if (parcel.dataPosition() == r3) {
            return;
        }
        throw new B2.b(D.C.w("Overread allowed size end=", r3), parcel);
    }

    public static boolean h(Parcel parcel, int r22) {
        p(parcel, r22, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static double i(Parcel parcel, int r22) {
        p(parcel, r22, 8);
        return parcel.readDouble();
    }

    public static int j(Parcel parcel, int r22) {
        p(parcel, r22, 4);
        return parcel.readInt();
    }

    public static long k(Parcel parcel, int r22) {
        p(parcel, r22, 8);
        return parcel.readLong();
    }

    public static Long l(Parcel parcel, int r5) {
        int m3 = m(parcel, r5);
        if (m3 == 0) {
            return null;
        }
        if (m3 == 8) {
            return Long.valueOf(parcel.readLong());
        }
        String hexString = Integer.toHexString(m3);
        throw new B2.b("Expected size 8 got " + m3 + " (0x" + hexString + ")", parcel);
    }

    public static int m(Parcel parcel, int r3) {
        if ((r3 & (-65536)) != -65536) {
            return (char) (r3 >> 16);
        }
        return parcel.readInt();
    }

    public static void n(Parcel parcel, int r22) {
        parcel.setDataPosition(parcel.dataPosition() + m(parcel, r22));
    }

    public static int o(Parcel parcel) {
        int readInt = parcel.readInt();
        int m3 = m(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) == 20293) {
            int r12 = m3 + dataPosition;
            if (r12 >= dataPosition && r12 <= parcel.dataSize()) {
                return r12;
            }
            throw new B2.b(D.C.x("Size read is invalid start=", dataPosition, " end=", r12), parcel);
        }
        throw new B2.b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void p(Parcel parcel, int r5, int r6) {
        int m3 = m(parcel, r5);
        if (m3 == r6) {
            return;
        }
        String hexString = Integer.toHexString(m3);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(r6);
        sb.append(" got ");
        sb.append(m3);
        sb.append(" (0x");
        throw new B2.b(D.C.z(sb, hexString, ")"), parcel);
    }
}
