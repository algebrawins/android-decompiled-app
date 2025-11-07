package io.flutter.view;

import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final Method f3763a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f3764b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f3765c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f3766d;

    /* renamed from: e  reason: collision with root package name */
    public final Field f3767e;

    /* renamed from: f  reason: collision with root package name */
    public final Method f3768f;

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Field field;
        Method method5;
        Method method6 = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", null);
        } catch (NoSuchMethodException unused2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        if (Build.VERSION.SDK_INT <= 26) {
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", null);
            } catch (NoSuchMethodException unused3) {
                Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", Integer.TYPE);
                method4 = null;
            } catch (NoSuchMethodException unused4) {
                Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
                method3 = null;
                method4 = null;
            }
            field = method4;
            method6 = method5;
        } else {
            try {
                Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method4 = Class.forName("android.util.LongArray").getMethod("get", Integer.TYPE);
                method3 = null;
                field = declaredField;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method3 = null;
                method4 = null;
                field = null;
            }
        }
        this.f3763a = method;
        this.f3764b = method6;
        this.f3765c = method2;
        this.f3766d = method3;
        this.f3767e = field;
        this.f3768f = method4;
    }

    public static Long a(r rVar, AccessibilityRecord accessibilityRecord) {
        Method method = rVar.f3765c;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(accessibilityRecord, null);
        } catch (IllegalAccessException e4) {
            Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e5);
            return null;
        }
    }

    public static boolean b(long j3, int r4) {
        return (j3 & (1 << r4)) != 0;
    }
}
