package p;

import android.content.Context;
import android.view.View;
import com.example.catering_inventory.R;
import com.google.android.libraries.barhopper.RecognitionOptions;
import k0.C0322i;

/* renamed from: p.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0408f extends o.n {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f4596l = 1;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ i f4597m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408f(i iVar, Context context, o.j jVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, jVar, true);
        this.f4597m = iVar;
        this.f4461f = 8388613;
        C0322i c0322i = iVar.f4641e0;
        this.f4462h = c0322i;
        o.l lVar = this.f4463i;
        if (lVar != null) {
            lVar.b(c0322i);
        }
    }

    @Override // o.n
    public final void c() {
        switch (this.f4596l) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                i iVar = this.f4597m;
                iVar.f4638b0 = null;
                iVar.getClass();
                super.c();
                return;
            default:
                i iVar2 = this.f4597m;
                o.j jVar = iVar2.f4623L;
                if (jVar != null) {
                    jVar.c(true);
                }
                iVar2.a0 = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408f(i iVar, Context context, o.t tVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, tVar, false);
        this.f4597m = iVar;
        if (!tVar.f4485w.d()) {
            View view2 = iVar.f4628Q;
            this.f4460e = view2 == null ? iVar.f4627P : view2;
        }
        C0322i c0322i = iVar.f4641e0;
        this.f4462h = c0322i;
        o.l lVar = this.f4463i;
        if (lVar != null) {
            lVar.b(c0322i);
        }
    }
}
