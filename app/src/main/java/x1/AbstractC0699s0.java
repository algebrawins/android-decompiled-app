package x1;

/* renamed from: x1.s0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0699s0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, S.i] */
    /* JADX WARN: Type inference failed for: r1v0, types: [S.m, java.lang.Object] */
    public static S.l a(S.j jVar) {
        ?? obj = new Object();
        obj.f1189c = new Object();
        S.l lVar = new S.l(obj);
        obj.f1188b = lVar;
        obj.f1187a = jVar.getClass();
        try {
            Object a0 = jVar.a0(obj);
            if (a0 != null) {
                obj.f1187a = a0;
            }
        } catch (Exception e4) {
            lVar.f1193K.i(e4);
        }
        return lVar;
    }
}
