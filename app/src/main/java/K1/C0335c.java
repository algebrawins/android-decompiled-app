package k1;

import A0.C0015q;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.AccountAccessor;
import com.google.android.gms.common.internal.IAccountAccessor$Stub;
import h1.C0283c;
import l1.AbstractC0347a;

/* renamed from: k1.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335c extends AbstractC0347a {
    public static final Parcelable.Creator<C0335c> CREATOR = new C0015q(22);

    /* renamed from: o  reason: collision with root package name */
    public static final Scope[] f4023o = new Scope[0];

    /* renamed from: p  reason: collision with root package name */
    public static final C0283c[] f4024p = new C0283c[0];

    /* renamed from: a  reason: collision with root package name */
    public final int f4025a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4026b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4027c;

    /* renamed from: d  reason: collision with root package name */
    public String f4028d;

    /* renamed from: e  reason: collision with root package name */
    public IBinder f4029e;

    /* renamed from: f  reason: collision with root package name */
    public Scope[] f4030f;
    public Bundle g;

    /* renamed from: h  reason: collision with root package name */
    public Account f4031h;

    /* renamed from: i  reason: collision with root package name */
    public C0283c[] f4032i;

    /* renamed from: j  reason: collision with root package name */
    public C0283c[] f4033j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4034k;

    /* renamed from: l  reason: collision with root package name */
    public final int f4035l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f4036m;

    /* renamed from: n  reason: collision with root package name */
    public final String f4037n;

    public C0335c(int r22, int r3, int r4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0283c[] c0283cArr, C0283c[] c0283cArr2, boolean z3, int r13, boolean z4, String str2) {
        Account account2;
        scopeArr = scopeArr == null ? f4023o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        C0283c[] c0283cArr3 = f4024p;
        c0283cArr = c0283cArr == null ? c0283cArr3 : c0283cArr;
        c0283cArr2 = c0283cArr2 == null ? c0283cArr3 : c0283cArr2;
        this.f4025a = r22;
        this.f4026b = r3;
        this.f4027c = r4;
        if ("com.google.android.gms".equals(str)) {
            this.f4028d = "com.google.android.gms";
        } else {
            this.f4028d = str;
        }
        if (r22 < 2) {
            if (iBinder != null) {
                account2 = AccountAccessor.getAccountBinderSafe(IAccountAccessor$Stub.asInterface(iBinder));
            } else {
                account2 = null;
            }
            this.f4031h = account2;
        } else {
            this.f4029e = iBinder;
            this.f4031h = account;
        }
        this.f4030f = scopeArr;
        this.g = bundle;
        this.f4032i = c0283cArr;
        this.f4033j = c0283cArr2;
        this.f4034k = z3;
        this.f4035l = r13;
        this.f4036m = z4;
        this.f4037n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r22) {
        C0015q.a(this, parcel, r22);
    }
}
