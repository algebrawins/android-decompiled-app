package h2;

import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Iterator;

/* renamed from: h2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0293e implements io.flutter.embedding.engine.renderer.o {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3318a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3319b;

    public /* synthetic */ C0293e(int r12, Object obj) {
        this.f3318a = r12;
        this.f3319b = obj;
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void a() {
        switch (this.f3318a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0295g c0295g = (C0295g) this.f3319b;
                c0295g.f3322a.getClass();
                c0295g.g = false;
                return;
            case 1:
                return;
            default:
                t tVar = (t) this.f3319b;
                tVar.f3361P = false;
                Iterator it = tVar.f3360O.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.o) it.next()).a();
                }
                return;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.o
    public final void b() {
        switch (this.f3318a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                C0295g c0295g = (C0295g) this.f3319b;
                AbstractActivityC0292d abstractActivityC0292d = c0295g.f3322a;
                if (Build.VERSION.SDK_INT >= 29) {
                    abstractActivityC0292d.reportFullyDrawn();
                } else {
                    abstractActivityC0292d.getClass();
                }
                c0295g.g = true;
                c0295g.f3328h = true;
                return;
            case 1:
                n nVar = (n) this.f3319b;
                nVar.setAlpha(1.0f);
                io.flutter.embedding.engine.renderer.n nVar2 = nVar.f3343L;
                if (nVar2 != null) {
                    nVar2.f3498a.removeIsDisplayingFlutterUiListener(this);
                    return;
                }
                return;
            default:
                t tVar = (t) this.f3319b;
                tVar.f3361P = true;
                Iterator it = tVar.f3360O.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.renderer.o) it.next()).b();
                }
                return;
        }
    }

    private final void c() {
    }
}
