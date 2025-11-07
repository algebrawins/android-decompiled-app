package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import w.C0490F;

/* loaded from: classes.dex */
public final class s implements u {

    /* renamed from: a  reason: collision with root package name */
    public final SessionConfiguration f6187a;

    /* renamed from: b  reason: collision with root package name */
    public final List f6188b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [y.r] */
    /* JADX WARN: Type inference failed for: r1v4, types: [y.r] */
    /* JADX WARN: Type inference failed for: r1v5, types: [y.r] */
    /* JADX WARN: Type inference failed for: r1v7, types: [y.r] */
    public s(ArrayList arrayList, G.l lVar, C0490F c0490f) {
        k kVar;
        SessionConfiguration sessionConfiguration = new SessionConfiguration(0, v.a(arrayList), lVar, c0490f);
        this.f6187a = sessionConfiguration;
        List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
        ArrayList arrayList2 = new ArrayList(outputConfigurations.size());
        for (OutputConfiguration outputConfiguration : outputConfigurations) {
            C0780i c0780i = null;
            if (outputConfiguration != null) {
                int r12 = Build.VERSION.SDK_INT;
                if (r12 >= 33) {
                    kVar = new r(outputConfiguration);
                } else if (r12 >= 28) {
                    kVar = new r(new n(outputConfiguration));
                } else if (r12 >= 26) {
                    kVar = new r(new l(outputConfiguration));
                } else if (r12 >= 24) {
                    kVar = new r(new C0781j(outputConfiguration));
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    c0780i = new C0780i(kVar);
                }
            }
            arrayList2.add(c0780i);
        }
        this.f6188b = Collections.unmodifiableList(arrayList2);
    }

    @Override // y.u
    public final Object a() {
        return this.f6187a;
    }

    @Override // y.u
    public final C0779h b() {
        return C0779h.a(this.f6187a.getInputConfiguration());
    }

    @Override // y.u
    public final int c() {
        return this.f6187a.getSessionType();
    }

    @Override // y.u
    public final Executor d() {
        return this.f6187a.getExecutor();
    }

    @Override // y.u
    public final void e(CaptureRequest captureRequest) {
        this.f6187a.setSessionParameters(captureRequest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return Objects.equals(this.f6187a, ((s) obj).f6187a);
    }

    @Override // y.u
    public final CameraCaptureSession.StateCallback f() {
        return this.f6187a.getStateCallback();
    }

    @Override // y.u
    public final List g() {
        return this.f6188b;
    }

    @Override // y.u
    public final void h(C0779h c0779h) {
        this.f6187a.setInputConfiguration(c0779h.f6169a.f6168a);
    }

    public final int hashCode() {
        return this.f6187a.hashCode();
    }
}
