package x1;

import android.util.Log;
import io.flutter.plugins.GeneratedPluginRegistrant;

/* loaded from: classes.dex */
public abstract class J4 {
    public static void a(i2.c cVar) {
        try {
            GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", i2.c.class).invoke(null, cVar);
        } catch (Exception e4) {
            Log.e("GeneratedPluginsRegister", "Tried to automatically register plugins with FlutterEngine (" + cVar + ") but could not find or invoke the GeneratedPluginRegistrant.");
            Log.e("GeneratedPluginsRegister", "Received exception while registering", e4);
        }
    }
}
