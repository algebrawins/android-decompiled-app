package io.flutter.plugin.platform;

import android.app.Activity;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceControl;
import d2.C0235c;
import h2.J;
import h2.t;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import k0.C0322i;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a  reason: collision with root package name */
    public P1.c f3565a;

    /* renamed from: b  reason: collision with root package name */
    public Activity f3566b;

    /* renamed from: c  reason: collision with root package name */
    public t f3567c;

    /* renamed from: e  reason: collision with root package name */
    public C0322i f3569e;

    /* renamed from: d  reason: collision with root package name */
    public FlutterJNI f3568d = null;

    /* renamed from: k  reason: collision with root package name */
    public Surface f3574k = null;

    /* renamed from: l  reason: collision with root package name */
    public SurfaceControl f3575l = null;

    /* renamed from: m  reason: collision with root package name */
    public final C0235c f3576m = new C0235c(4, this);

    /* renamed from: f  reason: collision with root package name */
    public final a f3570f = new Object();
    public final SparseArray g = new SparseArray();

    /* renamed from: h  reason: collision with root package name */
    public final SparseArray f3571h = new SparseArray();

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f3572i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f3573j = new ArrayList();

    /* JADX WARN: Type inference failed for: r0v2, types: [io.flutter.plugin.platform.a, java.lang.Object] */
    public i() {
        if (J.f3300M == null) {
            J.f3300M = new J(0);
        }
    }

    @Override // io.flutter.plugin.platform.g
    public final void a() {
        this.f3570f.f3558a = null;
    }

    @Override // io.flutter.plugin.platform.g
    public final void b(io.flutter.view.q qVar) {
        this.f3570f.f3558a = qVar;
    }

    @Override // io.flutter.plugin.platform.g
    public final boolean c(int r12) {
        return false;
    }

    @Override // io.flutter.plugin.platform.g
    public final void d(int r22) {
        if (this.g.get(r22) == null) {
            return;
        }
        throw new ClassCastException();
    }
}
