package o1;

import h1.C0283c;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ b f4490a = new Object();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0283c c0283c = (C0283c) obj;
        C0283c c0283c2 = (C0283c) obj2;
        if (!c0283c.f3256a.equals(c0283c2.f3256a)) {
            return c0283c.f3256a.compareTo(c0283c2.f3256a);
        }
        return (c0283c.a() > c0283c2.a() ? 1 : (c0283c.a() == c0283c2.a() ? 0 : -1));
    }
}
