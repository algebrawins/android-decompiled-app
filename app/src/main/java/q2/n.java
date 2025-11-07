package q2;

import A0.C0001b;
import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.J;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4822a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4823b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4824c;

    public /* synthetic */ n(int r12, Object obj, Object obj2) {
        this.f4822a = r12;
        this.f4824c = obj;
        this.f4823b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f4822a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                return;
            default:
                ((j2.g) this.f4823b).a(((r2.n) ((C0001b) ((J) this.f4824c).f3304L).f86M).f(str, str2, obj));
                return;
        }
    }

    public void b() {
        ((j2.g) this.f4823b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f4822a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ((o) this.f4824c).f4826b = (byte[]) this.f4823b;
                return;
            default:
                ((j2.g) this.f4823b).a(((r2.n) ((C0001b) ((J) this.f4824c).f3304L).f86M).a(obj));
                return;
        }
    }
}
