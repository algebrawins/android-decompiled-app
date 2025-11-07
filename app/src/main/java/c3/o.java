package c3;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2703b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2704c = AtomicIntegerFieldUpdater.newUpdater(o.class, "producerIndex");

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2705d = AtomicIntegerFieldUpdater.newUpdater(o.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2706e = AtomicIntegerFieldUpdater.newUpdater(o.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray f2707a = new AtomicReferenceArray((int) RecognitionOptions.ITF);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final j a(j jVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2704c;
        if (atomicIntegerFieldUpdater.get(this) - f2705d.get(this) == 127) {
            return jVar;
        }
        if (jVar.f2692K.f2693J == 1) {
            f2706e.incrementAndGet(this);
        }
        int r12 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f2707a;
            if (atomicReferenceArray.get(r12) != null) {
                Thread.yield();
            } else {
                atomicReferenceArray.lazySet(r12, jVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
        }
    }

    public final j b() {
        j jVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2705d;
            int r12 = atomicIntegerFieldUpdater.get(this);
            if (r12 - f2704c.get(this) == 0) {
                return null;
            }
            int r22 = r12 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, r12, r12 + 1) && (jVar = (j) this.f2707a.getAndSet(r22, null)) != null) {
                if (jVar.f2692K.f2693J == 1) {
                    f2706e.decrementAndGet(this);
                }
                return jVar;
            }
        }
    }

    public final j c(int r6, boolean z3) {
        int r62 = r6 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f2707a;
        j jVar = (j) atomicReferenceArray.get(r62);
        if (jVar != null) {
            boolean z4 = true;
            if (jVar.f2692K.f2693J != 1) {
                z4 = false;
            }
            if (z4 == z3) {
                while (!atomicReferenceArray.compareAndSet(r62, jVar, null)) {
                    if (atomicReferenceArray.get(r62) != jVar) {
                    }
                }
                if (z3) {
                    f2706e.decrementAndGet(this);
                }
                return jVar;
            }
        }
        return null;
    }
}
