package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import k0.C0322i;
import y0.f;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File cacheDir;
        Context createDeviceProtectedStorageContext;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            f.s(context, new Object(), new C0322i(27, this), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    C0322i c0322i = new C0322i(27, this);
                    try {
                        f.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        c0322i.e(10, null);
                    } catch (PackageManager.NameNotFoundException e4) {
                        c0322i.e(7, e4);
                    }
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                    setResultCode(11);
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C0322i c0322i2 = new C0322i(27, this);
            if (Build.VERSION.SDK_INT >= 24) {
                Process.sendSignal(Process.myPid(), 10);
                c0322i2.e(12, null);
                return;
            }
            c0322i2.e(13, null);
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            C0322i c0322i3 = new C0322i(27, this);
            if ("DROP_SHADER_CACHE".equals(string2)) {
                int r7 = Build.VERSION.SDK_INT;
                if (r7 >= 24) {
                    createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                    cacheDir = createDeviceProtectedStorageContext.getCodeCacheDir();
                } else if (r7 >= 23) {
                    cacheDir = context.getCodeCacheDir();
                } else {
                    cacheDir = context.getCacheDir();
                }
                if (f.c(cacheDir)) {
                    c0322i3.e(14, null);
                    return;
                } else {
                    c0322i3.e(15, null);
                    return;
                }
            }
            c0322i3.e(16, null);
        }
    }
}
