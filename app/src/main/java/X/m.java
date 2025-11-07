package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f1566a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap f1567b = new WeakHashMap(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f1568c = new Object();

    public static void a(l lVar, int r4, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f1568c) {
            try {
                WeakHashMap weakHashMap = f1567b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(lVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(lVar, sparseArray);
                }
                sparseArray.append(r4, new k(colorStateList, lVar.f1564a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
