package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum E0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0111h.f2350L),
    ENUM(null),
    MESSAGE(null);
    
    private final Object defaultDefault;

    E0(Serializable serializable) {
        this.defaultDefault = serializable;
    }
}
