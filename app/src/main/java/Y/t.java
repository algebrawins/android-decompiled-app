package y;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import w.C0490F;

/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: a  reason: collision with root package name */
    public final List f6189a;

    /* renamed from: b  reason: collision with root package name */
    public final C0490F f6190b;

    /* renamed from: c  reason: collision with root package name */
    public final G.l f6191c;

    /* renamed from: d  reason: collision with root package name */
    public C0779h f6192d = null;

    public t(ArrayList arrayList, G.l lVar, C0490F c0490f) {
        this.f6189a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f6190b = c0490f;
        this.f6191c = lVar;
    }

    @Override // y.u
    public final Object a() {
        return null;
    }

    @Override // y.u
    public final C0779h b() {
        return this.f6192d;
    }

    @Override // y.u
    public final int c() {
        return 0;
    }

    @Override // y.u
    public final Executor d() {
        return this.f6191c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (Objects.equals(this.f6192d, tVar.f6192d)) {
                List list = this.f6189a;
                int size = list.size();
                List list2 = tVar.f6189a;
                if (size == list2.size()) {
                    for (int r3 = 0; r3 < list.size(); r3++) {
                        if (!((C0780i) list.get(r3)).equals(list2.get(r3))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // y.u
    public final CameraCaptureSession.StateCallback f() {
        return this.f6190b;
    }

    @Override // y.u
    public final List g() {
        return this.f6189a;
    }

    @Override // y.u
    public final void h(C0779h c0779h) {
        this.f6192d = c0779h;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f6189a.hashCode() ^ 31;
        int r12 = (hashCode2 << 5) - hashCode2;
        C0779h c0779h = this.f6192d;
        if (c0779h == null) {
            hashCode = 0;
        } else {
            hashCode = c0779h.f6169a.hashCode();
        }
        int r02 = hashCode ^ r12;
        return (r02 << 5) - r02;
    }

    @Override // y.u
    public final void e(CaptureRequest captureRequest) {
    }
}
