package V2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: V2.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0065w {
    private static final /* synthetic */ EnumC0065w[] $VALUES;
    public static final EnumC0065w ATOMIC;
    public static final EnumC0065w DEFAULT;
    public static final EnumC0065w LAZY;
    public static final EnumC0065w UNDISPATCHED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [V2.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [V2.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [V2.w, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [V2.w, java.lang.Enum] */
    static {
        ?? r4 = new Enum("DEFAULT", 0);
        DEFAULT = r4;
        ?? r5 = new Enum("LAZY", 1);
        LAZY = r5;
        ?? r6 = new Enum("ATOMIC", 2);
        ATOMIC = r6;
        ?? r7 = new Enum("UNDISPATCHED", 3);
        UNDISPATCHED = r7;
        $VALUES = new EnumC0065w[]{r4, r5, r6, r7};
    }

    public static EnumC0065w valueOf(String str) {
        return (EnumC0065w) Enum.valueOf(EnumC0065w.class, str);
    }

    public static EnumC0065w[] values() {
        return (EnumC0065w[]) $VALUES.clone();
    }
}
