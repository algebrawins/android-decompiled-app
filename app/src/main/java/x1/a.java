package X1;

import C1.j;
import Q1.n;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import k1.C0340h;
import k1.w;
import o.e;
import y1.C0835h3;
import y1.EnumC0799b3;
import y1.EnumC0829g3;
import y1.EnumC0859m3;
import y1.O4;
import y1.Q4;
import y1.S4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public volatile Bitmap f1582a;

    /* renamed from: b  reason: collision with root package name */
    public volatile A.a f1583b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1584c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1585d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1586e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1587f;

    public a(Bitmap bitmap) {
        w.e(bitmap);
        this.f1582a = bitmap;
        this.f1584c = bitmap.getWidth();
        this.f1585d = bitmap.getHeight();
        b(0);
        this.f1586e = 0;
        this.f1587f = -1;
    }

    public static void b(int r22) {
        boolean z3 = true;
        if (r22 != 0 && r22 != 90 && r22 != 180 && r22 != 270) {
            z3 = false;
        }
        w.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z3);
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [x1.v4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [w2.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, y1.L4] */
    /* JADX WARN: Type inference failed for: r6v4, types: [p.t0, java.lang.Object] */
    public static void c(int r15, int r16, long j3, int r19, int r20, int r21, int r22) {
        O4 a4;
        long j4;
        EnumC0799b3 enumC0799b3;
        EnumC0829g3 enumC0829g3;
        String a5;
        synchronized (Q4.class) {
            byte b3 = (byte) (((byte) 1) | 2);
            if (b3 == 3) {
                a4 = Q4.a(new Object());
            } else {
                StringBuilder sb = new StringBuilder();
                if ((b3 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b3 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j3;
        EnumC0859m3 enumC0859m3 = EnumC0859m3.zzbA;
        a4.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = a4.f6282i;
        if (hashMap.get(enumC0859m3) == null) {
            j4 = elapsedRealtime;
        } else {
            j4 = elapsedRealtime;
            if (elapsedRealtime2 - ((Long) hashMap.get(enumC0859m3)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return;
            }
        }
        hashMap.put(enumC0859m3, Long.valueOf(elapsedRealtime2));
        ?? obj = new Object();
        if (r15 != -1) {
            if (r15 != 35) {
                if (r15 != 842094169) {
                    if (r15 != 16) {
                        if (r15 != 17) {
                            enumC0799b3 = EnumC0799b3.zza;
                        } else {
                            enumC0799b3 = EnumC0799b3.zzc;
                        }
                    } else {
                        enumC0799b3 = EnumC0799b3.zzb;
                    }
                } else {
                    enumC0799b3 = EnumC0799b3.zzd;
                }
            } else {
                enumC0799b3 = EnumC0799b3.zze;
            }
        } else {
            enumC0799b3 = EnumC0799b3.zzg;
        }
        obj.f4720c = enumC0799b3;
        if (r16 != 1) {
            if (r16 != 2) {
                if (r16 != 3) {
                    if (r16 != 4) {
                        enumC0829g3 = EnumC0829g3.zzf;
                    } else {
                        enumC0829g3 = EnumC0829g3.zze;
                    }
                } else {
                    enumC0829g3 = EnumC0829g3.zzd;
                }
            } else {
                enumC0829g3 = EnumC0829g3.zzc;
            }
        } else {
            enumC0829g3 = EnumC0829g3.zzb;
        }
        obj.f4719b = enumC0829g3;
        obj.f4721d = Integer.valueOf(r21 & Integer.MAX_VALUE);
        obj.f4723f = Integer.valueOf(r19 & Integer.MAX_VALUE);
        obj.f4722e = Integer.valueOf(r20 & Integer.MAX_VALUE);
        obj.f4718a = Long.valueOf(Long.MAX_VALUE & j4);
        obj.g = Integer.valueOf(r22 & Integer.MAX_VALUE);
        C0835h3 c0835h3 = new C0835h3(obj);
        ?? obj2 = new Object();
        obj2.f5403L = c0835h3;
        ?? obj3 = new Object();
        obj3.f6109K = new Object();
        obj3.f6108J = obj2;
        S4.b();
        j jVar = a4.f6279e;
        if (jVar.f()) {
            a5 = (String) jVar.d();
        } else {
            a5 = C0340h.f4039c.a(a4.g);
        }
        n.zza.execute(new e(a4, obj3, enumC0859m3, a5, 2));
    }

    public final Image.Plane[] a() {
        if (this.f1583b == null) {
            return null;
        }
        return ((Image) this.f1583b.f1K).getPlanes();
    }

    public a(Image image, int r4, int r5, int r6) {
        this.f1583b = new A.a(22, image);
        this.f1584c = r4;
        this.f1585d = r5;
        b(r6);
        this.f1586e = r6;
        this.f1587f = 35;
    }
}
