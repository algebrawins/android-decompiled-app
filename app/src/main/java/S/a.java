package S;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1163b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f1164c;

    /* renamed from: a  reason: collision with root package name */
    public final CancellationException f1165a;

    static {
        if (h.f1180M) {
            f1164c = null;
            f1163b = null;
            return;
        }
        f1164c = new a(false, null);
        f1163b = new a(true, null);
    }

    public a(boolean z3, CancellationException cancellationException) {
        this.f1165a = cancellationException;
    }
}
