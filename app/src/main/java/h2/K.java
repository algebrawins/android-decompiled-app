package h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class K {
    private static final /* synthetic */ K[] $VALUES;
    public static final K image;
    public static final K surface;
    public static final K texture;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, h2.K] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, h2.K] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, h2.K] */
    static {
        ?? r3 = new Enum("surface", 0);
        surface = r3;
        ?? r4 = new Enum("texture", 1);
        texture = r4;
        ?? r5 = new Enum("image", 2);
        image = r5;
        $VALUES = new K[]{r3, r4, r5};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) $VALUES.clone();
    }
}
