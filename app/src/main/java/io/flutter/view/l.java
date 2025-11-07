package io.flutter.view;

import android.graphics.Rect;
import android.opengl.Matrix;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: A  reason: collision with root package name */
    public String f3682A;

    /* renamed from: D  reason: collision with root package name */
    public int f3685D;

    /* renamed from: E  reason: collision with root package name */
    public int f3686E;

    /* renamed from: F  reason: collision with root package name */
    public int f3687F;

    /* renamed from: G  reason: collision with root package name */
    public int f3688G;

    /* renamed from: H  reason: collision with root package name */
    public float f3689H;

    /* renamed from: I  reason: collision with root package name */
    public String f3690I;

    /* renamed from: J  reason: collision with root package name */
    public String f3691J;

    /* renamed from: K  reason: collision with root package name */
    public float f3692K;

    /* renamed from: L  reason: collision with root package name */
    public float f3693L;

    /* renamed from: M  reason: collision with root package name */
    public float f3694M;

    /* renamed from: N  reason: collision with root package name */
    public float f3695N;

    /* renamed from: O  reason: collision with root package name */
    public float[] f3696O;

    /* renamed from: P  reason: collision with root package name */
    public l f3697P;

    /* renamed from: S  reason: collision with root package name */
    public ArrayList f3700S;

    /* renamed from: T  reason: collision with root package name */
    public i f3701T;

    /* renamed from: U  reason: collision with root package name */
    public i f3702U;

    /* renamed from: W  reason: collision with root package name */
    public float[] f3704W;

    /* renamed from: Y  reason: collision with root package name */
    public float[] f3706Y;

    /* renamed from: Z  reason: collision with root package name */
    public Rect f3707Z;

    /* renamed from: a  reason: collision with root package name */
    public final q f3708a;

    /* renamed from: c  reason: collision with root package name */
    public int f3710c;

    /* renamed from: d  reason: collision with root package name */
    public int f3711d;

    /* renamed from: e  reason: collision with root package name */
    public int f3712e;

    /* renamed from: f  reason: collision with root package name */
    public int f3713f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f3714h;

    /* renamed from: i  reason: collision with root package name */
    public int f3715i;

    /* renamed from: j  reason: collision with root package name */
    public int f3716j;

    /* renamed from: k  reason: collision with root package name */
    public int f3717k;

    /* renamed from: l  reason: collision with root package name */
    public float f3718l;

    /* renamed from: m  reason: collision with root package name */
    public float f3719m;

    /* renamed from: n  reason: collision with root package name */
    public float f3720n;

    /* renamed from: o  reason: collision with root package name */
    public String f3721o;

    /* renamed from: p  reason: collision with root package name */
    public String f3722p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList f3723q;

    /* renamed from: r  reason: collision with root package name */
    public String f3724r;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList f3725s;

    /* renamed from: t  reason: collision with root package name */
    public String f3726t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList f3727u;

    /* renamed from: v  reason: collision with root package name */
    public String f3728v;

    /* renamed from: w  reason: collision with root package name */
    public ArrayList f3729w;

    /* renamed from: x  reason: collision with root package name */
    public String f3730x;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList f3731y;

    /* renamed from: z  reason: collision with root package name */
    public String f3732z;

    /* renamed from: b  reason: collision with root package name */
    public int f3709b = -1;

    /* renamed from: B  reason: collision with root package name */
    public int f3683B = -1;

    /* renamed from: C  reason: collision with root package name */
    public boolean f3684C = false;

    /* renamed from: Q  reason: collision with root package name */
    public final ArrayList f3698Q = new ArrayList();

    /* renamed from: R  reason: collision with root package name */
    public final ArrayList f3699R = new ArrayList();

    /* renamed from: V  reason: collision with root package name */
    public boolean f3703V = true;

    /* renamed from: X  reason: collision with root package name */
    public boolean f3705X = true;

    public l(q qVar) {
        this.f3708a = qVar;
    }

    public static boolean a(l lVar, h hVar) {
        if ((lVar.f3711d & hVar.value) != 0) {
            return true;
        }
        return false;
    }

    public static CharSequence b(l lVar) {
        CharSequence[] charSequenceArr = {e(lVar.f3724r, lVar.f3725s), lVar.f(), e(lVar.f3730x, lVar.f3731y)};
        CharSequence charSequence = null;
        for (int r4 = 0; r4 < 3; r4++) {
            CharSequence charSequence2 = charSequenceArr[r4];
            if (charSequence2 != null && charSequence2.length() > 0) {
                if (charSequence != null && charSequence.length() != 0) {
                    charSequence = TextUtils.concat(charSequence, ", ", charSequence2);
                } else {
                    charSequence = charSequence2;
                }
            }
        }
        return charSequence;
    }

    public static boolean c(l lVar, h hVar) {
        if ((lVar.f3686E & hVar.value) != 0) {
            return true;
        }
        return false;
    }

    public static SpannableString e(String str, ArrayList arrayList) {
        if (str == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(str);
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                int r12 = f.f3675a[nVar.f3735c.ordinal()];
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 == 3) {
                            spannableString.setSpan(new URLSpan(((p) nVar).f3736d), nVar.f3733a, nVar.f3734b, 0);
                        }
                    } else {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((k) nVar).f3681d)), nVar.f3733a, nVar.f3734b, 0);
                    }
                } else {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f3733a, nVar.f3734b, 0);
                }
            }
        }
        return spannableString;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [io.flutter.view.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [io.flutter.view.k, io.flutter.view.n, java.lang.Object] */
    public static ArrayList h(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        int r02 = byteBuffer.getInt();
        if (r02 == -1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(r02);
        for (int r22 = 0; r22 < r02; r22++) {
            int r3 = byteBuffer.getInt();
            int r4 = byteBuffer.getInt();
            o oVar = o.values()[byteBuffer.getInt()];
            int r6 = f.f3675a[oVar.ordinal()];
            if (r6 != 1) {
                if (r6 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    ?? obj = new Object();
                    obj.f3733a = r3;
                    obj.f3734b = r4;
                    obj.f3735c = oVar;
                    obj.f3681d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(obj);
                }
            } else {
                byteBuffer.getInt();
                ?? obj2 = new Object();
                obj2.f3733a = r3;
                obj2.f3734b = r4;
                obj2.f3735c = oVar;
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static void l(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f2 = fArr[3];
        fArr[0] = fArr[0] / f2;
        fArr[1] = fArr[1] / f2;
        fArr[2] = fArr[2] / f2;
        fArr[3] = 0.0f;
    }

    public final void d(ArrayList arrayList) {
        if (i(j.SCOPES_ROUTE)) {
            arrayList.add(this);
        }
        Iterator it = this.f3698Q.iterator();
        while (it.hasNext()) {
            ((l) it.next()).d(arrayList);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [io.flutter.view.n, java.lang.Object, io.flutter.view.p] */
    public final SpannableString f() {
        ArrayList arrayList = this.f3723q;
        String str = this.f3682A;
        if (str != null && str.length() > 0) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            } else {
                arrayList = new ArrayList(arrayList);
            }
            ?? obj = new Object();
            obj.f3733a = 0;
            obj.f3734b = this.f3722p.length();
            obj.f3736d = this.f3682A;
            obj.f3735c = o.URL;
            arrayList.add(obj);
        }
        return e(this.f3722p, arrayList);
    }

    public final String g() {
        String str;
        if (i(j.NAMES_ROUTE) && (str = this.f3722p) != null && !str.isEmpty()) {
            return this.f3722p;
        }
        Iterator it = this.f3698Q.iterator();
        while (it.hasNext()) {
            String g = ((l) it.next()).g();
            if (g != null && !g.isEmpty()) {
                return g;
            }
        }
        return null;
    }

    public final boolean i(j jVar) {
        if ((jVar.value & this.f3710c) != 0) {
            return true;
        }
        return false;
    }

    public final l j(float[] fArr, boolean z3) {
        float f2 = fArr[3];
        boolean z4 = false;
        float f4 = fArr[0] / f2;
        float f5 = fArr[1] / f2;
        if (f4 < this.f3692K || f4 >= this.f3694M || f5 < this.f3693L || f5 >= this.f3695N) {
            return null;
        }
        float[] fArr2 = new float[4];
        Iterator it = this.f3699R.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (!lVar.i(j.IS_HIDDEN)) {
                if (lVar.f3703V) {
                    lVar.f3703V = false;
                    if (lVar.f3704W == null) {
                        lVar.f3704W = new float[16];
                    }
                    if (!Matrix.invertM(lVar.f3704W, 0, lVar.f3696O, 0)) {
                        Arrays.fill(lVar.f3704W, 0.0f);
                    }
                }
                Matrix.multiplyMV(fArr2, 0, lVar.f3704W, 0, fArr, 0);
                l j3 = lVar.j(fArr2, z3);
                if (j3 != null) {
                    return j3;
                }
            }
        }
        if (z3 && this.f3715i != -1) {
            z4 = true;
        }
        if (!k() && !z4) {
            return null;
        }
        return this;
    }

    public final boolean k() {
        String str;
        String str2;
        String str3;
        if (i(j.SCOPES_ROUTE)) {
            return false;
        }
        if (!i(j.IS_FOCUSABLE) && (this.f3711d & (~q.f3738y)) == 0 && (this.f3710c & q.f3739z) == 0 && (((str = this.f3722p) == null || str.isEmpty()) && (((str2 = this.f3724r) == null || str2.isEmpty()) && ((str3 = this.f3730x) == null || str3.isEmpty())))) {
            return false;
        }
        return true;
    }

    public final void m(float[] fArr, HashSet hashSet, boolean z3) {
        hashSet.add(this);
        if (this.f3705X) {
            z3 = true;
        }
        if (z3) {
            if (this.f3706Y == null) {
                this.f3706Y = new float[16];
            }
            if (this.f3696O == null) {
                this.f3696O = new float[16];
            }
            Matrix.multiplyMM(this.f3706Y, 0, fArr, 0, this.f3696O, 0);
            float[] fArr2 = {this.f3692K, this.f3693L, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            l(fArr3, this.f3706Y, fArr2);
            fArr2[0] = this.f3694M;
            fArr2[1] = this.f3693L;
            l(fArr4, this.f3706Y, fArr2);
            fArr2[0] = this.f3694M;
            fArr2[1] = this.f3695N;
            l(fArr5, this.f3706Y, fArr2);
            fArr2[0] = this.f3692K;
            fArr2[1] = this.f3695N;
            l(fArr6, this.f3706Y, fArr2);
            if (this.f3707Z == null) {
                this.f3707Z = new Rect();
            }
            this.f3707Z.set(Math.round(Math.min(fArr3[0], Math.min(fArr4[0], Math.min(fArr5[0], fArr6[0])))), Math.round(Math.min(fArr3[1], Math.min(fArr4[1], Math.min(fArr5[1], fArr6[1])))), Math.round(Math.max(fArr3[0], Math.max(fArr4[0], Math.max(fArr5[0], fArr6[0])))), Math.round(Math.max(fArr3[1], Math.max(fArr4[1], Math.max(fArr5[1], fArr6[1])))));
            this.f3705X = false;
        }
        Iterator it = this.f3698Q.iterator();
        int r02 = -1;
        while (it.hasNext()) {
            l lVar = (l) it.next();
            lVar.f3683B = r02;
            r02 = lVar.f3709b;
            lVar.m(this.f3706Y, hashSet, z3);
        }
    }
}
