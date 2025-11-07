package q2;

import D.C;

/* loaded from: classes.dex */
public enum j {
    TOP_OVERLAYS("SystemUiOverlay.top"),
    BOTTOM_OVERLAYS("SystemUiOverlay.bottom");
    
    private String encodedName;

    j(String str) {
        this.encodedName = str;
    }

    public static j a(String str) {
        j[] values;
        for (j jVar : values()) {
            if (jVar.encodedName.equals(str)) {
                return jVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such SystemUiOverlay: ", str));
    }
}
