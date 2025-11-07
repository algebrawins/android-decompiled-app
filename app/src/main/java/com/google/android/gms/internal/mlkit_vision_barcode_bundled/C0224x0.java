package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.x0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224x0 {
    public static final void a(Object obj, Object obj2) {
        C0222w0 c0222w0 = (C0222w0) obj;
        if (obj2 == null) {
            if (!c0222w0.isEmpty()) {
                Iterator it = c0222w0.entrySet().iterator();
                if (!it.hasNext()) {
                    return;
                }
                Map.Entry entry = (Map.Entry) it.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
            return;
        }
        throw new ClassCastException();
    }

    public static final C0222w0 b(Object obj, Object obj2) {
        C0222w0 c0222w0 = (C0222w0) obj;
        C0222w0 c0222w02 = (C0222w0) obj2;
        if (!c0222w02.isEmpty()) {
            if (!c0222w0.f2988J) {
                c0222w0 = c0222w0.b();
            }
            c0222w0.f();
            if (!c0222w02.isEmpty()) {
                c0222w0.putAll(c0222w02);
            }
        }
        return c0222w0;
    }
}
