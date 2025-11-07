package p0;

import d2.C0235c;
import e3.l;
import java.util.concurrent.atomic.AtomicBoolean;
import n0.InterfaceC0368a;

/* loaded from: classes.dex */
public class b implements InterfaceC0368a {

    /* renamed from: a  reason: collision with root package name */
    public final e3.i f4750a;

    /* renamed from: b  reason: collision with root package name */
    public final l f4751b;

    /* renamed from: c  reason: collision with root package name */
    public final C0235c f4752c;

    public b(e3.i iVar, l lVar) {
        N2.g.e(iVar, "fileSystem");
        N2.g.e(lVar, "path");
        this.f4750a = iVar;
        this.f4751b = lVar;
        this.f4752c = new C0235c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(4:11|12|(2:20|21)|(2:15|16)(1:18))(2:24|25))(3:26|27|28))(2:46|(5:50|51|52|53|(1:55)(1:56))(2:48|49))|(2:35|36)|30|(2:32|33)(1:34)))|78|6|7|(0)(0)|(0)|30|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c7, code lost:
        if (r8 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00c9, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ce, code lost:
        G.i.a(r9, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d1, code lost:
        r6 = r9;
        r9 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0098 A[Catch: FileNotFoundException -> 0x0091, TryCatch #9 {FileNotFoundException -> 0x0091, blocks: (B:48:0x0098, B:49:0x009c, B:41:0x0088), top: B:89:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009c A[Catch: FileNotFoundException -> 0x0091, TRY_LEAVE, TryCatch #9 {FileNotFoundException -> 0x0091, blocks: (B:48:0x0098, B:49:0x009c, B:41:0x0088), top: B:89:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0, types: [p0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(p0.b r8, F2.b r9) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.b.a(p0.b, F2.b):java.lang.Object");
    }

    @Override // n0.InterfaceC0368a
    public final void close() {
        ((AtomicBoolean) this.f4752c.f3003K).set(true);
    }
}
