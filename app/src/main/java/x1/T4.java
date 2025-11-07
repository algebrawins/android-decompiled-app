package x1;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.C0079f;
import androidx.camera.core.impl.C0096y;
import androidx.camera.core.impl.InterfaceC0086n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import v.C0479a;
import w.AbstractC0487C;

/* loaded from: classes.dex */
public abstract class T4 {
    public static void a(CaptureRequest.Builder builder, androidx.camera.core.impl.S s3) {
        androidx.camera.core.impl.S a4 = androidx.camera.core.impl.S.a(C.g.c(s3).f232b);
        for (C0076c c0076c : a4.o()) {
            CaptureRequest.Key key = c0076c.f2178c;
            try {
                builder.set(key, a4.e(c0076c));
            } catch (IllegalArgumentException unused) {
                X.b("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static CaptureRequest b(C0096y c0096y, CameraDevice cameraDevice, HashMap hashMap) {
        CaptureRequest.Builder createCaptureRequest;
        InterfaceC0086n interfaceC0086n;
        if (cameraDevice == null) {
            return null;
        }
        List<androidx.camera.core.impl.D> unmodifiableList = Collections.unmodifiableList(c0096y.f2246a);
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.D d4 : unmodifiableList) {
            Surface surface = (Surface) hashMap.get(d4);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int r6 = Build.VERSION.SDK_INT;
        int r3 = c0096y.f2248c;
        if (r6 >= 23 && r3 == 5 && (interfaceC0086n = c0096y.f2252h) != null && (interfaceC0086n.f() instanceof TotalCaptureResult)) {
            X.a("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
            createCaptureRequest = AbstractC0487C.a(cameraDevice, (TotalCaptureResult) interfaceC0086n.f());
        } else {
            X.a("Camera2CaptureRequestBuilder", "createCaptureRequest");
            createCaptureRequest = cameraDevice.createCaptureRequest(r3);
        }
        androidx.camera.core.impl.S s3 = c0096y.f2247b;
        a(createCaptureRequest, s3);
        androidx.camera.core.impl.S a4 = androidx.camera.core.impl.S.a(C.g.c(s3).f232b);
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
        if (!a4.q(C0479a.r0(key))) {
            Range range = C0079f.f2191e;
            Range range2 = c0096y.f2249d;
            if (!range2.equals(range)) {
                createCaptureRequest.set(key, range2);
            }
        }
        C0076c c0076c = C0096y.f2244i;
        TreeMap treeMap = s3.f2153J;
        if (treeMap.containsKey(c0076c)) {
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) s3.e(c0076c));
        }
        C0076c c0076c2 = C0096y.f2245j;
        if (treeMap.containsKey(c0076c2)) {
            createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) s3.e(c0076c2)).byteValue()));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            createCaptureRequest.addTarget((Surface) it.next());
        }
        createCaptureRequest.setTag(c0096y.g);
        return createCaptureRequest.build();
    }
}
