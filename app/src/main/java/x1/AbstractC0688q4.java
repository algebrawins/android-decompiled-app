package x1;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import h.C0275b;
import h.C0276c;
import h.C0277d;
import h.InterfaceC0278e;

/* renamed from: x1.q4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0688q4 {
    public static ResolveInfo a(Activity activity) {
        N2.g.e(activity, "context");
        return activity.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
    }

    public static ResolveInfo b(Activity activity) {
        N2.g.e(activity, "context");
        return activity.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
    }

    public static String c(InterfaceC0278e interfaceC0278e) {
        N2.g.e(interfaceC0278e, "input");
        if (interfaceC0278e instanceof C0276c) {
            return "image/*";
        }
        if (interfaceC0278e instanceof C0277d) {
            return "video/*";
        }
        if (interfaceC0278e instanceof C0275b) {
            return null;
        }
        throw new RuntimeException();
    }
}
