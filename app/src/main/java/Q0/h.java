package q0;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0100b;
import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.F;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.InterfaceC0105d0;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.h0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class h extends D {
    private static final h DEFAULT_INSTANCE;
    private static volatile InterfaceC0105d0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private F strings_ = g0.f2347M;

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        D.l(h.class, hVar);
    }

    public static void n(h hVar, Set set) {
        int r12;
        F f2 = hVar.strings_;
        if (!((AbstractC0100b) f2).f2333J) {
            int size = f2.size();
            if (size == 0) {
                r12 = 10;
            } else {
                r12 = size * 2;
            }
            hVar.strings_ = ((g0) f2).i(r12);
        }
        F f4 = hVar.strings_;
        Charset charset = G.f2298a;
        set.getClass();
        if (f4 instanceof ArrayList) {
            ((ArrayList) f4).ensureCapacity(set.size() + f4.size());
        }
        int size2 = f4.size();
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (f4.size() - size2) + " is null.";
                for (int size3 = f4.size() - 1; size3 >= size2; size3--) {
                    f4.remove(size3);
                }
                throw new NullPointerException(str);
            }
            f4.add(obj);
        }
    }

    public static h o() {
        return DEFAULT_INSTANCE;
    }

    public static g q() {
        return (g) ((A) DEFAULT_INSTANCE.e(C.NEW_BUILDER));
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.datastore.preferences.protobuf.d0, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.D
    public final Object e(C c4) {
        switch (AbstractC0432c.f4798a[c4.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new A(DEFAULT_INSTANCE);
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                return new h0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case k.STRING_FIELD_NUMBER /* 5 */:
                InterfaceC0105d0 interfaceC0105d0 = PARSER;
                InterfaceC0105d0 interfaceC0105d02 = interfaceC0105d0;
                if (interfaceC0105d0 == null) {
                    synchronized (h.class) {
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

    public final F p() {
        return this.strings_;
    }
}
