package Y;

import android.graphics.Path;
import android.util.Log;
import x1.AbstractC0739x0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public char f1641a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f1642b;

    public d(char c4, float[] fArr) {
        this.f1641a = c4;
        this.f1642b = fArr;
    }

    public static void a(Path path, float f2, float f4, float f5, float f6, float f7, float f8, float f9, boolean z3, boolean z4) {
        double d4;
        double d5;
        double radians = Math.toRadians(f9);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d6 = f2;
        double d7 = f4;
        double d8 = (d7 * sin) + (d6 * cos);
        double d9 = d6;
        double d10 = f7;
        double d11 = d8 / d10;
        double d12 = f8;
        double d13 = ((d7 * cos) + ((-f2) * sin)) / d12;
        double d14 = d7;
        double d15 = f6;
        double d16 = ((d15 * sin) + (f5 * cos)) / d10;
        double d17 = ((d15 * cos) + ((-f5) * sin)) / d12;
        double d18 = d11 - d16;
        double d19 = d13 - d17;
        double d20 = (d11 + d16) / 2.0d;
        double d21 = (d13 + d17) / 2.0d;
        double d22 = (d19 * d19) + (d18 * d18);
        if (d22 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d23 = (1.0d / d22) - 0.25d;
        if (d23 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d22);
            float sqrt = (float) (Math.sqrt(d22) / 1.99999d);
            a(path, f2, f4, f5, f6, f7 * sqrt, f8 * sqrt, f9, z3, z4);
            return;
        }
        double sqrt2 = Math.sqrt(d23);
        double d24 = d18 * sqrt2;
        double d25 = sqrt2 * d19;
        if (z3 == z4) {
            d4 = d20 - d25;
            d5 = d21 + d24;
        } else {
            d4 = d20 + d25;
            d5 = d21 - d24;
        }
        double atan2 = Math.atan2(d13 - d5, d11 - d4);
        double atan22 = Math.atan2(d17 - d5, d16 - d4) - atan2;
        int r22 = 0;
        int r3 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z4 != (r3 >= 0)) {
            atan22 = r3 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d26 = d4 * d10;
        double d27 = d5 * d12;
        double d28 = (d26 * cos) - (d27 * sin);
        double d29 = (d27 * cos) + (d26 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d30 = -d10;
        double d31 = d30 * cos2;
        double d32 = d12 * sin2;
        double d33 = (d31 * sin3) - (d32 * cos3);
        double d34 = d30 * sin2;
        double d35 = d12 * cos2;
        double d36 = (cos3 * d35) + (sin3 * d34);
        double d37 = atan22 / ceil;
        double d38 = atan2;
        while (r22 < ceil) {
            double d39 = d38 + d37;
            double sin4 = Math.sin(d39);
            double cos4 = Math.cos(d39);
            double d40 = d37;
            double d41 = (((d10 * cos2) * cos4) + d28) - (d32 * sin4);
            double d42 = d28;
            double d43 = (d35 * sin4) + (d10 * sin2 * cos4) + d29;
            double d44 = (d31 * sin4) - (d32 * cos4);
            double d45 = (cos4 * d35) + (sin4 * d34);
            double d46 = d39 - d38;
            double tan = Math.tan(d46 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d46)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d33 * sqrt3) + d9), (float) ((d36 * sqrt3) + d14), (float) (d41 - (sqrt3 * d44)), (float) (d43 - (sqrt3 * d45)), (float) d41, (float) d43);
            r22++;
            d35 = d35;
            d34 = d34;
            ceil = ceil;
            cos2 = cos2;
            d38 = d39;
            d10 = d10;
            d36 = d45;
            d33 = d44;
            d9 = d41;
            d14 = d43;
            d37 = d40;
            d28 = d42;
        }
    }

    public static void b(d[] dVarArr, Path path) {
        int r22;
        int r32;
        char c4;
        int r30;
        int r27;
        d dVar;
        boolean z3;
        boolean z4;
        float f2;
        float f4;
        boolean z5;
        boolean z6;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        d[] dVarArr2 = dVarArr;
        float[] fArr = new float[6];
        int length = dVarArr2.length;
        char c5 = 'm';
        int r10 = 0;
        while (r10 < length) {
            d dVar2 = dVarArr2[r10];
            char c6 = dVar2.f1641a;
            float f15 = fArr[0];
            float f16 = fArr[1];
            float f17 = fArr[2];
            float f18 = fArr[3];
            float f19 = fArr[4];
            float f20 = fArr[5];
            switch (c6) {
                case 'A':
                case 'a':
                    r22 = 7;
                    break;
                case 'C':
                case 'c':
                    r22 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    r22 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    r22 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f19, f20);
                    f15 = f19;
                    f17 = f15;
                    f16 = f20;
                    f18 = f16;
                default:
                    r22 = 2;
                    break;
            }
            float f21 = f19;
            float f22 = f20;
            float f23 = f15;
            float f24 = f16;
            int r3 = 0;
            while (true) {
                float[] fArr2 = dVar2.f1642b;
                if (r3 < fArr2.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 != 'H') {
                                if (c6 != 'Q') {
                                    if (c6 != 'V') {
                                        if (c6 != 'a') {
                                            if (c6 != 'c') {
                                                if (c6 != 'h') {
                                                    if (c6 != 'q') {
                                                        if (c6 != 'v') {
                                                            if (c6 != 'L') {
                                                                if (c6 != 'M') {
                                                                    if (c6 != 'S') {
                                                                        if (c6 != 'T') {
                                                                            if (c6 != 'l') {
                                                                                if (c6 != 'm') {
                                                                                    if (c6 != 's') {
                                                                                        if (c6 != 't') {
                                                                                            r32 = r3;
                                                                                        } else {
                                                                                            if (c5 != 'q' && c5 != 't' && c5 != 'Q' && c5 != 'T') {
                                                                                                f14 = 0.0f;
                                                                                                f13 = 0.0f;
                                                                                            } else {
                                                                                                f13 = f23 - f17;
                                                                                                f14 = f24 - f18;
                                                                                            }
                                                                                            int r5 = r3 + 1;
                                                                                            path.rQuadTo(f13, f14, fArr2[r3], fArr2[r5]);
                                                                                            float f25 = f13 + f23;
                                                                                            float f26 = f14 + f24;
                                                                                            f23 += fArr2[r3];
                                                                                            f24 += fArr2[r5];
                                                                                            f18 = f26;
                                                                                            r32 = r3;
                                                                                            c4 = c6;
                                                                                            r30 = r10;
                                                                                            r27 = length;
                                                                                            f17 = f25;
                                                                                        }
                                                                                    } else {
                                                                                        if (c5 != 'c' && c5 != 's' && c5 != 'C' && c5 != 'S') {
                                                                                            f11 = 0.0f;
                                                                                            f12 = 0.0f;
                                                                                        } else {
                                                                                            float f27 = f23 - f17;
                                                                                            f11 = f24 - f18;
                                                                                            f12 = f27;
                                                                                        }
                                                                                        int r12 = r3 + 1;
                                                                                        int r26 = r3 + 2;
                                                                                        int r28 = r3 + 3;
                                                                                        r32 = r3;
                                                                                        float f28 = f24;
                                                                                        float f29 = f23;
                                                                                        path.rCubicTo(f12, f11, fArr2[r3], fArr2[r12], fArr2[r26], fArr2[r28]);
                                                                                        f5 = f29 + fArr2[r32];
                                                                                        f6 = f28 + fArr2[r12];
                                                                                        f7 = f29 + fArr2[r26];
                                                                                        f8 = fArr2[r28] + f28;
                                                                                    }
                                                                                } else {
                                                                                    r32 = r3;
                                                                                    float f30 = fArr2[r32];
                                                                                    f23 += f30;
                                                                                    float f31 = fArr2[r32 + 1];
                                                                                    f24 += f31;
                                                                                    if (r32 > 0) {
                                                                                        path.rLineTo(f30, f31);
                                                                                    } else {
                                                                                        path.rMoveTo(f30, f31);
                                                                                        f22 = f24;
                                                                                        f21 = f23;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                r32 = r3;
                                                                                int r33 = r32 + 1;
                                                                                path.rLineTo(fArr2[r32], fArr2[r33]);
                                                                                f23 += fArr2[r32];
                                                                                f24 += fArr2[r33];
                                                                            }
                                                                        } else {
                                                                            r32 = r3;
                                                                            float f32 = f24;
                                                                            float f33 = f23;
                                                                            if (c5 != 'q' && c5 != 't' && c5 != 'Q' && c5 != 'T') {
                                                                                f5 = f33;
                                                                                f6 = f32;
                                                                            } else {
                                                                                f5 = (f33 * 2.0f) - f17;
                                                                                f6 = (f32 * 2.0f) - f18;
                                                                            }
                                                                            int r34 = r32 + 1;
                                                                            path.quadTo(f5, f6, fArr2[r32], fArr2[r34]);
                                                                            f7 = fArr2[r32];
                                                                            f8 = fArr2[r34];
                                                                        }
                                                                    } else {
                                                                        r32 = r3;
                                                                        float f34 = f24;
                                                                        float f35 = f23;
                                                                        if (c5 != 'c' && c5 != 's' && c5 != 'C' && c5 != 'S') {
                                                                            f10 = f35;
                                                                            f9 = f34;
                                                                        } else {
                                                                            f9 = (f34 * 2.0f) - f18;
                                                                            f10 = (f35 * 2.0f) - f17;
                                                                        }
                                                                        int r02 = r32 + 1;
                                                                        int r122 = r32 + 2;
                                                                        int r15 = r32 + 3;
                                                                        path.cubicTo(f10, f9, fArr2[r32], fArr2[r02], fArr2[r122], fArr2[r15]);
                                                                        float f36 = fArr2[r32];
                                                                        float f37 = fArr2[r02];
                                                                        f23 = fArr2[r122];
                                                                        f24 = fArr2[r15];
                                                                        f18 = f37;
                                                                        f17 = f36;
                                                                    }
                                                                } else {
                                                                    r32 = r3;
                                                                    f23 = fArr2[r32];
                                                                    f24 = fArr2[r32 + 1];
                                                                    if (r32 > 0) {
                                                                        path.lineTo(f23, f24);
                                                                    } else {
                                                                        path.moveTo(f23, f24);
                                                                        f22 = f24;
                                                                        f21 = f23;
                                                                    }
                                                                }
                                                            } else {
                                                                r32 = r3;
                                                                int r35 = r32 + 1;
                                                                path.lineTo(fArr2[r32], fArr2[r35]);
                                                                f23 = fArr2[r32];
                                                                f24 = fArr2[r35];
                                                            }
                                                        } else {
                                                            r32 = r3;
                                                            path.rLineTo(0.0f, fArr2[r32]);
                                                            f24 += fArr2[r32];
                                                        }
                                                    } else {
                                                        r32 = r3;
                                                        float f38 = f24;
                                                        float f39 = f23;
                                                        int r36 = r32 + 1;
                                                        int r4 = r32 + 2;
                                                        int r6 = r32 + 3;
                                                        path.rQuadTo(fArr2[r32], fArr2[r36], fArr2[r4], fArr2[r6]);
                                                        float f40 = f39 + fArr2[r32];
                                                        float f41 = f39 + fArr2[r4];
                                                        f24 = f38 + fArr2[r6];
                                                        f18 = fArr2[r36] + f38;
                                                        f17 = f40;
                                                        c4 = c6;
                                                        r30 = r10;
                                                        r27 = length;
                                                        f23 = f41;
                                                    }
                                                    dVar = dVar2;
                                                } else {
                                                    r32 = r3;
                                                    path.rLineTo(fArr2[r32], 0.0f);
                                                    f23 += fArr2[r32];
                                                }
                                                c4 = c6;
                                                r30 = r10;
                                                r27 = length;
                                                dVar = dVar2;
                                            } else {
                                                r32 = r3;
                                                float f42 = f24;
                                                float f43 = f23;
                                                int r152 = r32 + 2;
                                                int r25 = r32 + 3;
                                                int r262 = r32 + 4;
                                                int r272 = r32 + 5;
                                                path.rCubicTo(fArr2[r32], fArr2[r32 + 1], fArr2[r152], fArr2[r25], fArr2[r262], fArr2[r272]);
                                                f5 = f43 + fArr2[r152];
                                                f6 = f42 + fArr2[r25];
                                                f7 = f43 + fArr2[r262];
                                                f8 = fArr2[r272] + f42;
                                            }
                                            f18 = f6;
                                            f17 = f5;
                                            c4 = c6;
                                            r30 = r10;
                                            r27 = length;
                                            f23 = f7;
                                            f24 = f8;
                                            dVar = dVar2;
                                        } else {
                                            r32 = r3;
                                            float f44 = f24;
                                            float f45 = f23;
                                            int r153 = r32 + 5;
                                            float f46 = fArr2[r153] + f45;
                                            int r263 = r32 + 6;
                                            float f47 = fArr2[r263] + f44;
                                            float f48 = fArr2[r32];
                                            float f49 = fArr2[r32 + 1];
                                            float f50 = fArr2[r32 + 2];
                                            if (fArr2[r32 + 3] != 0.0f) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            if (fArr2[r32 + 4] != 0.0f) {
                                                z6 = true;
                                            } else {
                                                z6 = false;
                                            }
                                            c4 = c6;
                                            r27 = length;
                                            dVar = dVar2;
                                            r30 = r10;
                                            a(path, f45, f44, f46, f47, f48, f49, f50, z5, z6);
                                            f23 = f45 + fArr2[r153];
                                            f24 = f44 + fArr2[r263];
                                        }
                                    } else {
                                        r32 = r3;
                                        c4 = c6;
                                        r30 = r10;
                                        r27 = length;
                                        dVar = dVar2;
                                        path.lineTo(f23, fArr2[r32]);
                                        f24 = fArr2[r32];
                                    }
                                } else {
                                    r32 = r3;
                                    c4 = c6;
                                    r30 = r10;
                                    r27 = length;
                                    dVar = dVar2;
                                    float f51 = fArr2[r32];
                                    int r37 = r32 + 1;
                                    float f52 = fArr2[r37];
                                    int r23 = r32 + 2;
                                    int r52 = r32 + 3;
                                    path.quadTo(f51, f52, fArr2[r23], fArr2[r52]);
                                    f2 = fArr2[r32];
                                    f4 = fArr2[r37];
                                    f23 = fArr2[r23];
                                    f24 = fArr2[r52];
                                }
                            } else {
                                r32 = r3;
                                c4 = c6;
                                r30 = r10;
                                r27 = length;
                                dVar = dVar2;
                                path.lineTo(fArr2[r32], f24);
                                f23 = fArr2[r32];
                            }
                            r3 = r32 + r22;
                            dVar2 = dVar;
                            length = r27;
                            c5 = c4;
                            c6 = c5;
                            r10 = r30;
                        } else {
                            r32 = r3;
                            c4 = c6;
                            r30 = r10;
                            r27 = length;
                            dVar = dVar2;
                            int r03 = r32 + 2;
                            int r8 = r32 + 3;
                            int r9 = r32 + 4;
                            int r102 = r32 + 5;
                            path.cubicTo(fArr2[r32], fArr2[r32 + 1], fArr2[r03], fArr2[r8], fArr2[r9], fArr2[r102]);
                            f23 = fArr2[r9];
                            f24 = fArr2[r102];
                            f2 = fArr2[r03];
                            f4 = fArr2[r8];
                        }
                        f17 = f2;
                        f18 = f4;
                        r3 = r32 + r22;
                        dVar2 = dVar;
                        length = r27;
                        c5 = c4;
                        c6 = c5;
                        r10 = r30;
                    } else {
                        r32 = r3;
                        float f53 = f24;
                        float f54 = f23;
                        c4 = c6;
                        r30 = r10;
                        r27 = length;
                        dVar = dVar2;
                        int r154 = r32 + 5;
                        float f55 = fArr2[r154];
                        int r264 = r32 + 6;
                        float f56 = fArr2[r264];
                        float f57 = fArr2[r32];
                        float f58 = fArr2[r32 + 1];
                        float f59 = fArr2[r32 + 2];
                        if (fArr2[r32 + 3] != 0.0f) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (fArr2[r32 + 4] != 0.0f) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        a(path, f54, f53, f55, f56, f57, f58, f59, z3, z4);
                        f23 = fArr2[r154];
                        f24 = fArr2[r264];
                    }
                    f18 = f24;
                    f17 = f23;
                    r3 = r32 + r22;
                    dVar2 = dVar;
                    length = r27;
                    c5 = c4;
                    c6 = c5;
                    r10 = r30;
                }
            }
            fArr[0] = f23;
            fArr[1] = f24;
            fArr[2] = f17;
            fArr[3] = f18;
            fArr[4] = f21;
            fArr[5] = f22;
            c5 = dVar2.f1641a;
            r10++;
            dVarArr2 = dVarArr;
            length = length;
        }
    }

    public d(d dVar) {
        this.f1641a = dVar.f1641a;
        float[] fArr = dVar.f1642b;
        this.f1642b = AbstractC0739x0.b(fArr, fArr.length);
    }
}
