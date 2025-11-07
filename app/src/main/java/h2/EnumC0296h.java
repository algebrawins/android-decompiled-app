package h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0296h {
    private static final /* synthetic */ EnumC0296h[] $VALUES;
    public static final EnumC0296h opaque;
    public static final EnumC0296h transparent;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, h2.h] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, h2.h] */
    static {
        ?? r22 = new Enum("opaque", 0);
        opaque = r22;
        ?? r3 = new Enum("transparent", 1);
        transparent = r3;
        $VALUES = new EnumC0296h[]{r22, r3};
    }

    public static EnumC0296h valueOf(String str) {
        return (EnumC0296h) Enum.valueOf(EnumC0296h.class, str);
    }

    public static EnumC0296h[] values() {
        return (EnumC0296h[]) $VALUES.clone();
    }
}
