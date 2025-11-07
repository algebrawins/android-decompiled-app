package androidx.datastore.preferences.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* renamed from: androidx.datastore.preferences.protobuf.z  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127z implements X {

    /* renamed from: b  reason: collision with root package name */
    public static final C0127z f2431b = new C0127z(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2432a;

    public /* synthetic */ C0127z(int r12) {
        this.f2432a = r12;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final boolean a(Class cls) {
        switch (this.f2432a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return D.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public final h0 b(Class cls) {
        switch (this.f2432a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (D.class.isAssignableFrom(cls)) {
                    try {
                        return (h0) D.f(cls.asSubclass(D.class)).e(C.BUILD_MESSAGE_INFO);
                    } catch (Exception e4) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
                    }
                }
                throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
