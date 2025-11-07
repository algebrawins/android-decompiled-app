package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import k1.InterfaceC0336d;

/* loaded from: classes.dex */
public class AccountAccessor extends IAccountAccessor$Stub {
    public static Account getAccountBinderSafe(InterfaceC0336d interfaceC0336d) {
        Account account = null;
        if (interfaceC0336d != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    account = interfaceC0336d.a();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    @Override // k1.InterfaceC0336d
    public final Account a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        throw null;
    }
}
