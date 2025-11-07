package J1;

import H1.f;
import H1.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f794a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f794a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // H1.a
    public final void a(Object obj, Object obj2) {
        ((g) obj2).a(f794a.format((Date) obj));
    }
}
