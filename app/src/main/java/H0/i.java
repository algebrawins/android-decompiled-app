package H0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class i {
    public static String b(Object obj, String str) {
        N2.g.e(obj, "value");
        return str + " value: " + obj;
    }

    public static l c(String str) {
        String group;
        String str2;
        if (str != null && !U2.i.g(str)) {
            Matcher matcher = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(str);
            if (matcher.matches() && (group = matcher.group(1)) != null) {
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                if (group2 != null) {
                    int parseInt2 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    if (group3 != null) {
                        int parseInt3 = Integer.parseInt(group3);
                        if (matcher.group(4) != null) {
                            str2 = matcher.group(4);
                        } else {
                            str2 = "";
                        }
                        N2.g.d(str2, "description");
                        return new l(parseInt, parseInt2, parseInt3, str2);
                    }
                }
            }
        }
        return null;
    }

    public abstract Object a();

    public abstract i d(String str, M2.l lVar);
}
