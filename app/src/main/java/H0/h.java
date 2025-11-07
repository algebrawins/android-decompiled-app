package H0;

import C2.q;
import D.C;
import D.C0032m;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f726a;

    /* renamed from: b  reason: collision with root package name */
    public final String f727b;

    /* renamed from: c  reason: collision with root package name */
    public final k f728c;

    /* renamed from: d  reason: collision with root package name */
    public final C0032m f729d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [C2.q] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Throwable, D.m, java.lang.Exception] */
    public h(Object obj, String str, a aVar, k kVar) {
        N2.g.e(obj, "value");
        this.f726a = obj;
        this.f727b = str;
        this.f728c = kVar;
        String b3 = i.b(obj, str);
        N2.g.e(b3, "message");
        ?? exc = new Exception(b3);
        StackTraceElement[] stackTrace = exc.getStackTrace();
        N2.g.d(stackTrace, "stackTrace");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length >= 0) {
            ?? r02 = q.f272J;
            if (length != 0) {
                int length2 = stackTrace.length;
                if (length >= length2) {
                    int length3 = stackTrace.length;
                    if (length3 != 0) {
                        r02 = length3 != 1 ? new ArrayList(new C2.f(stackTrace, false)) : C2.j.b(stackTrace[0]);
                    }
                } else if (length == 1) {
                    r02 = C2.j.b(stackTrace[length2 - 1]);
                } else {
                    r02 = new ArrayList(length);
                    for (int r5 = length2 - length; r5 < length2; r5++) {
                        r02.add(stackTrace[r5]);
                    }
                }
            }
            exc.setStackTrace((StackTraceElement[]) ((Collection) r02).toArray(new StackTraceElement[0]));
            this.f729d = exc;
            return;
        }
        throw new IllegalArgumentException(C.v(length, "Requested element count ", " is less than zero.").toString());
    }

    @Override // H0.i
    public final Object a() {
        int r02 = g.f725a[this.f728c.ordinal()];
        if (r02 != 1) {
            if (r02 != 2) {
                if (r02 != 3) {
                    throw new RuntimeException();
                }
                return null;
            }
            String b3 = i.b(this.f726a, this.f727b);
            N2.g.e(b3, "message");
            Log.d("f", b3);
            return null;
        }
        throw this.f729d;
    }

    @Override // H0.i
    public final i d(String str, M2.l lVar) {
        return this;
    }
}
