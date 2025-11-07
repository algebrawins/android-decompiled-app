package f0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* loaded from: classes.dex */
public abstract class t {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static ContentCaptureSession b(View view) {
        return view.getContentCaptureSession();
    }

    public static List<Rect> c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void d(View view, Context context, int[] r22, AttributeSet attributeSet, TypedArray typedArray, int r5, int r6) {
        view.saveAttributeDataForStyleable(context, r22, attributeSet, typedArray, r5, r6);
    }

    public static void e(View view, i0.a aVar) {
        view.setContentCaptureSession(null);
    }

    public static void f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
