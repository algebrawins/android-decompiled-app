package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.example.catering_inventory.R;
import o.View$OnTouchListenerC0395a;
import x1.I4;

/* renamed from: p.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0410h extends C0418q implements InterfaceC0411j {

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ i f4620L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410h(i iVar, Context context) {
        super(context, R.attr.actionOverflowButtonStyle);
        this.f4620L = iVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        I4.a(this, getContentDescription());
        setOnTouchListener(new View$OnTouchListenerC0395a(this, this));
    }

    @Override // p.InterfaceC0411j
    public final boolean a() {
        return false;
    }

    @Override // p.InterfaceC0411j
    public final boolean c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f4620L.h();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int r5, int r6, int r7, int r8) {
        boolean frame = super.setFrame(r5, r6, r7, r8);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            Z.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
