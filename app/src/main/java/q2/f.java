package q2;

import D.C;

/* loaded from: classes.dex */
public enum f {
    PORTRAIT_UP("DeviceOrientation.portraitUp"),
    PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
    LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
    LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");
    
    private String encodedName;

    f(String str) {
        this.encodedName = str;
    }

    public static f a(String str) {
        f[] values;
        for (f fVar : values()) {
            if (fVar.encodedName.equals(str)) {
                return fVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such DeviceOrientation: ", str));
    }
}
