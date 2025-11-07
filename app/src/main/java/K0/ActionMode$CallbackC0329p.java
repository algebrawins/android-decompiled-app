package k0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: k0.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionMode$CallbackC0329p implements ActionMode.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final ActionMode.Callback f3985a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f3986b;

    /* renamed from: c  reason: collision with root package name */
    public Class f3987c;

    /* renamed from: d  reason: collision with root package name */
    public Method f3988d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3989e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3990f = false;

    public ActionMode$CallbackC0329p(ActionMode.Callback callback, TextView textView) {
        this.f3985a = callback;
        this.f3986b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f3985a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f3985a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f3985a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        boolean z3;
        int checkSelfPermission;
        TextView textView = this.f3986b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.f3990f) {
            this.f3990f = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f3987c = cls;
                this.f3988d = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.f3989e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f3987c = null;
                this.f3988d = null;
                this.f3989e = false;
            }
        }
        try {
            if (this.f3989e && this.f3987c.isInstance(menu)) {
                declaredMethod = this.f3988d;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null) {
                                checkSelfPermission = context.checkSelfPermission(str);
                                if (checkSelfPermission == 0) {
                                }
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int r3 = 0; r3 < arrayList.size(); r3++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(r3);
                MenuItem add = menu.add(0, 0, r3 + 100, resolveInfo2.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z3);
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f3985a.onPrepareActionMode(actionMode, menu);
    }
}
