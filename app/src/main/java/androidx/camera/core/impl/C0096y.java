package androidx.camera.core.impl;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: androidx.camera.core.impl.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0096y {

    /* renamed from: i  reason: collision with root package name */
    public static final C0076c f2244i = new C0076c("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* renamed from: j  reason: collision with root package name */
    public static final C0076c f2245j = new C0076c("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f2246a;

    /* renamed from: b  reason: collision with root package name */
    public final S f2247b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2248c;

    /* renamed from: d  reason: collision with root package name */
    public final Range f2249d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2250e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2251f;
    public final h0 g;

    /* renamed from: h  reason: collision with root package name */
    public final InterfaceC0086n f2252h;

    public C0096y(ArrayList arrayList, S s3, int r3, Range range, ArrayList arrayList2, boolean z3, h0 h0Var, InterfaceC0086n interfaceC0086n) {
        this.f2246a = arrayList;
        this.f2247b = s3;
        this.f2248c = r3;
        this.f2249d = range;
        this.f2250e = Collections.unmodifiableList(arrayList2);
        this.f2251f = z3;
        this.g = h0Var;
        this.f2252h = interfaceC0086n;
    }
}
