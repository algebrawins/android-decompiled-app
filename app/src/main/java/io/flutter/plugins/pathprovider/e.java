package io.flutter.plugins.pathprovider;

import A0.C0001b;
import D.C;
import android.content.Context;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import n2.InterfaceC0394a;
import q0.k;
import r2.f;

/* loaded from: classes.dex */
public class e implements InterfaceC0394a {

    /* renamed from: J  reason: collision with root package name */
    public Context f3664J;

    public final ArrayList a(c cVar) {
        String str;
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        Context context = this.f3664J;
        switch (d.f3663a[cVar.ordinal()]) {
            case 1:
                str = null;
                break;
            case 2:
                str = "music";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "podcasts";
                break;
            case 4:
                str = "ringtones";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "alarms";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "notifications";
                break;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "pictures";
                break;
            case 8:
                str = "movies";
                break;
            case 9:
                str = "downloads";
                break;
            case 10:
                str = "dcim";
                break;
            case 11:
                str = "documents";
                break;
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
        for (File file : context.getExternalFilesDirs(str)) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        C.M((f) c0001b.f84K, null);
    }

    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        try {
            C.M((f) c0001b.f84K, this);
        } catch (Exception e4) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e4);
        }
        this.f3664J = (Context) c0001b.f85L;
    }
}
