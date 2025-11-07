package o;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import x1.D0;

/* loaded from: classes.dex */
public final class k implements MenuItem {

    /* renamed from: A  reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4427A;

    /* renamed from: a  reason: collision with root package name */
    public final int f4429a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4430b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4431c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4432d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f4433e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f4434f;
    public Intent g;

    /* renamed from: h  reason: collision with root package name */
    public char f4435h;

    /* renamed from: j  reason: collision with root package name */
    public char f4437j;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f4439l;

    /* renamed from: n  reason: collision with root package name */
    public final j f4441n;

    /* renamed from: o  reason: collision with root package name */
    public t f4442o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4443p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f4444q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f4445r;

    /* renamed from: z  reason: collision with root package name */
    public View f4453z;

    /* renamed from: i  reason: collision with root package name */
    public int f4436i = RecognitionOptions.AZTEC;

    /* renamed from: k  reason: collision with root package name */
    public int f4438k = RecognitionOptions.AZTEC;

    /* renamed from: m  reason: collision with root package name */
    public int f4440m = 0;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f4446s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f4447t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f4448u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f4449v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4450w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f4451x = 16;

    /* renamed from: B  reason: collision with root package name */
    public boolean f4428B = false;

    /* renamed from: y  reason: collision with root package name */
    public int f4452y = 0;

    public k(j jVar, int r4, int r5, int r6, int r7, CharSequence charSequence) {
        this.f4441n = jVar;
        this.f4429a = r5;
        this.f4430b = r4;
        this.f4431c = r6;
        this.f4432d = r7;
        this.f4433e = charSequence;
    }

    public static void a(StringBuilder sb, int r12, int r22, String str) {
        if ((r12 & r22) == r22) {
            sb.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f4450w && (this.f4448u || this.f4449v)) {
            drawable = D0.c(drawable).mutate();
            if (this.f4448u) {
                Z.a.h(drawable, this.f4446s);
            }
            if (this.f4449v) {
                Z.a.i(drawable, this.f4447t);
            }
            this.f4450w = false;
        }
        return drawable;
    }

    public final boolean c() {
        if ((this.f4452y & 8) == 0 || this.f4453z == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f4452y & 8) == 0) {
            return false;
        }
        if (this.f4453z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4427A;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f4441n.d(this);
    }

    public final boolean d() {
        if ((this.f4451x & 32) == 32) {
            return true;
        }
        return false;
    }

    public final k e(CharSequence charSequence) {
        this.f4444q = charSequence;
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!c()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4427A;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f4441n.f(this);
    }

    public final void f(boolean z3) {
        if (z3) {
            this.f4451x |= 32;
        } else {
            this.f4451x &= -33;
        }
    }

