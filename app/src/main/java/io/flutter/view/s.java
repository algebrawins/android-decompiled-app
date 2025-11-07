package io.flutter.view;

import android.view.View;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final View f3769a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3770b;

    public s(View view, int r22) {
        this.f3769a = view;
        this.f3770b = r22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.f3770b == sVar.f3770b && this.f3769a.equals(sVar.f3769a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3769a.hashCode() + 31) * 31) + this.f3770b;
    }
}
