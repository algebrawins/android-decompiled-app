package E0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f559p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f560a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f561b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f562c;

    /* renamed from: d  reason: collision with root package name */
    public Paint f563d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f564e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f565f;
    public final k g;

    /* renamed from: h  reason: collision with root package name */
    public float f566h;

    /* renamed from: i  reason: collision with root package name */
    public float f567i;

    /* renamed from: j  reason: collision with root package name */
    public float f568j;

    /* renamed from: k  reason: collision with root package name */
    public float f569k;

    /* renamed from: l  reason: collision with root package name */
    public int f570l;

    /* renamed from: m  reason: collision with root package name */
    public String f571m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f572n;

    /* renamed from: o  reason: collision with root package name */
    public final R.b f573o;

    /* JADX WARN: Type inference failed for: r0v4, types: [R.b, R.k] */
    public n() {
        this.f562c = new Matrix();
        this.f566h = 0.0f;
        this.f567i = 0.0f;
        this.f568j = 0.0f;
        this.f569k = 0.0f;
        this.f570l = 255;
        this.f571m = null;
        this.f572n = null;
        this.f573o = new R.k();
        this.g = new k();
        this.f560a = new Path();
        this.f561b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
        if (r0.f541j != 1.0f) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(E0.k r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.n.a(E0.k, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f570l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int r12) {
        this.f570l = r12;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [R.b, R.k] */
    public n(n nVar) {
        this.f562c = new Matrix();
        this.f566h = 0.0f;
        this.f567i = 0.0f;
        this.f568j = 0.0f;
        this.f569k = 0.0f;
        this.f570l = 255;
        this.f571m = null;
        this.f572n = null;
        ?? kVar = new R.k();
        this.f573o = kVar;
        this.g = new k(nVar.g, kVar);
        this.f560a = new Path(nVar.f560a);
        this.f561b = new Path(nVar.f561b);
        this.f566h = nVar.f566h;
        this.f567i = nVar.f567i;
        this.f568j = nVar.f568j;
        this.f569k = nVar.f569k;
        this.f570l = nVar.f570l;
        this.f571m = nVar.f571m;
        String str = nVar.f571m;
        if (str != null) {
            kVar.put(str, this);
        }
        this.f572n = nVar.f572n;
    }
}
