package q2;

import D.C;

/* loaded from: classes.dex */
public enum g {
    STANDARD(null),
    LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
    MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
    HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
    SELECTION_CLICK("HapticFeedbackType.selectionClick");
    
    private final String encodedName;

    g(String str) {
        this.encodedName = str;
    }

    public static g a(String str) {
        g[] values;
        for (g gVar : values()) {
            String str2 = gVar.encodedName;
            if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                return gVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such HapticFeedbackType: ", str));
    }
}
