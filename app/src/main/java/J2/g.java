package j2;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class g implements r2.e {

    /* renamed from: a  reason: collision with root package name */
    public final FlutterJNI f3876a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3877b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicBoolean f3878c = new AtomicBoolean(false);

    public g(FlutterJNI flutterJNI, int r4) {
        this.f3876a = flutterJNI;
        this.f3877b = r4;
    }

    @Override // r2.e
    public final void a(ByteBuffer byteBuffer) {
        if (!this.f3878c.getAndSet(true)) {
            int r02 = this.f3877b;
            FlutterJNI flutterJNI = this.f3876a;
            if (byteBuffer == null) {
                flutterJNI.invokePlatformMessageEmptyResponseCallback(r02);
                return;
            } else {
                flutterJNI.invokePlatformMessageResponseCallback(r02, byteBuffer, byteBuffer.position());
                return;
            }
        }
        throw new IllegalStateException("Reply already submitted");
    }
}
