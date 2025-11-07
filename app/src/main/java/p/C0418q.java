package p;

import A0.C0001b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;

/* renamed from: p.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0418q extends ImageView {

    /* renamed from: J  reason: collision with root package name */
    public final C0415n f4677J;

    /* renamed from: K  reason: collision with root package name */
    public final C0001b f4678K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0418q(Context context, int r3) {
        super(context, null, r3);
        j0.a(context);
        C0415n c0415n = new C0415n(this);
        this.f4677J = c0415n;
        c0415n.b(null, r3);
        C0001b c0001b = new C0001b(this);
        this.f4678K = c0001b;
        c0001b.N(r3);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0415n c0415n = this.f4677J;
        if (c0415n != null) {
            c0415n.a();
        }
        C0001b c0001b = this.f4678K;
        if (c0001b != null) {
            c0001b.f();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        B0.d dVar;
        C0415n c0415n = this.f4677J;
        if (c0415n == null || (dVar = c0415n.f4666e) == null) {
            return null;
        }
        return (ColorStateList) dVar.f181c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        B0.d dVar;
        C0415n c0415n = this.f4677J;
        if (c0415n == null || (dVar = c0415n.f4666e) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f182d;
    }

    public ColorStateList getSupportImageTintList() {
        B0.d dVar;
        C0001b c0001b = this.f4678K;
        if (c0001b == null || (dVar = (B0.d) c0001b.f84K) == null) {
            return null;
        }
        return (ColorStateList) dVar.f181c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        B0.d dVar;
        C0001b c0001b = this.f4678K;
        if (c0001b == null || (dVar = (B0.d) c0001b.f84K) == null) {
            return null;
        }
        return (PorterDuff.Mode) dVar.f182d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if (!(((ImageView) this.f4678K.f85L).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0415n c0415n = this.f4677J;
        if (c0415n != null) {
            c0415n.f4664c = -1;
            c0415n.d(null);
            c0415n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int r22) {
        super.setBackgroundResource(r22);
        C0415n c0415n = this.f4677J;
        if (c0415n != null) {
            c0415n.c(r22);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0001b c0001b = this.f4678K;
        if (c0001b != null) {
            c0001b.f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C0001b c0001b = this.f4678K;
        if (c0001b != null) {
            c0001b.f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r4) {
        C0001b c0001b = this.f4678K;
        if (c0001b != null) {
            ImageView imageView = (ImageView) c0001b.f85L;
            if (r4 != 0) {
                Drawable c4 = j.b.c(imageView.getContext(), r4);
                if (c4 != null) {
                    AbstractC0426z.b(c4);
                }
                imageView.setImageDrawable(c4);
            } else {
                imageView.setImageDrawable(null);
            }
            c0001b.f();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0001b c0001b = this.f4678K;
        if (c0001b != null) {
            c0001b.f();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0415n c0415n = this.f4677J;
        if (c0415n != null) {
            c0415n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0415n c0415n = this.f4677J;
        if (c0415n != null) {
            c0415n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0001b c0001b = this.f4678K;
        if (c0001b != null) {
            if (((B0.d) c0001b.f84K) == null) {
                c0001b.f84K = new Object();
            }
            B0.d dVar = (B0.d) c0001b.f84K;
            dVar.f181c = colorStateList;
            dVar.f180b = true;
            c0001b.f();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0001b c0001b = this.f4678K;
        if (c0001b != null) {
            if (((B0.d) c0001b.f84K) == null) {
                c0001b.f84K = new Object();
            }
            B0.d dVar = (B0.d) c0001b.f84K;
            dVar.f182d = mode;
            dVar.f179a = true;
            c0001b.f();
        }
    }
}
