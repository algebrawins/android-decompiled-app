package io.flutter.plugins.imagepicker;

import A0.C0001b;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.J;
import java.io.File;
import java.util.Arrays;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: J  reason: collision with root package name */
    public final /* synthetic */ int f3612J;

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ Object f3613K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ int f3614L;

    public /* synthetic */ d(Object obj, int r22, int r3) {
        this.f3612J = r3;
        this.f3613K = obj;
        this.f3614L = r22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = "";
        Object obj = this.f3613K;
        int r7 = this.f3614L;
        switch (this.f3612J) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                j jVar = (j) obj;
                if (r7 == -1) {
                    Uri uri = jVar.f3630S;
                    if (uri == null) {
                        uri = Uri.parse(jVar.f3624M.f3607a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                    }
                    final e eVar = new e(jVar, 0);
                    b bVar = jVar.f3626O;
                    bVar.getClass();
                    if (uri != null) {
                        str = uri.getPath();
                    }
                    MediaScannerConnection.scanFile(bVar.f3607a, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.g
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str2, Uri uri2) {
                            u uVar;
                            e eVar2 = e.this;
                            int r02 = eVar2.f3615a;
                            j jVar2 = eVar2.f3616b;
                            switch (r02) {
                                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                    synchronized (jVar2.f3632U) {
                                        C0001b c0001b = jVar2.f3631T;
                                        if (c0001b != null) {
                                            uVar = (u) c0001b.f85L;
                                        } else {
                                            uVar = null;
                                        }
                                    }
                                    if (uVar != null) {
                                        String a4 = jVar2.f3623L.a(str2, uVar.f3653a, uVar.f3654b, uVar.f3655c.intValue());
                                        if (a4 != null && !a4.equals(str2)) {
                                            new File(str2).delete();
                                        }
                                        jVar2.f(a4);
                                        return;
                                    }
                                    jVar2.f(str2);
                                    return;
                                default:
                                    jVar2.f(str2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                jVar.f(null);
                return;
            case 1:
                j jVar2 = (j) obj;
                if (r7 == -1) {
                    Uri uri2 = jVar2.f3630S;
                    if (uri2 == null) {
                        uri2 = Uri.parse(jVar2.f3624M.f3607a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", ""));
                    }
                    final e eVar2 = new e(jVar2, 1);
                    b bVar2 = jVar2.f3626O;
                    bVar2.getClass();
                    if (uri2 != null) {
                        str = uri2.getPath();
                    }
                    MediaScannerConnection.scanFile(bVar2.f3607a, new String[]{str}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.g
                        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                        public final void onScanCompleted(String str2, Uri uri22) {
                            u uVar;
                            e eVar22 = e.this;
                            int r02 = eVar22.f3615a;
                            j jVar22 = eVar22.f3616b;
                            switch (r02) {
                                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                    synchronized (jVar22.f3632U) {
                                        C0001b c0001b = jVar22.f3631T;
                                        if (c0001b != null) {
                                            uVar = (u) c0001b.f85L;
                                        } else {
                                            uVar = null;
                                        }
                                    }
                                    if (uVar != null) {
                                        String a4 = jVar22.f3623L.a(str2, uVar.f3653a, uVar.f3654b, uVar.f3655c.intValue());
                                        if (a4 != null && !a4.equals(str2)) {
                                            new File(str2).delete();
                                        }
                                        jVar22.f(a4);
                                        return;
                                    }
                                    jVar22.f(str2);
                                    return;
                                default:
                                    jVar22.f(str2);
                                    return;
                            }
                        }
                    });
                    return;
                }
                jVar2.f(null);
                return;
            default:
                int r02 = r7 & 4;
                B.a aVar = ((io.flutter.plugin.platform.c) obj).f3561b;
                if (r02 == 0) {
                    J j3 = (J) aVar.f173L;
                    j3.getClass();
                    ((C0001b) j3.f3303K).M("SystemChrome.systemUIChange", Arrays.asList(Boolean.TRUE), null);
                    return;
                }
                J j4 = (J) aVar.f173L;
                j4.getClass();
                ((C0001b) j4.f3303K).M("SystemChrome.systemUIChange", Arrays.asList(Boolean.FALSE), null);
                return;
        }
    }
}
