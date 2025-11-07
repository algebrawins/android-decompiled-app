package R2;

/* loaded from: classes.dex */
public final class c extends a {
    static {
        new a(1, 0, 1);
    }

    @Override // R2.a
    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (this.f1156J == cVar.f1156J) {
                    if (this.f1157K == cVar.f1157K) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // R2.a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f1156J * 31) + this.f1157K;
    }

    @Override // R2.a
    public final boolean isEmpty() {
        if (this.f1156J > this.f1157K) {
            return true;
        }
        return false;
    }

    @Override // R2.a
    public final String toString() {
        return this.f1156J + ".." + this.f1157K;
    }
}
