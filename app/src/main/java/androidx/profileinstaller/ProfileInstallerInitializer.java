package androidx.profileinstaller;

import C0.b;
import D.RunnableC0023c;
import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import y0.i;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // C0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // C0.b
    public final Object b(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new Object();
        }
        i.a(new RunnableC0023c(22, this, context.getApplicationContext()));
        return new Object();
    }
}
