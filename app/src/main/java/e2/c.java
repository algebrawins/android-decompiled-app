package e2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ G2.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c NORMAL;
    public static final c NO_DUPLICATES;
    public static final c UNRESTRICTED;
    private final int intValue;

    static {
        c cVar = new c(0, 0, "NO_DUPLICATES");
        NO_DUPLICATES = cVar;
        c cVar2 = new c(1, 1, "NORMAL");
        NORMAL = cVar2;
        c cVar3 = new c(2, 2, "UNRESTRICTED");
        UNRESTRICTED = cVar3;
        c[] cVarArr = {cVar, cVar2, cVar3};
        $VALUES = cVarArr;
        $ENTRIES = new G2.b(cVarArr);
    }

    public c(int r12, int r22, String str) {
        this.intValue = r22;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
