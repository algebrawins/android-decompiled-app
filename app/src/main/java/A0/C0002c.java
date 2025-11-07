package A0;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.SystemClock;
import b1.InterfaceC0150f;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e1.AbstractC0248a;
import java.util.concurrent.atomic.AtomicLong;
import w.C0510u;
import x1.C0727v4;

/* renamed from: A0.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0002c implements InterfaceC0150f, C1.d {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f87J;

    /* renamed from: K  reason: collision with root package name */
    public long f88K;

    /* renamed from: L  reason: collision with root package name */
    public Object f89L;

    public C0002c(long j3, V0.c cVar) {
        this.f87J = 1;
        this.f88K = j3;
        this.f89L = cVar;
    }

    public int a(int r7) {
        C0002c c0002c = (C0002c) this.f89L;
        if (c0002c == null) {
            if (r7 >= 64) {
                return Long.bitCount(this.f88K);
            }
            return Long.bitCount(this.f88K & ((1 << r7) - 1));
        } else if (r7 < 64) {
            return Long.bitCount(this.f88K & ((1 << r7) - 1));
        } else {
            return Long.bitCount(this.f88K) + c0002c.a(r7 - 64);
        }
    }

    @Override // b1.InterfaceC0150f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        S0.b bVar = b1.h.f2621N;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f88K));
        V0.c cVar = (V0.c) this.f89L;
        String str = cVar.f1368a;
        S0.c cVar2 = cVar.f1370c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC0248a.a(cVar2))}) < 1) {
            contentValues.put("backend_name", cVar.f1368a);
            contentValues.put("priority", Integer.valueOf(AbstractC0248a.a(cVar2)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public boolean b(int r5) {
        if (r5 >= 64) {
            if (((C0002c) this.f89L) == null) {
                this.f89L = new C0002c();
            }
            return ((C0002c) this.f89L).b(r5 - 64);
        } else if ((this.f88K & (1 << r5)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public int c() {
        if (!((C0510u) this.f89L).c()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f88K == -1) {
            this.f88K = uptimeMillis;
        }
        long j3 = uptimeMillis - this.f88K;
        if (j3 <= 120000) {
            return 1000;
        }
        if (j3 <= 300000) {
            return 2000;
        }
        return 4000;
    }

    public void d() {
        this.f88K = 0L;
        C0002c c0002c = (C0002c) this.f89L;
        if (c0002c != null) {
            c0002c.d();
        }
    }

    @Override // C1.d
    public void q(Exception exc) {
        ((AtomicLong) ((C0727v4) this.f89L).f6109K).set(this.f88K);
    }

    public String toString() {
        switch (this.f87J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (((C0002c) this.f89L) == null) {
                    return Long.toBinaryString(this.f88K);
                }
                return ((C0002c) this.f89L).toString() + "xx" + Long.toBinaryString(this.f88K);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0002c(C0727v4 c0727v4, long j3) {
        this.f87J = 3;
        this.f89L = c0727v4;
        this.f88K = j3;
    }

    public C0002c() {
        this.f87J = 0;
        this.f88K = 0L;
    }

    public C0002c(C0510u c0510u) {
        this.f87J = 2;
        this.f89L = c0510u;
        this.f88K = -1L;
    }
}
