package y1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: y1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0801c {
    public static final EnumC0801c zza;
    public static final EnumC0801c zzb;
    public static final EnumC0801c zzc;
    private static final /* synthetic */ EnumC0801c[] zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, y1.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, y1.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, y1.c] */
    static {
        ?? r3 = new Enum("DEFAULT", 0);
        zza = r3;
        ?? r4 = new Enum("SIGNED", 1);
        zzb = r4;
        ?? r5 = new Enum("FIXED", 2);
        zzc = r5;
        zzd = new EnumC0801c[]{r3, r4, r5};
    }

    public static EnumC0801c[] values() {
        return (EnumC0801c[]) zzd.clone();
    }
}
