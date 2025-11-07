package x1;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x.C0559n;
import z.C0947H;
import z.C0948a;
import z.C0949b;
import z.C0950c;
import z.C0952e;
import z.C0954g;
import z.C0955h;

/* renamed from: x1.r5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0696r5 {
    public static A0.Q a(C0559n c0559n) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Integer num = (Integer) c0559n.a(key);
        if (num != null && num.intValue() == 2) {
            arrayList.add(new C0948a(c0559n));
        }
        Integer num2 = (Integer) c0559n.a(key);
        if (num2 != null && num2.intValue() == 2 && Build.VERSION.SDK_INT == 21) {
            arrayList.add(new C0950c());
        }
        HashSet hashSet = z.x.f6582a;
        String str = Build.DEVICE;
        Locale locale = Locale.US;
        if (hashSet.contains(str.toLowerCase(locale))) {
            arrayList.add(new z.x());
        }
        Integer num3 = (Integer) c0559n.a(key);
        if (num3 != null && num3.intValue() == 2) {
            Object obj = new Object();
            c0559n.b();
            arrayList.add(obj);
        }
        List list = z.u.f6579a;
        String str2 = Build.MODEL;
        if (z.u.f6579a.contains(str2.toUpperCase(locale)) && ((Integer) c0559n.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new z.u());
        }
        List list2 = C0952e.f6563a;
        if (C0952e.f6563a.contains(str2.toUpperCase(locale)) && ((Integer) c0559n.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new C0952e());
        }
        String str3 = Build.BRAND;
        if (("motorola".equalsIgnoreCase(str3) && "MotoG3".equalsIgnoreCase(str2)) || (("samsung".equalsIgnoreCase(str3) && "SM-G532F".equalsIgnoreCase(str2)) || ("samsung".equalsIgnoreCase(str3) && "SM-J700F".equalsIgnoreCase(str2)))) {
            arrayList.add(new C0947H());
        }
        Iterator it = z.q.f6574a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (Build.MODEL.toUpperCase(Locale.US).startsWith((String) it.next())) {
                if (((Integer) c0559n.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                    arrayList.add(new z.q());
                }
            }
        }
        if (Build.BRAND.equalsIgnoreCase("SAMSUNG") && Build.VERSION.SDK_INT < 33 && ((Integer) c0559n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new C0949b());
        }
        CameraCharacteristics.Key key2 = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        Integer num4 = (Integer) c0559n.a(key2);
        if (num4 != null && num4.intValue() == 2) {
            arrayList.add(new C0955h());
        }
        Integer num5 = (Integer) c0559n.a(key2);
        if (num5 != null && num5.intValue() == 2) {
            arrayList.add(new z.z());
        }
        Integer num6 = (Integer) c0559n.a(key2);
        if (num6 != null && num6.intValue() == 2) {
            arrayList.add(new C0954g());
        }
        List list3 = z.s.f6576a;
        String str4 = Build.MODEL;
        Locale locale2 = Locale.US;
        if (z.s.f6577b.contains(str4.toLowerCase(locale2)) && ((Integer) c0559n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean contains = z.s.f6576a.contains(str4.toLowerCase(locale2));
        if (z3 || contains) {
            arrayList.add(new z.s());
        }
        List list4 = z.v.f6580a;
        if (z.v.f6580a.contains(str4.toLowerCase(locale2)) && ((Integer) c0559n.a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
            arrayList.add(new z.v());
        }
        List list5 = z.r.f6575a;
        if (z.r.f6575a.contains(str4.toLowerCase(locale2)) && ((Integer) c0559n.a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            arrayList.add(new z.r());
        }
        return new A0.Q(arrayList);
    }
}
