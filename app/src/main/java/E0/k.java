package E0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f546a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f547b;

    /* renamed from: c  reason: collision with root package name */
    public float f548c;

    /* renamed from: d  reason: collision with root package name */
    public float f549d;

    /* renamed from: e  reason: collision with root package name */
    public float f550e;

    /* renamed from: f  reason: collision with root package name */
    public float f551f;
    public float g;

    /* renamed from: h  reason: collision with root package name */
    public float f552h;

    /* renamed from: i  reason: collision with root package name */
    public float f553i;

    /* renamed from: j  reason: collision with root package name */
    public final Matrix f554j;

    /* renamed from: k  reason: collision with root package name */
    public String f555k;

    public k() {
        this.f546a = new Matrix();
        this.f547b = new ArrayList();
        this.f548c = 0.0f;
        this.f549d = 0.0f;
        this.f550e = 0.0f;
        this.f551f = 1.0f;
        this.g = 1.0f;
        this.f552h = 0.0f;
        this.f553i = 0.0f;
        this.f554j = new Matrix();
        this.f555k = null;
    }

    @Override // E0.l
    public final boolean a() {
        int r12 = 0;
        while (true) {
            ArrayList arrayList = this.f547b;
            if (r12 >= arrayList.size()) {
                return false;
            }
            if (((l) arrayList.get(r12)).a()) {
                return true;
            }
            r12++;
        }
    }

    @Override // E0.l
    public final boolean b(int[] r5) {
        int r02 = 0;
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f547b;
            if (r02 < arrayList.size()) {
                z3 |= ((l) arrayList.get(r02)).b(r5);
                r02++;
            } else {
                return z3;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.f554j;
        matrix.reset();
        matrix.postTranslate(-this.f549d, -this.f550e);
        matrix.postScale(this.f551f, this.g);
        matrix.postRotate(this.f548c, 0.0f, 0.0f);
        matrix.postTranslate(this.f552h + this.f549d, this.f553i + this.f550e);
    }

    public String getGroupName() {
        return this.f555k;
    }

    public Matrix getLocalMatrix() {
        return this.f554j;
    }

    public float getPivotX() {
        return this.f549d;
    }

    public float getPivotY() {
        return this.f550e;
    }

    public float getRotation() {
        return this.f548c;
    }

    public float getScaleX() {
        return this.f551f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.f552h;
    }

    public float getTranslateY() {
        return this.f553i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f549d) {
            this.f549d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f550e) {
            this.f550e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f548c) {
            this.f548c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f551f) {
            this.f551f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f552h) {
            this.f552h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.f553i) {
            this.f553i = f2;
            c();
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [E0.j, E0.m] */
    public k(k kVar, R.b bVar) {
        m mVar;
        this.f546a = new Matrix();
        this.f547b = new ArrayList();
        this.f548c = 0.0f;
        this.f549d = 0.0f;
        this.f550e = 0.0f;
        this.f551f = 1.0f;
        this.g = 1.0f;
        this.f552h = 0.0f;
        this.f553i = 0.0f;
        Matrix matrix = new Matrix();
        this.f554j = matrix;
        this.f555k = null;
        this.f548c = kVar.f548c;
        this.f549d = kVar.f549d;
        this.f550e = kVar.f550e;
        this.f551f = kVar.f551f;
        this.g = kVar.g;
        this.f552h = kVar.f552h;
        this.f553i = kVar.f553i;
        String str = kVar.f555k;
        this.f555k = str;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(kVar.f554j);
        ArrayList arrayList = kVar.f547b;
        for (int r22 = 0; r22 < arrayList.size(); r22++) {
            Object obj = arrayList.get(r22);
            if (obj instanceof k) {
                this.f547b.add(new k((k) obj, bVar));
            } else {
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    ?? mVar2 = new m(jVar);
                    mVar2.f537e = 0.0f;
                    mVar2.g = 1.0f;
                    mVar2.f539h = 1.0f;
                    mVar2.f540i = 0.0f;
                    mVar2.f541j = 1.0f;
                    mVar2.f542k = 0.0f;
                    mVar2.f543l = Paint.Cap.BUTT;
                    mVar2.f544m = Paint.Join.MITER;
                    mVar2.f545n = 4.0f;
                    mVar2.f536d = jVar.f536d;
                    mVar2.f537e = jVar.f537e;
                    mVar2.g = jVar.g;
                    mVar2.f538f = jVar.f538f;
                    mVar2.f558c = jVar.f558c;
                    mVar2.f539h = jVar.f539h;
                    mVar2.f540i = jVar.f540i;
                    mVar2.f541j = jVar.f541j;
                    mVar2.f542k = jVar.f542k;
                    mVar2.f543l = jVar.f543l;
                    mVar2.f544m = jVar.f544m;
                    mVar2.f545n = jVar.f545n;
                    mVar = mVar2;
                } else if (obj instanceof i) {
                    mVar = new m((i) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f547b.add(mVar);
                Object obj2 = mVar.f557b;
                if (obj2 != null) {
                    bVar.put(obj2, mVar);
                }
            }
        }
    }
}
