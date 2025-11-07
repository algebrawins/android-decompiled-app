package D;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class q0 {
    private static final /* synthetic */ q0[] $VALUES;
    public static final q0 ACTIVE;
    public static final q0 INACTIVE;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, D.q0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, D.q0] */
    static {
        ?? r22 = new Enum("ACTIVE", 0);
        ACTIVE = r22;
        ?? r3 = new Enum("INACTIVE", 1);
        INACTIVE = r3;
        $VALUES = new q0[]{r22, r3};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) $VALUES.clone();
    }
}
