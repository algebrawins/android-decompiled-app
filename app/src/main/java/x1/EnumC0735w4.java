package x1;

/* renamed from: x1.w4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0735w4 implements P {
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

    EnumC0735w4(String str) {
        this.zzl = r2;
    }

    @Override // x1.P
    public final int a() {
        return this.zzl;
    }
}
