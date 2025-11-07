package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class W {
    private static final /* synthetic */ W[] $VALUES;
    public static final W ERROR_CONVERSION;
    public static final W SUCCESS;
    public static final W UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, D.W] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, D.W] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, D.W] */
    static {
        ?? r3 = new Enum("UNKNOWN", 0);
        UNKNOWN = r3;
        ?? r4 = new Enum("SUCCESS", 1);
        SUCCESS = r4;
        ?? r5 = new Enum("ERROR_CONVERSION", 2);
        ERROR_CONVERSION = r5;
        $VALUES = new W[]{r3, r4, r5};
    }

    public static W valueOf(String str) {
        return (W) Enum.valueOf(W.class, str);
    }

    public static W[] values() {
        return (W[]) $VALUES.clone();
    }
}
