package io.flutter.plugins.imagepicker;

import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.J;
import java.util.ArrayList;
import x1.AbstractC0711t4;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3650a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f3651b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ J f3652c;

    public /* synthetic */ t(ArrayList arrayList, J j3, int r3) {
        this.f3650a = r3;
        this.f3651b = arrayList;
        this.f3652c = j3;
    }

    public final void a(RuntimeException runtimeException) {
        switch (this.f3650a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                this.f3652c.h(AbstractC0711t4.a(runtimeException));
                return;
            case 1:
                this.f3652c.h(AbstractC0711t4.a(runtimeException));
                return;
            default:
                this.f3652c.h(AbstractC0711t4.a(runtimeException));
                return;
        }
    }

    public final void b(ArrayList arrayList) {
        switch (this.f3650a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                ArrayList arrayList2 = this.f3651b;
                arrayList2.add(0, arrayList);
                this.f3652c.h(arrayList2);
                return;
            case 1:
                ArrayList arrayList3 = this.f3651b;
                arrayList3.add(0, arrayList);
                this.f3652c.h(arrayList3);
                return;
            default:
                ArrayList arrayList4 = this.f3651b;
                arrayList4.add(0, arrayList);
                this.f3652c.h(arrayList4);
                return;
        }
    }
}
