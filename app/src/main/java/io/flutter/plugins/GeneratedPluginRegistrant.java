package io.flutter.plugins;

import Q0.a;
import a2.C0073a;
import android.util.Log;
import androidx.annotation.Keep;
import b2.C0152a;
import c2.C0165d;
import d2.s;
import i2.c;
import io.flutter.plugins.imagepicker.m;
import io.flutter.plugins.pathprovider.e;
import v2.C0484a;
import w2.J;
import x2.C0767f;
import z2.C0959a;

@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(c cVar) {
        try {
            cVar.f3423d.a(new C0073a());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin app_links, com.llfbandit.app_links.AppLinksPlugin", e4);
        }
        try {
            cVar.f3423d.a(new C0152a());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e5);
        }
        try {
            cVar.f3423d.a(new C0484a());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e6);
        }
        try {
            cVar.f3423d.a(new C0959a());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin fluttertoast, io.github.ponnamkarthik.toast.fluttertoast.FlutterToastPlugin", e7);
        }
        try {
            cVar.f3423d.a(new m());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e8);
        }
        try {
            cVar.f3423d.a(new s());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin mobile_scanner, dev.steenbakker.mobile_scanner.MobileScannerPlugin", e9);
        }
        try {
            cVar.f3423d.a(new e());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e10);
        }
        try {
            cVar.f3423d.a(new a());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e11);
        }
        try {
            cVar.f3423d.a(new C0165d());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e12);
        }
        try {
            cVar.f3423d.a(new J());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e13);
        }
        try {
            cVar.f3423d.a(new C0767f());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e14);
        }
    }
}
