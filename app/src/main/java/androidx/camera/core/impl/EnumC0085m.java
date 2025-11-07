package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0085m {
    private static final /* synthetic */ EnumC0085m[] $VALUES;
    public static final EnumC0085m CONVERGED;
    public static final EnumC0085m INACTIVE;
    public static final EnumC0085m LOCKED;
    public static final EnumC0085m METERING;
    public static final EnumC0085m UNKNOWN;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.camera.core.impl.m] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.camera.core.impl.m] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.camera.core.impl.m] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.camera.core.impl.m] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.camera.core.impl.m] */
    static {
        ?? r5 = new Enum("UNKNOWN", 0);
        UNKNOWN = r5;
        ?? r6 = new Enum("INACTIVE", 1);
        INACTIVE = r6;
        ?? r7 = new Enum("METERING", 2);
        METERING = r7;
        ?? r8 = new Enum("CONVERGED", 3);
        CONVERGED = r8;
        ?? r9 = new Enum("LOCKED", 4);
        LOCKED = r9;
        $VALUES = new EnumC0085m[]{r5, r6, r7, r8, r9};
    }

    public static EnumC0085m valueOf(String str) {
        return (EnumC0085m) Enum.valueOf(EnumC0085m.class, str);
    }

    public static EnumC0085m[] values() {
        return (EnumC0085m[]) $VALUES.clone();
    }
}
