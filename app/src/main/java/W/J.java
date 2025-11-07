package w;

import androidx.camera.core.impl.EnumC0090s;

/* loaded from: classes.dex */
public abstract /* synthetic */ class J {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int[] f5054a;

    static {
        int[] r02 = new int[EnumC0090s.values().length];
        f5054a = r02;
        try {
            r02[EnumC0090s.PENDING_OPEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f5054a[EnumC0090s.OPENING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f5054a[EnumC0090s.OPEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f5054a[EnumC0090s.CONFIGURED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f5054a[EnumC0090s.CLOSING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f5054a[EnumC0090s.RELEASING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f5054a[EnumC0090s.CLOSED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f5054a[EnumC0090s.RELEASED.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
