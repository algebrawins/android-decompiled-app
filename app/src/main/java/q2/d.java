package q2;

import D.C;

/* loaded from: classes.dex */
public enum d {
    LIGHT("Brightness.light"),
    DARK("Brightness.dark");
    
    private String encodedName;

    d(String str) {
        this.encodedName = str;
    }

    public static d a(String str) {
        d[] values;
        for (d dVar : values()) {
            if (dVar.encodedName.equals(str)) {
                return dVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such Brightness: ", str));
    }
}
