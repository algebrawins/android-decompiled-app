package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final float[][] f1545a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* renamed from: b  reason: collision with root package name */
    public static final float[][] f1546b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* renamed from: c  reason: collision with root package name */
    public static final float[] f1547c = {95.047f, 100.0f, 108.883f};

    /* renamed from: d  reason: collision with root package name */
    public static final float[][] f1548d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    public static int a(Context context, int r3, int r4) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(r3, typedValue, true);
        if (typedValue.resourceId != 0) {
            return r3;
        }
        return r4;
    }

    public static U1.h b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int r7) {
        U1.h hVar;
        if (e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(r7, typedValue);
            int r12 = typedValue.type;
            if (r12 >= 28 && r12 <= 31) {
                return new U1.h(typedValue.data, null, null);
            }
            try {
                hVar = U1.h.a(typedArray.getResources(), typedArray.getResourceId(r7, 0), theme);
            } catch (Exception e4) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e4);
                hVar = null;
            }
            if (hVar != null) {
                return hVar;
            }
        }
        return new U1.h(0, null, null);
    }

    public static String c(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int r3) {
        if (!e(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(r3);
    }

    public static String d(TypedArray typedArray, int r12, int r22) {
        String string = typedArray.getString(r12);
        if (string == null) {
            return typedArray.getString(r22);
        }
        return string;
    }

    public static boolean e(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static int f(float f2) {
        float f4;
        boolean z3;
        float f5;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f6 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            f4 = f6 * f6 * f6;
        } else {
            f4 = f2 / 903.2963f;
        }
        float f7 = f6 * f6 * f6;
        if (f7 > 0.008856452f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            f5 = f7;
        } else {
            f5 = ((f6 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z3) {
            f7 = ((f6 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f1547c;
        return Y.a.a(f5 * fArr[0], f4 * fArr[1], f7 * fArr[2]);
    }

    public static float g(int r6) {
        float pow;
        float f2 = r6 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] r3) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, r3);
        }
        return theme.obtainStyledAttributes(attributeSet, r3, 0, 0);
    }

    public static e i(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int r8;
        boolean z3;
        int r82;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), T.a.f1199b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string != null && string2 != null && string3 != null) {
                    while (xmlResourceParser.next() != 3) {
                        k(xmlResourceParser);
                    }
                    return new h(new E.c(string, string2, string3, j(resources, resourceId)), integer, integer2, string4);
                }
                ArrayList arrayList = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), T.a.f1200c);
                            int r83 = 8;
                            if (!obtainAttributes2.hasValue(8)) {
                                r83 = 1;
                            }
                            int r17 = obtainAttributes2.getInt(r83, 400);
                            if (obtainAttributes2.hasValue(6)) {
                                r8 = 6;
                            } else {
                                r8 = 2;
                            }
                            if (1 == obtainAttributes2.getInt(r8, 0)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            int r84 = 9;
                            if (!obtainAttributes2.hasValue(9)) {
                                r84 = 3;
                            }
                            int r9 = 7;
                            if (!obtainAttributes2.hasValue(7)) {
                                r9 = 4;
                            }
                            String string5 = obtainAttributes2.getString(r9);
                            int r18 = obtainAttributes2.getInt(r84, 0);
                            if (obtainAttributes2.hasValue(5)) {
                                r82 = 5;
                            } else {
                                r82 = 0;
                            }
                            int resourceId2 = obtainAttributes2.getResourceId(r82, 0);
                            String string6 = obtainAttributes2.getString(r82);
                            obtainAttributes2.recycle();
                            while (xmlResourceParser.next() != 3) {
                                k(xmlResourceParser);
                            }
                            arrayList.add(new g(r17, r18, resourceId2, string6, string5, z3));
                        } else {
                            k(xmlResourceParser);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return new f((g[]) arrayList.toArray(new g[0]));
                }
            } else {
                k(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List j(Resources resources, int r9) {
        if (r9 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(r9);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (d.a(obtainTypedArray, 0) == 1) {
                for (int r92 = 0; r92 < obtainTypedArray.length(); r92++) {
                    int resourceId = obtainTypedArray.getResourceId(r92, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(r9);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void k(XmlResourceParser xmlResourceParser) {
        int r02 = 1;
        while (r02 > 0) {
            int next = xmlResourceParser.next();
            if (next != 2) {
                if (next == 3) {
                    r02--;
                }
            } else {
                r02++;
            }
        }
    }

    public static float l() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
