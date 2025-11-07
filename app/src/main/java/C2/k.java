package C2;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class k extends j {
    public static int g(Iterable iterable) {
        N2.g.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
