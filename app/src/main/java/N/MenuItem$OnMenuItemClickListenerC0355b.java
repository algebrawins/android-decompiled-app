package n;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: n.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class MenuItem$OnMenuItemClickListenerC0355b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f4120c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f4121a;

    /* renamed from: b  reason: collision with root package name */
    public Method f4122b;

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f4122b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f4121a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }
}
