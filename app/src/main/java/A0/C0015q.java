package A0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h1.C0281a;
import h1.C0283c;
import k0.C0324k;
import k1.C0334b;
import k1.C0335c;
import k1.C0342k;
import k1.C0343l;
import n1.C0393a;
import x1.G4;

/* renamed from: A0.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0015q implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f152a;

    public /* synthetic */ C0015q(int r12) {
        this.f152a = r12;
    }

    public static void a(C0335c c0335c, Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        int r12 = c0335c.f4025a;
        G4.i(parcel, 1, 4);
        parcel.writeInt(r12);
        G4.i(parcel, 2, 4);
        parcel.writeInt(c0335c.f4026b);
        G4.i(parcel, 3, 4);
        parcel.writeInt(c0335c.f4027c);
        G4.c(parcel, 4, c0335c.f4028d);
        IBinder iBinder = c0335c.f4029e;
        if (iBinder != null) {
            int g3 = G4.g(parcel, 5);
            parcel.writeStrongBinder(iBinder);
            G4.h(parcel, g3);
        }
        G4.e(parcel, 6, c0335c.f4030f, r6);
        Bundle bundle = c0335c.g;
        if (bundle != null) {
            int g4 = G4.g(parcel, 7);
            parcel.writeBundle(bundle);
            G4.h(parcel, g4);
        }
        G4.b(parcel, 8, c0335c.f4031h, r6);
        G4.e(parcel, 10, c0335c.f4032i, r6);
        G4.e(parcel, 11, c0335c.f4033j, r6);
        G4.i(parcel, 12, 4);
        parcel.writeInt(c0335c.f4034k ? 1 : 0);
        G4.i(parcel, 13, 4);
        parcel.writeInt(c0335c.f4035l);
        boolean z3 = c0335c.f4036m;
        G4.i(parcel, 14, 4);
        parcel.writeInt(z3 ? 1 : 0);
        G4.c(parcel, 15, c0335c.f4037n);
        G4.h(parcel, g);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 661
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            Method dump skipped, instructions count: 2052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.C0015q.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int r22) {
        switch (this.f152a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new r[r22];
            case 1:
                return new P[r22];
            case 2:
                return new S[r22];
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new B1.b[r22];
            case 4:
                return new B1.e[r22];
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                return new B1.f[r22];
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new B1.g[r22];
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new ParcelImpl[r22];
            case 8:
                return new GoogleSignInAccount[r22];
            case 9:
                return new C0281a[r22];
            case 10:
                return new C0283c[r22];
            case 11:
                return new Scope[r22];
            case 12:
                return new Status[r22];
            case 13:
                return new C0324k[r22];
            case 14:
                return new C0343l[r22];
            case 15:
                return new k1.i[r22];
            case 16:
                return new k1.p[r22];
            case 17:
                return new k1.q[r22];
            case 18:
                return new C0342k[r22];
            case 19:
                return new k1.x[r22];
            case 20:
                return new k1.C[r22];
            case 21:
                return new C0334b[r22];
            case 22:
                return new C0335c[r22];
            case 23:
                return new C0393a[r22];
            case 24:
                return new n1.b[r22];
            case 25:
                return new n1.c[r22];
            default:
                return new n1.d[r22];
        }
    }
}