    public final k g(CharSequence charSequence) {
        this.f4445r = charSequence;
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f4453z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f4438k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f4437j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f4444q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f4430b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f4439l;
        if (drawable != null) {
            return b(drawable);
        }
        int r02 = this.f4440m;
        if (r02 != 0) {
            Drawable c4 = j.b.c(this.f4441n.f4408a, r02);
            this.f4440m = 0;
            this.f4439l = c4;
            return b(c4);
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f4446s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f4447t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f4429a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f4436i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f4435h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f4431c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f4442o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f4433e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4434f;
        if (charSequence == null) {
            return this.f4433e;
        }
        return charSequence;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f4445r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        if (this.f4442o != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f4428B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        if ((this.f4451x & 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        if ((this.f4451x & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        if ((this.f4451x & 16) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        if ((this.f4451x & 8) == 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int r02;
        this.f4453z = view;
        if (view != null && view.getId() == -1 && (r02 = this.f4429a) > 0) {
            view.setId(r02);
        }
        j jVar = this.f4441n;
        jVar.f4417k = true;
        jVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4) {
        if (this.f4437j == c4) {
            return this;
        }
        this.f4437j = Character.toLowerCase(c4);
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int r02 = this.f4451x;
        int r3 = (z3 ? 1 : 0) | (r02 & (-2));
        this.f4451x = r3;
        if (r02 != r3) {
            this.f4441n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        boolean z4;
        int r6;
        int r02 = this.f4451x;
        int r22 = 2;
        if ((r02 & 4) != 0) {
            j jVar = this.f4441n;
            jVar.getClass();
            ArrayList arrayList = jVar.f4413f;
            int size = arrayList.size();
            jVar.s();
            for (int r4 = 0; r4 < size; r4++) {
                k kVar = (k) arrayList.get(r4);
                if (kVar.f4430b == this.f4430b && (kVar.f4451x & 4) != 0 && kVar.isCheckable()) {
                    if (kVar == this) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int r7 = kVar.f4451x;
                    int r8 = r7 & (-3);
                    if (z4) {
                        r6 = 2;
                    } else {
                        r6 = 0;
                    }
                    int r62 = r6 | r8;
                    kVar.f4451x = r62;
                    if (r7 != r62) {
                        kVar.f4441n.o(false);
                    }
                }
            }
            jVar.r();
        } else {
            int r12 = r02 & (-3);
            if (!z3) {
                r22 = 0;
            }
            int r10 = r12 | r22;
            this.f4451x = r10;
            if (r02 != r10) {
                this.f4441n.o(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f4451x |= 16;
        } else {
            this.f4451x &= -17;
        }
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f4440m = 0;
        this.f4439l = drawable;
        this.f4450w = true;
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4446s = colorStateList;
        this.f4448u = true;
        this.f4450w = true;
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4447t = mode;
        this.f4449v = true;
        this.f4450w = true;
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4) {
        if (this.f4435h == c4) {
            return this;
        }
        this.f4435h = c4;
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4427A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4443p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5) {
        this.f4435h = c4;
        this.f4437j = Character.toLowerCase(c5);
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int r4) {
        int r02 = r4 & 3;
        if (r02 != 0 && r02 != 1 && r02 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4452y = r4;
        j jVar = this.f4441n;
        jVar.f4417k = true;
        jVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int r12) {
        setShowAsAction(r12);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f4433e = charSequence;
        this.f4441n.o(false);
        t tVar = this.f4442o;
        if (tVar != null) {
            tVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4434f = charSequence;
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        g(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int r3;
        int r02 = this.f4451x;
        int r12 = r02 & (-9);
        if (z3) {
            r3 = 0;
        } else {
            r3 = 8;
        }
        int r32 = r3 | r12;
        this.f4451x = r32;
        if (r02 != r32) {
            j jVar = this.f4441n;
            jVar.f4414h = true;
            jVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f4433e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c4, int r3) {
        if (this.f4437j == c4 && this.f4438k == r3) {
            return this;
        }
        this.f4437j = Character.toLowerCase(c4);
        this.f4438k = KeyEvent.normalizeMetaState(r3);
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c4, int r3) {
        if (this.f4435h == c4 && this.f4436i == r3) {
            return this;
        }
        this.f4435h = c4;
        this.f4436i = KeyEvent.normalizeMetaState(r3);
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c4, char c5, int r3, int r4) {
        this.f4435h = c4;
        this.f4436i = KeyEvent.normalizeMetaState(r3);
        this.f4437j = Character.toLowerCase(c5);
        this.f4438k = KeyEvent.normalizeMetaState(r4);
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int r22) {
        this.f4439l = null;
        this.f4440m = r22;
        this.f4450w = true;
        this.f4441n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int r22) {
        setTitle(this.f4441n.f4408a.getString(r22));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int r4) {
        int r02;
        Context context = this.f4441n.f4408a;
        View inflate = LayoutInflater.from(context).inflate(r4, (ViewGroup) new LinearLayout(context), false);
        this.f4453z = inflate;
        if (inflate != null && inflate.getId() == -1 && (r02 = this.f4429a) > 0) {
            inflate.setId(r02);
        }
        j jVar = this.f4441n;
        jVar.f4417k = true;
        jVar.o(true);
        return this;
    }
}
