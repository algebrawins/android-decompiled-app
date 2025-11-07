package y1;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class K4 implements Closeable {

    /* renamed from: O  reason: collision with root package name */
    public static final HashMap f6254O = new HashMap();

    /* renamed from: J  reason: collision with root package name */
    public int f6255J;

    /* renamed from: K  reason: collision with root package name */
    public long f6256K;

    /* renamed from: L  reason: collision with root package name */
    public long f6257L;

    /* renamed from: M  reason: collision with root package name */
    public long f6258M = 2147483647L;

    /* renamed from: N  reason: collision with root package name */
    public long f6259N = -2147483648L;

    public K4(String str) {
    }

    public void a() {
        this.f6256K = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j3) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j4 = this.f6257L;
        if (j4 != 0 && elapsedRealtimeNanos - j4 >= 1000000) {
            this.f6255J = 0;
            this.f6256K = 0L;
            this.f6258M = 2147483647L;
            this.f6259N = -2147483648L;
        }
        this.f6257L = elapsedRealtimeNanos;
        this.f6255J++;
        this.f6258M = Math.min(this.f6258M, j3);
        this.f6259N = Math.max(this.f6259N, j3);
        if (this.f6255J % 50 == 0) {
            Locale locale = Locale.US;
            S4.b();
        }
        if (this.f6255J % 500 == 0) {
            this.f6255J = 0;
            this.f6256K = 0L;
            this.f6258M = 2147483647L;
            this.f6259N = -2147483648L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j3 = this.f6256K;
        if (j3 != 0) {
            f(j3);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }

    public void f(long j3) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j3);
    }
}
