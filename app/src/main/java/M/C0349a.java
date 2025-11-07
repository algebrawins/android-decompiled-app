package m;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: m.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349a implements TransformationMethod {

    /* renamed from: a  reason: collision with root package name */
    public Locale f4115a;

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f4115a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z3, int r4, Rect rect) {
    }
}
