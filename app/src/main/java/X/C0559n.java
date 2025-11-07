package x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import d2.C0235c;
import java.util.HashMap;
import k0.C0322i;

/* renamed from: x.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0559n {

    /* renamed from: b  reason: collision with root package name */
    public final C0235c f5463b;

    /* renamed from: c  reason: collision with root package name */
    public final String f5464c;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5462a = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public w2.q f5465d = null;

    public C0559n(CameraCharacteristics cameraCharacteristics, String str) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f5463b = new C0235c(29, cameraCharacteristics);
        } else {
            this.f5463b = new C0235c(29, cameraCharacteristics);
        }
        this.f5464c = str;
    }

    public final Object a(CameraCharacteristics.Key key) {
        if (key.equals(CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((CameraCharacteristics) this.f5463b.f3003K).get(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f5462a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object obj2 = ((CameraCharacteristics) this.f5463b.f3003K).get(key);
                if (obj2 != null) {
                    this.f5462a.put(key, obj2);
                }
                return obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [w2.q, java.lang.Object] */
    public final w2.q b() {
        if (this.f5465d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap != null) {
                    A.f fVar = new A.f(this.f5464c, 0);
                    ?? obj = new Object();
                    obj.f5403L = new HashMap();
                    new HashMap();
                    new HashMap();
                    if (Build.VERSION.SDK_INT >= 23) {
                        obj.f5401J = new C0322i(25, streamConfigurationMap);
                    } else {
                        obj.f5401J = new C0322i(25, streamConfigurationMap);
                    }
                    obj.f5402K = fVar;
                    this.f5465d = obj;
                } else {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
            } catch (AssertionError e4) {
                throw new IllegalArgumentException(e4.getMessage());
            }
        }
        return this.f5465d;
    }
}
