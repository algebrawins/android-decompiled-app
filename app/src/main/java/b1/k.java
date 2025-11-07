package b1;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class k extends SQLiteOpenHelper {

    /* renamed from: L  reason: collision with root package name */
    public static final List f2631L = Arrays.asList(i.f2626b, i.f2627c, i.f2628d, i.f2629e);

    /* renamed from: J  reason: collision with root package name */
    public final int f2632J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f2633K;

    public k(int r22, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, r22);
        this.f2633K = false;
        this.f2632J = r22;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int r4, int r5) {
        List list = f2631L;
        if (r5 <= list.size()) {
            while (r4 < r5) {
                ((j) list.get(r4)).a(sQLiteDatabase);
                r4++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + r4 + " to " + r5 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f2633K = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2633K) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f2632J);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int r22, int r3) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        if (!this.f2633K) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, r3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f2633K) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int r3, int r4) {
        if (!this.f2633K) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, r3, r4);
    }
}
