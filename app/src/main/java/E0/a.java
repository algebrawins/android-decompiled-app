package E0;

import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.InflateException;
import x1.AbstractC0739x0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f513a = {16842755, 16843041, 16843093, 16843097, 16843551, 16843754, 16843771, 16843778, 16843779};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f514b = {16842755, 16843189, 16843190, 16843556, 16843557, 16843558, 16843866, 16843867};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f515c = {16842755, 16843780, 16843781, 16843782, 16843783, 16843784, 16843785, 16843786, 16843787, 16843788, 16843789, 16843979, 16843980, 16844062};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f516d = {16842755, 16843781, 16844062};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f517e = {16843161};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f518f = {16842755, 16843213};
    public static final int[] g = {16843073, 16843160, 16843198, 16843199, 16843200, 16843486, 16843487, 16843488};

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f519h = {16843490};

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f520i = {16843486, 16843487, 16843488, 16843489};

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f521j = {16842788, 16843073, 16843488, 16843992};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f522k = {16843489, 16843781, 16843892, 16843893};

    /* JADX WARN: Code restructure failed: missing block: B:200:0x039c, code lost:
        if (r31 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x039e, code lost:
        if (r13 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03a0, code lost:
        r1 = new android.animation.Animator[r13.size()];
        r3 = r13.iterator();
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03af, code lost:
        if (r3.hasNext() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03b1, code lost:
        r1[r14] = (android.animation.Animator) r3.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03bd, code lost:
        if (r32 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03bf, code lost:
        r31.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c3, code lost:
        r31.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c6, code lost:
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.Animator a(android.content.Context r26, android.content.res.Resources r27, android.content.res.Resources.Theme r28, android.content.res.XmlResourceParser r29, android.util.AttributeSet r30, android.animation.AnimatorSet r31, int r32) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.a.a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* JADX WARN: Type inference failed for: r11v26, types: [android.animation.TypeEvaluator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.animation.TypeEvaluator, java.lang.Object] */
    public static PropertyValuesHolder b(TypedArray typedArray, int r12, int r13, int r14, String str) {
        boolean z3;
        int r15;
        boolean z4;
        int r5;
        boolean z5;
        g gVar;
        int r11;
        int r132;
        int r112;
        float f2;
        PropertyValuesHolder ofFloat;
        float f4;
        float f5;
        PropertyValuesHolder ofObject;
        TypedValue peekValue = typedArray.peekValue(r13);
        if (peekValue != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            r15 = peekValue.type;
        } else {
            r15 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(r14);
        if (peekValue2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            r5 = peekValue2.type;
        } else {
            r5 = 0;
        }
        if (r12 == 4) {
            if ((z3 && c(r15)) || (z4 && c(r5))) {
                r12 = 3;
            } else {
                r12 = 0;
            }
        }
        if (r12 == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (r12 == 2) {
            String string = typedArray.getString(r13);
            String string2 = typedArray.getString(r14);
            Y.d[] c4 = AbstractC0739x0.c(string);
            Y.d[] c5 = AbstractC0739x0.c(string2);
            if (c4 == null && c5 == null) {
                return null;
            }
            if (c4 != null) {
                ?? obj = new Object();
                if (c5 != null) {
                    if (AbstractC0739x0.a(c4, c5)) {
                        ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c4, c5);
                    } else {
                        throw new InflateException(" Can't morph from " + string + " to " + string2);
                    }
                } else {
                    ofObject = PropertyValuesHolder.ofObject(str, (TypeEvaluator) obj, c4);
                }
                return ofObject;
            } else if (c5 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, (TypeEvaluator) new Object(), c5);
            }
        }
        if (r12 == 3) {
            gVar = g.f534a;
        } else {
            gVar = null;
        }
        if (z5) {
            if (z3) {
                if (r15 == 5) {
                    f4 = typedArray.getDimension(r13, 0.0f);
                } else {
                    f4 = typedArray.getFloat(r13, 0.0f);
                }
                if (z4) {
                    if (r5 == 5) {
                        f5 = typedArray.getDimension(r14, 0.0f);
                    } else {
                        f5 = typedArray.getFloat(r14, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, f4, f5);
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, f4);
                }
            } else {
                if (r5 == 5) {
                    f2 = typedArray.getDimension(r14, 0.0f);
                } else {
                    f2 = typedArray.getFloat(r14, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, f2);
            }
            propertyValuesHolder = ofFloat;
        } else if (z3) {
            if (r15 == 5) {
                r132 = (int) typedArray.getDimension(r13, 0.0f);
            } else if (c(r15)) {
                r132 = typedArray.getColor(r13, 0);
            } else {
                r132 = typedArray.getInt(r13, 0);
            }
            if (z4) {
                if (r5 == 5) {
                    r112 = (int) typedArray.getDimension(r14, 0.0f);
                } else if (c(r5)) {
                    r112 = typedArray.getColor(r14, 0);
                } else {
                    r112 = typedArray.getInt(r14, 0);
                }
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, r132, r112);
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt(str, r132);
            }
        } else if (z4) {
            if (r5 == 5) {
                r11 = (int) typedArray.getDimension(r14, 0.0f);
            } else if (c(r5)) {
                r11 = typedArray.getColor(r14, 0);
            } else {
                r11 = typedArray.getInt(r14, 0);
            }
            propertyValuesHolder = PropertyValuesHolder.ofInt(str, r11);
        }
        if (propertyValuesHolder != null && gVar != null) {
            propertyValuesHolder.setEvaluator(gVar);
            return propertyValuesHolder;
        }
        return propertyValuesHolder;
    }

    public static boolean c(int r12) {
        if (r12 >= 28 && r12 <= 31) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.animation.ValueAnimator d(android.content.Context r20, android.content.res.Resources r21, android.content.res.Resources.Theme r22, android.util.AttributeSet r23, android.animation.ObjectAnimator r24, android.content.res.XmlResourceParser r25) {
        /*
            Method dump skipped, instructions count: 546
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E0.a.d(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.util.AttributeSet, android.animation.ObjectAnimator, android.content.res.XmlResourceParser):android.animation.ValueAnimator");
    }
}
