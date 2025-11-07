package p;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class q0 implements InterfaceC0425y {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f4679a;

    /* renamed from: b  reason: collision with root package name */
    public int f4680b;

    /* renamed from: c  reason: collision with root package name */
    public View f4681c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f4682d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f4683e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f4684f;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f4685h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f4686i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f4687j;

    /* renamed from: k  reason: collision with root package name */
    public Window.Callback f4688k;

    /* renamed from: l  reason: collision with root package name */
    public int f4689l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f4690m;

    public final void a(int r5) {
        View view;
        int r02 = this.f4680b ^ r5;
        this.f4680b = r5;
        if (r02 != 0) {
            if ((r02 & 4) != 0) {
                if ((r5 & 4) != 0) {
                    b();
                }
                int r12 = this.f4680b & 4;
                Toolbar toolbar = this.f4679a;
                if (r12 != 0) {
                    Drawable drawable = this.f4684f;
                    if (drawable == null) {
                        drawable = this.f4690m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((r02 & 3) != 0) {
                c();
            }
            int r13 = r02 & 8;
            Toolbar toolbar2 = this.f4679a;
            if (r13 != 0) {
                if ((r5 & 8) != 0) {
                    toolbar2.setTitle(this.f4685h);
                    toolbar2.setSubtitle(this.f4686i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((r02 & 16) != 0 && (view = this.f4681c) != null) {
                if ((r5 & 16) != 0) {
                    toolbar2.addView(view);
                } else {
                    toolbar2.removeView(view);
                }
            }
        }
    }

    public final void b() {
        if ((this.f4680b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f4687j);
            Toolbar toolbar = this.f4679a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f4689l);
            } else {
                toolbar.setNavigationContentDescription(this.f4687j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int r02 = this.f4680b;
        if ((r02 & 2) != 0) {
            if ((r02 & 1) != 0) {
                drawable = this.f4683e;
                if (drawable == null) {
                    drawable = this.f4682d;
                }
            } else {
                drawable = this.f4682d;
            }
        } else {
            drawable = null;
        }
        this.f4679a.setLogo(drawable);
    }
}
