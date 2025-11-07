package x1;

/* loaded from: classes.dex */
public enum X4 implements P {
    zza("FORMAT_UNKNOWN"),
    zzb("FORMAT_CODE_128"),
    zzc("FORMAT_CODE_39"),
    zzd("FORMAT_CODE_93"),
    zze("FORMAT_CODABAR"),
    zzf("FORMAT_DATA_MATRIX"),
    zzg("FORMAT_EAN_13"),
    zzh("FORMAT_EAN_8"),
    zzi("FORMAT_ITF"),
    zzj("FORMAT_QR_CODE"),
    zzk("FORMAT_UPC_A"),
    zzl("FORMAT_UPC_E"),
    zzm("FORMAT_PDF417"),
    zzn("FORMAT_AZTEC");
    
    private final int zzp;

    X4(String str) {
        this.zzp = r2;
    }

    @Override // x1.P
    public final int a() {
        return this.zzp;
    }
}
