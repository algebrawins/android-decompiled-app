package W;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f1475a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1476b = new HashMap();

    public f(String str) {
        this.f1475a = str;
    }

    public static boolean a(String str, String str2) {
        String a4 = g.a(str);
        String a5 = g.a(str2);
        if (!a4.equals(a5)) {
            if (!a4.startsWith(a5 + '/')) {
                return false;
            }
        }
        return true;
    }

    public final File b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f1476b.get(decode);
        if (file != null) {
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (a(canonicalFile.getPath(), file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
        throw new IllegalArgumentException("Unable to find configured root for " + uri);
    }
}
