package w;

import android.text.TextUtils;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import x1.AbstractC0624h4;

/* renamed from: w.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0503m implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5203J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0511v f5204K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ ArrayList f5205L;

    public /* synthetic */ RunnableC0503m(C0511v c0511v, ArrayList arrayList, int r3) {
        this.f5203J = r3;
        this.f5204K = c0511v;
        this.f5205L = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5203J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0511v c0511v = this.f5204K;
                ArrayList arrayList = this.f5205L;
                c0511v.getClass();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                boolean z3 = false;
                boolean z4 = false;
                while (it.hasNext()) {
                    C0493b c0493b = (C0493b) it.next();
                    if (c0511v.f5243J.u(c0493b.f5122a)) {
                        A.f fVar = c0511v.f5243J;
                        ((LinkedHashMap) fVar.f11L).remove(c0493b.f5122a);
                        arrayList2.add(c0493b.f5122a);
                        if (c0493b.f5123b == D.e0.class) {
                            z4 = true;
                        }
                    }
                }
                if (!arrayList2.isEmpty()) {
                    c0511v.q("Use cases [" + TextUtils.join(", ", arrayList2) + "] now DETACHED for camera", null);
                    if (z4) {
                        c0511v.f5249P.f5183P.getClass();
                    }
                    c0511v.f();
                    if (c0511v.f5243J.p().isEmpty()) {
                        c0511v.f5249P.f5187T.e(false);
                    } else {
                        c0511v.J();
                    }
                    if (c0511v.f5243J.o().isEmpty()) {
                        c0511v.f5249P.e();
                        c0511v.B();
                        c0511v.f5249P.p(false);
                        c0511v.f5254U = c0511v.w();
                        c0511v.q("Closing camera.", null);
                        int r12 = AbstractC0507q.f5230a[c0511v.f5246M.ordinal()];
                        if (r12 != 2) {
                            if (r12 != 4 && r12 != 5) {
                                if (r12 != 6 && r12 != 7) {
                                    c0511v.q("close() ignored due to being in state: " + c0511v.f5246M, null);
                                    return;
                                }
                                boolean a4 = c0511v.f5250Q.a();
                                c0511v.C(EnumC0508s.CLOSING);
                                if (a4) {
                                    AbstractC0624h4.f(null, c0511v.v());
                                    c0511v.r();
                                    return;
                                }
                                return;
                            }
                            c0511v.C(EnumC0508s.CLOSING);
                            c0511v.h();
                            return;
                        }
                        if (c0511v.f5252S == null) {
                            z3 = true;
                        }
                        AbstractC0624h4.f(null, z3);
                        c0511v.C(EnumC0508s.INITIALIZED);
                        return;
                    }
                    c0511v.I();
                    c0511v.B();
                    if (c0511v.f5246M == EnumC0508s.OPENED) {
                        c0511v.y();
                        return;
                    }
                    return;
                }
                return;
            default:
                ArrayList arrayList3 = this.f5205L;
                C0511v c0511v2 = this.f5204K;
                C0501k c0501k = c0511v2.f5249P;
                try {
                    c0511v2.F(arrayList3);
                    return;
                } finally {
                    c0501k.e();
                }
        }
    }
}
