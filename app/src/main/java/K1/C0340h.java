package k1;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k1.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0340h {

    /* renamed from: b  reason: collision with root package name */
    public static final U1.g f4038b = new U1.g("LibraryVersion", "");

    /* renamed from: c  reason: collision with root package name */
    public static final C0340h f4039c;

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap f4040a;

    /* JADX WARN: Type inference failed for: r0v1, types: [k1.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        obj.f4040a = new ConcurrentHashMap();
        f4039c = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = "LibraryVersion"
            U1.g r1 = k1.C0340h.f4038b
            java.lang.String r2 = "Failed to get app version for libraryName: "
            java.lang.String r3 = "/"
            java.lang.String r4 = "Please provide a valid libraryName"
            k1.w.d(r11, r4)
            java.util.concurrent.ConcurrentHashMap r4 = r10.f4040a
            boolean r5 = r4.containsKey(r11)
            if (r5 == 0) goto L1c
            java.lang.Object r11 = r4.get(r11)
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L1c:
            java.util.Properties r5 = new java.util.Properties
            r5.<init>()
            r6 = 0
            java.lang.Class<k1.h> r7 = k1.C0340h.class
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L96 java.lang.Throwable -> L99
            r8.<init>(r3)     // Catch: java.io.IOException -> L96 java.lang.Throwable -> L99
            r8.append(r11)     // Catch: java.io.IOException -> L96 java.lang.Throwable -> L99
            java.lang.String r3 = ".properties"
            r8.append(r3)     // Catch: java.io.IOException -> L96 java.lang.Throwable -> L99
            java.lang.String r3 = r8.toString()     // Catch: java.io.IOException -> L96 java.lang.Throwable -> L99
            java.io.InputStream r3 = r7.getResourceAsStream(r3)     // Catch: java.io.IOException -> L96 java.lang.Throwable -> L99
            if (r3 == 0) goto L70
            r5.load(r3)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = "version"
            java.lang.String r6 = r5.getProperty(r7, r6)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r11)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = " version is "
            r5.append(r7)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r6)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = r1.f1338a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r8 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            if (r7 == 0) goto L8c
            java.lang.String r5 = r1.b(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            android.util.Log.v(r0, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            goto L8c
        L69:
            r11 = move-exception
            goto L94
        L6b:
            r5 = move-exception
            r9 = r6
            r6 = r3
            r3 = r9
            goto L9c
        L70:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r5.append(r11)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            java.lang.String r7 = r1.f1338a     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            r8 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            if (r7 == 0) goto L8c
            java.lang.String r5 = r1.b(r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
            android.util.Log.w(r0, r5)     // Catch: java.lang.Throwable -> L69 java.io.IOException -> L6b
        L8c:
            if (r3 == 0) goto Lb3
            r3.close()     // Catch: java.io.IOException -> L92
            goto Lb3
        L92:
            goto Lb3
        L94:
            r6 = r3
            goto Lcd
        L96:
            r3 = move-exception
            r5 = r3
            goto L9b
        L99:
            r11 = move-exception
            goto Lcd
        L9b:
            r3 = r6
        L9c:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L99
            r7.append(r11)     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L99
            r1.a(r0, r2, r5)     // Catch: java.lang.Throwable -> L99
            if (r6 == 0) goto Lb2
            r6.close()     // Catch: java.io.IOException -> Lb1
            goto Lb2
        Lb1:
        Lb2:
            r6 = r3
        Lb3:
            if (r6 != 0) goto Lc9
            java.lang.String r2 = r1.f1338a
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto Lc7
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            java.lang.String r1 = r1.b(r2)
            android.util.Log.d(r0, r1)
        Lc7:
            java.lang.String r6 = "UNKNOWN"
        Lc9:
            r4.put(r11, r6)
            return r6
        Lcd:
            if (r6 == 0) goto Ld2
            r6.close()     // Catch: java.io.IOException -> Ld2
        Ld2:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C0340h.a(java.lang.String):java.lang.String");
    }
}
