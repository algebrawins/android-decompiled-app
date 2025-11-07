package A0;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class L implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public int f48J;

    /* renamed from: K  reason: collision with root package name */
    public int f49K;

    /* renamed from: L  reason: collision with root package name */
    public OverScroller f50L;

    /* renamed from: M  reason: collision with root package name */
    public Interpolator f51M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f52N;

    /* renamed from: O  reason: collision with root package name */
    public boolean f53O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f54P;

    public L(RecyclerView recyclerView) {
        this.f54P = recyclerView;
        animation.InterpolatorC0018u r02 = RecyclerView.f2522U0;
        this.f51M = r02;
        this.f52N = false;
        this.f53O = false;
        this.f50L = new OverScroller(recyclerView.getContext(), r02);
    }

    public final void a() {
        if (this.f52N) {
            this.f53O = true;
            return;
        }
        RecyclerView recyclerView = this.f54P;
        recyclerView.removeCallbacks(this);
        Field field = f0.w.f3200a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean awakenScrollBars;
        boolean z3;
        boolean z4;
        boolean z5;
        RecyclerView recyclerView = this.f54P;
        if (recyclerView.f2545R == null) {
            recyclerView.removeCallbacks(this);
            this.f50L.abortAnimation();
            return;
        }
        this.f53O = false;
        this.f52N = true;
        recyclerView.d();
        OverScroller overScroller = this.f50L;
        recyclerView.f2545R.getClass();
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int r6 = currX - this.f48J;
            int r13 = currY - this.f49K;
            this.f48J = currX;
            this.f49K = currY;
            RecyclerView recyclerView2 = this.f54P;
            int[] r4 = recyclerView.f2538M0;
            if (recyclerView2.f(r6, r13, r4, null, 1)) {
                r6 -= r4[0];
                r13 -= r4[1];
            }
            if (!recyclerView.f2546S.isEmpty()) {
                recyclerView.invalidate();
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.c(r6, r13);
            }
            recyclerView.g(null, 1);
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (r13 != 0 && recyclerView.f2545R.c() && r13 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (r6 != 0 && recyclerView.f2545R.b() && r6 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((r6 != 0 || r13 != 0) && !z4 && !z3) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!overScroller.isFinished() && (z5 || recyclerView.k())) {
                a();
                RunnableC0011m runnableC0011m = recyclerView.f2527E0;
                if (runnableC0011m != null) {
                    runnableC0011m.a(recyclerView, r6, r13);
                }
            } else {
                recyclerView.setScrollState(0);
                if (RecyclerView.f2520S0) {
                    C0009k c0009k = recyclerView.f2528F0;
                    c0009k.getClass();
                    c0009k.f132c = 0;
                }
                recyclerView.s(1);
            }
        }
        this.f52N = false;
        if (this.f53O) {
            a();
        }
    }
}
