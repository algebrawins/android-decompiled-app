package c0;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.impl.Q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: c0.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0158b {

    /* renamed from: a  reason: collision with root package name */
    public static final Q f2638a = new Q(1);

    public static f a(Context context, E.c cVar) {
        Cursor cursor;
        InterfaceC0157a cVar2;
        int r20;
        int r17;
        Uri withAppendedId;
        int r18;
        boolean z3;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) cVar.f502K;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = (String) cVar.f503L;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                Q q3 = f2638a;
                Collections.sort(arrayList, q3);
                List list = (List) cVar.f505N;
                if (list == null) {
                    list = X.b.j(resources, 0);
                }
                int r3 = 0;
                loop1: while (true) {
                    cursor = null;
                    if (r3 < list.size()) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(r3));
                        Collections.sort(arrayList2, q3);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int r10 = 0; r10 < arrayList.size(); r10++) {
                                if (!Arrays.equals((byte[]) arrayList.get(r10), (byte[]) arrayList2.get(r10))) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        r3++;
                    } else {
                        resolveContentProvider = null;
                        break;
                    }
                }
                if (resolveContentProvider == null) {
                    return new f(1, (Object[]) null);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                if (Build.VERSION.SDK_INT < 24) {
                    cVar2 = new A.a(context, build);
                } else {
                    cVar2 = new A.c(context, build);
                }
                try {
                    cursor = cVar2.w(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{(String) cVar.f504M});
                    if (cursor != null && cursor.getCount() > 0) {
                        int columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursor.getColumnIndex("_id");
                        int columnIndex3 = cursor.getColumnIndex("file_id");
                        int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursor.getColumnIndex("font_weight");
                        int columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                r20 = cursor.getInt(columnIndex);
                            } else {
                                r20 = 0;
                            }
                            if (columnIndex4 != -1) {
                                r17 = cursor.getInt(columnIndex4);
                            } else {
                                r17 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                r18 = cursor.getInt(columnIndex5);
                            } else {
                                r18 = 400;
                            }
                            if (columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            arrayList3.add(new g(uri, r17, r18, z3, r20));
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    cVar2.close();
                    return new f(0, (g[]) arrayList3.toArray(new g[0]));
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    cVar2.close();
                    throw th;
                }
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str));
    }
}
