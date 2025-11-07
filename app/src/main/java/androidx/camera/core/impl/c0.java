package androidx.camera.core.impl;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2179a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2180b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2181c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2182d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2183e;

    /* renamed from: f  reason: collision with root package name */
    public final C0096y f2184f;
    public final InputConfiguration g;

    public c0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, C0096y c0096y, InputConfiguration inputConfiguration) {
        this.f2179a = arrayList;
        this.f2180b = Collections.unmodifiableList(arrayList2);
        this.f2181c = Collections.unmodifiableList(arrayList3);
        this.f2182d = Collections.unmodifiableList(arrayList4);
        this.f2183e = Collections.unmodifiableList(arrayList5);
        this.f2184f = c0096y;
        this.g = inputConfiguration;
    }

    public static c0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        ArrayList arrayList5 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        O b3 = O.b();
        Range range = C0079f.f2191e;
        ArrayList arrayList6 = new ArrayList();
        P a4 = P.a();
        ArrayList arrayList7 = new ArrayList(hashSet);
        S a5 = S.a(b3);
        ArrayList arrayList8 = new ArrayList(arrayList6);
        h0 h0Var = h0.f2205b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = a4.f2206a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new c0(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, new C0096y(arrayList7, a5, -1, range, arrayList8, false, new h0(arrayMap), null), null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f2179a.iterator();
        while (it.hasNext()) {
            C0078e c0078e = (C0078e) it.next();
            arrayList.add(c0078e.f2186a);
            for (D d4 : c0078e.f2187b) {
                arrayList.add(d4);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
