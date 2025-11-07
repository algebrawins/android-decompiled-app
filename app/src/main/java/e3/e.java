package e3;

import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3109a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3110b;

    /* renamed from: c  reason: collision with root package name */
    public final Long f3111c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f3112d;

    /* renamed from: e  reason: collision with root package name */
    public final Long f3113e;

    /* renamed from: f  reason: collision with root package name */
    public final Long f3114f;
    public final Map g;

    public e(boolean z3, boolean z4, Long l3, Long l4, Long l5, Long l6) {
        C2.r rVar = C2.r.f273J;
        this.f3109a = z3;
        this.f3110b = z4;
        this.f3111c = l3;
        this.f3112d = l4;
        this.f3113e = l5;
        this.f3114f = l6;
        this.g = rVar;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f3109a) {
            arrayList.add("isRegularFile");
        }
        if (this.f3110b) {
            arrayList.add("isDirectory");
        }
        Long l3 = this.f3111c;
        if (l3 != null) {
            arrayList.add("byteCount=" + l3);
        }
        Long l4 = this.f3112d;
        if (l4 != null) {
            arrayList.add("createdAt=" + l4);
        }
        Long l5 = this.f3113e;
        if (l5 != null) {
            arrayList.add("lastModifiedAt=" + l5);
        }
        Long l6 = this.f3114f;
        if (l6 != null) {
            arrayList.add("lastAccessedAt=" + l6);
        }
        Map map = this.g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return C2.i.j(arrayList, ", ", "FileMetadata(", ")", null, 56);
    }
}
