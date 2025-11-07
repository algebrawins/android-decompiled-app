package t0;

import android.util.Log;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.Writer;

/* loaded from: classes.dex */
public final class j extends Writer {

    /* renamed from: K  reason: collision with root package name */
    public final StringBuilder f5006K = new StringBuilder((int) RecognitionOptions.ITF);

    /* renamed from: J  reason: collision with root package name */
    public final String f5005J = "FragmentManager";

    public final void a() {
        StringBuilder sb = this.f5006K;
        if (sb.length() > 0) {
            Log.d(this.f5005J, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int r5, int r6) {
        for (int r02 = 0; r02 < r6; r02++) {
            char c4 = cArr[r5 + r02];
            if (c4 == '\n') {
                a();
            } else {
                this.f5006K.append(c4);
            }
        }
    }
}
