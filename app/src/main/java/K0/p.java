package K0;

import android.location.LocationManager;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static /* synthetic */ PrecomputedText.Params.Builder h(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ DisplayCutout l(Object obj) {
        return (DisplayCutout) obj;
    }

    public static /* bridge */ /* synthetic */ boolean u(LocationManager locationManager) {
        return locationManager.isLocationEnabled();
    }

    public static /* bridge */ /* synthetic */ boolean v(Object obj) {
        return obj instanceof DisplayCutout;
    }
}
