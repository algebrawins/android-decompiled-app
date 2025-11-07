package y1;

import A0.C0001b;
import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import x1.C0727v4;
import x1.K6;

/* loaded from: classes.dex */
public final class P4 implements M4 {

    /* renamed from: a  reason: collision with root package name */
    public final F1.o f6286a;

    /* renamed from: b  reason: collision with root package name */
    public final L4 f6287b;

    public P4(Context context, L4 l4) {
        this.f6287b = l4;
        T0.a aVar = T0.a.f1205e;
        V0.i.b(context);
        C0001b c4 = V0.i.a().c(aVar);
        if (T0.a.f1204d.contains(new S0.b("json"))) {
            new F1.o(new K6(2, c4));
        }
        this.f6286a = new F1.o(new K6(3, c4));
    }

    @Override // y1.M4
    public final void a(C0727v4 c0727v4) {
        L4 l4 = this.f6287b;
        l4.getClass();
        V0.h hVar = (V0.h) this.f6286a.get();
        l4.getClass();
        ((d2.q) c0727v4.f6109K).f3056R = false;
        d2.q qVar = (d2.q) c0727v4.f6109K;
        qVar.f3054P = Boolean.FALSE;
        C0872o4 c0872o4 = new C0872o4(qVar);
        w2.q qVar2 = (w2.q) c0727v4.f6108J;
        qVar2.f5401J = c0872o4;
        try {
            S4.b();
            S4 s4 = S4.f6299c;
            C0865n3 c0865n3 = new C0865n3(qVar2);
            C0825g c0825g = new C0825g();
            s4.a(c0825g);
            hVar.a(new S0.a(new C0825g(new HashMap(c0825g.f6381a), new HashMap(c0825g.f6382b), c0825g.f6383c).b(c0865n3), S0.c.VERY_LOW));
        } catch (UnsupportedEncodingException e4) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e4);
        }
    }
}
