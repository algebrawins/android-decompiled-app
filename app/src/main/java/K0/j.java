package K0;

import android.content.Context;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import q0.C0431b;

/* loaded from: classes.dex */
public final class j extends N2.h implements M2.a {

    /* renamed from: K  reason: collision with root package name */
    public final /* synthetic */ int f837K;

    /* renamed from: L  reason: collision with root package name */
    public final /* synthetic */ Object f838L;

    /* renamed from: M  reason: collision with root package name */
    public final /* synthetic */ Object f839M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int r12, Object obj, Object obj2) {
        super(0);
        this.f837K = r12;
        this.f838L = obj;
        this.f839M = obj2;
    }

    @Override // M2.a
    public final Object a() {
        switch (this.f837K) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((L0.a) ((b) this.f838L).f821K).b((i) this.f839M);
                return B2.i.f210a;
            default:
                ((C0431b) this.f839M).getClass();
                String concat = "FlutterSharedPreferences".concat(".preferences_pb");
                N2.g.e(concat, "fileName");
                return new File(((Context) this.f838L).getApplicationContext().getFilesDir(), "datastore/".concat(concat));
        }
    }
}
