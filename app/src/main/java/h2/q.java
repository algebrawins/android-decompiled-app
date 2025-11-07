package h2;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import com.google.android.libraries.barhopper.RecognitionOptions;
import p.g0;

/* loaded from: classes.dex */
public final class q extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3350a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3351b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, Handler handler) {
        super(handler);
        this.f3351b = tVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f3350a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return true;
            default:
                return true;
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        Cursor cursor;
        switch (this.f3350a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                super.onChange(z3);
                t tVar = (t) this.f3351b;
                if (tVar.f3362Q != null) {
                    tVar.d();
                    return;
                }
                return;
            default:
                g0 g0Var = (g0) this.f3351b;
                if (g0Var.f4095K && (cursor = g0Var.f4096L) != null && !cursor.isClosed()) {
                    g0Var.f4094J = g0Var.f4096L.requery();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g0 g0Var) {
        super(new Handler());
        this.f3351b = g0Var;
    }
}
