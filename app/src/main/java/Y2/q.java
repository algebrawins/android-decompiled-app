package Y2;

import V2.C0050f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class q extends Z2.b implements d, e, Z2.j {

    /* renamed from: N  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1738N = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state");

    /* renamed from: M  reason: collision with root package name */
    public int f1739M;
    private volatile Object _state;

    public q(Object obj) {
        this._state = obj;
    }

    @Override // Y2.e
    public final Object b(Object obj, D2.d dVar) {
        if (obj == null) {
            obj = Z2.l.f1793a;
        }
        c(null, obj);
        return B2.i.f210a;
    }

    public final boolean c(Object obj, Object obj2) {
        int r12;
        Z2.c[] cVarArr;
        U1.b bVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1738N;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !N2.g.a(obj3, obj)) {
                return false;
            }
            if (N2.g.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int r11 = this.f1739M;
            if ((r11 & 1) == 0) {
                int r112 = r11 + 1;
                this.f1739M = r112;
                Z2.c[] cVarArr2 = this.f1773J;
                while (true) {
                    s[] sVarArr = (s[]) cVarArr2;
                    if (sVarArr != null) {
                        for (s sVar : sVarArr) {
                            if (sVar != null) {
                                while (true) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s.f1742a;
                                    Object obj4 = atomicReferenceFieldUpdater2.get(sVar);
                                    if (obj4 != null && obj4 != (bVar = r.f1741b)) {
                                        U1.b bVar2 = r.f1740a;
                                        if (obj4 == bVar2) {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, bVar)) {
                                                if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReferenceFieldUpdater2.compareAndSet(sVar, obj4, bVar2)) {
                                                if (atomicReferenceFieldUpdater2.get(sVar) != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C0050f) obj4).i(B2.i.f210a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        r12 = this.f1739M;
                        if (r12 == r112) {
                            this.f1739M = r112 + 1;
                            return true;
                        }
                        cVarArr = this.f1773J;
                    }
                    cVarArr2 = cVarArr;
                    r112 = r12;
                }
            } else {
                this.f1739M = r11 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
        if (r0.equals(r4) != false) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:89:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0118 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0038, B:50:0x00cc, B:52:0x00d4, B:55:0x00db, B:56:0x00e1, B:58:0x00e4, B:68:0x0105, B:71:0x0118, B:72:0x0130, B:78:0x0144, B:75:0x013b, B:77:0x0141, B:60:0x00ea, B:64:0x00f1, B:21:0x0053, B:24:0x005e, B:49:0x00bc), top: B:89:0x0026 }] */
    /* JADX WARN: Type inference failed for: r0v4, types: [Z2.c[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0117 -> B:50:0x00cc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x014d -> B:83:0x0150). Please submit an issue!!! */
    @Override // Y2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(Y2.e r17, D2.d r18) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.q.h(Y2.e, D2.d):java.lang.Object");
    }

    @Override // Z2.j
    public final d s(D2.i iVar, int r3, X2.a aVar) {
        if ((((r3 >= 0 && r3 < 2) || r3 == -2) && aVar == X2.a.DROP_OLDEST) || ((r3 == 0 || r3 == -3) && aVar == X2.a.SUSPEND)) {
            return this;
        }
        return new Z2.h(this, iVar, r3, aVar);
    }
}
