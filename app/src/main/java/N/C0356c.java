package n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import f0.AbstractC0259e;
import java.lang.reflect.Constructor;
import o.k;

/* renamed from: n.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0356c {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f4123A;

    /* renamed from: D  reason: collision with root package name */
    public final /* synthetic */ C0357d f4126D;

    /* renamed from: a  reason: collision with root package name */
    public final Menu f4127a;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4133h;

    /* renamed from: i  reason: collision with root package name */
    public int f4134i;

    /* renamed from: j  reason: collision with root package name */
    public int f4135j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f4136k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f4137l;

    /* renamed from: m  reason: collision with root package name */
    public int f4138m;

    /* renamed from: n  reason: collision with root package name */
    public char f4139n;

    /* renamed from: o  reason: collision with root package name */
    public int f4140o;

    /* renamed from: p  reason: collision with root package name */
    public char f4141p;

    /* renamed from: q  reason: collision with root package name */
    public int f4142q;

    /* renamed from: r  reason: collision with root package name */
    public int f4143r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4144s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4145t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4146u;

    /* renamed from: v  reason: collision with root package name */
    public int f4147v;

    /* renamed from: w  reason: collision with root package name */
    public int f4148w;

    /* renamed from: x  reason: collision with root package name */
    public String f4149x;

    /* renamed from: y  reason: collision with root package name */
    public String f4150y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f4151z;

    /* renamed from: B  reason: collision with root package name */
    public ColorStateList f4124B = null;

    /* renamed from: C  reason: collision with root package name */
    public PorterDuff.Mode f4125C = null;

    /* renamed from: b  reason: collision with root package name */
    public int f4128b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f4129c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f4130d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f4131e = 0;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4132f = true;
    public boolean g = true;

    public C0356c(C0357d c0357d, Menu menu) {
        this.f4126D = c0357d;
        this.f4127a = menu;
    }

    public final Object a(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.f4126D.f4156c.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e4) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.view.MenuItem$OnMenuItemClickListener, n.b, java.lang.Object] */
    public final void b(MenuItem menuItem) {
        boolean z3;
        MenuItem enabled = menuItem.setChecked(this.f4144s).setVisible(this.f4145t).setEnabled(this.f4146u);
        boolean z4 = false;
        if (this.f4143r >= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        enabled.setCheckable(z3).setTitleCondensed(this.f4137l).setIcon(this.f4138m);
        int r02 = this.f4147v;
        if (r02 >= 0) {
            menuItem.setShowAsAction(r02);
        }
        String str = this.f4150y;
        C0357d c0357d = this.f4126D;
        if (str != null) {
            if (!c0357d.f4156c.isRestricted()) {
                if (c0357d.f4157d == null) {
                    c0357d.f4157d = C0357d.a(c0357d.f4156c);
                }
                Object obj = c0357d.f4157d;
                String str2 = this.f4150y;
                ?? obj2 = new Object();
                obj2.f4121a = obj;
                Class<?> cls = obj.getClass();
                try {
                    obj2.f4122b = cls.getMethod(str2, MenuItem$OnMenuItemClickListenerC0355b.f4120c);
                    menuItem.setOnMenuItemClickListener(obj2);
                } catch (Exception e4) {
                    InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str2 + " in class " + cls.getName());
                    inflateException.initCause(e4);
                    throw inflateException;
                }
            } else {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
        }
        boolean z5 = menuItem instanceof k;
        if (z5) {
            k kVar = (k) menuItem;
        }
        if (this.f4143r >= 2 && z5) {
            k kVar2 = (k) menuItem;
            kVar2.f4451x = (kVar2.f4451x & (-5)) | 4;
        }
        String str3 = this.f4149x;
        if (str3 != null) {
            menuItem.setActionView((View) a(str3, C0357d.f4152e, c0357d.f4154a));
            z4 = true;
        }
        int r03 = this.f4148w;
        if (r03 > 0) {
            if (!z4) {
                menuItem.setActionView(r03);
            } else {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            }
        }
        CharSequence charSequence = this.f4151z;
        boolean z6 = menuItem instanceof k;
        if (z6) {
            ((k) menuItem).e(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0259e.h(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.f4123A;
        if (z6) {
            ((k) menuItem).g(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0259e.m(menuItem, charSequence2);
        }
        char c4 = this.f4139n;
        int r3 = this.f4140o;
        if (z6) {
            ((k) menuItem).setAlphabeticShortcut(c4, r3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0259e.g(menuItem, c4, r3);
        }
        char c5 = this.f4141p;
        int r32 = this.f4142q;
        if (z6) {
            ((k) menuItem).setNumericShortcut(c5, r32);
        } else if (Build.VERSION.SDK_INT >= 26) {
            AbstractC0259e.k(menuItem, c5, r32);
        }
        PorterDuff.Mode mode = this.f4125C;
        if (mode != null) {
            if (z6) {
                ((k) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0259e.j(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.f4124B;
        if (colorStateList != null) {
            if (z6) {
                ((k) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                AbstractC0259e.i(menuItem, colorStateList);
            }
        }
    }
}
