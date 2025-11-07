package h1;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import k1.w;

/* renamed from: h1.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogFragmentC0282b extends DialogFragment {

    /* renamed from: J  reason: collision with root package name */
    public AlertDialog f3253J;

    /* renamed from: K  reason: collision with root package name */
    public DialogInterface.OnCancelListener f3254K;

    /* renamed from: L  reason: collision with root package name */
    public AlertDialog f3255L;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f3254K;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        AlertDialog alertDialog = this.f3253J;
        if (alertDialog == null) {
            setShowsDialog(false);
            if (this.f3255L == null) {
                Activity activity = getActivity();
                w.e(activity);
                this.f3255L = new AlertDialog.Builder(activity).create();
            }
            return this.f3255L;
        }
        return alertDialog;
    }
}
