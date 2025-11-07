package Q2;

import N2.g;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends P2.a {
    @Override // P2.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        g.d(current, "current(...)");
        return current;
    }
}
