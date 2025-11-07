package U2;

/* loaded from: classes.dex */
public abstract class i extends h {
    public static boolean a(String str, String str2) {
        N2.g.e(str, "<this>");
        if (e(2, str, str2, false) < 0) {
            return false;
        }
        return true;
    }

    public static boolean b(String str, String str2, boolean z3) {
        N2.g.e(str, "<this>");
        if (!z3) {
            return str.endsWith(str2);
        }
        return h(str.length() - str2.length(), 0, str2.length(), str, str2, true);
    }

    public static final int c(CharSequence charSequence) {
        N2.g.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int d(int r11, String str, String str2, boolean z3) {
        char upperCase;
        char upperCase2;
        N2.g.e(str, "<this>");
        N2.g.e(str2, "string");
        if (!z3) {
            return str.indexOf(str2, r11);
        }
        int length = str.length();
        if (r11 < 0) {
            r11 = 0;
        }
        int length2 = str.length();
        if (length > length2) {
            length = length2;
        }
        R2.a aVar = new R2.a(r11, length, 1);
        boolean z4 = str instanceof String;
        int r02 = aVar.f1158L;
        int r4 = aVar.f1157K;
        int r3 = aVar.f1156J;
        if (z4 && (str2 instanceof String)) {
            if ((r02 > 0 && r3 <= r4) || (r02 < 0 && r4 <= r3)) {
                while (!h(0, r3, str2.length(), str2, str, z3)) {
                    if (r3 != r4) {
                        r3 += r02;
                    }
                }
                return r3;
            }
            return -1;
        }
        if ((r02 > 0 && r3 <= r4) || (r02 < 0 && r4 <= r3)) {
            loop1: while (true) {
                int length3 = str2.length();
                N2.g.e(str, "other");
                if (r3 >= 0 && str2.length() - length3 >= 0 && r3 <= str.length() - length3) {
                    for (int r5 = 0; r5 < length3; r5++) {
                        char charAt = str2.charAt(r5);
                        char charAt2 = str.charAt(r3 + r5);
                        if (charAt == charAt2 || (z3 && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        }
                    }
                    break loop1;
                }
                if (r3 == r4) {
                    break;
                }
                r3 += r02;
            }
        }
        return -1;
    }

    public static /* synthetic */ int e(int r12, String str, String str2, boolean z3) {
        if ((r12 & 4) != 0) {
            z3 = false;
        }
        return d(0, str, str2, z3);
    }

    public static int f(String str, char c4, boolean z3, int r8) {
        char upperCase;
        char upperCase2;
        if ((r8 & 4) != 0) {
            z3 = false;
        }
        if (!z3) {
            return str.indexOf(c4, 0);
        }
        char[] cArr = {c4};
        if (!z3) {
            return str.indexOf(cArr[0], 0);
        }
        int c5 = c(str);
        if (c5 >= 0) {
            int r22 = 0;
            while (true) {
                char charAt = str.charAt(r22);
                char c6 = cArr[0];
                if (c6 != charAt && (!z3 || ((upperCase = Character.toUpperCase(c6)) != (upperCase2 = Character.toUpperCase(charAt)) && Character.toLowerCase(upperCase) != Character.toLowerCase(upperCase2)))) {
                    if (r22 == c5) {
                        break;
                    }
                    r22++;
                }
            }
            return r22;
        }
        return -1;
    }

    public static boolean g(CharSequence charSequence) {
        N2.g.e(charSequence, "<this>");
        for (int r12 = 0; r12 < charSequence.length(); r12++) {
            char charAt = charSequence.charAt(r12);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean h(int r6, int r7, int r8, String str, String str2, boolean z3) {
        N2.g.e(str, "<this>");
        N2.g.e(str2, "other");
        if (!z3) {
            return str.regionMatches(r6, str2, r7, r8);
        }
        return str.regionMatches(z3, r6, str2, r7, r8);
    }

    public static String i(String str, String str2, String str3) {
        int d4 = d(0, str, str2, false);
        if (d4 >= 0) {
            int length = str2.length();
            int r3 = 1;
            if (length >= 1) {
                r3 = length;
            }
            int length2 = str3.length() + (str.length() - length);
            if (length2 >= 0) {
                StringBuilder sb = new StringBuilder(length2);
                int r5 = 0;
                do {
                    sb.append((CharSequence) str, r5, d4);
                    sb.append(str3);
                    r5 = d4 + length;
                    if (d4 >= str.length()) {
                        break;
                    }
                    d4 = d(d4 + r3, str, str2, false);
                } while (d4 > 0);
                sb.append((CharSequence) str, r5, str.length());
                String sb2 = sb.toString();
                N2.g.d(sb2, "toString(...)");
                return sb2;
            }
            throw new OutOfMemoryError();
        }
        return str;
    }

    public static String j(String str, String str2) {
        N2.g.e(str2, "delimiter");
        int e4 = e(6, str, str2, false);
        if (e4 != -1) {
            String substring = str.substring(str2.length() + e4, str.length());
            N2.g.d(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static String k(String str, String str2) {
        N2.g.e(str2, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, c(str));
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1, str.length());
            N2.g.d(substring, "substring(...)");
            return substring;
        }
        return str2;
    }
}
