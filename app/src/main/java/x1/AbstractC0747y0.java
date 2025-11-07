package x1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: x1.y0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0747y0 {
    public AbstractC0747y0() {
        new ConcurrentHashMap();
    }

    public abstract Typeface a(Context context, X.f fVar, Resources resources, int r4);

    public abstract Typeface b(Context context, c0.g[] gVarArr, int r3);

    public Typeface c(Context context, InputStream inputStream) {
        File d4 = AbstractC0755z0.d(context);
        if (d4 == null) {
            return null;
        }
        try {
            if (!AbstractC0755z0.c(d4, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(d4.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d4.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int r3, String str, int r5) {
        File d4 = AbstractC0755z0.d(context);
        if (d4 == null) {
            return null;
        }
        try {
            if (!AbstractC0755z0.b(d4, resources, r3)) {
                return null;
            }
            return Typeface.createFromFile(d4.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            d4.delete();
        }
    }

    public c0.g e(c0.g[] gVarArr, int r12) {
        int r02;
        boolean z3;
        int r9;
        if ((r12 & 1) == 0) {
            r02 = 400;
        } else {
            r02 = 700;
        }
        if ((r12 & 2) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        c0.g gVar = null;
        int r5 = Integer.MAX_VALUE;
        for (c0.g gVar2 : gVarArr) {
            int abs = Math.abs(gVar2.f2654c - r02) * 2;
            if (gVar2.f2655d == z3) {
                r9 = 0;
            } else {
                r9 = 1;
            }
            int r8 = abs + r9;
            if (gVar == null || r5 > r8) {
                gVar = gVar2;
                r5 = r8;
            }
        }
        return gVar;
    }
}
