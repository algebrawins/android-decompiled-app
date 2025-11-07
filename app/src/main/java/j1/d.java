package J1;

import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements I1.a {

    /* renamed from: e  reason: collision with root package name */
    public static final c f795e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f796a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f797b;

    /* renamed from: c  reason: collision with root package name */
    public final a f798c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f799d;

    public d() {
        HashMap hashMap = new HashMap();
        this.f796a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f797b = hashMap2;
        this.f798c = a.f790a;
        this.f799d = false;
        hashMap2.put(String.class, b.f791b);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, b.f792c);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f795e);
        hashMap.remove(Date.class);
    }

    @Override // I1.a
    public final I1.a a(Class cls, H1.d dVar) {
        this.f796a.put(cls, dVar);
        this.f797b.remove(cls);
        return this;
    }
}
