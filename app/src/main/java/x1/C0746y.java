package x1;

import java.io.Serializable;

/* renamed from: x1.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0746y extends AbstractC0667o implements Serializable {

    /* renamed from: J  reason: collision with root package name */
    public final Object f6132J;

    /* renamed from: K  reason: collision with root package name */
    public final Object f6133K;

    public C0746y(Object obj, Object obj2) {
        this.f6132J = obj;
        this.f6133K = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f6132J;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f6133K;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
