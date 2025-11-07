package h2;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.PriorityQueue;

/* renamed from: h2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289a {

    /* renamed from: f  reason: collision with root package name */
    public static final Matrix f3305f = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.n f3306a;

    /* renamed from: b  reason: collision with root package name */
    public final J f3307b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3308c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f3309d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public int f3310e;

    public C0289a(io.flutter.embedding.engine.renderer.n nVar, boolean z3) {
        this.f3306a = nVar;
        if (J.f3300M == null) {
            J.f3300M = new J(0);
        }
        this.f3307b = J.f3300M;
        this.f3308c = z3;
    }

    public static int b(int r3) {
        if (r3 == 0) {
            return 4;
        }
        if (r3 == 1) {
            return 6;
        }
        if (r3 == 5) {
            return 4;
        }
        if (r3 == 6) {
            return 6;
        }
        if (r3 == 2) {
            return 5;
        }
        if (r3 == 7) {
            return 3;
        }
        if (r3 == 3) {
            return 0;
        }
        if (r3 == 8) {
            return 3;
        }
        return -1;
    }

    public final void a(MotionEvent motionEvent, int r26, int r27, int r28, Matrix matrix, ByteBuffer byteBuffer, Context context) {
        int r14;
        int r6;
        long j3;
        int r62;
        long j4;
        int r7;
        float[] fArr;
        double d4;
        double d5;
        MotionEvent motionEvent2;
        double d6;
        double d7;
        double d8;
        C0289a c0289a;
        float c4;
        float c5;
        float scaledHorizontalScrollFactor;
        InputDevice.MotionRange motionRange;
        if (r27 == -1) {
            return;
        }
        int pointerId = motionEvent.getPointerId(r26);
        int toolType = motionEvent.getToolType(r26);
        if (toolType != 1) {
            if (toolType != 2) {
                r14 = 3;
                if (toolType != 3) {
                    if (toolType != 4) {
                        r14 = 5;
                    }
                } else {
                    r14 = 1;
                }
            } else {
                r14 = 2;
            }
        } else {
            r14 = 0;
        }
        float[] fArr2 = {motionEvent.getX(r26), motionEvent.getY(r26)};
        matrix.mapPoints(fArr2);
        HashMap hashMap = this.f3309d;
        if (r14 == 1) {
            j3 = motionEvent.getButtonState() & 31;
            if (j3 == 0 && motionEvent.getSource() == 8194) {
                r6 = 4;
                if (r27 == 4) {
                    hashMap.put(Integer.valueOf(pointerId), fArr2);
                }
            } else {
                r6 = 4;
            }
        } else {
            r6 = 4;
            j3 = r14 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = hashMap.containsKey(Integer.valueOf(pointerId));
        if (containsKey) {
            if (r27 == r6) {
                r62 = 7;
            } else if (r27 == 5) {
                r62 = 8;
            } else if (r27 != 6 && r27 != 0) {
                r62 = -1;
            } else {
                r62 = 9;
            }
            if (r62 == -1) {
                return;
            }
        } else {
            r62 = -1;
        }
        if (this.f3308c) {
            J j5 = this.f3307b;
            j5.getClass();
            j4 = I.f3298b.incrementAndGet();
            ((LongSparseArray) j5.f3303K).put(j4, MotionEvent.obtain(motionEvent));
            ((PriorityQueue) j5.f3304L).add(Long.valueOf(j4));
        } else {
            j4 = 0;
        }
        if (motionEvent.getActionMasked() == 8) {
            r7 = 1;
        } else {
            r7 = 0;
        }
        long j6 = j3;
        byteBuffer.putLong(j4);
        byteBuffer.putLong(motionEvent.getEventTime() * 1000);
        if (containsKey) {
            byteBuffer.putLong(r62);
            byteBuffer.putLong(4L);
        } else {
            byteBuffer.putLong(r27);
            byteBuffer.putLong(r14);
        }
        byteBuffer.putLong(r7);
        byteBuffer.putLong(pointerId);
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr3 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr3[0]);
            byteBuffer.putDouble(fArr3[1]);
        } else {
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j6);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(r26));
        if (motionEvent.getDevice() != null && (motionRange = motionEvent.getDevice().getMotionRange(2)) != null) {
            d4 = motionRange.getMin();
            fArr = fArr2;
            d5 = motionRange.getMax();
        } else {
            fArr = fArr2;
            d4 = 0.0d;
            d5 = 1.0d;
        }
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(d5);
        if (r14 == 2) {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(motionEvent2.getAxisValue(24, r26));
            byteBuffer.putDouble(0.0d);
        } else {
            motionEvent2 = motionEvent;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(motionEvent.getSize(r26));
        byteBuffer.putDouble(motionEvent.getToolMajor(r26));
        byteBuffer.putDouble(motionEvent.getToolMinor(r26));
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(motionEvent2.getAxisValue(8, r26));
        if (r14 == 2) {
            byteBuffer.putDouble(motionEvent2.getAxisValue(25, r26));
        } else {
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putLong(r28);
        if (r7 == 1) {
            if (context != null) {
                int r3 = Build.VERSION.SDK_INT;
                if (r3 >= 26) {
                    scaledHorizontalScrollFactor = ViewConfiguration.get(context).getScaledHorizontalScrollFactor();
                    c4 = scaledHorizontalScrollFactor;
                    c0289a = this;
                } else {
                    c0289a = this;
                    c4 = c0289a.c(context);
                }
                d7 = c4;
                if (r3 >= 26) {
                    c5 = ViewConfiguration.get(context).getScaledVerticalScrollFactor();
                } else {
                    c5 = c0289a.c(context);
                }
                d8 = c5;
            } else {
                d7 = 48.0d;
                d8 = 48.0d;
            }
            byteBuffer.putDouble(d7 * (-motionEvent2.getAxisValue(10, r26)));
            byteBuffer.putDouble(d8 * (-motionEvent2.getAxisValue(9, r26)));
        } else {
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        if (containsKey) {
            float[] fArr4 = (float[]) hashMap.get(Integer.valueOf(pointerId));
            byteBuffer.putDouble(fArr[0] - fArr4[0]);
            byteBuffer.putDouble(fArr[1] - fArr4[1]);
            d6 = 0.0d;
        } else {
            d6 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d6);
        byteBuffer.putLong(0L);
        if (containsKey && r62 == 9) {
            hashMap.remove(Integer.valueOf(pointerId));
        }
    }

    public final int c(Context context) {
        if (this.f3310e == 0) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                return 48;
            }
            this.f3310e = (int) typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3310e;
    }
}
