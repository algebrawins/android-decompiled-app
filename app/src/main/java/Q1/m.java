package Q1;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes.dex */
public final class m extends PhantomReference {

    /* renamed from: a  reason: collision with root package name */
    public final Set f1088a;

    /* renamed from: b  reason: collision with root package name */
    public final l f1089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(a aVar, ReferenceQueue referenceQueue, Set set) {
        super(aVar, referenceQueue);
        l lVar = l.f1087J;
        this.f1088a = set;
        this.f1089b = lVar;
    }
}
