package w2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class M {
    private static final /* synthetic */ G2.a $ENTRIES;
    private static final /* synthetic */ M[] $VALUES;
    public static final L Companion;
    public static final M JSON_ENCODED;
    public static final M PLATFORM_ENCODED;
    public static final M UNEXPECTED_STRING;
    private final int raw;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, w2.L] */
    static {
        M m3 = new M(0, 0, "PLATFORM_ENCODED");
        PLATFORM_ENCODED = m3;
        M m4 = new M(1, 1, "JSON_ENCODED");
        JSON_ENCODED = m4;
        M m5 = new M(2, 2, "UNEXPECTED_STRING");
        UNEXPECTED_STRING = m5;
        M[] mArr = {m3, m4, m5};
        $VALUES = mArr;
        $ENTRIES = new G2.b(mArr);
        Companion = new Object();
    }

    public M(int r12, int r22, String str) {
        this.raw = r22;
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) $VALUES.clone();
    }

    public final int a() {
        return this.raw;
    }
}
