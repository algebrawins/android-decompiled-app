package x1;

import java.io.Serializable;

/* renamed from: x1.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683q extends AbstractC0675p implements Serializable {

    /* renamed from: L  reason: collision with root package name */
    public final transient C0730w f6069L;

    public C0683q() {
        C0730w c0730w = new C0730w();
        if (c0730w.isEmpty()) {
            this.f6069L = c0730w;
            return;
        }
        throw new IllegalArgumentException();
    }
}
