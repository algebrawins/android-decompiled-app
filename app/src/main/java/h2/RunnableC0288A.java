package h2;

import D.C0040v;
import D.RunnableC0038t;
import android.view.KeyEvent;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Executor;

/* renamed from: h2.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0288A implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3279J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f3280K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f3281L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ long f3282M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ Object f3283N;

    public /* synthetic */ RunnableC0288A(Object obj, Object obj2, long j3, Object obj3, int r6) {
        this.f3279J = r6;
        this.f3280K = obj;
        this.f3281L = obj2;
        this.f3282M = j3;
        this.f3283N = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3279J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C c4 = (C) this.f3280K;
                c4.getClass();
                c4.b(false, Long.valueOf(((f3.c) this.f3281L).f3209b), Long.valueOf(this.f3282M), ((KeyEvent) this.f3283N).getEventTime());
                return;
            case 1:
                C c5 = (C) this.f3280K;
                c5.getClass();
                c5.b(false, Long.valueOf(((f3.c) this.f3281L).f3209b), Long.valueOf(this.f3282M), ((KeyEvent) this.f3283N).getEventTime());
                return;
            default:
                C0040v c0040v = (C0040v) this.f3280K;
                Executor executor = (Executor) this.f3281L;
                executor.execute(new RunnableC0038t(c0040v, c0040v.f468i, executor, (S.i) this.f3283N, this.f3282M, 0));
                return;
        }
    }
}
