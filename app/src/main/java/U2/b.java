package U2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b implements Iterator {

    /* renamed from: J  reason: collision with root package name */
    public final String f1347J;

    /* renamed from: K  reason: collision with root package name */
    public int f1348K;

    /* renamed from: L  reason: collision with root package name */
    public int f1349L;

    /* renamed from: M  reason: collision with root package name */
    public int f1350M;

    /* renamed from: N  reason: collision with root package name */
    public int f1351N;

    public b(String str) {
        this.f1347J = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r12;
        int r02 = this.f1348K;
        if (r02 != 0) {
            if (r02 != 1) {
                return false;
            }
            return true;
        }
        int r3 = 2;
        if (this.f1351N < 0) {
            this.f1348K = 2;
            return false;
        }
        String str = this.f1347J;
        int length = str.length();
        int length2 = str.length();
        for (int r4 = this.f1349L; r4 < length2; r4++) {
            char charAt = str.charAt(r4);
            if (charAt == '\n' || charAt == '\r') {
                r3 = (charAt == '\r' && (r12 = r4 + 1) < str.length() && str.charAt(r12) == '\n') ? 1 : 1;
                length = r4;
                this.f1348K = 1;
                this.f1351N = r3;
                this.f1350M = length;
                return true;
            }
        }
        r3 = -1;
        this.f1348K = 1;
        this.f1351N = r3;
        this.f1350M = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f1348K = 0;
            int r02 = this.f1350M;
            int r12 = this.f1349L;
            this.f1349L = this.f1351N + r02;
            return this.f1347J.subSequence(r12, r02).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
