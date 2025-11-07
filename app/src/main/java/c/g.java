package C;

import D.C0040v;
import D.InterfaceC0043y;
import I.l;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.C0076c;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.N;
import androidx.camera.core.impl.O;
import androidx.camera.core.impl.S;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.k0;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.UUID;
import q0.k;
import v.C0479a;

/* loaded from: classes.dex */
public final class g implements InterfaceC0043y, j0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f231a;

    /* renamed from: b  reason: collision with root package name */
    public final O f232b;

    /* JADX WARN: 'thıs' call moved to the top of the method (can break code semantics) */
    public g(int r4) {
        this(O.b(), 2);
        Object obj;
        this.f231a = r4;
        switch (r4) {
            case 1:
                O b3 = O.b();
                this.f232b = b3;
                Object obj2 = null;
                try {
                    obj = b3.e(l.f781c);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                if (cls != null && !cls.equals(C0040v.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                C0076c c0076c = l.f781c;
                O o3 = this.f232b;
                o3.g(c0076c, C0040v.class);
                try {
                    obj2 = o3.e(l.f780b);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    o3.g(l.f780b, C0040v.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                return;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
            default:
                this.f232b = O.b();
                return;
            case 4:
                this.f232b = O.b();
                return;
        }
    }

    public static g c(A a4) {
        g gVar = new g(0);
        a4.X(new f(0, gVar, a4));
        return gVar;
    }

    @Override // D.InterfaceC0043y
    public N a() {
        switch (this.f231a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                throw null;
            case 1:
            default:
                throw null;
            case 2:
                return this.f232b;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return this.f232b;
        }
    }

    @Override // androidx.camera.core.impl.j0
    public k0 b() {
        switch (this.f231a) {
            case 2:
                return new G(S.a(this.f232b));
            default:
                return new P.b(S.a(this.f232b));
        }
    }

    public void d(CaptureRequest.Key key, Object obj) {
        this.f232b.g(C0479a.r0(key), obj);
    }

    public g(O o3, int r4) {
        Object obj;
        Object obj2;
        this.f231a = r4;
        switch (r4) {
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                this.f232b = o3;
                Object obj3 = null;
                try {
                    obj = o3.e(l.f781c);
                } catch (IllegalArgumentException unused) {
                    obj = null;
                }
                Class cls = (Class) obj;
                if (cls != null && !cls.equals(P.a.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                C0076c c0076c = l.f781c;
                O o4 = this.f232b;
                o4.g(c0076c, P.a.class);
                try {
                    obj3 = o4.e(l.f780b);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj3 == null) {
                    o4.g(l.f780b, P.a.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.f232b = o3;
                Object obj4 = null;
                try {
                    obj2 = o3.e(l.f781c);
                } catch (IllegalArgumentException unused3) {
                    obj2 = null;
                }
                Class cls2 = (Class) obj2;
                if (cls2 != null && !cls2.equals(D.S.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                C0076c c0076c2 = l.f781c;
                O o5 = this.f232b;
                o5.g(c0076c2, D.S.class);
                try {
                    obj4 = o5.e(l.f780b);
                } catch (IllegalArgumentException unused4) {
                }
                if (obj4 == null) {
                    this.f232b.g(l.f780b, D.S.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }
}
