package W;

import D.C;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class g extends ContentProvider {

    /* renamed from: M  reason: collision with root package name */
    public static final String[] f1477M = {"_display_name", "_size"};

    /* renamed from: N  reason: collision with root package name */
    public static final File f1478N = new File("/");

    /* renamed from: O  reason: collision with root package name */
    public static final HashMap f1479O = new HashMap();

    /* renamed from: J  reason: collision with root package name */
    public final Object f1480J = new Object();

    /* renamed from: K  reason: collision with root package name */
    public String f1481K;

    /* renamed from: L  reason: collision with root package name */
    public f f1482L;

    public static String a(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public static f c(Context context, String str) {
        f fVar;
        HashMap hashMap = f1479O;
        synchronized (hashMap) {
            try {
                fVar = (f) hashMap.get(str);
                if (fVar == null) {
                    try {
                        try {
                            fVar = e(context, str);
                            hashMap.put(str, fVar);
                        } catch (XmlPullParserException e4) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                        }
                    } catch (IOException e5) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e5);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static Uri d(Context context, String str, File file) {
        String substring;
        f c4 = c(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : c4.f1476b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (f.a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme("content").authority(c4.f1475a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException(C.I("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    public static f e(Context context, String str) {
        f fVar = new f(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, RecognitionOptions.ITF);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (loadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = loadXmlMetaData.next();
                if (next != 1) {
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                        if ("root-path".equals(name)) {
                            file = f1478N;
                        } else if ("files-path".equals(name)) {
                            file = context.getFilesDir();
                        } else if ("cache-path".equals(name)) {
                            file = context.getCacheDir();
                        } else if ("external-path".equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if ("external-files-path".equals(name)) {
                            File[] externalFilesDirs = context.getExternalFilesDirs(null);
                            if (externalFilesDirs.length > 0) {
                                file = externalFilesDirs[0];
                            }
                        } else if ("external-cache-path".equals(name)) {
                            File[] externalCacheDirs = context.getExternalCacheDirs();
                            if (externalCacheDirs.length > 0) {
                                file = externalCacheDirs[0];
                            }
                        } else if ("external-media-path".equals(name)) {
                            File[] a4 = e.a(context);
                            if (a4.length > 0) {
                                file = a4[0];
                            }
                        }
                        if (file == null) {
                            continue;
                        } else {
                            String str2 = new String[]{attributeValue2}[0];
                            if (str2 != null) {
                                file = new File(file, str2);
                            }
                            if (!TextUtils.isEmpty(attributeValue)) {
                                try {
                                    fVar.f1476b.put(attributeValue, file.getCanonicalFile());
                                } catch (IOException e4) {
                                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e4);
                                }
                            } else {
                                throw new IllegalArgumentException("Name must not be empty");
                            }
                        }
                    }
                } else {
                    return fVar;
                }
            }
        } else {
            throw new IllegalArgumentException(C.I("Couldn't find meta-data for provider with authority ", str));
        }
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                synchronized (this.f1480J) {
                    this.f1481K = str;
                }
                HashMap hashMap = f1479O;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public final f b() {
        f fVar;
        synchronized (this.f1480J) {
            try {
                if (this.f1481K != null) {
                    if (this.f1482L == null) {
                        this.f1482L = c(getContext(), this.f1481K);
                    }
                    fVar = this.f1482L;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return b().b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File b3 = b().b(uri);
        int lastIndexOf = b3.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b3.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int r3;
        File b3 = b().b(uri);
        if ("r".equals(str)) {
            r3 = 268435456;
        } else if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                r3 = 704643072;
            } else if ("rw".equals(str)) {
                r3 = 939524096;
            } else if ("rwt".equals(str)) {
                r3 = 1006632960;
            } else {
                throw new IllegalArgumentException(C.I("Invalid mode: ", str));
            }
        } else {
            r3 = 738197504;
        }
        return ParcelFileDescriptor.open(b3, r3);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int r4;
        String str3;
        File b3 = b().b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f1477M;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int r3 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[r3] = "_display_name";
                r4 = r3 + 1;
                if (queryParameter == null) {
                    str3 = b3.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[r3] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[r3] = "_size";
                r4 = r3 + 1;
                objArr[r3] = Long.valueOf(b3.length());
            }
            r3 = r4;
        }
        String[] strArr4 = new String[r3];
        System.arraycopy(strArr3, 0, strArr4, 0, r3);
        Object[] objArr2 = new Object[r3];
        System.arraycopy(objArr, 0, objArr2, 0, r3);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
