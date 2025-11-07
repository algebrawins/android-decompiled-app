package q2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b DETACHED;
    public static final b HIDDEN;
    public static final b INACTIVE;
    public static final b PAUSED;
    public static final b RESUMED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [q2.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [q2.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [q2.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r8v1, types: [q2.b, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [q2.b, java.lang.Enum] */
    static {
        ?? r5 = new Enum("DETACHED", 0);
        DETACHED = r5;
        ?? r6 = new Enum("RESUMED", 1);
        RESUMED = r6;
        ?? r7 = new Enum("INACTIVE", 2);
        INACTIVE = r7;
        ?? r8 = new Enum("HIDDEN", 3);
        HIDDEN = r8;
        ?? r9 = new Enum("PAUSED", 4);
        PAUSED = r9;
        $VALUES = new b[]{r5, r6, r7, r8, r9};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
