package o1;

import android.os.IBinder;
import android.os.IInterface;
import h1.C0283c;
import u1.AbstractC0473a;
import u1.AbstractC0475c;

/* loaded from: classes.dex */
public final class h extends com.google.android.gms.common.internal.a {
    @Override // i1.c
    public final int l() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new AbstractC0473a(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService", 0);
    }

    @Override // com.google.android.gms.common.internal.a
    public final C0283c[] o() {
        return AbstractC0475c.f5029d;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
