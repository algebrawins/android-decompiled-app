package F1;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import x1.AbstractC0620h0;
import x1.i0;

/* loaded from: classes.dex */
public final class h extends AbstractC0620h0 {

    /* renamed from: d  reason: collision with root package name */
    public final m f629d;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f626a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f627b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f628c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference f630e = new AtomicReference();

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, F1.m] */
    public h(ArrayList arrayList, ArrayList arrayList2) {
        ?? obj = new Object();
        new HashMap();
        obj.f639a = new ArrayDeque();
        this.f629d = obj;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(b.b(obj, m.class, K1.b.class, K1.a.class));
        arrayList3.add(b.b(this, h.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    e eVar = (e) ((L1.a) it3.next()).get();
                    if (eVar != null) {
                        arrayList3.addAll(eVar.a());
                        it3.remove();
                    }
                } catch (n e4) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e4);
                }
            }
            if (this.f626a.isEmpty()) {
                i0.a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f626a.keySet());
                arrayList6.addAll(arrayList3);
                i0.a(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                final b bVar2 = (b) it4.next();
                this.f626a.put(bVar2, new o(new L1.a(this, bVar2) { // from class: F1.f

                    /* renamed from: a  reason: collision with root package name */
                    public final h f621a;

                    /* renamed from: b  reason: collision with root package name */
                    public final b f622b;

                    {
                        this.f621a = this;
                        this.f622b = bVar2;
                    }

                    @Override // L1.a
                    public final Object get() {
                        b bVar3 = this.f622b;
                        return bVar3.f618d.a(new t(bVar3, this.f621a));
                    }
                }));
            }
            arrayList5.addAll(h(arrayList3));
            arrayList5.addAll(i());
            g();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f630e.get();
        if (bool != null) {
            e(this.f626a, bool.booleanValue());
        }
    }

    @Override // x1.AbstractC0620h0
    public final synchronized L1.a b(Class cls) {
        return (L1.a) this.f627b.get(cls);
    }

    @Override // x1.AbstractC0620h0
    public final synchronized L1.a d(Class cls) {
        p pVar = (p) this.f628c.get(cls);
        if (pVar != null) {
            return pVar;
        }
        return g.f623b;
    }

    public final void e(HashMap hashMap, boolean z3) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            L1.a aVar = (L1.a) entry.getValue();
            ((b) entry.getKey()).getClass();
        }
        m mVar = this.f629d;
        synchronized (mVar) {
            arrayDeque = mVar.f639a;
            if (arrayDeque != null) {
                mVar.f639a = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
        }
    }

    public final void f() {
        HashMap hashMap;
        AtomicReference atomicReference = this.f630e;
        Boolean bool = Boolean.TRUE;
        while (!atomicReference.compareAndSet(null, bool)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            hashMap = new HashMap(this.f626a);
        }
        e(hashMap, true);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, F1.r] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, F1.p] */
    public final void g() {
        for (b bVar : this.f626a.keySet()) {
            for (k kVar : bVar.f616b) {
                if (kVar.f637b == 2 && !this.f628c.containsKey(kVar.f636a)) {
                    HashMap hashMap = this.f628c;
                    Class cls = kVar.f636a;
                    Set emptySet = Collections.emptySet();
                    ?? obj = new Object();
                    obj.f644b = null;
                    obj.f643a = Collections.newSetFromMap(new ConcurrentHashMap());
                    obj.f643a.addAll(emptySet);
                    hashMap.put(cls, obj);
                } else if (this.f627b.containsKey(kVar.f636a)) {
                    continue;
                } else {
                    int r4 = kVar.f637b;
                    if (r4 != 1) {
                        if (r4 != 2) {
                            HashMap hashMap2 = this.f627b;
                            Class cls2 = kVar.f636a;
                            q qVar = q.f645a;
                            g gVar = g.f624c;
                            ?? obj2 = new Object();
                            obj2.f646a = qVar;
                            obj2.f647b = gVar;
                            hashMap2.put(cls2, obj2);
                        }
                    } else {
                        Class cls3 = kVar.f636a;
                        throw new RuntimeException("Unsatisfied dependency for component " + bVar + ": " + cls3);
                    }
                }
            }
        }
    }

    public final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f617c == 0) {
                L1.a aVar = (L1.a) this.f626a.get(bVar);
                for (Class cls : bVar.f615a) {
                    HashMap hashMap = this.f627b;
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, aVar);
                    } else {
                        arrayList2.add(new H.e(5, (r) ((L1.a) hashMap.get(cls)), aVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, F1.p] */
    public final ArrayList i() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f626a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f617c != 0) {
                L1.a aVar = (L1.a) entry.getValue();
                for (Class cls : bVar.f615a) {
                    if (!hashMap.containsKey(cls)) {
                        hashMap.put(cls, new HashSet());
                    }
                    ((Set) hashMap.get(cls)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f628c;
            if (!hashMap2.containsKey(key)) {
                ?? obj = new Object();
                obj.f644b = null;
                obj.f643a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f643a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap2.put((Class) entry2.getKey(), obj);
            } else {
                p pVar = (p) hashMap2.get(entry2.getKey());
                for (L1.a aVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new H.e(6, pVar, aVar2));
                }
            }
        }
        return arrayList;
    }
}
