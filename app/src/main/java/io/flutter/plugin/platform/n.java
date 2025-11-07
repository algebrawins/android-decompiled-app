package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public final class n extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final q f3599a;

    /* renamed from: b  reason: collision with root package name */
    public q f3600b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f3601c;

    public n(Context context, q qVar, Context context2) {
        super(context);
        this.f3599a = qVar;
        this.f3601c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("window".equals(str)) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int r12 = 0; r12 < stackTrace.length && r12 < 11; r12++) {
                if (stackTrace[r12].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[r12].getMethodName().equals("<init>")) {
                    return this.f3601c.getSystemService(str);
                }
            }
            if (this.f3600b == null) {
                this.f3600b = this.f3599a;
            }
            return this.f3600b;
        }
        return super.getSystemService(str);
    }
}
