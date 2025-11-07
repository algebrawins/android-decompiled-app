package x1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.AbstractActivityC0292d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: x1.q0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0684q0 {
    public static String a(Context context, String str) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 31 && d(context, null, str)) {
            return str;
        }
        if (r02 < 29) {
            if (d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            if (!d(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
                return null;
            }
            return "android.permission.ACCESS_COARSE_LOCATION";
        } else if (!d(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return null;
        } else {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
    }

    public static int b(AbstractActivityC0292d abstractActivityC0292d, String str) {
        if (abstractActivityC0292d == null || Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        boolean z3 = abstractActivityC0292d.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
        boolean d4 = AbstractC0723v0.d(abstractActivityC0292d, str);
        if (z3) {
            if (!d4) {
                d4 = true;
            } else {
                d4 = false;
            }
        }
        if (!z3 && d4) {
            abstractActivityC0292d.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
        }
        if (!z3 || !d4) {
            return 0;
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x014e, code lost:
        if (r8 != false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList c(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.AbstractC0684q0.c(android.content.Context, int):java.util.ArrayList");
    }

    public static boolean d(Context context, ArrayList arrayList, String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((String) it.next()).equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e4) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e4);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(4096L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = packageManager.getPackageInfo(context.getPackageName(), RecognitionOptions.AZTEC);
        }
        if (packageInfo == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(packageInfo.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static Integer e(HashSet hashSet) {
        if (hashSet.contains(4)) {
            return 4;
        }
        if (hashSet.contains(2)) {
            return 2;
        }
        if (hashSet.contains(0)) {
            return 0;
        }
        if (hashSet.contains(3)) {
            return 3;
        }
        return 1;
    }

    public static int f(AbstractActivityC0292d abstractActivityC0292d, String str, int r3) {
        if (r3 == -1) {
            return b(abstractActivityC0292d, str);
        }
        return 1;
    }
}
