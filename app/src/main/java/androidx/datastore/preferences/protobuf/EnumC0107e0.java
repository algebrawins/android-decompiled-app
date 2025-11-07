package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.datastore.preferences.protobuf.e0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0107e0 {
    private static final /* synthetic */ EnumC0107e0[] $VALUES;
    public static final EnumC0107e0 EDITIONS;
    public static final EnumC0107e0 PROTO2;
    public static final EnumC0107e0 PROTO3;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.e0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.e0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.e0] */
    static {
        ?? r3 = new Enum("PROTO2", 0);
        PROTO2 = r3;
        ?? r4 = new Enum("PROTO3", 1);
        PROTO3 = r4;
        ?? r5 = new Enum("EDITIONS", 2);
        EDITIONS = r5;
        $VALUES = new EnumC0107e0[]{r3, r4, r5};
    }

    public static EnumC0107e0 valueOf(String str) {
        return (EnumC0107e0) Enum.valueOf(EnumC0107e0.class, str);
    }

    public static EnumC0107e0[] values() {
        return (EnumC0107e0[]) $VALUES.clone();
    }
}
