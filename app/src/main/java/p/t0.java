package p;

import D.C0036q;
import D.C0037s;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import androidx.camera.core.impl.C0075b;
import androidx.camera.core.impl.C0093v;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import w.C0511v;
import w.C0514y;
import x.C0551f;
import x1.U4;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    public Object f4718a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4719b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4720c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4721d;

    /* renamed from: e  reason: collision with root package name */
    public Object f4722e;

    /* renamed from: f  reason: collision with root package name */
    public Object f4723f;
    public Object g;

    public /* synthetic */ t0(Object obj, Object obj2, Object obj3, Serializable serializable, Serializable serializable2, Object obj4, Object obj5) {
        this.f4718a = obj;
        this.f4719b = obj2;
        this.f4720c = obj3;
        this.f4721d = serializable;
        this.f4722e = serializable2;
        this.f4723f = obj4;
        this.g = obj5;
    }

    public C0511v a(String str) {
        if (((ArrayList) this.f4722e).contains(str)) {
            C0514y b3 = b(str);
            C0075b c0075b = (C0075b) this.f4719b;
            Executor executor = c0075b.f2170a;
            return new C0511v((x.w) this.f4721d, str, b3, (B.a) this.f4718a, (C0093v) this.f4720c, executor, c0075b.f2171b, (w.S) this.f4723f);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    public C0514y b(String str) {
        HashMap hashMap = (HashMap) this.g;
        try {
            C0514y c0514y = (C0514y) hashMap.get(str);
            if (c0514y == null) {
                C0514y c0514y2 = new C0514y(str, (x.w) this.f4721d);
                hashMap.put(str, c0514y2);
                return c0514y2;
            }
            return c0514y;
        } catch (C0551f e4) {
            throw new Exception(e4);
        }
    }

    public t0(Context context, C0075b c0075b, C0036q c0036q) {
        String str;
        this.g = new HashMap();
        this.f4719b = c0075b;
        x.w a4 = x.w.a(context, c0075b.f2171b);
        this.f4721d = a4;
        this.f4723f = w.S.b(context);
        try {
            ArrayList arrayList = new ArrayList();
            h2.J j3 = a4.f5479a;
            j3.getClass();
            try {
                List<String> asList = Arrays.asList(((CameraManager) j3.f3303K).getCameraIdList());
                if (c0036q == null) {
                    for (String str2 : asList) {
                        arrayList.add(str2);
                    }
                } else {
                    try {
                        str = U4.a(a4, c0036q.c(), asList);
                    } catch (IllegalStateException unused) {
                        str = null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (String str3 : asList) {
                        if (!str3.equals(str)) {
                            arrayList2.add(b(str3));
                        }
                    }
                    for (androidx.camera.core.impl.r rVar : c0036q.a(arrayList2)) {
                        arrayList.add(rVar.e());
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    if (!str4.equals("0") && !str4.equals("1")) {
                        if (!"robolectric".equals(Build.FINGERPRINT)) {
                            try {
                                int[] r02 = (int[]) ((x.w) this.f4721d).b(str4).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                                if (r02 != null) {
                                    for (int r3 : r02) {
                                        if (r3 != 0) {
                                        }
                                    }
                                }
                                x1.X.a("Camera2CameraFactory", "Camera " + str4 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                            } catch (C0551f e4) {
                                throw new Exception(new Exception(e4));
                            }
                        }
                        arrayList3.add(str4);
                        break;
                    } else {
                        arrayList3.add(str4);
                    }
                }
                this.f4722e = arrayList3;
                B.a aVar = new B.a((x.w) this.f4721d);
                this.f4718a = aVar;
                C0093v c0093v = new C0093v(aVar);
                this.f4720c = c0093v;
                ((ArrayList) aVar.f172K).add(c0093v);
            } catch (CameraAccessException e5) {
                throw new C0551f(e5);
            }
        } catch (C0037s e6) {
            throw new Exception(e6);
        } catch (C0551f e7) {
            throw new Exception(new Exception(e7));
        }
    }
}
