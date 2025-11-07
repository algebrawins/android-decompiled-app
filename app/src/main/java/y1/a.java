package Y1;

import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import k1.w;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final U1.g f1660c = new U1.g("StreamingFormatChecker", "");

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f1661a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public long f1662b = -1;

    public final void a(X1.a aVar) {
        if (aVar.f1587f != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LinkedList linkedList = this.f1661a;
        linkedList.add(Long.valueOf(elapsedRealtime));
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l3 = (Long) linkedList.peekFirst();
            w.e(l3);
            if (elapsedRealtime - l3.longValue() < 5000) {
                long j3 = this.f1662b;
                if (j3 == -1 || elapsedRealtime - j3 >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.f1662b = elapsedRealtime;
                    U1.g gVar = f1660c;
                    if (Log.isLoggable(gVar.f1338a, 5)) {
                        Log.w("StreamingFormatChecker", gVar.b("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                    }
                }
            }
        }
    }
}
