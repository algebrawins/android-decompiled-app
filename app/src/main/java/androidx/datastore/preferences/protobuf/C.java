package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class C {
    private static final /* synthetic */ C[] $VALUES;
    public static final C BUILD_MESSAGE_INFO;
    public static final C GET_DEFAULT_INSTANCE;
    public static final C GET_MEMOIZED_IS_INITIALIZED;
    public static final C GET_PARSER;
    public static final C NEW_BUILDER;
    public static final C NEW_MUTABLE_INSTANCE;
    public static final C SET_MEMOIZED_IS_INITIALIZED;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.C] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.C] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.C] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.C] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.C] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.C] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, androidx.datastore.preferences.protobuf.C] */
    static {
        ?? r7 = new Enum("GET_MEMOIZED_IS_INITIALIZED", 0);
        GET_MEMOIZED_IS_INITIALIZED = r7;
        ?? r8 = new Enum("SET_MEMOIZED_IS_INITIALIZED", 1);
        SET_MEMOIZED_IS_INITIALIZED = r8;
        ?? r9 = new Enum("BUILD_MESSAGE_INFO", 2);
        BUILD_MESSAGE_INFO = r9;
        ?? r10 = new Enum("NEW_MUTABLE_INSTANCE", 3);
        NEW_MUTABLE_INSTANCE = r10;
        ?? r11 = new Enum("NEW_BUILDER", 4);
        NEW_BUILDER = r11;
        ?? r12 = new Enum("GET_DEFAULT_INSTANCE", 5);
        GET_DEFAULT_INSTANCE = r12;
        ?? r13 = new Enum("GET_PARSER", 6);
        GET_PARSER = r13;
        $VALUES = new C[]{r7, r8, r9, r10, r11, r12, r13};
    }

    public static C valueOf(String str) {
        return (C) Enum.valueOf(C.class, str);
    }

    public static C[] values() {
        return (C[]) $VALUES.clone();
    }
}
