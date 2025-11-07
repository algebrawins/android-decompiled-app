package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0083k {
    private static final /* synthetic */ EnumC0083k[] $VALUES;
    public static final EnumC0083k CONVERGED;
    public static final EnumC0083k FLASH_REQUIRED;
    public static final EnumC0083k INACTIVE;
    public static final EnumC0083k LOCKED;
    public static final EnumC0083k SEARCHING;
    public static final EnumC0083k UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.camera.core.impl.k] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.camera.core.impl.k] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, androidx.camera.core.impl.k] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.camera.core.impl.k] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.camera.core.impl.k] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.camera.core.impl.k] */
    static {
        ?? r6 = new Enum("UNKNOWN", 0);
        UNKNOWN = r6;
        ?? r7 = new Enum("INACTIVE", 1);
        INACTIVE = r7;
        ?? r8 = new Enum("SEARCHING", 2);
        SEARCHING = r8;
        ?? r9 = new Enum("FLASH_REQUIRED", 3);
        FLASH_REQUIRED = r9;
        ?? r10 = new Enum("CONVERGED", 4);
        CONVERGED = r10;
        ?? r11 = new Enum("LOCKED", 5);
        LOCKED = r11;
        $VALUES = new EnumC0083k[]{r6, r7, r8, r9, r10, r11};
    }

    public static EnumC0083k valueOf(String str) {
        return (EnumC0083k) Enum.valueOf(EnumC0083k.class, str);
    }

    public static EnumC0083k[] values() {
        return (EnumC0083k[]) $VALUES.clone();
    }
}
