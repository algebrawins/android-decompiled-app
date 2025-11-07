package w2;

import android.app.ActivityOptions;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import com.google.android.libraries.barhopper.RecognitionOptions;
import h2.AbstractActivityC0292d;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import k0.C0322i;
import t.AbstractC0455a;
import x1.X;
import x2.C0762a;
import x2.C0763b;
import x2.C0766e;
import z.AbstractC0957j;

/* loaded from: classes.dex */
public final class q implements Y2.d {

    /* renamed from: J  reason: collision with root package name */
    public Object f5401J;

    /* renamed from: K  reason: collision with root package name */
    public Object f5402K;

    /* renamed from: L  reason: collision with root package name */
    public Object f5403L;

    public static Bundle b(Map map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, (String) map.get(str));
        }
        return bundle;
    }

    public Boolean a(String str) {
        String shortString;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(((Context) ((A.k) this.f5402K).f22K).getPackageManager());
        if (resolveActivity == null) {
            shortString = null;
        } else {
            shortString = resolveActivity.toShortString();
        }
        if (shortString == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(shortString));
    }

    public Size[] c(int r18) {
        boolean z3;
        boolean z4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Size[] sizeArr;
        HashMap hashMap = (HashMap) this.f5403L;
        if (hashMap.containsKey(Integer.valueOf(r18))) {
            if (((Size[]) hashMap.get(Integer.valueOf(r18))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(r18))).clone();
        }
        Size[] k3 = ((C0322i) this.f5401J).k(r18);
        if (k3 != null && k3.length != 0) {
            A.f fVar = (A.f) this.f5402K;
            fVar.getClass();
            ArrayList arrayList3 = new ArrayList(Arrays.asList(k3));
            if (((z.n) fVar.f10K) != null) {
                if (r18 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr = new Size[]{new Size(1920, 1080), new Size(1440, 1080), new Size(1280, 720), new Size(960, 720), new Size(864, 480), new Size(720, 480)};
                } else {
                    sizeArr = new Size[0];
                }
                if (sizeArr.length > 0) {
                    arrayList3.addAll(Arrays.asList(sizeArr));
                }
            }
            A.a aVar = (A.a) fVar.f11L;
            aVar.getClass();
            if (((z.k) AbstractC0957j.f6565a.b(z.k.class)) == null) {
                arrayList2 = new ArrayList();
            } else {
                String str = Build.BRAND;
                if ("OnePlus".equalsIgnoreCase(str) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str2 = (String) aVar.f1K;
                if (z3) {
                    arrayList = new ArrayList();
                    if (str2.equals("0") && r18 == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else if ("OnePlus".equalsIgnoreCase(str) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str2.equals("0") && r18 == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else {
                    if ("HUAWEI".equalsIgnoreCase(str) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList2 = arrayList4;
                        arrayList2 = arrayList4;
                        if (str2.equals("0") && (r18 == 34 || r18 == 35)) {
                            arrayList4.add(new Size(720, 720));
                            arrayList4.add(new Size(400, 400));
                            arrayList2 = arrayList4;
                        }
                    } else if (z.k.b()) {
                        arrayList = new ArrayList();
                        if (str2.equals("0")) {
                            if (r18 != 34) {
                                if (r18 == 35) {
                                    arrayList.add(new Size(4128, 2322));
                                    arrayList.add(new Size(3088, 3088));
                                    arrayList.add(new Size(3264, 2448));
                                    arrayList.add(new Size(3264, 1836));
                                    arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                                    arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                                    arrayList.add(new Size(1920, 1080));
                                }
                            } else {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str2.equals("1") && (r18 == 34 || r18 == 35)) {
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2448, 2448));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                            arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (z.k.a()) {
                        arrayList = new ArrayList();
                        if (str2.equals("0")) {
                            if (r18 != 34) {
                                if (r18 == 35) {
                                    arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                                    arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                                    arrayList.add(new Size(1920, 1080));
                                }
                            } else {
                                arrayList.add(new Size(4128, 3096));
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                                arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else if (str2.equals("1") && (r18 == 34 || r18 == 35)) {
                            arrayList.add(new Size(2576, 1932));
                            arrayList.add(new Size(2560, 1440));
                            arrayList.add(new Size(1920, 1920));
                            arrayList.add(new Size(RecognitionOptions.PDF417, 1536));
                            arrayList.add(new Size(RecognitionOptions.PDF417, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if ("REDMI".equalsIgnoreCase(str) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList2 = arrayList5;
                        if (str2.equals("0")) {
                            arrayList2 = arrayList5;
                            if (r18 == 256) {
                                arrayList5.add(new Size(9280, 6944));
                                arrayList2 = arrayList5;
                            }
                        }
                    } else {
                        X.g("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                        arrayList2 = Collections.emptyList();
                    }
                }
                arrayList2 = arrayList;
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.removeAll(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                X.g("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
            }
            Size[] sizeArr2 = (Size[]) arrayList3.toArray(new Size[0]);
            hashMap.put(Integer.valueOf(r18), sizeArr2);
            return (Size[]) sizeArr2.clone();
        }
        X.g("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + r18);
        return k3;
    }

    public Boolean d(String str, Boolean bool, C0766e c0766e, C0762a c0762a) {
        ActivityOptions activityOptions;
        Bundle bundle;
        if (((AbstractActivityC0292d) this.f5403L) != null) {
            Bundle b3 = b(c0766e.f6158c);
            if (bool.booleanValue()) {
                Iterator it = c0766e.f6158c.keySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        String lowerCase = ((String) it.next()).toLowerCase(Locale.US);
                        lowerCase.getClass();
                        char c4 = 65535;
                        switch (lowerCase.hashCode()) {
                            case -1423461112:
                                if (lowerCase.equals("accept")) {
                                    c4 = 0;
                                    continue;
                                } else {
                                    continue;
                                }
                            case -1229727188:
                                if (lowerCase.equals("content-language")) {
                                    c4 = 1;
                                    continue;
                                } else {
                                    continue;
                                }
                            case 785670158:
                                if (lowerCase.equals("content-type")) {
                                    c4 = 2;
                                    continue;
                                } else {
                                    continue;
                                }
                            case 802785917:
                                if (lowerCase.equals("accept-language")) {
                                    c4 = 3;
                                    continue;
                                } else {
                                    continue;
                                }
                        }
                        switch (c4) {
                        }
                    } else {
                        Uri parse = Uri.parse(str);
                        AbstractActivityC0292d abstractActivityC0292d = (AbstractActivityC0292d) this.f5403L;
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", c0762a.f6151a.booleanValue() ? 1 : 0);
                        Bundle bundle2 = null;
                        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBinder("android.support.customtabs.extra.SESSION", null);
                            intent.putExtras(bundle3);
                        }
                        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
                        intent.putExtras(new Bundle());
                        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
                        int r14 = Build.VERSION.SDK_INT;
                        if (r14 >= 24) {
                            String a4 = t.b.a();
                            if (!TextUtils.isEmpty(a4)) {
                                if (intent.hasExtra("com.android.browser.headers")) {
                                    bundle = intent.getBundleExtra("com.android.browser.headers");
                                } else {
                                    bundle = new Bundle();
                                }
                                if (!bundle.containsKey("Accept-Language")) {
                                    bundle.putString("Accept-Language", a4);
                                    intent.putExtra("com.android.browser.headers", bundle);
                                }
                            }
                        }
                        if (r14 >= 34) {
                            activityOptions = AbstractC0455a.a();
                            t.c.a(activityOptions, false);
                        } else {
                            activityOptions = null;
                        }
                        if (activityOptions != null) {
                            bundle2 = activityOptions.toBundle();
                        }
                        intent.putExtra("com.android.browser.headers", b3);
                        try {
                            intent.setData(parse);
                            abstractActivityC0292d.startActivity(intent, bundle2);
                            return Boolean.TRUE;
                        } catch (ActivityNotFoundException unused) {
                        }
                    }
                }
            }
            boolean booleanValue = c0766e.f6156a.booleanValue();
            boolean booleanValue2 = c0766e.f6157b.booleanValue();
            int r02 = WebViewActivity.f3665N;
            try {
                ((AbstractActivityC0292d) this.f5403L).startActivity(new Intent((AbstractActivityC0292d) this.f5403L, WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", booleanValue).putExtra("enableDomStorage", booleanValue2).putExtra("com.android.browser.headers", b3));
                return Boolean.TRUE;
            } catch (ActivityNotFoundException unused2) {
                return Boolean.FALSE;
            }
        }
        throw new C0763b();
    }

    public Boolean e() {
        ArrayList arrayList;
        String str;
        List emptyList = Collections.emptyList();
        PackageManager packageManager = ((Context) this.f5401J).getPackageManager();
        if (emptyList == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = emptyList;
        }
        boolean z3 = false;
        ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveActivity != null) {
            String str2 = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str2);
            if (emptyList != null) {
                arrayList2.addAll(emptyList);
            }
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                str = (String) it.next();
                intent.setPackage(str);
                if (packageManager.resolveService(intent, 0) != null) {
                    break;
                }
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
                }
                str = null;
            }
        }
        if (str != null) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // Y2.d
    public Object h(Y2.e eVar, D2.d dVar) {
        Object h3 = ((Y2.d) this.f5401J).h(new Y2.l(eVar, (r0.d) this.f5402K, (J) this.f5403L), dVar);
        if (h3 == E2.a.COROUTINE_SUSPENDED) {
            return h3;
        }
        return B2.i.f210a;
    }
}
