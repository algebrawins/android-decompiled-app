package G;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k IDLE;
    public static final k QUEUED;
    public static final k QUEUING;
    public static final k RUNNING;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Enum, G.k] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, G.k] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, G.k] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, G.k] */
    static {
        ?? r4 = new Enum("IDLE", 0);
        IDLE = r4;
        ?? r5 = new Enum("QUEUING", 1);
        QUEUING = r5;
        ?? r6 = new Enum("QUEUED", 2);
        QUEUED = r6;
        ?? r7 = new Enum("RUNNING", 3);
        RUNNING = r7;
        $VALUES = new k[]{r4, r5, r6, r7};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
