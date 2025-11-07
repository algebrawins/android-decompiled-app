package f0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class J extends I {
    public J(N n3, WindowInsets windowInsets) {
        super(n3, windowInsets);
    }

    @Override // f0.M
    public N a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f3164c.consumeDisplayCutout();
        return N.a(consumeDisplayCutout, null);
    }

    @Override // f0.M
    public C0258d e() {
        DisplayCutout displayCutout;
        displayCutout = this.f3164c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0258d(displayCutout);
    }

    @Override // f0.H, f0.M
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j3 = (J) obj;
        if (Objects.equals(this.f3164c, j3.f3164c) && Objects.equals(this.f3166e, j3.f3166e)) {
            return true;
        }
        return false;
    }

    @Override // f0.M
    public int hashCode() {
        return this.f3164c.hashCode();
    }
}
