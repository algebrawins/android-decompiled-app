package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class i implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f5914J = 0;

    /* renamed from: K  reason: collision with root package name */
    public final Iterator f5915K;

    /* renamed from: L  reason: collision with root package name */
    public Object f5916L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Object f5917M;

    public i(C0635k c0635k, Iterator it) {
        this.f5917M = c0635k;
        this.f5915K = it;
    }

    public void a() {
        C0659n c0659n = (C0659n) this.f5917M;
        c0659n.h();
        if (c0659n.f5955K == ((Collection) this.f5916L)) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5914J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return this.f5915K.hasNext();
            case 1:
                return this.f5915K.hasNext();
            default:
                a();
                return this.f5915K.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0659n c0659n;
        switch (this.f5914J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Map.Entry entry = (Map.Entry) this.f5915K.next();
                this.f5916L = (Collection) entry.getValue();
                Object key = entry.getKey();
                C0683q c0683q = ((C0627j) this.f5917M).f5938M;
                List list = (List) ((Collection) entry.getValue());
                if (list instanceof RandomAccess) {
                    c0659n = new C0659n(c0683q, key, list, null);
                } else {
                    c0659n = new C0659n(c0683q, key, list, null);
                }
                return new C0746y(key, c0659n);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.f5915K.next();
                this.f5916L = entry2;
                return entry2.getKey();
            default:
                a();
                return this.f5915K.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z3;
        boolean z4;
        switch (this.f5914J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (((Collection) this.f5916L) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                AbstractC0625h5.c("no calls to next() since the last call to remove()", z3);
                this.f5915K.remove();
                C0683q c0683q = ((C0627j) this.f5917M).f5938M;
                ((Collection) this.f5916L).size();
                ((Collection) this.f5916L).clear();
                this.f5916L = null;
                return;
            case 1:
                if (((Map.Entry) this.f5916L) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                AbstractC0625h5.c("no calls to next() since the last call to remove()", z4);
                Collection collection = (Collection) ((Map.Entry) this.f5916L).getValue();
                this.f5915K.remove();
                C0683q c0683q2 = ((C0635k) this.f5917M).f5943K;
                collection.size();
                collection.clear();
                this.f5916L = null;
                return;
            default:
                this.f5915K.remove();
                C0659n c0659n = (C0659n) this.f5917M;
                c0659n.f5958N.getClass();
                c0659n.i();
                return;
        }
    }

    public i(C0659n c0659n, ListIterator listIterator) {
        this.f5917M = c0659n;
        this.f5916L = c0659n.f5955K;
        this.f5915K = listIterator;
    }

    public i(C0627j c0627j) {
        this.f5917M = c0627j;
        this.f5915K = c0627j.f5937L.entrySet().iterator();
    }

    public i(C0659n c0659n) {
        Iterator it;
        this.f5917M = c0659n;
        Collection collection = c0659n.f5955K;
        this.f5916L = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f5915K = it;
    }
}
