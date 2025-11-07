package androidx.appcompat.view.menu;

import A0.C0001b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.example.catering_inventory.R;
import f0.w;
import i.a;
import java.lang.reflect.Field;
import o.k;
import o.q;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements q, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: J  reason: collision with root package name */
    public k f1905J;

    /* renamed from: K  reason: collision with root package name */
    public ImageView f1906K;

    /* renamed from: L  reason: collision with root package name */
    public RadioButton f1907L;

    /* renamed from: M  reason: collision with root package name */
    public TextView f1908M;

    /* renamed from: N  reason: collision with root package name */
    public CheckBox f1909N;

    /* renamed from: O  reason: collision with root package name */
    public TextView f1910O;

    /* renamed from: P  reason: collision with root package name */
    public ImageView f1911P;

    /* renamed from: Q  reason: collision with root package name */
    public ImageView f1912Q;

    /* renamed from: R  reason: collision with root package name */
    public LinearLayout f1913R;

    /* renamed from: S  reason: collision with root package name */
    public final Drawable f1914S;

    /* renamed from: T  reason: collision with root package name */
    public final int f1915T;

    /* renamed from: U  reason: collision with root package name */
    public final Context f1916U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f1917V;

    /* renamed from: W  reason: collision with root package name */
    public final Drawable f1918W;
    public final boolean a0;

    /* renamed from: b0  reason: collision with root package name */
    public LayoutInflater f1919b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1920c0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0001b P3 = C0001b.P(getContext(), attributeSet, a.f3396n, R.attr.listMenuViewStyle);
        this.f1914S = P3.E(5);
        TypedArray typedArray = (TypedArray) P3.f84K;
        this.f1915T = typedArray.getResourceId(1, -1);
        this.f1917V = typedArray.getBoolean(7, false);
        this.f1916U = context;
        this.f1918W = P3.E(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.a0 = obtainStyledAttributes.hasValue(0);
        P3.S();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1919b0 == null) {
            this.f1919b0 = LayoutInflater.from(getContext());
        }
        return this.f1919b0;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        int r22;
        ImageView imageView = this.f1911P;
        if (imageView != null) {
            if (z3) {
                r22 = 0;
            } else {
                r22 = 8;
            }
            imageView.setVisibility(r22);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1912Q;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1912Q.getLayoutParams();
            rect.top = this.f1912Q.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r0 == false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0127  */
    @Override // o.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(o.k r11) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(o.k):void");
    }

    @Override // o.q
    public k getItemData() {
        return this.f1905J;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Field field = w.f3200a;
        setBackground(this.f1914S);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1908M = textView;
        int r22 = this.f1915T;
        if (r22 != -1) {
            textView.setTextAppearance(this.f1916U, r22);
        }
        this.f1910O = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1911P = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1918W);
        }
        this.f1912Q = (ImageView) findViewById(R.id.group_divider);
        this.f1913R = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r4, int r5) {
        if (this.f1906K != null && this.f1917V) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1906K.getLayoutParams();
            int r02 = layoutParams.height;
            if (r02 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = r02;
            }
        }
        super.onMeasure(r4, r5);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f1907L == null && this.f1909N == null) {
            return;
        }
        if ((this.f1905J.f4451x & 4) != 0) {
            if (this.f1907L == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1907L = radioButton;
                LinearLayout linearLayout = this.f1913R;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1907L;
            view = this.f1909N;
        } else {
            if (this.f1909N == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1909N = checkBox;
                LinearLayout linearLayout2 = this.f1913R;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1909N;
            view = this.f1907L;
        }
        if (z3) {
            compoundButton.setChecked(this.f1905J.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.f1909N;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1907L;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f1905J.f4451x & 4) != 0) {
            if (this.f1907L == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1907L = radioButton;
                LinearLayout linearLayout = this.f1913R;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1907L;
        } else {
            if (this.f1909N == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1909N = checkBox;
                LinearLayout linearLayout2 = this.f1913R;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1909N;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f1920c0 = z3;
        this.f1917V = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        int r3;
        ImageView imageView = this.f1912Q;
        if (imageView != null) {
            if (!this.a0 && z3) {
                r3 = 0;
            } else {
                r3 = 8;
            }
            imageView.setVisibility(r3);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1905J.f4441n.getClass();
        boolean z3 = this.f1920c0;
        if (!z3 && !this.f1917V) {
            return;
        }
        ImageView imageView = this.f1906K;
        if (imageView == null && drawable == null && !this.f1917V) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.f1906K = imageView2;
            LinearLayout linearLayout = this.f1913R;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.f1917V) {
            this.f1906K.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.f1906K;
        if (!z3) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.f1906K.getVisibility() != 0) {
            this.f1906K.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1908M.setText(charSequence);
            if (this.f1908M.getVisibility() != 0) {
                this.f1908M.setVisibility(0);
            }
        } else if (this.f1908M.getVisibility() != 8) {
            this.f1908M.setVisibility(8);
        }
    }
}
