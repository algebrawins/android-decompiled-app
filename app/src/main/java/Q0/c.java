package Q0;

import A.k;
import U.q;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.AbstractActivityC0292d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import q2.n;
import r2.o;
import r2.p;
import x1.AbstractC0684q0;
import x1.AbstractC0723v0;

/* loaded from: classes.dex */
public final class c implements o, p {

    /* renamed from: J  reason: collision with root package name */
    public final Context f1053J;

    /* renamed from: K  reason: collision with root package name */
    public k f1054K;

    /* renamed from: L  reason: collision with root package name */
    public AbstractActivityC0292d f1055L;

    /* renamed from: M  reason: collision with root package name */
    public int f1056M;

    /* renamed from: N  reason: collision with root package name */
    public HashMap f1057N;

    public c(Context context) {
        this.f1053J = context;
    }

    @Override // r2.p
    public final boolean a(int r21, String[] strArr, int[] r23) {
        int r8;
        int r5 = 14;
        if (r21 != 24) {
            this.f1056M = 0;
            return false;
        } else if (this.f1057N == null) {
            return false;
        } else {
            if (strArr.length == 0 && r23.length == 0) {
                this.f1056M = 0;
                Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
                return false;
            }
            List asList = Arrays.asList(strArr);
            int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
            if (indexOf >= 0) {
                int f2 = AbstractC0684q0.f(this.f1055L, "android.permission.WRITE_CALENDAR", r23[indexOf]);
                this.f1057N.put(36, Integer.valueOf(f2));
                int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
                if (indexOf2 >= 0) {
                    int f4 = AbstractC0684q0.f(this.f1055L, "android.permission.READ_CALENDAR", r23[indexOf2]);
                    Integer valueOf = Integer.valueOf(f2);
                    Integer valueOf2 = Integer.valueOf(f4);
                    HashSet hashSet = new HashSet();
                    hashSet.add(valueOf);
                    hashSet.add(valueOf2);
                    Integer e4 = AbstractC0684q0.e(hashSet);
                    this.f1057N.put(37, e4);
                    this.f1057N.put(0, e4);
                }
            }
            int r3 = 0;
            while (r3 < strArr.length) {
                String str = strArr[r3];
                if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR")) {
                    char c4 = 65535;
                    switch (str.hashCode()) {
                        case -2062386608:
                            if (str.equals("android.permission.READ_SMS")) {
                                c4 = 0;
                                break;
                            }
                            break;
                        case -1928411001:
                            if (str.equals("android.permission.READ_CALENDAR")) {
                                c4 = 1;
                                break;
                            }
                            break;
                        case -1925850455:
                            if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                                c4 = 2;
                                break;
                            }
                            break;
                        case -1921431796:
                            if (str.equals("android.permission.READ_CALL_LOG")) {
                                c4 = 3;
                                break;
                            }
                            break;
                        case -1888586689:
                            if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                                c4 = 4;
                                break;
                            }
                            break;
                        case -1813079487:
                            if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                                c4 = 5;
                                break;
                            }
                            break;
                        case -1783097621:
                            if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                                c4 = 6;
                                break;
                            }
                            break;
                        case -1561629405:
                            if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                                c4 = 7;
                                break;
                            }
                            break;
                        case -1479758289:
                            if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                                c4 = '\b';
                                break;
                            }
                            break;
                        case -1238066820:
                            if (str.equals("android.permission.BODY_SENSORS")) {
                                c4 = '\t';
                                break;
                            }
                            break;
                        case -1164582768:
                            if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                                c4 = '\n';
                                break;
                            }
                            break;
                        case -909527021:
                            if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                                c4 = 11;
                                break;
                            }
                            break;
                        case -895679497:
                            if (str.equals("android.permission.RECEIVE_MMS")) {
                                c4 = '\f';
                                break;
                            }
                            break;
                        case -895673731:
                            if (str.equals("android.permission.RECEIVE_SMS")) {
                                c4 = '\r';
                                break;
                            }
                            break;
                        case -798669607:
                            if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                                c4 = 14;
                                break;
                            }
                            break;
                        case -406040016:
                            if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                                c4 = 15;
                                break;
                            }
                            break;
                        case -63024214:
                            if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                                c4 = 16;
                                break;
                            }
                            break;
                        case -5573545:
                            if (str.equals("android.permission.READ_PHONE_STATE")) {
                                c4 = 17;
                                break;
                            }
                            break;
                        case 52602690:
                            if (str.equals("android.permission.SEND_SMS")) {
                                c4 = 18;
                                break;
                            }
                            break;
                        case 112197485:
                            if (str.equals("android.permission.CALL_PHONE")) {
                                c4 = 19;
                                break;
                            }
                            break;
                        case 175802396:
                            if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                                c4 = 20;
                                break;
                            }
                            break;
                        case 214526995:
                            if (str.equals("android.permission.WRITE_CONTACTS")) {
                                c4 = 21;
                                break;
                            }
                            break;
                        case 361658321:
                            if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                                c4 = 22;
                                break;
                            }
                            break;
                        case 463403621:
                            if (str.equals("android.permission.CAMERA")) {
                                c4 = 23;
                                break;
                            }
                            break;
                        case 603653886:
                            if (str.equals("android.permission.WRITE_CALENDAR")) {
                                c4 = 24;
                                break;
                            }
                            break;
                        case 610633091:
                            if (str.equals("android.permission.WRITE_CALL_LOG")) {
                                c4 = 25;
                                break;
                            }
                            break;
                        case 691260818:
                            if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                                c4 = 26;
                                break;
                            }
                            break;
                        case 710297143:
                            if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                                c4 = 27;
                                break;
                            }
                            break;
                        case 784519842:
                            if (str.equals("android.permission.USE_SIP")) {
                                c4 = 28;
                                break;
                            }
                            break;
                        case 970694249:
                            if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                                c4 = 29;
                                break;
                            }
                            break;
                        case 1166454870:
                            if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                                c4 = 30;
                                break;
                            }
                            break;
                        case 1271781903:
                            if (str.equals("android.permission.GET_ACCOUNTS")) {
                                c4 = 31;
                                break;
                            }
                            break;
                        case 1365911975:
                            if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                                c4 = ' ';
                                break;
                            }
                            break;
                        case 1777263169:
                            if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                                c4 = '!';
                                break;
                            }
                            break;
                        case 1780337063:
                            if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                                c4 = '\"';
                                break;
                            }
                            break;
                        case 1831139720:
                            if (str.equals("android.permission.RECORD_AUDIO")) {
                                c4 = '#';
                                break;
                            }
                            break;
                        case 1977429404:
                            if (str.equals("android.permission.READ_CONTACTS")) {
                                c4 = '$';
                                break;
                            }
                            break;
                        case 2024715147:
                            if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                                c4 = '%';
                                break;
                            }
                            break;
                        case 2062356686:
                            if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                                c4 = '&';
                                break;
                            }
                            break;
                        case 2114579147:
                            if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                                c4 = '\'';
                                break;
                            }
                            break;
                        case 2133799037:
                            if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                                c4 = '(';
                                break;
                            }
                            break;
                    }
                    switch (c4) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        case '\b':
                        case '\f':
                        case '\r':
                        case 18:
                            r8 = 13;
                            break;
                        case 1:
                        case 24:
                            r8 = 0;
                            break;
                        case 2:
                            r8 = 17;
                            break;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                        case '\n':
                        case 17:
                        case 19:
                        case 25:
                        case 28:
                        case '(':
                            r8 = 8;
                            break;
                        case 4:
                        case 16:
                            r8 = 3;
                            break;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            r8 = 22;
                            break;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            r8 = 27;
                            break;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            r8 = 23;
                            break;
                        case '\t':
                            r8 = 12;
                            break;
                        case 11:
                            r8 = 31;
                            break;
                        case 14:
                            r8 = 30;
                            break;
                        case 15:
                        case ' ':
                            r8 = 15;
                            break;
                        case 20:
                            r8 = 9;
                            break;
                        case 21:
                        case 31:
                        case '$':
                            r8 = 2;
                            break;
                        case 22:
                            r8 = 35;
                            break;
                        case 23:
                            r8 = 1;
                            break;
                        case 26:
                            r8 = 33;
                            break;
                        case 27:
                            r8 = 32;
                            break;
                        case 29:
                            r8 = 34;
                            break;
                        case 30:
                            r8 = 29;
                            break;
                        case '!':
                            r8 = 24;
                            break;
                        case '\"':
                            r8 = 19;
                            break;
                        case '#':
                            r8 = 7;
                            break;
                        case '%':
                            r8 = 4;
                            break;
                        case '&':
                            r8 = 28;
                            break;
                        case '\'':
                            r8 = 18;
                            break;
                        default:
                            r8 = 20;
                            break;
                    }
                    if (r8 != 20) {
                        int r14 = r23[r3];
                        if (r8 == 8) {
                            Integer valueOf3 = Integer.valueOf(AbstractC0684q0.f(this.f1055L, str, r14));
                            HashSet hashSet2 = new HashSet();
                            hashSet2.add((Integer) this.f1057N.get(8));
                            hashSet2.add(valueOf3);
                            this.f1057N.put(8, AbstractC0684q0.e(hashSet2));
                        } else if (r8 == 7) {
                            if (!this.f1057N.containsKey(7)) {
                                this.f1057N.put(7, Integer.valueOf(AbstractC0684q0.f(this.f1055L, str, r14)));
                            }
                            if (!this.f1057N.containsKey(Integer.valueOf(r5))) {
                                this.f1057N.put(Integer.valueOf(r5), Integer.valueOf(AbstractC0684q0.f(this.f1055L, str, r14)));
                            }
                        } else if (r8 == 4) {
                            int f5 = AbstractC0684q0.f(this.f1055L, str, r14);
                            if (!this.f1057N.containsKey(4)) {
                                this.f1057N.put(4, Integer.valueOf(f5));
                            }
                        } else {
                            if (r8 == 3) {
                                int f6 = AbstractC0684q0.f(this.f1055L, str, r14);
                                if (Build.VERSION.SDK_INT < 29 && !this.f1057N.containsKey(4)) {
                                    this.f1057N.put(4, Integer.valueOf(f6));
                                }
                                if (!this.f1057N.containsKey(5)) {
                                    this.f1057N.put(5, Integer.valueOf(f6));
                                }
                                this.f1057N.put(Integer.valueOf(r8), Integer.valueOf(f6));
                            } else if (r8 != 9 && r8 != 32) {
                                if (!this.f1057N.containsKey(Integer.valueOf(r8))) {
                                    this.f1057N.put(Integer.valueOf(r8), Integer.valueOf(AbstractC0684q0.f(this.f1055L, str, r14)));
                                }
                            } else {
                                this.f1057N.put(Integer.valueOf(r8), Integer.valueOf(c(r8)));
                            }
                            r3++;
                            r5 = 14;
                        }
                    }
                }
                r3++;
                r5 = 14;
            }
            int length = this.f1056M - r23.length;
            this.f1056M = length;
            k kVar = this.f1054K;
            if (kVar != null && length == 0) {
                ((n) kVar.f22K).c(this.f1057N);
            }
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // r2.o
    public final boolean b(int r4, int r5, Intent intent) {
        char c4;
        boolean canScheduleExactAlarms;
        boolean isNotificationPolicyAccessGranted;
        boolean canRequestPackageInstalls;
        boolean canDrawOverlays;
        boolean isExternalStorageManager;
        int r6;
        boolean isIgnoringBatteryOptimizations;
        AbstractActivityC0292d abstractActivityC0292d = this.f1055L;
        char c5 = 0;
        c5 = 0;
        if (abstractActivityC0292d == null) {
            return false;
        }
        if (this.f1057N == null) {
            this.f1056M = 0;
            return false;
        }
        int r22 = 23;
        if (r4 == 209) {
            if (Build.VERSION.SDK_INT >= 23) {
                Context context = this.f1053J;
                String packageName = context.getPackageName();
                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                if (powerManager != null) {
                    isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
                    if (isIgnoringBatteryOptimizations) {
                        c5 = 1;
                    }
                }
            } else {
                c5 = 2;
            }
            r22 = 16;
            r6 = c5;
        } else if (r4 == 210) {
            if (Build.VERSION.SDK_INT >= 30) {
                isExternalStorageManager = Environment.isExternalStorageManager();
                r22 = 22;
                r6 = isExternalStorageManager;
            } else {
                return false;
            }
        } else if (r4 == 211) {
            if (Build.VERSION.SDK_INT >= 23) {
                canDrawOverlays = Settings.canDrawOverlays(abstractActivityC0292d);
                r6 = canDrawOverlays;
            } else {
                return false;
            }
        } else if (r4 == 212) {
            if (Build.VERSION.SDK_INT >= 26) {
                canRequestPackageInstalls = abstractActivityC0292d.getPackageManager().canRequestPackageInstalls();
                r22 = 24;
                r6 = canRequestPackageInstalls;
            } else {
                return false;
            }
        } else if (r4 == 213) {
            if (Build.VERSION.SDK_INT >= 23) {
                isNotificationPolicyAccessGranted = ((NotificationManager) abstractActivityC0292d.getSystemService("notification")).isNotificationPolicyAccessGranted();
                r22 = 27;
                r6 = isNotificationPolicyAccessGranted;
            } else {
                return false;
            }
        } else if (r4 != 214) {
            return false;
        } else {
            AlarmManager alarmManager = (AlarmManager) abstractActivityC0292d.getSystemService("alarm");
            if (Build.VERSION.SDK_INT >= 31) {
                canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                c4 = canScheduleExactAlarms;
            } else {
                c4 = 1;
            }
            r22 = 34;
            r6 = c4;
        }
        this.f1057N.put(Integer.valueOf(r22), Integer.valueOf(r6));
        int r42 = this.f1056M - 1;
        this.f1056M = r42;
        k kVar = this.f1054K;
        if (kVar != null && r42 == 0) {
            ((n) kVar.f22K).c(this.f1057N);
        }
        return true;
    }

    public final int c(int r17) {
        int r9;
        boolean canScheduleExactAlarms;
        boolean isNotificationPolicyAccessGranted;
        boolean canRequestPackageInstalls;
        boolean canDrawOverlays;
        boolean isExternalStorageManager;
        boolean isIgnoringBatteryOptimizations;
        int checkSelfPermission;
        int r5 = 0;
        Context context = this.f1053J;
        if (r17 == 17) {
            if (Build.VERSION.SDK_INT >= 33) {
                checkSelfPermission = context.checkSelfPermission("android.permission.POST_NOTIFICATIONS");
                if (checkSelfPermission == 0) {
                    return 1;
                }
                return AbstractC0684q0.b(this.f1055L, "android.permission.POST_NOTIFICATIONS");
            } else if (new q(context).a()) {
                return 1;
            } else {
                return 0;
            }
        } else if (r17 == 21) {
            ArrayList c4 = AbstractC0684q0.c(context, 21);
            if (c4 != null && !c4.isEmpty()) {
                return 1;
            }
            Log.d("permissions_handler", "Bluetooth permission missing in manifest");
            return 0;
        } else {
            int r92 = 31;
            if ((r17 == 30 || r17 == 28 || r17 == 29) && Build.VERSION.SDK_INT < 31) {
                ArrayList c5 = AbstractC0684q0.c(context, 21);
                if (c5 != null && !c5.isEmpty()) {
                    return 1;
                }
                Log.d("permissions_handler", "Bluetooth permission missing in manifest");
                return 0;
            } else if ((r17 == 37 || r17 == 0) && !d()) {
                return 0;
            } else {
                ArrayList c6 = AbstractC0684q0.c(context, r17);
                if (c6 == null) {
                    Log.d("permissions_handler", "No android specific permissions needed for: " + r17);
                    return 1;
                } else if (c6.size() == 0) {
                    Log.d("permissions_handler", "No permissions found in manifest for: " + c6 + r17);
                    if (r17 == 16 && Build.VERSION.SDK_INT < 23) {
                        return 2;
                    }
                    if (r17 == 22 && Build.VERSION.SDK_INT < 30) {
                        return 2;
                    }
                    if (Build.VERSION.SDK_INT < 23) {
                        return 1;
                    }
                    return 0;
                } else {
                    if (context.getApplicationInfo().targetSdkVersion >= 23) {
                        HashSet hashSet = new HashSet();
                        Iterator it = c6.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (r17 == 16) {
                                String packageName = context.getPackageName();
                                PowerManager powerManager = (PowerManager) context.getSystemService("power");
                                if (powerManager != null) {
                                    isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(packageName);
                                    if (isIgnoringBatteryOptimizations) {
                                        hashSet.add(1);
                                    }
                                }
                                hashSet.add(Integer.valueOf(r5));
                            } else if (r17 == 22) {
                                if (Build.VERSION.SDK_INT < 30) {
                                    hashSet.add(2);
                                }
                                isExternalStorageManager = Environment.isExternalStorageManager();
                                hashSet.add(Integer.valueOf(isExternalStorageManager ? 1 : 0));
                            } else if (r17 == 23) {
                                canDrawOverlays = Settings.canDrawOverlays(context);
                                hashSet.add(Integer.valueOf(canDrawOverlays ? 1 : 0));
                            } else if (r17 == 24) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    canRequestPackageInstalls = context.getPackageManager().canRequestPackageInstalls();
                                    hashSet.add(Integer.valueOf(canRequestPackageInstalls ? 1 : 0));
                                }
                            } else if (r17 == 27) {
                                isNotificationPolicyAccessGranted = ((NotificationManager) context.getSystemService("notification")).isNotificationPolicyAccessGranted();
                                hashSet.add(Integer.valueOf(isNotificationPolicyAccessGranted ? 1 : 0));
                            } else if (r17 == 34) {
                                if (Build.VERSION.SDK_INT >= r92) {
                                    canScheduleExactAlarms = ((AlarmManager) context.getSystemService("alarm")).canScheduleExactAlarms();
                                    hashSet.add(Integer.valueOf(canScheduleExactAlarms ? 1 : 0));
                                } else {
                                    hashSet.add(1);
                                }
                            } else if (r17 != 9 && r17 != 32) {
                                if (AbstractC0723v0.a(context, str) != 0) {
                                    hashSet.add(Integer.valueOf(AbstractC0684q0.b(this.f1055L, str)));
                                }
                            } else {
                                int a4 = AbstractC0723v0.a(context, str);
                                if (Build.VERSION.SDK_INT >= 34) {
                                    r9 = AbstractC0723v0.a(context, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
                                } else {
                                    r9 = a4;
                                }
                                if (r9 == 0 && a4 == -1) {
                                    hashSet.add(3);
                                } else if (a4 == 0) {
                                    hashSet.add(1);
                                } else {
                                    hashSet.add(Integer.valueOf(AbstractC0684q0.b(this.f1055L, str)));
                                }
                            }
                            r5 = 0;
                            r92 = 31;
                        }
                        if (!hashSet.isEmpty()) {
                            return AbstractC0684q0.e(hashSet).intValue();
                        }
                    }
                    return 1;
                }
            }
        }
    }

    public final boolean d() {
        boolean z3;
        boolean z4;
        ArrayList c4 = AbstractC0684q0.c(this.f1053J, 37);
        if (c4 != null && c4.contains("android.permission.WRITE_CALENDAR")) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c4 != null && c4.contains("android.permission.READ_CALENDAR")) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && z4) {
            return true;
        }
        if (!z3) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z4) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    public final void e(String str, int r5) {
        if (this.f1055L == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f1055L.getPackageName()));
        }
        this.f1055L.startActivityForResult(intent, r5);
        this.f1056M++;
    }
}
