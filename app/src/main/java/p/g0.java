package p;

import android.app.SearchManager;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.example.catering_inventory.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import l0.C0346a;

/* loaded from: classes.dex */
public final class g0 extends l0.b implements View.OnClickListener {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f4604h0 = 0;

    /* renamed from: R  reason: collision with root package name */
    public final int f4605R;

    /* renamed from: S  reason: collision with root package name */
    public final int f4606S;

    /* renamed from: T  reason: collision with root package name */
    public final LayoutInflater f4607T;

    /* renamed from: U  reason: collision with root package name */
    public final SearchView f4608U;

    /* renamed from: V  reason: collision with root package name */
    public final SearchableInfo f4609V;

    /* renamed from: W  reason: collision with root package name */
    public final Context f4610W;

    /* renamed from: X  reason: collision with root package name */
    public final WeakHashMap f4611X;

    /* renamed from: Y  reason: collision with root package name */
    public final int f4612Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f4613Z;
    public ColorStateList a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f4614b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f4615c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f4616d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f4617e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f4618f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f4619g0;

    public g0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f4095K = true;
        this.f4096L = null;
        this.f4094J = false;
        this.f4097M = context;
        this.f4098N = -1;
        this.f4099O = new h2.q(this);
        this.f4100P = new C0346a(0, this);
        this.f4606S = suggestionRowLayout;
        this.f4605R = suggestionRowLayout;
        this.f4607T = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f4613Z = 1;
        this.f4614b0 = -1;
        this.f4615c0 = -1;
        this.f4616d0 = -1;
        this.f4617e0 = -1;
        this.f4618f0 = -1;
        this.f4619g0 = -1;
        SearchManager searchManager = (SearchManager) this.f4097M.getSystemService("search");
        this.f4608U = searchView;
        this.f4609V = searchableInfo;
        this.f4612Y = searchView.getSuggestionCommitIconResId();
        this.f4610W = context;
        this.f4611X = weakHashMap;
    }

    public static String h(Cursor cursor, int r3) {
        if (r3 == -1) {
            return null;
        }
        try {
            return cursor.getString(r3);
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e4);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014b  */
    @Override // l0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g0.a(android.view.View, android.database.Cursor):void");
    }

    @Override // l0.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f4614b0 = cursor.getColumnIndex("suggest_text_1");
                this.f4615c0 = cursor.getColumnIndex("suggest_text_2");
                this.f4616d0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f4617e0 = cursor.getColumnIndex("suggest_icon_1");
                this.f4618f0 = cursor.getColumnIndex("suggest_icon_2");
                this.f4619g0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e4) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e4);
        }
    }

    @Override // l0.b
    public final String c(Cursor cursor) {
        String h3;
        String h4;
        if (cursor == null) {
            return null;
        }
        String h5 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h5 != null) {
            return h5;
        }
        SearchableInfo searchableInfo = this.f4609V;
        if (searchableInfo.shouldRewriteQueryFromData() && (h4 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h4;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h3 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h3;
    }

    @Override // l0.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f4607T.inflate(this.f4605R, viewGroup, false);
        inflate.setTag(new f0(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f4612Y);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f4097M.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.g0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f4097M.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // l0.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int r3, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(r3, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View inflate = this.f4607T.inflate(this.f4606S, viewGroup, false);
            if (inflate != null) {
                ((f0) inflate.getTag()).f4598a.setText(e4.toString());
            }
            return inflate;
        }
    }

    @Override // l0.b, android.widget.Adapter
    public final View getView(int r22, View view, ViewGroup viewGroup) {
        try {
            return super.getView(r22, view, viewGroup);
        } catch (RuntimeException e4) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e4);
            View d4 = d(viewGroup);
            ((f0) d4.getTag()).f4598a.setText(e4.toString());
            return d4;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f4096L;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f4096L;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f4608U.n((CharSequence) tag);
        }
    }
}
