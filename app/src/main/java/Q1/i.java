package Q1;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import h1.C0283c;
import h1.C0285e;
import h2.D;
import java.util.ArrayList;
import java.util.List;
import k0.C0322i;
import k1.w;
import o1.C0398a;
import u1.AbstractC0475c;
import w1.C0520e;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final C0283c[] f1077a = new C0283c[0];

    /* renamed from: b  reason: collision with root package name */
    public static final C0283c f1078b;

    /* renamed from: c  reason: collision with root package name */
    public static final w1.l f1079c;

    /* renamed from: d  reason: collision with root package name */
    public static final w1.l f1080d;

    static {
        C0283c c0283c = new C0283c("vision.barcode", 1L);
        f1078b = c0283c;
        C0283c c0283c2 = new C0283c("vision.custom.ica", 1L);
        C0283c c0283c3 = new C0283c("vision.face", 1L);
        C0283c c0283c4 = new C0283c("vision.ica", 1L);
        C0283c c0283c5 = new C0283c("vision.ocr", 1L);
        C0283c c0283c6 = new C0283c("mlkit.langid", 1L);
        C0283c c0283c7 = new C0283c("mlkit.nlclassifier", 1L);
        C0283c c0283c8 = new C0283c("tflite_dynamite", 1L);
        C0283c c0283c9 = new C0283c("mlkit.barcode.ui", 1L);
        C0283c c0283c10 = new C0283c("mlkit.smartreply", 1L);
        U1.h hVar = new U1.h();
        hVar.c("barcode", c0283c);
        hVar.c("custom_ica", c0283c2);
        hVar.c("face", c0283c3);
        hVar.c("ica", c0283c4);
        hVar.c("ocr", c0283c5);
        hVar.c("langid", c0283c6);
        hVar.c("nlclassifier", c0283c7);
        hVar.c("tflite_dynamite", c0283c8);
        hVar.c("barcode_ui", c0283c9);
        hVar.c("smart_reply", c0283c10);
        C0520e c0520e = (C0520e) hVar.f1342L;
        if (c0520e == null) {
            w1.l a4 = w1.l.a(hVar.f1340J, (Object[]) hVar.f1341K, hVar);
            C0520e c0520e2 = (C0520e) hVar.f1342L;
            if (c0520e2 == null) {
                f1079c = a4;
                U1.h hVar2 = new U1.h();
                hVar2.c("com.google.android.gms.vision.barcode", c0283c);
                hVar2.c("com.google.android.gms.vision.custom.ica", c0283c2);
                hVar2.c("com.google.android.gms.vision.face", c0283c3);
                hVar2.c("com.google.android.gms.vision.ica", c0283c4);
                hVar2.c("com.google.android.gms.vision.ocr", c0283c5);
                hVar2.c("com.google.android.gms.mlkit.langid", c0283c6);
                hVar2.c("com.google.android.gms.mlkit.nlclassifier", c0283c7);
                hVar2.c("com.google.android.gms.tflite_dynamite", c0283c8);
                hVar2.c("com.google.android.gms.mlkit_smartreply", c0283c10);
                C0520e c0520e3 = (C0520e) hVar2.f1342L;
                if (c0520e3 == null) {
                    w1.l a5 = w1.l.a(hVar2.f1340J, (Object[]) hVar2.f1341K, hVar2);
                    C0520e c0520e4 = (C0520e) hVar2.f1342L;
                    if (c0520e4 == null) {
                        f1080d = a5;
                        return;
                    }
                    throw c0520e4.a();
                }
                throw c0520e3.a();
            }
            throw c0520e2.a();
        }
        throw c0520e.a();
    }

    /* JADX WARN: Type inference failed for: r7v7, types: [i1.f, o1.g] */
    public static void a(Context context, List list) {
        C1.j b3;
        C0285e.f3262b.getClass();
        if (C0285e.a(context) >= 221500000) {
            C0283c[] b4 = b(f1079c, list);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new s(b4, 1));
            w.a("APIs must not be empty.", !arrayList.isEmpty());
            ?? fVar = new i1.f(context, o1.g.f4493i, i1.b.f3405a, i1.e.f3407b);
            C0398a a4 = C0398a.a(arrayList, true);
            if (a4.f4486a.isEmpty()) {
                n1.c cVar = new n1.c(0, false);
                b3 = new C1.j();
                b3.h(cVar);
            } else {
                D d4 = new D();
                d4.f3293e = new C0283c[]{AbstractC0475c.f5028c};
                d4.f3290b = true;
                d4.f3291c = 27304;
                d4.f3292d = new C0322i((o1.g) fVar, a4);
                b3 = fVar.b(0, d4.a());
            }
            b bVar = b.f1061L;
            b3.getClass();
            b3.a(C1.h.f240a, bVar);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static C0283c[] b(w1.l lVar, List list) {
        C0283c[] c0283cArr = new C0283c[list.size()];
        for (int r12 = 0; r12 < list.size(); r12++) {
            C0283c c0283c = (C0283c) lVar.get(list.get(r12));
            w.e(c0283c);
            c0283cArr[r12] = c0283c;
        }
        return c0283cArr;
    }
}
