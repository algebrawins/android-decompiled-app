package w;

import android.os.Build;
import androidx.camera.core.impl.C0076c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import v.C0479a;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a  reason: collision with root package name */
    public static final C0076c f5094a = new C0076c("camera2.streamSpec.streamUseCase", Long.TYPE, null);

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f5095b;

    /* renamed from: c  reason: collision with root package name */
    public static final HashMap f5096c;

    static {
        HashMap hashMap = new HashMap();
        f5095b = hashMap;
        HashMap hashMap2 = new HashMap();
        f5096c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.m0 m0Var = androidx.camera.core.impl.m0.PREVIEW;
            hashSet.add(m0Var);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(m0Var);
            hashSet2.add(androidx.camera.core.impl.m0.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            androidx.camera.core.impl.m0 m0Var2 = androidx.camera.core.impl.m0.IMAGE_CAPTURE;
            hashSet3.add(m0Var2);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            androidx.camera.core.impl.m0 m0Var3 = androidx.camera.core.impl.m0.VIDEO_CAPTURE;
            hashSet4.add(m0Var3);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(m0Var);
            hashSet5.add(m0Var2);
            hashSet5.add(m0Var3);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(m0Var);
            hashSet6.add(m0Var3);
            hashMap2.put(3L, hashSet6);
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [A.a, v.a] */
    public static C0479a a(C0479a c0479a, long j3) {
        c0479a.getClass();
        C0076c c0076c = f5094a;
        if (D.C.a(c0479a, c0076c) && ((Long) D.C.o(c0479a, c0076c)).longValue() == j3) {
            return null;
        }
        androidx.camera.core.impl.O c4 = androidx.camera.core.impl.O.c(c0479a);
        c4.g(c0076c, Long.valueOf(j3));
        return new A.a(7, c4);
    }

    public static boolean b(androidx.camera.core.impl.m0 m0Var, long j3, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (m0Var == androidx.camera.core.impl.m0.STREAM_SHARING) {
            HashMap hashMap = f5096c;
            if (!hashMap.containsKey(Long.valueOf(j3))) {
                return false;
            }
            Set set = (Set) hashMap.get(Long.valueOf(j3));
            if (list.size() != set.size()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!set.contains((androidx.camera.core.impl.m0) it.next())) {
                    return false;
                }
            }
            return true;
        }
        HashMap hashMap2 = f5095b;
        if (!hashMap2.containsKey(Long.valueOf(j3)) || !((Set) hashMap2.get(Long.valueOf(j3))).contains(m0Var)) {
            return false;
        }
        return true;
    }

    public static boolean c(androidx.camera.core.impl.V v3, androidx.camera.core.impl.m0 m0Var) {
        if (((Boolean) v3.i0(androidx.camera.core.impl.k0.f2215E, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        C0076c c0076c = androidx.camera.core.impl.G.f2128K;
        if (!v3.q(c0076c)) {
            return false;
        }
        int intValue = ((Integer) v3.e(c0076c)).intValue();
        int r4 = f0.f5157a[m0Var.ordinal()];
        if (r4 != 1) {
            return r4 != 2 ? false : false;
        } else if (intValue != 2) {
            return false;
        } else {
            return true;
        }
    }
}
