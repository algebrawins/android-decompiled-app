package q2;

import A0.C0001b;
import d2.C0235c;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4825a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f4826b;

    /* renamed from: c  reason: collision with root package name */
    public final C0001b f4827c;

    /* renamed from: d  reason: collision with root package name */
    public n f4828d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4829e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4830f;

    public o(j2.b bVar, boolean z3) {
        C0001b c0001b = new C0001b(bVar, "flutter/restoration", r2.s.f4896a, 26);
        this.f4829e = false;
        this.f4830f = false;
        C0235c c0235c = new C0235c(20, this);
        this.f4827c = c0001b;
        this.f4825a = z3;
        c0001b.U(c0235c);
    }

    public static HashMap a(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }
}
