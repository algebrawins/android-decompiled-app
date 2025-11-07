package x1;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import h2.AbstractActivityC0292d;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: x1.v0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0723v0 {
    public static int a(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new U.q(context).a()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
        if (r5.f1563c == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.content.res.ColorStateList b(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            X.l r1 = new X.l
            r1.<init>(r0, r8)
            java.lang.Object r2 = X.m.f1568c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = X.m.f1567b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L4f
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L4f
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            X.k r5 = (X.k) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L4f
            android.content.res.Configuration r6 = r5.f1562b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4c
            if (r8 != 0) goto L3e
            int r6 = r5.f1563c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L48
            goto L3e
        L3c:
            r8 = move-exception
            goto L9d
        L3e:
            if (r8 == 0) goto L4c
            int r6 = r5.f1563c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4c
        L48:
            android.content.res.ColorStateList r3 = r5.f1561a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L51
        L4c:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L4f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L51:
            if (r3 == 0) goto L54
            goto L9c
        L54:
            java.lang.ThreadLocal r2 = X.m.f1566a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L66
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L66:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L75
            r3 = 31
            if (r2 > r3) goto L75
            goto L86
        L75:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = X.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
            goto L86
        L7e:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L86:
            if (r4 == 0) goto L8d
            X.m.a(r1, r9, r4, r8)
            r3 = r4
            goto L9c
        L8d:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L98
            android.content.res.ColorStateList r3 = X.j.b(r0, r9, r8)
            goto L9c
        L98:
            android.content.res.ColorStateList r3 = r0.getColorStateList(r9)
        L9c:
            return r3
        L9d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.AbstractC0723v0.b(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static void c(AbstractActivityC0292d abstractActivityC0292d, String[] strArr, int r8) {
        String[] strArr2;
        HashSet hashSet = new HashSet();
        for (int r22 = 0; r22 < strArr.length; r22++) {
            if (!TextUtils.isEmpty(strArr[r22])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[r22], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(r22));
                }
            } else {
                throw new IllegalArgumentException(D.C.z(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            strArr2 = new String[strArr.length - size];
        } else {
            strArr2 = strArr;
        }
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int r23 = 0;
            for (int r12 = 0; r12 < strArr.length; r12++) {
                if (!hashSet.contains(Integer.valueOf(r12))) {
                    strArr2[r23] = strArr[r12];
                    r23++;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            U.a.b(abstractActivityC0292d, strArr, r8);
        }
    }

    public static boolean d(AbstractActivityC0292d abstractActivityC0292d, String str) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (r02 >= 32) {
            return U.c.a(abstractActivityC0292d, str);
        }
        if (r02 == 31) {
            return U.b.b(abstractActivityC0292d, str);
        }
        if (r02 < 23) {
            return false;
        }
        return U.a.c(abstractActivityC0292d, str);
    }
}
