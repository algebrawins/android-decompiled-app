package y;

import D.C0042x;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: y.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0772a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f6163a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f6164b;

    static {
        C0042x c0042x;
        HashMap hashMap = new HashMap();
        f6163a = hashMap;
        HashMap hashMap2 = new HashMap();
        f6164b = hashMap2;
        C0042x c0042x2 = C0042x.f480d;
        hashMap.put(1L, c0042x2);
        hashMap2.put(c0042x2, Collections.singletonList(1L));
        hashMap.put(2L, C0042x.f481e);
        hashMap2.put((C0042x) hashMap.get(2L), Collections.singletonList(2L));
        C0042x c0042x3 = C0042x.f482f;
        hashMap.put(4L, c0042x3);
        hashMap2.put(c0042x3, Collections.singletonList(4L));
        C0042x c0042x4 = C0042x.g;
        hashMap.put(8L, c0042x4);
        hashMap2.put(c0042x4, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c0042x = C0042x.f483h;
            if (!hasNext) {
                break;
            }
            f6163a.put((Long) it.next(), c0042x);
        }
        f6164b.put(c0042x, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (true) {
            boolean hasNext2 = it2.hasNext();
            C0042x c0042x5 = C0042x.f484i;
            if (hasNext2) {
                f6163a.put((Long) it2.next(), c0042x5);
            } else {
                f6164b.put(c0042x5, asList2);
                return;
            }
        }
    }

    public static Long a(C0042x c0042x, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) f6164b.get(c0042x);
        if (list != null) {
            supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
            for (Long l3 : list) {
                if (supportedProfiles.contains(l3)) {
                    return l3;
                }
            }
            return null;
        }
        return null;
    }

    public static C0042x b(long j3) {
        return (C0042x) f6163a.get(Long.valueOf(j3));
    }
}
