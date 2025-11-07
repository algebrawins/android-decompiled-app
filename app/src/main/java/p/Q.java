package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import com.example.catering_inventory.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import x1.D0;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: i  reason: collision with root package name */
    public static Q f4563i;

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap f4565a;

    /* renamed from: b  reason: collision with root package name */
    public R.b f4566b;

    /* renamed from: c  reason: collision with root package name */
    public R.l f4567c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap f4568d = new WeakHashMap(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f4569e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4570f;
    public V0.a g;

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f4562h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    public static final P f4564j = new R.f(6);

    public static synchronized Q d() {
        Q q3;
        synchronized (Q.class) {
            try {
                if (f4563i == null) {
                    Q q4 = new Q();
                    f4563i = q4;
                    if (Build.VERSION.SDK_INT < 24) {
                        q4.a("vector", new O(2));
                        q4.a("animated-vector", new O(1));
                        q4.a("animated-selector", new O(0));
                    }
                }
                q3 = f4563i;
            } catch (Throwable th) {
                throw th;
            }
        }
        return q3;
    }

    public static synchronized PorterDuffColorFilter h(int r4, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (Q.class) {
            P p2 = f4564j;
            p2.getClass();
            int r3 = (31 + r4) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) p2.a(Integer.valueOf(mode.hashCode() + r3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(r4, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) p2.b(Integer.valueOf(mode.hashCode() + r3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [R.b, R.k] */
    public final void a(String str, O o3) {
        if (this.f4566b == null) {
            this.f4566b = new R.k();
        }
        this.f4566b.put(str, o3);
    }

    public final synchronized void b(Context context, long j3, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                R.e eVar = (R.e) this.f4568d.get(context);
                if (eVar == null) {
                    eVar = new R.e();
                    this.f4568d.put(context, eVar);
                }
                eVar.e(j3, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int r10) {
        if (this.f4569e == null) {
            this.f4569e = new TypedValue();
        }
        TypedValue typedValue = this.f4569e;
        context.getResources().getValue(r10, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e4 = e(context, j3);
        if (e4 != null) {
            return e4;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null && r10 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j3, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j3) {
        R.e eVar = (R.e) this.f4568d.get(context);
        if (eVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) eVar.d(j3, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b3 = R.d.b(eVar.f1123K, eVar.f1125M, j3);
            if (b3 >= 0) {
                Object[] objArr = eVar.f1124L;
                Object obj = objArr[b3];
                Object obj2 = R.e.f1121N;
                if (obj != obj2) {
                    objArr[b3] = obj2;
                    eVar.f1122J = true;
                }
            }
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int r22) {
        return g(context, r22);
    }

    public final synchronized Drawable g(Context context, int r4) {
        Drawable j3;
        try {
            if (!this.f4570f) {
                this.f4570f = true;
                Drawable f2 = f(context, R.drawable.abc_vector_test);
                if (f2 == null || (!(f2 instanceof E0.q) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName()))) {
                    this.f4570f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            j3 = j(context, r4);
            if (j3 == null) {
                j3 = c(context, r4);
            }
            if (j3 == null) {
                j3 = W.a.b(context, r4);
            }
            if (j3 != null) {
                j3 = l(context, r4, j3);
            }
            if (j3 != null) {
                AbstractC0426z.b(j3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return j3;
    }

    public final synchronized ColorStateList i(Context context, int r5) {
        ColorStateList colorStateList;
        R.l lVar;
        WeakHashMap weakHashMap = this.f4565a;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (lVar = (R.l) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) lVar.c(r5, null);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            V0.a aVar = this.g;
            if (aVar != null) {
                colorStateList2 = aVar.i(context, r5);
            }
            if (colorStateList2 != null) {
                if (this.f4565a == null) {
                    this.f4565a = new WeakHashMap();
                }
                R.l lVar2 = (R.l) this.f4565a.get(context);
                if (lVar2 == null) {
                    lVar2 = new R.l();
                    this.f4565a.put(context, lVar2);
                }
                lVar2.a(r5, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final Drawable j(Context context, int r13) {
        int next;
        R.b bVar = this.f4566b;
        if (bVar == null || bVar.isEmpty()) {
            return null;
        }
        R.l lVar = this.f4567c;
        if (lVar != null) {
            String str = (String) lVar.c(r13, null);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f4566b.getOrDefault(str, null) == null)) {
                return null;
            }
        } else {
            this.f4567c = new R.l();
        }
        if (this.f4569e == null) {
            this.f4569e = new TypedValue();
        }
        TypedValue typedValue = this.f4569e;
        Resources resources = context.getResources();
        resources.getValue(r13, typedValue, true);
        long j3 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e4 = e(context, j3);
        if (e4 != null) {
            return e4;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(r13);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f4567c.a(r13, name);
                    O o3 = (O) this.f4566b.getOrDefault(name, null);
                    if (o3 != null) {
                        e4 = o3.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (e4 != null) {
                        e4.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, j3, e4);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e5) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e5);
            }
        }
        if (e4 == null) {
            this.f4567c.a(r13, "appcompat_skip_skip");
        }
        return e4;
    }

    public final synchronized void k(V0.a aVar) {
        this.g = aVar;
    }

    public final Drawable l(Context context, int r9, Drawable drawable) {
        int r3;
        int r92;
        Drawable drawable2;
        PorterDuffColorFilter h3;
        ColorStateList i3 = i(context, r9);
        if (i3 != null) {
            if (AbstractC0426z.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = D0.c(drawable);
            Z.a.h(drawable, i3);
            PorterDuff.Mode mode = null;
            if (this.g != null && r9 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                Z.a.i(drawable, mode);
            }
        } else {
            if (this.g != null) {
                if (r9 == R.drawable.abc_seekbar_track_material) {
                    LayerDrawable layerDrawable = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                    int b3 = i0.b(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode2 = C0416o.f4670b;
                    V0.a.k(findDrawableByLayerId, b3, mode2);
                    V0.a.k(layerDrawable.findDrawableByLayerId(16908303), i0.b(context, R.attr.colorControlNormal), mode2);
                    V0.a.k(layerDrawable.findDrawableByLayerId(16908301), i0.b(context, R.attr.colorControlActivated), mode2);
                } else if (r9 == R.drawable.abc_ratingbar_material || r9 == R.drawable.abc_ratingbar_indicator_material || r9 == R.drawable.abc_ratingbar_small_material) {
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                    int a4 = i0.a(context, R.attr.colorControlNormal);
                    PorterDuff.Mode mode3 = C0416o.f4670b;
                    V0.a.k(findDrawableByLayerId2, a4, mode3);
                    V0.a.k(layerDrawable2.findDrawableByLayerId(16908303), i0.b(context, R.attr.colorControlActivated), mode3);
                    V0.a.k(layerDrawable2.findDrawableByLayerId(16908301), i0.b(context, R.attr.colorControlActivated), mode3);
                }
            }
            V0.a aVar = this.g;
            boolean z3 = false;
            if (aVar != null) {
                PorterDuff.Mode mode4 = C0416o.f4670b;
                if (V0.a.b((int[]) aVar.f1356J, r9)) {
                    r92 = -1;
                    z3 = true;
                    r3 = R.attr.colorControlNormal;
                } else if (V0.a.b((int[]) aVar.f1358L, r9)) {
                    r92 = -1;
                    z3 = true;
                    r3 = R.attr.colorControlActivated;
                } else {
                    r3 = 16842801;
                    if (V0.a.b((int[]) aVar.f1359M, r9)) {
                        mode4 = PorterDuff.Mode.MULTIPLY;
                    } else if (r9 == R.drawable.abc_list_divider_mtrl_alpha) {
                        r92 = Math.round(40.8f);
                        z3 = true;
                        r3 = 16842800;
                    } else if (r9 != R.drawable.abc_dialog_material_background) {
                        r92 = -1;
                        r3 = 0;
                    }
                    r92 = -1;
                    z3 = true;
                }
                if (z3) {
                    if (AbstractC0426z.a(drawable)) {
                        drawable2 = drawable.mutate();
                    } else {
                        drawable2 = drawable;
                    }
                    int b4 = i0.b(context, r3);
                    synchronized (C0416o.class) {
                        h3 = h(b4, mode4);
                    }
                    drawable2.setColorFilter(h3);
                    if (r92 != -1) {
                        drawable2.setAlpha(r92);
                    }
                }
            }
        }
        return drawable;
    }
}
