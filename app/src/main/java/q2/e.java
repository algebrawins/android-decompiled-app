package q2;

import D.C;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ e[] $VALUES;
    public static final e PLAIN_TEXT;
    private String encodedName;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, q2.e] */
    static {
        ?? r12 = new Enum("PLAIN_TEXT", 0);
        ((e) r12).encodedName = "text/plain";
        PLAIN_TEXT = r12;
        $VALUES = new e[]{r12};
    }

    public static e a(String str) {
        e[] values;
        for (e eVar : values()) {
            if (eVar.encodedName.equals(str)) {
                return eVar;
            }
        }
        throw new NoSuchFieldException(C.I("No such ClipboardContentFormat: ", str));
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
