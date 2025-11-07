package c0;

import android.content.Context;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class c implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2639a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f2640b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f2641c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ E.c f2642d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f2643e;

    public /* synthetic */ c(String str, Context context, E.c cVar, int r4, int r5) {
        this.f2639a = r5;
        this.f2640b = str;
        this.f2641c = context;
        this.f2642d = cVar;
        this.f2643e = r4;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2639a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return e.a(this.f2640b, this.f2641c, this.f2642d, this.f2643e);
            default:
                try {
                    return e.a(this.f2640b, this.f2641c, this.f2642d, this.f2643e);
                } catch (Throwable unused) {
                    return new d(-3);
                }
        }
    }
}
