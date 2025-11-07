package androidx.appcompat.view.menu;

import A0.C0001b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.i;
import o.k;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements i, AdapterView.OnItemClickListener {

    /* renamed from: J  reason: collision with root package name */
    public static final int[] f1904J = {16842964, 16843049};

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0001b P3 = C0001b.P(context, attributeSet, f1904J, 16842868);
        TypedArray typedArray = (TypedArray) P3.f84K;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(P3.E(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(P3.E(1));
        }
        P3.S();
    }

    @Override // o.i
    public final boolean a(k kVar) {
        throw null;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int r3, long j3) {
        k kVar = (k) getAdapter().getItem(r3);
        throw null;
    }
}
