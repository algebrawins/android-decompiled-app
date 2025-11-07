package U2;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f1346a;

    static {
        Charset forName = Charset.forName("UTF-8");
        N2.g.d(forName, "forName(...)");
        f1346a = forName;
        N2.g.d(Charset.forName("UTF-16"), "forName(...)");
        N2.g.d(Charset.forName("UTF-16BE"), "forName(...)");
        N2.g.d(Charset.forName("UTF-16LE"), "forName(...)");
        N2.g.d(Charset.forName("US-ASCII"), "forName(...)");
        N2.g.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
