package A;

import android.app.NotificationChannel;
import android.os.Build;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ NotificationChannel d(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* bridge */ /* synthetic */ AutofillManager j(Object obj) {
        return (AutofillManager) obj;
    }

    public static /* bridge */ /* synthetic */ AutofillValue l(Object obj) {
        return (AutofillValue) obj;
    }

    public static /* bridge */ /* synthetic */ Class p() {
        return AutofillManager.class;
    }

    public static /* bridge */ /* synthetic */ String q() {
        return Build.getSerial();
    }
}
