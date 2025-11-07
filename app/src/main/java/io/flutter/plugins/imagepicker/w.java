package io.flutter.plugins.imagepicker;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends r2.r {

    /* renamed from: d  reason: collision with root package name */
    public static final w f3657d = new Object();

    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, io.flutter.plugins.imagepicker.A] */
    /* JADX WARN: Type inference failed for: r7v12, types: [io.flutter.plugins.imagepicker.y, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [io.flutter.plugins.imagepicker.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, io.flutter.plugins.imagepicker.o] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, io.flutter.plugins.imagepicker.r] */
    /* JADX WARN: Type inference failed for: r7v7, types: [io.flutter.plugins.imagepicker.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [io.flutter.plugins.imagepicker.v, java.lang.Object] */
    @Override // r2.r
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        switch (b3) {
            case -127:
                Object e4 = e(byteBuffer);
                if (e4 == null) {
                    return null;
                }
                return x.values()[((Long) e4).intValue()];
            case -126:
                Object e5 = e(byteBuffer);
                if (e5 == null) {
                    return null;
                }
                return z.values()[((Long) e5).intValue()];
            case -125:
                Object e6 = e(byteBuffer);
                if (e6 == null) {
                    return null;
                }
                return p.values()[((Long) e6).intValue()];
            case -124:
                ArrayList arrayList = (ArrayList) e(byteBuffer);
                ?? obj = new Object();
                Boolean bool = (Boolean) arrayList.get(0);
                if (bool != null) {
                    obj.f3645a = bool;
                    Boolean bool2 = (Boolean) arrayList.get(1);
                    if (bool2 != null) {
                        obj.f3646b = bool2;
                        obj.f3647c = (Long) arrayList.get(2);
                        return obj;
                    }
                    throw new IllegalStateException("Nonnull field \"usePhotoPicker\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"allowMultiple\" is null.");
            case -123:
                ArrayList arrayList2 = (ArrayList) e(byteBuffer);
                ?? obj2 = new Object();
                obj2.f3653a = (Double) arrayList2.get(0);
                obj2.f3654b = (Double) arrayList2.get(1);
                Long l3 = (Long) arrayList2.get(2);
                if (l3 != null) {
                    obj2.f3655c = l3;
                    return obj2;
                }
                throw new IllegalStateException("Nonnull field \"quality\" is null.");
            case -122:
                ?? obj3 = new Object();
                u uVar = (u) ((ArrayList) e(byteBuffer)).get(0);
                if (uVar != null) {
                    obj3.f3656a = uVar;
                    return obj3;
                }
                throw new IllegalStateException("Nonnull field \"imageSelectionOptions\" is null.");
            case -121:
                ?? obj4 = new Object();
                obj4.f3606a = (Long) ((ArrayList) e(byteBuffer)).get(0);
                return obj4;
            case -120:
                ArrayList arrayList3 = (ArrayList) e(byteBuffer);
                ?? obj5 = new Object();
                z zVar = (z) arrayList3.get(0);
                if (zVar != null) {
                    obj5.f3658a = zVar;
                    obj5.f3659b = (x) arrayList3.get(1);
                    return obj5;
                }
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            case -119:
                ArrayList arrayList4 = (ArrayList) e(byteBuffer);
                ?? obj6 = new Object();
                String str = (String) arrayList4.get(0);
                if (str != null) {
                    obj6.f3639a = str;
                    obj6.f3640b = (String) arrayList4.get(1);
                    return obj6;
                }
                throw new IllegalStateException("Nonnull field \"code\" is null.");
            case -118:
                ArrayList arrayList5 = (ArrayList) e(byteBuffer);
                ?? obj7 = new Object();
                p pVar = (p) arrayList5.get(0);
                if (pVar != null) {
                    obj7.f3641a = pVar;
                    obj7.f3642b = (n) arrayList5.get(1);
                    List list = (List) arrayList5.get(2);
                    if (list != null) {
                        obj7.f3643c = list;
                        return obj7;
                    }
                    throw new IllegalStateException("Nonnull field \"paths\" is null.");
                }
                throw new IllegalStateException("Nonnull field \"type\" is null.");
            default:
                return super.f(b3, byteBuffer);
        }
    }

    @Override // r2.r
    public final void k(r2.q qVar, Object obj) {
        Object obj2 = null;
        if (obj instanceof x) {
            qVar.write(129);
            if (obj != null) {
                obj2 = Integer.valueOf(((x) obj).index);
            }
            k(qVar, obj2);
        } else if (obj instanceof z) {
            qVar.write(130);
            if (obj != null) {
                obj2 = Integer.valueOf(((z) obj).index);
            }
            k(qVar, obj2);
        } else if (obj instanceof p) {
            qVar.write(131);
            if (obj != null) {
                obj2 = Integer.valueOf(((p) obj).index);
            }
            k(qVar, obj2);
        } else if (obj instanceof r) {
            qVar.write(132);
            r rVar = (r) obj;
            rVar.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(rVar.f3645a);
            arrayList.add(rVar.f3646b);
            arrayList.add(rVar.f3647c);
            k(qVar, arrayList);
        } else if (obj instanceof u) {
            qVar.write(133);
            u uVar = (u) obj;
            uVar.getClass();
            ArrayList arrayList2 = new ArrayList(3);
            arrayList2.add(uVar.f3653a);
            arrayList2.add(uVar.f3654b);
            arrayList2.add(uVar.f3655c);
            k(qVar, arrayList2);
        } else if (obj instanceof v) {
            qVar.write(134);
            v vVar = (v) obj;
            vVar.getClass();
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(vVar.f3656a);
            k(qVar, arrayList3);
        } else if (obj instanceof A) {
            qVar.write(135);
            A a4 = (A) obj;
            a4.getClass();
            ArrayList arrayList4 = new ArrayList(1);
            arrayList4.add(a4.f3606a);
            k(qVar, arrayList4);
        } else if (obj instanceof y) {
            qVar.write(136);
            y yVar = (y) obj;
            yVar.getClass();
            ArrayList arrayList5 = new ArrayList(2);
            arrayList5.add(yVar.f3658a);
            arrayList5.add(yVar.f3659b);
            k(qVar, arrayList5);
        } else if (obj instanceof n) {
            qVar.write(137);
            n nVar = (n) obj;
            nVar.getClass();
            ArrayList arrayList6 = new ArrayList(2);
            arrayList6.add(nVar.f3639a);
            arrayList6.add(nVar.f3640b);
            k(qVar, arrayList6);
        } else if (obj instanceof o) {
            qVar.write(138);
            o oVar = (o) obj;
            oVar.getClass();
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(oVar.f3641a);
            arrayList7.add(oVar.f3642b);
            arrayList7.add(oVar.f3643c);
            k(qVar, arrayList7);
        } else {
            super.k(qVar, obj);
        }
    }
}
