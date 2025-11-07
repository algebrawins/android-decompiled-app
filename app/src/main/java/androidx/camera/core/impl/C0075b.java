package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f2170a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2171b;

    public C0075b(Executor executor, Handler handler) {
        if (executor != null) {
            this.f2170a = executor;
            if (handler != null) {
                this.f2171b = handler;
                return;
            }
            throw new NullPointerException("Null schedulerHandler");
        }
        throw new NullPointerException("Null cameraExecutor");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0075b)) {
            return false;
        }
        C0075b c0075b = (C0075b) obj;
        if (this.f2170a.equals(c0075b.f2170a) && this.f2171b.equals(c0075b.f2171b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f2170a.hashCode() ^ 1000003) * 1000003) ^ this.f2171b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f2170a + ", schedulerHandler=" + this.f2171b + "}";
    }
}
