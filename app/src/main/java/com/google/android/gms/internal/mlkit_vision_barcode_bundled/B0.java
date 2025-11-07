package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class B0 {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f2767a;

    static {
        char[] cArr = new char[80];
        f2767a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int r5, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, r5, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, r5, str, entry);
            }
        } else {
            sb.append('\n');
            b(r5, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int r12 = 1; r12 < str.length(); r12++) {
                    char charAt = str.charAt(r12);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(S0.b(new K(((String) obj).getBytes(AbstractC0192j0.f2920a))));
                sb.append('\"');
            } else if (obj instanceof L) {
                sb.append(": \"");
                sb.append(S0.b((L) obj));
                sb.append('\"');
            } else if (obj instanceof AbstractC0168a0) {
                sb.append(" {");
                c((AbstractC0168a0) obj, sb, r5 + 2);
                sb.append("\n");
                b(r5, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int r6 = r5 + 2;
                a(sb, r6, "key", entry2.getKey());
                a(sb, r6, "value", entry2.getValue());
                sb.append("\n");
                b(r5, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static void b(int r3, StringBuilder sb) {
        while (r3 > 0) {
            int r02 = 80;
            if (r3 <= 80) {
                r02 = r3;
            }
            sb.append(f2767a, 0, r02);
            r3 -= r02;
        }
    }

    public static void c(AbstractC0168a0 abstractC0168a0, StringBuilder sb, int r20) {
        int r13;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC0168a0.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int r9 = 0;
        while (true) {
            r13 = 3;
            if (r9 >= length) {
                break;
            }
            Method method3 = declaredMethods[r9];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            r9++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(r13);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                a(sb, r20, substring.substring(0, substring.length() - 4), AbstractC0168a0.f(method2, abstractC0168a0, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, r20, substring.substring(0, substring.length() - 3), AbstractC0168a0.f(method, abstractC0168a0, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object f2 = AbstractC0168a0.f(method4, abstractC0168a0, new Object[0]);
                    if (method5 == null) {
                        if (f2 instanceof Boolean) {
                            if (!((Boolean) f2).booleanValue()) {
                            }
                            a(sb, r20, substring, f2);
                        } else if (f2 instanceof Integer) {
                            if (((Integer) f2).intValue() == 0) {
                            }
                            a(sb, r20, substring, f2);
                        } else if (f2 instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) f2).floatValue()) == 0) {
                            }
                            a(sb, r20, substring, f2);
                        } else if (f2 instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) f2).doubleValue()) == 0) {
                            }
                            a(sb, r20, substring, f2);
                        } else {
                            if (f2 instanceof String) {
                                equals = f2.equals("");
                            } else if (f2 instanceof L) {
                                equals = f2.equals(L.f2812K);
                            } else if (f2 instanceof D) {
                                if (f2 == ((AbstractC0168a0) ((AbstractC0168a0) ((D) f2)).m(6, null))) {
                                }
                                a(sb, r20, substring, f2);
                            } else {
                                if ((f2 instanceof Enum) && ((Enum) f2).ordinal() == 0) {
                                }
                                a(sb, r20, substring, f2);
                            }
                            if (equals) {
                            }
                            a(sb, r20, substring, f2);
                        }
                    } else {
                        if (!((Boolean) AbstractC0168a0.f(method5, abstractC0168a0, new Object[0])).booleanValue()) {
                        }
                        a(sb, r20, substring, f2);
                    }
                }
            }
            r13 = 3;
        }
        if (abstractC0168a0 instanceof X) {
            Iterator d4 = ((X) abstractC0168a0).zza.d();
            while (true) {
                androidx.datastore.preferences.protobuf.m0 m0Var = (androidx.datastore.preferences.protobuf.m0) d4;
                if (!m0Var.hasNext()) {
                    break;
                }
                Map.Entry entry2 = (Map.Entry) m0Var.next();
                a(sb, r20, D.C.v(((Y) entry2.getKey()).f2865J, "[", "]"), entry2.getValue());
            }
        }
        V0 v02 = abstractC0168a0.zzc;
        if (v02 != null) {
            for (int r8 = 0; r8 < v02.f2857a; r8++) {
                a(sb, r20, String.valueOf(v02.f2858b[r8] >>> 3), v02.f2859c[r8]);
            }
        }
    }
}
