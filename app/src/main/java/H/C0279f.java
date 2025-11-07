package h;

import x1.AbstractC0680p4;

/* renamed from: h.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0279f extends AbstractC0680p4 {
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 >= 2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent a(android.app.Activity r3, d2.C0235c r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            N2.g.e(r3, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lc
            goto L17
        Lc:
            r1 = 30
            if (r0 < r1) goto L2b
            int r0 = O0.c.a()
            r1 = 2
            if (r0 < r1) goto L2b
        L17:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.provider.action.PICK_IMAGES"
            r3.<init>(r0)
            java.lang.Object r4 = r4.f3003K
            h.e r4 = (h.InterfaceC0278e) r4
            java.lang.String r4 = x1.AbstractC0688q4.c(r4)
            r3.setType(r4)
            goto Lbd
        L2b:
            android.content.pm.ResolveInfo r0 = x1.AbstractC0688q4.b(r3)
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L63
            android.content.pm.ResolveInfo r3 = x1.AbstractC0688q4.b(r3)
            if (r3 == 0) goto L5d
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
            r0.<init>(r1)
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r3 = r3.name
            r0.setClassName(r1, r3)
            java.lang.Object r3 = r4.f3003K
            h.e r3 = (h.InterfaceC0278e) r3
            java.lang.String r3 = x1.AbstractC0688q4.c(r3)
            r0.setType(r3)
        L5b:
            r3 = r0
            goto Lbd
        L5d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L63:
            android.content.pm.ResolveInfo r0 = x1.AbstractC0688q4.a(r3)
            if (r0 == 0) goto L93
            android.content.pm.ResolveInfo r3 = x1.AbstractC0688q4.a(r3)
            if (r3 == 0) goto L8d
            android.content.pm.ActivityInfo r3 = r3.activityInfo
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.provider.action.PICK_IMAGES"
            r0.<init>(r1)
            android.content.pm.ApplicationInfo r1 = r3.applicationInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r3 = r3.name
            r0.setClassName(r1, r3)
            java.lang.Object r3 = r4.f3003K
            h.e r3 = (h.InterfaceC0278e) r3
            java.lang.String r3 = x1.AbstractC0688q4.c(r3)
            r0.setType(r3)
            goto L5b
        L8d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>(r1)
            throw r3
        L93:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r3.<init>(r0)
            java.lang.Object r4 = r4.f3003K
            h.e r4 = (h.InterfaceC0278e) r4
            java.lang.String r4 = x1.AbstractC0688q4.c(r4)
            r3.setType(r4)
            java.lang.String r4 = r3.getType()
            if (r4 != 0) goto Lbd
        */
        //  java.lang.String r4 = "*/*"
        /*
            r3.setType(r4)
            java.lang.String r4 = "image/*"
            java.lang.String r0 = "video/*"
            java.lang.String[] r4 = new java.lang.String[]{r4, r0}
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r3.putExtra(r0, r4)
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C0279f.a(android.app.Activity, d2.c):android.content.Intent");
    }
}
