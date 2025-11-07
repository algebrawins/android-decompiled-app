package androidx.core.graphics.drawable;

import F0.a;
import F0.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import q0.k;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int r12 = iconCompat.f2260a;
        if (aVar.e(1)) {
            r12 = ((b) aVar).f608e.readInt();
        }
        iconCompat.f2260a = r12;
        byte[] bArr = iconCompat.f2262c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f608e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2262c = bArr;
        iconCompat.f2263d = aVar.f(iconCompat.f2263d, 3);
        int r13 = iconCompat.f2264e;
        if (aVar.e(4)) {
            r13 = ((b) aVar).f608e.readInt();
        }
        iconCompat.f2264e = r13;
        int r14 = iconCompat.f2265f;
        if (aVar.e(5)) {
            r14 = ((b) aVar).f608e.readInt();
        }
        iconCompat.f2265f = r14;
        iconCompat.g = (ColorStateList) aVar.f(iconCompat.g, 6);
        String str = iconCompat.f2267i;
        if (aVar.e(7)) {
            str = ((b) aVar).f608e.readString();
        }
        iconCompat.f2267i = str;
        String str2 = iconCompat.f2268j;
        if (aVar.e(8)) {
            str2 = ((b) aVar).f608e.readString();
        }
        iconCompat.f2268j = str2;
        iconCompat.f2266h = PorterDuff.Mode.valueOf(iconCompat.f2267i);
        switch (iconCompat.f2260a) {
            case -1:
                Parcelable parcelable = iconCompat.f2263d;
                if (parcelable != null) {
                    iconCompat.f2261b = parcelable;
                    break;
                } else {
                    throw new IllegalArgumentException("Invalid icon");
                }
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                Parcelable parcelable2 = iconCompat.f2263d;
                if (parcelable2 != null) {
                    iconCompat.f2261b = parcelable2;
                    break;
                } else {
                    byte[] bArr3 = iconCompat.f2262c;
                    iconCompat.f2261b = bArr3;
                    iconCompat.f2260a = 3;
                    iconCompat.f2264e = 0;
                    iconCompat.f2265f = bArr3.length;
                    break;
                }
            case 2:
            case 4:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                String str3 = new String(iconCompat.f2262c, Charset.forName("UTF-16"));
                iconCompat.f2261b = str3;
                if (iconCompat.f2260a == 2 && iconCompat.f2268j == null) {
                    iconCompat.f2268j = str3.split(":", -1)[0];
                    break;
                }
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f2261b = iconCompat.f2262c;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f2267i = iconCompat.f2266h.name();
        switch (iconCompat.f2260a) {
            case -1:
                iconCompat.f2263d = (Parcelable) iconCompat.f2261b;
                break;
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                iconCompat.f2263d = (Parcelable) iconCompat.f2261b;
                break;
            case 2:
                iconCompat.f2262c = ((String) iconCompat.f2261b).getBytes(Charset.forName("UTF-16"));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                iconCompat.f2262c = (byte[]) iconCompat.f2261b;
                break;
            case 4:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f2262c = iconCompat.f2261b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int r02 = iconCompat.f2260a;
        if (-1 != r02) {
            aVar.h(1);
            ((b) aVar).f608e.writeInt(r02);
        }
        byte[] bArr = iconCompat.f2262c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f608e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2263d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f608e.writeParcelable(parcelable, 0);
        }
        int r03 = iconCompat.f2264e;
        if (r03 != 0) {
            aVar.h(4);
            ((b) aVar).f608e.writeInt(r03);
        }
        int r04 = iconCompat.f2265f;
        if (r04 != 0) {
            aVar.h(5);
            ((b) aVar).f608e.writeInt(r04);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f608e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2267i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f608e.writeString(str);
        }
        String str2 = iconCompat.f2268j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f608e.writeString(str2);
        }
    }
}
