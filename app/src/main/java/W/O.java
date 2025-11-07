package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class O {
    private static final /* synthetic */ O[] $VALUES;
    public static final O CLOSED;
    public static final O GET_SURFACE;
    public static final O INITIALIZED;
    public static final O OPENED;
    public static final O OPENING;
    public static final O RELEASED;
    public static final O RELEASING;
    public static final O UNINITIALIZED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, w.O] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, w.O] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, w.O] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, w.O] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, w.O] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, w.O] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Enum, w.O] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, w.O] */
    static {
        ?? r8 = new Enum("UNINITIALIZED", 0);
        UNINITIALIZED = r8;
        ?? r9 = new Enum("INITIALIZED", 1);
        INITIALIZED = r9;
        ?? r10 = new Enum("GET_SURFACE", 2);
        GET_SURFACE = r10;
        ?? r11 = new Enum("OPENING", 3);
        OPENING = r11;
        ?? r12 = new Enum("OPENED", 4);
        OPENED = r12;
        ?? r13 = new Enum("CLOSED", 5);
        CLOSED = r13;
        ?? r14 = new Enum("RELEASING", 6);
        RELEASING = r14;
        ?? r15 = new Enum("RELEASED", 7);
        RELEASED = r15;
        $VALUES = new O[]{r8, r9, r10, r11, r12, r13, r14, r15};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) $VALUES.clone();
    }
}
