package io.flutter.plugins.imagepicker;

import android.content.SharedPreferences;
import h2.AbstractActivityC0292d;
import java.util.ArrayList;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractActivityC0292d f3607a;

    public /* synthetic */ b(AbstractActivityC0292d abstractActivityC0292d) {
        this.f3607a = abstractActivityC0292d;
    }

    public void a(ArrayList arrayList, String str, String str2) {
        SharedPreferences.Editor edit = this.f3607a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }
}
