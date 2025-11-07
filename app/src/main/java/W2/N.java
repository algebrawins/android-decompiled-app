package w2;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class N extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        String str;
        String[] strArr = {"java.util.Arrays$ArrayList", "java.util.ArrayList", "java.lang.String", "[Ljava.lang.String;"};
        LinkedHashSet linkedHashSet = new LinkedHashSet(C2.t.a(4));
        for (int r3 = 0; r3 < 4; r3++) {
            linkedHashSet.add(strArr[r3]);
        }
        if (objectStreamClass != null) {
            str = objectStreamClass.getName();
        } else {
            str = null;
        }
        if (str != null && !linkedHashSet.contains(str)) {
            throw new ClassNotFoundException(objectStreamClass.getName());
        }
        return super.resolveClass(objectStreamClass);
    }
}
