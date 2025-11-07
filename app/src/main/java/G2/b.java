package G2;

import C2.e;
import D.C;
import N2.g;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b extends e implements a, Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final Enum[] f690J;

    public b(Enum[] enumArr) {
        this.f690J = enumArr;
    }

    @Override // C2.e, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        Enum r02;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        g.e(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f690J;
        g.e(enumArr, "<this>");
        if (ordinal >= 0 && ordinal < enumArr.length) {
            r02 = enumArr[ordinal];
        } else {
            r02 = null;
        }
        if (r02 != r5) {
            return false;
        }
        return true;
    }

    @Override // C2.e
    public final int e() {
        return this.f690J.length;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        Enum[] enumArr = this.f690J;
        int length = enumArr.length;
        if (r5 >= 0 && r5 < length) {
            return enumArr[r5];
        }
        throw new IndexOutOfBoundsException(C.x("index: ", r5, ", size: ", length));
    }

    @Override // C2.e, java.util.List
    public final int indexOf(Object obj) {
        Enum r22;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        g.e(r5, "element");
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f690J;
        g.e(enumArr, "<this>");
        if (ordinal >= 0 && ordinal < enumArr.length) {
            r22 = enumArr[ordinal];
        } else {
            r22 = null;
        }
        if (r22 != r5) {
            return -1;
        }
        return ordinal;
    }

    @Override // C2.e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r22 = (Enum) obj;
        g.e(r22, "element");
        return indexOf(r22);
    }
}
