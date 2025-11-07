package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x1.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0706t extends AbstractSet {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f6092J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ C0730w f6093K;

    public /* synthetic */ C0706t(C0730w c0730w, int r22) {
        this.f6092J = r22;
        this.f6093K = c0730w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f6092J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f6093K.clear();
                return;
            default:
                this.f6093K.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f6092J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0730w c0730w = this.f6093K;
                Map a4 = c0730w.a();
                if (a4 != null) {
                    return a4.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e4 = c0730w.e(entry.getKey());
                    if (e4 != -1) {
                        Object[] objArr = c0730w.f6117M;
                        objArr.getClass();
                        if (AbstractC0617g5.a(objArr[e4], entry.getValue())) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return this.f6093K.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f6092J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0730w c0730w = this.f6093K;
                Map a4 = c0730w.a();
                if (a4 != null) {
                    return a4.entrySet().iterator();
                }
                return new C0698s(c0730w, 1);
            default:
                C0730w c0730w2 = this.f6093K;
                Map a5 = c0730w2.a();
                if (a5 != null) {
                    return a5.keySet().iterator();
                }
                return new C0698s(c0730w2, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f6092J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0730w c0730w = this.f6093K;
                Map a4 = c0730w.a();
                if (a4 != null) {
                    return a4.entrySet().remove(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!c0730w.c()) {
                        int d4 = c0730w.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = c0730w.f6114J;
                        obj2.getClass();
                        int[] r7 = c0730w.f6115K;
                        r7.getClass();
                        Object[] objArr = c0730w.f6116L;
                        objArr.getClass();
                        Object[] objArr2 = c0730w.f6117M;
                        objArr2.getClass();
                        int a5 = AbstractC0633j5.a(key, value, d4, obj2, r7, objArr, objArr2);
                        if (a5 != -1) {
                            c0730w.b(a5, d4);
                            c0730w.f6119O--;
                            c0730w.f6118N += 32;
                            return true;
                        }
                    }
                }
                return false;
            default:
                C0730w c0730w2 = this.f6093K;
                Map a6 = c0730w2.a();
                if (a6 != null) {
                    return a6.keySet().remove(obj);
                }
                if (c0730w2.g(obj) == C0730w.f6113S) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f6092J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return this.f6093K.size();
            default:
                return this.f6093K.size();
        }
    }
}
