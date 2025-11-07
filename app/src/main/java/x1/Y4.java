package x1;

/* loaded from: classes.dex */
public enum Y4 implements P {
    zza("TYPE_UNKNOWN"),
    zzb("TYPE_CONTACT_INFO"),
    zzc("TYPE_EMAIL"),
    zzd("TYPE_ISBN"),
    zze("TYPE_PHONE"),
    zzf("TYPE_PRODUCT"),
    zzg("TYPE_SMS"),
    zzh("TYPE_TEXT"),
    zzi("TYPE_URL"),
    zzj("TYPE_WIFI"),
    zzk("TYPE_GEO"),
    zzl("TYPE_CALENDAR_EVENT"),
    zzm("TYPE_DRIVER_LICENSE");
    
    private final int zzo;

    Y4(String str) {
        this.zzo = r2;
    }

    @Override // x1.P
    public final int a() {
        return this.zzo;
    }
}
