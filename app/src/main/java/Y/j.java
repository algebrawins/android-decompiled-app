package Y;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import x1.AbstractC0747y0;

/* loaded from: classes.dex */
public final class j extends AbstractC0747y0 {
    public static Font f(FontFamily fontFamily, int r6) {
        int r12;
        int r62;
        if ((r6 & 1) != 0) {
            r12 = 700;
        } else {
            r12 = 400;
        }
        if ((r6 & 2) != 0) {
            r62 = 1;
        } else {
            r62 = 0;
        }
        FontStyle fontStyle = new FontStyle(r12, r62);
        Font font = fontFamily.getFont(0);
        int g = g(fontStyle, font.getStyle());
        for (int r22 = 1; r22 < fontFamily.getSize(); r22++) {
            Font font2 = fontFamily.getFont(r22);
            int g3 = g(fontStyle, font2.getStyle());
            if (g3 < g) {
                font = font2;
                g = g3;
            }
        }
        return font;
    }

    public static int g(FontStyle fontStyle, FontStyle fontStyle2) {
        int r22;
        int abs = Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100;
        if (fontStyle.getSlant() == fontStyle2.getSlant()) {
            r22 = 0;
        } else {
            r22 = 2;
        }
        return abs + r22;
    }

    @Override // x1.AbstractC0747y0
    public final Typeface a(Context context, X.f fVar, Resources resources, int r10) {
        X.g[] gVarArr;
        try {
            FontFamily.Builder builder = null;
            for (X.g gVar : fVar.f1550a) {
                try {
                    Font build = new Font.Builder(resources, gVar.f1556f).setWeight(gVar.f1552b).setSlant(gVar.f1553c ? 1 : 0).setTtcIndex(gVar.f1555e).setFontVariationSettings(gVar.f1554d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(f(build2, r10).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // x1.AbstractC0747y0
    public final Typeface b(Context context, c0.g[] gVarArr, int r11) {
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (c0.g gVar : gVarArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(gVar.f2652a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    if (openFileDescriptor == null) {
                    }
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(gVar.f2654c).setSlant(gVar.f2655d ? 1 : 0).setTtcIndex(gVar.f2653b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(f(build2, r11).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // x1.AbstractC0747y0
    public final Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // x1.AbstractC0747y0
    public final Typeface d(Context context, Resources resources, int r3, String str, int r5) {
        try {
            Font build = new Font.Builder(resources, r3).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // x1.AbstractC0747y0
    public final c0.g e(c0.g[] gVarArr, int r22) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
