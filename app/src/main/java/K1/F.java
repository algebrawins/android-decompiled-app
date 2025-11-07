package k1;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
public final class F implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ G f4007a;

    public /* synthetic */ F(G g) {
        this.f4007a = g;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int r12 = message.what;
        if (r12 != 0) {
            if (r12 != 1) {
                return false;
            }
            synchronized (this.f4007a.f4010a) {
                try {
                    D d4 = (D) message.obj;
                    E e4 = (E) this.f4007a.f4010a.get(d4);
                    if (e4 != null && e4.f4002b == 3) {
                        String valueOf = String.valueOf(d4);
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(valueOf), new Exception());
                        ComponentName componentName = e4.f4006f;
                        if (componentName == null) {
                            d4.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = d4.f3998b;
                            w.e(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        e4.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.f4007a.f4010a) {
            try {
                D d5 = (D) message.obj;
                E e5 = (E) this.f4007a.f4010a.get(d5);
                if (e5 != null && e5.f4001a.isEmpty()) {
                    if (e5.f4003c) {
                        e5.g.f4012c.removeMessages(1, e5.f4005e);
                        G g = e5.g;
                        g.f4013d.a(g.f4011b, e5);
                        e5.f4003c = false;
                        e5.f4002b = 2;
                    }
                    this.f4007a.f4010a.remove(d5);
                }
            } finally {
            }
        }
        return true;
    }
}
