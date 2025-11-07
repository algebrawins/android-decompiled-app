package h1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import k1.H;
import r1.C0443a;
import x1.L4;

/* renamed from: h1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0285e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f3261a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0285e f3262b;

    /* JADX WARN: Type inference failed for: r0v2, types: [h1.e, java.lang.Object] */
    static {
        int r02 = AbstractC0286f.f3265c;
        f3261a = 12451000;
        f3262b = new Object();
    }

    public static int a(Context context) {
        int r02 = AbstractC0286f.f3265c;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent b(int r4, Context context, String str) {
        if (r4 != 1 && r4 != 2) {
            if (r4 != 3) {
                return null;
            }
            int r42 = H.f4016a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        } else if (context != null && L4.a(context)) {
            int r43 = H.f4016a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else {
            StringBuilder sb = new StringBuilder("gcore_");
            sb.append(f3261a);
            sb.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb.append(str);
            }
            sb.append("-");
            if (context != null) {
                sb.append(context.getPackageName());
            }
            sb.append("-");
            if (context != null) {
                try {
                    F1.c a4 = C0443a.a(context);
                    sb.append(a4.f620a.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String sb2 = sb.toString();
            int r5 = H.f4016a;
            Intent intent3 = new Intent("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(sb2)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
            }
            intent3.setData(appendQueryParameter.build());
            intent3.setPackage("com.android.vending");
            intent3.addFlags(524288);
            return intent3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cd A[EDGE_INSN: B:98:0x01cd->B:109:0x0209 ?: BREAK  ] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int c(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C0285e.c(android.content.Context, int):int");
    }
}
