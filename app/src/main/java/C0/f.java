package c0;

import h1.C0281a;
import io.flutter.plugin.editing.j;
import k1.w;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public int f2650a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2651b;

    public /* synthetic */ f(int r12, Object[] objArr) {
        this.f2650a = r12;
        this.f2651b = objArr;
    }

    public f(C0281a c0281a, int r22) {
        w.e(c0281a);
        this.f2651b = c0281a;
        this.f2650a = r22;
    }

    public f(int r22) {
        if (r22 > 0) {
            this.f2651b = new Object[r22];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public f(j jVar, int r22) {
        this.f2651b = jVar;
        this.f2650a = r22;
    }
}
