package A0;

import java.util.ArrayList;

/* renamed from: A0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0003d extends y {

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f90e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f91f;
    public ArrayList g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList f92h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f93i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList f94j;

    /* renamed from: k  reason: collision with root package name */
    public ArrayList f95k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f96l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList f97m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList f98n;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList f99o;

    public static void c(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    @Override // A0.y
    public final void a() {
        ArrayList arrayList = this.g;
        int size = arrayList.size() - 1;
        if (size < 0) {
            ArrayList arrayList2 = this.f90e;
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                if (arrayList2.get(size2) == null) {
                    if (this.f158a == null) {
                        arrayList2.remove(size2);
                    } else {
                        throw null;
                    }
                } else {
                    throw new ClassCastException();
                }
            }
            ArrayList arrayList3 = this.f91f;
            int size3 = arrayList3.size() - 1;
            if (size3 < 0) {
                ArrayList arrayList4 = this.f92h;
                int size4 = arrayList4.size() - 1;
                if (size4 < 0) {
                    arrayList4.clear();
                    if (!b()) {
                        return;
                    }
                    ArrayList arrayList5 = this.f94j;
                    for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                        ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                        int size6 = arrayList6.size() - 1;
                        if (size6 >= 0) {
                            D.C.G(arrayList6.get(size6));
                            throw null;
                        }
                    }
                    ArrayList arrayList7 = this.f93i;
                    for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                        ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                        int size8 = arrayList8.size() - 1;
                        if (size8 >= 0) {
                            arrayList8.get(size8).getClass();
                            throw new ClassCastException();
                        }
                    }
                    ArrayList arrayList9 = this.f95k;
                    for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                        ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                        int size10 = arrayList10.size() - 1;
                        if (size10 >= 0) {
                            D.C.G(arrayList10.get(size10));
                            throw null;
                        }
                    }
                    c(this.f98n);
                    c(this.f97m);
                    c(this.f96l);
                    c(this.f99o);
                    ArrayList arrayList11 = this.f159b;
                    if (arrayList11.size() <= 0) {
                        arrayList11.clear();
                        return;
                    } else {
                        arrayList11.get(0).getClass();
                        throw new ClassCastException();
                    }
                }
                D.C.G(arrayList4.get(size4));
                throw null;
            }
            arrayList3.get(size3).getClass();
            throw new ClassCastException();
        }
        D.C.G(arrayList.get(size));
        throw null;
    }

    @Override // A0.y
    public final boolean b() {
        if (this.f91f.isEmpty() && this.f92h.isEmpty() && this.g.isEmpty() && this.f90e.isEmpty() && this.f97m.isEmpty() && this.f98n.isEmpty() && this.f96l.isEmpty() && this.f99o.isEmpty() && this.f94j.isEmpty() && this.f93i.isEmpty() && this.f95k.isEmpty()) {
            return false;
        }
        return true;
    }
}
