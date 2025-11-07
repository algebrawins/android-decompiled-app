package U0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public enum w {
    DEFAULT("DEFAULT"),
    UNMETERED_ONLY("UNMETERED_ONLY"),
    UNMETERED_OR_DAILY("UNMETERED_OR_DAILY"),
    FAST_IF_RADIO_AWAKE("FAST_IF_RADIO_AWAKE"),
    NEVER("NEVER"),
    UNRECOGNIZED("UNRECOGNIZED");
    
    private static final SparseArray<w> valueMap;
    private final int value;

    static {
        w wVar = DEFAULT;
        w wVar2 = UNMETERED_ONLY;
        w wVar3 = UNMETERED_OR_DAILY;
        w wVar4 = FAST_IF_RADIO_AWAKE;
        w wVar5 = NEVER;
        w wVar6 = UNRECOGNIZED;
        SparseArray<w> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, wVar);
        sparseArray.put(1, wVar2);
        sparseArray.put(2, wVar3);
        sparseArray.put(3, wVar4);
        sparseArray.put(4, wVar5);
        sparseArray.put(-1, wVar6);
    }

    w(String str) {
        this.value = r2;
    }
}
