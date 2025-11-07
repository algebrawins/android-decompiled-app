package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0084l {
    private static final /* synthetic */ EnumC0084l[] $VALUES;
    public static final EnumC0084l INACTIVE;
    public static final EnumC0084l LOCKED_FOCUSED;
    public static final EnumC0084l LOCKED_NOT_FOCUSED;
    public static final EnumC0084l PASSIVE_FOCUSED;
    public static final EnumC0084l PASSIVE_NOT_FOCUSED;
    public static final EnumC0084l SCANNING;
    public static final EnumC0084l UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.camera.core.impl.l] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.camera.core.impl.l] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, androidx.camera.core.impl.l] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, androidx.camera.core.impl.l] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, androidx.camera.core.impl.l] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.camera.core.impl.l] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.camera.core.impl.l] */
    static {
        ?? r7 = new Enum("UNKNOWN", 0);
        UNKNOWN = r7;
        ?? r8 = new Enum("INACTIVE", 1);
        INACTIVE = r8;
        ?? r9 = new Enum("SCANNING", 2);
        SCANNING = r9;
        ?? r10 = new Enum("PASSIVE_FOCUSED", 3);
        PASSIVE_FOCUSED = r10;
        ?? r11 = new Enum("PASSIVE_NOT_FOCUSED", 4);
        PASSIVE_NOT_FOCUSED = r11;
        ?? r12 = new Enum("LOCKED_FOCUSED", 5);
        LOCKED_FOCUSED = r12;
        ?? r13 = new Enum("LOCKED_NOT_FOCUSED", 6);
        LOCKED_NOT_FOCUSED = r13;
        $VALUES = new EnumC0084l[]{r7, r8, r9, r10, r11, r12, r13};
    }

    public static EnumC0084l valueOf(String str) {
        return (EnumC0084l) Enum.valueOf(EnumC0084l.class, str);
    }

    public static EnumC0084l[] values() {
        return (EnumC0084l[]) $VALUES.clone();
    }
}
