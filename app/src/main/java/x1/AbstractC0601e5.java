package x1;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: x1.e5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0601e5 {
    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(th.toString());
        arrayList.add(th.getClass().getSimpleName());
        arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        return arrayList;
    }
}
