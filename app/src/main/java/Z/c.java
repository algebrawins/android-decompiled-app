package Z;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import q0.k;

/* loaded from: classes.dex */
public abstract class c {
    public static Uri a(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.d(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        } catch (NoSuchMethodException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (InvocationTargetException e6) {
            Log.e("IconCompat", "Unable to get icon uri", e6);
            return null;
        }
    }

    public static Drawable b(Icon icon, Context context) {
        return icon.loadDrawable(context);
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        int r12;
        int r02 = iconCompat.f2260a;
        String str = null;
        r2 = null;
        InputStream openInputStream = null;
        str = null;
        str = null;
        switch (r02) {
            case -1:
                return (Icon) iconCompat.f2261b;
            case RecognitionOptions.UNRECOGNIZED /* 0 */:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f2261b);
                break;
            case 2:
                if (r02 == -1 && (r12 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = iconCompat.f2261b;
                    if (r12 >= 28) {
                        str = e.b(obj);
                    } else {
                        try {
                            str = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e4) {
                            Log.e("IconCompat", "Unable to get icon package", e4);
                        } catch (NoSuchMethodException e5) {
                            Log.e("IconCompat", "Unable to get icon package", e5);
                        } catch (InvocationTargetException e6) {
                            Log.e("IconCompat", "Unable to get icon package", e6);
                        }
                    }
                } else if (r02 == 2) {
                    String str2 = iconCompat.f2268j;
                    str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.f2261b).split(":", -1)[0] : iconCompat.f2268j;
                } else {
                    throw new IllegalStateException("called getResPackage() on " + iconCompat);
                }
                createWithBitmap = Icon.createWithResource(str, iconCompat.f2264e);
                break;
            case k.INTEGER_FIELD_NUMBER /* 3 */:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.f2261b, iconCompat.f2264e, iconCompat.f2265f);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.f2261b);
                break;
            case k.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = d.b((Bitmap) iconCompat.f2261b);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f2261b, false));
                    break;
                }
            case k.STRING_SET_FIELD_NUMBER /* 6 */:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = f.a(iconCompat.d());
                    break;
                } else if (context != null) {
                    Uri d4 = iconCompat.d();
                    String scheme = d4.getScheme();
                    if (!"content".equals(scheme) && !"file".equals(scheme)) {
                        try {
                            openInputStream = new FileInputStream(new File((String) iconCompat.f2261b));
                        } catch (FileNotFoundException e7) {
                            Log.w("IconCompat", "Unable to load image from path: " + d4, e7);
                        }
                    } else {
                        try {
                            openInputStream = context.getContentResolver().openInputStream(d4);
                        } catch (Exception e8) {
                            Log.w("IconCompat", "Unable to load image from URI: " + d4, e8);
                        }
                    }
                    if (openInputStream != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            createWithBitmap = d.b(BitmapFactory.decodeStream(openInputStream));
                            break;
                        } else {
                            createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(openInputStream), false));
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.d());
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.d());
                }
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.f2266h;
        if (mode != IconCompat.f2259k) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }
}
