package h1;

import D.C;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import com.example.catering_inventory.R;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.libraries.barhopper.RecognitionOptions;
import j1.z;
import java.util.ArrayList;
import java.util.Iterator;
import k1.o;
import k1.w;
import x1.L4;

/* renamed from: h1.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0284d extends C0285e {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f3259c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final C0284d f3260d = new Object();

    public static AlertDialog e(Activity activity, int r6, o oVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (r6 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(k1.n.b(activity, r6));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (r6 != 1) {
            if (r6 != 2) {
                if (r6 != 3) {
                    string = resources.getString(17039370);
                } else {
                    string = resources.getString(R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, oVar);
        }
        String c4 = k1.n.c(activity, r6);
        if (c4 != null) {
            builder.setTitle(c4);
        }
        Log.w("GoogleApiAvailability", C.w("Creating dialog for Google Play services availability issue. ConnectionResult=", r6), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.app.DialogFragment, h1.b] */
    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        w.f(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.f3253J = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.f3254K = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    public final void d(GoogleApiActivity googleApiActivity, int r5, GoogleApiActivity googleApiActivity2) {
        AlertDialog e4 = e(googleApiActivity, r5, new o(super.b(r5, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (e4 == null) {
            return;
        }
        f(googleApiActivity, e4, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, U.g] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.CharSequence, android.net.Uri, long[], java.lang.String] */
    public final void g(Context context, int r20, PendingIntent pendingIntent) {
        String c4;
        String d4;
        Notification.Builder builder;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        NotificationManager notificationManager;
        ?? r3;
        CharSequence charSequence;
        Notification build;
        int r12;
        Bundle bundle;
        int r9;
        Bundle bundle2;
        int r92;
        ArrayList arrayList;
        int r4;
        Notification.Action.Builder e4;
        Bundle bundle3;
        Icon icon;
        int r14;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", C.v(r20, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (r20 == 18) {
            new i(this, context).sendEmptyMessageDelayed(1, 120000L);
        } else if (pendingIntent == null) {
            if (r20 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            }
        } else {
            if (r20 == 6) {
                c4 = k1.n.e(context, "common_google_play_services_resolution_required_title");
            } else {
                c4 = k1.n.c(context, r20);
            }
            if (c4 == null) {
                c4 = context.getResources().getString(R.string.common_google_play_services_notification_ticker);
            }
            if (r20 != 6 && r20 != 19) {
                d4 = k1.n.b(context, r20);
            } else {
                d4 = k1.n.d(context, "common_google_play_services_resolution_required_text", k1.n.a(context));
            }
            Resources resources = context.getResources();
            Object systemService = context.getSystemService("notification");
            w.e(systemService);
            NotificationManager notificationManager2 = (NotificationManager) systemService;
            ?? obj = new Object();
            ArrayList arrayList2 = new ArrayList();
            obj.f1234b = arrayList2;
            obj.f1235c = new ArrayList();
            obj.f1236d = new ArrayList();
            obj.f1240i = true;
            obj.f1242k = false;
            Notification notification = new Notification();
            obj.f1246o = notification;
            obj.f1233a = context;
            obj.f1244m = null;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            obj.f1239h = 0;
            obj.f1247p = new ArrayList();
            obj.f1245n = true;
            obj.f1242k = true;
            notification.flags |= 16;
            obj.f1237e = U.g.a(c4);
            A.f fVar = new A.f(12, false);
            fVar.f11L = U.g.a(d4);
            obj.b(fVar);
            PackageManager packageManager = context.getPackageManager();
            if (L4.f5663a == null) {
                L4.f5663a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            }
            if (L4.f5663a.booleanValue()) {
                notification.icon = context.getApplicationInfo().icon;
                obj.f1239h = 2;
                if (L4.a(context)) {
                    arrayList2.add(new U.f(resources.getString(R.string.common_open_on_phone), pendingIntent));
                } else {
                    obj.g = pendingIntent;
                }
            } else {
                notification.icon = 17301642;
                notification.tickerText = U.g.a(resources.getString(R.string.common_google_play_services_notification_ticker));
                notification.when = System.currentTimeMillis();
                obj.g = pendingIntent;
                obj.f1238f = U.g.a(d4);
            }
            int r22 = Build.VERSION.SDK_INT;
            if (r22 >= 26) {
                if (r22 >= 26) {
                    synchronized (f3259c) {
                    }
                    notificationChannel = notificationManager2.getNotificationChannel("com.google.android.gms.availability");
                    String string = context.getResources().getString(R.string.common_google_play_services_notification_channel_name);
                    if (notificationChannel == null) {
                        notificationManager2.createNotificationChannel(A.e.d(string));
                    } else {
                        name = notificationChannel.getName();
                        if (!string.contentEquals(name)) {
                            notificationChannel.setName(string);
                            notificationManager2.createNotificationChannel(notificationChannel);
                        }
                    }
                    obj.f1244m = "com.google.android.gms.availability";
                } else {
                    throw new IllegalStateException();
                }
            }
            new ArrayList();
            Bundle bundle4 = new Bundle();
            Context context2 = obj.f1233a;
            int r7 = Build.VERSION.SDK_INT;
            if (r7 >= 26) {
                builder = U.l.a(context2, obj.f1244m);
            } else {
                builder = new Notification.Builder(obj.f1233a);
            }
            Notification notification2 = obj.f1246o;
            Notification.Builder lights = builder.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS);
            if ((notification2.flags & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Notification.Builder ongoing = lights.setOngoing(z3);
            if ((notification2.flags & 8) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z4);
            if ((notification2.flags & 16) != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z5).setDefaults(notification2.defaults).setContentTitle(obj.f1237e).setContentText(obj.f1238f).setContentInfo(null).setContentIntent(obj.g).setDeleteIntent(notification2.deleteIntent);
            if ((notification2.flags & RecognitionOptions.ITF) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            deleteIntent.setFullScreenIntent(null, z6).setNumber(0).setProgress(0, 0, false);
            int r42 = 23;
            if (r7 < 23) {
                builder.setLargeIcon((Bitmap) null);
            } else {
                U.j.b(builder, null);
            }
            builder.setSubText(null).setUsesChronometer(false).setPriority(obj.f1239h);
            Iterator it = obj.f1234b.iterator();
            while (it.hasNext()) {
                U.f fVar2 = (U.f) it.next();
                int r11 = Build.VERSION.SDK_INT;
                if (fVar2.f1228b == null && (r14 = fVar2.f1231e) != 0) {
                    fVar2.f1228b = IconCompat.b(r14);
                }
                IconCompat iconCompat = fVar2.f1228b;
                PendingIntent pendingIntent2 = fVar2.g;
                CharSequence charSequence2 = fVar2.f1232f;
                if (r11 >= r42) {
                    if (iconCompat != null) {
                        if (r11 >= r42) {
                            icon = Z.c.c(iconCompat, null);
                        } else {
                            throw new UnsupportedOperationException("This method is only supported on API level 23+");
                        }
                    } else {
                        icon = null;
                    }
                    e4 = U.j.a(icon, charSequence2, pendingIntent2);
                } else {
                    if (iconCompat != null) {
                        r4 = iconCompat.c();
                    } else {
                        r4 = 0;
                    }
                    e4 = U.h.e(r4, charSequence2, pendingIntent2);
                }
                Bundle bundle5 = fVar2.f1227a;
                if (bundle5 != null) {
                    bundle3 = new Bundle(bundle5);
                } else {
                    bundle3 = new Bundle();
                }
                boolean z7 = fVar2.f1229c;
                bundle3.putBoolean("android.support.allowGeneratedReplies", z7);
                if (r11 >= 24) {
                    U.k.a(e4, z7);
                }
                bundle3.putInt("android.support.action.semanticAction", 0);
                if (r11 >= 28) {
                    U.m.b(e4, 0);
                }
                if (r11 >= 29) {
                    U.n.c(e4, false);
                }
                if (r11 >= 31) {
                    U.o.a(e4, false);
                }
                bundle3.putBoolean("android.support.action.showsUserInterface", fVar2.f1230d);
                U.h.b(e4, bundle3);
                U.h.a(builder, U.h.d(e4));
                r42 = 23;
            }
            Bundle bundle6 = obj.f1243l;
            if (bundle6 != null) {
                bundle4.putAll(bundle6);
            }
            int r43 = Build.VERSION.SDK_INT;
            builder.setShowWhen(obj.f1240i);
            U.h.i(builder, obj.f1242k);
            U.h.g(builder, null);
            U.h.j(builder, null);
            U.h.h(builder, false);
            U.i.b(builder, null);
            U.i.c(builder, 0);
            U.i.f(builder, 0);
            U.i.d(builder, null);
            U.i.e(builder, notification2.sound, notification2.audioAttributes);
            ArrayList<String> arrayList3 = obj.f1247p;
            ArrayList arrayList4 = obj.f1235c;
            if (r43 < 28) {
                if (arrayList4 == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList4.size());
                    Iterator it2 = arrayList4.iterator();
                    if (it2.hasNext()) {
                        it2.next().getClass();
                        throw new ClassCastException();
                    }
                }
                if (arrayList != null) {
                    if (arrayList3 == null) {
                        arrayList3 = arrayList;
                    } else {
                        R.c cVar = new R.c(arrayList3.size() + arrayList.size());
                        cVar.addAll(arrayList);
                        cVar.addAll(arrayList3);
                        arrayList3 = new ArrayList(cVar);
                    }
                }
            }
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (String str : arrayList3) {
                    U.i.a(builder, str);
                }
            }
            ArrayList arrayList5 = obj.f1236d;
            if (arrayList5.size() > 0) {
                if (obj.f1243l == null) {
                    obj.f1243l = new Bundle();
                }
                Bundle bundle7 = obj.f1243l.getBundle("android.car.EXTENSIONS");
                if (bundle7 == null) {
                    bundle7 = new Bundle();
                }
                Bundle bundle8 = new Bundle(bundle7);
                Bundle bundle9 = new Bundle();
                int r142 = 0;
                while (r142 < arrayList5.size()) {
                    String num = Integer.toString(r142);
                    U.f fVar3 = (U.f) arrayList5.get(r142);
                    ArrayList arrayList6 = arrayList5;
                    Bundle bundle10 = new Bundle();
                    NotificationManager notificationManager3 = notificationManager2;
                    if (fVar3.f1228b == null && (r92 = fVar3.f1231e) != 0) {
                        fVar3.f1228b = IconCompat.b(r92);
                    }
                    IconCompat iconCompat2 = fVar3.f1228b;
                    if (iconCompat2 != null) {
                        r9 = iconCompat2.c();
                    } else {
                        r9 = 0;
                    }
                    bundle10.putInt("icon", r9);
                    bundle10.putCharSequence("title", fVar3.f1232f);
                    bundle10.putParcelable("actionIntent", fVar3.g);
                    Bundle bundle11 = fVar3.f1227a;
                    if (bundle11 != null) {
                        bundle2 = new Bundle(bundle11);
                    } else {
                        bundle2 = new Bundle();
                    }
                    bundle2.putBoolean("android.support.allowGeneratedReplies", fVar3.f1229c);
                    bundle10.putBundle("extras", bundle2);
                    bundle10.putParcelableArray("remoteInputs", null);
                    bundle10.putBoolean("showsUserInterface", fVar3.f1230d);
                    bundle10.putInt("semanticAction", 0);
                    bundle9.putBundle(num, bundle10);
                    r142++;
                    arrayList5 = arrayList6;
                    notificationManager2 = notificationManager3;
                }
                notificationManager = notificationManager2;
                bundle7.putBundle("invisible_actions", bundle9);
                bundle8.putBundle("invisible_actions", bundle9);
                if (obj.f1243l == null) {
                    obj.f1243l = new Bundle();
                }
                obj.f1243l.putBundle("android.car.EXTENSIONS", bundle7);
                bundle4.putBundle("android.car.EXTENSIONS", bundle8);
            } else {
                notificationManager = notificationManager2;
            }
            int r13 = Build.VERSION.SDK_INT;
            if (r13 >= 24) {
                builder.setExtras(obj.f1243l);
                r3 = 0;
                U.k.e(builder, null);
            } else {
                r3 = 0;
            }
            if (r13 >= 26) {
                U.l.b(builder, 0);
                U.l.e(builder, r3);
                U.l.f(builder, r3);
                U.l.g(builder, 0L);
                U.l.d(builder, 0);
                if (!TextUtils.isEmpty(obj.f1244m)) {
                    builder.setSound(r3).setDefaults(0).setLights(0, 0, 0).setVibrate(r3);
                }
            }
            if (r13 >= 28) {
                Iterator it3 = arrayList4.iterator();
                if (it3.hasNext()) {
                    it3.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (r13 >= 29) {
                U.n.a(builder, obj.f1245n);
                charSequence = null;
                U.n.b(builder, null);
            } else {
                charSequence = null;
            }
            A.f fVar4 = obj.f1241j;
            if (fVar4 != null) {
                new Notification.BigTextStyle(builder).setBigContentTitle(charSequence).bigText((CharSequence) fVar4.f11L);
            }
            if (r22 >= 26) {
                build = builder.build();
            } else if (r22 >= 24) {
                build = builder.build();
            } else {
                builder.setExtras(bundle4);
                build = builder.build();
            }
            if (fVar4 != null) {
                obj.f1241j.getClass();
            }
            if (fVar4 != null && (bundle = build.extras) != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
            }
            if (r20 != 1 && r20 != 2 && r20 != 3) {
                r12 = 39789;
            } else {
                AbstractC0286f.f3263a.set(false);
                r12 = 10436;
            }
            notificationManager.notify(r12, build);
        }
    }

    public final void h(Activity activity, z zVar, int r6, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e4 = e(activity, r6, new o(super.b(r6, activity, "d"), zVar, 1), onCancelListener);
        if (e4 == null) {
            return;
        }
        f(activity, e4, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
