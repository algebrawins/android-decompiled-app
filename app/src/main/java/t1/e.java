package t1;

import A0.C0009k;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import c3.k;
import com.google.android.gms.dynamic.ObjectWrapper;
import h1.C0285e;
import h1.C0287g;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import k1.w;
import s1.InterfaceC0453b;
import u1.AbstractC0473a;
import w1.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static Boolean f5009d = null;

    /* renamed from: e  reason: collision with root package name */
    public static String f5010e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f5011f = false;
    public static int g = -1;

    /* renamed from: h  reason: collision with root package name */
    public static Boolean f5012h;

    /* renamed from: l  reason: collision with root package name */
    public static i f5016l;

    /* renamed from: m  reason: collision with root package name */
    public static j f5017m;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5018a;

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal f5013i = new ThreadLocal();

    /* renamed from: j  reason: collision with root package name */
    public static final G.b f5014j = new G.b(2);

    /* renamed from: k  reason: collision with root package name */
    public static final R1.a f5015k = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final C0287g f5007b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static final u f5008c = new Object();

    public e(Context context) {
        w.e(context);
        this.f5018a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!w.h(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e4) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e4.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [t1.h, java.lang.Object] */
    public static e c(Context context, d dVar, String str) {
        Boolean bool;
        InterfaceC0453b x02;
        e eVar;
        j jVar;
        boolean z3;
        InterfaceC0453b x03;
        ThreadLocal threadLocal = f5013i;
        h hVar = (h) threadLocal.get();
        ?? obj = new Object();
        threadLocal.set(obj);
        G.b bVar = f5014j;
        Long l3 = (Long) bVar.get();
        long longValue = l3.longValue();
        try {
            bVar.set(Long.valueOf(SystemClock.elapsedRealtime()));
            C0009k a4 = dVar.a(context, str, f5015k);
            int r02 = a4.f130a;
            int r4 = a4.f131b;
            Log.i("DynamiteModule", "Considering local module " + str + ":" + r02 + " and remote module " + str + ":" + r4);
            int r03 = a4.f132c;
            if (r03 != 0) {
                if (r03 == -1) {
                    if (a4.f130a != 0) {
                        r03 = -1;
                    }
                }
                if (r03 != 1 || a4.f131b != 0) {
                    if (r03 == -1) {
                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                        e eVar2 = new e(context.getApplicationContext());
                        if (longValue == 0) {
                            bVar.remove();
                        } else {
                            bVar.set(l3);
                        }
                        Cursor cursor = obj.f5019a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(hVar);
                        return eVar2;
                    } else if (r03 == 1) {
                        try {
                            int r04 = a4.f131b;
                            try {
                                synchronized (e.class) {
                                    if (g(context)) {
                                        bool = f5009d;
                                    } else {
                                        throw new Exception("Remote loading disabled");
                                    }
                                }
                                if (bool != null) {
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + r04);
                                        synchronized (e.class) {
                                            jVar = f5017m;
                                        }
                                        if (jVar != null) {
                                            h hVar2 = (h) threadLocal.get();
                                            if (hVar2 != null && hVar2.f5019a != null) {
                                                Context applicationContext = context.getApplicationContext();
                                                Cursor cursor2 = hVar2.f5019a;
                                                ObjectWrapper.wrap(null);
                                                synchronized (e.class) {
                                                    if (g >= 2) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                }
                                                if (z3) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    x03 = jVar.y0(ObjectWrapper.wrap(applicationContext), str, r04, ObjectWrapper.wrap(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    x03 = jVar.x0(ObjectWrapper.wrap(applicationContext), str, r04, ObjectWrapper.wrap(cursor2));
                                                }
                                                Context context2 = (Context) ObjectWrapper.unwrap(x03);
                                                if (context2 != null) {
                                                    eVar = new e(context2);
                                                } else {
                                                    throw new Exception("Failed to get module context");
                                                }
                                            } else {
                                                throw new Exception("No result cursor");
                                            }
                                        } else {
                                            throw new Exception("DynamiteLoaderV2 was not cached.");
                                        }
                                    } else {
                                        Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + r04);
                                        i h3 = h(context);
                                        if (h3 != null) {
                                            Parcel Q3 = h3.Q(h3.Y(), 6);
                                            int readInt = Q3.readInt();
                                            Q3.recycle();
                                            if (readInt >= 3) {
                                                h hVar3 = (h) threadLocal.get();
                                                if (hVar3 != null) {
                                                    x02 = h3.y0(ObjectWrapper.wrap(context), str, r04, ObjectWrapper.wrap(hVar3.f5019a));
                                                } else {
                                                    throw new Exception("No cached result cursor holder");
                                                }
                                            } else if (readInt == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                x02 = h3.z0(ObjectWrapper.wrap(context), str, r04);
                                            } else {
                                                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                x02 = h3.x0(ObjectWrapper.wrap(context), str, r04);
                                            }
                                            Object unwrap = ObjectWrapper.unwrap(x02);
                                            if (unwrap != null) {
                                                eVar = new e((Context) unwrap);
                                            } else {
                                                throw new Exception("Failed to load remote module.");
                                            }
                                        } else {
                                            throw new Exception("Failed to create IDynamiteLoader.");
                                        }
                                    }
                                    if (longValue == 0) {
                                        bVar.remove();
                                    } else {
                                        bVar.set(l3);
                                    }
                                    Cursor cursor3 = obj.f5019a;
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    threadLocal.set(hVar);
                                    return eVar;
                                }
                                throw new Exception("Failed to determine which loading route to use.");
                            } catch (RemoteException e4) {
                                throw new Exception("Failed to load remote module.", e4);
                            } catch (b e5) {
                                throw e5;
                            } catch (Throwable th) {
                                try {
                                    w.e(context);
                                } catch (Exception e6) {
                                    Log.e("CrashUtils", "Error adding exception to DropBox!", e6);
                                }
                                throw new Exception("Failed to load remote module.", th);
                            }
                        } catch (b e7) {
                            String message = e7.getMessage();
                            Log.w("DynamiteModule", "Failed to load remote module: " + message);
                            int r12 = a4.f130a;
                            if (r12 != 0 && dVar.a(context, str, new k(r12)).f132c == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                e eVar3 = new e(context.getApplicationContext());
                                if (longValue == 0) {
                                    f5014j.remove();
                                } else {
                                    f5014j.set(l3);
                                }
                                Cursor cursor4 = obj.f5019a;
                                if (cursor4 != null) {
                                    cursor4.close();
                                }
                                f5013i.set(hVar);
                                return eVar3;
                            }
                            throw new Exception("Remote load failed. No local fallback found.", e7);
                        }
                    } else {
                        throw new Exception("VersionPolicy returned invalid code:" + r03);
                    }
                }
            }
            int r13 = a4.f130a;
            int r22 = a4.f131b;
            throw new Exception("No acceptable module " + str + " found. Local version is " + r13 + " and remote version is " + r22 + ".");
        } catch (Throwable th2) {
            if (longValue == 0) {
                f5014j.remove();
            } else {
                f5014j.set(l3);
            }
            Cursor cursor5 = obj.f5019a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f5013i.set(hVar);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0177, code lost:
        if (r2 != false) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.e.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static int e(Context context, String str, boolean z3, boolean z4) {
        boolean z5;
        Cursor cursor = null;
        try {
            try {
                long longValue = ((Long) f5014j.get()).longValue();
                ContentResolver contentResolver = context.getContentResolver();
                String str2 = "api_force_staging";
                boolean z6 = true;
                if (true != z3) {
                    str2 = "api";
                }
                Cursor query = contentResolver.query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(str2).appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(longValue)).build(), null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            boolean z7 = false;
                            int r12 = query.getInt(0);
                            if (r12 > 0) {
                                synchronized (e.class) {
                                    f5010e = query.getString(2);
                                    int columnIndex = query.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        g = query.getInt(columnIndex);
                                    }
                                    int columnIndex2 = query.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (query.getInt(columnIndex2) != 0) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        f5011f = z5;
                                    } else {
                                        z5 = false;
                                    }
                                }
                                h hVar = (h) f5013i.get();
                                if (hVar != null && hVar.f5019a == null) {
                                    hVar.f5019a = query;
                                } else {
                                    z6 = false;
                                }
                                if (!z6) {
                                    cursor = query;
                                }
                                z7 = z5;
                            } else {
                                cursor = query;
                            }
                            if (z4 && z7) {
                                throw new Exception("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return r12;
                        }
                    } catch (Exception e4) {
                        e = e4;
                        if (e instanceof b) {
                            throw e;
                        }
                        throw new Exception("V2 version check failed", e);
                    } catch (Throwable th) {
                        cursor = query;
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new Exception("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [u1.a] */
    public static void f(ClassLoader classLoader) {
        try {
            j jVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof j) {
                    jVar = (j) queryLocalInterface;
                } else {
                    jVar = new AbstractC0473a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
                }
            }
            f5017m = jVar;
        } catch (ClassNotFoundException e4) {
            e = e4;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (IllegalAccessException e5) {
            e = e5;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (InstantiationException e6) {
            e = e6;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (NoSuchMethodException e7) {
            e = e7;
            throw new Exception("Failed to instantiate dynamite loader", e);
        } catch (InvocationTargetException e8) {
            e = e8;
            throw new Exception("Failed to instantiate dynamite loader", e);
        }
    }

    public static boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f5012h)) {
            return true;
        }
        boolean z3 = false;
        if (f5012h == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C0285e.f3262b.c(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z3 = true;
            }
            f5012h = Boolean.valueOf(z3);
            if (z3 && resolveContentProvider != null && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f5011f = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i h(Context context) {
        i iVar;
        synchronized (e.class) {
            i iVar2 = f5016l;
            if (iVar2 != null) {
                return iVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    iVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof i) {
                        iVar = (i) queryLocalInterface;
                    } else {
                        iVar = new AbstractC0473a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                    }
                }
                if (iVar != 0) {
                    f5016l = iVar;
                    return iVar;
                }
            } catch (Exception e4) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e4.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f5018a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e4) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e4);
        }
    }
}
