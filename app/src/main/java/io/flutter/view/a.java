package io.flutter.view;

import android.hardware.camera2.params.OutputConfiguration;
import android.util.Size;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ OutputConfiguration c(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    public static /* synthetic */ Locale.LanguageRange f(String str) {
        return new Locale.LanguageRange(str);
    }

    public static /* synthetic */ void h() {
    }
}
