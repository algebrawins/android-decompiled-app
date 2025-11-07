package I;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.r;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import x1.X;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final r f770a;

    /* renamed from: b  reason: collision with root package name */
    public final int f771b;

    /* renamed from: c  reason: collision with root package name */
    public final int f772c;

    /* renamed from: d  reason: collision with root package name */
    public final Rational f773d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f774e;

    /* renamed from: f  reason: collision with root package name */
    public final k f775f;

    public j(r rVar, Size size) {
        Rational rational;
        this.f770a = rVar;
        this.f771b = rVar.a();
        this.f772c = rVar.b();
        boolean z3 = false;
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List d4 = rVar.d(RecognitionOptions.QR_CODE);
            if (d4.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(d4, new F.c(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.f773d = rational;
        this.f774e = (rational == null || rational.getNumerator() >= rational.getDenominator()) ? true : true;
        this.f775f = new k(rVar, rational);
    }

    public static ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(F.b.f597a);
        arrayList2.add(F.b.f599c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (F.b.a(size, (Rational) it2.next())) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational c(int r12, boolean z3) {
        if (r12 != -1) {
            if (r12 != 0) {
                if (r12 != 1) {
                    X.b("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + r12);
                } else if (z3) {
                    return F.b.f599c;
                } else {
                    return F.b.f600d;
                }
            } else if (z3) {
                return F.b.f597a;
            } else {
                return F.b.f598b;
            }
        }
        return null;
    }

    public static HashMap d(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        Iterator it = b(arrayList).iterator();
        while (it.hasNext()) {
            hashMap.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : hashMap.keySet()) {
                if (F.b.a(size, rational)) {
                    ((List) hashMap.get(rational)).add(size);
                }
            }
        }
        return hashMap;
    }

    public static void e(List list, Size size, boolean z3) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z3) {
            list.addAll(arrayList);
        }
    }

    public static void f(List list, Size size, boolean z3) {
        ArrayList arrayList = new ArrayList();
        for (int r22 = 0; r22 < list.size(); r22++) {
            Size size2 = (Size) list.get(r22);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z3) {
            list.addAll(arrayList);
        }
    }

    public final ArrayList a(k0 k0Var) {
        Size[] sizeArr;
        int b02 = k0Var.b0();
        List<Pair> R3 = ((J) k0Var).R();
        List list = null;
        if (R3 != null) {
            for (Pair pair : R3) {
                if (((Integer) pair.first).intValue() == b02) {
                    sizeArr = (Size[]) pair.second;
                    break;
                }
            }
        }
        sizeArr = null;
        if (sizeArr != null) {
            list = Arrays.asList(sizeArr);
        }
        if (list == null) {
            list = this.f770a.d(b02);
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new F.c(true));
        if (arrayList.isEmpty()) {
            X.g("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + b02 + ".");
        }
        return arrayList;
    }
}
