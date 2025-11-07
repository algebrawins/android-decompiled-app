package A0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f35a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f36b;

    /* renamed from: c  reason: collision with root package name */
    public int f37c;

    /* renamed from: d  reason: collision with root package name */
    public int f38d;

    /* renamed from: e  reason: collision with root package name */
    public E f39e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f40f;

    public F(RecyclerView recyclerView) {
        this.f40f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f35a = arrayList;
        this.f36b = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f37c = 2;
        this.f38d = 2;
    }

    public final void a() {
        ArrayList arrayList = this.f36b;
        int size = arrayList.size() - 1;
        if (size < 0) {
            arrayList.clear();
            if (RecyclerView.f2520S0) {
                C0009k c0009k = this.f40f.f2528F0;
                c0009k.getClass();
                c0009k.f132c = 0;
            }
        } else if (arrayList.get(size) == null) {
            int[] r02 = RecyclerView.f2518Q0;
            throw null;
        } else {
            throw new ClassCastException();
        }
    }

    public final void b(int r7) {
        RecyclerView recyclerView = this.f40f;
        if (r7 >= 0 && r7 < recyclerView.f2529G0.a()) {
            J j3 = recyclerView.f2529G0;
            boolean z3 = j3.f45c;
            ArrayList arrayList = this.f35a;
            if (arrayList.size() <= 0) {
                ArrayList arrayList2 = (ArrayList) recyclerView.f2537M.f84K;
                if (arrayList2.size() <= 0) {
                    ArrayList arrayList3 = this.f36b;
                    if (arrayList3.size() <= 0) {
                        int C3 = recyclerView.f2535L.C(r7, 0);
                        if (C3 >= 0) {
                            throw null;
                        }
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + r7 + "(offset:" + C3 + ").state:" + j3.a() + recyclerView.h());
                    }
                    arrayList3.get(0).getClass();
                    throw new ClassCastException();
                }
                RecyclerView.j((View) arrayList2.get(0));
                throw null;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        throw new IndexOutOfBoundsException("Invalid item position " + r7 + "(" + r7 + "). Item count:" + recyclerView.f2529G0.a() + recyclerView.h());
    }

    public final void c() {
        z zVar = this.f40f.f2545R;
        this.f38d = this.f37c;
        ArrayList arrayList = this.f36b;
        int size = arrayList.size() - 1;
        if (size >= 0 && arrayList.size() > this.f38d) {
            if (arrayList.get(size) == null) {
                int[] r02 = RecyclerView.f2518Q0;
                throw null;
            }
            throw new ClassCastException();
        }
    }
}
