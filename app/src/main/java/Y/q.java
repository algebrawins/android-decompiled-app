package y;

import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import x1.X;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final List f6180a;

    /* renamed from: b  reason: collision with root package name */
    public final Size f6181b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6182c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6183d;

    /* renamed from: e  reason: collision with root package name */
    public String f6184e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f6185f = false;
    public long g = 1;

    public q(Surface surface) {
        Size size;
        int r10;
        int r4 = 0;
        this.f6180a = Collections.singletonList(surface);
        try {
            Method declaredMethod = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("getSurfaceSize", Surface.class);
            declaredMethod.setAccessible(true);
            size = (Size) declaredMethod.invoke(null, surface);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
            X.c("OutputConfigCompat", "Unable to retrieve surface size.", e4);
            size = null;
        }
        this.f6181b = size;
        try {
            Method declaredMethod2 = Class.forName("android.hardware.camera2.legacy.LegacyCameraDevice").getDeclaredMethod("detectSurfaceType", Surface.class);
            if (Build.VERSION.SDK_INT < 22) {
                declaredMethod2.setAccessible(true);
            }
            r4 = ((Integer) declaredMethod2.invoke(null, surface)).intValue();
        } catch (ClassNotFoundException e5) {
            e = e5;
            X.c("OutputConfigCompat", "Unable to retrieve surface format.", e);
            this.f6182c = r4;
            r10 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
            this.f6183d = r10;
        } catch (IllegalAccessException e6) {
            e = e6;
            X.c("OutputConfigCompat", "Unable to retrieve surface format.", e);
            this.f6182c = r4;
            r10 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
            this.f6183d = r10;
        } catch (NoSuchMethodException e7) {
            e = e7;
            X.c("OutputConfigCompat", "Unable to retrieve surface format.", e);
            this.f6182c = r4;
            r10 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
            this.f6183d = r10;
        } catch (InvocationTargetException e8) {
            e = e8;
            X.c("OutputConfigCompat", "Unable to retrieve surface format.", e);
            this.f6182c = r4;
            r10 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
            this.f6183d = r10;
        }
        this.f6182c = r4;
        try {
            r10 = ((Integer) Surface.class.getDeclaredMethod("getGenerationId", null).invoke(surface, null)).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e9) {
            X.c("OutputConfigCompat", "Unable to retrieve surface generation id.", e9);
            r10 = -1;
        }
        this.f6183d = r10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (!this.f6181b.equals(qVar.f6181b) || this.f6182c != qVar.f6182c || this.f6183d != qVar.f6183d || this.f6185f != qVar.f6185f || this.g != qVar.g || !Objects.equals(this.f6184e, qVar.f6184e)) {
            return false;
        }
        List list = this.f6180a;
        int size = list.size();
        List list2 = qVar.f6180a;
        int min = Math.min(size, list2.size());
        for (int r3 = 0; r3 < min; r3++) {
            if (list.get(r3) != list2.get(r3)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f6180a.hashCode() ^ 31;
        int r02 = this.f6183d ^ ((hashCode2 << 5) - hashCode2);
        int hashCode3 = this.f6181b.hashCode() ^ ((r02 << 5) - r02);
        int r03 = this.f6182c ^ ((hashCode3 << 5) - hashCode3);
        int r04 = (this.f6185f ? 1 : 0) ^ ((r03 << 5) - r03);
        int r12 = (r04 << 5) - r04;
        String str = this.f6184e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int r05 = hashCode ^ r12;
        int r13 = (r05 << 5) - r05;
        long j3 = this.g;
        return ((int) (j3 ^ (j3 >>> 32))) ^ r13;
    }
}
