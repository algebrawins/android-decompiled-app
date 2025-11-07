package q2;

import D.C;

/* loaded from: classes.dex */
public enum h {
    CLICK("SystemSoundType.click"),
    ALERT("SystemSoundType.alert");
    
    private final String encodedName;

    h(String str) {
        this.encodedName = str;
    }

    public static h a(String str) {
        h[] values;
        for (h hVar : values()) {
            if (hVar.encodedName.equals(str)) {
                return hVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such SoundType: ", str));
    }
}
