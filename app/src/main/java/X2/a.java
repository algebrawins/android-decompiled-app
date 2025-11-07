package X2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;
    public static final a DROP_LATEST;
    public static final a DROP_OLDEST;
    public static final a SUSPEND;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, X2.a] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, X2.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, X2.a] */
    static {
        ?? r3 = new Enum("SUSPEND", 0);
        SUSPEND = r3;
        ?? r4 = new Enum("DROP_OLDEST", 1);
        DROP_OLDEST = r4;
        ?? r5 = new Enum("DROP_LATEST", 2);
        DROP_LATEST = r5;
        $VALUES = new a[]{r3, r4, r5};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
