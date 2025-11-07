package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import h1.C0281a;
import h1.C0284d;
import j1.C0304c;
import k1.w;
import u1.HandlerC0477e;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: K  reason: collision with root package name */
    public static final /* synthetic */ int f2722K = 0;

    /* renamed from: J  reason: collision with root package name */
    public int f2723J = 0;

    @Override // android.app.Activity
    public final void onActivityResult(int r4, int r5, Intent intent) {
        super.onActivityResult(r4, r5, intent);
        if (r4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f2723J = 0;
            setResult(r5, intent);
            if (booleanExtra) {
                C0304c e4 = C0304c.e(this);
                if (r5 != -1) {
                    if (r5 == 0) {
                        e4.f(new C0281a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    HandlerC0477e handlerC0477e = e4.f3810m;
                    handlerC0477e.sendMessage(handlerC0477e.obtainMessage(3));
                }
            }
        } else if (r4 == 2) {
            this.f2723J = 0;
            setResult(r5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f2723J = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2723J = bundle.getInt("resolution");
        }
        if (this.f2723J != 1) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                Log.e("GoogleApiActivity", "Activity started without extras");
                finish();
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
            Integer num = (Integer) extras.get("error_code");
            if (pendingIntent == null && num == null) {
                Log.e("GoogleApiActivity", "Activity started without resolution");
                finish();
            } else if (pendingIntent != null) {
                try {
                    startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                    this.f2723J = 1;
                } catch (ActivityNotFoundException e4) {
                    if (extras.getBoolean("notify_manager", true)) {
                        C0304c.e(this).f(new C0281a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                    } else {
                        String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                        if (Build.FINGERPRINT.contains("generic")) {
                            str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                        }
                        Log.e("GoogleApiActivity", str, e4);
                    }
                    this.f2723J = 1;
                    finish();
                } catch (IntentSender.SendIntentException e5) {
                    Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e5);
                    finish();
                }
            } else {
                w.e(num);
                C0284d.f3260d.d(this, num.intValue(), this);
                this.f2723J = 1;
            }
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f2723J);
        super.onSaveInstanceState(bundle);
    }
}
