package U1;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import c1.InterfaceC0160b;
import d2.q;
import h1.C0283c;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import x1.C0618g6;
import x1.N6;
import x1.P4;
import x1.V;

/* loaded from: classes.dex */
public final class h implements InterfaceC0160b {

    /* renamed from: J  reason: collision with root package name */
    public int f1340J;

    /* renamed from: K  reason: collision with root package name */
    public Object f1341K;

    /* renamed from: L  reason: collision with root package name */
    public Object f1342L;

    public h() {
        this.f1341K = new Object[8];
        this.f1340J = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r3.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static U1.h a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.h.a(android.content.res.Resources, int, android.content.res.Resources$Theme):U1.h");
    }

    @Override // c1.InterfaceC0160b
    public Object Y() {
        ((a1.g) this.f1341K).f1825d.a((V0.c) this.f1342L, this.f1340J + 1, false);
        return null;
    }

    public boolean b() {
        ColorStateList colorStateList;
        if (((Shader) this.f1341K) == null && (colorStateList = (ColorStateList) this.f1342L) != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public void c(String str, C0283c c0283c) {
        int r02 = this.f1340J + 1;
        Object[] objArr = (Object[]) this.f1341K;
        int length = objArr.length;
        int r03 = r02 + r02;
        if (r03 > length) {
            if (r03 >= 0) {
                int r22 = length + (length >> 1) + 1;
                if (r22 < r03) {
                    int highestOneBit = Integer.highestOneBit(r03 - 1);
                    r22 = highestOneBit + highestOneBit;
                }
                if (r22 < 0) {
                    r22 = Integer.MAX_VALUE;
                }
                this.f1341K = Arrays.copyOf(objArr, r22);
            } else {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
        }
        Object[] objArr2 = (Object[]) this.f1341K;
        int r12 = this.f1340J;
        int r23 = r12 + r12;
        objArr2[r23] = str;
        objArr2[r23 + 1] = c0283c;
        this.f1340J = r12 + 1;
    }

    public byte[] d(int r10) {
        boolean z3;
        int r02 = r10 ^ 1;
        q qVar = (q) this.f1342L;
        if (1 != r02) {
            z3 = false;
        } else {
            z3 = true;
        }
        qVar.f3056R = Boolean.valueOf(z3);
        q qVar2 = (q) this.f1342L;
        qVar2.f3054P = Boolean.FALSE;
        C0618g6 c0618g6 = new C0618g6(qVar2);
        V0.a aVar = (V0.a) this.f1341K;
        aVar.f1356J = c0618g6;
        try {
            N6.b();
            N6 n6 = N6.f5682c;
            if (r10 == 0) {
                P4 p4 = new P4(aVar);
                J1.d dVar = new J1.d();
                n6.a(dVar);
                dVar.f799d = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    J1.e eVar = new J1.e(stringWriter, dVar.f796a, dVar.f797b, dVar.f798c, dVar.f799d);
                    eVar.e(p4);
                    eVar.g();
                    eVar.f801b.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            P4 p42 = new P4(aVar);
            V v3 = new V();
            n6.a(v3);
            return new V(new HashMap(v3.f5776a), new HashMap(v3.f5777b), v3.f5778c).b(p42);
        } catch (UnsupportedEncodingException e4) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e4);
        }
    }

    public /* synthetic */ h(int r12, Object obj, Object obj2) {
        this.f1341K = obj;
        this.f1342L = obj2;
        this.f1340J = r12;
    }

    public h(V0.a aVar, int r3) {
        this.f1342L = new Object();
        this.f1341K = aVar;
        N6.b();
        this.f1340J = r3;
    }
}
