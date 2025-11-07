package x;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import h2.J;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final J f5479a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayMap f5480b = new ArrayMap(4);

    public w(J j3) {
        this.f5479a = j3;
    }

    public static w a(Context context, Handler handler) {
        J j3;
        int r12 = Build.VERSION.SDK_INT;
        if (r12 >= 30) {
            j3 = new J(context, (J) null);
        } else if (r12 >= 29) {
            j3 = new J(context, (J) null);
        } else if (r12 >= 28) {
            j3 = new J(context, (J) null);
        } else {
            j3 = new J(context, new J(handler));
        }
        return new w(j3);
    }

    public final C0559n b(String str) {
        C0559n c0559n;
        synchronized (this.f5480b) {
            c0559n = (C0559n) this.f5480b.get(str);
            if (c0559n == null) {
                try {
                    C0559n c0559n2 = new C0559n(this.f5479a.v(str), str);
                    this.f5480b.put(str, c0559n2);
                    c0559n = c0559n2;
                } catch (AssertionError e4) {
                    throw new C0551f(e4.getMessage(), e4);
                }
            }
        }
        return c0559n;
    }
}
