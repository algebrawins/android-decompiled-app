package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l CREATED;
    public static final l DESTROYED;
    public static final l INITIALIZED;
    public static final l RESUMED;
    public static final l STARTED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.lifecycle.l] */
    static {
        ?? r5 = new Enum("DESTROYED", 0);
        DESTROYED = r5;
        ?? r6 = new Enum("INITIALIZED", 1);
        INITIALIZED = r6;
        ?? r7 = new Enum("CREATED", 2);
        CREATED = r7;
        ?? r8 = new Enum("STARTED", 3);
        STARTED = r8;
        ?? r9 = new Enum("RESUMED", 4);
        RESUMED = r9;
        $VALUES = new l[]{r5, r6, r7, r8, r9};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final boolean a(l lVar) {
        N2.g.e(lVar, "state");
        if (compareTo(lVar) >= 0) {
            return true;
        }
        return false;
    }
}
