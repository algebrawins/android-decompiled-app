package m2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: m2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0353a {
    private static final /* synthetic */ EnumC0353a[] $VALUES;
    public static final EnumC0353a CLIP_PATH;
    public static final EnumC0353a CLIP_RECT;
    public static final EnumC0353a CLIP_RRECT;
    public static final EnumC0353a OPACITY;
    public static final EnumC0353a TRANSFORM;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, m2.a] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, m2.a] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, m2.a] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, m2.a] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, m2.a] */
    static {
        ?? r5 = new Enum("CLIP_RECT", 0);
        CLIP_RECT = r5;
        ?? r6 = new Enum("CLIP_RRECT", 1);
        CLIP_RRECT = r6;
        ?? r7 = new Enum("CLIP_PATH", 2);
        CLIP_PATH = r7;
        ?? r8 = new Enum("TRANSFORM", 3);
        TRANSFORM = r8;
        ?? r9 = new Enum("OPACITY", 4);
        OPACITY = r9;
        $VALUES = new EnumC0353a[]{r5, r6, r7, r8, r9};
    }

    public static EnumC0353a valueOf(String str) {
        return (EnumC0353a) Enum.valueOf(EnumC0353a.class, str);
    }

    public static EnumC0353a[] values() {
        return (EnumC0353a[]) $VALUES.clone();
    }
}
