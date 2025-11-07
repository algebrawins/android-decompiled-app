package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0124w {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);
    
    private final boolean isList;

    EnumC0124w(boolean z3) {
        this.isList = z3;
    }
}
