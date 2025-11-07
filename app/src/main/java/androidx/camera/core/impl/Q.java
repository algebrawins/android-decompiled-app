package androidx.camera.core.impl;

import android.util.Size;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class Q implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2150a;

    public /* synthetic */ Q(int r12) {
        this.f2150a = r12;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2150a) {
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                return ((C0076c) obj).f2176a.compareTo(((C0076c) obj2).f2176a);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int r12 = 0; r12 < bArr.length; r12++) {
                    byte b3 = bArr[r12];
                    byte b4 = bArr2[r12];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        }
    }
}
