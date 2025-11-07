package m1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import h1.C0283c;
import k1.m;
import u1.AbstractC0473a;
import u1.AbstractC0475c;

/* loaded from: classes.dex */
public final class c extends com.google.android.gms.common.internal.a {

    /* renamed from: y  reason: collision with root package name */
    public final m f4119y;

    public c(Context context, Looper looper, V0.a aVar, m mVar, j1.m mVar2, j1.m mVar3) {
        super(context, looper, 270, aVar, mVar2, mVar3);
        this.f4119y = mVar;
    }

    @Override // i1.c
    public final int l() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        if (queryLocalInterface instanceof C0352a) {
            return (C0352a) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final C0283c[] o() {
        return AbstractC0475c.f5027b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        m mVar = this.f4119y;
        mVar.getClass();
        Bundle bundle = new Bundle();
        String str = mVar.f4060b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
