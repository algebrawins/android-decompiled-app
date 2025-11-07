package o;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.example.catering_inventory.R;
import f0.w;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4456a;

    /* renamed from: b  reason: collision with root package name */
    public final j f4457b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4458c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4459d;

    /* renamed from: e  reason: collision with root package name */
    public View f4460e;
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public o f4462h;

    /* renamed from: i  reason: collision with root package name */
    public l f4463i;

    /* renamed from: j  reason: collision with root package name */
    public m f4464j;

    /* renamed from: f  reason: collision with root package name */
    public int f4461f = 8388611;

    /* renamed from: k  reason: collision with root package name */
    public final m f4465k = new m(this);

    public n(int r22, Context context, View view, j jVar, boolean z3) {
        this.f4456a = context;
        this.f4457b = jVar;
        this.f4460e = view;
        this.f4458c = z3;
        this.f4459d = r22;
    }

    public final l a() {
        l sVar;
        if (this.f4463i == null) {
            Context context = this.f4456a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                sVar = new g(context, this.f4460e, this.f4459d, this.f4458c);
            } else {
                View view = this.f4460e;
                Context context2 = this.f4456a;
                boolean z3 = this.f4458c;
                sVar = new s(this.f4459d, context2, view, this.f4457b, z3);
            }
            sVar.l(this.f4457b);
            sVar.r(this.f4465k);
            sVar.n(this.f4460e);
            sVar.b(this.f4462h);
            sVar.o(this.g);
            sVar.p(this.f4461f);
            this.f4463i = sVar;
        }
        return this.f4463i;
    }

    public final boolean b() {
        l lVar = this.f4463i;
        if (lVar != null && lVar.g()) {
            return true;
        }
        return false;
    }

    public void c() {
        this.f4463i = null;
        m mVar = this.f4464j;
        if (mVar != null) {
            mVar.onDismiss();
        }
    }

    public final void d(int r4, int r5, boolean z3, boolean z4) {
        l a4 = a();
        a4.s(z4);
        if (z3) {
            int r6 = this.f4461f;
            View view = this.f4460e;
            Field field = w.f3200a;
            if ((Gravity.getAbsoluteGravity(r6, view.getLayoutDirection()) & 7) == 5) {
                r4 -= this.f4460e.getWidth();
            }
            a4.q(r4);
            a4.t(r5);
            int r62 = (int) ((this.f4456a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a4.f4454J = new Rect(r4 - r62, r5 - r62, r4 + r62, r5 + r62);
        }
        a4.d();
    }
}
