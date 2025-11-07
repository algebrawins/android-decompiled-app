package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements C0.b {
    @Override // C0.b
    public final List a() {
        return C2.q.f272J;
    }

    @Override // C0.b
    public final Object b(Context context) {
        N2.g.e(context, "context");
        C0.a c4 = C0.a.c(context);
        N2.g.d(c4, "getInstance(context)");
        if (c4.f236b.contains(ProcessLifecycleInitializer.class)) {
            if (!o.f2462a.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                N2.g.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new n());
            }
            E e4 = E.f2433R;
            e4.getClass();
            e4.f2438N = new Handler();
            e4.f2439O.e(EnumC0137k.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            N2.g.c(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new D(e4));
            return e4;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
    }
}
