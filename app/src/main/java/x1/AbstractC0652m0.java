package x1;

import java.io.Closeable;

/* renamed from: x1.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0652m0 {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                G.i.a(th, th2);
            }
        }
    }
}
