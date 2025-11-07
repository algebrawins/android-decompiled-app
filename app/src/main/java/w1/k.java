package W1;

import android.content.Context;
import android.media.Image;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import h1.C0283c;
import java.util.ArrayList;
import k1.w;
import s1.InterfaceC0453b;
import w1.AbstractC0519d;
import w1.C0517b;
import w1.C0522g;
import x1.AbstractC0593d5;
import x1.B0;
import x1.C0;
import x1.C0571b;
import x1.C0579c;
import x1.C0587d;
import x1.C0603f;
import x1.I6;
import x1.J6;
import x1.N4;
import x1.r;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1530a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1531b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f1532c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f1533d;

    /* renamed from: e  reason: collision with root package name */
    public Object f1534e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, x1.b] */
    public k(Context context, S1.b bVar, I6 r4) {
        ?? obj = new Object();
        this.f1532c = obj;
        this.f1531b = context;
        obj.f5850a = bVar.f1197a;
        this.f1533d = r4;
    }

    @Override // W1.i
    public void a() {
        C0579c c0579c = (C0579c) this.f1534e;
        if (c0579c != null) {
            try {
                c0579c.w0(c0579c.Y(), 3);
            } catch (RemoteException e4) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e4);
            }
            this.f1534e = null;
        }
    }

    @Override // W1.i
    public boolean b() {
        Context context = (Context) this.f1531b;
        if (((C0579c) this.f1534e) != null) {
            return false;
        }
        try {
            C0579c x02 = ((C0587d) zzal.zza(t1.e.c(context, t1.e.f5007b, "com.google.android.gms.vision.dynamite").b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"))).x0(ObjectWrapper.wrap(context), (C0571b) this.f1532c);
            this.f1534e = x02;
            I6 r4 = (I6) this.f1533d;
            if (x02 == null && !this.f1530a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                C0283c[] c0283cArr = Q1.i.f1077a;
                C0517b c0517b = AbstractC0519d.f5287K;
                Object[] objArr = {"barcode"};
                AbstractC0593d5.a(1, objArr);
                Q1.i.a(context, new C0522g(1, objArr));
                this.f1530a = true;
                c.b(r4, N4.zzB);
                throw new M1.a("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            c.b(r4, N4.zza);
            return false;
        } catch (RemoteException e4) {
            throw new M1.a("Failed to create legacy barcode detector.", e4);
        } catch (t1.b e5) {
            throw new M1.a("Failed to load deprecated vision dynamite module.", e5);
        }
    }

    @Override // W1.i
    public ArrayList c(X1.a aVar) {
        J6[] j6Arr;
        if (((C0579c) this.f1534e) == null) {
            b();
        }
        C0579c c0579c = (C0579c) this.f1534e;
        if (c0579c != null) {
            C0603f c0603f = new C0603f(aVar.f1584c, aVar.f1585d, 0, B0.a(aVar.f1586e), 0L);
            try {
                int r22 = aVar.f1587f;
                if (r22 != -1) {
                    if (r22 != 17) {
                        if (r22 != 35) {
                            if (r22 == 842094169) {
                                j6Arr = c0579c.x0(ObjectWrapper.wrap(C0.a(aVar)), c0603f);
                            } else {
                                throw new M1.a("Unsupported image format: " + aVar.f1587f, 3);
                            }
                        } else {
                            Image.Plane[] a4 = aVar.a();
                            w.e(a4);
                            c0603f.f5883a = a4[0].getRowStride();
                            j6Arr = c0579c.x0(ObjectWrapper.wrap(a4[0].getBuffer()), c0603f);
                        }
                    } else {
                        j6Arr = c0579c.x0(ObjectWrapper.wrap(null), c0603f);
                    }
                } else {
                    InterfaceC0453b wrap = ObjectWrapper.wrap(aVar.f1582a);
                    Parcel Y3 = c0579c.Y();
                    r.a(Y3, wrap);
                    Y3.writeInt(1);
                    c0603f.writeToParcel(Y3, 0);
                    Parcel v02 = c0579c.v0(Y3, 2);
                    v02.recycle();
                    j6Arr = (J6[]) v02.createTypedArray(J6.CREATOR);
                }
                ArrayList arrayList = new ArrayList();
                for (J6 j6 : j6Arr) {
                    arrayList.add(new U1.i(new A.a(21, j6)));
                }
                return arrayList;
            } catch (RemoteException e4) {
                throw new M1.a("Failed to detect with legacy barcode detector", e4);
            }
        }
        throw new M1.a("Error initializing the legacy barcode scanner.", 14);
    }

    public k(String str, String str2, String str3, String str4, boolean z3) {
        this.f1531b = str == null ? "libapp.so" : str;
        this.f1532c = str2 == null ? "flutter_assets" : str2;
        this.f1534e = str4;
        this.f1533d = str3 == null ? "" : str3;
        this.f1530a = z3;
    }
}
