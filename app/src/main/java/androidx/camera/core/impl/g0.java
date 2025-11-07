package androidx.camera.core.impl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g0 {
    private static final /* synthetic */ g0[] $VALUES;
    public static final g0 JPEG;
    public static final g0 PRIV;
    public static final g0 RAW;
    public static final g0 YUV;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [androidx.camera.core.impl.g0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.camera.core.impl.g0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.camera.core.impl.g0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.camera.core.impl.g0, java.lang.Enum] */
    static {
        ?? r4 = new Enum("PRIV", 0);
        PRIV = r4;
        ?? r5 = new Enum("YUV", 1);
        YUV = r5;
        ?? r6 = new Enum("JPEG", 2);
        JPEG = r6;
        ?? r7 = new Enum("RAW", 3);
        RAW = r7;
        $VALUES = new g0[]{r4, r5, r6, r7};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) $VALUES.clone();
    }
}
