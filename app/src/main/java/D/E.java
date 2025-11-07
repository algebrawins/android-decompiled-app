package D;

import androidx.camera.core.impl.C0076c;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.UUID;

/* loaded from: classes.dex */
public final class E implements androidx.camera.core.impl.j0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f284a;

    /* renamed from: b  reason: collision with root package name */
    public final androidx.camera.core.impl.O f285b;

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public E(int r22) {
        this(androidx.camera.core.impl.O.b(), 0);
        this.f284a = r22;
        switch (r22) {
            case 1:
                this(androidx.camera.core.impl.O.b(), 1);
                return;
            default:
                return;
        }
    }

    @Override // D.InterfaceC0043y
    public final androidx.camera.core.impl.N a() {
        switch (this.f284a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return this.f285b;
            default:
                return this.f285b;
        }
    }

    @Override // androidx.camera.core.impl.j0
    public final androidx.camera.core.impl.k0 b() {
        switch (this.f284a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return new androidx.camera.core.impl.F(androidx.camera.core.impl.S.a(this.f285b));
            default:
                return new androidx.camera.core.impl.T(androidx.camera.core.impl.S.a(this.f285b));
        }
    }

    public E(androidx.camera.core.impl.O o3, int r5) {
        Object obj;
        Object obj2;
        this.f284a = r5;
        switch (r5) {
            case 1:
                this.f285b = o3;
                Object obj3 = null;
                try {
                    obj = o3.e(I.l.f781c);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                if (cls != null && !cls.equals(e0.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                C0076c c0076c = I.l.f781c;
                androidx.camera.core.impl.O o4 = this.f285b;
                o4.g(c0076c, e0.class);
                try {
                    obj3 = o4.e(I.l.f780b);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj3 == null) {
                    this.f285b.g(I.l.f780b, e0.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                o3.g(androidx.camera.core.impl.J.f2141q, 2);
                return;
            default:
                this.f285b = o3;
                Object obj4 = null;
                try {
                    obj2 = o3.e(I.l.f781c);
                } catch (IllegalArgumentException unused3) {
                    obj2 = null;
                }
                Class cls2 = (Class) obj2;
                if (cls2 != null && !cls2.equals(H.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                C0076c c0076c2 = I.l.f781c;
                androidx.camera.core.impl.O o5 = this.f285b;
                o5.g(c0076c2, H.class);
                try {
                    obj4 = o5.e(I.l.f780b);
                } catch (IllegalArgumentException unused4) {
                }
                if (obj4 == null) {
                    o5.g(I.l.f780b, H.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
