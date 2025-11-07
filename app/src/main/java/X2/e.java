package X2;

import V2.InterfaceC0049e;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final k f1603a = new k(-1, null, null, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final int f1604b = a3.a.k("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c  reason: collision with root package name */
    public static final int f1605c = a3.a.k("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", ModuleDescriptor.MODULE_VERSION, 0, 0, 12);

    /* renamed from: d  reason: collision with root package name */
    public static final U1.b f1606d = new U1.b("BUFFERED", 1);

    /* renamed from: e  reason: collision with root package name */
    public static final U1.b f1607e = new U1.b("SHOULD_BUFFER", 1);

    /* renamed from: f  reason: collision with root package name */
    public static final U1.b f1608f = new U1.b("S_RESUMING_BY_RCV", 1);
    public static final U1.b g = new U1.b("RESUMING_BY_EB", 1);

    /* renamed from: h  reason: collision with root package name */
    public static final U1.b f1609h = new U1.b("POISONED", 1);

    /* renamed from: i  reason: collision with root package name */
    public static final U1.b f1610i = new U1.b("DONE_RCV", 1);

    /* renamed from: j  reason: collision with root package name */
    public static final U1.b f1611j = new U1.b("INTERRUPTED_SEND", 1);

    /* renamed from: k  reason: collision with root package name */
    public static final U1.b f1612k = new U1.b("INTERRUPTED_RCV", 1);

    /* renamed from: l  reason: collision with root package name */
    public static final U1.b f1613l = new U1.b("CHANNEL_CLOSED", 1);

    /* renamed from: m  reason: collision with root package name */
    public static final U1.b f1614m = new U1.b("SUSPEND", 1);

    /* renamed from: n  reason: collision with root package name */
    public static final U1.b f1615n = new U1.b("SUSPEND_NO_WAITER", 1);

    /* renamed from: o  reason: collision with root package name */
    public static final U1.b f1616o = new U1.b("FAILED", 1);

    /* renamed from: p  reason: collision with root package name */
    public static final U1.b f1617p = new U1.b("NO_RECEIVE_RESULT", 1);

    /* renamed from: q  reason: collision with root package name */
    public static final U1.b f1618q = new U1.b("CLOSE_HANDLER_CLOSED", 1);

    /* renamed from: r  reason: collision with root package name */
    public static final U1.b f1619r = new U1.b("CLOSE_HANDLER_INVOKED", 1);

    /* renamed from: s  reason: collision with root package name */
    public static final U1.b f1620s = new U1.b("NO_CLOSE_CAUSE", 1);

    public static final boolean a(InterfaceC0049e interfaceC0049e, Object obj, M2.l lVar) {
        U1.b m3 = interfaceC0049e.m(obj, lVar);
        if (m3 != null) {
            interfaceC0049e.o(m3);
            return true;
        }
        return false;
    }
}
