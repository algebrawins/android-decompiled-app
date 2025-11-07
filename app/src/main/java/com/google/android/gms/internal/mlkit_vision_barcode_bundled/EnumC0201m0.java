package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum zzb uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0201m0 {
    public static final EnumC0201m0 zza;
    public static final EnumC0201m0 zzb;
    public static final EnumC0201m0 zzc;
    public static final EnumC0201m0 zzd;
    public static final EnumC0201m0 zze;
    public static final EnumC0201m0 zzf;
    public static final EnumC0201m0 zzg;
    public static final EnumC0201m0 zzh;
    public static final EnumC0201m0 zzi;
    public static final EnumC0201m0 zzj;
    private static final /* synthetic */ EnumC0201m0[] zzk;
    private final Class zzl;
    private final Class zzm;
    private final Object zzn;

    static {
        EnumC0201m0 enumC0201m0 = new EnumC0201m0("VOID", 0, Void.class, Void.class, null);
        zza = enumC0201m0;
        Class cls = Integer.TYPE;
        EnumC0201m0 enumC0201m02 = new EnumC0201m0("INT", 1, cls, Integer.class, 0);
        zzb = enumC0201m02;
        EnumC0201m0 enumC0201m03 = new EnumC0201m0("LONG", 2, Long.TYPE, Long.class, 0L);
        zzc = enumC0201m03;
        EnumC0201m0 enumC0201m04 = new EnumC0201m0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        zzd = enumC0201m04;
        EnumC0201m0 enumC0201m05 = new EnumC0201m0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        zze = enumC0201m05;
        EnumC0201m0 enumC0201m06 = new EnumC0201m0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        zzf = enumC0201m06;
        EnumC0201m0 enumC0201m07 = new EnumC0201m0("STRING", 6, String.class, String.class, "");
        zzg = enumC0201m07;
        EnumC0201m0 enumC0201m08 = new EnumC0201m0("BYTE_STRING", 7, L.class, L.class, L.f2812K);
        zzh = enumC0201m08;
        EnumC0201m0 enumC0201m09 = new EnumC0201m0("ENUM", 8, cls, Integer.class, null);
        zzi = enumC0201m09;
        EnumC0201m0 enumC0201m010 = new EnumC0201m0("MESSAGE", 9, Object.class, Object.class, null);
        zzj = enumC0201m010;
        zzk = new EnumC0201m0[]{enumC0201m0, enumC0201m02, enumC0201m03, enumC0201m04, enumC0201m05, enumC0201m06, enumC0201m07, enumC0201m08, enumC0201m09, enumC0201m010};
    }

    public EnumC0201m0(String str, int r22, Class cls, Class cls2, Serializable serializable) {
        this.zzl = cls;
        this.zzm = cls2;
        this.zzn = serializable;
    }

    public static EnumC0201m0[] values() {
        return (EnumC0201m0[]) zzk.clone();
    }

    public final Class a() {
        return this.zzm;
    }
}
