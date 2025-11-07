package y1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.charset.Charset;
import java.util.Map;

/* renamed from: y1.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0813e implements H1.d {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ C0813e f6364b = new C0813e(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ C0813e f6365c = new C0813e(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6366a;

    public /* synthetic */ C0813e(int r12) {
        this.f6366a = r12;
    }

    @Override // H1.a
    public final void a(Object obj, Object obj2) {
        switch (this.f6366a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Map.Entry entry = (Map.Entry) obj;
                H1.e eVar = (H1.e) obj2;
                Charset charset = C0819f.f6370f;
                eVar.d(C0819f.g, entry.getKey());
                eVar.d(C0819f.f6371h, entry.getValue());
                return;
            default:
                throw new RuntimeException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
