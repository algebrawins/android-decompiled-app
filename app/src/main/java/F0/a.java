package F0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final R.b f604a;

    /* renamed from: b  reason: collision with root package name */
    public final R.b f605b;

    /* renamed from: c  reason: collision with root package name */
    public final R.b f606c;

    public a(R.b bVar, R.b bVar2, R.b bVar3) {
        this.f604a = bVar;
        this.f605b = bVar2;
        this.f606c = bVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        R.b bVar = this.f606c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            bVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        R.b bVar = this.f604a;
        Method method = (Method) bVar.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            bVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        R.b bVar = this.f605b;
        Method method = (Method) bVar.getOrDefault(name, null);
        if (method == null) {
            Class b3 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b3.getDeclaredMethod("write", cls, a.class);
            bVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int r12);

    public final Parcelable f(Parcelable parcelable, int r22) {
        if (!e(r22)) {
            return parcelable;
        }
        return ((b) this).f608e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f608e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (InvocationTargetException e7) {
            if (e7.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e7.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
        }
    }

    public abstract void h(int r12);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f608e.writeString(null);
            return;
        }
        try {
            ((b) this).f608e.writeString(b(cVar.getClass()).getName());
            b a4 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a4);
                int r6 = a4.f611i;
                if (r6 >= 0) {
                    int r62 = a4.f607d.get(r6);
                    Parcel parcel = a4.f608e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(r62);
                    parcel.writeInt(dataPosition - r62);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            } catch (IllegalAccessException e5) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e5);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
            } catch (InvocationTargetException e7) {
                if (e7.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e7.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e7);
            }
        } catch (ClassNotFoundException e8) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e8);
        }
    }
}
