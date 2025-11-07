package a3;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class s {
    private volatile AtomicReferenceArray<Object> array;

    public s(int r22) {
        this.array = new AtomicReferenceArray<>(r22);
    }

    public final int a() {
        return this.array.length();
    }

    public final Object b(int r3) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (r3 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(r3);
        }
        return null;
    }

    public final void c(int r6, c3.b bVar) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (r6 < length) {
            atomicReferenceArray.set(r6, bVar);
            return;
        }
        int r3 = r6 + 1;
        int r4 = length * 2;
        if (r3 < r4) {
            r3 = r4;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(r3);
        for (int r32 = 0; r32 < length; r32++) {
            atomicReferenceArray2.set(r32, atomicReferenceArray.get(r32));
        }
        atomicReferenceArray2.set(r6, bVar);
        this.array = atomicReferenceArray2;
    }
}
