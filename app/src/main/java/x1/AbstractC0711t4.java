package x1;

import android.util.Log;
import java.util.ArrayList;

/* renamed from: x1.t4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0711t4 {
    public static ArrayList a(Throwable th) {
        ArrayList arrayList = new ArrayList(3);
        if (th instanceof io.flutter.plugins.imagepicker.q) {
            io.flutter.plugins.imagepicker.q qVar = (io.flutter.plugins.imagepicker.q) th;
            arrayList.add(qVar.f3644J);
            arrayList.add(qVar.getMessage());
            arrayList.add(null);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
