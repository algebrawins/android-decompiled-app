package j2;

import A0.C0001b;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import d2.C0235c;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.Y;
import y2.AbstractC0938a;

/* loaded from: classes.dex */
public final class j implements r2.f, k {

    /* renamed from: J  reason: collision with root package name */
    public final FlutterJNI f3884J;

    /* renamed from: K  reason: collision with root package name */
    public final HashMap f3885K;

    /* renamed from: L  reason: collision with root package name */
    public final HashMap f3886L;

    /* renamed from: M  reason: collision with root package name */
    public final Object f3887M;

    /* renamed from: N  reason: collision with root package name */
    public final AtomicBoolean f3888N;

    /* renamed from: O  reason: collision with root package name */
    public final HashMap f3889O;

    /* renamed from: P  reason: collision with root package name */
    public int f3890P;

    /* renamed from: Q  reason: collision with root package name */
    public final l f3891Q;

    /* renamed from: R  reason: collision with root package name */
    public final WeakHashMap f3892R;

    /* renamed from: S  reason: collision with root package name */
    public final C0235c f3893S;

    public j(FlutterJNI flutterJNI) {
        C0235c c0235c = new C0235c(6);
        c0235c.f3003K = (ExecutorService) C0001b.L().f86M;
        this.f3885K = new HashMap();
        this.f3886L = new HashMap();
        this.f3887M = new Object();
        this.f3888N = new AtomicBoolean(false);
        this.f3889O = new HashMap();
        this.f3890P = 1;
        this.f3891Q = new l();
        this.f3892R = new WeakHashMap();
        this.f3884J = flutterJNI;
        this.f3893S = c0235c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [j2.c] */
    public final void a(final String str, final f fVar, final ByteBuffer byteBuffer, final int r18, final long j3) {
        e eVar;
        if (fVar != null) {
            eVar = fVar.f3875b;
        } else {
            eVar = null;
        }
        String a4 = AbstractC0938a.a("PlatformChannel ScheduleHandler on " + str);
        if (Build.VERSION.SDK_INT >= 29) {
            D0.a.a(Y.b(a4), r18);
        } else {
            String b3 = Y.b(a4);
            try {
                if (Y.f5806c == null) {
                    Y.f5806c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
                }
                Y.f5806c.invoke(null, Long.valueOf(Y.f5804a), b3, Integer.valueOf(r18));
            } catch (Exception e4) {
                Y.a("asyncTraceBegin", e4);
            }
        }
        ?? r02 = new Runnable() { // from class: j2.c
            @Override // java.lang.Runnable
            public final void run() {
                long j4 = j3;
                FlutterJNI flutterJNI = j.this.f3884J;
                StringBuilder sb = new StringBuilder("PlatformChannel ScheduleHandler on ");
                String str2 = str;
                sb.append(str2);
                String a5 = AbstractC0938a.a(sb.toString());
                int r10 = Build.VERSION.SDK_INT;
                int r12 = r18;
                if (r10 >= 29) {
                    D0.a.b(Y.b(a5), r12);
                } else {
                    String b4 = Y.b(a5);
                    try {
                        if (Y.f5807d == null) {
                            Y.f5807d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                        }
                        Y.f5807d.invoke(null, Long.valueOf(Y.f5804a), b4, Integer.valueOf(r12));
                    } catch (Exception e5) {
                        Y.a("asyncTraceEnd", e5);
                    }
                }
                try {
                    AbstractC0938a.b("DartMessenger#handleMessageFromDart on " + str2);
                    f fVar2 = fVar;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    if (fVar2 != null) {
                        try {
                            try {
                                fVar2.f3874a.o(byteBuffer2, new g(flutterJNI, r12));
                            } catch (Exception e6) {
                                Log.e("DartMessenger", "Uncaught exception in binary message listener", e6);
                                flutterJNI.invokePlatformMessageEmptyResponseCallback(r12);
                            }
                        } catch (Error e7) {
                            Thread currentThread = Thread.currentThread();
                            if (currentThread.getUncaughtExceptionHandler() != null) {
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, e7);
                            } else {
                                throw e7;
                            }
                        }
                    } else {
                        flutterJNI.invokePlatformMessageEmptyResponseCallback(r12);
                    }
                    if (byteBuffer2 != null && byteBuffer2.isDirect()) {
                        byteBuffer2.limit(0);
                    }
                    Trace.endSection();
                } finally {
                    flutterJNI.cleanupMessageData(j4);
                }
            }
        };
        if (eVar == null) {
            eVar = this.f3891Q;
        }
        eVar.a(r02);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [R1.a, java.lang.Object] */
    public final R1.a b(r2.k kVar) {
        C0235c c0235c = this.f3893S;
        c0235c.getClass();
        i iVar = new i((ExecutorService) c0235c.f3003K);
        ?? obj = new Object();
        this.f3892R.put(obj, iVar);
        return obj;
    }

    @Override // r2.f
    public final void d(String str, r2.d dVar, R1.a aVar) {
        e eVar;
        if (dVar == null) {
            synchronized (this.f3887M) {
                this.f3885K.remove(str);
            }
            return;
        }
        if (aVar != null) {
            eVar = (e) this.f3892R.get(aVar);
            if (eVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            eVar = null;
        }
        synchronized (this.f3887M) {
            try {
                this.f3885K.put(str, new f(dVar, eVar));
                List<d> list = (List) this.f3886L.remove(str);
                if (list == null) {
                    return;
                }
                for (d dVar2 : list) {
                    a(str, (f) this.f3885K.get(str), dVar2.f3871a, dVar2.f3872b, dVar2.f3873c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r2.f
    public final void e(String str, r2.d dVar) {
        d(str, dVar, null);
    }

    @Override // r2.f
    public final void h(String str, ByteBuffer byteBuffer) {
        i(str, byteBuffer, null);
    }

    @Override // r2.f
    public final void i(String str, ByteBuffer byteBuffer, r2.e eVar) {
        AbstractC0938a.b("DartMessenger#send on " + str);
        try {
            int r02 = this.f3890P;
            this.f3890P = r02 + 1;
            if (eVar != null) {
                this.f3889O.put(Integer.valueOf(r02), eVar);
            }
            FlutterJNI flutterJNI = this.f3884J;
            if (byteBuffer == null) {
                flutterJNI.dispatchEmptyPlatformMessage(str, r02);
            } else {
                flutterJNI.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), r02);
            }
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [R1.a, java.lang.Object] */
    @Override // r2.f
    public final R1.a j() {
        C0235c c0235c = this.f3893S;
        c0235c.getClass();
        i iVar = new i((ExecutorService) c0235c.f3003K);
        ?? obj = new Object();
        this.f3892R.put(obj, iVar);
        return obj;
    }
}
