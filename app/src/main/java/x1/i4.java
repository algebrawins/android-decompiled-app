package x1;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public abstract class I4 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        p.s0 s0Var = p.s0.f4696j;
        if (s0Var != null && s0Var.f4698a == view) {
            p.s0.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            p.s0 s0Var2 = p.s0.f4697k;
            if (s0Var2 != null && s0Var2.f4698a == view) {
                s0Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new p.s0(view, charSequence);
    }
}
