package B1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i1.h;
import u1.AbstractC0473a;

/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.a implements i1.c {

    /* renamed from: A  reason: collision with root package name */
    public final Bundle f186A;

    /* renamed from: B  reason: collision with root package name */
    public final Integer f187B;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f188y;

    /* renamed from: z  reason: collision with root package name */
    public final V0.a f189z;

    public a(Context context, Looper looper, V0.a aVar, Bundle bundle, i1.g gVar, h hVar) {
        super(context, looper, 44, aVar, gVar, hVar);
        this.f188y = true;
        this.f189z = aVar;
        this.f186A = bundle;
        this.f187B = (Integer) aVar.f1357K;
    }

    @Override // com.google.android.gms.common.internal.a, i1.c
    public final boolean k() {
        return this.f188y;
    }

    @Override // i1.c
    public final int l() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof d) {
            return (d) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        V0.a aVar = this.f189z;
        boolean equals = this.f2742c.getPackageName().equals((String) aVar.f1356J);
        Bundle bundle = this.f186A;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) aVar.f1356J);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.signin.service.START";
    }
}
