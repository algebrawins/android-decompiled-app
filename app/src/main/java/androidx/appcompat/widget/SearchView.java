package androidx.appcompat.widget;

import A0.C0001b;
import F2.e;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.example.catering_inventory.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import f0.w;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m0.AbstractC0351b;
import n.InterfaceC0354a;
import p.AbstractC0414m;
import p.F;
import p.G;
import p.U;
import p.V;
import p.W;
import p.X;
import p.Y;
import p.Z;
import p.a0;
import p.b0;
import p.c0;
import p.d0;
import p.e0;
import p.g0;
import x1.I4;

/* loaded from: classes.dex */
public class SearchView extends F implements InterfaceC0354a {
    public static final e P0;

    /* renamed from: A0  reason: collision with root package name */
    public l0.b f1983A0;

    /* renamed from: B0  reason: collision with root package name */
    public boolean f1984B0;

    /* renamed from: C0  reason: collision with root package name */
    public CharSequence f1985C0;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f1986D0;

    /* renamed from: E0  reason: collision with root package name */
    public boolean f1987E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f1988F0;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f1989G0;

    /* renamed from: H0  reason: collision with root package name */
    public CharSequence f1990H0;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f1991I0;
    public int J0;

    /* renamed from: K0  reason: collision with root package name */
    public SearchableInfo f1992K0;

    /* renamed from: L0  reason: collision with root package name */
    public Bundle f1993L0;

    /* renamed from: M0  reason: collision with root package name */
    public final V f1994M0;

    /* renamed from: N0  reason: collision with root package name */
    public final V f1995N0;

    /* renamed from: O0  reason: collision with root package name */
    public final WeakHashMap f1996O0;

    /* renamed from: b0  reason: collision with root package name */
    public final SearchAutoComplete f1997b0;

    /* renamed from: c0  reason: collision with root package name */
    public final View f1998c0;

    /* renamed from: d0  reason: collision with root package name */
    public final View f1999d0;

    /* renamed from: e0  reason: collision with root package name */
    public final View f2000e0;

    /* renamed from: f0  reason: collision with root package name */
    public final ImageView f2001f0;

    /* renamed from: g0  reason: collision with root package name */
    public final ImageView f2002g0;

    /* renamed from: h0  reason: collision with root package name */
    public final ImageView f2003h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ImageView f2004i0;
    public final View j0;

    /* renamed from: k0  reason: collision with root package name */
    public e0 f2005k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Rect f2006l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Rect f2007m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int[] f2008n0;
    public final int[] o0;

    /* renamed from: p0  reason: collision with root package name */
    public final ImageView f2009p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Drawable f2010q0;

    /* renamed from: r0  reason: collision with root package name */
    public final int f2011r0;

    /* renamed from: s0  reason: collision with root package name */
    public final int f2012s0;

    /* renamed from: t0  reason: collision with root package name */
    public final Intent f2013t0;

    /* renamed from: u0  reason: collision with root package name */
    public final Intent f2014u0;

    /* renamed from: v0  reason: collision with root package name */
    public final CharSequence f2015v0;
    public View.OnFocusChangeListener w0;

