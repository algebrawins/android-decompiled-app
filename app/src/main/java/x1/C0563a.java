package x1;

import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: x1.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563a implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5828a;

    public /* synthetic */ C0563a(int r12) {
        this.f5828a = r12;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 789
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:59)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r24) {
        /*
            Method dump skipped, instructions count: 2642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.C0563a.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r22) {
        switch (this.f5828a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new J3[r22];
            case 1:
                return new i4[r22];
            case 2:
                return new D4[r22];
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new C0569a5[r22];
            case 4:
                return new C0760z5[r22];
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                return new C0570a6[r22];
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0729v6[r22];
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0571b[r22];
            case 8:
                return new C0603f[r22];
            case 9:
                return new C0597e1[r22];
            case 10:
                return new O6[r22];
            case 11:
                return new J6[r22];
            case 12:
                return new a7[r22];
            case 13:
                return new P6[r22];
            case 14:
                return new Q6[r22];
            case 15:
                return new R6[r22];
            case 16:
                return new S6[r22];
            case 17:
                return new T6[r22];
            case 18:
                return new U6[r22];
            case 19:
                return new V6[r22];
            case 20:
                return new W6[r22];
            case 21:
                return new X6[r22];
            case 22:
                return new F1[r22];
            case 23:
                return new Y6[r22];
            case 24:
                return new Z6[r22];
            case 25:
                return new C0614g2[r22];
            case 26:
                return new H2[r22];
            default:
                return new i3[r22];
        }
    }
}
