package androidx.core.app;

import F0.a;
import F0.b;
import F0.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f2253a;
        boolean z3 = true;
        if (aVar.e(1)) {
            cVar = aVar.g();
        }
        remoteActionCompat.f2253a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f2254b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f608e);
        }
        remoteActionCompat.f2254b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2255c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f608e);
        }
        remoteActionCompat.f2255c = charSequence2;
        remoteActionCompat.f2256d = (PendingIntent) aVar.f(remoteActionCompat.f2256d, 4);
        boolean z4 = remoteActionCompat.f2257e;
        if (aVar.e(5)) {
            if (((b) aVar).f608e.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        remoteActionCompat.f2257e = z4;
        boolean z5 = remoteActionCompat.f2258f;
        if (aVar.e(6)) {
            if (((b) aVar).f608e.readInt() == 0) {
                z3 = false;
            }
            z5 = z3;
        }
        remoteActionCompat.f2258f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f2253a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2254b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f608e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2255c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2256d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z3 = remoteActionCompat.f2257e;
        aVar.h(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f2258f;
        aVar.h(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
