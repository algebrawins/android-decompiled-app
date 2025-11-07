package h;

import x1.AbstractC0680p4;

/* renamed from: h.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274a extends AbstractC0680p4 {

    /* renamed from: a  reason: collision with root package name */
    public final int f3244a;

    public C0274a(int r22) {
        this.f3244a = r22;
        if (r22 > 1) {
            return;
        }
        throw new IllegalArgumentException("Max items must be higher than 1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r0 >= 2) goto L3;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent a(android.app.Activity r5, d2.C0235c r6) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            N2.g.e(r5, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            r2 = 0
            r3 = 1
            if (r0 < r1) goto Lf
        Ld:
            r0 = 1
            goto L1c
        Lf:
            r1 = 30
            if (r0 < r1) goto L1b
            int r0 = O0.c.a()
            r1 = 2
            if (r0 < r1) goto L1b
            goto Ld
        L1b:
            r0 = 0
        L1c:
            int r1 = r4.f3244a
            if (r0 == 0) goto L47
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.provider.action.PICK_IMAGES"
            r5.<init>(r0)
            java.lang.Object r6 = r6.f3003K
            h.e r6 = (h.InterfaceC0278e) r6
            java.lang.String r6 = x1.AbstractC0688q4.c(r6)
            r5.setType(r6)
            int r6 = Q0.e.a()
            if (r1 > r6) goto L3f
            java.lang.String r6 = "android.provider.extra.PICK_IMAGES_MAX"
            r5.putExtra(r6, r1)
            goto Ldc
        L3f:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Max items must be less or equals MediaStore.getPickImagesMaxLimit()"
            r5.<init>(r6)
            throw r5
        L47:
            android.content.pm.ResolveInfo r0 = x1.AbstractC0688q4.b(r5)
            if (r0 == 0) goto L4e
            r2 = 1
        L4e:
            java.lang.String r0 = "Required value was null."
            if (r2 == 0) goto L82
            android.content.pm.ResolveInfo r5 = x1.AbstractC0688q4.b(r5)
            if (r5 == 0) goto L7c
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "androidx.activity.result.contract.action.PICK_IMAGES"
            r0.<init>(r2)
            android.content.pm.ApplicationInfo r2 = r5.applicationInfo
            java.lang.String r2 = r2.packageName
            java.lang.String r5 = r5.name
            r0.setClassName(r2, r5)
            java.lang.Object r5 = r6.f3003K
            h.e r5 = (h.InterfaceC0278e) r5
            java.lang.String r5 = x1.AbstractC0688q4.c(r5)
            r0.setType(r5)
            java.lang.String r5 = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX"
            r0.putExtra(r5, r1)
            r5 = r0
            goto Ldc
        L7c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        L82:
            android.content.pm.ResolveInfo r2 = x1.AbstractC0688q4.a(r5)
            if (r2 == 0) goto Lad
            android.content.pm.ResolveInfo r5 = x1.AbstractC0688q4.a(r5)
            if (r5 == 0) goto La7
            android.content.pm.ActivityInfo r5 = r5.activityInfo
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = "com.google.android.gms.provider.action.PICK_IMAGES"
            r6.<init>(r0)
            android.content.pm.ApplicationInfo r0 = r5.applicationInfo
            java.lang.String r0 = r0.packageName
            java.lang.String r5 = r5.name
            r6.setClassName(r0, r5)
            java.lang.String r5 = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX"
            r6.putExtra(r5, r1)
            r5 = r6
            goto Ldc
        La7:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0)
            throw r5
        Lad:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.OPEN_DOCUMENT"
            r5.<init>(r0)
            java.lang.Object r6 = r6.f3003K
            h.e r6 = (h.InterfaceC0278e) r6
            java.lang.String r6 = x1.AbstractC0688q4.c(r6)
            r5.setType(r6)
            java.lang.String r6 = "android.intent.extra.ALLOW_MULTIPLE"
            r5.putExtra(r6, r3)
            java.lang.String r6 = r5.getType()
            if (r6 != 0) goto Ldc
        */
        //  java.lang.String r6 = "*/*"
        /*
            r5.setType(r6)
            java.lang.String r6 = "image/*"
            java.lang.String r0 = "video/*"
            java.lang.String[] r6 = new java.lang.String[]{r6, r0}
            java.lang.String r0 = "android.intent.extra.MIME_TYPES"
            r5.putExtra(r0, r6)
        Ldc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C0274a.a(android.app.Activity, d2.c):android.content.Intent");
    }
}
