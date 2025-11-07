package D;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: D.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC0034o implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f433a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f434b;

    public ThreadFactoryC0034o(int r22) {
        this.f433a = r22;
        switch (r22) {
            case 1:
                this.f434b = new AtomicInteger(0);
                return;
            case 2:
                this.f434b = new AtomicInteger(0);
                return;
            default:
                this.f434b = new AtomicInteger(0);
                return;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f433a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Thread thread = new Thread(runnable);
                Locale locale = Locale.US;
                int andIncrement = this.f434b.getAndIncrement();
                thread.setName("CameraX-core_camera_" + andIncrement);
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                Locale locale2 = Locale.US;
                int andIncrement2 = this.f434b.getAndIncrement();
                thread2.setName("CameraX-camerax_io_" + andIncrement2);
                return thread2;
            default:
                Thread thread3 = new Thread(runnable);
                thread3.setName("arch_disk_io_" + this.f434b.getAndIncrement());
                return thread3;
        }
    }
}
