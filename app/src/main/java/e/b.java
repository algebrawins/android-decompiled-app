package E;

import A.f;
import D.T;
import com.google.android.libraries.barhopper.RecognitionOptions;
import e0.InterfaceC0247a;
import x1.AbstractC0612g0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements InterfaceC0247a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f499a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f500b;

    public /* synthetic */ b(f fVar, int r22) {
        this.f499a = r22;
        this.f500b = fVar;
    }

    @Override // e0.InterfaceC0247a
    public final void accept(Object obj) {
        switch (this.f499a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                if (obj == null) {
                    this.f500b.v();
                    throw null;
                }
                throw new ClassCastException();
            case 1:
                if (obj == null) {
                    this.f500b.v();
                    throw null;
                }
                throw new ClassCastException();
            default:
                T t3 = (T) obj;
                this.f500b.getClass();
                AbstractC0612g0.a();
                return;
        }
    }

    public /* synthetic */ b(f fVar, A.c cVar) {
        this.f499a = 1;
        this.f500b = fVar;
    }
}
