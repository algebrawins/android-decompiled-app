package x1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class T implements H1.d {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ T f5753b = new T(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ T f5754c = new T(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5755a;

    public /* synthetic */ T(int r12) {
        this.f5755a = r12;
    }

    @Override // H1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f5755a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                H1.e eVar = (H1.e) obj2;
                Charset charset = U.f5763f;
                eVar.d(U.g, entry.getKey());
                eVar.d(U.f5764h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
