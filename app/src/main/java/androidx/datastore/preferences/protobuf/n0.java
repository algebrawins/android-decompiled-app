package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.P0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class n0 extends AbstractSet {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f2401J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ AbstractMap f2402K;

    public /* synthetic */ n0(AbstractMap abstractMap, int r22) {
        this.f2401J = r22;
        this.f2402K = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f2401J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    Object value = entry.getValue();
                    ((k0) this.f2402K).put((Comparable) entry.getKey(), value);
                    return true;
                }
                return false;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    Object value2 = entry2.getValue();
                    ((P0) this.f2402K).put((Comparable) entry2.getKey(), value2);
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f2401J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((k0) this.f2402K).clear();
                return;
            default:
                ((P0) this.f2402K).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f2401J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((k0) this.f2402K).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value && (obj2 == null || !obj2.equals(value))) {
                    return false;
                }
                return true;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj3 = ((P0) this.f2402K).get(entry2.getKey());
                Object value2 = entry2.getValue();
                boolean z3 = true;
                if (obj3 != value2) {
                    if (obj3 != null) {
                        if (!obj3.equals(value2)) {
                            return false;
                        }
                    } else {
                        z3 = false;
                    }
                }
                return z3;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.f2401J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new m0((k0) this.f2402K, 0);
            default:
                return new m0((P0) this.f2402K, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f2401J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((k0) this.f2402K).remove(entry.getKey());
                    return true;
                }
                return false;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((P0) this.f2402K).remove(entry2.getKey());
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f2401J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((k0) this.f2402K).size();
            default:
                return ((P0) this.f2402K).size();
        }
    }
}
