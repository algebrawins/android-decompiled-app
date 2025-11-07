package T0;

import V0.e;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import x1.AbstractC0707t0;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: c  reason: collision with root package name */
    public static final String f1203c;

    /* renamed from: d  reason: collision with root package name */
    public static final Set f1204d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f1205e;

    /* renamed from: a  reason: collision with root package name */
    public final String f1206a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1207b;

    static {
        String a4 = AbstractC0707t0.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f1203c = a4;
        AbstractC0707t0.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        AbstractC0707t0.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f1204d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new S0.b("proto"), new S0.b("json"))));
        f1205e = new a(a4, null);
    }

    public a(String str, String str2) {
        this.f1206a = str;
        this.f1207b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }
}
