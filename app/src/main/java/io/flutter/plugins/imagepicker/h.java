package io.flutter.plugins.imagepicker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ h[] $VALUES;
    public static final h FRONT;
    public static final h REAR;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [io.flutter.plugins.imagepicker.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [io.flutter.plugins.imagepicker.h, java.lang.Enum] */
    static {
        ?? r22 = new Enum("REAR", 0);
        REAR = r22;
        ?? r3 = new Enum("FRONT", 1);
        FRONT = r3;
        $VALUES = new h[]{r22, r3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
