package u1;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: u1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0473a implements IInterface {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f5023l;

    /* renamed from: m  reason: collision with root package name */
    public final IBinder f5024m;

    /* renamed from: n  reason: collision with root package name */
    public final String f5025n;

    public /* synthetic */ AbstractC0473a(IBinder iBinder, String str, int r3) {
        this.f5023l = r3;
        this.f5024m = iBinder;
        this.f5025n = str;
    }

    public void D(Parcel parcel, int r5) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5024m.transact(r5, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel Q(Parcel parcel, int r5) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5024m.transact(r5, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel Y() {
        switch (this.f5023l) {
            case 1:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f5025n);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f5025n);
                return obtain2;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f5023l) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return this.f5024m;
            case 1:
                return this.f5024m;
            default:
                return this.f5024m;
        }
    }

    public Parcel v0(Parcel parcel, int r5) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5024m.transact(r5, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void w0(Parcel parcel, int r5) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f5024m.transact(r5, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }
}
