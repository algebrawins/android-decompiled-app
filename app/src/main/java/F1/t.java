package F1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x1.AbstractC0620h0;

/* loaded from: classes.dex */
public final class t extends AbstractC0620h0 {

    /* renamed from: a  reason: collision with root package name */
    public final Set f648a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f649b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f650c;

    /* renamed from: d  reason: collision with root package name */
    public final Set f651d;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC0620h0 f652e;

    public t(b bVar, AbstractC0620h0 abstractC0620h0) {
        boolean z3;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (k kVar : bVar.f616b) {
            int r7 = kVar.f638c;
            if (r7 == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            int r10 = kVar.f637b;
            Class cls = kVar.f636a;
            if (z3) {
                if (r10 == 2) {
                    hashSet4.add(cls);
                } else {
                    hashSet.add(cls);
                }
            } else if (r7 == 2) {
                hashSet3.add(cls);
            } else if (r10 == 2) {
                hashSet5.add(cls);
            } else {
                hashSet2.add(cls);
            }
        }
        if (!bVar.f619e.isEmpty()) {
            hashSet.add(K1.a.class);
        }
        this.f648a = Collections.unmodifiableSet(hashSet);
        this.f649b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f650c = Collections.unmodifiableSet(hashSet4);
        this.f651d = Collections.unmodifiableSet(hashSet5);
        this.f652e = abstractC0620h0;
    }

    @Override // x1.AbstractC0620h0
    public final Object a(Class cls) {
        if (this.f648a.contains(cls)) {
            Object a4 = this.f652e.a(cls);
            if (!cls.equals(K1.a.class)) {
                return a4;
            }
            K1.a aVar = (K1.a) a4;
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // x1.AbstractC0620h0
    public final L1.a b(Class cls) {
        if (this.f649b.contains(cls)) {
            return this.f652e.b(cls);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + cls + ">.");
    }

    @Override // x1.AbstractC0620h0
    public final Set c(Class cls) {
        if (this.f650c.contains(cls)) {
            return this.f652e.c(cls);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + cls + ">.");
    }

    @Override // x1.AbstractC0620h0
    public final L1.a d(Class cls) {
        if (this.f651d.contains(cls)) {
            return this.f652e.d(cls);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<Set<" + cls + ">>.");
    }
}
