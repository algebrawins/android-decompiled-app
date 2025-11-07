package x1;

/* renamed from: x1.t0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0707t0 {
    public static String a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int r12 = 0; r12 < str.length(); r12++) {
                sb.append(str.charAt(r12));
                if (str2.length() > r12) {
                    sb.append(str2.charAt(r12));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }
}
