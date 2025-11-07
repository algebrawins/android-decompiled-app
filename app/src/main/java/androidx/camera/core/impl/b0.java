package androidx.camera.core.impl;

import A.h;
import D.e0;
import android.hardware.camera2.params.InputConfiguration;
import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.core.impl.C0078e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 extends Y {

    /* renamed from: k  reason: collision with root package name */
    public static final List f2172k = Arrays.asList(1, 5, 3);

    /* renamed from: h  reason: collision with root package name */
    public final A.h f2173h = new A.h(2);

    /* renamed from: i  reason: collision with root package name */
    public boolean f2174i = true;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2175j = false;

    public final void a(c0 c0Var) {
        C0096y c0096y = c0Var.f2184f;
        int r12 = c0096y.f2248c;
        C0095x c0095x = this.f2159b;
        if (r12 != -1) {
            this.f2175j = true;
            int r22 = c0095x.f2239c;
            Integer valueOf = Integer.valueOf(r12);
            List list = f2172k;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(r22))) {
                r12 = r22;
            }
            c0095x.f2239c = r12;
        }
        Range range = C0079f.f2191e;
        Range range2 = c0096y.f2249d;
        if (!range2.equals(range)) {
            if (c0095x.f2240d.equals(range)) {
                c0095x.f2240d = range2;
            } else if (!c0095x.f2240d.equals(range2)) {
                this.f2174i = false;
                x1.X.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
            }
        }
        C0096y c0096y2 = c0Var.f2184f;
        c0095x.g.f2206a.putAll((Map) c0096y2.g.f2206a);
        this.f2160c.addAll(c0Var.f2180b);
        this.f2161d.addAll(c0Var.f2181c);
        c0095x.a(c0096y2.f2250e);
        this.f2163f.addAll(c0Var.f2182d);
        this.f2162e.addAll(c0Var.f2183e);
        InputConfiguration inputConfiguration = c0Var.g;
        if (inputConfiguration != null) {
            this.g = inputConfiguration;
        }
        LinkedHashSet<C0078e> linkedHashSet = this.f2158a;
        linkedHashSet.addAll(c0Var.f2179a);
        HashSet hashSet = c0095x.f2237a;
        hashSet.addAll(Collections.unmodifiableList(c0096y.f2246a));
        ArrayList arrayList = new ArrayList();
        for (C0078e c0078e : linkedHashSet) {
            arrayList.add(c0078e.f2186a);
            for (D d4 : c0078e.f2187b) {
                arrayList.add(d4);
            }
        }
        if (!arrayList.containsAll(hashSet)) {
            x1.X.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
            this.f2174i = false;
        }
        c0095x.c(c0096y.f2247b);
    }

    public final c0 b() {
        if (this.f2174i) {
            ArrayList arrayList = new ArrayList(this.f2158a);
            final A.h hVar = this.f2173h;
            if (hVar.f13a) {
                Collections.sort(arrayList, new Comparator() { // from class: L.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int r6;
                        C0078e c0078e = (C0078e) obj2;
                        h.this.getClass();
                        Class cls = ((C0078e) obj).f2186a.f2117j;
                        int r02 = 1;
                        if (cls == MediaCodec.class) {
                            r6 = 2;
                        } else if (cls == e0.class) {
                            r6 = 0;
                        } else {
                            r6 = 1;
                        }
                        Class cls2 = c0078e.f2186a.f2117j;
                        if (cls2 == MediaCodec.class) {
                            r02 = 2;
                        } else if (cls2 == e0.class) {
                            r02 = 0;
                        }
                        return r6 - r02;
                    }
                });
            }
            return new c0(arrayList, new ArrayList(this.f2160c), new ArrayList(this.f2161d), new ArrayList(this.f2163f), new ArrayList(this.f2162e), this.f2159b.d(), this.g);
        }
        throw new IllegalArgumentException("Unsupported session configuration combination");
    }
}
