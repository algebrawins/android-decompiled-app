package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import d2.C0235c;
import f0.AbstractC0252A;
import f0.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import k0.C0322i;
import p.InterfaceC0413l;

/* loaded from: classes.dex */
public class j implements Menu {

    /* renamed from: u  reason: collision with root package name */
    public static final int[] f4407u = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f4408a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f4409b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4410c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4411d;

    /* renamed from: e  reason: collision with root package name */
    public C0235c f4412e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f4413f;
    public final ArrayList g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4414h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f4415i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f4416j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4417k;

    /* renamed from: l  reason: collision with root package name */
    public CharSequence f4418l;

    /* renamed from: s  reason: collision with root package name */
    public k f4425s;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4419m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f4420n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f4421o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4422p = false;

    /* renamed from: q  reason: collision with root package name */
    public final ArrayList f4423q = new ArrayList();

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f4424r = new CopyOnWriteArrayList();

    /* renamed from: t  reason: collision with root package name */
    public boolean f4426t = false;

    public j(Context context) {
        boolean z3;
        boolean z4 = false;
        this.f4408a = context;
        Resources resources = context.getResources();
        this.f4409b = resources;
        this.f4413f = new ArrayList();
        this.g = new ArrayList();
        this.f4414h = true;
        this.f4415i = new ArrayList();
        this.f4416j = new ArrayList();
        this.f4417k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC0252A.f3148a;
            if (Build.VERSION.SDK_INT >= 28) {
                z3 = y.b(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                z4 = true;
            }
        }
        this.f4411d = z4;
    }

