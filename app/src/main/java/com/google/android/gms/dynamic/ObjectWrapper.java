package com.google.android.gms.dynamic;

import D.C;
import android.os.IBinder;
import java.lang.reflect.Field;
import k1.w;
import s1.InterfaceC0453b;

/* loaded from: classes.dex */
public final class ObjectWrapper<T> extends IObjectWrapper$Stub {

    /* renamed from: l  reason: collision with root package name */
    public final Object f2765l;

    public ObjectWrapper(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper");
        this.f2765l = obj;
    }

    public static <T> T unwrap(InterfaceC0453b interfaceC0453b) {
        if (interfaceC0453b instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) interfaceC0453b).f2765l;
        }
        IBinder asBinder = interfaceC0453b.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int r3 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                r3++;
                field = field2;
            }
        }
        if (r3 == 1) {
            w.e(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return (T) field.get(asBinder);
                } catch (IllegalAccessException e4) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e4);
                } catch (NullPointerException e5) {
                    throw new IllegalArgumentException("Binder object is null.", e5);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        throw new IllegalArgumentException(C.w("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
    }

    public static <T> InterfaceC0453b wrap(T t3) {
        return new ObjectWrapper(t3);
    }
}
