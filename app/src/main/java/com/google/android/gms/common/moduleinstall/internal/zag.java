package com.google.android.gms.common.moduleinstall.internal;

import D.C;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import n1.d;
import u1.AbstractC0474b;

/* loaded from: classes.dex */
public abstract class zag extends zab implements IInterface {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean v0(int r12, Parcel parcel, Parcel parcel2) {
        if (r12 != 1) {
            return false;
        }
        d dVar = (d) AbstractC0474b.a(parcel, d.CREATOR);
        AbstractC0474b.b(parcel);
        C.G(this);
        throw null;
    }
}
