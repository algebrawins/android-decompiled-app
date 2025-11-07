package q2;

import D.C;

/* loaded from: classes.dex */
public enum w {
    TEXT("TextInputType.text"),
    DATETIME("TextInputType.datetime"),
    NAME("TextInputType.name"),
    POSTAL_ADDRESS("TextInputType.address"),
    NUMBER("TextInputType.number"),
    PHONE("TextInputType.phone"),
    MULTILINE("TextInputType.multiline"),
    EMAIL_ADDRESS("TextInputType.emailAddress"),
    URL("TextInputType.url"),
    VISIBLE_PASSWORD("TextInputType.visiblePassword"),
    NONE("TextInputType.none"),
    WEB_SEARCH("TextInputType.webSearch"),
    TWITTER("TextInputType.twitter");
    
    private final String encodedName;

    w(String str) {
        this.encodedName = str;
    }

    public static w a(String str) {
        w[] values;
        for (w wVar : values()) {
            if (wVar.encodedName.equals(str)) {
                return wVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such TextInputType: ", str));
    }
}
