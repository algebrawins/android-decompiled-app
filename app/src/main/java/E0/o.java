package E0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class o extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f574a;

    /* renamed from: b  reason: collision with root package name */
    public n f575b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f576c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f577d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f578e;

    /* renamed from: f  reason: collision with root package name */
    public Bitmap f579f;
    public ColorStateList g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f580h;

    /* renamed from: i  reason: collision with root package name */
    public int f581i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f582j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f583k;

    /* renamed from: l  reason: collision with root package name */
    public Paint f584l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f574a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}
