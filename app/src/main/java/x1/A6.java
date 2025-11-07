package x1;

/* loaded from: classes.dex */
public enum A6 implements P {
    zza("UNRECOGNIZED"),
    zzb("CODE_128"),
    zzc("CODE_39"),
    zzd("CODE_93"),
    zze("CODABAR"),
    zzf("DATA_MATRIX"),
    zzg("EAN_13"),
    zzh("EAN_8"),
    zzi("ITF"),
    zzj("QR_CODE"),
    zzk("UPC_A"),
    zzl("UPC_E"),
    zzm("PDF417"),
    zzn("AZTEC"),
    zzo("DATABAR"),
    zzp("TEZ_CODE");
    
    private final int zzr;

    A6(String str) {
        this.zzr = r2;
    }

    @Override // x1.P
    public final int a() {
        return this.zzr;
    }
}
