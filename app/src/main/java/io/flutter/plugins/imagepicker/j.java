package io.flutter.plugins.imagepicker;

import A0.C0001b;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.AbstractActivityC0292d;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class j implements r2.o, r2.p {

    /* renamed from: J  reason: collision with root package name */
    public final String f3621J;

    /* renamed from: K  reason: collision with root package name */
    public final AbstractActivityC0292d f3622K;

    /* renamed from: L  reason: collision with root package name */
    public final f f3623L;

    /* renamed from: M  reason: collision with root package name */
    public final b f3624M;

    /* renamed from: N  reason: collision with root package name */
    public final f f3625N;

    /* renamed from: O  reason: collision with root package name */
    public final b f3626O;

    /* renamed from: P  reason: collision with root package name */
    public final w1.u f3627P;

    /* renamed from: Q  reason: collision with root package name */
    public final ExecutorService f3628Q;

    /* renamed from: R  reason: collision with root package name */
    public h f3629R;

    /* renamed from: S  reason: collision with root package name */
    public Uri f3630S;

    /* renamed from: T  reason: collision with root package name */
    public C0001b f3631T;

    /* renamed from: U  reason: collision with root package name */
    public final Object f3632U;

    /* JADX WARN: Type inference failed for: r2v0, types: [w1.u, java.lang.Object] */
    public j(AbstractActivityC0292d abstractActivityC0292d, f fVar, b bVar) {
        f fVar2 = new f(abstractActivityC0292d);
        b bVar2 = new b(abstractActivityC0292d);
        ?? obj = new Object();
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f3632U = new Object();
        this.f3622K = abstractActivityC0292d;
        this.f3623L = fVar;
        this.f3621J = abstractActivityC0292d.getPackageName() + ".flutter.image_provider";
        this.f3625N = fVar2;
        this.f3626O = bVar2;
        this.f3627P = obj;
        this.f3624M = bVar;
        this.f3628Q = newSingleThreadExecutor;
    }

    public static void c(t tVar) {
        tVar.a(new q("already_active", "Image picker is already active"));
    }

    @Override // r2.p
    public final boolean a(int r4, String[] strArr, int[] r6) {
        boolean z3;
        if (r6.length > 0 && r6[0] == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (r4 != 2345) {
            if (r4 != 2355) {
                return false;
            }
            if (z3) {
                k();
            }
        } else if (z3) {
            j();
        }
        if (!z3 && (r4 == 2345 || r4 == 2355)) {
            d("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    @Override // r2.o
    public final boolean b(int r22, final int r3, final Intent intent) {
        Runnable runnable;
        if (r22 != 2342) {
            if (r22 != 2343) {
                if (r22 != 2346) {
                    if (r22 != 2347) {
                        if (r22 != 2352) {
                            if (r22 != 2353) {
                                return false;
                            }
                            runnable = new d(this, r3, 1);
                        } else {
                            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.c

                                /* renamed from: K  reason: collision with root package name */
                                public final /* synthetic */ j f3609K;

                                {
                                    this.f3609K = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Intent intent2;
                                    Intent intent3;
                                    Intent intent4;
                                    Intent intent5;
                                    switch (r4) {
                                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                            j jVar = this.f3609K;
                                            jVar.getClass();
                                            if (r3 == -1 && (intent2 = intent) != null) {
                                                ArrayList g = jVar.g(intent2, false);
                                                if (g == null) {
                                                    jVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                                    return;
                                                } else {
                                                    jVar.i(g);
                                                    return;
                                                }
                                            }
                                            jVar.f(null);
                                            return;
                                        case 1:
                                            j jVar2 = this.f3609K;
                                            jVar2.getClass();
                                            if (r3 == -1 && (intent3 = intent) != null) {
                                                ArrayList g3 = jVar2.g(intent3, false);
                                                if (g3 == null) {
                                                    jVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                                    return;
                                                } else {
                                                    jVar2.i(g3);
                                                    return;
                                                }
                                            }
                                            jVar2.f(null);
                                            return;
                                        case 2:
                                            j jVar3 = this.f3609K;
                                            jVar3.getClass();
                                            if (r3 == -1 && (intent4 = intent) != null) {
                                                ArrayList g4 = jVar3.g(intent4, true);
                                                if (g4 == null) {
                                                    jVar3.d("no_valid_media_uri", "Cannot find the selected media.");
                                                    return;
                                                } else {
                                                    jVar3.i(g4);
                                                    return;
                                                }
                                            }
                                            jVar3.f(null);
                                            return;
                                        default:
                                            j jVar4 = this.f3609K;
                                            jVar4.getClass();
                                            if (r3 == -1 && (intent5 = intent) != null) {
                                                ArrayList g5 = jVar4.g(intent5, false);
                                                if (g5 != null && g5.size() >= 1) {
                                                    jVar4.f(((i) g5.get(0)).f3619a);
                                                    return;
                                                } else {
                                                    jVar4.d("no_valid_video_uri", "Cannot find the selected video.");
                                                    return;
                                                }
                                            }
                                            jVar4.f(null);
                                            return;
                                    }
                                }
                            };
                        }
                    } else {
                        runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.c

                            /* renamed from: K  reason: collision with root package name */
                            public final /* synthetic */ j f3609K;

                            {
                                this.f3609K = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                Intent intent2;
                                Intent intent3;
                                Intent intent4;
                                Intent intent5;
                                switch (r4) {
                                    case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                        j jVar = this.f3609K;
                                        jVar.getClass();
                                        if (r3 == -1 && (intent2 = intent) != null) {
                                            ArrayList g = jVar.g(intent2, false);
                                            if (g == null) {
                                                jVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                                return;
                                            } else {
                                                jVar.i(g);
                                                return;
                                            }
                                        }
                                        jVar.f(null);
                                        return;
                                    case 1:
                                        j jVar2 = this.f3609K;
                                        jVar2.getClass();
                                        if (r3 == -1 && (intent3 = intent) != null) {
                                            ArrayList g3 = jVar2.g(intent3, false);
                                            if (g3 == null) {
                                                jVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                                return;
                                            } else {
                                                jVar2.i(g3);
                                                return;
                                            }
                                        }
                                        jVar2.f(null);
                                        return;
                                    case 2:
                                        j jVar3 = this.f3609K;
                                        jVar3.getClass();
                                        if (r3 == -1 && (intent4 = intent) != null) {
                                            ArrayList g4 = jVar3.g(intent4, true);
                                            if (g4 == null) {
                                                jVar3.d("no_valid_media_uri", "Cannot find the selected media.");
                                                return;
                                            } else {
                                                jVar3.i(g4);
                                                return;
                                            }
                                        }
                                        jVar3.f(null);
                                        return;
                                    default:
                                        j jVar4 = this.f3609K;
                                        jVar4.getClass();
                                        if (r3 == -1 && (intent5 = intent) != null) {
                                            ArrayList g5 = jVar4.g(intent5, false);
                                            if (g5 != null && g5.size() >= 1) {
                                                jVar4.f(((i) g5.get(0)).f3619a);
                                                return;
                                            } else {
                                                jVar4.d("no_valid_video_uri", "Cannot find the selected video.");
                                                return;
                                            }
                                        }
                                        jVar4.f(null);
                                        return;
                                }
                            }
                        };
                    }
                } else {
                    runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.c

                        /* renamed from: K  reason: collision with root package name */
                        public final /* synthetic */ j f3609K;

                        {
                            this.f3609K = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            Intent intent2;
                            Intent intent3;
                            Intent intent4;
                            Intent intent5;
                            switch (r4) {
                                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                    j jVar = this.f3609K;
                                    jVar.getClass();
                                    if (r3 == -1 && (intent2 = intent) != null) {
                                        ArrayList g = jVar.g(intent2, false);
                                        if (g == null) {
                                            jVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                            return;
                                        } else {
                                            jVar.i(g);
                                            return;
                                        }
                                    }
                                    jVar.f(null);
                                    return;
                                case 1:
                                    j jVar2 = this.f3609K;
                                    jVar2.getClass();
                                    if (r3 == -1 && (intent3 = intent) != null) {
                                        ArrayList g3 = jVar2.g(intent3, false);
                                        if (g3 == null) {
                                            jVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                            return;
                                        } else {
                                            jVar2.i(g3);
                                            return;
                                        }
                                    }
                                    jVar2.f(null);
                                    return;
                                case 2:
                                    j jVar3 = this.f3609K;
                                    jVar3.getClass();
                                    if (r3 == -1 && (intent4 = intent) != null) {
                                        ArrayList g4 = jVar3.g(intent4, true);
                                        if (g4 == null) {
                                            jVar3.d("no_valid_media_uri", "Cannot find the selected media.");
                                            return;
                                        } else {
                                            jVar3.i(g4);
                                            return;
                                        }
                                    }
                                    jVar3.f(null);
                                    return;
                                default:
                                    j jVar4 = this.f3609K;
                                    jVar4.getClass();
                                    if (r3 == -1 && (intent5 = intent) != null) {
                                        ArrayList g5 = jVar4.g(intent5, false);
                                        if (g5 != null && g5.size() >= 1) {
                                            jVar4.f(((i) g5.get(0)).f3619a);
                                            return;
                                        } else {
                                            jVar4.d("no_valid_video_uri", "Cannot find the selected video.");
                                            return;
                                        }
                                    }
                                    jVar4.f(null);
                                    return;
                            }
                        }
                    };
                }
            } else {
                runnable = new d(this, r3, 0);
            }
        } else {
            runnable = new Runnable(this) { // from class: io.flutter.plugins.imagepicker.c

                /* renamed from: K  reason: collision with root package name */
                public final /* synthetic */ j f3609K;

                {
                    this.f3609K = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Intent intent2;
                    Intent intent3;
                    Intent intent4;
                    Intent intent5;
                    switch (r4) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            j jVar = this.f3609K;
                            jVar.getClass();
                            if (r3 == -1 && (intent2 = intent) != null) {
                                ArrayList g = jVar.g(intent2, false);
                                if (g == null) {
                                    jVar.d("no_valid_image_uri", "Cannot find the selected image.");
                                    return;
                                } else {
                                    jVar.i(g);
                                    return;
                                }
                            }
                            jVar.f(null);
                            return;
                        case 1:
                            j jVar2 = this.f3609K;
                            jVar2.getClass();
                            if (r3 == -1 && (intent3 = intent) != null) {
                                ArrayList g3 = jVar2.g(intent3, false);
                                if (g3 == null) {
                                    jVar2.d("missing_valid_image_uri", "Cannot find at least one of the selected images.");
                                    return;
                                } else {
                                    jVar2.i(g3);
                                    return;
                                }
                            }
                            jVar2.f(null);
                            return;
                        case 2:
                            j jVar3 = this.f3609K;
                            jVar3.getClass();
                            if (r3 == -1 && (intent4 = intent) != null) {
                                ArrayList g4 = jVar3.g(intent4, true);
                                if (g4 == null) {
                                    jVar3.d("no_valid_media_uri", "Cannot find the selected media.");
                                    return;
                                } else {
                                    jVar3.i(g4);
                                    return;
                                }
                            }
                            jVar3.f(null);
                            return;
                        default:
                            j jVar4 = this.f3609K;
                            jVar4.getClass();
                            if (r3 == -1 && (intent5 = intent) != null) {
                                ArrayList g5 = jVar4.g(intent5, false);
                                if (g5 != null && g5.size() >= 1) {
                                    jVar4.f(((i) g5.get(0)).f3619a);
                                    return;
                                } else {
                                    jVar4.d("no_valid_video_uri", "Cannot find the selected video.");
                                    return;
                                }
                            }
                            jVar4.f(null);
                            return;
                    }
                }
            };
        }
        this.f3628Q.execute(runnable);
        return true;
    }

    public final void d(String str, String str2) {
        t tVar;
        synchronized (this.f3632U) {
            C0001b c0001b = this.f3631T;
            if (c0001b != null) {
                tVar = (t) c0001b.f86M;
            } else {
                tVar = null;
            }
            this.f3631T = null;
        }
        if (tVar == null) {
            this.f3624M.a(null, str, str2);
        } else {
            tVar.a(new q(str, str2));
        }
    }

    public final void e(ArrayList arrayList) {
        t tVar;
        synchronized (this.f3632U) {
            C0001b c0001b = this.f3631T;
            if (c0001b != null) {
                tVar = (t) c0001b.f86M;
            } else {
                tVar = null;
            }
            this.f3631T = null;
        }
        if (tVar == null) {
            this.f3624M.a(arrayList, null, null);
        } else {
            tVar.b(arrayList);
        }
    }

    public final void f(String str) {
        t tVar;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f3632U) {
            C0001b c0001b = this.f3631T;
            if (c0001b != null) {
                tVar = (t) c0001b.f86M;
            } else {
                tVar = null;
            }
            this.f3631T = null;
        }
        if (tVar == null) {
            if (!arrayList.isEmpty()) {
                this.f3624M.a(arrayList, null, null);
                return;
            }
            return;
        }
        tVar.b(arrayList);
    }

    public final ArrayList g(Intent intent, boolean z3) {
        String str;
        ArrayList arrayList = new ArrayList();
        Uri data = intent.getData();
        w1.u uVar = this.f3627P;
        AbstractActivityC0292d abstractActivityC0292d = this.f3622K;
        if (data == null) {
            if (intent.getClipData() == null) {
                return null;
            }
            for (int r12 = 0; r12 < intent.getClipData().getItemCount(); r12++) {
                Uri uri = intent.getClipData().getItemAt(r12).getUri();
                if (uri == null) {
                    return null;
                }
                uVar.getClass();
                String q3 = w1.u.q(abstractActivityC0292d, uri);
                if (q3 == null) {
                    return null;
                }
                if (z3) {
                    str = abstractActivityC0292d.getContentResolver().getType(uri);
                } else {
                    str = null;
                }
                arrayList.add(new i(q3, str));
            }
        } else {
            uVar.getClass();
            String q4 = w1.u.q(abstractActivityC0292d, data);
            if (q4 == null) {
                return null;
            }
            arrayList.add(new i(q4, null));
        }
        return arrayList;
    }

    public final void h(Intent intent, Uri uri) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        AbstractActivityC0292d abstractActivityC0292d = this.f3622K;
        PackageManager packageManager = abstractActivityC0292d.getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            of = PackageManager.ResolveInfoFlags.of(65536L);
            queryIntentActivities = packageManager.queryIntentActivities(intent, of);
        } else {
            queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        }
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            abstractActivityC0292d.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    public final void i(ArrayList arrayList) {
        u uVar;
        synchronized (this.f3632U) {
            C0001b c0001b = this.f3631T;
            if (c0001b != null) {
                uVar = (u) c0001b.f85L;
            } else {
                uVar = null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int r22 = 0;
        if (uVar != null) {
            while (r22 < arrayList.size()) {
                i iVar = (i) arrayList.get(r22);
                String str = iVar.f3619a;
                String str2 = iVar.f3620b;
                if (str2 == null || !str2.startsWith("video/")) {
                    str = this.f3623L.a(iVar.f3619a, uVar.f3653a, uVar.f3654b, uVar.f3655c.intValue());
                }
                arrayList2.add(str);
                r22++;
            }
            e(arrayList2);
            return;
        }
        while (r22 < arrayList.size()) {
            arrayList2.add(((i) arrayList.get(r22)).f3619a);
            r22++;
        }
        e(arrayList2);
    }

    public final void j() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f3629R == h.FRONT) {
            int r12 = Build.VERSION.SDK_INT;
            if (r12 >= 22) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
                if (r12 >= 26) {
                    intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                }
            } else {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            }
        }
        String str = UUID.randomUUID().toString();
        AbstractActivityC0292d abstractActivityC0292d = this.f3622K;
        File cacheDir = abstractActivityC0292d.getCacheDir();
        try {
            cacheDir.mkdirs();
            File createTempFile = File.createTempFile(str, ".jpg", cacheDir);
            this.f3630S = Uri.parse("file:" + createTempFile.getAbsolutePath());
            Uri d4 = W.g.d(this.f3626O.f3607a, this.f3621J, createTempFile);
            intent.putExtra("output", d4);
            h(intent, d4);
            try {
                try {
                    abstractActivityC0292d.startActivityForResult(intent, 2343);
                } catch (ActivityNotFoundException unused) {
                    createTempFile.delete();
                    d("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (SecurityException e4) {
                e4.printStackTrace();
                d("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public final void k() {
        A a4;
        Long l3;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.f3632U) {
            C0001b c0001b = this.f3631T;
            if (c0001b != null) {
                a4 = (A) c0001b.f84K;
            } else {
                a4 = null;
            }
        }
        if (a4 != null && (l3 = a4.f3606a) != null) {
            intent.putExtra("android.intent.extra.durationLimit", l3.intValue());
        }
        if (this.f3629R == h.FRONT) {
            int r12 = Build.VERSION.SDK_INT;
            if (r12 >= 22) {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
                if (r12 >= 26) {
                    intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                }
            } else {
                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            }
        }
        String str = UUID.randomUUID().toString();
        File cacheDir = this.f3622K.getCacheDir();
        try {
            cacheDir.mkdirs();
            File createTempFile = File.createTempFile(str, ".mp4", cacheDir);
            this.f3630S = Uri.parse("file:" + createTempFile.getAbsolutePath());
            Uri d4 = W.g.d(this.f3626O.f3607a, this.f3621J, createTempFile);
            intent.putExtra("output", d4);
            h(intent, d4);
            try {
                try {
                    this.f3622K.startActivityForResult(intent, 2353);
                } catch (ActivityNotFoundException unused) {
                    createTempFile.delete();
                    d("no_available_camera", "No cameras available for taking pictures.");
                }
            } catch (SecurityException e4) {
                e4.printStackTrace();
                d("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (IOException e5) {
            throw new RuntimeException(e5);
        }
    }

    public final boolean l() {
        boolean z3;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        f fVar = this.f3625N;
        if (fVar == null) {
            return false;
        }
        AbstractActivityC0292d abstractActivityC0292d = fVar.f3617a;
        int r22 = Build.VERSION.SDK_INT;
        if (r22 < 23) {
            return false;
        }
        try {
            PackageManager packageManager = abstractActivityC0292d.getPackageManager();
            if (r22 >= 33) {
                String packageName = abstractActivityC0292d.getPackageName();
                of = PackageManager.PackageInfoFlags.of(4096L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = packageManager.getPackageInfo(abstractActivityC0292d.getPackageName(), RecognitionOptions.AZTEC);
            }
            z3 = Arrays.asList(packageInfo.requestedPermissions).contains("android.permission.CAMERA");
        } catch (PackageManager.NameNotFoundException e4) {
            e4.printStackTrace();
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        return true;
    }

    public final boolean m(u uVar, A a4, t tVar) {
        synchronized (this.f3632U) {
            try {
                if (this.f3631T != null) {
                    return false;
                }
                this.f3631T = new C0001b(uVar, a4, tVar, 17);
                this.f3624M.f3607a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
