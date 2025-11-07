package q2;

import D.C;

/* loaded from: classes.dex */
public enum u {
    CHARACTERS("TextCapitalization.characters"),
    WORDS("TextCapitalization.words"),
    SENTENCES("TextCapitalization.sentences"),
    NONE("TextCapitalization.none");
    
    private final String encodedName;

    u(String str) {
        this.encodedName = str;
    }

    public static u a(String str) {
        u[] values;
        for (u uVar : values()) {
            if (uVar.encodedName.equals(str)) {
                return uVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such TextCapitalization: ", str));
    }
}
