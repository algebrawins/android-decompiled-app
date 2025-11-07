package Z2;

import D.C;
import V2.C0062t;
import V2.S;
import V2.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class n extends F2.b implements Y2.e {

    /* renamed from: M  reason: collision with root package name */
    public final Y2.e f1795M;

    /* renamed from: N  reason: collision with root package name */
    public final D2.i f1796N;

    /* renamed from: O  reason: collision with root package name */
    public final int f1797O;

    /* renamed from: P  reason: collision with root package name */
    public D2.i f1798P;

    /* renamed from: Q  reason: collision with root package name */
    public D2.d f1799Q;

    public n(Y2.e eVar, D2.i iVar) {
        super(k.f1792J, D2.j.f492J);
        this.f1795M = eVar;
        this.f1796N = iVar;
        this.f1797O = ((Number) iVar.j(0, m.f1794K)).intValue();
    }

    @Override // Y2.e
    public final Object b(Object obj, D2.d dVar) {
        try {
            Object p2 = p(dVar, obj);
            if (p2 == E2.a.COROUTINE_SUSPENDED) {
                return p2;
            }
            return B2.i.f210a;
        } catch (Throwable th) {
            this.f1798P = new i(dVar.e(), th);
            throw th;
        }
    }

    @Override // F2.b, F2.c
    public final F2.c c() {
        D2.d dVar = this.f1799Q;
        if (dVar instanceof F2.c) {
            return (F2.c) dVar;
        }
        return null;
    }

    @Override // F2.b, D2.d
    public final D2.i e() {
        D2.i iVar = this.f1798P;
        if (iVar == null) {
            return D2.j.f492J;
        }
        return iVar;
    }

    @Override // F2.b
    public final StackTraceElement j() {
        return null;
    }

    @Override // F2.b
    public final Object k(Object obj) {
        Throwable a4 = B2.e.a(obj);
        if (a4 != null) {
            this.f1798P = new i(e(), a4);
        }
        D2.d dVar = this.f1799Q;
        if (dVar != null) {
            dVar.i(obj);
        }
        return E2.a.COROUTINE_SUSPENDED;
    }

    public final Object p(D2.d dVar, Object obj) {
        List list;
        Comparable comparable;
        int r8;
        String str;
        D2.i e4 = dVar.e();
        S s3 = (S) e4.f(C0062t.f1462K);
        if (s3 != null && !s3.b()) {
            throw ((b0) s3).A();
        }
        D2.i iVar = this.f1798P;
        if (iVar != e4) {
            int r6 = 0;
            if (iVar instanceof i) {
                String str2 = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((i) iVar).f1790J + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                N2.g.e(str2, "<this>");
                U2.b bVar = new U2.b(str2);
                if (!bVar.hasNext()) {
                    list = C2.q.f272J;
                } else {
                    Object next = bVar.next();
                    if (!bVar.hasNext()) {
                        list = C2.j.b(next);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(next);
                        while (bVar.hasNext()) {
                            arrayList.add(bVar.next());
                        }
                        list = arrayList;
                    }
                }
                List list2 = list;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!U2.i.g((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C2.k.g(arrayList2));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    int length = str3.length();
                    int r12 = 0;
                    while (true) {
                        if (r12 < length) {
                            char charAt = str3.charAt(r12);
                            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                                break;
                            }
                            r12++;
                        } else {
                            r12 = -1;
                            break;
                        }
                    }
                    if (r12 == -1) {
                        r12 = str3.length();
                    }
                    arrayList3.add(Integer.valueOf(r12));
                }
                Iterator it2 = arrayList3.iterator();
                if (!it2.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    r8 = num.intValue();
                } else {
                    r8 = 0;
                }
                int length2 = str2.length();
                list.size();
                int a4 = C2.j.a(list);
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    int r11 = r6 + 1;
                    if (r6 >= 0) {
                        String str4 = (String) obj3;
                        if ((r6 == 0 || r6 == a4) && U2.i.g(str4)) {
                            str = null;
                        } else {
                            N2.g.e(str4, "<this>");
                            if (r8 >= 0) {
                                int length3 = str4.length();
                                if (r8 <= length3) {
                                    length3 = r8;
                                }
                                str = str4.substring(length3);
                                N2.g.d(str, "substring(...)");
                            } else {
                                throw new IllegalArgumentException(C.v(r8, "Requested character count ", " is less than zero.").toString());
                            }
                        }
                        if (str != null) {
                            arrayList4.add(str);
                        }
                        r6 = r11;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                }
                StringBuilder sb = new StringBuilder(length2);
                C2.i.i(arrayList4, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            } else if (((Number) e4.j(0, new q(this))).intValue() == this.f1797O) {
                this.f1798P = e4;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f1796N + ",\n\t\tbut emission happened in " + e4 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f1799Q = dVar;
        o oVar = p.f1801a;
        Y2.e eVar = this.f1795M;
        N2.g.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        oVar.getClass();
        Object b3 = eVar.b(obj, this);
        if (!N2.g.a(b3, E2.a.COROUTINE_SUSPENDED)) {
            this.f1799Q = null;
        }
        return b3;
    }
}
