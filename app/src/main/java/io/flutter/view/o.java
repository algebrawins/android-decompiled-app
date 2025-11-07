package io.flutter.view;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class o {
    private static final /* synthetic */ o[] $VALUES;
    public static final o LOCALE;
    public static final o SPELLOUT;
    public static final o URL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, io.flutter.view.o] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, io.flutter.view.o] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, io.flutter.view.o] */
    static {
        ?? r3 = new Enum("SPELLOUT", 0);
        SPELLOUT = r3;
        ?? r4 = new Enum("LOCALE", 1);
        LOCALE = r4;
        ?? r5 = new Enum("URL", 2);
        URL = r5;
        $VALUES = new o[]{r3, r4, r5};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }
}
