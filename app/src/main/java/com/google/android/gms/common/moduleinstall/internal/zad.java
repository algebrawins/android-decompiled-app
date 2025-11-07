package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import n1.C0393a;
import n1.b;
import n1.c;
import o1.d;
import u1.AbstractC0474b;

/* loaded from: classes.dex */
public abstract class zad extends zab implements d {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean v0(int r22, Parcel parcel, Parcel parcel2) {
        if (r22 != 1) {
            if (r22 != 2) {
                if (r22 != 3) {
                    if (r22 != 4) {
                        return false;
                    }
                    Status status = (Status) AbstractC0474b.a(parcel, Status.CREATOR);
                    AbstractC0474b.b(parcel);
                    throw new UnsupportedOperationException();
                }
                Status status2 = (Status) AbstractC0474b.a(parcel, Status.CREATOR);
                b bVar = (b) AbstractC0474b.a(parcel, b.CREATOR);
                AbstractC0474b.b(parcel);
                throw new UnsupportedOperationException();
            }
            AbstractC0474b.b(parcel);
            I((Status) AbstractC0474b.a(parcel, Status.CREATOR), (c) AbstractC0474b.a(parcel, c.CREATOR));
        } else {
            AbstractC0474b.b(parcel);
            n((Status) AbstractC0474b.a(parcel, Status.CREATOR), (C0393a) AbstractC0474b.a(parcel, C0393a.CREATOR));
        }
        return true;
    }
}
