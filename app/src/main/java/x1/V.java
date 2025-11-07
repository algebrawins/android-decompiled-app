package x1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class V implements I1.a {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5776a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5777b;

    /* renamed from: c  reason: collision with root package name */
    public final T f5778c;

    public V(HashMap hashMap, HashMap hashMap2, T t3) {
        this.f5776a = hashMap;
        this.f5777b = hashMap2;
        this.f5778c = t3;
    }

    @Override // I1.a
    public /* bridge */ /* synthetic */ I1.a a(Class cls, H1.d dVar) {
        this.f5776a.put(cls, dVar);
        this.f5777b.remove(cls);
        return this;
    }

    public byte[] b(P4 p4) {
        U u3;
        H1.d dVar;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            HashMap hashMap = this.f5776a;
            u3 = new U(byteArrayOutputStream, hashMap, this.f5777b, this.f5778c);
            dVar = (H1.d) hashMap.get(P4.class);
        } catch (IOException unused) {
        }
        if (dVar != null) {
            dVar.a(p4, u3);
            return byteArrayOutputStream.toByteArray();
        }
        throw new RuntimeException("No encoder for ".concat(String.valueOf(P4.class)));
    }

    public V() {
        this.f5776a = new HashMap();
        this.f5777b = new HashMap();
        this.f5778c = T.f5754c;
    }
}
