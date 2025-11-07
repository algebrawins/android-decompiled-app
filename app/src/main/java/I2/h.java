package i2;

import android.database.Cursor;
import b1.C0151g;
import b1.InterfaceC0150f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class h implements InterfaceC0150f {

    /* renamed from: K  reason: collision with root package name */
    public static volatile h f3456K;

    /* renamed from: J  reason: collision with root package name */
    public final HashMap f3457J;

    public h(HashMap hashMap) {
        this.f3457J = hashMap;
    }

    @Override // b1.InterfaceC0150f
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        S0.b bVar = b1.h.f2621N;
        while (cursor.moveToNext()) {
            long j3 = cursor.getLong(0);
            Long valueOf = Long.valueOf(j3);
            HashMap hashMap = this.f3457J;
            Set set = (Set) hashMap.get(valueOf);
            if (set == null) {
                set = new HashSet();
                hashMap.put(Long.valueOf(j3), set);
            }
            set.add(new C0151g(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    public h() {
        this.f3457J = new HashMap();
    }
}
