package A0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f71a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f72b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public int f73c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public final int f74d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f75e;

    public T(StaggeredGridLayoutManager staggeredGridLayoutManager, int r22) {
        this.f75e = staggeredGridLayoutManager;
        this.f74d = r22;
    }

    public final int a(int r3) {
        int r02 = this.f73c;
        if (r02 != Integer.MIN_VALUE) {
            return r02;
        }
        if (this.f71a.size() == 0) {
            return r3;
        }
        ArrayList arrayList = this.f71a;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.f73c = this.f75e.f2575j.i(view);
        ((O) view.getLayoutParams()).getClass();
        return this.f73c;
    }
}
