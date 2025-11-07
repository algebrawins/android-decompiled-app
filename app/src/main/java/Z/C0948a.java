package z;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import androidx.camera.core.impl.U;
import x.C0559n;

/* renamed from: z.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0948a implements U {

    /* renamed from: a  reason: collision with root package name */
    public final Range f6562a;

    public C0948a(C0559n c0559n) {
        Range[] rangeArr = (Range[]) c0559n.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
        Range range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range range2 : rangeArr) {
                Range range3 = new Range(Integer.valueOf(((Integer) range2.getLower()).intValue() >= 1000 ? ((Integer) range2.getLower()).intValue() / 1000 : ((Integer) range2.getLower()).intValue()), Integer.valueOf(((Integer) range2.getUpper()).intValue() >= 1000 ? ((Integer) range2.getUpper()).intValue() / 1000 : ((Integer) range2.getUpper()).intValue()));
                if (((Integer) range3.getUpper()).intValue() == 30 && (range == null || ((Integer) range3.getLower()).intValue() < ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
            }
        }
        this.f6562a = range;
    }
}