    /* renamed from: x0  reason: collision with root package name */
    public View.OnClickListener f2016x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f2017y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2018z0;

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AbstractC0414m {

        /* renamed from: M  reason: collision with root package name */
        public int f2019M;

        /* renamed from: N  reason: collision with root package name */
        public SearchView f2020N;

        /* renamed from: O  reason: collision with root package name */
        public boolean f2021O;

        /* renamed from: P  reason: collision with root package name */
        public final c f2022P;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2022P = new c(this);
            this.f2019M = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int r12 = configuration.screenWidthDp;
            int r22 = configuration.screenHeightDp;
            if (r12 >= 960 && r22 >= 720 && configuration.orientation == 2) {
                return RecognitionOptions.QR_CODE;
            }
            if (r12 < 600) {
                if (r12 < 640 || r22 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f2019M > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // p.AbstractC0414m, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f2021O) {
                c cVar = this.f2022P;
                removeCallbacks(cVar);
                post(cVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z3, int r22, Rect rect) {
            super.onFocusChanged(z3, r22, rect);
            SearchView searchView = this.f2020N;
            searchView.u(searchView.f2018z0);
            searchView.post(searchView.f1994M0);
            if (searchView.f1997b0.hasFocus()) {
                searchView.j();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int r3, KeyEvent keyEvent) {
            if (r3 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f2020N.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(r3, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z3) {
            Method method;
            super.onWindowFocusChanged(z3);
            if (z3 && this.f2020N.hasFocus() && getVisibility() == 0) {
                this.f2021O = true;
                Context context = getContext();
                e eVar = SearchView.P0;
                if (context.getResources().getConfiguration().orientation == 2 && (method = SearchView.P0.f659c) != null) {
                    try {
                        method.invoke(this, Boolean.TRUE);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            c cVar = this.f2022P;
            if (!z3) {
                this.f2021O = false;
                removeCallbacks(cVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f2021O = false;
                removeCallbacks(cVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f2021O = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f2020N = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int r12) {
            super.setThreshold(r12);
            this.f2019M = r12;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [F2.e, java.lang.Object] */
    static {
        ?? obj = new Object();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
            obj.f657a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
            obj.f658b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            obj.f659c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
        P0 = obj;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f1987E0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f1987E0 = false;
    }

    public int getImeOptions() {
        return this.f1997b0.getImeOptions();
    }

    public int getInputType() {
        return this.f1997b0.getInputType();
    }

    public int getMaxWidth() {
        return this.f1988F0;
    }

    public CharSequence getQuery() {
        return this.f1997b0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1985C0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f1992K0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f1992K0.getHintId());
            }
            return this.f2015v0;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f2012s0;
    }

    public int getSuggestionRowLayout() {
        return this.f2011r0;
    }

    public l0.b getSuggestionsAdapter() {
        return this.f1983A0;
    }

    public final Intent h(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1990H0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1993L0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f1992K0.getSearchActivity());
        return intent;
    }

    public final Intent i(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int r10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1993L0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            r10 = searchableInfo.getVoiceMaxResults();
        } else {
            r10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", r10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void j() {
        int r02 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        if (r02 >= 29) {
            searchAutoComplete.refreshAutoCompleteResults();
            return;
        }
        e eVar = P0;
        Method method = eVar.f657a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        Method method2 = eVar.f658b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void k() {
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f2017y0) {
                clearFocus();
                u(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void l(int r7) {
        int r12;
        Uri parse;
        String h3;
        Cursor cursor = this.f1983A0.f4096L;
        if (cursor != null && cursor.moveToPosition(r7)) {
            Intent intent = null;
            try {
                int r22 = g0.f4604h0;
                String h4 = g0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h4 == null) {
                    h4 = this.f1992K0.getSuggestIntentAction();
                }
                if (h4 == null) {
                    h4 = "android.intent.action.SEARCH";
                }
                String h5 = g0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h5 == null) {
                    h5 = this.f1992K0.getSuggestIntentData();
                }
                if (h5 != null && (h3 = g0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h5 = h5 + "/" + Uri.encode(h3);
                }
                if (h5 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h5);
                }
                intent = h(h4, parse, g0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), g0.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e4) {
                try {
                    r12 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    r12 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + r12 + " returned exception.", e4);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e5) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e5);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void m(int r3) {
        Editable text = this.f1997b0.getText();
        Cursor cursor = this.f1983A0.f4096L;
        if (cursor != null) {
            if (cursor.moveToPosition(r3)) {
                String c4 = this.f1983A0.c(cursor);
                if (c4 != null) {
                    setQuery(c4);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void n(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1992K0 != null) {
                getContext().startActivity(h("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f1994M0);
        post(this.f1995N0);
        super.onDetachedFromWindow();
    }

    @Override // p.F, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int r6, int r7, int r8, int r9) {
        super.onLayout(z3, r6, r7, r8, r9);
        if (z3) {
            int[] r5 = this.f2008n0;
            SearchAutoComplete searchAutoComplete = this.f1997b0;
            searchAutoComplete.getLocationInWindow(r5);
            int[] r82 = this.o0;
            getLocationInWindow(r82);
            int r12 = r5[1] - r82[1];
            int r52 = r5[0] - r82[0];
            Rect rect = this.f2006l0;
            rect.set(r52, r12, searchAutoComplete.getWidth() + r52, searchAutoComplete.getHeight() + r12);
            int r53 = rect.left;
            int r83 = rect.right;
            int r92 = r9 - r7;
            Rect rect2 = this.f2007m0;
            rect2.set(r53, 0, r83, r92);
            e0 e0Var = this.f2005k0;
            if (e0Var == null) {
                e0 e0Var2 = new e0(rect2, rect, searchAutoComplete);
                this.f2005k0 = e0Var2;
                setTouchDelegate(e0Var2);
                return;
            }
            e0Var.f4591b.set(rect2);
            Rect rect3 = e0Var.f4593d;
            rect3.set(rect2);
            int r72 = -e0Var.f4594e;
            rect3.inset(r72, r72);
            e0Var.f4592c.set(rect);
        }
    }

    @Override // p.F, android.view.View
    public final void onMeasure(int r4, int r5) {
        int r02;
        if (this.f2018z0) {
            super.onMeasure(r4, r5);
            return;
        }
        int mode = View.MeasureSpec.getMode(r4);
        int size = View.MeasureSpec.getSize(r4);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (r02 = this.f1988F0) > 0) {
                    size = Math.min(r02, size);
                }
            } else {
                size = this.f1988F0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int r03 = this.f1988F0;
            size = r03 > 0 ? Math.min(r03, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(r5);
        int size2 = View.MeasureSpec.getSize(r5);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d0 d0Var = (d0) parcelable;
        super.onRestoreInstanceState(d0Var.f4117a);
        u(d0Var.f4589c);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, m0.b, p.d0] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? abstractC0351b = new AbstractC0351b(super.onSaveInstanceState());
        abstractC0351b.f4589c = this.f2018z0;
        return abstractC0351b;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        post(this.f1994M0);
    }

    public final void p() {
        int r12;
        int[] r02;
        boolean isEmpty = TextUtils.isEmpty(this.f1997b0.getText());
        if (isEmpty && (!this.f2017y0 || this.f1991I0)) {
            r12 = 8;
        } else {
            r12 = 0;
        }
        ImageView imageView = this.f2003h0;
        imageView.setVisibility(r12);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                r02 = ViewGroup.ENABLED_STATE_SET;
            } else {
                r02 = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(r02);
        }
    }

    public final void q() {
        int[] r02;
        if (this.f1997b0.hasFocus()) {
            r02 = ViewGroup.FOCUSED_STATE_SET;
        } else {
            r02 = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f1999d0.getBackground();
        if (background != null) {
            background.setState(r02);
        }
        Drawable background2 = this.f2000e0.getBackground();
        if (background2 != null) {
            background2.setState(r02);
        }
        invalidate();
    }

    public final void r() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z3 = this.f2017y0;
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        if (z3 && (drawable = this.f2010q0) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int r3, Rect rect) {
        if (this.f1987E0 || !isFocusable()) {
            return false;
        }
        if (!this.f2018z0) {
            boolean requestFocus = this.f1997b0.requestFocus(r3, rect);
            if (requestFocus) {
                u(false);
            }
            return requestFocus;
        }
        return super.requestFocus(r3, rect);
    }

    public final void s() {
        int r02;
        if ((this.f1984B0 || this.f1989G0) && !this.f2018z0 && (this.f2002g0.getVisibility() == 0 || this.f2004i0.getVisibility() == 0)) {
            r02 = 0;
        } else {
            r02 = 8;
        }
        this.f2000e0.setVisibility(r02);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1993L0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            k();
            return;
        }
        u(false);
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f2016x0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f2017y0 == z3) {
            return;
        }
        this.f2017y0 = z3;
        u(z3);
        r();
    }

    public void setImeOptions(int r22) {
        this.f1997b0.setImeOptions(r22);
    }

    public void setInputType(int r22) {
        this.f1997b0.setInputType(r22);
    }

    public void setMaxWidth(int r12) {
        this.f1988F0 = r12;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.w0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f2016x0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1985C0 = charSequence;
        r();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        int r3;
        this.f1986D0 = z3;
        l0.b bVar = this.f1983A0;
        if (bVar instanceof g0) {
            g0 g0Var = (g0) bVar;
            if (z3) {
                r3 = 2;
            } else {
                r3 = 1;
            }
            g0Var.f4613Z = r3;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int r3;
        this.f1992K0 = searchableInfo;
        Intent intent = null;
        boolean z3 = true;
        SearchAutoComplete searchAutoComplete = this.f1997b0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f1992K0.getImeOptions());
            int inputType = this.f1992K0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f1992K0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            l0.b bVar = this.f1983A0;
            if (bVar != null) {
                bVar.b(null);
            }
            if (this.f1992K0.getSuggestAuthority() != null) {
                g0 g0Var = new g0(getContext(), this, this.f1992K0, this.f1996O0);
                this.f1983A0 = g0Var;
                searchAutoComplete.setAdapter(g0Var);
                g0 g0Var2 = (g0) this.f1983A0;
                if (this.f1986D0) {
                    r3 = 2;
                } else {
                    r3 = 1;
                }
                g0Var2.f4613Z = r3;
            }
            r();
        }
        SearchableInfo searchableInfo2 = this.f1992K0;
        boolean z4 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f1992K0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f2013t0;
            } else if (this.f1992K0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f2014u0;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z3 = false;
                }
                z4 = z3;
            }
        }
        this.f1989G0 = z4;
        if (z4) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        u(this.f2018z0);
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f1984B0 = z3;
        u(this.f2018z0);
    }

    public void setSuggestionsAdapter(l0.b bVar) {
        this.f1983A0 = bVar;
        this.f1997b0.setAdapter(bVar);
    }

    public final void t(boolean z3) {
        int r22;
        boolean z4 = this.f1984B0;
        if (z4 && ((z4 || this.f1989G0) && !this.f2018z0 && hasFocus() && (z3 || !this.f1989G0))) {
            r22 = 0;
        } else {
            r22 = 8;
        }
        this.f2002g0.setVisibility(r22);
    }

    public final void u(boolean z3) {
        int r22;
        int r7;
        int r23;
        this.f2018z0 = z3;
        int r02 = 8;
        if (z3) {
            r22 = 0;
        } else {
            r22 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f1997b0.getText());
        this.f2001f0.setVisibility(r22);
        t(!isEmpty);
        if (z3) {
            r7 = 8;
        } else {
            r7 = 0;
        }
        this.f1998c0.setVisibility(r7);
        ImageView imageView = this.f2009p0;
        if (imageView.getDrawable() != null && !this.f2017y0) {
            r23 = 0;
        } else {
            r23 = 8;
        }
        imageView.setVisibility(r23);
        p();
        if (this.f1989G0 && !this.f2018z0 && isEmpty) {
            this.f2002g0.setVisibility(8);
            r02 = 0;
        }
        this.f2004i0.setVisibility(r02);
        s();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int r22) {
        super(context, attributeSet, r22);
        this.f2006l0 = new Rect();
        this.f2007m0 = new Rect();
        this.f2008n0 = new int[2];
        this.o0 = new int[2];
        this.f1994M0 = new V(this, 0);
        this.f1995N0 = new V(this, 1);
        this.f1996O0 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        Y y3 = new Y(this);
        Z z3 = new Z(this);
        G g = new G(1, this);
        U u3 = new U(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.f3399q, r22, 0);
        C0001b c0001b = new C0001b(context, obtainStyledAttributes);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(9, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f1997b0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1998c0 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f1999d0 = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f2000e0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f2001f0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f2002g0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f2003h0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f2004i0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f2009p0 = imageView5;
        Drawable E3 = c0001b.E(10);
        Field field = w.f3200a;
        findViewById.setBackground(E3);
        findViewById2.setBackground(c0001b.E(14));
        imageView.setImageDrawable(c0001b.E(13));
        imageView2.setImageDrawable(c0001b.E(7));
        imageView3.setImageDrawable(c0001b.E(4));
        imageView4.setImageDrawable(c0001b.E(16));
        imageView5.setImageDrawable(c0001b.E(13));
        this.f2010q0 = c0001b.E(12);
        I4.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f2011r0 = obtainStyledAttributes.getResourceId(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.f2012s0 = obtainStyledAttributes.getResourceId(5, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(u3);
        searchAutoComplete.setOnEditorActionListener(y3);
        searchAutoComplete.setOnItemClickListener(z3);
        searchAutoComplete.setOnItemSelectedListener(g);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new W(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(8, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f2015v0 = obtainStyledAttributes.getText(6);
        this.f1985C0 = obtainStyledAttributes.getText(11);
        int r3 = obtainStyledAttributes.getInt(3, -1);
        if (r3 != -1) {
            setImeOptions(r3);
        }
        int r32 = obtainStyledAttributes.getInt(2, -1);
        if (r32 != -1) {
            setInputType(r32);
        }
        setFocusable(obtainStyledAttributes.getBoolean(0, true));
        c0001b.S();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f2013t0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f2014u0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.j0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new X(this));
        }
        u(this.f2017y0);
        r();
    }

    public void setOnCloseListener(a0 a0Var) {
    }

    public void setOnQueryTextListener(b0 b0Var) {
    }

    public void setOnSuggestionListener(c0 c0Var) {
    }
}
