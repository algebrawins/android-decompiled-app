package x2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import r2.q;
import r2.r;

/* renamed from: x2.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0764c extends r {

    /* renamed from: d  reason: collision with root package name */
    public static final C0764c f6153d = new Object();

    /* JADX WARN: Type inference failed for: r4v1, types: [x2.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, x2.a] */
    @Override // r2.r
    public final Object f(byte b3, ByteBuffer byteBuffer) {
        if (b3 != -127) {
            if (b3 != -126) {
                return super.f(b3, byteBuffer);
            }
            ?? obj = new Object();
            Boolean bool = (Boolean) ((ArrayList) e(byteBuffer)).get(0);
            if (bool != null) {
                obj.f6151a = bool;
                return obj;
            }
            throw new IllegalStateException("Nonnull field \"showTitle\" is null.");
        }
        ArrayList arrayList = (ArrayList) e(byteBuffer);
        ?? obj2 = new Object();
        Boolean bool2 = (Boolean) arrayList.get(0);
        if (bool2 != null) {
            obj2.f6156a = bool2;
            Boolean bool3 = (Boolean) arrayList.get(1);
            if (bool3 != null) {
                obj2.f6157b = bool3;
                Map map = (Map) arrayList.get(2);
                if (map != null) {
                    obj2.f6158c = map;
                    return obj2;
                }
                throw new IllegalStateException("Nonnull field \"headers\" is null.");
            }
            throw new IllegalStateException("Nonnull field \"enableDomStorage\" is null.");
        }
        throw new IllegalStateException("Nonnull field \"enableJavaScript\" is null.");
    }

    @Override // r2.r
    public final void k(q qVar, Object obj) {
        if (obj instanceof C0766e) {
            qVar.write(129);
            C0766e c0766e = (C0766e) obj;
            c0766e.getClass();
            ArrayList arrayList = new ArrayList(3);
            arrayList.add(c0766e.f6156a);
            arrayList.add(c0766e.f6157b);
            arrayList.add(c0766e.f6158c);
            k(qVar, arrayList);
        } else if (obj instanceof C0762a) {
            qVar.write(130);
            C0762a c0762a = (C0762a) obj;
            c0762a.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(c0762a.f6151a);
            k(qVar, arrayList2);
        } else {
            super.k(qVar, obj);
        }
    }
}
