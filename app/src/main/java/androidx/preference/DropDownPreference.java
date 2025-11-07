package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.example.catering_inventory.R;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: S  reason: collision with root package name */
    public final ArrayAdapter f2494S;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.f2494S = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f2495Q;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void b() {
        ArrayAdapter arrayAdapter = this.f2494S;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
