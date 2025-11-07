package h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class L {
    private static final /* synthetic */ L[] $VALUES;
    public static final L opaque;
    public static final L transparent;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, h2.L] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, h2.L] */
    static {
        ?? r22 = new Enum("opaque", 0);
        opaque = r22;
        ?? r3 = new Enum("transparent", 1);
        transparent = r3;
        $VALUES = new L[]{r22, r3};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) $VALUES.clone();
    }
}
