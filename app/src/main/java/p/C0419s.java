package p;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;

/* renamed from: p.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419s {

    /* renamed from: a  reason: collision with root package name */
    public final int f4693a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4694b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4695c;

    public C0419s(int r12, String str, double d4, double d5, double d6, double d7, int r11, q2.k kVar, ByteBuffer byteBuffer) {
        this.f4693a = r12;
        this.f4695c = str;
        this.f4694b = r11;
    }

    public void a() {
        new Handler(Looper.getMainLooper()).post(new D.N(9, this));
    }

    public void b(Typeface typeface) {
        int r3;
        boolean z3;
        WeakReference weakReference = (WeakReference) this.f4695c;
        C0420t c0420t = (C0420t) weakReference.get();
        if (c0420t == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28 && (r3 = this.f4693a) != -1) {
            if ((this.f4694b & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            typeface = Typeface.create(typeface, r3, z3);
        }
        c0420t.f4706a.post(new H.e(19, weakReference, typeface));
    }

    public C0419s(C0420t c0420t, int r3, int r4) {
        this.f4695c = new WeakReference(c0420t);
        this.f4693a = r3;
        this.f4694b = r4;
    }
}
