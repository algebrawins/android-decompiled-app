package t0;

import A0.C0001b;
import A0.RunnableC0004e;
import D.C;
import android.content.DialogInterface;
import android.util.Log;
import h2.D;
import java.util.ArrayList;

/* renamed from: t0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC0459d extends e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Y  reason: collision with root package name */
    public final DialogInterface$OnDismissListenerC0457b f4978Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f4979Z;
    public int a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f4980b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f4981c0;

    public DialogInterface$OnCancelListenerC0459d() {
        new RunnableC0004e(19, this);
        new DialogInterface$OnCancelListenerC0456a(this);
        this.f4978Y = new DialogInterface$OnDismissListenerC0457b(this);
        this.f4979Z = true;
        this.a0 = -1;
        new C0458c(this);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [t0.i, java.lang.Object] */
    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.f4980b0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            if (!this.f4981c0) {
                this.f4981c0 = true;
                this.f4980b0 = true;
                if (this.a0 >= 0) {
                    C0001b d4 = d();
                    int r02 = this.a0;
                    if (r02 >= 0) {
                        synchronized (((ArrayList) d4.f84K)) {
                        }
                        this.a0 = -1;
                        return;
                    }
                    throw new IllegalArgumentException(C.w("Bad id: ", r02));
                }
                D d5 = new D(d());
                ?? obj = new Object();
                obj.f4999a = 3;
                obj.f5000b = this;
                ((ArrayList) d5.f3292d).add(obj);
                obj.f5001c = 0;
                obj.f5002d = 0;
                obj.f5003e = 0;
                obj.f5004f = 0;
                d5.b(true);
            }
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
