package androidx.core.graphics.drawable;

import Z.c;
import Z.e;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import q0.k;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f2259k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public Object f2261b;

    /* renamed from: j  reason: collision with root package name */
    public String f2268j;

    /* renamed from: a  reason: collision with root package name */
    public int f2260a = -1;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f2262c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f2263d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f2264e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2265f = 0;
    public ColorStateList g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2266h = f2259k;

    /* renamed from: i  reason: collision with root package name */
    public String f2267i = null;

    public static Bitmap a(Bitmap bitmap, boolean z3) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f4 = 0.5f * f2;
        float f5 = 0.9166667f * f4;
        if (z3) {
            float f6 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f6, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.setShadowLayer(f6, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f4, f4, f5, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f4, f4, f5, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.core.graphics.drawable.IconCompat, androidx.versionedparcelable.CustomVersionedParcelable] */
    public static IconCompat b(int r3) {
        if (r3 != 0) {
            ?? customVersionedParcelable = new CustomVersionedParcelable();
            customVersionedParcelable.f2262c = null;
            customVersionedParcelable.f2263d = null;
            customVersionedParcelable.f2265f = 0;
            customVersionedParcelable.g = null;
            customVersionedParcelable.f2266h = f2259k;
            customVersionedParcelable.f2267i = null;
            customVersionedParcelable.f2260a = 2;
            customVersionedParcelable.f2264e = r3;
            customVersionedParcelable.f2261b = "";
            customVersionedParcelable.f2268j = "";
            return customVersionedParcelable;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int r12;
        int r02 = this.f2260a;
        if (r02 == -1 && (r12 = Build.VERSION.SDK_INT) >= 23) {
            Object obj = this.f2261b;
            if (r12 >= 28) {
                return e.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e4) {
                Log.e("IconCompat", "Unable to get icon resource", e4);
                return 0;
            } catch (NoSuchMethodException e5) {
                Log.e("IconCompat", "Unable to get icon resource", e5);
                return 0;
            } catch (InvocationTargetException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            }
        } else if (r02 == 2) {
            return this.f2264e;
        } else {
            throw new IllegalStateException("called getResId() on " + this);
        }
    }

    public final Uri d() {
        int r02 = this.f2260a;
        if (r02 == -1 && Build.VERSION.SDK_INT >= 23) {
            return c.a(this.f2261b);
        }
        if (r02 != 4 && r02 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f2261b);
    }

    public final String toString() {
        String str;
        if (this.f2260a == -1) {
            return String.valueOf(this.f2261b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f2260a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                str = "BITMAP_MASKABLE";
                break;
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f2260a) {
            case 1:
            case k.STRING_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2261b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f2261b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2268j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                sb.append(" len=");
                sb.append(this.f2264e);
                if (this.f2265f != 0) {
                    sb.append(" off=");
                    sb.append(this.f2265f);
                    break;
                }
                break;
            case 4:
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                sb.append(" uri=");
                sb.append(this.f2261b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.f2266h != f2259k) {
            sb.append(" mode=");
            sb.append(this.f2266h);
        }
        sb.append(")");
        return sb.toString();
    }
}
