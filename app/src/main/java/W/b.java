package W;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class b {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int r14) {
        String str2;
        int r12 = 1;
        if ((r14 & 4) != 0 && str == null) {
            String str3 = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
            int myPid = Process.myPid();
            int myUid = Process.myUid();
            String packageName = context.getPackageName();
            char c4 = 65535;
            if (context.checkPermission(str3, myPid, myUid) != -1) {
                int r142 = Build.VERSION.SDK_INT;
                if (r142 >= 23) {
                    str2 = U.d.d(str3);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    if (packageName == null) {
                        String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                        if (packagesForUid != null && packagesForUid.length > 0) {
                            packageName = packagesForUid[0];
                        }
                    }
                    int myUid2 = Process.myUid();
                    String packageName2 = context.getPackageName();
                    if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                        if (r142 >= 29) {
                            AppOpsManager c5 = U.e.c(context);
                            r12 = U.e.a(c5, str2, Binder.getCallingUid(), packageName);
                            if (r12 == 0) {
                                r12 = U.e.a(c5, str2, myUid, U.e.b(context));
                            }
                        } else if (r142 >= 23) {
                            r12 = U.d.c((AppOpsManager) U.d.a(context, AppOpsManager.class), str2, packageName);
                        }
                    } else if (r142 >= 23) {
                        r12 = U.d.c((AppOpsManager) U.d.a(context, AppOpsManager.class), str2, packageName);
                    }
                    if (r12 != 0) {
                        c4 = 65534;
                    }
                }
                c4 = 0;
            }
            if (c4 == 0) {
                return context.registerReceiver(broadcastReceiver, intentFilter, str3, handler);
            }
            throw new RuntimeException("Permission " + str3 + " is required by your application to receive broadcasts, please add it to your manifest");
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, r14 & 1);
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
