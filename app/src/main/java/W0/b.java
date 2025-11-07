package W0;

import D.C;
import android.content.Context;
import d1.InterfaceC0232a;

/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1485a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0232a f1486b;

    /* renamed from: c  reason: collision with root package name */
    public final InterfaceC0232a f1487c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1488d;

    public b(Context context, InterfaceC0232a interfaceC0232a, InterfaceC0232a interfaceC0232a2, String str) {
        if (context != null) {
            this.f1485a = context;
            if (interfaceC0232a != null) {
                this.f1486b = interfaceC0232a;
                if (interfaceC0232a2 != null) {
                    this.f1487c = interfaceC0232a2;
                    if (str != null) {
                        this.f1488d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1485a.equals(((b) dVar).f1485a)) {
            b bVar = (b) dVar;
            if (this.f1486b.equals(bVar.f1486b) && this.f1487c.equals(bVar.f1487c) && this.f1488d.equals(bVar.f1488d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f1485a.hashCode() ^ 1000003) * 1000003) ^ this.f1486b.hashCode()) * 1000003) ^ this.f1487c.hashCode()) * 1000003) ^ this.f1488d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f1485a);
        sb.append(", wallClock=");
        sb.append(this.f1486b);
        sb.append(", monotonicClock=");
        sb.append(this.f1487c);
        sb.append(", backendName=");
        return C.z(sb, this.f1488d, "}");
    }
}
