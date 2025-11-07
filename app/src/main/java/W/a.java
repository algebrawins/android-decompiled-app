package W;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public abstract class a {
    public static File a(Context context) {
        return context.getCodeCacheDir();
    }

    public static Drawable b(Context context, int r12) {
        return context.getDrawable(r12);
    }

    public static File c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
