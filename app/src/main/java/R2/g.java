package r2;

import A0.C0001b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f4887a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0001b f4888b;

    public g(C0001b c0001b) {
        this.f4888b = c0001b;
    }

    public final void a(Object obj) {
        if (!this.f4887a.get()) {
            C0001b c0001b = this.f4888b;
            if (((AtomicReference) c0001b.f84K).get() == this) {
                C0001b c0001b2 = (C0001b) c0001b.f86M;
                ((f) c0001b2.f85L).h((String) c0001b2.f84K, ((s) c0001b2.f86M).a(obj));
            }
        }
    }
}
