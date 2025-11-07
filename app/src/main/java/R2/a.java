package R2;

import java.util.Iterator;

/* loaded from: classes.dex */
public class a implements Iterable {

    /* renamed from: J  reason: collision with root package name */
    public final int f1156J;

    /* renamed from: K  reason: collision with root package name */
    public final int f1157K;

    /* renamed from: L  reason: collision with root package name */
    public final int f1158L;

    public a(int r3, int r4, int r5) {
        if (r5 != 0) {
            if (r5 != Integer.MIN_VALUE) {
                this.f1156J = r3;
                if (r5 > 0) {
                    if (r3 < r4) {
                        int r02 = r4 % r5;
                        int r32 = r3 % r5;
                        int r03 = ((r02 < 0 ? r02 + r5 : r02) - (r32 < 0 ? r32 + r5 : r32)) % r5;
                        r4 -= r03 < 0 ? r03 + r5 : r03;
                    }
                } else if (r5 < 0) {
                    if (r3 > r4) {
                        int r04 = -r5;
                        int r33 = r3 % r04;
                        int r12 = r4 % r04;
                        int r34 = ((r33 < 0 ? r33 + r04 : r33) - (r12 < 0 ? r12 + r04 : r12)) % r04;
                        r4 += r34 < 0 ? r34 + r04 : r34;
                    }
                } else {
                    throw new IllegalArgumentException("Step is zero.");
                }
                this.f1157K = r4;
                this.f1158L = r5;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            if (!isEmpty() || !((a) obj).isEmpty()) {
                a aVar = (a) obj;
                if (this.f1156J != aVar.f1156J || this.f1157K != aVar.f1157K || this.f1158L != aVar.f1158L) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f1156J * 31) + this.f1157K) * 31) + this.f1158L;
    }

    public boolean isEmpty() {
        int r02 = this.f1158L;
        int r3 = this.f1157K;
        int r4 = this.f1156J;
        if (r02 > 0) {
            if (r4 <= r3) {
                return false;
            }
        } else if (r4 >= r3) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f1156J, this.f1157K, this.f1158L);
    }

    public String toString() {
        StringBuilder sb;
        int r12 = this.f1157K;
        int r22 = this.f1156J;
        int r3 = this.f1158L;
        if (r3 > 0) {
            sb = new StringBuilder();
            sb.append(r22);
            sb.append("..");
            sb.append(r12);
            sb.append(" step ");
            sb.append(r3);
        } else {
            sb = new StringBuilder();
            sb.append(r22);
            sb.append(" downTo ");
            sb.append(r12);
            sb.append(" step ");
            sb.append(-r3);
        }
        return sb.toString();
    }
}
