package com.google.android.gms.common.api;

import A0.C0015q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import k1.w;
import l1.AbstractC0347a;
import x1.G4;

/* loaded from: classes.dex */
public final class Scope extends AbstractC0347a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0015q(11);

    /* renamed from: a  reason: collision with root package name */
    public final int f2724a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2725b;

    public Scope(String str, int r3) {
        w.d(str, "scopeUri must not be null or empty");
        this.f2724a = r3;
        this.f2725b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f2725b.equals(((Scope) obj).f2725b);
    }

    public final int hashCode() {
        return this.f2725b.hashCode();
    }

    public final String toString() {
        return this.f2725b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r4) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2724a);
        G4.c(parcel, 2, this.f2725b);
        G4.h(parcel, g);
    }
}
