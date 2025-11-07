package y;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;

/* renamed from: y.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0776e implements InterfaceC0778g {

    /* renamed from: a  reason: collision with root package name */
    public final InputConfiguration f6168a;

    public C0776e(Object obj) {
        this.f6168a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC0778g)) {
            return false;
        }
        return Objects.equals(this.f6168a, ((C0776e) ((InterfaceC0778g) obj)).f6168a);
    }

    public final int hashCode() {
        return this.f6168a.hashCode();
    }

    public final String toString() {
        return this.f6168a.toString();
    }
}
