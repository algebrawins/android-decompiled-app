package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzc uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0190h1 {
    public static final EnumC0190h1 zza;
    public static final EnumC0190h1 zzb;
    public static final EnumC0190h1 zzc;
    public static final EnumC0190h1 zzd;
    public static final EnumC0190h1 zze;
    public static final EnumC0190h1 zzf;
    public static final EnumC0190h1 zzg;
    public static final EnumC0190h1 zzh;
    public static final EnumC0190h1 zzi;
    public static final EnumC0190h1 zzj;
    public static final EnumC0190h1 zzk;
    public static final EnumC0190h1 zzl;
    public static final EnumC0190h1 zzm;
    public static final EnumC0190h1 zzn;
    public static final EnumC0190h1 zzo;
    public static final EnumC0190h1 zzp;
    public static final EnumC0190h1 zzq;
    public static final EnumC0190h1 zzr;
    private static final /* synthetic */ EnumC0190h1[] zzs;
    private final i1 zzt;

    static {
        EnumC0190h1 enumC0190h1 = new EnumC0190h1("DOUBLE", 0, i1.DOUBLE);
        zza = enumC0190h1;
        EnumC0190h1 enumC0190h12 = new EnumC0190h1("FLOAT", 1, i1.FLOAT);
        zzb = enumC0190h12;
        i1 i1Var = i1.LONG;
        EnumC0190h1 enumC0190h13 = new EnumC0190h1("INT64", 2, i1Var);
        zzc = enumC0190h13;
        EnumC0190h1 enumC0190h14 = new EnumC0190h1("UINT64", 3, i1Var);
        zzd = enumC0190h14;
        i1 i1Var2 = i1.INT;
        EnumC0190h1 enumC0190h15 = new EnumC0190h1("INT32", 4, i1Var2);
        zze = enumC0190h15;
        EnumC0190h1 enumC0190h16 = new EnumC0190h1("FIXED64", 5, i1Var);
        zzf = enumC0190h16;
        EnumC0190h1 enumC0190h17 = new EnumC0190h1("FIXED32", 6, i1Var2);
        zzg = enumC0190h17;
        EnumC0190h1 enumC0190h18 = new EnumC0190h1("BOOL", 7, i1.BOOLEAN);
        zzh = enumC0190h18;
        EnumC0190h1 enumC0190h19 = new EnumC0190h1("STRING", 8, i1.STRING);
        zzi = enumC0190h19;
        i1 i1Var3 = i1.MESSAGE;
        EnumC0190h1 enumC0190h110 = new EnumC0190h1("GROUP", 9, i1Var3);
        zzj = enumC0190h110;
        EnumC0190h1 enumC0190h111 = new EnumC0190h1("MESSAGE", 10, i1Var3);
        zzk = enumC0190h111;
        EnumC0190h1 enumC0190h112 = new EnumC0190h1("BYTES", 11, i1.BYTE_STRING);
        zzl = enumC0190h112;
        EnumC0190h1 enumC0190h113 = new EnumC0190h1("UINT32", 12, i1Var2);
        zzm = enumC0190h113;
        EnumC0190h1 enumC0190h114 = new EnumC0190h1("ENUM", 13, i1.ENUM);
        zzn = enumC0190h114;
        EnumC0190h1 enumC0190h115 = new EnumC0190h1("SFIXED32", 14, i1Var2);
        zzo = enumC0190h115;
        EnumC0190h1 enumC0190h116 = new EnumC0190h1("SFIXED64", 15, i1Var);
        zzp = enumC0190h116;
        EnumC0190h1 enumC0190h117 = new EnumC0190h1("SINT32", 16, i1Var2);
        zzq = enumC0190h117;
        EnumC0190h1 enumC0190h118 = new EnumC0190h1("SINT64", 17, i1Var);
        zzr = enumC0190h118;
        zzs = new EnumC0190h1[]{enumC0190h1, enumC0190h12, enumC0190h13, enumC0190h14, enumC0190h15, enumC0190h16, enumC0190h17, enumC0190h18, enumC0190h19, enumC0190h110, enumC0190h111, enumC0190h112, enumC0190h113, enumC0190h114, enumC0190h115, enumC0190h116, enumC0190h117, enumC0190h118};
    }

    public EnumC0190h1(String str, int r22, i1 i1Var) {
        this.zzt = i1Var;
    }

    public static EnumC0190h1[] values() {
        return (EnumC0190h1[]) zzs.clone();
    }

    public final i1 a() {
        return this.zzt;
    }
}
