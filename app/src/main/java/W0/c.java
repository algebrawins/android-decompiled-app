package W0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ c[] $VALUES;
    public static final c FATAL_ERROR;
    public static final c OK;
    public static final c TRANSIENT_ERROR;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, W0.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, W0.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, W0.c] */
    static {
        ?? r3 = new Enum("OK", 0);
        OK = r3;
        ?? r4 = new Enum("TRANSIENT_ERROR", 1);
        TRANSIENT_ERROR = r4;
        ?? r5 = new Enum("FATAL_ERROR", 2);
        FATAL_ERROR = r5;
        $VALUES = new c[]{r3, r4, r5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
