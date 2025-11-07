package androidx.preference;

import android.content.res.TypedArray;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r5v5, types: [R1.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903182(0x7f03008e, float:1.7413175E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = X.b.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = x0.AbstractC0561b.f5483c
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = r4.getBoolean(r2, r2)
            boolean r5 = r4.getBoolean(r2, r5)
            if (r5 == 0) goto L2d
            R1.a r5 = R1.a.f1155J
            if (r5 != 0) goto L29
            R1.a r5 = new R1.a
            r5.<init>()
            R1.a.f1155J = r5
        L29:
            R1.a r5 = R1.a.f1155J
            r3.f2503P = r5
        L2d:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final Object c(TypedArray typedArray, int r22) {
        return typedArray.getString(r22);
    }
}
