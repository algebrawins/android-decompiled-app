package q0;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.C0109f0;
import androidx.datastore.preferences.protobuf.C0112j;
import androidx.datastore.preferences.protobuf.C0115m;
import androidx.datastore.preferences.protobuf.C0119q;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.InterfaceC0105d0;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.h0;
import androidx.datastore.preferences.protobuf.i0;
import androidx.datastore.preferences.protobuf.o0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f extends D {
    private static final f DEFAULT_INSTANCE;
    private static volatile InterfaceC0105d0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private U preferences_ = U.f2311K;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        D.l(f.class, fVar);
    }

    public static U n(f fVar) {
        U u3 = fVar.preferences_;
        if (!u3.f2312J) {
            fVar.preferences_ = u3.b();
        }
        return fVar.preferences_;
    }

    public static C0433d p() {
        return (C0433d) ((A) DEFAULT_INSTANCE.e(C.NEW_BUILDER));
    }

    public static f q(InputStream inputStream) {
        f fVar = DEFAULT_INSTANCE;
        C0112j c0112j = new C0112j(inputStream);
        C0119q a4 = C0119q.a();
        D k3 = fVar.k();
        try {
            C0109f0 c0109f0 = C0109f0.f2342c;
            c0109f0.getClass();
            i0 a5 = c0109f0.a(k3.getClass());
            C0115m c0115m = c0112j.f2375b;
            if (c0115m == null) {
                c0115m = new C0115m(c0112j);
            }
            a5.b(k3, c0115m, a4);
            a5.h(k3);
            if (D.h(k3, true)) {
                return (f) k3;
            }
            throw new IOException(new o0().getMessage());
        } catch (I e4) {
            if (e4.f2300J) {
                throw new IOException(e4.getMessage(), e4);
            }
            throw e4;
        } catch (o0 e5) {
            throw new IOException(e5.getMessage());
        } catch (IOException e6) {
            if (e6.getCause() instanceof I) {
                throw ((I) e6.getCause());
            }
            throw new IOException(e6.getMessage(), e6);
        } catch (RuntimeException e7) {
            if (e7.getCause() instanceof I) {
                throw ((I) e7.getCause());
            }
            throw e7;
        }
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.datastore.preferences.protobuf.d0, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.D
    public final Object e(C c4) {
        switch (AbstractC0432c.f4798a[c4.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new A(DEFAULT_INSTANCE);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new h0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC0434e.f4799a});
            case 4:
                return DEFAULT_INSTANCE;
            case k.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0105d0 interfaceC0105d0 = PARSER;
                InterfaceC0105d0 interfaceC0105d02 = interfaceC0105d0;
                if (interfaceC0105d0 == null) {
                    synchronized (f.class) {
                        try {
                            InterfaceC0105d0 interfaceC0105d03 = PARSER;
                            InterfaceC0105d0 interfaceC0105d04 = interfaceC0105d03;
                            if (interfaceC0105d03 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                interfaceC0105d04 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC0105d02;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case k.DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
