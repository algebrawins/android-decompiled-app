package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.RecognitionOptions;
import x1.F4;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0185g implements Parcelable.Creator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2903a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2903a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                int o3 = F4.o(parcel);
                String[] strArr = null;
                int r4 = 0;
                while (parcel.dataPosition() < o3) {
                    int readInt = parcel.readInt();
                    char c4 = (char) readInt;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            F4.n(parcel, readInt);
                        } else {
                            strArr = F4.d(parcel, readInt);
                        }
                    } else {
                        r4 = F4.j(parcel, readInt);
                    }
                }
                F4.g(parcel, o3);
                return new C0188h(r4, strArr);
            case 1:
                int o4 = F4.o(parcel);
                String str = null;
                String str2 = null;
                byte[] bArr = null;
                Point[] pointArr = null;
                C0200m c0200m = null;
                C0208p c0208p = null;
                C0210q c0210q = null;
                C0213s c0213s = null;
                r rVar = null;
                C0203n c0203n = null;
                C0191j c0191j = null;
                C0194k c0194k = null;
                C0197l c0197l = null;
                int r6 = 0;
                int r11 = 0;
                while (parcel.dataPosition() < o4) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            r6 = F4.j(parcel, readInt2);
                            break;
                        case 2:
                            str = F4.c(parcel, readInt2);
                            break;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str2 = F4.c(parcel, readInt2);
                            break;
                        case 4:
                            bArr = F4.a(parcel, readInt2);
                            break;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            pointArr = (Point[]) F4.e(parcel, readInt2, Point.CREATOR);
                            break;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            r11 = F4.j(parcel, readInt2);
                            break;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            c0200m = (C0200m) F4.b(parcel, readInt2, C0200m.CREATOR);
                            break;
                        case '\b':
                            c0208p = (C0208p) F4.b(parcel, readInt2, C0208p.CREATOR);
                            break;
                        case '\t':
                            c0210q = (C0210q) F4.b(parcel, readInt2, C0210q.CREATOR);
                            break;
                        case '\n':
                            c0213s = (C0213s) F4.b(parcel, readInt2, C0213s.CREATOR);
                            break;
                        case 11:
                            rVar = (r) F4.b(parcel, readInt2, r.CREATOR);
                            break;
                        case '\f':
                            c0203n = (C0203n) F4.b(parcel, readInt2, C0203n.CREATOR);
                            break;
                        case '\r':
                            c0191j = (C0191j) F4.b(parcel, readInt2, C0191j.CREATOR);
                            break;
                        case 14:
                            c0194k = (C0194k) F4.b(parcel, readInt2, C0194k.CREATOR);
                            break;
                        case 15:
                            c0197l = (C0197l) F4.b(parcel, readInt2, C0197l.CREATOR);
                            break;
                        default:
                            F4.n(parcel, readInt2);
                            break;
                    }
                }
                F4.g(parcel, o4);
                return new C0215t(r6, str, str2, bArr, pointArr, r11, c0200m, c0208p, c0210q, c0213s, rVar, c0203n, c0191j, c0194k, c0197l);
            case 2:
                int o5 = F4.o(parcel);
                int r3 = 0;
                boolean z3 = false;
                while (parcel.dataPosition() < o5) {
                    int readInt3 = parcel.readInt();
                    char c5 = (char) readInt3;
                    if (c5 != 1) {
                        if (c5 != 2) {
                            F4.n(parcel, readInt3);
                        } else {
                            z3 = F4.h(parcel, readInt3);
                        }
                    } else {
                        r3 = F4.j(parcel, readInt3);
                    }
                }
                F4.g(parcel, o5);
                return new C0217u(r3, z3);
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                int o6 = F4.o(parcel);
                String str3 = null;
                int r62 = 0;
                int r7 = 0;
                int r8 = 0;
                int r9 = 0;
                int r10 = 0;
                int r112 = 0;
                boolean z4 = false;
                while (parcel.dataPosition() < o6) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            r62 = F4.j(parcel, readInt4);
                            break;
                        case 2:
                            r7 = F4.j(parcel, readInt4);
                            break;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            r8 = F4.j(parcel, readInt4);
                            break;
                        case 4:
                            r9 = F4.j(parcel, readInt4);
                            break;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            r10 = F4.j(parcel, readInt4);
                            break;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            r112 = F4.j(parcel, readInt4);
                            break;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            z4 = F4.h(parcel, readInt4);
                            break;
                        case '\b':
                            str3 = F4.c(parcel, readInt4);
                            break;
                        default:
                            F4.n(parcel, readInt4);
                            break;
                    }
                }
                F4.g(parcel, o6);
                return new i(r62, r7, r8, r9, r10, r112, z4, str3);
            case 4:
                int o7 = F4.o(parcel);
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                i iVar = null;
                i iVar2 = null;
                while (parcel.dataPosition() < o7) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 1:
                            str4 = F4.c(parcel, readInt5);
                            break;
                        case 2:
                            str5 = F4.c(parcel, readInt5);
                            break;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str6 = F4.c(parcel, readInt5);
                            break;
                        case 4:
                            str7 = F4.c(parcel, readInt5);
                            break;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            str8 = F4.c(parcel, readInt5);
                            break;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            iVar = (i) F4.b(parcel, readInt5, i.CREATOR);
                            break;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            iVar2 = (i) F4.b(parcel, readInt5, i.CREATOR);
                            break;
                        default:
                            F4.n(parcel, readInt5);
                            break;
                    }
                }
                F4.g(parcel, o7);
                return new C0191j(str4, str5, str6, str7, str8, iVar, iVar2);
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                int o8 = F4.o(parcel);
                C0206o c0206o = null;
                String str9 = null;
                String str10 = null;
                C0208p[] c0208pArr = null;
                C0200m[] c0200mArr = null;
                String[] strArr2 = null;
                C0188h[] c0188hArr = null;
                while (parcel.dataPosition() < o8) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            c0206o = (C0206o) F4.b(parcel, readInt6, C0206o.CREATOR);
                            break;
                        case 2:
                            str9 = F4.c(parcel, readInt6);
                            break;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str10 = F4.c(parcel, readInt6);
                            break;
                        case 4:
                            c0208pArr = (C0208p[]) F4.e(parcel, readInt6, C0208p.CREATOR);
                            break;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            c0200mArr = (C0200m[]) F4.e(parcel, readInt6, C0200m.CREATOR);
                            break;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            strArr2 = F4.d(parcel, readInt6);
                            break;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            c0188hArr = (C0188h[]) F4.e(parcel, readInt6, C0188h.CREATOR);
                            break;
                        default:
                            F4.n(parcel, readInt6);
                            break;
                    }
                }
                F4.g(parcel, o8);
                return new C0194k(c0206o, str9, str10, c0208pArr, c0200mArr, strArr2, c0188hArr);
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                int o9 = F4.o(parcel);
                String str11 = null;
                String str12 = null;
                String str13 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String str18 = null;
                String str19 = null;
                String str20 = null;
                String str21 = null;
                String str22 = null;
                String str23 = null;
                String str24 = null;
                while (parcel.dataPosition() < o9) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 1:
                            str11 = F4.c(parcel, readInt7);
                            break;
                        case 2:
                            str12 = F4.c(parcel, readInt7);
                            break;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str13 = F4.c(parcel, readInt7);
                            break;
                        case 4:
                            str14 = F4.c(parcel, readInt7);
                            break;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            str15 = F4.c(parcel, readInt7);
                            break;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            str16 = F4.c(parcel, readInt7);
                            break;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str17 = F4.c(parcel, readInt7);
                            break;
                        case '\b':
                            str18 = F4.c(parcel, readInt7);
                            break;
                        case '\t':
                            str19 = F4.c(parcel, readInt7);
                            break;
                        case '\n':
                            str20 = F4.c(parcel, readInt7);
                            break;
                        case 11:
                            str21 = F4.c(parcel, readInt7);
                            break;
                        case '\f':
                            str22 = F4.c(parcel, readInt7);
                            break;
                        case '\r':
                            str23 = F4.c(parcel, readInt7);
                            break;
                        case 14:
                            str24 = F4.c(parcel, readInt7);
                            break;
                        default:
                            F4.n(parcel, readInt7);
                            break;
                    }
                }
                F4.g(parcel, o9);
                return new C0197l(str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24);
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                int o10 = F4.o(parcel);
                String str25 = null;
                String str26 = null;
                String str27 = null;
                int r63 = 0;
                while (parcel.dataPosition() < o10) {
                    int readInt8 = parcel.readInt();
                    char c6 = (char) readInt8;
                    if (c6 != 1) {
                        if (c6 != 2) {
                            if (c6 != 3) {
                                if (c6 != 4) {
                                    F4.n(parcel, readInt8);
                                } else {
                                    str27 = F4.c(parcel, readInt8);
                                }
                            } else {
                                str26 = F4.c(parcel, readInt8);
                            }
                        } else {
                            str25 = F4.c(parcel, readInt8);
                        }
                    } else {
                        r63 = F4.j(parcel, readInt8);
                    }
                }
                F4.g(parcel, o10);
                return new C0200m(r63, str25, str26, str27);
            case 8:
                int o11 = F4.o(parcel);
                double d4 = 0.0d;
                double d5 = 0.0d;
                while (parcel.dataPosition() < o11) {
                    int readInt9 = parcel.readInt();
                    char c7 = (char) readInt9;
                    if (c7 != 1) {
                        if (c7 != 2) {
                            F4.n(parcel, readInt9);
                        } else {
                            d5 = F4.i(parcel, readInt9);
                        }
                    } else {
                        d4 = F4.i(parcel, readInt9);
                    }
                }
                F4.g(parcel, o11);
                return new C0203n(d4, d5);
            case 9:
                int o12 = F4.o(parcel);
                String str28 = null;
                String str29 = null;
                String str30 = null;
                String str31 = null;
                String str32 = null;
                String str33 = null;
                String str34 = null;
                while (parcel.dataPosition() < o12) {
                    int readInt10 = parcel.readInt();
                    switch ((char) readInt10) {
                        case 1:
                            str28 = F4.c(parcel, readInt10);
                            break;
                        case 2:
                            str29 = F4.c(parcel, readInt10);
                            break;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            str30 = F4.c(parcel, readInt10);
                            break;
                        case 4:
                            str31 = F4.c(parcel, readInt10);
                            break;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            str32 = F4.c(parcel, readInt10);
                            break;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            str33 = F4.c(parcel, readInt10);
                            break;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            str34 = F4.c(parcel, readInt10);
                            break;
                        default:
                            F4.n(parcel, readInt10);
                            break;
                    }
                }
                F4.g(parcel, o12);
                return new C0206o(str28, str29, str30, str31, str32, str33, str34);
            case 10:
                int o13 = F4.o(parcel);
                String str35 = null;
                int r42 = 0;
                while (parcel.dataPosition() < o13) {
                    int readInt11 = parcel.readInt();
                    char c8 = (char) readInt11;
                    if (c8 != 1) {
                        if (c8 != 2) {
                            F4.n(parcel, readInt11);
                        } else {
                            str35 = F4.c(parcel, readInt11);
                        }
                    } else {
                        r42 = F4.j(parcel, readInt11);
                    }
                }
                F4.g(parcel, o13);
                return new C0208p(str35, r42);
            case 11:
                int o14 = F4.o(parcel);
                String str36 = null;
                String str37 = null;
                while (parcel.dataPosition() < o14) {
                    int readInt12 = parcel.readInt();
                    char c9 = (char) readInt12;
                    if (c9 != 1) {
                        if (c9 != 2) {
                            F4.n(parcel, readInt12);
                        } else {
                            str37 = F4.c(parcel, readInt12);
                        }
                    } else {
                        str36 = F4.c(parcel, readInt12);
                    }
                }
                F4.g(parcel, o14);
                return new C0210q(str36, str37);
            case 12:
                int o15 = F4.o(parcel);
                String str38 = null;
                String str39 = null;
                while (parcel.dataPosition() < o15) {
                    int readInt13 = parcel.readInt();
                    char c10 = (char) readInt13;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            F4.n(parcel, readInt13);
                        } else {
                            str39 = F4.c(parcel, readInt13);
                        }
                    } else {
                        str38 = F4.c(parcel, readInt13);
                    }
                }
                F4.g(parcel, o15);
                return new r(str38, str39);
            case 13:
                int o16 = F4.o(parcel);
                int r32 = 0;
                String str40 = null;
                String str41 = null;
                while (parcel.dataPosition() < o16) {
                    int readInt14 = parcel.readInt();
                    char c11 = (char) readInt14;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                F4.n(parcel, readInt14);
                            } else {
                                r32 = F4.j(parcel, readInt14);
                            }
                        } else {
                            str41 = F4.c(parcel, readInt14);
                        }
                    } else {
                        str40 = F4.c(parcel, readInt14);
                    }
                }
                F4.g(parcel, o16);
                return new C0213s(r32, str40, str41);
            default:
                int o17 = F4.o(parcel);
                long j3 = 0;
                int r72 = 0;
                int r82 = 0;
                int r92 = 0;
                int r102 = 0;
                while (parcel.dataPosition() < o17) {
                    int readInt15 = parcel.readInt();
                    char c12 = (char) readInt15;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    if (c12 != 5) {
                                        F4.n(parcel, readInt15);
                                    } else {
                                        j3 = F4.k(parcel, readInt15);
                                    }
                                } else {
                                    r102 = F4.j(parcel, readInt15);
                                }
                            } else {
                                r92 = F4.j(parcel, readInt15);
                            }
                        } else {
                            r82 = F4.j(parcel, readInt15);
                        }
                    } else {
                        r72 = F4.j(parcel, readInt15);
                    }
                }
                F4.g(parcel, o17);
                return new C0225y(r72, r82, r92, r102, j3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int r22) {
        switch (this.f2903a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new C0188h[r22];
            case 1:
                return new C0215t[r22];
            case 2:
                return new C0217u[r22];
            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                return new i[r22];
            case 4:
                return new C0191j[r22];
            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                return new C0194k[r22];
            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C0197l[r22];
            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C0200m[r22];
            case 8:
                return new C0203n[r22];
            case 9:
                return new C0206o[r22];
            case 10:
                return new C0208p[r22];
            case 11:
                return new C0210q[r22];
            case 12:
                return new r[r22];
            case 13:
                return new C0213s[r22];
            default:
                return new C0225y[r22];
        }
    }
}
