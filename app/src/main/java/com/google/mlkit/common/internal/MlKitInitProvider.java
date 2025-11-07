package com.google.mlkit.common.internal;

import C1.h;
import F1.b;
import F1.c;
import Q1.g;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import k1.w;

/* loaded from: classes.dex */
public class MlKitInitProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        w.g("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.", !providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"));
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Q1.g] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, F1.q] */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean z3;
        Context context = getContext();
        if (context == null) {
            Log.i("MlKitInitProvider", "No context available. Manually call MlKit.initialize(), otherwise ML Kit will not be functional.");
            return false;
        }
        synchronized (g.f1072b) {
            if (g.f1073c == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            w.g("MlKitContext is already initialized", z3);
            ?? obj = new Object();
            g.f1073c = obj;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList a4 = new c(context, new Object()).a();
            G.g gVar = h.f240a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList.addAll(a4);
            arrayList2.add(b.b(context, Context.class, new Class[0]));
            arrayList2.add(b.b(obj, g.class, new Class[0]));
            F1.h hVar = new F1.h(arrayList, arrayList2);
            obj.f1074a = hVar;
            hVar.f();
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
