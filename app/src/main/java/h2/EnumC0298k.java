package h2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: h2.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0298k {
    private static final /* synthetic */ EnumC0298k[] $VALUES;
    public static final EnumC0298k background;
    public static final EnumC0298k overlay;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, h2.k] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, h2.k] */
    static {
        ?? r22 = new Enum("background", 0);
        background = r22;
        ?? r3 = new Enum("overlay", 1);
        overlay = r3;
        $VALUES = new EnumC0298k[]{r22, r3};
    }

    public static EnumC0298k valueOf(String str) {
        return (EnumC0298k) Enum.valueOf(EnumC0298k.class, str);
    }

    public static EnumC0298k[] values() {
        return (EnumC0298k[]) $VALUES.clone();
    }
}
