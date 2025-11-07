package o1;

import android.os.Parcel;
import android.os.Parcelable;
import i1.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import k1.w;
import l1.AbstractC0347a;
import x1.G4;

/* renamed from: o1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398a extends AbstractC0347a {
    public static final Parcelable.Creator<C0398a> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4486a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4487b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4488c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4489d;

    public C0398a(ArrayList arrayList, boolean z3, String str, String str2) {
        w.e(arrayList);
        this.f4486a = arrayList;
        this.f4487b = z3;
        this.f4488c = str;
        this.f4489d = str2;
    }

    public static C0398a a(List list, boolean z3) {
        TreeSet treeSet = new TreeSet(b.f4490a);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((j) it.next()).a());
        }
        return new C0398a(new ArrayList(treeSet), z3, null, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0398a)) {
            return false;
        }
        C0398a c0398a = (C0398a) obj;
        if (this.f4487b != c0398a.f4487b || !w.h(this.f4486a, c0398a.f4486a) || !w.h(this.f4488c, c0398a.f4488c) || !w.h(this.f4489d, c0398a.f4489d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4487b), this.f4486a, this.f4488c, this.f4489d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int g = G4.g(parcel, 20293);
        G4.f(parcel, 1, this.f4486a);
        G4.i(parcel, 2, 4);
        parcel.writeInt(this.f4487b ? 1 : 0);
        G4.c(parcel, 3, this.f4488c);
        G4.c(parcel, 4, this.f4489d);
        G4.h(parcel, g);
    }
}
