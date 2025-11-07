package r2;

import A0.C0001b;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;

/* renamed from: r2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4884a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4885b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4886c;

    public /* synthetic */ C0444a(int r12, Object obj, Object obj2) {
        this.f4884a = r12;
        this.f4886c = obj;
        this.f4885b = obj2;
    }

    @Override // r2.e
    public final void a(ByteBuffer byteBuffer) {
        switch (this.f4884a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                a1.i iVar = (a1.i) this.f4886c;
                try {
                    ((InterfaceC0446c) this.f4885b).h(((l) iVar.f1834L).a(byteBuffer));
                    return;
                } catch (RuntimeException e4) {
                    Log.e("BasicMessageChannel#" + ((String) iVar.f1833K), "Failed to handle message reply", e4);
                    return;
                }
            default:
                C0001b c0001b = (C0001b) this.f4886c;
                q2.n nVar = (q2.n) this.f4885b;
                try {
                    if (byteBuffer == null) {
                        nVar.getClass();
                    } else {
                        try {
                            nVar.c(((n) c0001b.f86M).c(byteBuffer));
                        } catch (i e5) {
                            nVar.a(e5.f4889J, e5.getMessage(), e5.f4890K);
                        }
                    }
                    return;
                } catch (RuntimeException e6) {
                    Log.e("MethodChannel#" + ((String) c0001b.f84K), "Failed to handle method call result", e6);
                    return;
                }
        }
    }
}
