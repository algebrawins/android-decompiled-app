package x;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: x.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551f extends Exception {

    /* renamed from: K  reason: collision with root package name */
    public static final Set f5442K = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* renamed from: J  reason: collision with root package name */
    public final int f5443J;

    static {
        Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    }

    public C0551f(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.f5443J = 10001;
        if (f5442K.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public C0551f(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f5443J = cameraAccessException.getReason();
    }

    public C0551f(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.f5443J = 10002;
        if (f5442K.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
