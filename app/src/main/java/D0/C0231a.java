package d0;

import K0.p;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import java.util.Objects;

/* renamed from: d0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0231a {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f2998a;

    /* renamed from: b  reason: collision with root package name */
    public final TextDirectionHeuristic f2999b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3000c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3001d;

    public C0231a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int r5, int r6) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = p.h(textPaint).setBreakStrategy(r5);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(r6);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f2998a = textPaint;
        this.f2999b = textDirectionHeuristic;
        this.f3000c = r5;
        this.f3001d = r6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
        if (r7.f3001d != r8.f3001d) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        if (r1 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0095, code lost:
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r3.getTypeface() != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a2, code lost:
        if (r5.getTypeface() == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b2, code lost:
        if (r3.getTypeface().equals(r5.getTypeface()) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b6, code lost:
        r1 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof d0.C0231a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d0.a r8 = (d0.C0231a) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L22
            int r3 = r8.f3000c
            int r4 = r7.f3000c
            if (r4 == r3) goto L1b
        L18:
            r1 = 0
            goto Lb7
        L1b:
            int r3 = r7.f3001d
            int r4 = r8.f3001d
            if (r3 == r4) goto L22
            goto L18
        L22:
            android.text.TextPaint r3 = r7.f2998a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f2998a
            float r5 = r5.getTextSize()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L33
            goto L18
        L33:
            float r4 = r3.getTextScaleX()
            android.text.TextPaint r5 = r8.f2998a
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L42
            goto L18
        L42:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L4f
            goto L18
        L4f:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L5c
            goto L18
        L5c:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L6b
            goto L18
        L6b:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L76
            goto L18
        L76:
            r4 = 24
            if (r1 < r4) goto L89
            android.os.LocaleList r1 = O0.a.g(r3)
            android.os.LocaleList r4 = O0.a.g(r5)
            boolean r1 = O0.a.v(r1, r4)
            if (r1 != 0) goto L98
            goto L18
        L89:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L98
            goto L18
        L98:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto La6
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto Lb6
            goto L18
        La6:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb6
            goto L18
        Lb6:
            r1 = 1
        Lb7:
            if (r1 != 0) goto Lba
            return r2
        Lba:
            android.text.TextDirectionHeuristic r1 = r7.f2999b
            android.text.TextDirectionHeuristic r8 = r8.f2999b
            if (r1 != r8) goto Lc1
            goto Lc2
        Lc1:
            r0 = 0
        Lc2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.C0231a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.f2999b;
        int r14 = Build.VERSION.SDK_INT;
        int r12 = this.f3001d;
        int r22 = this.f3000c;
        TextPaint textPaint = this.f2998a;
        if (r14 >= 24) {
            Float valueOf = Float.valueOf(textPaint.getTextSize());
            Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
            Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
            Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
            textLocales = textPaint.getTextLocales();
            return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(r22), Integer.valueOf(r12));
        }
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(r22), Integer.valueOf(r12));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f2998a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int r12 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (r12 >= 24) {
            StringBuilder sb3 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb3.append(textLocales);
            sb.append(sb3.toString());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (r12 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb.append(sb4.toString());
        }
        sb.append(", textDir=" + this.f2999b);
        sb.append(", breakStrategy=" + this.f3000c);
        sb.append(", hyphenationFrequency=" + this.f3001d);
        sb.append("}");
        return sb.toString();
    }

    public C0231a(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f2998a = textPaint;
        textDirection = params.getTextDirection();
        this.f2999b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f3000c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f3001d = hyphenationFrequency;
    }
}
