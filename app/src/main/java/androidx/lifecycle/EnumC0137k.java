package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0137k {
    private static final /* synthetic */ EnumC0137k[] $VALUES;
    public static final i Companion;
    public static final EnumC0137k ON_ANY;
    public static final EnumC0137k ON_CREATE;
    public static final EnumC0137k ON_DESTROY;
    public static final EnumC0137k ON_PAUSE;
    public static final EnumC0137k ON_RESUME;
    public static final EnumC0137k ON_START;
    public static final EnumC0137k ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.lifecycle.i] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.k] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.k] */
    static {
        ?? r7 = new Enum("ON_CREATE", 0);
        ON_CREATE = r7;
        ?? r8 = new Enum("ON_START", 1);
        ON_START = r8;
        ?? r9 = new Enum("ON_RESUME", 2);
        ON_RESUME = r9;
        ?? r10 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r10;
        ?? r11 = new Enum("ON_STOP", 4);
        ON_STOP = r11;
        ?? r12 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r12;
        ?? r13 = new Enum("ON_ANY", 6);
        ON_ANY = r13;
        $VALUES = new EnumC0137k[]{r7, r8, r9, r10, r11, r12, r13};
        Companion = new Object();
    }

    public static EnumC0137k valueOf(String str) {
        return (EnumC0137k) Enum.valueOf(EnumC0137k.class, str);
    }

    public static EnumC0137k[] values() {
        return (EnumC0137k[]) $VALUES.clone();
    }

    public final l a() {
        switch (AbstractC0136j.f2461a[ordinal()]) {
            case 1:
            case 2:
                return l.CREATED;
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
            case 4:
                return l.STARTED;
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                return l.RESUMED;
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return l.DESTROYED;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
