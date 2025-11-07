package x1;

/* loaded from: classes.dex */
public enum M4 implements P {
    zza("TYPE_UNKNOWN"),
    zzb("TYPE_THIN"),
    zzc("TYPE_THICK"),
    zzd("TYPE_GMV");
    
    private final int zzf;

    M4(String str) {
        this.zzf = r2;
    }

    @Override // x1.P
    public final int a() {
        return this.zzf;
    }
}
