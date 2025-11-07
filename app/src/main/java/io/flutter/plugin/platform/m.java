package io.flutter.plugin.platform;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.Display;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class m extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final InputMethodManager f3598a;

    public m(Context context, InputMethodManager inputMethodManager) {
        super(context);
        this.f3598a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context createDisplayContext(Display display) {
        return new m(super.createDisplayContext(display), this.f3598a);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("input_method".equals(str)) {
            return this.f3598a;
        }
        return super.getSystemService(str);
    }
}
