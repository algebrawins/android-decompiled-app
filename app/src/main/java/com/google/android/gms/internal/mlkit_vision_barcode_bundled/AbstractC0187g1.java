package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0187g1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C0173c f2904a;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.mlkit_vision_barcode_bundled.c] */
    static {
        if (AbstractC0181e1.f2901e && AbstractC0181e1.f2900d) {
            int r02 = F.f2787a;
        }
        f2904a = new Object();
    }

    public static int a(byte[] bArr, int r6, int r7) {
        int r72 = r7 - r6;
        byte b3 = bArr[r6 - 1];
        if (r72 != 0) {
            if (r72 != 1) {
                if (r72 == 2) {
                    byte b4 = bArr[r6];
                    byte b5 = bArr[r6 + 1];
                    if (b3 <= -12 && b4 <= -65 && b5 <= -65) {
                        return (b5 << 16) ^ ((b4 << 8) ^ b3);
                    }
                } else {
                    throw new AssertionError();
                }
            } else {
                return e(b3, bArr[r6]);
            }
        } else if (b3 <= -12) {
            return b3;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fc, code lost:
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(java.lang.String r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC0187g1.b(java.lang.String, byte[], int, int):int");
    }

    public static int c(String str) {
        int length = str.length();
        int r12 = 0;
        int r22 = 0;
        while (r22 < length && str.charAt(r22) < 128) {
            r22++;
        }
        int r3 = length;
        while (true) {
            if (r22 >= length) {
                break;
            }
            char charAt = str.charAt(r22);
            if (charAt < 2048) {
                r3 += (127 - charAt) >>> 31;
                r22++;
            } else {
                int length2 = str.length();
                while (r22 < length2) {
                    char charAt2 = str.charAt(r22);
                    if (charAt2 < 2048) {
                        r12 += (127 - charAt2) >>> 31;
                    } else {
                        r12 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, r22) >= 65536) {
                                r22++;
                            } else {
                                throw new C0184f1(r22, length2);
                            }
                        }
                    }
                    r22++;
                }
                r3 += r12;
            }
        }
        if (r3 >= length) {
            return r3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r3 + 4294967296L));
    }

    public static boolean d(byte[] bArr, int r22, int r3) {
        f2904a.getClass();
        if (C0173c.a(0, r22, r3, bArr) != 0) {
            return false;
        }
        return true;
    }

    public static int e(int r12, int r22) {
        if (r12 > -12 || r22 > -65) {
            return -1;
        }
        return r12 ^ (r22 << 8);
    }
}
