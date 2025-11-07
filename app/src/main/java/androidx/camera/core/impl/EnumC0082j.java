package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.camera.core.impl.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0082j {
    private static final /* synthetic */ EnumC0082j[] $VALUES;
    public static final EnumC0082j ERROR;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, androidx.camera.core.impl.j] */
    static {
        ?? r12 = new Enum("ERROR", 0);
        ERROR = r12;
        $VALUES = new EnumC0082j[]{r12};
    }

    public static EnumC0082j valueOf(String str) {
        return (EnumC0082j) Enum.valueOf(EnumC0082j.class, str);
    }

    public static EnumC0082j[] values() {
        return (EnumC0082j[]) $VALUES.clone();
    }
}
