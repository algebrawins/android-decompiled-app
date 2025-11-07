package androidx.camera.core.impl;

/* renamed from: androidx.camera.core.impl.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0090s {
    PENDING_OPEN(false),
    OPENING(true),
    OPEN(true),
    CONFIGURED(true),
    CLOSING(true),
    CLOSED(false),
    RELEASING(true),
    RELEASED(false);
    
    private final boolean mHoldsCameraSlot;

    EnumC0090s(boolean z3) {
        this.mHoldsCameraSlot = z3;
    }

    public final boolean a() {
        return this.mHoldsCameraSlot;
    }
}
