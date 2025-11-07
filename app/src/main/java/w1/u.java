package w1;

import A0.C0009k;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.InterfaceC0089q;
import androidx.camera.core.impl.Z;
import h2.AbstractActivityC0292d;
import h2.J;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class u implements X0.b, InterfaceC0089q, r2.m, t1.d, y0.e {

    /* renamed from: J  reason: collision with root package name */
    public static u f5319J;

    public static final boolean n(e3.l lVar) {
        e3.l lVar2 = f3.d.f3210c;
        return !U2.i.b(lVar.b(), ".class", true);
    }

    public static String p(AbstractActivityC0292d abstractActivityC0292d, Uri uri) {
        String fileExtensionFromUrl;
        try {
            if (uri.getScheme().equals("content")) {
                fileExtensionFromUrl = MimeTypeMap.getSingleton().getExtensionFromMimeType(abstractActivityC0292d.getContentResolver().getType(uri));
            } else {
                fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(Uri.fromFile(new File(uri.getPath())).toString());
            }
            if (fileExtensionFromUrl != null && !fileExtensionFromUrl.isEmpty()) {
                return "." + s(fileExtensionFromUrl);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
        r4.close();
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[Catch: all -> 0x007f, TryCatch #6 {IOException | IllegalArgumentException | SecurityException -> 0x00ec, blocks: (B:3:0x0005, B:46:0x00d3, B:4:0x000d, B:13:0x004f, B:24:0x0063, B:26:0x0069, B:31:0x0081, B:38:0x00a4, B:45:0x00d0, B:53:0x00e0, B:52:0x00dd, B:33:0x0088, B:37:0x009a, B:36:0x0096, B:22:0x005f, B:20:0x005c, B:19:0x0059), top: B:69:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5 A[Catch: all -> 0x00d7, LOOP:0: B:41:0x00be->B:43:0x00c5, LOOP_END, TryCatch #3 {all -> 0x00d7, blocks: (B:40:0x00bc, B:41:0x00be, B:43:0x00c5, B:44:0x00c9), top: B:61:0x00bc }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String q(h2.AbstractActivityC0292d r13, android.net.Uri r14) {
        /*
            java.lang.String r0 = "image_picker"
            java.lang.String r1 = "Cannot get file name for "
            r2 = 0
            android.content.ContentResolver r3 = r13.getContentResolver()     // Catch: java.lang.Throwable -> Lec
            java.io.InputStream r3 = r3.openInputStream(r14)     // Catch: java.lang.Throwable -> Lec
            java.util.UUID r4 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L7f
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            java.io.File r6 = r13.getCacheDir()     // Catch: java.lang.Throwable -> L7f
            r5.<init>(r6, r4)     // Catch: java.lang.Throwable -> L7f
            r5.mkdir()     // Catch: java.lang.Throwable -> L7f
            r5.deleteOnExit()     // Catch: java.lang.Throwable -> L7f
            android.content.ContentResolver r7 = r13.getContentResolver()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r4 = "_display_name"
            java.lang.String[] r9 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L7f
            r11 = 0
            r12 = 0
            r10 = 0
            r8 = r14
            android.database.Cursor r4 = r7.query(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7f
            r6 = 0
            if (r4 == 0) goto L5d
            boolean r7 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L5d
            int r7 = r4.getColumnCount()     // Catch: java.lang.Throwable -> L53
            r8 = 1
            if (r7 >= r8) goto L47
            goto L5d
        L47:
            java.lang.String r7 = r4.getString(r6)     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = s(r7)     // Catch: java.lang.Throwable -> L53
            r4.close()     // Catch: java.lang.Throwable -> L7f
            goto L63
        L53:
            r13 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r14 = move-exception
            r13.addSuppressed(r14)     // Catch: java.lang.Throwable -> L7f
        L5c:
            throw r13     // Catch: java.lang.Throwable -> L7f
        L5d:
            if (r4 == 0) goto L62
            r4.close()     // Catch: java.lang.Throwable -> L7f
        L62:
            r7 = r2
        L63:
            java.lang.String r13 = p(r13, r14)     // Catch: java.lang.Throwable -> L7f
            if (r7 != 0) goto L86
            java.lang.String r4 = "FileUtils"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L7f
            r7.append(r14)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r14 = r7.toString()     // Catch: java.lang.Throwable -> L7f
            android.util.Log.w(r4, r14)     // Catch: java.lang.Throwable -> L7f
            if (r13 != 0) goto L81
            java.lang.String r13 = ".jpg"
            goto L81
        L7f:
            r13 = move-exception
            goto Le1
        L81:
            java.lang.String r7 = r0.concat(r13)     // Catch: java.lang.Throwable -> L7f
            goto La4
        L86:
            if (r13 == 0) goto La4
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7f
            r14.<init>()     // Catch: java.lang.Throwable -> L7f
            r0 = 46
            int r0 = r7.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 >= 0) goto L96
            goto L9a
        L96:
            java.lang.String r7 = r7.substring(r6, r0)     // Catch: java.lang.Throwable -> L7f
        L9a:
            r14.append(r7)     // Catch: java.lang.Throwable -> L7f
            r14.append(r13)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r7 = r14.toString()     // Catch: java.lang.Throwable -> L7f
        La4:
            java.io.File r13 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            r13.<init>(r5, r7)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r13 = r13.getPath()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r14 = r5.getCanonicalPath()     // Catch: java.lang.Throwable -> L7f
            java.io.File r13 = r(r13, r14)     // Catch: java.lang.Throwable -> L7f
            java.io.FileOutputStream r14 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7f
            r14.<init>(r13)     // Catch: java.lang.Throwable -> L7f
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> Ld7
        Lbe:
            int r1 = r3.read(r0)     // Catch: java.lang.Throwable -> Ld7
            r4 = -1
            if (r1 == r4) goto Lc9
            r14.write(r0, r6, r1)     // Catch: java.lang.Throwable -> Ld7
            goto Lbe
        Lc9:
            r14.flush()     // Catch: java.lang.Throwable -> Ld7
            java.lang.String r13 = r13.getPath()     // Catch: java.lang.Throwable -> Ld7
            r14.close()     // Catch: java.lang.Throwable -> L7f
            r3.close()     // Catch: java.lang.Throwable -> Lec
            return r13
        Ld7:
            r13 = move-exception
            r14.close()     // Catch: java.lang.Throwable -> Ldc
            goto Le0
        Ldc:
            r14 = move-exception
            r13.addSuppressed(r14)     // Catch: java.lang.Throwable -> L7f
        Le0:
            throw r13     // Catch: java.lang.Throwable -> L7f
        Le1:
            if (r3 == 0) goto Leb
            r3.close()     // Catch: java.lang.Throwable -> Le7
            goto Leb
        Le7:
            r14 = move-exception
            r13.addSuppressed(r14)     // Catch: java.lang.Throwable -> Lec
        Leb:
            throw r13     // Catch: java.lang.Throwable -> Lec
        Lec:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.u.q(h2.d, android.net.Uri):java.lang.String");
    }

    public static File r(String str, String str2) {
        File file = new File(str);
        if (file.getCanonicalPath().startsWith(str2)) {
            return file;
        }
        throw new IllegalArgumentException("Trying to open path outside of the expected directory. File: " + file.getCanonicalPath() + " was expected to be within directory: " + str2 + ".");
    }

    public static String s(String str) {
        if (str == null) {
            return null;
        }
        String[] strArr = {"..", "/"};
        String[] split = str.split("/");
        String str2 = split[split.length - 1];
        for (int r12 = 0; r12 < 2; r12++) {
            str2 = str2.replace(strArr[r12], "_");
        }
        return str2;
    }

    @Override // t1.d
    public C0009k a(Context context, String str, t1.c cVar) {
        C0009k c0009k = new C0009k();
        int d4 = cVar.d(context, str);
        c0009k.f130a = d4;
        if (d4 != 0) {
            c0009k.f132c = -1;
        } else {
            int h3 = cVar.h(context, str, true);
            c0009k.f131b = h3;
            if (h3 != 0) {
                c0009k.f132c = 1;
            }
        }
        return c0009k;
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public A d() {
        return null;
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public Rect f() {
        return new Rect();
    }

    @Override // A2.a
    public Object get() {
        return new G.h(1, Executors.newSingleThreadExecutor());
    }

    @Override // r2.m
    public void i(J j3, q2.n nVar) {
        nVar.c(null);
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public E1.a j(float f2) {
        return H.h.f701L;
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public E1.a k() {
        return H.h.f701L;
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public E1.a l(boolean z3) {
        return H.h.f701L;
    }

    public String o(List list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // y0.e
    public void g() {
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public void m() {
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public void b(Z z3) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public void c(A a4) {
    }

    @Override // androidx.camera.core.impl.InterfaceC0089q
    public void h(int r12) {
    }

    @Override // y0.e
    public void e(int r12, Serializable serializable) {
    }
}
