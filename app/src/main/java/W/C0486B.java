package w;

import androidx.camera.core.impl.EnumC0083k;
import androidx.camera.core.impl.EnumC0084l;
import androidx.camera.core.impl.EnumC0085m;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;

/* renamed from: w.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486B {
    static {
        Collections.unmodifiableSet(EnumSet.of(EnumC0084l.PASSIVE_FOCUSED, EnumC0084l.PASSIVE_NOT_FOCUSED, EnumC0084l.LOCKED_FOCUSED, EnumC0084l.LOCKED_NOT_FOCUSED));
        Collections.unmodifiableSet(EnumSet.of(EnumC0085m.CONVERGED, EnumC0085m.UNKNOWN));
        EnumC0083k enumC0083k = EnumC0083k.CONVERGED;
        EnumC0083k enumC0083k2 = EnumC0083k.FLASH_REQUIRED;
        EnumC0083k enumC0083k3 = EnumC0083k.UNKNOWN;
        EnumSet copyOf = EnumSet.copyOf((Collection) Collections.unmodifiableSet(EnumSet.of(enumC0083k, enumC0083k2, enumC0083k3)));
        copyOf.remove(enumC0083k2);
        copyOf.remove(enumC0083k3);
        Collections.unmodifiableSet(copyOf);
    }
}
