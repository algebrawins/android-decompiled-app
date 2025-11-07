package W0;

import android.content.Context;
import b1.AbstractC0148d;
import b1.k;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* loaded from: classes.dex */
public final class f implements X0.b {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f1492J;

    /* renamed from: K  reason: collision with root package name */
    public final A.c f1493K;

    public /* synthetic */ f(A.c cVar, int r22) {
        this.f1492J = r22;
        this.f1493K = cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, d1.a] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, d1.a] */
    @Override // A2.a
    public final Object get() {
        switch (this.f1492J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new e((Context) this.f1493K.f5K, new Object(), new Object());
            default:
                AbstractC0148d.f2615a.get();
                Integer num = 4;
                return new k(num.intValue(), (Context) this.f1493K.f5K, "com.google.android.datatransport.events");
        }
    }
}
