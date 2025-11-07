package io.flutter.plugins.imagepicker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: io.flutter.plugins.imagepicker.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0300a {
    private static final /* synthetic */ EnumC0300a[] $VALUES;
    public static final EnumC0300a IMAGE;
    public static final EnumC0300a VIDEO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Enum, io.flutter.plugins.imagepicker.a] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, io.flutter.plugins.imagepicker.a] */
    static {
        ?? r22 = new Enum("IMAGE", 0);
        IMAGE = r22;
        ?? r3 = new Enum("VIDEO", 1);
        VIDEO = r3;
        $VALUES = new EnumC0300a[]{r22, r3};
    }

    public static EnumC0300a valueOf(String str) {
        return (EnumC0300a) Enum.valueOf(EnumC0300a.class, str);
    }

    public static EnumC0300a[] values() {
        return (EnumC0300a[]) $VALUES.clone();
    }
}
