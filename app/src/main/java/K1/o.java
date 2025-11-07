package k1;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class o implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4063a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f4064b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4065c;

    public /* synthetic */ o(Intent intent, Object obj, int r3) {
        this.f4063a = r3;
        this.f4064b = intent;
        this.f4065c = obj;
    }

    public final void a() {
        switch (this.f4063a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Intent intent = this.f4064b;
                if (intent != null) {
                    ((GoogleApiActivity) this.f4065c).startActivityForResult(intent, 2);
                    return;
                }
                return;
            default:
                Intent intent2 = this.f4064b;
                if (intent2 != null) {
                    ((j1.z) this.f4065c).startActivityForResult(intent2, 2);
                    return;
                }
                return;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r6) {
        try {
            a();
        } catch (ActivityNotFoundException e4) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e4);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
