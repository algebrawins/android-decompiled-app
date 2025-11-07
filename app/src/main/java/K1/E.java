package k1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class E implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4001a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f4002b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4003c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f4004d;

    /* renamed from: e  reason: collision with root package name */
    public final D f4005e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f4006f;
    public final /* synthetic */ G g;

    public E(G g, D d4) {
        this.g = g;
        this.f4005e = d4;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066 A[Catch: all -> 0x007d, TryCatch #2 {all -> 0x007d, blocks: (B:5:0x001d, B:13:0x005e, B:14:0x0062, B:16:0x0066, B:19:0x007f, B:20:0x0082, B:8:0x0037, B:9:0x0040, B:12:0x0056), top: B:31:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #2 {all -> 0x007d, blocks: (B:5:0x001d, B:13:0x005e, B:14:0x0062, B:16:0x0066, B:19:0x007f, B:20:0x0082, B:8:0x0037, B:9:0x0040, B:12:0x0056), top: B:31:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r7) {
        /*
            r6 = this;
            r7 = 3
            r6.f4002b = r7
            android.os.StrictMode$VmPolicy r7 = android.os.StrictMode.getVmPolicy()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L1d
            android.os.StrictMode$VmPolicy$Builder r0 = new android.os.StrictMode$VmPolicy$Builder
            r0.<init>(r7)
            android.os.StrictMode$VmPolicy$Builder r0 = Q0.b.c(r0)
            android.os.StrictMode$VmPolicy r0 = r0.build()
            android.os.StrictMode.setVmPolicy(r0)
        L1d:
            k1.G r0 = r6.g     // Catch: java.lang.Throwable -> L7d
            p1.a r1 = r0.f4013d     // Catch: java.lang.Throwable -> L7d
            android.content.Context r0 = r0.f4011b     // Catch: java.lang.Throwable -> L7d
            k1.D r2 = r6.f4005e     // Catch: java.lang.Throwable -> L7d
            android.content.Intent r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L7d
            k1.D r3 = r6.f4005e     // Catch: java.lang.Throwable -> L7d
            int r3 = r3.f3999c     // Catch: java.lang.Throwable -> L7d
            r1.getClass()     // Catch: java.lang.Throwable -> L7d
            android.content.ComponentName r1 = r2.getComponent()     // Catch: java.lang.Throwable -> L7d
            if (r1 != 0) goto L37
            goto L5e
        L37:
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r4 = "com.google.android.gms"
            r4.equals(r1)     // Catch: java.lang.Throwable -> L7d
            F1.c r4 = r1.C0443a.a(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e java.lang.Throwable -> L7d
            android.content.Context r4 = r4.f620a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e java.lang.Throwable -> L7d
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e java.lang.Throwable -> L7d
            r5 = 0
            android.content.pm.ApplicationInfo r1 = r4.getApplicationInfo(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e java.lang.Throwable -> L7d
            int r1 = r1.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5e java.lang.Throwable -> L7d
            r4 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r4
            if (r1 == 0) goto L5e
            java.lang.String r0 = "Attempted to bind to a service in a STOPPED package."
            java.lang.String r1 = "ConnectionTracker"
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L7d
            goto L62
        L5e:
            boolean r5 = r0.bindService(r2, r6, r3)     // Catch: java.lang.Throwable -> L7d
        L62:
            r6.f4003c = r5     // Catch: java.lang.Throwable -> L7d
            if (r5 == 0) goto L7f
            k1.G r0 = r6.g     // Catch: java.lang.Throwable -> L7d
            u1.e r0 = r0.f4012c     // Catch: java.lang.Throwable -> L7d
            k1.D r1 = r6.f4005e     // Catch: java.lang.Throwable -> L7d
            r2 = 1
            android.os.Message r0 = r0.obtainMessage(r2, r1)     // Catch: java.lang.Throwable -> L7d
            k1.G r1 = r6.g     // Catch: java.lang.Throwable -> L7d
            u1.e r1 = r1.f4012c     // Catch: java.lang.Throwable -> L7d
            k1.G r2 = r6.g     // Catch: java.lang.Throwable -> L7d
            long r2 = r2.f4015f     // Catch: java.lang.Throwable -> L7d
            r1.sendMessageDelayed(r0, r2)     // Catch: java.lang.Throwable -> L7d
            goto L8b
        L7d:
            r0 = move-exception
            goto L8f
        L7f:
            r0 = 2
            r6.f4002b = r0     // Catch: java.lang.Throwable -> L7d
            k1.G r0 = r6.g     // Catch: java.lang.Throwable -> L7d java.lang.IllegalArgumentException -> L8b
            p1.a r1 = r0.f4013d     // Catch: java.lang.Throwable -> L7d java.lang.IllegalArgumentException -> L8b
            android.content.Context r0 = r0.f4011b     // Catch: java.lang.Throwable -> L7d java.lang.IllegalArgumentException -> L8b
            r1.a(r0, r6)     // Catch: java.lang.Throwable -> L7d java.lang.IllegalArgumentException -> L8b
        L8b:
            android.os.StrictMode.setVmPolicy(r7)
            return
        L8f:
            android.os.StrictMode.setVmPolicy(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.E.a(java.lang.String):void");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.f4010a) {
            try {
                this.g.f4012c.removeMessages(1, this.f4005e);
                this.f4004d = iBinder;
                this.f4006f = componentName;
                for (ServiceConnection serviceConnection : this.f4001a.values()) {
                    serviceConnection.onServiceConnected(componentName, iBinder);
                }
                this.f4002b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.f4010a) {
            try {
                this.g.f4012c.removeMessages(1, this.f4005e);
                this.f4004d = null;
                this.f4006f = componentName;
                for (ServiceConnection serviceConnection : this.f4001a.values()) {
                    serviceConnection.onServiceDisconnected(componentName);
                }
                this.f4002b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
