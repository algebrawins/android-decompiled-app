package Q1;

import android.content.Context;
import java.util.UUID;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final F1.b f1081b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1082a;

    static {
        B.a a4 = F1.b.a(j.class);
        a4.a(new F1.k(g.class, 1, 0));
        a4.a(new F1.k(Context.class, 1, 0));
        a4.f174M = b.f1062M;
        f1081b = a4.b();
    }

    public j(Context context) {
        this.f1082a = context;
    }

    public final synchronized String a() {
        String string = this.f1082a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String str = UUID.randomUUID().toString();
        this.f1082a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", str).apply();
        return str;
    }
}
