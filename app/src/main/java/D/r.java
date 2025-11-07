package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r CLOSED;
    public static final r CLOSING;
    public static final r OPEN;
    public static final r OPENING;
    public static final r PENDING_OPEN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, D.r] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, D.r] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, D.r] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, D.r] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, D.r] */
    static {
        ?? r5 = new Enum("PENDING_OPEN", 0);
        PENDING_OPEN = r5;
        ?? r6 = new Enum("OPENING", 1);
        OPENING = r6;
        ?? r7 = new Enum("OPEN", 2);
        OPEN = r7;
        ?? r8 = new Enum("CLOSING", 3);
        CLOSING = r8;
        ?? r9 = new Enum("CLOSED", 4);
        CLOSED = r9;
        $VALUES = new r[]{r5, r6, r7, r8, r9};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }
}
