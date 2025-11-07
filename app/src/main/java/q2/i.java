package q2;

import D.C;

/* loaded from: classes.dex */
public enum i {
    LEAN_BACK("SystemUiMode.leanBack"),
    IMMERSIVE("SystemUiMode.immersive"),
    IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
    EDGE_TO_EDGE("SystemUiMode.edgeToEdge");
    
    private String encodedName;

    i(String str) {
        this.encodedName = str;
    }

    public static i a(String str) {
        i[] values;
        for (i iVar : values()) {
            if (iVar.encodedName.equals(str)) {
                return iVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such SystemUiMode: ", str));
    }
}