    public final k a(int r10, int r11, int r12, CharSequence charSequence) {
        int r112;
        int r02 = ((-65536) & r12) >> 16;
        if (r02 >= 0 && r02 < 6) {
            int r03 = (f4407u[r02] << 16) | (65535 & r12);
            k kVar = new k(this, r10, r11, r12, r03, charSequence);
            ArrayList arrayList = this.f4413f;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((k) arrayList.get(size)).f4432d <= r03) {
                        r112 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    r112 = 0;
                    break;
                }
            }
            arrayList.add(r112, kVar);
            o(true);
            return kVar;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r8, int r9, int r10, ComponentName componentName, Intent[] intentArr, Intent intent, int r14, MenuItem[] menuItemArr) {
        int r22;
        Intent intent2;
        int r142;
        PackageManager packageManager = this.f4408a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            r22 = queryIntentActivityOptions.size();
        } else {
            r22 = 0;
        }
        if ((r14 & 1) == 0) {
            removeGroup(r8);
        }
        for (int r12 = 0; r12 < r22; r12++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(r12);
            int r4 = resolveInfo.specificIndex;
            if (r4 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[r4];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            k a4 = a(r8, r9, r10, resolveInfo.loadLabel(packageManager));
            a4.setIcon(resolveInfo.loadIcon(packageManager));
            a4.g = intent3;
            if (menuItemArr != null && (r142 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[r142] = a4;
            }
        }
        return r22;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(p pVar, Context context) {
        this.f4424r.add(new WeakReference(pVar));
        pVar.c(context, this);
        this.f4417k = true;
    }

    public final void c(boolean z3) {
        if (this.f4422p) {
            return;
        }
        this.f4422p = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4424r;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                pVar.a(this, z3);
            }
        }
        this.f4422p = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        k kVar = this.f4425s;
        if (kVar != null) {
            d(kVar);
        }
        this.f4413f.clear();
        o(true);
    }

    public final void clearHeader() {
        this.f4418l = null;
        o(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4424r;
        boolean z3 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f4425s == kVar) {
            s();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                p pVar = (p) weakReference.get();
                if (pVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z3 = pVar.k(kVar);
                    if (z3) {
                        break;
                    }
                }
            }
            r();
            if (z3) {
                this.f4425s = null;
            }
        }
        return z3;
    }

    public boolean e(j jVar, MenuItem menuItem) {
        InterfaceC0413l interfaceC0413l;
        C0235c c0235c = this.f4412e;
        if (c0235c != null && (interfaceC0413l = ((ActionMenuView) c0235c.f3003K).j0) != null) {
            ((Toolbar) ((C0322i) interfaceC0413l).f3983K).getClass();
            return false;
        }
        return false;
    }

    public boolean f(k kVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4424r;
        boolean z3 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        s();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 = pVar.i(kVar);
                if (z3) {
                    break;
                }
            }
        }
        r();
        if (z3) {
            this.f4425s = kVar;
        }
        return z3;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int r6) {
        MenuItem findItem;
        ArrayList arrayList = this.f4413f;
        int size = arrayList.size();
        for (int r22 = 0; r22 < size; r22++) {
            k kVar = (k) arrayList.get(r22);
            if (kVar.f4429a == r6) {
                return kVar;
            }
            if (kVar.hasSubMenu() && (findItem = kVar.f4442o.findItem(r6)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final k g(int r12, KeyEvent keyEvent) {
        char c4;
        ArrayList arrayList = this.f4423q;
        arrayList.clear();
        h(arrayList, r12, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (k) arrayList.get(0);
        }
        boolean m3 = m();
        for (int r6 = 0; r6 < size; r6++) {
            k kVar = (k) arrayList.get(r6);
            if (m3) {
                c4 = kVar.f4437j;
            } else {
                c4 = kVar.f4435h;
            }
            char[] cArr = keyData.meta;
            if ((c4 == cArr[0] && (metaState & 2) == 0) || ((c4 == cArr[2] && (metaState & 2) != 0) || (m3 && c4 == '\b' && r12 == 67))) {
                return kVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int r22) {
        return (MenuItem) this.f4413f.get(r22);
    }

    public final void h(ArrayList arrayList, int r18, KeyEvent keyEvent) {
        char c4;
        int r14;
        boolean m3 = m();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && r18 != 67) {
            return;
        }
        ArrayList arrayList2 = this.f4413f;
        int size = arrayList2.size();
        for (int r11 = 0; r11 < size; r11++) {
            k kVar = (k) arrayList2.get(r11);
            if (kVar.hasSubMenu()) {
                kVar.f4442o.h(arrayList, r18, keyEvent);
            }
            if (m3) {
                c4 = kVar.f4437j;
            } else {
                c4 = kVar.f4435h;
            }
            if (m3) {
                r14 = kVar.f4438k;
            } else {
                r14 = kVar.f4436i;
            }
            if ((modifiers & 69647) == (r14 & 69647) && c4 != 0) {
                char[] cArr = keyData.meta;
                if (c4 != cArr[0] && c4 != cArr[2]) {
                    if (m3 && c4 == '\b') {
                        if (r18 != 67) {
                        }
                    }
                }
                if (kVar.isEnabled()) {
                    arrayList.add(kVar);
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        ArrayList arrayList = this.f4413f;
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            if (((k) arrayList.get(r3)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList k3 = k();
        if (!this.f4417k) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4424r;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            p pVar = (p) weakReference.get();
            if (pVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z3 |= pVar.e();
            }
        }
        ArrayList arrayList = this.f4415i;
        ArrayList arrayList2 = this.f4416j;
        if (z3) {
            arrayList.clear();
            arrayList2.clear();
            int size = k3.size();
            for (int r5 = 0; r5 < size; r5++) {
                k kVar = (k) k3.get(r5);
                if (kVar.d()) {
                    arrayList.add(kVar);
                } else {
                    arrayList2.add(kVar);
                }
            }
        } else {
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(k());
        }
        this.f4417k = false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r12, KeyEvent keyEvent) {
        if (g(r12, keyEvent) != null) {
            return true;
        }
        return false;
    }

    public final ArrayList k() {
        boolean z3 = this.f4414h;
        ArrayList arrayList = this.g;
        if (!z3) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f4413f;
        int size = arrayList2.size();
        for (int r4 = 0; r4 < size; r4++) {
            k kVar = (k) arrayList2.get(r4);
            if (kVar.isVisible()) {
                arrayList.add(kVar);
            }
        }
        this.f4414h = false;
        this.f4417k = true;
        return arrayList;
    }

    public boolean l() {
        return this.f4426t;
    }

    public boolean m() {
        return this.f4410c;
    }

    public boolean n() {
        return this.f4411d;
    }

    public final void o(boolean z3) {
        if (!this.f4419m) {
            if (z3) {
                this.f4414h = true;
                this.f4417k = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f4424r;
            if (!copyOnWriteArrayList.isEmpty()) {
                s();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    p pVar = (p) weakReference.get();
                    if (pVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        pVar.f();
                    }
                }
                r();
                return;
            }
            return;
        }
        this.f4420n = true;
        if (z3) {
            this.f4421o = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean p(android.view.MenuItem r6, o.l r7, int r8) {
        /*
            r5 = this;
            o.k r6 = (o.k) r6
            r0 = 0
            if (r6 == 0) goto Lab
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto Ld
            goto Lab
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r6.f4443p
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r6)
            if (r1 == 0) goto L1a
        L18:
            r1 = 1
            goto L36
        L1a:
            o.j r1 = r6.f4441n
            boolean r3 = r1.e(r1, r6)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r6.g
            if (r3 == 0) goto L35
            android.content.Context r1 = r1.f4408a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L35:
            r1 = 0
        L36:
            boolean r3 = r6.c()
            if (r3 == 0) goto L47
            boolean r6 = r6.expandActionView()
            r1 = r1 | r6
            if (r1 == 0) goto Laa
            r5.c(r2)
            goto Laa
        L47:
            boolean r3 = r6.hasSubMenu()
            if (r3 != 0) goto L55
            r6 = r8 & 1
            if (r6 != 0) goto Laa
            r5.c(r2)
            goto Laa
        L55:
            r8 = r8 & 4
            if (r8 != 0) goto L5c
            r5.c(r0)
        L5c:
            boolean r8 = r6.hasSubMenu()
            if (r8 != 0) goto L70
            o.t r8 = new o.t
            android.content.Context r3 = r5.f4408a
            r8.<init>(r3, r5, r6)
            r6.f4442o = r8
            java.lang.CharSequence r3 = r6.f4433e
            r8.setHeaderTitle(r3)
        L70:
            o.t r6 = r6.f4442o
            java.util.concurrent.CopyOnWriteArrayList r8 = r5.f4424r
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L7b
            goto La4
        L7b:
            if (r7 == 0) goto L81
            boolean r0 = r7.j(r6)
        L81:
            java.util.Iterator r7 = r8.iterator()
        L85:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto La4
            java.lang.Object r3 = r7.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            o.p r4 = (o.p) r4
            if (r4 != 0) goto L9d
            r8.remove(r3)
            goto L85
        L9d:
            if (r0 != 0) goto L85
            boolean r0 = r4.j(r6)
            goto L85
        La4:
            r1 = r1 | r0
            if (r1 != 0) goto Laa
            r5.c(r2)
        Laa:
            return r1
        Lab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.j.p(android.view.MenuItem, o.l, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r22, int r3) {
        return p(findItem(r22), null, r3);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r12, KeyEvent keyEvent, int r3) {
        boolean z3;
        k g = g(r12, keyEvent);
        if (g != null) {
            z3 = p(g, null, r3);
        } else {
            z3 = false;
        }
        if ((r3 & 2) != 0) {
            c(true);
        }
        return z3;
    }

    public final void q(int r12, CharSequence charSequence, int r3, View view) {
        if (view != null) {
            this.f4418l = null;
        } else {
            if (r12 > 0) {
                this.f4418l = this.f4409b.getText(r12);
            } else if (charSequence != null) {
                this.f4418l = charSequence;
            }
            if (r3 > 0) {
                W.a.b(this.f4408a, r3);
            }
        }
        o(false);
    }

    public final void r() {
        this.f4419m = false;
        if (this.f4420n) {
            this.f4420n = false;
            o(this.f4421o);
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int r7) {
        ArrayList arrayList = this.f4413f;
        int size = arrayList.size();
        int r22 = 0;
        int r3 = 0;
        while (true) {
            if (r3 < size) {
                if (((k) arrayList.get(r3)).f4430b == r7) {
                    break;
                }
                r3++;
            } else {
                r3 = -1;
                break;
            }
        }
        if (r3 >= 0) {
            int size2 = arrayList.size() - r3;
            while (true) {
                int r4 = r22 + 1;
                if (r22 >= size2 || ((k) arrayList.get(r3)).f4430b != r7) {
                    break;
                }
                if (r3 >= 0) {
                    ArrayList arrayList2 = this.f4413f;
                    if (r3 < arrayList2.size()) {
                        arrayList2.remove(r3);
                    }
                }
                r22 = r4;
            }
            o(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int r5) {
        ArrayList arrayList = this.f4413f;
        int size = arrayList.size();
        int r22 = 0;
        while (true) {
            if (r22 < size) {
                if (((k) arrayList.get(r22)).f4429a == r5) {
                    break;
                }
                r22++;
            } else {
                r22 = -1;
                break;
            }
        }
        if (r22 >= 0) {
            ArrayList arrayList2 = this.f4413f;
            if (r22 < arrayList2.size()) {
                arrayList2.remove(r22);
                o(true);
            }
        }
    }

    public final void s() {
        if (!this.f4419m) {
            this.f4419m = true;
            this.f4420n = false;
            this.f4421o = false;
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r8, boolean z3, boolean z4) {
        int r6;
        ArrayList arrayList = this.f4413f;
        int size = arrayList.size();
        for (int r3 = 0; r3 < size; r3++) {
            k kVar = (k) arrayList.get(r3);
            if (kVar.f4430b == r8) {
                int r5 = kVar.f4451x & (-5);
                if (z4) {
                    r6 = 4;
                } else {
                    r6 = 0;
                }
                kVar.f4451x = r5 | r6;
                kVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f4426t = z3;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r6, boolean z3) {
        ArrayList arrayList = this.f4413f;
        int size = arrayList.size();
        for (int r22 = 0; r22 < size; r22++) {
            k kVar = (k) arrayList.get(r22);
            if (kVar.f4430b == r6) {
                kVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r11, boolean z3) {
        int r9;
        ArrayList arrayList = this.f4413f;
        int size = arrayList.size();
        boolean z4 = false;
        for (int r3 = 0; r3 < size; r3++) {
            k kVar = (k) arrayList.get(r3);
            if (kVar.f4430b == r11) {
                int r7 = kVar.f4451x;
                int r8 = r7 & (-9);
                if (z3) {
                    r9 = 0;
                } else {
                    r9 = 8;
                }
                int r82 = r8 | r9;
                kVar.f4451x = r82;
                if (r7 != r82) {
                    z4 = true;
                }
            }
        }
        if (z4) {
            o(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f4410c = z3;
        o(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f4413f.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int r22) {
        return a(0, 0, 0, this.f4409b.getString(r22));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r22) {
        return addSubMenu(0, 0, 0, this.f4409b.getString(r22));
    }

    @Override // android.view.Menu
    public final MenuItem add(int r12, int r22, int r3, CharSequence charSequence) {
        return a(r12, r22, r3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r12, int r22, int r3, CharSequence charSequence) {
        k a4 = a(r12, r22, r3, charSequence);
        t tVar = new t(this.f4408a, this, a4);
        a4.f4442o = tVar;
        tVar.setHeaderTitle(a4.f4433e);
        return tVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(int r22, int r3, int r4, int r5) {
        return a(r22, r3, r4, this.f4409b.getString(r5));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int r22, int r3, int r4, int r5) {
        return addSubMenu(r22, r3, r4, this.f4409b.getString(r5));
    }

    public j j() {
        return this;
    }
}
