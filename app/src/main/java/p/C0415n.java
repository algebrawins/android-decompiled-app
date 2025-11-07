package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import f0.AbstractC0268o;
import java.lang.reflect.Field;

/* renamed from: p.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0415n {

    /* renamed from: a  reason: collision with root package name */
    public final View f4662a;

    /* renamed from: b  reason: collision with root package name */
    public final C0416o f4663b;

    /* renamed from: c  reason: collision with root package name */
    public int f4664c = -1;

    /* renamed from: d  reason: collision with root package name */
    public B0.d f4665d;

    /* renamed from: e  reason: collision with root package name */
    public B0.d f4666e;

    /* renamed from: f  reason: collision with root package name */
    public B0.d f4667f;

    public C0415n(View view) {
        C0416o c0416o;
        this.f4662a = view;
        PorterDuff.Mode mode = C0416o.f4670b;
        synchronized (C0416o.class) {
            try {
                if (C0416o.f4671c == null) {
                    C0416o.b();
                }
                c0416o = C0416o.f4671c;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4663b = c0416o;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, B0.d] */
    public final void a() {
        View view = this.f4662a;
        Drawable background = view.getBackground();
        if (background != null) {
            int r22 = Build.VERSION.SDK_INT;
            if (r22 <= 21 ? r22 == 21 : this.f4665d != null) {
                if (this.f4667f == null) {
                    this.f4667f = new Object();
                }
                B0.d dVar = this.f4667f;
                dVar.f181c = null;
                dVar.f180b = false;
                dVar.f182d = null;
                dVar.f179a = false;
                Field field = f0.w.f3200a;
                ColorStateList g = AbstractC0268o.g(view);
                if (g != null) {
                    dVar.f180b = true;
                    dVar.f181c = g;
                }
                PorterDuff.Mode h3 = AbstractC0268o.h(view);
                if (h3 != null) {
                    dVar.f179a = true;
                    dVar.f182d = h3;
                }
                if (dVar.f180b || dVar.f179a) {
                    C0416o.c(background, dVar, view.getDrawableState());
                    return;
                }
            }
            B0.d dVar2 = this.f4666e;
            if (dVar2 != null) {
                C0416o.c(background, dVar2, view.getDrawableState());
                return;
            }
            B0.d dVar3 = this.f4665d;
            if (dVar3 != null) {
                C0416o.c(background, dVar3, view.getDrawableState());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[Catch: all -> 0x0034, TryCatch #2 {all -> 0x0034, blocks: (B:3:0x0011, B:5:0x0018, B:6:0x0026, B:8:0x002d, B:10:0x0030, B:17:0x003a, B:19:0x0043, B:21:0x0050, B:23:0x005a, B:30:0x0068, B:32:0x006e, B:33:0x0075, B:34:0x0078, B:36:0x007f, B:38:0x0091, B:40:0x009b, B:45:0x00a6, B:47:0x00ac, B:48:0x00b3, B:7:0x0027), top: B:53:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.view.View r0 = r7.f4662a
            android.content.Context r1 = r0.getContext()
            int[] r2 = i.a.f3403u
            A0.b r8 = A0.C0001b.P(r1, r8, r2, r9)
            java.lang.Object r9 = r8.f84K
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r1 = 0
            boolean r2 = r9.hasValue(r1)     // Catch: java.lang.Throwable -> L34
            r3 = -1
            if (r2 == 0) goto L3a
            int r2 = r9.getResourceId(r1, r3)     // Catch: java.lang.Throwable -> L34
            r7.f4664c = r2     // Catch: java.lang.Throwable -> L34
            p.o r2 = r7.f4663b     // Catch: java.lang.Throwable -> L34
            android.content.Context r4 = r0.getContext()     // Catch: java.lang.Throwable -> L34
            int r5 = r7.f4664c     // Catch: java.lang.Throwable -> L34
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L34
            p.Q r6 = r2.f4672a     // Catch: java.lang.Throwable -> L37
            android.content.res.ColorStateList r4 = r6.i(r4, r5)     // Catch: java.lang.Throwable -> L37
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L3a
            r7.d(r4)     // Catch: java.lang.Throwable -> L34
            goto L3a
        L34:
            r9 = move-exception
            goto Lba
        L37:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L34
        L3a:
            r2 = 1
            boolean r4 = r9.hasValue(r2)     // Catch: java.lang.Throwable -> L34
            r5 = 21
            if (r4 == 0) goto L78
            android.content.res.ColorStateList r4 = r8.D(r2)     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Field r6 = f0.w.f3200a     // Catch: java.lang.Throwable -> L34
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L34
            f0.AbstractC0268o.q(r0, r4)     // Catch: java.lang.Throwable -> L34
            if (r6 != r5) goto L78
            android.graphics.drawable.Drawable r4 = r0.getBackground()     // Catch: java.lang.Throwable -> L34
            android.content.res.ColorStateList r6 = f0.AbstractC0268o.g(r0)     // Catch: java.lang.Throwable -> L34
            if (r6 != 0) goto L63
            android.graphics.PorterDuff$Mode r6 = f0.AbstractC0268o.h(r0)     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L61
            goto L63
        L61:
            r6 = 0
            goto L64
        L63:
            r6 = 1
        L64:
            if (r4 == 0) goto L78
            if (r6 == 0) goto L78
            boolean r6 = r4.isStateful()     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L75
            int[] r6 = r0.getDrawableState()     // Catch: java.lang.Throwable -> L34
            r4.setState(r6)     // Catch: java.lang.Throwable -> L34
        L75:
            r0.setBackground(r4)     // Catch: java.lang.Throwable -> L34
        L78:
            r4 = 2
            boolean r6 = r9.hasValue(r4)     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto Lb6
            int r9 = r9.getInt(r4, r3)     // Catch: java.lang.Throwable -> L34
            r3 = 0
            android.graphics.PorterDuff$Mode r9 = p.AbstractC0426z.d(r9, r3)     // Catch: java.lang.Throwable -> L34
            java.lang.reflect.Field r3 = f0.w.f3200a     // Catch: java.lang.Throwable -> L34
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L34
            f0.AbstractC0268o.r(r0, r9)     // Catch: java.lang.Throwable -> L34
            if (r3 != r5) goto Lb6
            android.graphics.drawable.Drawable r9 = r0.getBackground()     // Catch: java.lang.Throwable -> L34
            android.content.res.ColorStateList r3 = f0.AbstractC0268o.g(r0)     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto La1
            android.graphics.PorterDuff$Mode r3 = f0.AbstractC0268o.h(r0)     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto La2
        La1:
            r1 = 1
        La2:
            if (r9 == 0) goto Lb6
            if (r1 == 0) goto Lb6
            boolean r1 = r9.isStateful()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto Lb3
            int[] r1 = r0.getDrawableState()     // Catch: java.lang.Throwable -> L34
            r9.setState(r1)     // Catch: java.lang.Throwable -> L34
        Lb3:
            r0.setBackground(r9)     // Catch: java.lang.Throwable -> L34
        Lb6:
            r8.S()
            return
        Lba:
            r8.S()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C0415n.b(android.util.AttributeSet, int):void");
    }

    public final void c(int r4) {
        ColorStateList colorStateList;
        this.f4664c = r4;
        C0416o c0416o = this.f4663b;
        if (c0416o != null) {
            Context context = this.f4662a.getContext();
            synchronized (c0416o) {
                colorStateList = c0416o.f4672a.i(context, r4);
            }
        } else {
            colorStateList = null;
        }
        d(colorStateList);
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, B0.d] */
    public final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f4665d == null) {
                this.f4665d = new Object();
            }
            B0.d dVar = this.f4665d;
            dVar.f181c = colorStateList;
            dVar.f180b = true;
        } else {
            this.f4665d = null;
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, B0.d] */
    public final void e(ColorStateList colorStateList) {
        if (this.f4666e == null) {
            this.f4666e = new Object();
        }
        B0.d dVar = this.f4666e;
        dVar.f181c = colorStateList;
        dVar.f180b = true;
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, B0.d] */
    public final void f(PorterDuff.Mode mode) {
        if (this.f4666e == null) {
            this.f4666e = new Object();
        }
        B0.d dVar = this.f4666e;
        dVar.f182d = mode;
        dVar.f179a = true;
        a();
    }
}
