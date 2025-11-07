package y1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: y1.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0825g implements I1.a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f6381a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f6382b;

    /* renamed from: c  reason: collision with root package name */
    public final C0813e f6383c;

    public C0825g(HashMap hashMap, HashMap hashMap2, C0813e c0813e) {
        this.f6381a = hashMap;
        this.f6382b = hashMap2;
        this.f6383c = c0813e;
    }

    @Override // I1.a
    public /* bridge */ /* synthetic */ I1.a a(Class cls, H1.d dVar) {
        this.f6381a.put(cls, dVar);
        this.f6382b.remove(cls);
        return this;
    }

    public byte[] b(C0865n3 c0865n3) {
        C0819f c0819f;
        H1.d dVar;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap hashMap = this.f6381a;
            c0819f = new C0819f(byteArrayOutputStream, hashMap, this.f6382b, this.f6383c);
            dVar = (H1.d) hashMap.get(C0865n3.class);
        } catch (IOException unused) {
        }
        if (dVar != null) {
            dVar.a(c0865n3, c0819f);
            return byteArrayOutputStream.toByteArray();
        }
        throw new RuntimeException("No encoder for ".concat(String.valueOf(C0865n3.class)));
    }

    public C0825g() {
        this.f6381a = new HashMap();
        this.f6382b = new HashMap();
        this.f6383c = C0813e.f6365c;
    }
}
