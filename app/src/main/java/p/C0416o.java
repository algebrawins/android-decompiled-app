package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import com.example.catering_inventory.R;

/* renamed from: p.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416o {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f4670b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static C0416o f4671c;

    /* renamed from: a  reason: collision with root package name */
    public Q f4672a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [p.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, V0.a] */
    public static synchronized void b() {
        synchronized (C0416o.class) {
            if (f4671c == null) {
                ?? obj = new Object();
                f4671c = obj;
                obj.f4672a = Q.d();
                Q q3 = f4671c.f4672a;
                ?? obj2 = new Object();
                obj2.f1356J = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
                obj2.f1357K = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                obj2.f1358L = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
                obj2.f1359M = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
                obj2.f1360N = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                obj2.f1361O = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                q3.k(obj2);
            }
        }
    }

    public static void c(Drawable drawable, B0.d dVar, int[] r5) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = Q.f4562h;
        if (AbstractC0426z.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z3 = dVar.f180b;
        if (!z3 && !dVar.f179a) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z3) {
                colorStateList = (ColorStateList) dVar.f181c;
            } else {
                colorStateList = null;
            }
            if (dVar.f179a) {
                mode = (PorterDuff.Mode) dVar.f182d;
            } else {
                mode = Q.f4562h;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = Q.h(colorStateList.getColorForState(r5, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable a(Context context, int r3) {
        return this.f4672a.f(context, r3);
    }
}
