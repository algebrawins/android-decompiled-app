package z2;

import android.widget.Toast;
import x1.C0727v4;

/* renamed from: z2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0960b extends Toast.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0727v4 f6586a;

    public C0960b(C0727v4 c0727v4) {
        this.f6586a = c0727v4;
    }

    @Override // android.widget.Toast.Callback
    public final void onToastHidden() {
        super.onToastHidden();
        this.f6586a.f6109K = null;
    }
}
