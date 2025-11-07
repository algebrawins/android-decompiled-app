package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: x1.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698s implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public int f6083J;

    /* renamed from: K  reason: collision with root package name */
    public int f6084K;

    /* renamed from: L  reason: collision with root package name */
    public int f6085L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ C0730w f6086M;

    /* renamed from: N  reason: collision with root package name */
    public final /* synthetic */ int f6087N;

    /* renamed from: O  reason: collision with root package name */
    public final /* synthetic */ C0730w f6088O;

    public C0698s(C0730w c0730w, int r22) {
        int r12;
        this.f6087N = r22;
        this.f6088O = c0730w;
        this.f6086M = c0730w;
        this.f6083J = c0730w.f6118N;
        if (c0730w.isEmpty()) {
            r12 = -1;
        } else {
            r12 = 0;
        }
        this.f6084K = r12;
        this.f6085L = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6084K >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0714u c0714u;
        C0730w c0730w = this.f6086M;
        if (c0730w.f6118N == this.f6083J) {
            if (hasNext()) {
                int r12 = this.f6084K;
                this.f6085L = r12;
                switch (this.f6087N) {
                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                        Object[] objArr = this.f6088O.f6116L;
                        objArr.getClass();
                        c0714u = objArr[r12];
                        break;
                    case 1:
                        c0714u = new C0714u(this.f6088O, r12);
                        break;
                    default:
                        Object[] objArr2 = this.f6088O.f6117M;
                        objArr2.getClass();
                        c0714u = objArr2[r12];
                        break;
                }
                int r22 = this.f6084K + 1;
                if (r22 >= c0730w.f6119O) {
                    r22 = -1;
                }
                this.f6084K = r22;
                return c0714u;
            }
            throw new NoSuchElementException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z3;
        C0730w c0730w = this.f6086M;
        if (c0730w.f6118N == this.f6083J) {
            if (this.f6085L >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC0625h5.c("no calls to next() since the last call to remove()", z3);
            this.f6083J += 32;
            int r12 = this.f6085L;
            Object[] objArr = c0730w.f6116L;
            objArr.getClass();
            c0730w.remove(objArr[r12]);
            this.f6084K--;
            this.f6085L = -1;
            return;
        }
        throw new ConcurrentModificationException();
    }
}
