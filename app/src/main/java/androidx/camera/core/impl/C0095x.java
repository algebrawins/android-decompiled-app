package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import v.C0480b;

/* renamed from: androidx.camera.core.impl.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0095x {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f2237a;

    /* renamed from: b  reason: collision with root package name */
    public O f2238b;

    /* renamed from: c  reason: collision with root package name */
    public int f2239c;

    /* renamed from: d  reason: collision with root package name */
    public Range f2240d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f2241e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2242f;
    public final P g;

    /* renamed from: h  reason: collision with root package name */
    public InterfaceC0086n f2243h;

    public C0095x() {
        this.f2237a = new HashSet();
        this.f2238b = O.b();
        this.f2239c = -1;
        this.f2240d = C0079f.f2191e;
        this.f2241e = new ArrayList();
        this.f2242f = false;
        this.g = P.a();
    }

    public final void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((i) it.next());
        }
    }

    public final void b(i iVar) {
        ArrayList arrayList = this.f2241e;
        if (arrayList.contains(iVar)) {
            return;
        }
        arrayList.add(iVar);
    }

    public final void c(A a4) {
        Object obj;
        for (C0076c c0076c : a4.o()) {
            O o3 = this.f2238b;
            o3.getClass();
            try {
                obj = o3.e(c0076c);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Object e4 = a4.e(c0076c);
            if (obj instanceof C0480b) {
                C0480b c0480b = (C0480b) e4;
                c0480b.getClass();
                ((C0480b) obj).f5043a.addAll(Collections.unmodifiableList(new ArrayList(c0480b.f5043a)));
            } else {
                if (e4 instanceof C0480b) {
                    C0480b c0480b2 = (C0480b) e4;
                    c0480b2.getClass();
                    C0480b a5 = C0480b.a();
                    a5.f5043a.addAll(Collections.unmodifiableList(new ArrayList(c0480b2.f5043a)));
                    e4 = a5;
                }
                this.f2238b.f(c0076c, a4.g0(c0076c), e4);
            }
        }
    }

    public final C0096y d() {
        ArrayList arrayList = new ArrayList(this.f2237a);
        S a4 = S.a(this.f2238b);
        int r3 = this.f2239c;
        Range range = this.f2240d;
        ArrayList arrayList2 = new ArrayList(this.f2241e);
        boolean z3 = this.f2242f;
        h0 h0Var = h0.f2205b;
        ArrayMap arrayMap = new ArrayMap();
        P p2 = this.g;
        for (String str : p2.f2206a.keySet()) {
            arrayMap.put(str, p2.f2206a.get(str));
        }
        return new C0096y(arrayList, a4, r3, range, arrayList2, z3, new h0(arrayMap), this.f2243h);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [androidx.camera.core.impl.P, androidx.camera.core.impl.h0] */
    public C0095x(C0096y c0096y) {
        HashSet hashSet = new HashSet();
        this.f2237a = hashSet;
        this.f2238b = O.b();
        this.f2239c = -1;
        this.f2240d = C0079f.f2191e;
        ArrayList arrayList = new ArrayList();
        this.f2241e = arrayList;
        this.f2242f = false;
        this.g = P.a();
        hashSet.addAll(c0096y.f2246a);
        this.f2238b = O.c(c0096y.f2247b);
        this.f2239c = c0096y.f2248c;
        this.f2240d = c0096y.f2249d;
        arrayList.addAll(c0096y.f2250e);
        this.f2242f = c0096y.f2251f;
        ArrayMap arrayMap = new ArrayMap();
        h0 h0Var = c0096y.g;
        for (String str : h0Var.f2206a.keySet()) {
            arrayMap.put(str, h0Var.f2206a.get(str));
        }
        this.g = new h0(arrayMap);
    }
}
