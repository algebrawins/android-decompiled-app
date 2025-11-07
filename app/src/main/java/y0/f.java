package y0;

import D.C;
import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import w1.u;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final u f6209a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6210b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f6211c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f6212d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f6213e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f6214f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f6215h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f6216i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f6217j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] b(b[] bVarArr, byte[] bArr) {
        int r3 = 0;
        for (b bVar : bVarArr) {
            r3 += ((((bVar.g * 2) + 7) & (-8)) / 8) + (bVar.f6205e * 2) + d(bVar.f6201a, bVar.f6202b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f6206f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(r3);
        if (Arrays.equals(bArr, f6214f)) {
            for (b bVar2 : bVarArr) {
                p(byteArrayOutputStream, bVar2, d(bVar2.f6201a, bVar2.f6202b, bArr));
                r(byteArrayOutputStream, bVar2);
                int[] r6 = bVar2.f6207h;
                int length = r6.length;
                int r8 = 0;
                int r9 = 0;
                while (r8 < length) {
                    int r10 = r6[r8];
                    u(byteArrayOutputStream, r10 - r9);
                    r8++;
                    r9 = r10;
                }
                q(byteArrayOutputStream, bVar2);
            }
        } else {
            for (b bVar3 : bVarArr) {
                p(byteArrayOutputStream, bVar3, d(bVar3.f6201a, bVar3.f6202b, bArr));
            }
            for (b bVar4 : bVarArr) {
                r(byteArrayOutputStream, bVar4);
                int[] r5 = bVar4.f6207h;
                int length2 = r5.length;
                int r7 = 0;
                int r82 = 0;
                while (r7 < length2) {
                    int r92 = r5[r7];
                    u(byteArrayOutputStream, r92 - r82);
                    r7++;
                    r82 = r92;
                }
                q(byteArrayOutputStream, bVar4);
            }
        }
        if (byteArrayOutputStream.size() == r3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + r3);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z3 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            return z3;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f6215h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
            return str2;
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (str2.endsWith(".apk")) {
                    return str2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                if (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) {
                    str3 = ":";
                }
                return C.z(sb, str3, str2);
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
                return str2;
            }
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int r4) {
        byte[] bArr = new byte[r4];
        int r12 = 0;
        while (r12 < r4) {
            int read = inputStream.read(bArr, r12, r4 - r12);
            if (read >= 0) {
                r12 += read;
            } else {
                throw new IllegalStateException(C.w("Not enough bytes to read: ", r4));
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int r6) {
        int[] r02 = new int[r6];
        int r22 = 0;
        for (int r12 = 0; r12 < r6; r12++) {
            r22 += (int) m(byteArrayInputStream, 2);
            r02[r12] = r22;
        }
        return r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = 0
            r5 = 0
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.f.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static b[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) {
        byte[] bArr3 = f6216i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f6212d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m3 = (int) m(fileInputStream, 1);
                    byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                        try {
                            b[] j3 = j(byteArrayInputStream, m3, bVarArr);
                            byteArrayInputStream.close();
                            return j3;
                        } catch (Throwable th) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    throw new IllegalStateException("Content found after the end of file");
                }
                throw new IllegalStateException("Unsupported meta version");
            }
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, f6217j)) {
            int m4 = (int) m(fileInputStream, 2);
            byte[] h4 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h4);
                try {
                    b[] k3 = k(byteArrayInputStream2, bArr2, m4, bVarArr);
                    byteArrayInputStream2.close();
                    return k3;
                } catch (Throwable th3) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static b[] j(ByteArrayInputStream byteArrayInputStream, int r8, b[] bVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (r8 == bVarArr.length) {
            String[] strArr = new String[r8];
            int[] r22 = new int[r8];
            for (int r3 = 0; r3 < r8; r3++) {
                int m3 = (int) m(byteArrayInputStream, 2);
                r22[r3] = (int) m(byteArrayInputStream, 2);
                strArr[r3] = new String(f(byteArrayInputStream, m3), StandardCharsets.UTF_8);
            }
            for (int r12 = 0; r12 < r8; r12++) {
                b bVar = bVarArr[r12];
                if (bVar.f6202b.equals(strArr[r12])) {
                    int r4 = r22[r12];
                    bVar.f6205e = r4;
                    bVar.f6207h = g(byteArrayInputStream, r4);
                } else {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int r12, b[] bVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (r12 == bVarArr.length) {
            for (int r02 = 0; r02 < r12; r02++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m3 = m(byteArrayInputStream, 4);
                int m4 = (int) m(byteArrayInputStream, 2);
                b bVar = null;
                if (bVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int r8 = 0;
                    while (true) {
                        if (r8 >= bVarArr.length) {
                            break;
                        } else if (bVarArr[r8].f6202b.equals(str)) {
                            bVar = bVarArr[r8];
                            break;
                        } else {
                            r8++;
                        }
                    }
                }
                if (bVar != null) {
                    bVar.f6204d = m3;
                    int[] g3 = g(byteArrayInputStream, m4);
                    if (Arrays.equals(bArr, f6215h)) {
                        bVar.f6205e = m4;
                        bVar.f6207h = g3;
                    }
                } else {
                    throw new IllegalStateException("Missing profile key: ".concat(str2));
                }
            }
            return bVarArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static b[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f6213e)) {
            int m3 = (int) m(fileInputStream, 1);
            byte[] h3 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h3);
                try {
                    b[] n3 = n(byteArrayInputStream, str, m3);
                    byteArrayInputStream.close();
                    return n3;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static long m(InputStream inputStream, int r7) {
        byte[] f2 = f(inputStream, r7);
        long j3 = 0;
        for (int r22 = 0; r22 < r7; r22++) {
            j3 += (f2[r22] & 255) << (r22 * 8);
        }
        return j3;
    }

    public static b[] n(ByteArrayInputStream byteArrayInputStream, String str, int r21) {
        TreeMap treeMap;
        int r9;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[r21];
        for (int r4 = 0; r4 < r21; r4++) {
            int m3 = (int) m(byteArrayInputStream, 2);
            bVarArr[r4] = new b(str, new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m3, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m3], new TreeMap());
        }
        for (int r42 = 0; r42 < r21; r42++) {
            b bVar = bVarArr[r42];
            int available = byteArrayInputStream.available() - bVar.f6206f;
            int r8 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = bVar.f6208i;
                if (available2 <= available) {
                    break;
                }
                r8 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(r8), 1);
                for (int m4 = (int) m(byteArrayInputStream, 2); m4 > 0; m4--) {
                    m(byteArrayInputStream, 2);
                    int m5 = (int) m(byteArrayInputStream, 1);
                    if (m5 != 6 && m5 != 7) {
                        while (m5 > 0) {
                            m(byteArrayInputStream, 1);
                            for (int m6 = (int) m(byteArrayInputStream, 1); m6 > 0; m6--) {
                                m(byteArrayInputStream, 2);
                            }
                            m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() == available) {
                bVar.f6207h = g(byteArrayInputStream, bVar.f6205e);
                int r6 = bVar.g;
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((r6 * 2) + 7) & (-8)) / 8));
                for (int r82 = 0; r82 < r6; r82++) {
                    if (valueOf.get(r82)) {
                        r9 = 2;
                    } else {
                        r9 = 0;
                    }
                    if (valueOf.get(r82 + r6)) {
                        r9 |= 4;
                    }
                    if (r9 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(r82));
                        if (num == null) {
                            num = 0;
                        }
                        treeMap.put(Integer.valueOf(r82), Integer.valueOf(r9 | num.intValue()));
                    }
                }
            } else {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f6212d;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                u(byteArrayOutputStream2, bVarArr.length);
                int r9 = 2;
                int r11 = 2;
                for (b bVar : bVarArr) {
                    t(byteArrayOutputStream2, bVar.f6203c, 4);
                    t(byteArrayOutputStream2, bVar.f6204d, 4);
                    t(byteArrayOutputStream2, bVar.g, 4);
                    String d4 = d(bVar.f6201a, bVar.f6202b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d4.getBytes(charset).length;
                    u(byteArrayOutputStream2, length2);
                    r11 = r11 + 14 + length2;
                    byteArrayOutputStream2.write(d4.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (r11 == byteArray.length) {
                    n nVar = new n(c.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(nVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int r10 = 0;
                    for (int r4 = 0; r4 < bVarArr.length; r4++) {
                        try {
                            b bVar2 = bVarArr[r4];
                            u(byteArrayOutputStream3, r4);
                            u(byteArrayOutputStream3, bVar2.f6205e);
                            r10 = r10 + 4 + (bVar2.f6205e * 2);
                            int[] r112 = bVar2.f6207h;
                            int length3 = r112.length;
                            int r15 = 0;
                            int r16 = 0;
                            while (r15 < length3) {
                                int r17 = r112[r15];
                                u(byteArrayOutputStream3, r17 - r16);
                                r15++;
                                r16 = r17;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (r10 == byteArray2.length) {
                        n nVar2 = new n(c.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(nVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int r42 = 0;
                        int r6 = 0;
                        while (r42 < bVarArr.length) {
                            try {
                                b bVar3 = bVarArr[r42];
                                int r14 = 0;
                                for (Map.Entry entry : bVar3.f6208i.entrySet()) {
                                    r14 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                q(byteArrayOutputStream4, bVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream5, bVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                u(byteArrayOutputStream3, r42);
                                int length4 = byteArray3.length + r9 + byteArray4.length;
                                int r62 = r6 + 6;
                                ArrayList arrayList4 = arrayList3;
                                t(byteArrayOutputStream3, length4, 4);
                                u(byteArrayOutputStream3, r14);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                r6 = r62 + length4;
                                r42++;
                                arrayList3 = arrayList4;
                                r9 = 2;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (r6 == byteArray5.length) {
                            n nVar3 = new n(c.METHODS, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(nVar3);
                            long j3 = 4;
                            long size = j3 + j3 + 4 + (arrayList2.size() * 16);
                            t(byteArrayOutputStream, arrayList2.size(), 4);
                            int r43 = 0;
                            while (r43 < arrayList2.size()) {
                                n nVar4 = (n) arrayList2.get(r43);
                                t(byteArrayOutputStream, nVar4.f6228a.a(), 4);
                                t(byteArrayOutputStream, size, 4);
                                byte[] bArr3 = nVar4.f6229b;
                                if (nVar4.f6230c) {
                                    long length5 = bArr3.length;
                                    byte[] a4 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a4);
                                    t(byteArrayOutputStream, a4.length, 4);
                                    t(byteArrayOutputStream, length5, 4);
                                    length = a4.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    t(byteArrayOutputStream, bArr3.length, 4);
                                    t(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                r43++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int r63 = 0; r63 < arrayList6.size(); r63++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(r63));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + r6 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + r10 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + r11 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
        byte[] bArr4 = f6213e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b3 = b(bVarArr, bArr4);
            t(byteArrayOutputStream, bVarArr.length, 1);
            t(byteArrayOutputStream, b3.length, 4);
            byte[] a5 = a(b3);
            t(byteArrayOutputStream, a5.length, 4);
            byteArrayOutputStream.write(a5);
            return true;
        }
        byte[] bArr5 = g;
        if (Arrays.equals(bArr, bArr5)) {
            t(byteArrayOutputStream, bVarArr.length, 1);
            for (b bVar4 : bVarArr) {
                String d5 = d(bVar4.f6201a, bVar4.f6202b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d5.getBytes(charset2).length);
                u(byteArrayOutputStream, bVar4.f6207h.length);
                t(byteArrayOutputStream, bVar4.f6208i.size() * 4, 4);
                t(byteArrayOutputStream, bVar4.f6203c, 4);
                byteArrayOutputStream.write(d5.getBytes(charset2));
                for (Integer num : bVar4.f6208i.keySet()) {
                    u(byteArrayOutputStream, num.intValue());
                    u(byteArrayOutputStream, 0);
                }
                for (int r102 : bVar4.f6207h) {
                    u(byteArrayOutputStream, r102);
                }
            }
            return true;
        }
        byte[] bArr6 = f6214f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b4 = b(bVarArr, bArr6);
            t(byteArrayOutputStream, bVarArr.length, 1);
            t(byteArrayOutputStream, b4.length, 4);
            byte[] a6 = a(b4);
            t(byteArrayOutputStream, a6.length, 4);
            byteArrayOutputStream.write(a6);
            return true;
        }
        byte[] bArr7 = f6215h;
        if (Arrays.equals(bArr, bArr7)) {
            u(byteArrayOutputStream, bVarArr.length);
            for (b bVar5 : bVarArr) {
                String d6 = d(bVar5.f6201a, bVar5.f6202b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                u(byteArrayOutputStream, d6.getBytes(charset3).length);
                TreeMap treeMap = bVar5.f6208i;
                u(byteArrayOutputStream, treeMap.size());
                u(byteArrayOutputStream, bVar5.f6207h.length);
                t(byteArrayOutputStream, bVar5.f6203c, 4);
                byteArrayOutputStream.write(d6.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    u(byteArrayOutputStream, num2.intValue());
                }
                for (int r103 : bVar5.f6207h) {
                    u(byteArrayOutputStream, r103);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        u(byteArrayOutputStream, str.getBytes(charset).length);
        u(byteArrayOutputStream, bVar.f6205e);
        t(byteArrayOutputStream, bVar.f6206f, 4);
        t(byteArrayOutputStream, bVar.f6203c, 4);
        t(byteArrayOutputStream, bVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        byte[] bArr = new byte[(((bVar.g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : bVar.f6208i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int r4 = intValue / 8;
                bArr[r4] = (byte) (bArr[r4] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int r3 = intValue + bVar.g;
                int r22 = r3 / 8;
                bArr[r22] = (byte) ((1 << (r3 % 8)) | bArr[r22]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, b bVar) {
        int r12 = 0;
        for (Map.Entry entry : bVar.f6208i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                u(byteArrayOutputStream, intValue - r12);
                u(byteArrayOutputStream, 0);
                r12 = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x01ca, code lost:
        if (r5 == null) goto L175;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x017f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0161  */
    /* JADX WARN: Type inference failed for: r14v0, types: [y0.b[], byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void s(android.content.Context r19, java.util.concurrent.Executor r20, y0.e r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.f.s(android.content.Context, java.util.concurrent.Executor, y0.e, boolean):void");
    }

    public static void t(ByteArrayOutputStream byteArrayOutputStream, long j3, int r9) {
        byte[] bArr = new byte[r9];
        for (int r12 = 0; r12 < r9; r12++) {
            bArr[r12] = (byte) ((j3 >> (r12 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, int r3) {
        t(byteArrayOutputStream, r3, 2);
    }
}
