package F1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import x1.AbstractC0628j0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Set f615a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f616b;

    /* renamed from: c  reason: collision with root package name */
    public final int f617c;

    /* renamed from: d  reason: collision with root package name */
    public final d f618d;

    /* renamed from: e  reason: collision with root package name */
    public final Set f619e;

    public b(HashSet hashSet, HashSet hashSet2, int r3, d dVar, HashSet hashSet3) {
        this.f615a = Collections.unmodifiableSet(hashSet);
        this.f616b = Collections.unmodifiableSet(hashSet2);
        this.f617c = r3;
        this.f618d = dVar;
        this.f619e = Collections.unmodifiableSet(hashSet3);
    }

    public static B.a a(Class cls) {
        return new B.a(cls, new Class[0]);
    }

    public static b b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            AbstractC0628j0.a(cls2, "Null interface");
        }
        Collections.addAll(hashSet, clsArr);
        return new b(new HashSet(hashSet), new HashSet(hashSet2), 0, new a(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f615a.toArray()) + ">{0, type=" + this.f617c + ", deps=" + Arrays.toString(this.f616b.toArray()) + "}";
    }
}
