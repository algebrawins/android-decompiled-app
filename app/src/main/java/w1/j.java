package W1;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvv;
import java.util.ArrayList;
import k1.w;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;
import x1.B0;
import x1.C;
import x1.C0562A;
import x1.G;
import x1.G4;
import x1.I6;
import x1.a7;
import x1.b7;
import x1.c7;
import x1.d7;
import x1.r;

/* loaded from: classes.dex */
public final class j implements i {

    /* renamed from: h  reason: collision with root package name */
    public static final G f1523h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1524a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1525b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1526c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f1527d;

    /* renamed from: e  reason: collision with root package name */
    public final S1.b f1528e;

    /* renamed from: f  reason: collision with root package name */
    public final I6 f1529f;
    public b7 g;

    static {
        C0562A c0562a = C.f5509K;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        for (int r12 = 0; r12 < 2; r12++) {
            if (objArr[r12] == null) {
                throw new NullPointerException(D.C.w("at index ", r12));
            }
        }
        f1523h = new G(2, objArr);
    }

    public j(Context context, S1.b bVar, I6 r3) {
        this.f1527d = context;
        this.f1528e = bVar;
        this.f1529f = r3;
    }

    @Override // W1.i
    public final void a() {
        b7 b7Var = this.g;
        if (b7Var != null) {
            try {
                b7Var.w0(b7Var.Y(), 2);
            } catch (RemoteException e4) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e4);
            }
            this.g = null;
            this.f1524a = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v11, types: [i1.f, o1.g] */
    @Override // W1.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.j.b():boolean");
    }

    @Override // W1.i
    public final ArrayList c(X1.a aVar) {
        InterfaceC0453b wrap;
        if (this.g == null) {
            b();
        }
        b7 b7Var = this.g;
        w.e(b7Var);
        if (!this.f1524a) {
            try {
                b7Var.w0(b7Var.Y(), 1);
                this.f1524a = true;
            } catch (RemoteException e4) {
                throw new M1.a("Failed to init barcode scanner.", e4);
            }
        }
        int r12 = aVar.f1584c;
        if (aVar.f1587f == 35) {
            Image.Plane[] a4 = aVar.a();
            w.e(a4);
            r12 = a4[0].getRowStride();
        }
        int r3 = aVar.f1587f;
        int r5 = aVar.f1585d;
        int a5 = B0.a(aVar.f1586e);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Y1.b.f1664b.getClass();
        int r9 = aVar.f1587f;
        if (r9 != -1) {
            Image image = null;
            if (r9 != 17) {
                if (r9 != 35) {
                    if (r9 != 842094169) {
                        throw new M1.a(D.C.w("Unsupported image format: ", aVar.f1587f), 3);
                    }
                } else {
                    if (aVar.f1583b != null) {
                        image = (Image) aVar.f1583b.f1K;
                    }
                    wrap = ObjectWrapper.wrap(image);
                }
            }
            w.e(null);
            throw null;
        }
        Bitmap bitmap = aVar.f1582a;
        w.e(bitmap);
        wrap = ObjectWrapper.wrap(bitmap);
        try {
            Parcel Y3 = b7Var.Y();
            r.a(Y3, wrap);
            Y3.writeInt(1);
            int g = G4.g(Y3, 20293);
            G4.i(Y3, 1, 4);
            Y3.writeInt(r3);
            G4.i(Y3, 2, 4);
            Y3.writeInt(r12);
            G4.i(Y3, 3, 4);
            Y3.writeInt(r5);
            G4.i(Y3, 4, 4);
            Y3.writeInt(a5);
            G4.i(Y3, 5, 8);
            Y3.writeLong(elapsedRealtime);
            G4.h(Y3, g);
            Parcel v02 = b7Var.v0(Y3, 3);
            ArrayList<a7> createTypedArrayList = v02.createTypedArrayList(a7.CREATOR);
            v02.recycle();
            ArrayList arrayList = new ArrayList();
            for (a7 a7Var : createTypedArrayList) {
                arrayList.add(new U1.i(new A.c(16, a7Var)));
            }
            return arrayList;
        } catch (RemoteException e5) {
            throw new M1.a("Failed to run barcode scanner.", e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b7 d(t1.d dVar, String str, String str2) {
        b7 abstractC0473a;
        Context context = this.f1527d;
        d7 zza = zzvv.zza(t1.e.c(context, dVar, str).b(str2));
        InterfaceC0453b wrap = ObjectWrapper.wrap(context);
        int r6 = this.f1528e.f1197a;
        c7 c7Var = (c7) zza;
        Parcel Y3 = c7Var.Y();
        r.a(Y3, wrap);
        Y3.writeInt(1);
        int g = G4.g(Y3, 20293);
        G4.i(Y3, 1, 4);
        Y3.writeInt(r6);
        G4.i(Y3, 2, 4);
        Y3.writeInt(0);
        G4.h(Y3, g);
        Parcel v02 = c7Var.v0(Y3, 1);
        IBinder readStrongBinder = v02.readStrongBinder();
        if (readStrongBinder == null) {
            abstractC0473a = 0;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            if (queryLocalInterface instanceof b7) {
                abstractC0473a = (b7) queryLocalInterface;
            } else {
                abstractC0473a = new AbstractC0473a(readStrongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner", 2);
            }
        }
        v02.recycle();
        return abstractC0473a;
    }
}
