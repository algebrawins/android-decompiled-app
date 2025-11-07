package b1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import c1.InterfaceC0160b;
import c1.InterfaceC0161c;
import d1.InterfaceC0232a;
import e1.AbstractC0248a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements InterfaceC0147c, InterfaceC0161c {

    /* renamed from: N  reason: collision with root package name */
    public static final S0.b f2621N = new S0.b("proto");

    /* renamed from: J  reason: collision with root package name */
    public final k f2622J;

    /* renamed from: K  reason: collision with root package name */
    public final InterfaceC0232a f2623K;

    /* renamed from: L  reason: collision with root package name */
    public final InterfaceC0232a f2624L;

    /* renamed from: M  reason: collision with root package name */
    public final C0145a f2625M;

    public h(InterfaceC0232a interfaceC0232a, InterfaceC0232a interfaceC0232a2, C0145a c0145a, k kVar) {
        this.f2622J = kVar;
        this.f2623K = interfaceC0232a;
        this.f2624L = interfaceC0232a2;
        this.f2625M = c0145a;
    }

    public static Long b(SQLiteDatabase sQLiteDatabase, V0.c cVar) {
        Long valueOf;
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(cVar.f1368a, String.valueOf(AbstractC0248a.a(cVar.f1370c))));
        byte[] bArr = cVar.f1369b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String j(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C0146b) it.next()).f2612a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object k(Cursor cursor, InterfaceC0150f interfaceC0150f) {
        try {
            return interfaceC0150f.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase a() {
        k kVar = this.f2622J;
        kVar.getClass();
        InterfaceC0232a interfaceC0232a = this.f2624L;
        long c4 = interfaceC0232a.c();
        while (true) {
            try {
                return kVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e4) {
                if (interfaceC0232a.c() < this.f2625M.f2609c + c4) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to open db.", e4);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2622J.close();
    }

    public final Object f(InterfaceC0150f interfaceC0150f) {
        SQLiteDatabase a4 = a();
        a4.beginTransaction();
        try {
            Object apply = interfaceC0150f.apply(a4);
            a4.setTransactionSuccessful();
            return apply;
        } finally {
            a4.endTransaction();
        }
    }

    public final Object h(InterfaceC0160b interfaceC0160b) {
        SQLiteDatabase a4 = a();
        InterfaceC0232a interfaceC0232a = this.f2624L;
        long c4 = interfaceC0232a.c();
        while (true) {
            try {
                a4.beginTransaction();
                try {
                    Object Y3 = interfaceC0160b.Y();
                    a4.setTransactionSuccessful();
                    return Y3;
                } finally {
                    a4.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e4) {
                if (interfaceC0232a.c() < this.f2625M.f2609c + c4) {
                    SystemClock.sleep(50L);
                } else {
                    throw new RuntimeException("Timed out while trying to acquire the lock.", e4);
                }
            }
        }
    }
}
