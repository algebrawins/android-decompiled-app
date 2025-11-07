package r0;

import C2.i;
import androidx.datastore.preferences.protobuf.C0111h;
import androidx.datastore.preferences.protobuf.C0116n;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.I;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e3.m;
import e3.n;
import e3.o;
import e3.p;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import q0.C0433d;
import q0.j;
import q0.k;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f4881a = new Object();

    public final b a(p pVar) {
        int r3;
        byte[] bArr;
        try {
            q0.f q3 = q0.f.q(new o(pVar));
            b bVar = new b(false);
            e[] eVarArr = (e[]) Arrays.copyOf(new e[0], 0);
            N2.g.e(eVarArr, "pairs");
            bVar.b();
            if (eVarArr.length <= 0) {
                Map o3 = q3.o();
                N2.g.d(o3, "preferencesProto.preferencesMap");
                for (Map.Entry entry : o3.entrySet()) {
                    String str = (String) entry.getKey();
                    k kVar = (k) entry.getValue();
                    N2.g.d(str, "name");
                    N2.g.d(kVar, "value");
                    j E3 = kVar.E();
                    if (E3 == null) {
                        r3 = -1;
                    } else {
                        r3 = g.f4880a[E3.ordinal()];
                    }
                    switch (r3) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        default:
                            throw new RuntimeException();
                        case 1:
                            bVar.d(new d(str), Boolean.valueOf(kVar.v()));
                            break;
                        case 2:
                            bVar.d(new d(str), Float.valueOf(kVar.z()));
                            break;
                        case k.INTEGER_FIELD_NUMBER /* 3 */:
                            bVar.d(new d(str), Double.valueOf(kVar.y()));
                            break;
                        case 4:
                            bVar.d(new d(str), Integer.valueOf(kVar.A()));
                            break;
                        case k.STRING_FIELD_NUMBER /* 5 */:
                            bVar.d(new d(str), Long.valueOf(kVar.B()));
                            break;
                        case k.STRING_SET_FIELD_NUMBER /* 6 */:
                            d dVar = new d(str);
                            String C3 = kVar.C();
                            N2.g.d(C3, "value.string");
                            bVar.d(dVar, C3);
                            break;
                        case k.DOUBLE_FIELD_NUMBER /* 7 */:
                            d dVar2 = new d(str);
                            F p2 = kVar.D().p();
                            N2.g.d(p2, "value.stringSet.stringsList");
                            bVar.d(dVar2, i.n(p2));
                            break;
                        case 8:
                            d dVar3 = new d(str);
                            C0111h w3 = kVar.w();
                            int size = w3.size();
                            if (size == 0) {
                                bArr = G.f2299b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                w3.j(bArr2, size);
                                bArr = bArr2;
                            }
                            N2.g.d(bArr, "value.bytes.toByteArray()");
                            bVar.d(dVar3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new b(new LinkedHashMap(bVar.a()), true);
            }
            e eVar = eVarArr[0];
            throw null;
        } catch (I e4) {
            throw new IOException("Unable to parse preferences proto.", e4);
        }
    }

    public final void b(Object obj, n nVar) {
        D a4;
        Map a5 = ((b) obj).a();
        C0433d p2 = q0.f.p();
        for (Map.Entry entry : a5.entrySet()) {
            Object value = entry.getValue();
            String str = ((d) entry.getKey()).f4876a;
            if (value instanceof Boolean) {
                q0.i F3 = k.F();
                boolean booleanValue = ((Boolean) value).booleanValue();
                F3.c();
                k.s((k) F3.f2297K, booleanValue);
                a4 = F3.a();
            } else if (value instanceof Float) {
                q0.i F4 = k.F();
                float floatValue = ((Number) value).floatValue();
                F4.c();
                k.t((k) F4.f2297K, floatValue);
                a4 = F4.a();
            } else if (value instanceof Double) {
                q0.i F5 = k.F();
                double doubleValue = ((Number) value).doubleValue();
                F5.c();
                k.q((k) F5.f2297K, doubleValue);
                a4 = F5.a();
            } else if (value instanceof Integer) {
                q0.i F6 = k.F();
                int intValue = ((Number) value).intValue();
                F6.c();
                k.u((k) F6.f2297K, intValue);
                a4 = F6.a();
            } else if (value instanceof Long) {
                q0.i F7 = k.F();
                long longValue = ((Number) value).longValue();
                F7.c();
                k.n((k) F7.f2297K, longValue);
                a4 = F7.a();
            } else if (value instanceof String) {
                q0.i F8 = k.F();
                F8.c();
                k.o((k) F8.f2297K, (String) value);
                a4 = F8.a();
            } else if (value instanceof Set) {
                q0.i F9 = k.F();
                q0.g q3 = q0.h.q();
                N2.g.c(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                q3.c();
                q0.h.n((q0.h) q3.f2297K, (Set) value);
                F9.c();
                k.p((k) F9.f2297K, (q0.h) q3.a());
                a4 = F9.a();
            } else if (value instanceof byte[]) {
                q0.i F10 = k.F();
                byte[] bArr = (byte[]) value;
                C0111h c0111h = C0111h.f2350L;
                C0111h i3 = C0111h.i(bArr, 0, bArr.length);
                F10.c();
                k.r((k) F10.f2297K, i3);
                a4 = F10.a();
            } else {
                throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
            }
            p2.getClass();
            str.getClass();
            p2.c();
            q0.f.n((q0.f) p2.f2297K).put(str, (k) a4);
        }
        q0.f fVar = (q0.f) p2.a();
        m mVar = new m(nVar);
        int a6 = fVar.a(null);
        Logger logger = C0116n.f2395f;
        if (a6 > 4096) {
            a6 = RecognitionOptions.AZTEC;
        }
        C0116n c0116n = new C0116n(mVar, a6);
        fVar.b(c0116n);
        if (c0116n.f2399d > 0) {
            c0116n.C();
        }
    }
}
