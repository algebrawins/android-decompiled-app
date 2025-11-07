package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: p.w  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0423w {

    /* renamed from: k  reason: collision with root package name */
    public static final RectF f4729k = new RectF();

    /* renamed from: l  reason: collision with root package name */
    public static final ConcurrentHashMap f4730l = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public int f4731a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4732b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f4733c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f4734d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f4735e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f4736f = new int[0];
    public boolean g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f4737h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f4738i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f4739j;

    static {
        new ConcurrentHashMap();
    }

    public C0423w(TextView textView) {
        this.f4738i = textView;
        this.f4739j = textView.getContext();
    }

    public static int[] b(int[] r6) {
        int length = r6.length;
        if (length == 0) {
            return r6;
        }
        Arrays.sort(r6);
        ArrayList arrayList = new ArrayList();
        for (int r4 : r6) {
            if (r4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(r4)) < 0) {
                arrayList.add(Integer.valueOf(r4));
            }
        }
        if (length == arrayList.size()) {
            return r6;
        }
        int size = arrayList.size();
        int[] r02 = new int[size];
        for (int r22 = 0; r22 < size; r22++) {
            r02[r22] = ((Integer) arrayList.get(r22)).intValue();
        }
        return r02;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f4730l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void a() {
        boolean booleanValue;
        int measuredWidth;
        if (this.f4731a != 0) {
            if (this.f4732b) {
                if (this.f4738i.getMeasuredHeight() > 0 && this.f4738i.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        booleanValue = this.f4738i.isHorizontallyScrollable();
                    } else {
                        booleanValue = ((Boolean) e(this.f4738i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
                    }
                    if (booleanValue) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f4738i.getMeasuredWidth() - this.f4738i.getTotalPaddingLeft()) - this.f4738i.getTotalPaddingRight();
                    }
                    int height = (this.f4738i.getHeight() - this.f4738i.getCompoundPaddingBottom()) - this.f4738i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f4729k;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float c4 = c(rectF);
                                if (c4 != this.f4738i.getTextSize()) {
                                    f(0, c4);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f4732b = true;
        }
    }

    public final int c(RectF rectF) {
        int r3;
        int r9;
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        int breakStrategy;
        StaticLayout.Builder breakStrategy2;
        int hyphenationFrequency;
        StaticLayout.Builder hyphenationFrequency2;
        int r11;
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f4736f.length;
        if (length != 0) {
            int r22 = length - 1;
            int r4 = 1;
            int r5 = 0;
            while (r4 <= r22) {
                int r52 = (r4 + r22) / 2;
                int r6 = this.f4736f[r52];
                TextView textView = this.f4738i;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int r92 = Build.VERSION.SDK_INT;
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.f4737h;
                if (textPaint == null) {
                    this.f4737h = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f4737h.set(textView.getPaint());
                this.f4737h.setTextSize(r6);
                Layout.Alignment alignment2 = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (r92 >= 23) {
                    obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f4737h, round);
                    alignment = obtain.setAlignment(alignment2);
                    lineSpacing = alignment.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
                    includePad = lineSpacing.setIncludePad(textView.getIncludeFontPadding());
                    breakStrategy = textView.getBreakStrategy();
                    breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
                    hyphenationFrequency = textView.getHyphenationFrequency();
                    hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
                    if (maxLines == -1) {
                        r11 = Integer.MAX_VALUE;
                    } else {
                        r11 = maxLines;
                    }
                    hyphenationFrequency2.setMaxLines(r11);
                    if (r92 >= 29) {
                        try {
                            textDirectionHeuristic = textView.getTextDirectionHeuristic();
                        } catch (ClassCastException unused) {
                            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                        }
                    } else {
                        textDirectionHeuristic = (TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
                    }
                    obtain.setTextDirection(textDirectionHeuristic);
                    staticLayout = obtain.build();
                    r9 = maxLines;
                    r3 = -1;
                } else {
                    r3 = -1;
                    r9 = maxLines;
                    staticLayout = new StaticLayout(text, this.f4737h, round, alignment2, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                }
                if (r9 != r3) {
                    if (staticLayout.getLineCount() <= r9) {
                        if (staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length()) {
                        }
                    }
                    r5 = r52 - 1;
                    r22 = r5;
                }
                if (staticLayout.getHeight() > rectF.bottom) {
                    r5 = r52 - 1;
                    r22 = r5;
                } else {
                    int r53 = r52 + 1;
                    r5 = r4;
                    r4 = r53;
                }
            }
            return this.f4736f[r5];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final void f(int r4, float f2) {
        Resources resources;
        Context context = this.f4739j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(r4, f2, resources.getDisplayMetrics());
        TextView textView = this.f4738i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f4732b = false;
                try {
                    Method d4 = d("nullLayouts");
                    if (d4 != null) {
                        d4.invoke(textView, null);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f4731a == 1) {
            if (!this.g || this.f4736f.length == 0) {
                int floor = ((int) Math.floor((this.f4735e - this.f4734d) / this.f4733c)) + 1;
                int[] r3 = new int[floor];
                for (int r22 = 0; r22 < floor; r22++) {
                    r3[r22] = Math.round((r22 * this.f4733c) + this.f4734d);
                }
                this.f4736f = b(r3);
            }
            this.f4732b = true;
        } else {
            this.f4732b = false;
        }
        return this.f4732b;
    }

    public final boolean h() {
        boolean z3;
        int[] r02 = this.f4736f;
        int length = r02.length;
        if (length > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.g = z3;
        if (z3) {
            this.f4731a = 1;
            this.f4734d = r02[0];
            this.f4735e = r02[length - 1];
            this.f4733c = -1.0f;
        }
        return z3;
    }

    public final void i(float f2, float f4, float f5) {
        if (f2 > 0.0f) {
            if (f4 > f2) {
                if (f5 > 0.0f) {
                    this.f4731a = 1;
                    this.f4734d = f2;
                    this.f4735e = f4;
                    this.f4733c = f5;
                    this.g = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f5 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f4 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
    }
}
