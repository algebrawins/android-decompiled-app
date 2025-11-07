package x1;

import android.content.Context;
import android.os.Build;
import java.io.File;

/* renamed from: x1.p5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0681p5 {
    public static String a(Context context) {
        File dataDir;
        if (Build.VERSION.SDK_INT >= 24) {
            dataDir = context.getDataDir();
            return dataDir.getPath();
        }
        return context.getApplicationInfo().dataDir;
    }
}
