package y1;

/* renamed from: y1.b3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0799b3 implements InterfaceC0795b {
    zza("UNKNOWN_FORMAT"),
    zzb("NV16"),
    zzc("NV21"),
    zzd("YV12"),
    zze("YUV_420_888"),
    zzf("JPEG"),
    zzg("BITMAP"),
    zzh("CM_SAMPLE_BUFFER_REF"),
    zzi("UI_IMAGE"),
    zzj("CV_PIXEL_BUFFER_REF");
    
    private final int zzl;

    EnumC0799b3(String str) {
        this.zzl = r2;
    }

    @Override // y1.InterfaceC0795b
    public final int a() {
        return this.zzl;
    }
}
