package A0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: A0.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0011m implements Runnable {

    /* renamed from: N  reason: collision with root package name */
    public static final ThreadLocal f138N = new ThreadLocal();

    /* renamed from: O  reason: collision with root package name */
    public static final C0008j f139O = new C0008j(0);

    /* renamed from: J  reason: collision with root package name */
    public ArrayList f140J;

    /* renamed from: K  reason: collision with root package name */
    public long f141K;

    /* renamed from: L  reason: collision with root package name */
    public long f142L;

    /* renamed from: M  reason: collision with root package name */
    public ArrayList f143M;

    public final void a(RecyclerView recyclerView, int r7, int r8) {
        if (recyclerView.f2549V && this.f141K == 0) {
            this.f141K = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0009k c0009k = recyclerView.f2528F0;
        c0009k.f130a = r7;
        c0009k.f131b = r8;
    }

    public final void b(long j3) {
        C0010l c0010l;
        RecyclerView recyclerView;
        ArrayList arrayList = this.f140J;
        int size = arrayList.size();
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            RecyclerView recyclerView2 = (RecyclerView) arrayList.get(r12);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0009k c0009k = recyclerView2.f2528F0;
                c0009k.f132c = 0;
                r22 += c0009k.f132c;
            }
        }
        ArrayList arrayList2 = this.f143M;
        arrayList2.ensureCapacity(r22);
        for (int r23 = 0; r23 < size; r23++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(r23);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0009k c0009k2 = recyclerView3.f2528F0;
                Math.abs(c0009k2.f130a);
                Math.abs(c0009k2.f131b);
                if (c0009k2.f132c * 2 > 0) {
                    if (arrayList2.size() <= 0) {
                        arrayList2.add(new Object());
                    } else {
                        C0010l c0010l2 = (C0010l) arrayList2.get(0);
                    }
                    throw null;
                }
            }
        }
        Collections.sort(arrayList2, f139O);
        if (arrayList2.size() > 0 && (recyclerView = (c0010l = (C0010l) arrayList2.get(0)).f136d) != null) {
            int r6 = c0010l.f137e;
            if (recyclerView.f2537M.I() <= 0) {
                F f2 = recyclerView.f2532J;
                try {
                    recyclerView.f2558i0++;
                    f2.b(r6);
                    throw null;
                } catch (Throwable th) {
                    int r02 = recyclerView.f2558i0 - 1;
                    recyclerView.f2558i0 = r02;
                    if (r02 < 1) {
                        recyclerView.f2558i0 = 0;
                    }
                    throw th;
                }
            }
            RecyclerView.j(recyclerView.f2537M.H(0));
            throw null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int r3 = b0.h.f2605a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f140J;
            if (arrayList.isEmpty()) {
                this.f141K = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j3 = 0;
            for (int r4 = 0; r4 < size; r4++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(r4);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f141K = 0L;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f142L);
            this.f141K = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f141K = 0L;
            int r02 = b0.h.f2605a;
            Trace.endSection();
            throw th;
        }
    }
}
