package e2;

import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ G2.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b ALL_FORMATS;
    public static final b AZTEC;
    public static final b CODABAR;
    public static final b CODE_128;
    public static final b CODE_39;
    public static final b CODE_93;
    public static final C0249a Companion;
    public static final b DATA_MATRIX;
    public static final b EAN_13;
    public static final b EAN_8;
    public static final b ITF;
    public static final b PDF417;
    public static final b QR_CODE;
    public static final b UNKNOWN;
    public static final b UPC_A;
    public static final b UPC_E;
    private final int intValue;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, e2.a] */
    static {
        b bVar = new b(0, -1, "UNKNOWN");
        UNKNOWN = bVar;
        b bVar2 = new b(1, 0, "ALL_FORMATS");
        ALL_FORMATS = bVar2;
        b bVar3 = new b(2, 1, "CODE_128");
        CODE_128 = bVar3;
        b bVar4 = new b(3, 2, "CODE_39");
        CODE_39 = bVar4;
        b bVar5 = new b(4, 4, "CODE_93");
        CODE_93 = bVar5;
        b bVar6 = new b(5, 8, "CODABAR");
        CODABAR = bVar6;
        b bVar7 = new b(6, 16, "DATA_MATRIX");
        DATA_MATRIX = bVar7;
        b bVar8 = new b(7, 32, "EAN_13");
        EAN_13 = bVar8;
        b bVar9 = new b(8, 64, "EAN_8");
        EAN_8 = bVar9;
        b bVar10 = new b(9, RecognitionOptions.ITF, "ITF");
        ITF = bVar10;
        b bVar11 = new b(10, RecognitionOptions.QR_CODE, "QR_CODE");
        QR_CODE = bVar11;
        b bVar12 = new b(11, RecognitionOptions.UPC_A, "UPC_A");
        UPC_A = bVar12;
        b bVar13 = new b(12, RecognitionOptions.UPC_E, "UPC_E");
        UPC_E = bVar13;
        b bVar14 = new b(13, RecognitionOptions.PDF417, "PDF417");
        PDF417 = bVar14;
        b bVar15 = new b(14, RecognitionOptions.AZTEC, "AZTEC");
        AZTEC = bVar15;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14, bVar15};
        $VALUES = bVarArr;
        $ENTRIES = new G2.b(bVarArr);
        Companion = new Object();
    }

    public b(int r12, int r22, String str) {
        this.intValue = r22;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.intValue;
    }
}
