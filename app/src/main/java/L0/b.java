package l0;

import D.C;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import h2.q;
import p.g0;

/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {

    /* renamed from: J  reason: collision with root package name */
    public boolean f4094J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f4095K;

    /* renamed from: L  reason: collision with root package name */
    public Cursor f4096L;

    /* renamed from: M  reason: collision with root package name */
    public Context f4097M;

    /* renamed from: N  reason: collision with root package name */
    public int f4098N;

    /* renamed from: O  reason: collision with root package name */
    public q f4099O;

    /* renamed from: P  reason: collision with root package name */
    public C0346a f4100P;

    /* renamed from: Q  reason: collision with root package name */
    public c f4101Q;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f4096L;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                q qVar = this.f4099O;
                if (qVar != null) {
                    cursor2.unregisterContentObserver(qVar);
                }
                C0346a c0346a = this.f4100P;
                if (c0346a != null) {
                    cursor2.unregisterDataSetObserver(c0346a);
                }
            }
            this.f4096L = cursor;
            if (cursor != null) {
                q qVar2 = this.f4099O;
                if (qVar2 != null) {
                    cursor.registerContentObserver(qVar2);
                }
                C0346a c0346a2 = this.f4100P;
                if (c0346a2 != null) {
                    cursor.registerDataSetObserver(c0346a2);
                }
                this.f4098N = cursor.getColumnIndexOrThrow("_id");
                this.f4094J = true;
                notifyDataSetChanged();
            } else {
                this.f4098N = -1;
                this.f4094J = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f4094J && (cursor = this.f4096L) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int r22, View view, ViewGroup viewGroup) {
        if (this.f4094J) {
            this.f4096L.moveToPosition(r22);
            if (view == null) {
                g0 g0Var = (g0) this;
                view = g0Var.f4607T.inflate(g0Var.f4606S, viewGroup, false);
            }
            a(view, this.f4096L);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l0.c, android.widget.Filter] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f4101Q == null) {
            ?? filter = new Filter();
            filter.f4102a = this;
            this.f4101Q = filter;
        }
        return this.f4101Q;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r22) {
        Cursor cursor;
        if (this.f4094J && (cursor = this.f4096L) != null) {
            cursor.moveToPosition(r22);
            return this.f4096L;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
        Cursor cursor;
        if (!this.f4094J || (cursor = this.f4096L) == null || !cursor.moveToPosition(r4)) {
            return 0L;
        }
        return this.f4096L.getLong(this.f4098N);
    }

    @Override // android.widget.Adapter
    public View getView(int r22, View view, ViewGroup viewGroup) {
        if (this.f4094J) {
            if (this.f4096L.moveToPosition(r22)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f4096L);
                return view;
            }
            throw new IllegalStateException(C.w("couldn't move cursor to position ", r22));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
