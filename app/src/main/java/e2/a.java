package E2;

import G2.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ G2.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a COROUTINE_SUSPENDED;
    public static final a RESUMED;
    public static final a UNDECIDED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [E2.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v1, types: [E2.a, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [E2.a, java.lang.Enum] */
    static {
        ?? r3 = new Enum("COROUTINE_SUSPENDED", 0);
        COROUTINE_SUSPENDED = r3;
        ?? r4 = new Enum("UNDECIDED", 1);
        UNDECIDED = r4;
        ?? r5 = new Enum("RESUMED", 2);
        RESUMED = r5;
        a[] aVarArr = {r3, r4, r5};
        $VALUES = aVarArr;
        $ENTRIES = new b(aVarArr);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
