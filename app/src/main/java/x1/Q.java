package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class Q {
    public static final Q zza;
    public static final Q zzb;
    public static final Q zzc;
    private static final /* synthetic */ Q[] zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, x1.Q] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, x1.Q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, x1.Q] */
    static {
        ?? r3 = new Enum("DEFAULT", 0);
        zza = r3;
        ?? r4 = new Enum("SIGNED", 1);
        zzb = r4;
        ?? r5 = new Enum("FIXED", 2);
        zzc = r5;
        zzd = new Q[]{r3, r4, r5};
    }

    public static Q[] values() {
        return (Q[]) zzd.clone();
    }
}
