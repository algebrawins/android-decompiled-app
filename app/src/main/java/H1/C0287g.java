package h1;

import A0.C0009k;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.example.catering_inventory.R;
import java.io.File;
import k1.w;
import s.InterfaceC0447a;
import x0.InterfaceC0560a;

/* renamed from: h1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0287g implements InterfaceC0447a, t1.d, InterfaceC0560a {

    /* renamed from: J  reason: collision with root package name */
    public static C0287g f3266J;

    /* renamed from: K  reason: collision with root package name */
    public static C0287g f3267K;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0237, code lost:
        if (r114.f4961h == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x028b, code lost:
        if (r5 == r12) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x063b A[Catch: all -> 0x064d, Exception -> 0x0651, TryCatch #19 {Exception -> 0x0651, all -> 0x064d, blocks: (B:233:0x0637, B:235:0x063b, B:243:0x065c, B:242:0x0654), top: B:298:0x0637 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0654 A[Catch: all -> 0x064d, Exception -> 0x0651, TryCatch #19 {Exception -> 0x0651, all -> 0x064d, blocks: (B:233:0x0637, B:235:0x063b, B:243:0x065c, B:242:0x0654), top: B:298:0x0637 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0334  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v55 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v26, types: [long] */
    /* JADX WARN: Type inference failed for: r12v30, types: [long] */
    /* JADX WARN: Type inference failed for: r12v39, types: [double[]] */
    /* JADX WARN: Type inference failed for: r12v46, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v70 */
    /* JADX WARN: Type inference failed for: r3v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r3v30, types: [double] */
    /* JADX WARN: Type inference failed for: r5v42, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(s0.h r113, s0.h r114) {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.C0287g.b(s0.h, s0.h):void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, e3.a] */
    public static e3.l c(String str, boolean z3) {
        N2.g.e(str, "<this>");
        e3.b bVar = f3.b.f3203a;
        ?? obj = new Object();
        obj.t(str);
        return f3.b.d(obj, z3);
    }

    public static e3.l d(File file) {
        String str = e3.l.f3123K;
        String file2 = file.toString();
        N2.g.d(file2, "toString()");
        return c(file2, false);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h1.g, java.lang.Object] */
    public static void e(Context context) {
        w.e(context);
        synchronized (C0287g.class) {
            try {
                if (f3266J == null) {
                    n.a(context);
                    ?? obj = new Object();
                    context.getApplicationContext();
                    f3266J = obj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final k f(PackageInfo packageInfo, k... kVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        l lVar = new l(packageInfo.signatures[0].toByteArray());
        for (int r22 = 0; r22 < kVarArr.length; r22++) {
            if (kVarArr[r22].equals(lVar)) {
                return kVarArr[r22];
            }
        }
        return null;
    }

    public static final boolean h(PackageInfo packageInfo) {
        boolean z3;
        k f2;
        ApplicationInfo applicationInfo;
        if (packageInfo != null && (("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) && ((applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 129) == 0))) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (packageInfo != null && packageInfo.signatures != null) {
            if (z3) {
                f2 = f(packageInfo, m.f3275a);
            } else {
                f2 = f(packageInfo, m.f3275a[0]);
            }
            if (f2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // t1.d
    public C0009k a(Context context, String str, t1.c cVar) {
        C0009k c0009k = new C0009k();
        int h3 = cVar.h(context, str, true);
        c0009k.f131b = h3;
        if (h3 != 0) {
            c0009k.f132c = 1;
        } else {
            int d4 = cVar.d(context, str);
            c0009k.f130a = d4;
            if (d4 != 0) {
                c0009k.f132c = -1;
            }
        }
        return c0009k;
    }

    @Override // x0.InterfaceC0560a
    public CharSequence g(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        listPreference.getClass();
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return listPreference.f2497J.getString(R.string.not_set);
    }

    @Override // s.InterfaceC0447a, H.a
    public Object apply(Object obj) {
        return obj;
    }
}
