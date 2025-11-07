package C0;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.example.catering_inventory.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import x1.Y;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f233d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f234e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f237c;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f236b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f235a = new HashMap();

    public a(Context context) {
        this.f237c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f233d == null) {
            synchronized (f234e) {
                try {
                    if (f233d == null) {
                        f233d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f233d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f237c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f236b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException(e4);
            }
        }
    }

    public final void b(Class cls, HashSet hashSet) {
        boolean z3;
        boolean z4 = false;
        if (Build.VERSION.SDK_INT >= 29) {
            z3 = D0.a.c();
        } else {
            try {
                if (Y.f5805b == null) {
                    Y.f5804a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                    Y.f5805b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                }
                z4 = ((Boolean) Y.f5805b.invoke(null, Long.valueOf(Y.f5804a))).booleanValue();
            } catch (Exception e4) {
                Y.a("isTagEnabled", e4);
            }
            z3 = z4;
        }
        if (z3) {
            try {
                Trace.beginSection(Y.b(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f235a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a4 = bVar.a();
                if (!a4.isEmpty()) {
                    for (Class cls2 : a4) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                Object b3 = bVar.b(this.f237c);
                hashSet.remove(cls);
                hashMap.put(cls, b3);
            } else {
                hashMap.get(cls);
            }
            Trace.endSection();
            return;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
