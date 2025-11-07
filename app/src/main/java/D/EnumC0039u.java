package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: D.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0039u {
    private static final /* synthetic */ EnumC0039u[] $VALUES;
    public static final EnumC0039u INITIALIZED;
    public static final EnumC0039u INITIALIZING;
    public static final EnumC0039u INITIALIZING_ERROR;
    public static final EnumC0039u SHUTDOWN;
    public static final EnumC0039u UNINITIALIZED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, D.u] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, D.u] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, D.u] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, D.u] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, D.u] */
    static {
        ?? r5 = new Enum("UNINITIALIZED", 0);
        UNINITIALIZED = r5;
        ?? r6 = new Enum("INITIALIZING", 1);
        INITIALIZING = r6;
        ?? r7 = new Enum("INITIALIZING_ERROR", 2);
        INITIALIZING_ERROR = r7;
        ?? r8 = new Enum("INITIALIZED", 3);
        INITIALIZED = r8;
        ?? r9 = new Enum("SHUTDOWN", 4);
        SHUTDOWN = r9;
        $VALUES = new EnumC0039u[]{r5, r6, r7, r8, r9};
    }

    public static EnumC0039u valueOf(String str) {
        return (EnumC0039u) Enum.valueOf(EnumC0039u.class, str);
    }

    public static EnumC0039u[] values() {
        return (EnumC0039u[]) $VALUES.clone();
    }
}
