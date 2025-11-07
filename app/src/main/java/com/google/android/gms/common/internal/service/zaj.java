package com.google.android.gms.common.internal.service;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import u1.AbstractC0474b;

/* loaded from: classes.dex */
public abstract class zaj extends zab implements IInterface {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean v0(int r12, Parcel parcel, Parcel parcel2) {
        if (r12 == 1) {
            parcel.readInt();
            AbstractC0474b.b(parcel);
            return true;
        }
        return false;
    }
}
