package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import x1.W3;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f2315a;

    static {
        char[] cArr = new char[80];
        f2315a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int r3, StringBuilder sb) {
        while (r3 > 0) {
            int r02 = 80;
            if (r3 <= 80) {
                r02 = r3;
            }
            sb.append(f2315a, 0, r02);
            r3 -= r02;
        }
    }

    public static void b(StringBuilder sb, int r6, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, r6, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, r6, str, entry);
            }
        } else {
            sb.append('\n');
            a(r6, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int r22 = 1; r22 < str.length(); r22++) {
                    char charAt = str.charAt(r22);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                C0111h c0111h = C0111h.f2350L;
                sb.append(W3.a(new C0111h(((String) obj).getBytes(G.f2298a))));
                sb.append('\"');
            } else if (obj instanceof C0111h) {
                sb.append(": \"");
                sb.append(W3.a((C0111h) obj));
                sb.append('\"');
            } else if (obj instanceof D) {
                sb.append(" {");
                c((D) obj, sb, r6 + 2);
                sb.append("\n");
                a(r6, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int r7 = r6 + 2;
                b(sb, r7, "key", entry2.getKey());
                b(sb, r7, "value", entry2.getValue());
                sb.append("\n");
                a(r6, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
        if (((java.lang.Integer) r7).intValue() == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0197, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a8, code lost:
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01be, code lost:
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(androidx.datastore.preferences.protobuf.D r20, java.lang.StringBuilder r21, int r22) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Y.c(androidx.datastore.preferences.protobuf.D, java.lang.StringBuilder, int):void");
    }
}
