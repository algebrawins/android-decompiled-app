package b1;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final i f2626b = new i(0);

    /* renamed from: c  reason: collision with root package name */
    public static final i f2627c = new i(1);

    /* renamed from: d  reason: collision with root package name */
    public static final i f2628d = new i(2);

    /* renamed from: e  reason: collision with root package name */
    public static final i f2629e = new i(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2630a;

    public /* synthetic */ i(int r12) {
        this.f2630a = r12;
    }

    @Override // b1.j
    public final void a(SQLiteDatabase sQLiteDatabase) {
        switch (this.f2630a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                List list = k.f2631L;
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                return;
            case 1:
                List list2 = k.f2631L;
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                return;
            case 2:
                List list3 = k.f2631L;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                return;
            default:
                List list4 = k.f2631L;
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                return;
        }
    }
}
