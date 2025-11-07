package B0;

import C1.i;
import C1.j;
import D.C0021a;
import D.C0042x;
import N2.g;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.text.TextUtils;
import android.view.Surface;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.L;
import androidx.lifecycle.EnumC0137k;
import androidx.lifecycle.l;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import r.C0441f;
import x.C0559n;
import x.t;
import x1.AbstractC0624h4;
import x1.X;
import y.InterfaceC0773b;

/* loaded from: classes.dex */
public final class e implements L {

    /* renamed from: J  reason: collision with root package name */
    public final Object f183J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f184K;

    /* renamed from: L  reason: collision with root package name */
    public Object f185L;

    public e() {
        this.f183J = new Object();
    }

    public static boolean a(C0042x c0042x, C0042x c0042x2) {
        AbstractC0624h4.f("Fully specified range is not actually fully specified.", c0042x2.b());
        int r02 = c0042x.f485a;
        int r4 = c0042x2.f485a;
        if (r02 == 2 && r4 == 1) {
            return false;
        }
        if (r02 != 2 && r02 != 0 && r02 != r4) {
            return false;
        }
        int r5 = c0042x.f486b;
        if (r5 == 0 || r5 == c0042x2.f486b) {
            return true;
        }
        return false;
    }

    public static boolean b(C0042x c0042x, C0042x c0042x2, HashSet hashSet) {
        if (!hashSet.contains(c0042x2)) {
            X.a("DynamicRangeResolver", "Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + c0042x + "\nCandidate dynamic range:\n  " + c0042x2);
            return false;
        }
        return a(c0042x, c0042x2);
    }

    public static C0042x c(C0042x c0042x, LinkedHashSet linkedHashSet, HashSet hashSet) {
        if (c0042x.f485a == 1) {
            return null;
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C0042x c0042x2 = (C0042x) it.next();
            AbstractC0624h4.e(c0042x2, "Fully specified DynamicRange cannot be null.");
            AbstractC0624h4.f("Fully specified DynamicRange must have fully defined encoding.", c0042x2.b());
            if (c0042x2.f485a != 1 && b(c0042x, c0042x2, hashSet)) {
                return c0042x2;
            }
        }
        return null;
    }

    public static void f(HashSet hashSet, C0042x c0042x, t tVar) {
        AbstractC0624h4.f("Cannot update already-empty constraints.", !hashSet.isEmpty());
        Set b3 = ((InterfaceC0773b) tVar.f5471a).b(c0042x);
        if (!b3.isEmpty()) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet.retainAll(b3);
            if (hashSet.isEmpty()) {
                String join = TextUtils.join("\n  ", b3);
                String join2 = TextUtils.join("\n  ", hashSet2);
                throw new IllegalArgumentException("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + c0042x + "\nConstraints:\n  " + join + "\nExisting constraints:\n  " + join2);
            }
        }
    }

    @Override // androidx.camera.core.impl.L
    public D.X acquireLatestImage() {
        Image image;
        synchronized (this.f183J) {
            try {
                image = ((ImageReader) this.f185L).acquireLatestImage();
            } catch (RuntimeException e4) {
                if ("ImageReaderContext is not initialized".equals(e4.getMessage())) {
                    image = null;
                } else {
                    throw e4;
                }
            }
            if (image == null) {
                return null;
            }
            return new C0021a(image);
        }
    }

    @Override // androidx.camera.core.impl.L, c0.InterfaceC0157a
    public void close() {
        synchronized (this.f183J) {
            ((ImageReader) this.f185L).close();
        }
    }

    public void d(double d4, double d5) {
        boolean z3 = this.f184K;
        double[] dArr = (double[]) this.f183J;
        double d6 = 1.0d;
        if (!z3) {
            d6 = 1.0d / (((dArr[7] * d5) + (dArr[3] * d4)) + dArr[15]);
        }
        double d7 = ((dArr[4] * d5) + (dArr[0] * d4) + dArr[12]) * d6;
        double d8 = ((dArr[5] * d5) + (dArr[1] * d4) + dArr[13]) * d6;
        double[] dArr2 = (double[]) this.f185L;
        if (d7 < dArr2[0]) {
            dArr2[0] = d7;
        } else if (d7 > dArr2[1]) {
            dArr2[1] = d7;
        }
        if (d8 < dArr2[2]) {
            dArr2[2] = d8;
        } else if (d8 > dArr2[3]) {
            dArr2[3] = d8;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.r, java.lang.Object] */
    public void e() {
        ?? r02 = this.f183J;
        androidx.lifecycle.t b3 = r02.b();
        if (b3.f2467c == l.INITIALIZED) {
            b3.a(new a(0, r02));
            final d dVar = (d) this.f185L;
            dVar.getClass();
            if (!dVar.f179a) {
                b3.a(new p() { // from class: B0.b
                    @Override // androidx.lifecycle.p
                    public final void h(r rVar, EnumC0137k enumC0137k) {
                        g.e(d.this, "this$0");
                    }
                });
                dVar.f179a = true;
                this.f184K = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void g(i iVar) {
        synchronized (this.f183J) {
            try {
                if (((ArrayDeque) this.f185L) == null) {
                    this.f185L = new ArrayDeque();
                }
                ((ArrayDeque) this.f185L).add(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.impl.L
    public int getHeight() {
        int height;
        synchronized (this.f183J) {
            height = ((ImageReader) this.f185L).getHeight();
        }
        return height;
    }

    @Override // androidx.camera.core.impl.L
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f183J) {
            surface = ((ImageReader) this.f185L).getSurface();
        }
        return surface;
    }

    @Override // androidx.camera.core.impl.L
    public int getWidth() {
        int width;
        synchronized (this.f183J) {
            width = ((ImageReader) this.f185L).getWidth();
        }
        return width;
    }

    public void h(j jVar) {
        i iVar;
        synchronized (this.f183J) {
            if (((ArrayDeque) this.f185L) != null && !this.f184K) {
                this.f184K = true;
                while (true) {
                    synchronized (this.f183J) {
                        try {
                            iVar = (i) ((ArrayDeque) this.f185L).poll();
                            if (iVar == null) {
                                this.f184K = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    iVar.a(jVar);
                }
            }
        }
    }

    @Override // androidx.camera.core.impl.L
    public int k() {
        int maxImages;
        synchronized (this.f183J) {
            maxImages = ((ImageReader) this.f185L).getMaxImages();
        }
        return maxImages;
    }

    @Override // androidx.camera.core.impl.L
    public int m() {
        int imageFormat;
        synchronized (this.f183J) {
            imageFormat = ((ImageReader) this.f185L).getImageFormat();
        }
        return imageFormat;
    }

    @Override // androidx.camera.core.impl.L
    public D.X o() {
        Image image;
        synchronized (this.f183J) {
            try {
                image = ((ImageReader) this.f185L).acquireNextImage();
            } catch (RuntimeException e4) {
                if ("ImageReaderContext is not initialized".equals(e4.getMessage())) {
                    image = null;
                } else {
                    throw e4;
                }
            }
            if (image == null) {
                return null;
            }
            return new C0021a(image);
        }
    }

    @Override // androidx.camera.core.impl.L
    public void s() {
        synchronized (this.f183J) {
            this.f184K = true;
            ((ImageReader) this.f185L).setOnImageAvailableListener(null, null);
        }
    }

    @Override // androidx.camera.core.impl.L
    public void t(final K k3, final Executor executor) {
        synchronized (this.f183J) {
            this.f184K = false;
            ((ImageReader) this.f185L).setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: D.b
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    B0.e eVar = B0.e.this;
                    Executor executor2 = executor;
                    androidx.camera.core.impl.K k4 = k3;
                    synchronized (eVar.f183J) {
                        try {
                            if (!eVar.f184K) {
                                executor2.execute(new RunnableC0023c(0, eVar, k4));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, F.e.c());
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, B0.d] */
    public e(f fVar) {
        this.f183J = fVar;
        ?? obj = new Object();
        obj.f181c = new C0441f();
        this.f185L = obj;
    }

    public e(ImageReader imageReader) {
        this.f183J = new Object();
        this.f184K = true;
        this.f185L = imageReader;
    }

    public e(C0559n c0559n) {
        this.f183J = c0559n;
        this.f185L = t.a(c0559n);
        int[] r6 = (int[]) c0559n.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        boolean z3 = false;
        if (r6 != null) {
            int length = r6.length;
            int r22 = 0;
            while (true) {
                if (r22 >= length) {
                    break;
                } else if (r6[r22] == 18) {
                    z3 = true;
                    break;
                } else {
                    r22++;
                }
            }
        }
        this.f184K = z3;
    }

    public e(boolean z3, double[] dArr, double[] dArr2) {
        this.f184K = z3;
        this.f183J = dArr;
        this.f185L = dArr2;
    }
}
