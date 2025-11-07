package x1;

/* renamed from: x1.n0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0660n0 {
    public static final Class a(S2.b bVar) {
        N2.g.e(bVar, "<this>");
        Class a4 = ((N2.c) bVar).a();
        if (!a4.isPrimitive()) {
            return a4;
        }
        String name = a4.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.class;
                }
                return a4;
            case 104431:
                if (name.equals("int")) {
                    return Integer.class;
                }
                return a4;
            case 3039496:
                if (name.equals("byte")) {
                    return Byte.class;
                }
                return a4;
            case 3052374:
                if (name.equals("char")) {
                    return Character.class;
                }
                return a4;
            case 3327612:
                if (name.equals("long")) {
                    return Long.class;
                }
                return a4;
            case 3625364:
                if (name.equals("void")) {
                    return Void.class;
                }
                return a4;
            case 64711720:
                if (name.equals("boolean")) {
                    return Boolean.class;
                }
                return a4;
            case 97526364:
                if (name.equals("float")) {
                    return Float.class;
                }
                return a4;
            case 109413500:
                if (name.equals("short")) {
                    return Short.class;
                }
                return a4;
            default:
                return a4;
        }
    }
}
