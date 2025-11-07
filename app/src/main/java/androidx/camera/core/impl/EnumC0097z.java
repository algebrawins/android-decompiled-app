package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0097z {
    private static final /* synthetic */ EnumC0097z[] $VALUES;
    public static final EnumC0097z ALWAYS_OVERRIDE;
    public static final EnumC0097z OPTIONAL;
    public static final EnumC0097z REQUIRED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, androidx.camera.core.impl.z] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, androidx.camera.core.impl.z] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, androidx.camera.core.impl.z] */
    static {
        ?? r3 = new Enum("ALWAYS_OVERRIDE", 0);
        ALWAYS_OVERRIDE = r3;
        ?? r4 = new Enum("REQUIRED", 1);
        REQUIRED = r4;
        ?? r5 = new Enum("OPTIONAL", 2);
        OPTIONAL = r5;
        $VALUES = new EnumC0097z[]{r3, r4, r5};
    }

    public static EnumC0097z valueOf(String str) {
        return (EnumC0097z) Enum.valueOf(EnumC0097z.class, str);
    }

    public static EnumC0097z[] values() {
        return (EnumC0097z[]) $VALUES.clone();
    }
}
