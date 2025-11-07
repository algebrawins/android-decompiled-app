package A0;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h1.C0281a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import k.C0312e;
import k0.C0314a;
import k0.View$OnTouchListenerC0319f;
import p.AbstractC0400B;
import t0.DialogInterface$OnCancelListenerC0459d;

/* renamed from: A0.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0004e implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f100J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f101K;

    public /* synthetic */ RunnableC0004e(int r12, Object obj) {
        this.f100J = r12;
        this.f101K = obj;
    }

    private final void a() {
        try {
            c();
        } catch (Error e4) {
            synchronized (((G.l) this.f101K).f683J) {
                ((G.l) this.f101K).f686M = G.k.IDLE;
                throw e4;
            }
        }
    }

    private final void b() {
        Object obj;
        synchronized (((androidx.lifecycle.z) this.f101K).f2485a) {
            obj = ((androidx.lifecycle.z) this.f101K).f2490f;
            ((androidx.lifecycle.z) this.f101K).f2490f = androidx.lifecycle.z.f2484k;
        }
        ((androidx.lifecycle.z) this.f101K).k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r1 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0053, code lost:
        r3.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
        x1.X.c("SequentialExecutor", "Exception while executing runnable " + r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c() {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
        L2:
            java.lang.Object r2 = r9.f101K     // Catch: java.lang.Throwable -> L57
            G.l r2 = (G.l) r2     // Catch: java.lang.Throwable -> L57
            java.util.ArrayDeque r2 = r2.f683J     // Catch: java.lang.Throwable -> L57
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f101K     // Catch: java.lang.Throwable -> L20
            G.l r0 = (G.l) r0     // Catch: java.lang.Throwable -> L20
            G.k r3 = r0.f686M     // Catch: java.lang.Throwable -> L20
            G.k r4 = G.k.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L1f
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1f:
            return
        L20:
            r0 = move-exception
            goto L71
        L22:
            long r5 = r0.f687N     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f687N = r5     // Catch: java.lang.Throwable -> L20
            r0.f686M = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f101K     // Catch: java.lang.Throwable -> L20
            G.l r3 = (G.l) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f683J     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L4d
            java.lang.Object r0 = r9.f101K     // Catch: java.lang.Throwable -> L20
            G.l r0 = (G.l) r0     // Catch: java.lang.Throwable -> L20
            G.k r3 = G.k.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f686M = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L4c
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L4c:
            return
        L4d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L57
            r1 = r1 | r2
            r3.run()     // Catch: java.lang.Throwable -> L57 java.lang.RuntimeException -> L59
            goto L2
        L57:
            r0 = move-exception
            goto L73
        L59:
            r2 = move-exception
            java.lang.String r4 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r5.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L57
            r5.append(r3)     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L57
            x1.X.c(r4, r3, r2)     // Catch: java.lang.Throwable -> L57
            goto L2
        L71:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L57
        L73:
            if (r1 == 0) goto L7c
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L7c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.RunnableC0004e.c():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        p.i iVar;
        long j4 = 0;
        switch (this.f100J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                i iVar2 = (i) this.f101K;
                int r22 = iVar2.f127v;
                ValueAnimator valueAnimator = iVar2.f126u;
                if (r22 != 1) {
                    if (r22 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                iVar2.f127v = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 1:
                y yVar = ((RecyclerView) this.f101K).f2563p0;
                if (yVar != null) {
                    C0003d c0003d = (C0003d) yVar;
                    ArrayList arrayList = c0003d.f90e;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0003d.g;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0003d.f92h;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0003d.f91f;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        if (!it.hasNext()) {
                            arrayList.clear();
                            if (!isEmpty2) {
                                ArrayList arrayList5 = new ArrayList();
                                arrayList5.addAll(arrayList2);
                                ArrayList arrayList6 = c0003d.f94j;
                                arrayList6.add(arrayList5);
                                arrayList2.clear();
                                if (isEmpty) {
                                    Iterator it2 = arrayList5.iterator();
                                    if (!it2.hasNext()) {
                                        arrayList5.clear();
                                        arrayList6.remove(arrayList5);
                                    } else {
                                        D.C.G(it2.next());
                                        throw null;
                                    }
                                } else {
                                    D.C.G(arrayList5.get(0));
                                    throw null;
                                }
                            }
                            if (!isEmpty3) {
                                ArrayList arrayList7 = new ArrayList();
                                arrayList7.addAll(arrayList3);
                                ArrayList arrayList8 = c0003d.f95k;
                                arrayList8.add(arrayList7);
                                arrayList3.clear();
                                if (isEmpty) {
                                    Iterator it3 = arrayList7.iterator();
                                    if (!it3.hasNext()) {
                                        arrayList7.clear();
                                        arrayList8.remove(arrayList7);
                                    } else {
                                        D.C.G(it3.next());
                                        throw null;
                                    }
                                } else {
                                    D.C.G(arrayList7.get(0));
                                    throw null;
                                }
                            }
                            if (!isEmpty4) {
                                ArrayList arrayList9 = new ArrayList();
                                arrayList9.addAll(arrayList4);
                                ArrayList arrayList10 = c0003d.f93i;
                                arrayList10.add(arrayList9);
                                arrayList4.clear();
                                if (isEmpty && isEmpty2 && isEmpty3) {
                                    Iterator it4 = arrayList9.iterator();
                                    if (!it4.hasNext()) {
                                        arrayList9.clear();
                                        arrayList10.remove(arrayList9);
                                        return;
                                    }
                                    it4.next().getClass();
                                    throw new ClassCastException();
                                }
                                if (!isEmpty2) {
                                    j3 = c0003d.f160c;
                                } else {
                                    j3 = 0;
                                }
                                if (!isEmpty3) {
                                    j4 = c0003d.f161d;
                                }
                                Math.max(j3, j4);
                                arrayList9.get(0).getClass();
                                throw new ClassCastException();
                            }
                            return;
                        }
                        it.next().getClass();
                        throw new ClassCastException();
                    }
                    return;
                }
                return;
            case 2:
                ((StaggeredGridLayoutManager) this.f101K).J();
                return;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                synchronized (((C1.i) this.f101K).f243K) {
                    try {
                        C1.b bVar = (C1.b) ((C1.i) this.f101K).f245M;
                        if (bVar != null) {
                            bVar.p();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 4:
                C0001b c0001b = (C0001b) this.f101K;
                if (((G.d) c0001b.f86M).f668J.getAndSet(null) != null) {
                    ((Handler) c0001b.f85L).removeCallbacks((G.d) c0001b.f86M);
                    return;
                }
                return;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                a();
                return;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                ((E1.a) this.f101K).cancel(true);
                return;
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                H.j jVar = (H.j) this.f101K;
                jVar.f708K = null;
                jVar.f707J = null;
                return;
            case 8:
                a1.h hVar = (a1.h) this.f101K;
                ((b1.h) hVar.f1831d).h(new A.a(24, hVar));
                return;
            case 9:
                b();
                return;
            case 10:
                Object obj = ((A.c) this.f101K).f5K;
                return;
            case 11:
                ((j1.m) this.f101K).e();
                return;
            case 12:
                i1.c cVar = ((j1.m) ((A.c) this.f101K).f5K).f3816m;
                cVar.j(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 13:
                ((zact) this.f101K).f2738r.e(new C0281a(4));
                return;
            case 14:
                throw null;
            case 15:
                C0312e c0312e = (C0312e) this.f101K;
                c0312e.a(true);
                c0312e.invalidateSelf();
                return;
            case 16:
                View$OnTouchListenerC0319f view$OnTouchListenerC0319f = (View$OnTouchListenerC0319f) this.f101K;
                if (view$OnTouchListenerC0319f.f3979o) {
                    boolean z3 = view$OnTouchListenerC0319f.f3977m;
                    C0314a c0314a = view$OnTouchListenerC0319f.f3966a;
                    if (z3) {
                        view$OnTouchListenerC0319f.f3977m = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0314a.f3960e = currentAnimationTimeMillis;
                        c0314a.g = -1L;
                        c0314a.f3961f = currentAnimationTimeMillis;
                        c0314a.f3962h = 0.5f;
                    }
                    if ((c0314a.g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0314a.g + c0314a.f3963i) || !view$OnTouchListenerC0319f.e()) {
                        view$OnTouchListenerC0319f.f3979o = false;
                        return;
                    }
                    boolean z4 = view$OnTouchListenerC0319f.f3978n;
                    ListView listView = view$OnTouchListenerC0319f.f3968c;
                    if (z4) {
                        view$OnTouchListenerC0319f.f3978n = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0314a.f3961f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a4 = c0314a.a(currentAnimationTimeMillis2);
                        c0314a.f3961f = currentAnimationTimeMillis2;
                        view$OnTouchListenerC0319f.f3981q.scrollListBy((int) (((float) (currentAnimationTimeMillis2 - c0314a.f3961f)) * ((a4 * 4.0f) + ((-4.0f) * a4 * a4)) * c0314a.f3959d));
                        Field field = f0.w.f3200a;
                        listView.postOnAnimation(this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 17:
                AbstractC0400B abstractC0400B = (AbstractC0400B) this.f101K;
                abstractC0400B.f4508V = null;
                abstractC0400B.drawableStateChanged();
                return;
            case 18:
                ActionMenuView actionMenuView = ((Toolbar) this.f101K).f2059J;
                if (actionMenuView != null && (iVar = actionMenuView.f1968e0) != null) {
                    iVar.h();
                    return;
                }
                return;
            case 19:
                ((DialogInterface$OnCancelListenerC0459d) this.f101K).f4978Y.onDismiss(null);
                return;
            case 20:
                t0.e eVar = (t0.e) this.f101K;
                if (eVar.f4991R != null) {
                    if (eVar.f4991R == null) {
                        C0001b c0001b2 = new C0001b(27, false);
                        Object obj2 = t0.e.f4982X;
                        c0001b2.f85L = obj2;
                        c0001b2.f84K = obj2;
                        c0001b2.f86M = obj2;
                        eVar.f4991R = c0001b2;
                    }
                    eVar.f4991R.getClass();
                    return;
                }
                return;
            default:
                ((C0001b) this.f101K).getClass();
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
    }

    public RunnableC0004e(j1.j jVar, c0.f fVar) {
        this.f100J = 14;
        this.f101K = fVar;
    }

    public RunnableC0004e(A.c cVar, int r22) {
        this.f100J = 10;
        this.f101K = cVar;
    }
}
