package V0;

import A0.C0001b;
import D.C;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import b1.InterfaceC0147c;
import c1.InterfaceC0161c;
import com.example.catering_inventory.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p.AbstractC0426z;
import p.C0416o;
import p.Q;
import p.i0;
import w.d0;

/* loaded from: classes.dex */
public final class a implements X0.b {

    /* renamed from: J  reason: collision with root package name */
    public Object f1356J;

    /* renamed from: K  reason: collision with root package name */
    public Object f1357K;

    /* renamed from: L  reason: collision with root package name */
    public Object f1358L;

    /* renamed from: M  reason: collision with root package name */
    public Object f1359M;

    /* renamed from: N  reason: collision with root package name */
    public Object f1360N;

    /* renamed from: O  reason: collision with root package name */
    public Object f1361O;

    public a(Set set, String str, String str2) {
        Set unmodifiableSet;
        A1.a aVar = A1.a.f168b;
        if (set == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            unmodifiableSet = Collections.unmodifiableSet(set);
        }
        this.f1358L = unmodifiableSet;
        Map emptyMap = Collections.emptyMap();
        this.f1356J = str;
        this.f1360N = str2;
        this.f1361O = aVar;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = emptyMap.values().iterator();
        if (!it.hasNext()) {
            this.f1359M = Collections.unmodifiableSet(hashSet);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static boolean b(int[] r4, int r5) {
        for (int r3 : r4) {
            if (r3 == r5) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int r6) {
        int b3 = i0.b(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{i0.f4643b, i0.f4645d, i0.f4644c, i0.f4647f}, new int[]{i0.a(context, R.attr.colorButtonNormal), Y.a.b(b3, r6), Y.a.b(b3, r6), r6});
    }

    public static void k(Drawable drawable, int r22, PorterDuff.Mode mode) {
        PorterDuffColorFilter h3;
        if (AbstractC0426z.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0416o.f4670b;
        }
        PorterDuff.Mode mode2 = C0416o.f4670b;
        synchronized (C0416o.class) {
            h3 = Q.h(r22, mode);
        }
        drawable.setColorFilter(h3);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f1361O;
        if (hashMap != null) {
            hashMap.put(str, str2);
            return;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    public b c() {
        String str;
        if (((String) this.f1356J) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((f) this.f1358L) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f1359M) == null) {
            str = C.y(str, " eventMillis");
        }
        if (((Long) this.f1360N) == null) {
            str = C.y(str, " uptimeMillis");
        }
        if (((HashMap) this.f1361O) == null) {
            str = C.y(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new b((String) this.f1356J, (Integer) this.f1357K, (f) this.f1358L, ((Long) this.f1359M).longValue(), ((Long) this.f1360N).longValue(), (HashMap) this.f1361O);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ArrayList e() {
        ArrayList arrayList;
        synchronized (this.f1357K) {
            arrayList = new ArrayList((LinkedHashSet) this.f1358L);
        }
        return arrayList;
    }

    public ArrayList f() {
        ArrayList arrayList;
        synchronized (this.f1357K) {
            arrayList = new ArrayList((LinkedHashSet) this.f1359M);
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList;
        synchronized (this.f1357K) {
            arrayList = new ArrayList((LinkedHashSet) this.f1360N);
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, d1.a] */
    @Override // A2.a
    public Object get() {
        return new a1.g((Context) ((A.c) this.f1356J).f5K, (W0.g) ((A2.a) this.f1357K).get(), (InterfaceC0147c) ((A2.a) this.f1358L).get(), (a1.d) ((C0001b) this.f1359M).get(), (Executor) ((A2.a) this.f1360N).get(), (InterfaceC0161c) ((A2.a) this.f1361O).get(), new Object());
    }

    public ArrayList h() {
        ArrayList arrayList;
        synchronized (this.f1357K) {
            arrayList = new ArrayList();
            arrayList.addAll(e());
            arrayList.addAll(g());
        }
        return arrayList;
    }

    public ColorStateList i(Context context, int r10) {
        if (r10 == R.drawable.abc_edit_text_material) {
            return j.b.b(context, R.color.abc_tint_edittext);
        }
        if (r10 == R.drawable.abc_switch_track_mtrl_alpha) {
            return j.b.b(context, R.color.abc_tint_switch_track);
        }
        if (r10 == R.drawable.abc_switch_thumb_material) {
            int[][] r02 = new int[3];
            int[] r102 = new int[3];
            ColorStateList c4 = i0.c(context, R.attr.colorSwitchThumbNormal);
            if (c4 != null && c4.isStateful()) {
                int[] r22 = i0.f4643b;
                r02[0] = r22;
                r102[0] = c4.getColorForState(r22, 0);
                r02[1] = i0.f4646e;
                r102[1] = i0.b(context, R.attr.colorControlActivated);
                r02[2] = i0.f4647f;
                r102[2] = c4.getDefaultColor();
            } else {
                r02[0] = i0.f4643b;
                r102[0] = i0.a(context, R.attr.colorSwitchThumbNormal);
                r02[1] = i0.f4646e;
                r102[1] = i0.b(context, R.attr.colorControlActivated);
                r02[2] = i0.f4647f;
                r102[2] = i0.b(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(r02, r102);
        } else if (r10 == R.drawable.abc_btn_default_mtrl_shape) {
            return d(context, i0.b(context, R.attr.colorButtonNormal));
        } else {
            if (r10 == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (r10 == R.drawable.abc_btn_colored_material) {
                return d(context, i0.b(context, R.attr.colorAccent));
            }
            if (r10 != R.drawable.abc_spinner_mtrl_am_alpha && r10 != R.drawable.abc_spinner_textfield_background_material) {
                if (b((int[]) this.f1357K, r10)) {
                    return i0.c(context, R.attr.colorControlNormal);
                }
                if (b((int[]) this.f1360N, r10)) {
                    return j.b.b(context, R.color.abc_tint_default);
                }
                if (b((int[]) this.f1361O, r10)) {
                    return j.b.b(context, R.color.abc_tint_btn_checkable);
                }
                if (r10 == R.drawable.abc_seekbar_thumb_material) {
                    return j.b.b(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return j.b.b(context, R.color.abc_tint_spinner);
        }
    }

    public void j(d0 d0Var) {
        synchronized (this.f1357K) {
            ((LinkedHashSet) this.f1360N).add(d0Var);
        }
    }
}
