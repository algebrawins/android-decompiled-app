package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x1.v  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0722v extends AbstractCollection {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f6103J = 1;

    /* renamed from: K  reason: collision with root package name */
    public final AbstractMap f6104K;

    public C0722v(C0627j c0627j) {
        this.f6104K = c0627j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f6103J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((C0730w) this.f6104K).clear();
                return;
            default:
                ((C0627j) this.f6104K).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.f6103J) {
            case 1:
                return ((C0627j) this.f6104K).containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.f6103J) {
            case 1:
                return ((C0627j) this.f6104K).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f6103J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0730w c0730w = (C0730w) this.f6104K;
                Map a4 = c0730w.a();
                if (a4 != null) {
                    return a4.values().iterator();
                }
                return new C0698s(c0730w, 2);
            default:
                return new E(((C0627j) this.f6104K).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f6103J) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C0627j c0627j = (C0627j) this.f6104K;
                    for (Map.Entry entry : c0627j.entrySet()) {
                        if (AbstractC0617g5.a(obj, entry.getValue())) {
                            c0627j.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f6103J) {
            case 1:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0627j c0627j = (C0627j) this.f6104K;
                    for (Map.Entry entry : c0627j.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0627j.f5938M.b().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f6103J) {
            case 1:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C0627j c0627j = (C0627j) this.f6104K;
                    for (Map.Entry entry : c0627j.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c0627j.f5938M.b().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f6103J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((C0730w) this.f6104K).size();
            default:
                return ((C0627j) this.f6104K).size();
        }
    }

    public C0722v(C0730w c0730w) {
        this.f6104K = c0730w;
    }
}
