package D;

import A0.C0001b;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.C0079f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.InterfaceC0247a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import x1.AbstractC0624h4;
import x1.AbstractC0636k0;
import x1.AbstractC0699s0;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f423a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Size f424b;

    /* renamed from: c  reason: collision with root package name */
    public final S.l f425c;

    /* renamed from: d  reason: collision with root package name */
    public final S.i f426d;

    /* renamed from: e  reason: collision with root package name */
    public final S.l f427e;

    /* renamed from: f  reason: collision with root package name */
    public final S.i f428f;
    public final S.i g;

    /* renamed from: h  reason: collision with root package name */
    public final l0 f429h;

    /* renamed from: i  reason: collision with root package name */
    public C0030k f430i;

    /* renamed from: j  reason: collision with root package name */
    public A.k f431j;

    /* renamed from: k  reason: collision with root package name */
    public G.e f432k;

    static {
        Range range = C0079f.f2191e;
    }

    public n0(Size size, N.i iVar) {
        this.f424b = size;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        S.l a4 = AbstractC0699s0.a(new S.j() { // from class: D.i0
            @Override // S.j
            public final Object a0(S.i iVar2) {
                switch (r3) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        atomicReference.set(iVar2);
                        return C.z(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference.set(iVar2);
                        return C.z(new StringBuilder(), str, "-status");
                    default:
                        atomicReference.set(iVar2);
                        return C.z(new StringBuilder(), str, "-Surface");
                }
            }
        });
        S.i iVar2 = (S.i) atomicReference.get();
        iVar2.getClass();
        this.g = iVar2;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        S.l a5 = AbstractC0699s0.a(new S.j() { // from class: D.i0
            @Override // S.j
            public final Object a0(S.i iVar22) {
                switch (r3) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        atomicReference2.set(iVar22);
                        return C.z(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference2.set(iVar22);
                        return C.z(new StringBuilder(), str, "-status");
                    default:
                        atomicReference2.set(iVar22);
                        return C.z(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.f427e = a5;
        a5.a(new H.e(0, a5, new A.f(2, iVar2, a4)), AbstractC0636k0.a());
        S.i iVar3 = (S.i) atomicReference2.get();
        iVar3.getClass();
        final AtomicReference atomicReference3 = new AtomicReference(null);
        S.l a6 = AbstractC0699s0.a(new S.j() { // from class: D.i0
            @Override // S.j
            public final Object a0(S.i iVar22) {
                switch (r3) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        atomicReference3.set(iVar22);
                        return C.z(new StringBuilder(), str, "-cancellation");
                    case 1:
                        atomicReference3.set(iVar22);
                        return C.z(new StringBuilder(), str, "-status");
                    default:
                        atomicReference3.set(iVar22);
                        return C.z(new StringBuilder(), str, "-Surface");
                }
            }
        });
        this.f425c = a6;
        S.i iVar4 = (S.i) atomicReference3.get();
        iVar4.getClass();
        this.f426d = iVar4;
        l0 l0Var = new l0(this, size);
        this.f429h = l0Var;
        E1.a d4 = H.f.d(l0Var.f2113e);
        a6.a(new H.e(0, a6, new C0001b(d4, iVar3, str, 2)), AbstractC0636k0.a());
        d4.a(new j0(this, 0), AbstractC0636k0.a());
        G.a a7 = AbstractC0636k0.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        S.l a8 = AbstractC0699s0.a(new C.f(3, this, atomicReference4));
        a8.a(new H.e(0, a8, new A.a(12, iVar)), a7);
        S.i iVar5 = (S.i) atomicReference4.get();
        iVar5.getClass();
        this.f428f = iVar5;
    }

    public final void a(final Surface surface, Executor executor, final InterfaceC0247a interfaceC0247a) {
        if (!this.f426d.a(surface)) {
            S.l lVar = this.f425c;
            if (!lVar.isCancelled()) {
                AbstractC0624h4.f(null, lVar.f1193K.isDone());
                try {
                    lVar.get();
                    executor.execute(new Runnable() { // from class: D.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                    interfaceC0247a.accept(new C0029j(3, surface));
                                    return;
                                default:
                                    interfaceC0247a.accept(new C0029j(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: D.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                    interfaceC0247a.accept(new C0029j(3, surface));
                                    return;
                                default:
                                    interfaceC0247a.accept(new C0029j(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        A.f fVar = new A.f(3, interfaceC0247a, surface);
        S.l lVar2 = this.f427e;
        lVar2.a(new H.e(0, lVar2, fVar), executor);
    }
}
