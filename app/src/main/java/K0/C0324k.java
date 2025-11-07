package k0;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: k0.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324k extends View.BaseSavedState {
    public static final Parcelable.Creator<C0324k> CREATOR = new C0015q(13);

    /* renamed from: a  reason: collision with root package name */
    public int f3984a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3984a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r22) {
        super.writeToParcel(parcel, r22);
        parcel.writeInt(this.f3984a);
    }
}
