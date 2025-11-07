package p;

import A0.C0001b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;

/* renamed from: p.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0420t {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f4706a;

    /* renamed from: b  reason: collision with root package name */
    public B0.d f4707b;

    /* renamed from: c  reason: collision with root package name */
    public B0.d f4708c;

    /* renamed from: d  reason: collision with root package name */
    public B0.d f4709d;

    /* renamed from: e  reason: collision with root package name */
    public B0.d f4710e;

    /* renamed from: f  reason: collision with root package name */
    public B0.d f4711f;
    public B0.d g;

    /* renamed from: h  reason: collision with root package name */
    public B0.d f4712h;

    /* renamed from: i  reason: collision with root package name */
    public final C0423w f4713i;

    /* renamed from: j  reason: collision with root package name */
    public int f4714j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4715k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f4716l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4717m;

    public C0420t(TextView textView) {
        this.f4706a = textView;
        this.f4713i = new C0423w(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, B0.d] */
    public static B0.d c(Context context, C0416o c0416o, int r3) {
        ColorStateList i3;
        synchronized (c0416o) {
            i3 = c0416o.f4672a.i(context, r3);
        }
        if (i3 != null) {
            ?? obj = new Object();
            obj.f180b = true;
            obj.f181c = i3;
            return obj;
        }
        return null;
    }

    public final void a(Drawable drawable, B0.d dVar) {
        if (drawable != null && dVar != null) {
            C0416o.c(drawable, dVar, this.f4706a.getDrawableState());
        }
    }

    public final void b() {
        B0.d dVar = this.f4707b;
        TextView textView = this.f4706a;
        if (dVar != null || this.f4708c != null || this.f4709d != null || this.f4710e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f4707b);
            a(compoundDrawables[1], this.f4708c);
            a(compoundDrawables[2], this.f4709d);
            a(compoundDrawables[3], this.f4710e);
        }
        if (this.f4711f != null || this.g != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f4711f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0451 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 1108
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0420t.d(android.util.AttributeSet, int):void");
    }

    public final void e(Context context, int r8) {
        String string;
        ColorStateList D3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r8, i.a.f3401s);
        C0001b c0001b = new C0001b(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f4706a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 23 && obtainStyledAttributes.hasValue(3) && (D3 = c0001b.D(3)) != null) {
            textView.setTextColor(D3);
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, c0001b);
        if (r02 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        c0001b.S();
        Typeface typeface = this.f4716l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f4714j);
        }
    }

    public final void f(Context context, C0001b c0001b) {
        String string;
        Typeface create;
        boolean z3;
        boolean z4;
        Typeface create2;
        int r02 = this.f4714j;
        TypedArray typedArray = (TypedArray) c0001b.f84K;
        this.f4714j = typedArray.getInt(2, r02);
        int r03 = Build.VERSION.SDK_INT;
        if (r03 >= 28) {
            int r5 = typedArray.getInt(11, -1);
            this.f4715k = r5;
            if (r5 != -1) {
                this.f4714j &= 2;
            }
        }
        int r52 = 10;
        boolean z5 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f4717m = false;
                int r11 = typedArray.getInt(1, 1);
                if (r11 != 1) {
                    if (r11 != 2) {
                        if (r11 == 3) {
                            this.f4716l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f4716l = Typeface.SERIF;
                    return;
                }
                this.f4716l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f4716l = null;
        if (typedArray.hasValue(12)) {
            r52 = 12;
        }
        int r6 = this.f4715k;
        int r7 = this.f4714j;
        if (!context.isRestricted()) {
            try {
                Typeface F3 = c0001b.F(r52, this.f4714j, new C0419s(this, r6, r7));
                if (F3 != null) {
                    if (r03 >= 28 && this.f4715k != -1) {
                        Typeface create3 = Typeface.create(F3, 0);
                        int r12 = this.f4715k;
                        if ((this.f4714j & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        create2 = Typeface.create(create3, r12, z4);
                        this.f4716l = create2;
                    } else {
                        this.f4716l = F3;
                    }
                }
                if (this.f4716l == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f4717m = z3;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f4716l == null && (string = typedArray.getString(r52)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f4715k != -1) {
                Typeface create4 = Typeface.create(string, 0);
                int r122 = this.f4715k;
                if ((this.f4714j & 2) != 0) {
                    z5 = true;
                }
                create = Typeface.create(create4, r122, z5);
                this.f4716l = create;
                return;
            }
            this.f4716l = Typeface.create(string, this.f4714j);
        }
    }
}
