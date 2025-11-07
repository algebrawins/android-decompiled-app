package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class S0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Q0 f2846a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final R0 f2847b = new Object();

    public static int a(byte[] bArr, int r3, G g) {
        int n3 = n(bArr, r3, g);
        int r02 = g.f2789a;
        if (r02 >= 0) {
            if (r02 <= bArr.length - n3) {
                if (r02 == 0) {
                    g.f2791c = L.f2812K;
                    return n3;
                }
                g.f2791c = L.v(bArr, n3, r02);
                return n3 + r02;
            }
            throw C0198l0.d();
        }
        throw C0198l0.b();
    }

    public static String b(L l3) {
        StringBuilder sb = new StringBuilder(l3.j());
        for (int r12 = 0; r12 < l3.j(); r12++) {
            byte e4 = l3.e(r12);
            if (e4 != 34) {
                if (e4 != 39) {
                    if (e4 != 92) {
                        switch (e4) {
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (e4 >= 32 && e4 <= 126) {
                                    sb.append((char) e4);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((e4 >>> 6) & 3) + 48));
                                    sb.append((char) (((e4 >>> 3) & 7) + 48));
                                    sb.append((char) ((e4 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static int c(int r12) {
        return (r12 >>> 1) ^ (-(r12 & 1));
    }

    public static int d(byte[] bArr, int r4) {
        int r42 = (bArr[r4 + 1] & 255) << 8;
        return ((bArr[r4 + 3] & 255) << 24) | r42 | (bArr[r4] & 255) | ((bArr[r4 + 2] & 255) << 16);
    }

    public static int e(N0 n02, byte[] bArr, int r10, int r11, int r12, G g) {
        Object c4 = n02.c();
        int r3 = r(c4, n02, bArr, r10, r11, r12, g);
        n02.a(c4);
        g.f2791c = c4;
        return r3;
    }

    public static long f(long j3) {
        return (j3 >>> 1) ^ (-(1 & j3));
    }

    public static int g(N0 n02, byte[] bArr, int r9, int r10, G g) {
        Object c4 = n02.c();
        int s3 = s(c4, n02, bArr, r9, r10, g);
        n02.a(c4);
        g.f2791c = c4;
        return s3;
    }

    public static int h(N0 n02, int r3, byte[] bArr, int r5, int r6, i0 i0Var, G g) {
        int g3 = g(n02, bArr, r5, r6, g);
        i0Var.add(g.f2791c);
        while (g3 < r6) {
            int n3 = n(bArr, g3, g);
            if (r3 != g.f2789a) {
                break;
            }
            g3 = g(n02, bArr, n3, r6, g);
            i0Var.add(g.f2791c);
        }
        return g3;
    }

    public static boolean i(byte b3) {
        if (b3 > -65) {
            return true;
        }
        return false;
    }

    public static int j(byte[] bArr, int r3, i0 i0Var, G g) {
        C0171b0 c0171b0 = (C0171b0) i0Var;
        int n3 = n(bArr, r3, g);
        int r02 = g.f2789a + n3;
        while (n3 < r02) {
            n3 = n(bArr, n3, g);
            c0171b0.i(g.f2789a);
        }
        if (n3 == r02) {
            return n3;
        }
        throw C0198l0.d();
    }

    public static int k(byte[] bArr, int r4, G g) {
        int n3 = n(bArr, r4, g);
        int r02 = g.f2789a;
        if (r02 >= 0) {
            if (r02 == 0) {
                g.f2791c = "";
                return n3;
            }
            g.f2791c = new String(bArr, n3, r02, AbstractC0192j0.f2920a);
            return n3 + r02;
        }
        throw C0198l0.b();
    }

    public static int l(byte[] bArr, int r14, G g) {
        int n3 = n(bArr, r14, g);
        int r4 = g.f2789a;
        if (r4 >= 0) {
            if (r4 == 0) {
                g.f2791c = "";
                return n3;
            }
            int length = bArr.length;
            C0173c c0173c = AbstractC0187g1.f2904a;
            if ((n3 | r4 | ((length - n3) - r4)) >= 0) {
                int r5 = n3 + r4;
                char[] cArr = new char[r4];
                int r6 = 0;
                while (n3 < r5) {
                    byte b3 = bArr[n3];
                    if (b3 < 0) {
                        break;
                    }
                    n3++;
                    cArr[r6] = (char) b3;
                    r6++;
                }
                while (n3 < r5) {
                    int r7 = n3 + 1;
                    byte b4 = bArr[n3];
                    if (b4 >= 0) {
                        cArr[r6] = (char) b4;
                        r6++;
                        n3 = r7;
                        while (n3 < r5) {
                            byte b5 = bArr[n3];
                            if (b5 >= 0) {
                                n3++;
                                cArr[r6] = (char) b5;
                                r6++;
                            }
                        }
                    } else if (b4 < -32) {
                        if (r7 < r5) {
                            n3 += 2;
                            byte b6 = bArr[r7];
                            int r9 = r6 + 1;
                            if (b4 >= -62 && !i(b6)) {
                                cArr[r6] = (char) ((b6 & 63) | ((b4 & 31) << 6));
                                r6 = r9;
                            } else {
                                throw C0198l0.a();
                            }
                        } else {
                            throw C0198l0.a();
                        }
                    } else if (b4 < -16) {
                        if (r7 < r5 - 1) {
                            int r10 = n3 + 2;
                            byte b7 = bArr[r7];
                            n3 += 3;
                            byte b8 = bArr[r10];
                            int r11 = r6 + 1;
                            if (!i(b7)) {
                                if (b4 == -32) {
                                    if (b7 >= -96) {
                                        b4 = -32;
                                    }
                                }
                                if (b4 == -19) {
                                    if (b7 < -96) {
                                        b4 = -19;
                                    }
                                }
                                if (!i(b8)) {
                                    cArr[r6] = (char) (((b7 & 63) << 6) | ((b4 & 15) << 12) | (b8 & 63));
                                    r6 = r11;
                                }
                            }
                            throw C0198l0.a();
                        }
                        throw C0198l0.a();
                    } else if (r7 < r5 - 2) {
                        byte b9 = bArr[r7];
                        int r102 = n3 + 3;
                        byte b10 = bArr[n3 + 2];
                        n3 += 4;
                        byte b11 = bArr[r102];
                        if (!i(b9) && (((b9 + 112) + (b4 << 28)) >> 30) == 0 && !i(b10) && !i(b11)) {
                            int r72 = ((b9 & 63) << 12) | ((b4 & 7) << 18) | ((b10 & 63) << 6) | (b11 & 63);
                            cArr[r6] = (char) ((r72 >>> 10) + 55232);
                            cArr[r6 + 1] = (char) ((r72 & 1023) + 56320);
                            r6 += 2;
                        } else {
                            throw C0198l0.a();
                        }
                    } else {
                        throw C0198l0.a();
                    }
                }
                g.f2791c = new String(cArr, 0, r6);
                return r5;
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(n3), Integer.valueOf(r4)));
        }
        throw C0198l0.b();
    }

    public static int m(int r9, byte[] bArr, int r11, int r12, V0 v02, G g) {
        if ((r9 >>> 3) != 0) {
            int r02 = r9 & 7;
            if (r02 != 0) {
                if (r02 != 1) {
                    if (r02 != 2) {
                        if (r02 != 3) {
                            if (r02 == 5) {
                                v02.c(r9, Integer.valueOf(d(bArr, r11)));
                                return r11 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int r03 = (r9 & (-8)) | 4;
                        V0 b3 = V0.b();
                        int r13 = 0;
                        while (true) {
                            if (r11 >= r12) {
                                break;
                            }
                            int n3 = n(bArr, r11, g);
                            int r112 = g.f2789a;
                            r13 = r112;
                            if (r112 != r03) {
                                int m3 = m(r13, bArr, n3, r12, b3, g);
                                r13 = r112;
                                r11 = m3;
                            } else {
                                r11 = n3;
                                break;
                            }
                        }
                        if (r11 <= r12 && r13 == r03) {
                            v02.c(r9, b3);
                            return r11;
                        }
                        throw C0198l0.c();
                    }
                    int n4 = n(bArr, r11, g);
                    int r122 = g.f2789a;
                    if (r122 >= 0) {
                        if (r122 <= bArr.length - n4) {
                            if (r122 == 0) {
                                v02.c(r9, L.f2812K);
                            } else {
                                v02.c(r9, L.v(bArr, n4, r122));
                            }
                            return n4 + r122;
                        }
                        throw C0198l0.d();
                    }
                    throw C0198l0.b();
                }
                v02.c(r9, Long.valueOf(u(bArr, r11)));
                return r11 + 8;
            }
            int q3 = q(bArr, r11, g);
            v02.c(r9, Long.valueOf(g.f2790b));
            return q3;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int n(byte[] bArr, int r22, G g) {
        int r02 = r22 + 1;
        byte b3 = bArr[r22];
        if (b3 >= 0) {
            g.f2789a = b3;
            return r02;
        }
        return o(b3, bArr, r02, g);
    }

    public static int o(int r22, byte[] bArr, int r4, G g) {
        byte b3 = bArr[r4];
        int r12 = r4 + 1;
        int r23 = r22 & 127;
        if (b3 >= 0) {
            g.f2789a = r23 | (b3 << 7);
            return r12;
        }
        int r24 = r23 | ((b3 & Byte.MAX_VALUE) << 7);
        int r02 = r4 + 2;
        byte b4 = bArr[r12];
        if (b4 >= 0) {
            g.f2789a = r24 | (b4 << 14);
            return r02;
        }
        int r25 = r24 | ((b4 & Byte.MAX_VALUE) << 14);
        int r13 = r4 + 3;
        byte b5 = bArr[r02];
        if (b5 >= 0) {
            g.f2789a = r25 | (b5 << 21);
            return r13;
        }
        int r26 = r25 | ((b5 & Byte.MAX_VALUE) << 21);
        int r42 = r4 + 4;
        byte b6 = bArr[r13];
        if (b6 >= 0) {
            g.f2789a = r26 | (b6 << 28);
            return r42;
        }
        int r27 = r26 | ((b6 & Byte.MAX_VALUE) << 28);
        while (true) {
            int r03 = r42 + 1;
            if (bArr[r42] < 0) {
                r42 = r03;
            } else {
                g.f2789a = r27;
                return r03;
            }
        }
    }

    public static int p(int r22, byte[] bArr, int r4, int r5, i0 i0Var, G g) {
        C0171b0 c0171b0 = (C0171b0) i0Var;
        int n3 = n(bArr, r4, g);
        c0171b0.i(g.f2789a);
        while (n3 < r5) {
            int n4 = n(bArr, n3, g);
            if (r22 != g.f2789a) {
                break;
            }
            n3 = n(bArr, n4, g);
            c0171b0.i(g.f2789a);
        }
        return n3;
    }

    public static int q(byte[] bArr, int r10, G g) {
        byte b3;
        long j3 = bArr[r10];
        int r22 = r10 + 1;
        if (j3 >= 0) {
            g.f2790b = j3;
            return r22;
        }
        int r102 = r10 + 2;
        byte b4 = bArr[r22];
        long j4 = (j3 & 127) | ((b4 & Byte.MAX_VALUE) << 7);
        int r3 = 7;
        while (b4 < 0) {
            int r23 = r102 + 1;
            r3 += 7;
            j4 |= (b3 & Byte.MAX_VALUE) << r3;
            b4 = bArr[r102];
            r102 = r23;
        }
        g.f2790b = j4;
        return r102;
    }

    public static int r(Object obj, N0 n02, byte[] bArr, int r10, int r11, int r12, G g) {
        int A3 = ((C0) n02).A(obj, bArr, r10, r11, r12, g);
        g.f2791c = obj;
        return A3;
    }

    public static int s(Object obj, N0 n02, byte[] bArr, int r9, int r10, G g) {
        int r02 = r9 + 1;
        int r92 = bArr[r9];
        if (r92 < 0) {
            r02 = o(r92, bArr, r02, g);
            r92 = g.f2789a;
        }
        int r3 = r02;
        if (r92 >= 0 && r92 <= r10 - r3) {
            int r93 = r92 + r3;
            n02.h(obj, bArr, r3, r93, g);
            g.f2791c = obj;
            return r93;
        }
        throw C0198l0.d();
    }

    public static int t(int r3, byte[] bArr, int r5, int r6, G g) {
        if ((r3 >>> 3) != 0) {
            int r02 = r3 & 7;
            if (r02 != 0) {
                if (r02 != 1) {
                    if (r02 != 2) {
                        if (r02 != 3) {
                            if (r02 == 5) {
                                return r5 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int r32 = (r3 & (-8)) | 4;
                        int r03 = 0;
                        while (r5 < r6) {
                            r5 = n(bArr, r5, g);
                            r03 = g.f2789a;
                            if (r03 == r32) {
                                break;
                            }
                            r5 = t(r03, bArr, r5, r6, g);
                        }
                        if (r5 <= r6 && r03 == r32) {
                            return r5;
                        }
                        throw C0198l0.c();
                    }
                    return n(bArr, r5, g) + g.f2789a;
                }
                return r5 + 8;
            }
            return q(bArr, r5, g);
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static long u(byte[] bArr, int r19) {
        return (bArr[r19] & 255) | ((bArr[r19 + 1] & 255) << 8) | ((bArr[r19 + 2] & 255) << 16) | ((bArr[r19 + 3] & 255) << 24) | ((bArr[r19 + 4] & 255) << 32) | ((bArr[r19 + 5] & 255) << 40) | ((bArr[r19 + 6] & 255) << 48) | ((bArr[r19 + 7] & 255) << 56);
    }
}
