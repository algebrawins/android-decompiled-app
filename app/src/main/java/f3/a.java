package f3;

import A0.C0008j;
import C2.i;
import C2.t;
import D.C;
import e3.l;
import e3.p;
import e3.s;
import h1.C0287g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import x1.AbstractC0731w0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f3202a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final LinkedHashMap a(ArrayList arrayList) {
        List<e> asList;
        String str = l.f3123K;
        l c4 = C0287g.c("/", false);
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.a(1));
        t.c(linkedHashMap, new B2.c[]{new B2.c(c4, new e(c4))});
        C0008j c0008j = new C0008j(1);
        if (arrayList.size() <= 1) {
            asList = i.l(arrayList);
        } else {
            Object[] array = arrayList.toArray(new Object[0]);
            N2.g.e(array, "<this>");
            if (array.length > 1) {
                Arrays.sort(array, c0008j);
            }
            asList = Arrays.asList(array);
            N2.g.d(asList, "asList(...)");
        }
        for (e eVar : asList) {
            if (((e) linkedHashMap.put(eVar.f3212a, eVar)) == null) {
                while (true) {
                    l lVar = eVar.f3212a;
                    l c5 = lVar.c();
                    if (c5 != null) {
                        e eVar2 = (e) linkedHashMap.get(c5);
                        if (eVar2 != null) {
                            eVar2.f3217f.add(lVar);
                            break;
                        }
                        e eVar3 = new e(c5);
                        linkedHashMap.put(c5, eVar3);
                        eVar3.f3217f.add(lVar);
                        eVar = eVar3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    public static final String b(int r12) {
        AbstractC0731w0.a(16);
        String num = Integer.toString(r12, 16);
        N2.g.d(num, "toString(this, checkRadix(radix))");
        return "0x".concat(num);
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [N2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [N2.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [N2.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [N2.n, java.lang.Object] */
    public static final e c(p pVar) {
        int a4;
        Long valueOf;
        int r18;
        long j3;
        if (pVar.a() == 33639248) {
            pVar.k(4L);
            short f2 = pVar.f();
            int r22 = f2 & 65535;
            if ((f2 & 1) == 0) {
                int f4 = pVar.f() & 65535;
                short f5 = pVar.f();
                int r23 = f5 & 65535;
                short f6 = pVar.f();
                int r4 = f6 & 65535;
                if (r23 == -1) {
                    valueOf = null;
                } else {
                    GregorianCalendar gregorianCalendar = new GregorianCalendar();
                    gregorianCalendar.set(14, 0);
                    gregorianCalendar.set(((r4 >> 9) & 127) + 1980, ((r4 >> 5) & 15) - 1, f6 & 31, (r23 >> 11) & 31, (r23 >> 5) & 63, (f5 & 31) << 1);
                    valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
                }
                Long l3 = valueOf;
                pVar.a();
                ?? obj = new Object();
                obj.f1006J = pVar.a() & 4294967295L;
                ?? obj2 = new Object();
                obj2.f1006J = pVar.a() & 4294967295L;
                int f7 = pVar.f() & 65535;
                int f8 = pVar.f() & 65535;
                pVar.k(8L);
                ?? obj3 = new Object();
                obj3.f1006J = pVar.a() & 4294967295L;
                String h3 = pVar.h(pVar.f() & 65535);
                if (U2.i.f(h3, (char) 0, false, 2) < 0) {
                    if (obj2.f1006J == 4294967295L) {
                        j3 = 8;
                        r18 = f4;
                    } else {
                        r18 = f4;
                        j3 = 0;
                    }
                    if (obj.f1006J == 4294967295L) {
                        j3 += 8;
                    }
                    if (obj3.f1006J == 4294967295L) {
                        j3 += 8;
                    }
                    long j4 = j3;
                    ?? obj4 = new Object();
                    d(pVar, f7, new f(obj4, j4, obj2, pVar, obj, obj3));
                    if (j4 > 0 && !obj4.f1004J) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    String h4 = pVar.h(f8);
                    String str = l.f3123K;
                    return new e(C0287g.c("/", false).d(h3), U2.i.b(h3, "/", false), h4, obj.f1006J, obj2.f1006J, r18, l3, obj3.f1006J);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + b(r22));
        }
        throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(a4));
    }

    public static final void d(p pVar, int r12, M2.p pVar2) {
        long j3 = r12;
        while (j3 != 0) {
            if (j3 >= 4) {
                int f2 = pVar.f() & 65535;
                long f4 = pVar.f() & 65535;
                long j4 = j3 - 4;
                if (j4 >= f4) {
                    pVar.j(f4);
                    e3.a aVar = pVar.f3131K;
                    long j5 = aVar.f3098K;
                    pVar2.g(Integer.valueOf(f2), Long.valueOf(f4));
                    long j6 = (aVar.f3098K + f4) - j5;
                    int r7 = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                    if (r7 >= 0) {
                        if (r7 > 0) {
                            aVar.m(j6);
                        }
                        j3 = j4 - f4;
                    } else {
                        throw new IOException(C.w("unsupported zip: too many bytes processed for ", f2));
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final int e(s sVar, int r5) {
        int r22;
        N2.g.e(sVar, "<this>");
        int r52 = r5 + 1;
        int length = sVar.f3142N.length;
        int[] r4 = sVar.f3143O;
        N2.g.e(r4, "<this>");
        int r12 = length - 1;
        int r02 = 0;
        while (true) {
            if (r02 <= r12) {
                r22 = (r02 + r12) >>> 1;
                int r3 = r4[r22];
                if (r3 < r52) {
                    r02 = r22 + 1;
                } else if (r3 <= r52) {
                    break;
                } else {
                    r12 = r22 - 1;
                }
            } else {
                r22 = (-r02) - 1;
                break;
            }
        }
        if (r22 < 0) {
            return ~r22;
        }
        return r22;
    }
}
