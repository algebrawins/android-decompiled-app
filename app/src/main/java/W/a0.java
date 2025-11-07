package w;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.C0074a;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0080g;
import androidx.camera.core.impl.C0081h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k0.C0322i;
import x.C0551f;
import x.C0559n;
import x1.AbstractC0624h4;

/* loaded from: classes.dex */
public final class a0 {
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final O1.a f5107h;

    /* renamed from: i  reason: collision with root package name */
    public final C0559n f5108i;

    /* renamed from: j  reason: collision with root package name */
    public final A.c f5109j;

    /* renamed from: k  reason: collision with root package name */
    public final int f5110k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5111l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f5112m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f5113n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f5114o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f5115p;

    /* renamed from: q  reason: collision with root package name */
    public C0081h f5116q;

    /* renamed from: s  reason: collision with root package name */
    public final S f5118s;

    /* renamed from: v  reason: collision with root package name */
    public final B0.e f5121v;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5101a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5102b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5103c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f5104d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f5105e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f5106f = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final ArrayList f5117r = new ArrayList();

    /* renamed from: t  reason: collision with root package name */
    public final R1.a f5119t = new Object();

    /* renamed from: u  reason: collision with root package name */
    public final A.a f5120u = new A.a(3);

    /* JADX WARN: Type inference failed for: r5v1, types: [R1.a, java.lang.Object] */
    public a0(Context context, String str, x.w wVar, O1.a aVar) {
        ArrayList arrayList;
        CameraCharacteristics.Key key;
        boolean z3;
        this.f5111l = false;
        this.f5112m = false;
        this.f5113n = false;
        this.f5114o = false;
        this.f5115p = false;
        str.getClass();
        this.g = str;
        aVar.getClass();
        this.f5107h = aVar;
        this.f5109j = new A.c(1);
        this.f5118s = S.b(context);
        try {
            C0559n b3 = wVar.b(str);
            this.f5108i = b3;
            Integer num = (Integer) b3.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            this.f5110k = num != null ? num.intValue() : 2;
            int[] r02 = (int[]) b3.a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (r02 != null) {
                for (int r7 : r02) {
                    if (r7 == 3) {
                        this.f5111l = true;
                    } else if (r7 == 6) {
                        this.f5112m = true;
                    } else if (Build.VERSION.SDK_INT >= 31 && r7 == 16) {
                        this.f5115p = true;
                    }
                }
            }
            B0.e eVar = new B0.e(this.f5108i);
            this.f5121v = eVar;
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            androidx.camera.core.impl.e0 e0Var = new androidx.camera.core.impl.e0();
            androidx.camera.core.impl.g0 g0Var = androidx.camera.core.impl.g0.PRIV;
            androidx.camera.core.impl.f0 f0Var = androidx.camera.core.impl.f0.MAXIMUM;
            e0Var.a(C0080g.a(g0Var, f0Var));
            arrayList3.add(e0Var);
            androidx.camera.core.impl.e0 e0Var2 = new androidx.camera.core.impl.e0();
            androidx.camera.core.impl.g0 g0Var2 = androidx.camera.core.impl.g0.JPEG;
            e0Var2.a(C0080g.a(g0Var2, f0Var));
            arrayList3.add(e0Var2);
            androidx.camera.core.impl.e0 e0Var3 = new androidx.camera.core.impl.e0();
            androidx.camera.core.impl.g0 g0Var3 = androidx.camera.core.impl.g0.YUV;
            e0Var3.a(C0080g.a(g0Var3, f0Var));
            arrayList3.add(e0Var3);
            androidx.camera.core.impl.e0 e0Var4 = new androidx.camera.core.impl.e0();
            androidx.camera.core.impl.f0 f0Var2 = androidx.camera.core.impl.f0.PREVIEW;
            e0Var4.a(new C0080g(g0Var, f0Var2, 0L));
            D.C.D(g0Var2, f0Var, 0L, e0Var4);
            androidx.camera.core.impl.e0 t3 = D.C.t(arrayList3, e0Var4);
            t3.a(new C0080g(g0Var3, f0Var2, 0L));
            D.C.D(g0Var2, f0Var, 0L, t3);
            androidx.camera.core.impl.e0 t4 = D.C.t(arrayList3, t3);
            t4.a(new C0080g(g0Var, f0Var2, 0L));
            D.C.D(g0Var, f0Var2, 0L, t4);
            androidx.camera.core.impl.e0 t5 = D.C.t(arrayList3, t4);
            t5.a(new C0080g(g0Var, f0Var2, 0L));
            D.C.D(g0Var3, f0Var2, 0L, t5);
            androidx.camera.core.impl.e0 t6 = D.C.t(arrayList3, t5);
            t6.a(new C0080g(g0Var, f0Var2, 0L));
            t6.a(new C0080g(g0Var3, f0Var2, 0L));
            D.C.D(g0Var2, f0Var, 0L, t6);
            arrayList3.add(t6);
            arrayList2.addAll(arrayList3);
            int r6 = this.f5110k;
            if (r6 == 0 || r6 == 1 || r6 == 3) {
                ArrayList arrayList4 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var5 = new androidx.camera.core.impl.e0();
                D.C.D(g0Var, f0Var2, 0L, e0Var5);
                androidx.camera.core.impl.f0 f0Var3 = androidx.camera.core.impl.f0.RECORD;
                D.C.D(g0Var, f0Var3, 0L, e0Var5);
                androidx.camera.core.impl.e0 t7 = D.C.t(arrayList4, e0Var5);
                t7.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var3, f0Var3, 0L, t7);
                androidx.camera.core.impl.e0 t8 = D.C.t(arrayList4, t7);
                t8.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var3, f0Var3, 0L, t8);
                androidx.camera.core.impl.e0 t9 = D.C.t(arrayList4, t8);
                t9.a(new C0080g(g0Var, f0Var2, 0L));
                t9.a(new C0080g(g0Var, f0Var3, 0L));
                D.C.D(g0Var2, f0Var3, 0L, t9);
                androidx.camera.core.impl.e0 t10 = D.C.t(arrayList4, t9);
                t10.a(new C0080g(g0Var, f0Var2, 0L));
                t10.a(new C0080g(g0Var3, f0Var3, 0L));
                D.C.D(g0Var2, f0Var3, 0L, t10);
                androidx.camera.core.impl.e0 t11 = D.C.t(arrayList4, t10);
                t11.a(new C0080g(g0Var3, f0Var2, 0L));
                t11.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var2, f0Var, 0L, t11);
                arrayList4.add(t11);
                arrayList2.addAll(arrayList4);
            }
            if (r6 == 1 || r6 == 3) {
                ArrayList arrayList5 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var6 = new androidx.camera.core.impl.e0();
                e0Var6.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var, f0Var, 0L, e0Var6);
                androidx.camera.core.impl.e0 t12 = D.C.t(arrayList5, e0Var6);
                t12.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t12);
                androidx.camera.core.impl.e0 t13 = D.C.t(arrayList5, t12);
                t13.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t13);
                androidx.camera.core.impl.e0 t14 = D.C.t(arrayList5, t13);
                t14.a(new C0080g(g0Var, f0Var2, 0L));
                t14.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var2, f0Var, 0L, t14);
                androidx.camera.core.impl.e0 t15 = D.C.t(arrayList5, t14);
                androidx.camera.core.impl.f0 f0Var4 = androidx.camera.core.impl.f0.VGA;
                t15.a(new C0080g(g0Var3, f0Var4, 0L));
                t15.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t15);
                androidx.camera.core.impl.e0 t16 = D.C.t(arrayList5, t15);
                t16.a(new C0080g(g0Var3, f0Var4, 0L));
                t16.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t16);
                arrayList5.add(t16);
                arrayList2.addAll(arrayList5);
            }
            if (this.f5111l) {
                ArrayList arrayList6 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var7 = new androidx.camera.core.impl.e0();
                androidx.camera.core.impl.g0 g0Var4 = androidx.camera.core.impl.g0.RAW;
                e0Var7.a(C0080g.a(g0Var4, f0Var));
                arrayList6.add(e0Var7);
                androidx.camera.core.impl.e0 e0Var8 = new androidx.camera.core.impl.e0();
                e0Var8.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var4, f0Var, 0L, e0Var8);
                androidx.camera.core.impl.e0 t17 = D.C.t(arrayList6, e0Var8);
                t17.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var4, f0Var, 0L, t17);
                androidx.camera.core.impl.e0 t18 = D.C.t(arrayList6, t17);
                t18.a(new C0080g(g0Var, f0Var2, 0L));
                t18.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var4, f0Var, 0L, t18);
                androidx.camera.core.impl.e0 t19 = D.C.t(arrayList6, t18);
                t19.a(new C0080g(g0Var, f0Var2, 0L));
                t19.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var4, f0Var, 0L, t19);
                androidx.camera.core.impl.e0 t20 = D.C.t(arrayList6, t19);
                t20.a(new C0080g(g0Var3, f0Var2, 0L));
                t20.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var4, f0Var, 0L, t20);
                androidx.camera.core.impl.e0 t21 = D.C.t(arrayList6, t20);
                t21.a(new C0080g(g0Var, f0Var2, 0L));
                t21.a(new C0080g(g0Var2, f0Var, 0L));
                D.C.D(g0Var4, f0Var, 0L, t21);
                androidx.camera.core.impl.e0 t22 = D.C.t(arrayList6, t21);
                t22.a(new C0080g(g0Var3, f0Var2, 0L));
                t22.a(new C0080g(g0Var2, f0Var, 0L));
                D.C.D(g0Var4, f0Var, 0L, t22);
                arrayList6.add(t22);
                arrayList2.addAll(arrayList6);
            }
            if (this.f5112m && r6 == 0) {
                ArrayList arrayList7 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var9 = new androidx.camera.core.impl.e0();
                e0Var9.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var, f0Var, 0L, e0Var9);
                androidx.camera.core.impl.e0 t23 = D.C.t(arrayList7, e0Var9);
                t23.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t23);
                androidx.camera.core.impl.e0 t24 = D.C.t(arrayList7, t23);
                t24.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t24);
                arrayList7.add(t24);
                arrayList2.addAll(arrayList7);
            }
            if (r6 == 3) {
                ArrayList arrayList8 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var10 = new androidx.camera.core.impl.e0();
                D.C.D(g0Var, f0Var2, 0L, e0Var10);
                androidx.camera.core.impl.f0 f0Var5 = androidx.camera.core.impl.f0.VGA;
                e0Var10.a(new C0080g(g0Var, f0Var5, 0L));
                D.C.D(g0Var3, f0Var, 0L, e0Var10);
                androidx.camera.core.impl.g0 g0Var5 = androidx.camera.core.impl.g0.RAW;
                e0Var10.a(C0080g.a(g0Var5, f0Var));
                arrayList8.add(e0Var10);
                androidx.camera.core.impl.e0 e0Var11 = new androidx.camera.core.impl.e0();
                e0Var11.a(new C0080g(g0Var, f0Var2, 0L));
                e0Var11.a(new C0080g(g0Var, f0Var5, 0L));
                e0Var11.a(new C0080g(g0Var2, f0Var, 0L));
                D.C.D(g0Var5, f0Var, 0L, e0Var11);
                arrayList8.add(e0Var11);
                arrayList2.addAll(arrayList8);
            }
            ArrayList arrayList9 = this.f5101a;
            arrayList9.addAll(arrayList2);
            if (((z.o) this.f5109j.f5K) == null) {
                arrayList = new ArrayList();
            } else {
                androidx.camera.core.impl.e0 e0Var12 = z.o.f6568a;
                String str2 = Build.DEVICE;
                boolean z4 = "heroqltevzw".equalsIgnoreCase(str2) || "heroqltetmo".equalsIgnoreCase(str2);
                androidx.camera.core.impl.e0 e0Var13 = z.o.f6568a;
                if (z4) {
                    ArrayList arrayList10 = new ArrayList();
                    arrayList = arrayList10;
                    if (this.g.equals("1")) {
                        arrayList10.add(e0Var13);
                        arrayList = arrayList10;
                    }
                } else {
                    String str3 = Build.BRAND;
                    if (!"samsung".equalsIgnoreCase(str3) ? false : z.o.f6571d.contains(Build.MODEL.toUpperCase(Locale.US))) {
                        ArrayList arrayList11 = new ArrayList();
                        arrayList = arrayList11;
                        if (r6 == 0) {
                            arrayList11.add(e0Var13);
                            arrayList11.add(z.o.f6569b);
                            arrayList = arrayList11;
                        }
                    } else if (!"google".equalsIgnoreCase(str3) ? false : z.o.f6572e.contains(Build.MODEL.toUpperCase(Locale.US))) {
                        arrayList = Collections.singletonList(z.o.f6570c);
                    } else {
                        arrayList = Collections.emptyList();
                    }
                }
            }
            arrayList9.addAll(arrayList);
            if (this.f5115p) {
                ArrayList arrayList12 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var14 = new androidx.camera.core.impl.e0();
                androidx.camera.core.impl.f0 f0Var6 = androidx.camera.core.impl.f0.ULTRA_MAXIMUM;
                e0Var14.a(new C0080g(g0Var3, f0Var6, 0L));
                D.C.D(g0Var, f0Var2, 0L, e0Var14);
                androidx.camera.core.impl.f0 f0Var7 = androidx.camera.core.impl.f0.RECORD;
                D.C.D(g0Var, f0Var7, 0L, e0Var14);
                androidx.camera.core.impl.e0 t25 = D.C.t(arrayList12, e0Var14);
                t25.a(new C0080g(g0Var2, f0Var6, 0L));
                t25.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var, f0Var7, 0L, t25);
                androidx.camera.core.impl.e0 t26 = D.C.t(arrayList12, t25);
                androidx.camera.core.impl.g0 g0Var6 = androidx.camera.core.impl.g0.RAW;
                t26.a(C0080g.a(g0Var6, f0Var6));
                t26.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var, f0Var7, 0L, t26);
                androidx.camera.core.impl.e0 t27 = D.C.t(arrayList12, t26);
                t27.a(new C0080g(g0Var3, f0Var6, 0L));
                t27.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var2, f0Var, 0L, t27);
                androidx.camera.core.impl.e0 t28 = D.C.t(arrayList12, t27);
                t28.a(new C0080g(g0Var2, f0Var6, 0L));
                t28.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var2, f0Var, 0L, t28);
                androidx.camera.core.impl.e0 t29 = D.C.t(arrayList12, t28);
                t29.a(new C0080g(g0Var6, f0Var6, 0L));
                t29.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var2, f0Var, 0L, t29);
                androidx.camera.core.impl.e0 t30 = D.C.t(arrayList12, t29);
                t30.a(new C0080g(g0Var3, f0Var6, 0L));
                t30.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t30);
                androidx.camera.core.impl.e0 t31 = D.C.t(arrayList12, t30);
                t31.a(new C0080g(g0Var2, f0Var6, 0L));
                t31.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t31);
                androidx.camera.core.impl.e0 t32 = D.C.t(arrayList12, t31);
                t32.a(new C0080g(g0Var6, f0Var6, 0L));
                t32.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t32);
                androidx.camera.core.impl.e0 t33 = D.C.t(arrayList12, t32);
                t33.a(new C0080g(g0Var3, f0Var6, 0L));
                t33.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var6, f0Var, 0L, t33);
                androidx.camera.core.impl.e0 t34 = D.C.t(arrayList12, t33);
                t34.a(new C0080g(g0Var2, f0Var6, 0L));
                t34.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var6, f0Var, 0L, t34);
                androidx.camera.core.impl.e0 t35 = D.C.t(arrayList12, t34);
                t35.a(new C0080g(g0Var6, f0Var6, 0L));
                t35.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var6, f0Var, 0L, t35);
                arrayList12.add(t35);
                this.f5102b.addAll(arrayList12);
            }
            boolean hasSystemFeature = context.getPackageManager().hasSystemFeature("android.hardware.camera.concurrent");
            this.f5113n = hasSystemFeature;
            if (hasSystemFeature) {
                ArrayList arrayList13 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var15 = new androidx.camera.core.impl.e0();
                androidx.camera.core.impl.f0 f0Var8 = androidx.camera.core.impl.f0.s1440p;
                D.C.D(g0Var3, f0Var8, 0L, e0Var15);
                androidx.camera.core.impl.e0 t36 = D.C.t(arrayList13, e0Var15);
                D.C.D(g0Var, f0Var8, 0L, t36);
                androidx.camera.core.impl.e0 t37 = D.C.t(arrayList13, t36);
                D.C.D(g0Var2, f0Var8, 0L, t37);
                androidx.camera.core.impl.e0 t38 = D.C.t(arrayList13, t37);
                androidx.camera.core.impl.f0 f0Var9 = androidx.camera.core.impl.f0.s720p;
                t38.a(new C0080g(g0Var3, f0Var9, 0L));
                D.C.D(g0Var2, f0Var8, 0L, t38);
                androidx.camera.core.impl.e0 t39 = D.C.t(arrayList13, t38);
                t39.a(new C0080g(g0Var, f0Var9, 0L));
                D.C.D(g0Var2, f0Var8, 0L, t39);
                androidx.camera.core.impl.e0 t40 = D.C.t(arrayList13, t39);
                t40.a(new C0080g(g0Var3, f0Var9, 0L));
                D.C.D(g0Var3, f0Var8, 0L, t40);
                androidx.camera.core.impl.e0 t41 = D.C.t(arrayList13, t40);
                t41.a(new C0080g(g0Var3, f0Var9, 0L));
                D.C.D(g0Var, f0Var8, 0L, t41);
                androidx.camera.core.impl.e0 t42 = D.C.t(arrayList13, t41);
                t42.a(new C0080g(g0Var, f0Var9, 0L));
                D.C.D(g0Var3, f0Var8, 0L, t42);
                androidx.camera.core.impl.e0 t43 = D.C.t(arrayList13, t42);
                t43.a(new C0080g(g0Var, f0Var9, 0L));
                D.C.D(g0Var, f0Var8, 0L, t43);
                arrayList13.add(t43);
                this.f5103c.addAll(arrayList13);
            }
            if (eVar.f184K) {
                ArrayList arrayList14 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var16 = new androidx.camera.core.impl.e0();
                D.C.D(g0Var, f0Var, 0L, e0Var16);
                androidx.camera.core.impl.e0 t44 = D.C.t(arrayList14, e0Var16);
                D.C.D(g0Var3, f0Var, 0L, t44);
                androidx.camera.core.impl.e0 t45 = D.C.t(arrayList14, t44);
                t45.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var2, f0Var, 0L, t45);
                androidx.camera.core.impl.e0 t46 = D.C.t(arrayList14, t45);
                t46.a(new C0080g(g0Var, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t46);
                androidx.camera.core.impl.e0 t47 = D.C.t(arrayList14, t46);
                t47.a(new C0080g(g0Var3, f0Var2, 0L));
                D.C.D(g0Var3, f0Var, 0L, t47);
                androidx.camera.core.impl.e0 t48 = D.C.t(arrayList14, t47);
                D.C.D(g0Var, f0Var2, 0L, t48);
                androidx.camera.core.impl.f0 f0Var10 = androidx.camera.core.impl.f0.RECORD;
                D.C.D(g0Var, f0Var10, 0L, t48);
                androidx.camera.core.impl.e0 t49 = D.C.t(arrayList14, t48);
                t49.a(new C0080g(g0Var, f0Var2, 0L));
                t49.a(new C0080g(g0Var, f0Var10, 0L));
                D.C.D(g0Var3, f0Var10, 0L, t49);
                androidx.camera.core.impl.e0 t50 = D.C.t(arrayList14, t49);
                t50.a(new C0080g(g0Var, f0Var2, 0L));
                t50.a(new C0080g(g0Var, f0Var10, 0L));
                D.C.D(g0Var2, f0Var10, 0L, t50);
                arrayList14.add(t50);
                this.f5105e.addAll(arrayList14);
            }
            C0559n c0559n = this.f5108i;
            C0076c c0076c = Y.f5094a;
            int r22 = Build.VERSION.SDK_INT;
            if (r22 >= 33) {
                key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                long[] jArr = (long[]) c0559n.a(key);
                if (jArr != null && jArr.length != 0) {
                    z3 = true;
                    this.f5114o = z3;
                    if (z3 && r22 >= 33) {
                        ArrayList arrayList15 = new ArrayList();
                        androidx.camera.core.impl.e0 e0Var17 = new androidx.camera.core.impl.e0();
                        androidx.camera.core.impl.f0 f0Var11 = androidx.camera.core.impl.f0.s1440p;
                        D.C.D(g0Var, f0Var11, 4L, e0Var17);
                        androidx.camera.core.impl.e0 t51 = D.C.t(arrayList15, e0Var17);
                        D.C.D(g0Var3, f0Var11, 4L, t51);
                        androidx.camera.core.impl.e0 t52 = D.C.t(arrayList15, t51);
                        androidx.camera.core.impl.f0 f0Var12 = androidx.camera.core.impl.f0.RECORD;
                        D.C.D(g0Var, f0Var12, 3L, t52);
                        androidx.camera.core.impl.e0 t53 = D.C.t(arrayList15, t52);
                        D.C.D(g0Var3, f0Var12, 3L, t53);
                        androidx.camera.core.impl.e0 t54 = D.C.t(arrayList15, t53);
                        D.C.D(g0Var2, f0Var, 2L, t54);
                        androidx.camera.core.impl.e0 t55 = D.C.t(arrayList15, t54);
                        D.C.D(g0Var3, f0Var, 2L, t55);
                        androidx.camera.core.impl.e0 t56 = D.C.t(arrayList15, t55);
                        t56.a(new C0080g(g0Var, f0Var2, 1L));
                        D.C.D(g0Var2, f0Var, 2L, t56);
                        androidx.camera.core.impl.e0 t57 = D.C.t(arrayList15, t56);
                        t57.a(new C0080g(g0Var, f0Var2, 1L));
                        D.C.D(g0Var3, f0Var, 2L, t57);
                        androidx.camera.core.impl.e0 t58 = D.C.t(arrayList15, t57);
                        t58.a(new C0080g(g0Var, f0Var2, 1L));
                        D.C.D(g0Var, f0Var12, 3L, t58);
                        androidx.camera.core.impl.e0 t59 = D.C.t(arrayList15, t58);
                        t59.a(new C0080g(g0Var, f0Var2, 1L));
                        D.C.D(g0Var3, f0Var12, 3L, t59);
                        androidx.camera.core.impl.e0 t60 = D.C.t(arrayList15, t59);
                        t60.a(new C0080g(g0Var, f0Var2, 1L));
                        D.C.D(g0Var3, f0Var2, 1L, t60);
                        androidx.camera.core.impl.e0 t61 = D.C.t(arrayList15, t60);
                        t61.a(new C0080g(g0Var, f0Var2, 1L));
                        t61.a(new C0080g(g0Var, f0Var12, 3L));
                        D.C.D(g0Var2, f0Var12, 2L, t61);
                        androidx.camera.core.impl.e0 t62 = D.C.t(arrayList15, t61);
                        t62.a(new C0080g(g0Var, f0Var2, 1L));
                        t62.a(new C0080g(g0Var3, f0Var12, 3L));
                        D.C.D(g0Var2, f0Var12, 2L, t62);
                        androidx.camera.core.impl.e0 t63 = D.C.t(arrayList15, t62);
                        t63.a(new C0080g(g0Var, f0Var2, 1L));
                        t63.a(new C0080g(g0Var3, f0Var2, 1L));
                        D.C.D(g0Var2, f0Var, 2L, t63);
                        arrayList15.add(t63);
                        this.f5106f.addAll(arrayList15);
                    }
                    b();
                }
            }
            z3 = false;
            this.f5114o = z3;
            if (z3) {
                ArrayList arrayList152 = new ArrayList();
                androidx.camera.core.impl.e0 e0Var172 = new androidx.camera.core.impl.e0();
                androidx.camera.core.impl.f0 f0Var112 = androidx.camera.core.impl.f0.s1440p;
                D.C.D(g0Var, f0Var112, 4L, e0Var172);
                androidx.camera.core.impl.e0 t512 = D.C.t(arrayList152, e0Var172);
                D.C.D(g0Var3, f0Var112, 4L, t512);
                androidx.camera.core.impl.e0 t522 = D.C.t(arrayList152, t512);
                androidx.camera.core.impl.f0 f0Var122 = androidx.camera.core.impl.f0.RECORD;
                D.C.D(g0Var, f0Var122, 3L, t522);
                androidx.camera.core.impl.e0 t532 = D.C.t(arrayList152, t522);
                D.C.D(g0Var3, f0Var122, 3L, t532);
                androidx.camera.core.impl.e0 t542 = D.C.t(arrayList152, t532);
                D.C.D(g0Var2, f0Var, 2L, t542);
                androidx.camera.core.impl.e0 t552 = D.C.t(arrayList152, t542);
                D.C.D(g0Var3, f0Var, 2L, t552);
                androidx.camera.core.impl.e0 t562 = D.C.t(arrayList152, t552);
                t562.a(new C0080g(g0Var, f0Var2, 1L));
                D.C.D(g0Var2, f0Var, 2L, t562);
                androidx.camera.core.impl.e0 t572 = D.C.t(arrayList152, t562);
                t572.a(new C0080g(g0Var, f0Var2, 1L));
                D.C.D(g0Var3, f0Var, 2L, t572);
                androidx.camera.core.impl.e0 t582 = D.C.t(arrayList152, t572);
                t582.a(new C0080g(g0Var, f0Var2, 1L));
                D.C.D(g0Var, f0Var122, 3L, t582);
                androidx.camera.core.impl.e0 t592 = D.C.t(arrayList152, t582);
                t592.a(new C0080g(g0Var, f0Var2, 1L));
                D.C.D(g0Var3, f0Var122, 3L, t592);
                androidx.camera.core.impl.e0 t602 = D.C.t(arrayList152, t592);
                t602.a(new C0080g(g0Var, f0Var2, 1L));
                D.C.D(g0Var3, f0Var2, 1L, t602);
                androidx.camera.core.impl.e0 t612 = D.C.t(arrayList152, t602);
                t612.a(new C0080g(g0Var, f0Var2, 1L));
                t612.a(new C0080g(g0Var, f0Var122, 3L));
                D.C.D(g0Var2, f0Var122, 2L, t612);
                androidx.camera.core.impl.e0 t622 = D.C.t(arrayList152, t612);
                t622.a(new C0080g(g0Var, f0Var2, 1L));
                t622.a(new C0080g(g0Var3, f0Var122, 3L));
                D.C.D(g0Var2, f0Var122, 2L, t622);
                androidx.camera.core.impl.e0 t632 = D.C.t(arrayList152, t622);
                t632.a(new C0080g(g0Var, f0Var2, 1L));
                t632.a(new C0080g(g0Var3, f0Var2, 1L));
                D.C.D(g0Var2, f0Var, 2L, t632);
                arrayList152.add(t632);
                this.f5106f.addAll(arrayList152);
            }
            b();
        } catch (C0551f e4) {
            throw new Exception(e4);
        }
    }

    public static Size c(StreamConfigurationMap streamConfigurationMap, int r7, boolean z3) {
        Size[] outputSizes;
        Size[] a4;
        if (r7 == 34) {
            outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        } else {
            outputSizes = streamConfigurationMap.getOutputSizes(r7);
        }
        if (outputSizes != null && outputSizes.length != 0) {
            F.c cVar = new F.c(false);
            Size size = (Size) Collections.max(Arrays.asList(outputSizes), cVar);
            Size size2 = M.a.f851a;
            if (Build.VERSION.SDK_INT >= 23 && z3 && (a4 = Z.a(streamConfigurationMap, r7)) != null && a4.length > 0) {
                size2 = (Size) Collections.max(Arrays.asList(a4), cVar);
            }
            return (Size) Collections.max(Arrays.asList(size, size2), cVar);
        }
        return null;
    }

    public static int e(Range range, Range range2) {
        boolean z3;
        if (!range.contains((Range) ((Integer) range2.getUpper())) && !range.contains((Range) ((Integer) range2.getLower()))) {
            z3 = true;
        } else {
            z3 = false;
        }
        AbstractC0624h4.f("Ranges must not intersect", z3);
        if (((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue()) {
            return ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue();
        }
        return ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(C0494c c0494c, List list) {
        List<androidx.camera.core.impl.e0> list2;
        HashMap hashMap = this.f5104d;
        if (hashMap.containsKey(c0494c)) {
            list2 = (List) hashMap.get(c0494c);
        } else {
            ArrayList arrayList = new ArrayList();
            int r3 = c0494c.f5128b;
            int r5 = c0494c.f5127a;
            if (r3 == 8) {
                if (r5 != 1) {
                    ArrayList arrayList2 = this.f5101a;
                    if (r5 != 2) {
                        arrayList.addAll(arrayList2);
                    } else {
                        arrayList.addAll(this.f5102b);
                        arrayList.addAll(arrayList2);
                    }
                } else {
                    arrayList = this.f5103c;
                }
            } else if (r3 == 10 && r5 == 0) {
                arrayList.addAll(this.f5105e);
            }
            hashMap.put(c0494c, arrayList);
            list2 = arrayList;
        }
        boolean z3 = false;
        for (androidx.camera.core.impl.e0 e0Var : list2) {
            if (e0Var.c(list) != null) {
                z3 = true;
                continue;
            } else {
                z3 = false;
                continue;
            }
            if (z3) {
                break;
            }
        }
        return z3;
    }

    public final void b() {
        Size size;
        Size size2;
        int parseInt;
        CamcorderProfile camcorderProfile;
        CamcorderProfile camcorderProfile2;
        Size e4 = this.f5118s.e();
        try {
            parseInt = Integer.parseInt(this.g);
            this.f5107h.getClass();
            camcorderProfile = null;
            if (CamcorderProfile.hasProfile(parseInt, 1)) {
                camcorderProfile2 = CamcorderProfile.get(parseInt, 1);
            } else {
                camcorderProfile2 = null;
            }
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((C0322i) this.f5108i.b().f5401J).f3983K).getOutputSizes(MediaRecorder.class);
            if (outputSizes == null) {
                size = M.a.f853c;
            } else {
                Arrays.sort(outputSizes, new F.c(true));
                int length = outputSizes.length;
                int r22 = 0;
                while (true) {
                    if (r22 < length) {
                        Size size3 = outputSizes[r22];
                        int width = size3.getWidth();
                        Size size4 = M.a.f855e;
                        if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                            size = size3;
                            break;
                        }
                        r22++;
                    } else {
                        size = M.a.f853c;
                        break;
                    }
                }
            }
        }
        if (camcorderProfile2 != null) {
            size2 = new Size(camcorderProfile2.videoFrameWidth, camcorderProfile2.videoFrameHeight);
            this.f5116q = new C0081h(M.a.f852b, new HashMap(), e4, new HashMap(), size2, new HashMap(), new HashMap());
        }
        size = M.a.f853c;
        if (CamcorderProfile.hasProfile(parseInt, 10)) {
            camcorderProfile = CamcorderProfile.get(parseInt, 10);
        } else if (CamcorderProfile.hasProfile(parseInt, 8)) {
            camcorderProfile = CamcorderProfile.get(parseInt, 8);
        } else if (CamcorderProfile.hasProfile(parseInt, 12)) {
            camcorderProfile = CamcorderProfile.get(parseInt, 12);
        } else if (CamcorderProfile.hasProfile(parseInt, 6)) {
            camcorderProfile = CamcorderProfile.get(parseInt, 6);
        } else if (CamcorderProfile.hasProfile(parseInt, 5)) {
            camcorderProfile = CamcorderProfile.get(parseInt, 5);
        } else if (CamcorderProfile.hasProfile(parseInt, 4)) {
            camcorderProfile = CamcorderProfile.get(parseInt, 4);
        }
        if (camcorderProfile != null) {
            size = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
        }
        size2 = size;
        this.f5116q = new C0081h(M.a.f852b, new HashMap(), e4, new HashMap(), size2, new HashMap(), new HashMap());
    }

    public final List d(C0494c c0494c, List list) {
        C0076c c0076c = Y.f5094a;
        if (c0494c.f5127a == 0 && c0494c.f5128b == 8) {
            Iterator it = this.f5106f.iterator();
            while (it.hasNext()) {
                List c4 = ((androidx.camera.core.impl.e0) it.next()).c(list);
                if (c4 != null) {
                    return c4;
                }
            }
        }
        return null;
    }

    public final Pair g(int r6, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int r11, HashMap hashMap, HashMap hashMap2) {
        int r12;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0074a c0074a = (C0074a) it.next();
            arrayList4.add(c0074a.f2164a);
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), c0074a);
            }
        }
        for (int r122 = 0; r122 < list.size(); r122++) {
            Size size = (Size) list.get(r122);
            androidx.camera.core.impl.k0 k0Var = (androidx.camera.core.impl.k0) arrayList2.get(((Integer) arrayList3.get(r122)).intValue());
            int b02 = k0Var.b0();
            arrayList4.add(C0080g.b(r6, b02, size, h(b02)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), k0Var);
            }
            try {
                r12 = (int) (1.0E9d / ((StreamConfigurationMap) this.f5108i.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(k0Var.b0(), size));
            } catch (Exception unused) {
                r12 = 0;
            }
            r11 = Math.min(r11, r12);
        }
        return new Pair(arrayList4, Integer.valueOf(r11));
    }

    public final C0081h h(int r7) {
        CameraCharacteristics.Key key;
        ArrayList arrayList = this.f5117r;
        if (!arrayList.contains(Integer.valueOf(r7))) {
            i(this.f5116q.f2200b, M.a.f854d, r7);
            i(this.f5116q.f2202d, M.a.f856f, r7);
            HashMap hashMap = this.f5116q.f2204f;
            C0559n c0559n = this.f5108i;
            Size c4 = c((StreamConfigurationMap) ((C0322i) c0559n.b().f5401J).f3983K, r7, true);
            if (c4 != null) {
                hashMap.put(Integer.valueOf(r7), c4);
            }
            HashMap hashMap2 = this.f5116q.g;
            if (Build.VERSION.SDK_INT >= 31 && this.f5115p) {
                key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION;
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) c0559n.a(key);
                if (streamConfigurationMap != null) {
                    hashMap2.put(Integer.valueOf(r7), c(streamConfigurationMap, r7, true));
                }
            }
            arrayList.add(Integer.valueOf(r7));
        }
        return this.f5116q;
    }

    public final void i(HashMap hashMap, Size size, int r6) {
        if (!this.f5113n) {
            return;
        }
        Size c4 = c((StreamConfigurationMap) ((C0322i) this.f5108i.b().f5401J).f3983K, r6, false);
        Integer valueOf = Integer.valueOf(r6);
        if (c4 != null) {
            size = (Size) Collections.min(Arrays.asList(size, c4), new F.c(false));
        }
        hashMap.put(valueOf, size);
    }
}
