package x1;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class i5 {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int r02 = 0;
        int r12 = 0;
        while (true) {
            length = objArr.length;
            if (r12 >= length) {
                break;
            }
            Object obj = objArr[r12];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e4) {
                    String str3 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e4);
                    str2 = "<" + str3 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[r12] = str2;
            r12++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int r13 = 0;
        while (true) {
            length2 = objArr.length;
            if (r02 >= length2 || (indexOf = str.indexOf("%s", r13)) == -1) {
                break;
            }
            sb.append((CharSequence) str, r13, indexOf);
            sb.append(objArr[r02]);
            r13 = indexOf + 2;
            r02++;
        }
        sb.append((CharSequence) str, r13, str.length());
        if (r02 < length2) {
            sb.append(" [");
            sb.append(objArr[r02]);
            for (int r11 = r02 + 1; r11 < objArr.length; r11++) {
                sb.append(", ");
                sb.append(objArr[r11]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
