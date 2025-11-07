package r0;

import M2.l;
import java.util.Map;

/* renamed from: r0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442a extends N2.h implements l {

    /* renamed from: K  reason: collision with root package name */
    public static final C0442a f4870K = new N2.h(1);

    @Override // M2.l
    public final Object h(Object obj) {
        String valueOf;
        Map.Entry entry = (Map.Entry) obj;
        N2.g.e(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            N2.g.e(bArr, "<this>");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int r4 = 0;
            for (byte b3 : bArr) {
                r4++;
                if (r4 > 1) {
                    sb.append((CharSequence) ", ");
                }
                sb.append((CharSequence) String.valueOf((int) b3));
            }
            sb.append((CharSequence) "]");
            valueOf = sb.toString();
        } else {
            valueOf = String.valueOf(entry.getValue());
        }
        return "  " + ((d) entry.getKey()).f4876a + " = " + valueOf;
    }
}
