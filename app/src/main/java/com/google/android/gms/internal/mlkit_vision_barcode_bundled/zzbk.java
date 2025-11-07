package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.media.Image;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.libraries.barhopper.BarhopperV3;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import s1.InterfaceC0453b;

/* loaded from: classes.dex */
public abstract class zzbk extends zzb implements InterfaceC0219v {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzb
    public final boolean D(int r58, Parcel parcel, Parcel parcel2) {
        C0225y createFromParcel;
        Z1.a recognize;
        Matrix matrix;
        int r15;
        C0200m c0200m;
        C0208p c0208p;
        C0210q c0210q;
        C0213s c0213s;
        r rVar;
        C0203n c0203n;
        C0191j c0191j;
        C0194k c0194k;
        C0197l c0197l;
        int r21;
        String str;
        byte[] bArr;
        Point[] pointArr;
        int r26;
        C0206o c0206o;
        C0208p[] c0208pArr;
        C0200m[] c0200mArr;
        C0188h[] c0188hArr;
        String str2;
        String str3;
        int r22 = 1;
        if (r58 != 1) {
            AbstractC0168a0 abstractC0168a0 = null;
            if (r58 != 2) {
                if (r58 != 3) {
                    return false;
                }
                InterfaceC0453b asInterface = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                Parcelable.Creator<C0225y> creator = C0225y.CREATOR;
                int r9 = AbstractC0227z.f2995a;
                if (parcel.readInt() == 0) {
                    createFromParcel = null;
                } else {
                    createFromParcel = creator.createFromParcel(parcel);
                }
                C0225y c0225y = createFromParcel;
                int dataAvail = parcel.dataAvail();
                if (dataAvail <= 0) {
                    T1.a aVar = (T1.a) this;
                    int r10 = c0225y.f2989a;
                    int r11 = -1;
                    if (r10 != -1) {
                        if (r10 != 17) {
                            if (r10 != 35) {
                                if (r10 != 842094169) {
                                    throw new IllegalArgumentException("Unsupported image format: " + c0225y.f2989a);
                                }
                            } else {
                                Image image = (Image) ObjectWrapper.unwrap(asInterface);
                                k1.w.e(image);
                                recognize = aVar.Y(image.getPlanes()[0].getBuffer(), c0225y);
                            }
                        }
                        recognize = aVar.Y((ByteBuffer) ObjectWrapper.unwrap(asInterface), c0225y);
                    } else {
                        BarhopperV3 barhopperV3 = aVar.f1224n;
                        k1.w.e(barhopperV3);
                        recognize = barhopperV3.recognize((Bitmap) ObjectWrapper.unwrap(asInterface), aVar.f1223m);
                    }
                    ArrayList arrayList = new ArrayList();
                    Y1.b.f1664b.getClass();
                    int r102 = c0225y.f2992d;
                    if (r102 == 0) {
                        matrix = null;
                    } else {
                        matrix = new Matrix();
                        int r13 = c0225y.f2990b;
                        int r8 = c0225y.f2991c;
                        matrix.postTranslate((-r13) / 2.0f, (-r8) / 2.0f);
                        matrix.postRotate(r102 * 90);
                        int r14 = r102 % 2;
                        if (r14 != 0) {
                            r15 = r8;
                        } else {
                            r15 = r13;
                        }
                        if (r14 == 0) {
                            r13 = r8;
                        }
                        matrix.postTranslate(r15 / 2.0f, r13 / 2.0f);
                    }
                    for (Z1.l lVar : recognize.o()) {
                        int r142 = 5;
                        if (lVar.o() > 0 && matrix != null) {
                            float[] fArr = new float[8];
                            i0 A3 = lVar.A();
                            int o3 = lVar.o();
                            for (int r7 = 0; r7 < o3; r7++) {
                                int r19 = r7 + r7;
                                fArr[r19] = ((Z1.f) A3.get(r7)).n();
                                fArr[r19 + 1] = ((Z1.f) A3.get(r7)).o();
                            }
                            matrix.mapPoints(fArr);
                            int r12 = 0;
                            while (r12 < o3) {
                                W w3 = (W) lVar.m(r142, abstractC0168a0);
                                w3.b(lVar);
                                Z1.k kVar = (Z1.k) w3;
                                int r152 = r12 + r12;
                                Z1.e p2 = Z1.f.p();
                                p2.f();
                                Z1.f.q((Z1.f) p2.f2863K, (int) fArr[r152]);
                                p2.f();
                                Z1.f.r((Z1.f) p2.f2863K, (int) fArr[r152 + 1]);
                                kVar.f();
                                Z1.l.B((Z1.l) kVar.f2863K, (r12 + r102) % o3, (Z1.f) p2.c());
                                lVar = (Z1.l) kVar.c();
                                r12++;
                                abstractC0168a0 = null;
                                r142 = 5;
                            }
                        }
                        if (lVar.F()) {
                            Z1.r t3 = lVar.t();
                            c0200m = new C0200m(t3.r() + r11, t3.o(), t3.q(), t3.p());
                        } else {
                            c0200m = null;
                        }
                        if (lVar.H()) {
                            C p3 = lVar.p();
                            c0208p = new C0208p(p3.o(), p3.p() + r11);
                        } else {
                            c0208p = null;
                        }
                        if (lVar.I()) {
                            Z1.g v3 = lVar.v();
                            c0210q = new C0210q(v3.o(), v3.p());
                        } else {
                            c0210q = null;
                        }
                        if (lVar.K()) {
                            Z1.j x3 = lVar.x();
                            c0213s = new C0213s(x3.q() + r11, x3.p(), x3.o());
                        } else {
                            c0213s = null;
                        }
                        if (lVar.J()) {
                            Z1.i w4 = lVar.w();
                            rVar = new r(w4.o(), w4.p());
                        } else {
                            rVar = null;
                        }
                        if (lVar.G()) {
                            Z1.d u3 = lVar.u();
                            c0203n = new C0203n(u3.n(), u3.o());
                        } else {
                            c0203n = null;
                        }
                        if (lVar.C()) {
                            Z1.o q3 = lVar.q();
                            String u4 = q3.u();
                            String q4 = q3.q();
                            String r3 = q3.r();
                            String s3 = q3.s();
                            String t4 = q3.t();
                            Z1.n o4 = q3.o();
                            if (lVar.y().s()) {
                                L y3 = lVar.y();
                                y3.getClass();
                                str2 = y3.x(AbstractC0192j0.f2920a);
                            } else {
                                str2 = null;
                            }
                            i Q3 = T1.a.Q(o4, str2, "DTSTART:([0-9TZ]*)");
                            Z1.n n3 = q3.n();
                            if (lVar.y().s()) {
                                L y4 = lVar.y();
                                y4.getClass();
                                str3 = y4.x(AbstractC0192j0.f2920a);
                            } else {
                                str3 = null;
                            }
                            c0191j = new C0191j(u4, q4, r3, s3, t4, Q3, T1.a.Q(n3, str3, "DTEND:([0-9TZ]*)"));
                        } else {
                            c0191j = null;
                        }
                        if (lVar.D()) {
                            Z1.p r4 = lVar.r();
                            B n4 = r4.n();
                            if (n4 != null) {
                                c0206o = new C0206o(n4.p(), n4.t(), n4.s(), n4.o(), n4.r(), n4.q(), n4.u());
                            } else {
                                c0206o = null;
                            }
                            String p4 = r4.p();
                            String q5 = r4.q();
                            i0 t5 = r4.t();
                            if (t5.isEmpty()) {
                                c0208pArr = null;
                            } else {
                                C0208p[] c0208pArr2 = new C0208p[t5.size()];
                                for (int r72 = 0; r72 < t5.size(); r72++) {
                                    c0208pArr2[r72] = new C0208p(((C) t5.get(r72)).o(), ((C) t5.get(r72)).p() + r11);
                                }
                                c0208pArr = c0208pArr2;
                            }
                            i0 s4 = r4.s();
                            if (s4.isEmpty()) {
                                c0200mArr = null;
                            } else {
                                C0200m[] c0200mArr2 = new C0200m[s4.size()];
                                int r73 = 0;
                                while (r73 < s4.size()) {
                                    c0200mArr2[r73] = new C0200m(((Z1.r) s4.get(r73)).r() + r11, ((Z1.r) s4.get(r73)).o(), ((Z1.r) s4.get(r73)).q(), ((Z1.r) s4.get(r73)).p());
                                    r73++;
                                    r11 = -1;
                                }
                                c0200mArr = c0200mArr2;
                            }
                            String[] strArr = (String[]) r4.u().toArray(new String[0]);
                            i0 r5 = r4.r();
                            if (r5.isEmpty()) {
                                c0188hArr = null;
                            } else {
                                C0188h[] c0188hArr2 = new C0188h[r5.size()];
                                for (int r52 = 0; r52 < r5.size(); r52++) {
                                    c0188hArr2[r52] = new C0188h(((A) r5.get(r52)).o() - 1, (String[]) ((A) r5.get(r52)).n().toArray(new String[0]));
                                }
                                c0188hArr = c0188hArr2;
                            }
                            c0194k = new C0194k(c0206o, p4, q5, c0208pArr, c0200mArr, strArr, c0188hArr);
                        } else {
                            c0194k = null;
                        }
                        if (lVar.E()) {
                            Z1.q s5 = lVar.s();
                            c0197l = new C0197l(s5.t(), s5.v(), s5.B(), s5.z(), s5.w(), s5.q(), s5.o(), s5.p(), s5.r(), s5.A(), s5.x(), s5.u(), s5.s(), s5.y());
                        } else {
                            c0197l = null;
                        }
                        switch (lVar.L() - 1) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                r21 = 0;
                                break;
                            case 1:
                                r21 = 1;
                                break;
                            case 2:
                                r21 = 2;
                                break;
                            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                                r21 = 4;
                                break;
                            case 4:
                                r21 = 8;
                                break;
                            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                                r21 = 16;
                                break;
                            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                r21 = 32;
                                break;
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                r21 = 64;
                                break;
                            case 8:
                                r21 = RecognitionOptions.ITF;
                                break;
                            case 9:
                                r21 = RecognitionOptions.QR_CODE;
                                break;
                            case 10:
                                r21 = RecognitionOptions.UPC_A;
                                break;
                            case 11:
                                r21 = RecognitionOptions.UPC_E;
                                break;
                            case 12:
                                r21 = RecognitionOptions.PDF417;
                                break;
                            case 13:
                                r21 = RecognitionOptions.AZTEC;
                                break;
                            default:
                                r21 = -1;
                                break;
                        }
                        String z3 = lVar.z();
                        if (lVar.y().s()) {
                            L y5 = lVar.y();
                            y5.getClass();
                            str = y5.x(AbstractC0192j0.f2920a);
                        } else {
                            str = null;
                        }
                        L y6 = lVar.y();
                        int j3 = y6.j();
                        if (j3 == 0) {
                            bArr = AbstractC0192j0.f2921b;
                        } else {
                            byte[] bArr2 = new byte[j3];
                            y6.k(0, 0, j3, bArr2);
                            bArr = bArr2;
                        }
                        i0 A4 = lVar.A();
                        if (A4.isEmpty()) {
                            pointArr = null;
                        } else {
                            Point[] pointArr2 = new Point[A4.size()];
                            for (int r6 = 0; r6 < A4.size(); r6++) {
                                pointArr2[r6] = new Point(((Z1.f) A4.get(r6)).n(), ((Z1.f) A4.get(r6)).o());
                            }
                            pointArr = pointArr2;
                        }
                        switch (lVar.n() - 1) {
                            case 1:
                                r26 = 1;
                                break;
                            case 2:
                                r26 = 2;
                                break;
                            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                                r26 = 3;
                                break;
                            case 4:
                                r26 = 4;
                                break;
                            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                                r26 = 5;
                                break;
                            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                r26 = 6;
                                break;
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                r26 = 7;
                                break;
                            case 8:
                                r26 = 8;
                                break;
                            case 9:
                                r26 = 9;
                                break;
                            case 10:
                                r26 = 10;
                                break;
                            case 11:
                                r26 = 11;
                                break;
                            case 12:
                                r26 = 12;
                                break;
                            default:
                                r26 = 0;
                                break;
                        }
                        arrayList.add(new C0215t(r21, z3, str, bArr, pointArr, r26, c0200m, c0208p, c0210q, c0213s, rVar, c0203n, c0191j, c0194k, c0197l));
                        abstractC0168a0 = null;
                        r11 = -1;
                    }
                    parcel2.writeNoException();
                    parcel2.writeTypedList(arrayList);
                    return true;
                }
                throw new BadParcelableException(D.C.w("Parcel data not fully consumed, unread size: ", dataAvail));
            }
            T1.a aVar2 = (T1.a) this;
            BarhopperV3 barhopperV32 = aVar2.f1224n;
            if (barhopperV32 != null) {
                barhopperV32.close();
                aVar2.f1224n = null;
            }
            parcel2.writeNoException();
            return true;
        }
        T1.a aVar3 = (T1.a) this;
        Context context = aVar3.f1222l;
        if (aVar3.f1224n == null) {
            aVar3.f1224n = new BarhopperV3();
            D1.f n5 = D1.g.n();
            D1.d n6 = D1.e.n();
            int r62 = 0;
            int r74 = 16;
            int r82 = 0;
            while (r62 < 6) {
                D1.b n7 = D1.c.n();
                n7.f();
                D1.c.r((D1.c) n7.f2863K, r74);
                n7.f();
                D1.c.o((D1.c) n7.f2863K, r74);
                int r112 = r82;
                int r83 = 0;
                while (r83 < T1.a.f1220o[r62]) {
                    double[] dArr = T1.a.f1221p[r112];
                    Context context2 = context;
                    float sqrt = (float) Math.sqrt(dArr[r22]);
                    float f2 = (float) (dArr[0] * 320.0d);
                    n7.f();
                    D1.c.p((D1.c) n7.f2863K, f2 / sqrt);
                    n7.f();
                    D1.c.q((D1.c) n7.f2863K, f2 * sqrt);
                    r22 = 1;
                    r112++;
                    r83++;
                    context = context2;
                }
                r74 += r74;
                n6.f();
                D1.e.o((D1.e) n6.f2863K, (D1.c) n7.c());
                r62 += r22;
                r82 = r112;
                context = context;
            }
            Context context3 = context;
            n5.f();
            D1.g.o((D1.g) n5.f2863K, (D1.e) n6.c());
            try {
                InputStream open = context3.getAssets().open("mlkit_barcode_models/barcode_ssd_mobilenet_v1_dmp25_quant.tflite");
                InputStream open2 = context3.getAssets().open("mlkit_barcode_models/oned_auto_regressor_mobile.tflite");
                InputStream open3 = context3.getAssets().open("mlkit_barcode_models/oned_feature_extractor_mobile.tflite");
                try {
                    BarhopperV3 barhopperV33 = aVar3.f1224n;
                    k1.w.e(barhopperV33);
                    D1.h n8 = D1.a.n();
                    L w5 = L.w(open);
                    n5.f();
                    D1.g.p((D1.g) n5.f2863K, w5);
                    n8.f();
                    D1.a.o((D1.a) n8.f2863K, (D1.g) n5.c());
                    D1.i n9 = D1.j.n();
                    L w6 = L.w(open2);
                    n9.f();
                    D1.j.p((D1.j) n9.f2863K, w6);
                    L w7 = L.w(open3);
                    n9.f();
                    D1.j.o((D1.j) n9.f2863K, w7);
                    n8.f();
                    D1.a.p((D1.a) n8.f2863K, (D1.j) n9.c());
                    barhopperV33.create((D1.a) n8.c());
                    if (open3 != null) {
                        open3.close();
                    }
                    if (open2 != null) {
                        open2.close();
                    }
                    if (open != null) {
                        open.close();
                    }
                } catch (Throwable th) {
                    if (open3 != null) {
                        try {
                            open3.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e4) {
                throw new IllegalStateException("Failed to open Barcode models", e4);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
