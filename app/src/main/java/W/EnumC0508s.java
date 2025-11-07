package w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: w.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0508s {
    private static final /* synthetic */ EnumC0508s[] $VALUES;
    public static final EnumC0508s CLOSING;
    public static final EnumC0508s CONFIGURED;
    public static final EnumC0508s INITIALIZED;
    public static final EnumC0508s OPENED;
    public static final EnumC0508s OPENING;
    public static final EnumC0508s PENDING_OPEN;
    public static final EnumC0508s RELEASED;
    public static final EnumC0508s RELEASING;
    public static final EnumC0508s REOPENING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, w.s] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Enum, w.s] */
    static {
        ?? r9 = new Enum("INITIALIZED", 0);
        INITIALIZED = r9;
        ?? r10 = new Enum("PENDING_OPEN", 1);
        PENDING_OPEN = r10;
        ?? r11 = new Enum("OPENING", 2);
        OPENING = r11;
        ?? r12 = new Enum("OPENED", 3);
        OPENED = r12;
        ?? r13 = new Enum("CONFIGURED", 4);
        CONFIGURED = r13;
        ?? r14 = new Enum("CLOSING", 5);
        CLOSING = r14;
        ?? r15 = new Enum("REOPENING", 6);
        REOPENING = r15;
        ?? r3 = new Enum("RELEASING", 7);
        RELEASING = r3;
        ?? r22 = new Enum("RELEASED", 8);
        RELEASED = r22;
        $VALUES = new EnumC0508s[]{r9, r10, r11, r12, r13, r14, r15, r3, r22};
    }

    public static EnumC0508s valueOf(String str) {
        return (EnumC0508s) Enum.valueOf(EnumC0508s.class, str);
    }

    public static EnumC0508s[] values() {
        return (EnumC0508s[]) $VALUES.clone();
    }
}
