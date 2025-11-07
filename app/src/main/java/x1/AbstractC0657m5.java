package x1;

import android.util.Log;
import java.util.ArrayList;
import x2.C0763b;

/* renamed from: x1.m5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0657m5 {
    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof C0763b) {
            C0763b c0763b = (C0763b) th;
            arrayList.add(c0763b.f6152J);
            arrayList.add(c0763b.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
