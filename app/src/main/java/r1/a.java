package R1;

import A.f;
import A0.C0001b;
import X0.b;
import a1.C0071b;
import a1.C0072c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.camera.core.impl.Z;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.example.catering_inventory.R;
import d1.InterfaceC0232a;
import h2.J;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o.j;
import o.o;
import o.t;
import q2.n;
import r2.m;
import t1.c;
import t1.e;
import w.o0;
import x0.InterfaceC0560a;

/* loaded from: classes.dex */
public final class a implements b, InterfaceC0232a, o, m, c, o0, InterfaceC0560a {

    /* renamed from: J  reason: collision with root package name */
    public static a f1155J;

    public /* synthetic */ a(Object obj) {
    }

    public static void k(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static f l(Context context, String[] strArr, String str, C0001b c0001b) {
        String[] n3 = n(context);
        int length = n3.length;
        int r5 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (r5 >= length) {
                return null;
            }
            String str2 = n3[r5];
            int r8 = 0;
            while (true) {
                int r9 = r8 + 1;
                if (r8 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    r8 = r9;
                }
            }
            if (zipFile != null) {
                int r82 = 0;
                while (true) {
                    int r92 = r82 + 1;
                    if (r82 < 5) {
                        for (String str3 : strArr) {
                            StringBuilder sb = new StringBuilder("lib");
                            char c4 = File.separatorChar;
                            sb.append(c4);
                            sb.append(str3);
                            sb.append(c4);
                            sb.append(str);
                            String sb2 = sb.toString();
                            c0001b.getClass();
                            C0001b.O("Looking for %s in APK %s...", sb2, str2);
                            ZipEntry entry = zipFile.getEntry(sb2);
                            if (entry != null) {
                                f fVar = new f(11, false);
                                fVar.f10K = zipFile;
                                fVar.f11L = entry;
                                return fVar;
                            }
                        }
                        r82 = r92;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            r5++;
        }
    }

    public static String[] m(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        char c4 = File.separatorChar;
        sb.append(c4);
        sb.append("([^\\");
        sb.append(c4);
        sb.append("]*)");
        sb.append(c4);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : n(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(entries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public static String[] n(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            String[] strArr2 = new String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new String[]{applicationInfo.sourceDir};
    }

    @Override // d1.InterfaceC0232a
    public long c() {
        return System.currentTimeMillis();
    }

    @Override // t1.c
    public int d(Context context, String str) {
        return e.a(context, str);
    }

    @Override // o.o
    public boolean f(t tVar) {
        return false;
    }

    @Override // x0.InterfaceC0560a
    public CharSequence g(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        editTextPreference.getClass();
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        return editTextPreference.f2497J.getString(R.string.not_set);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, d1.a] */
    @Override // A2.a
    public Object get() {
        ?? obj = new Object();
        HashMap hashMap = new HashMap();
        S0.c cVar = S0.c.DEFAULT;
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            hashMap.put(cVar, new C0072c(30000L, 86400000L, emptySet));
            S0.c cVar2 = S0.c.HIGHEST;
            Set emptySet2 = Collections.emptySet();
            if (emptySet2 != null) {
                hashMap.put(cVar2, new C0072c(1000L, 86400000L, emptySet2));
                S0.c cVar3 = S0.c.VERY_LOW;
                if (Collections.emptySet() != null) {
                    Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(a1.e.NETWORK_UNMETERED, a1.e.DEVICE_IDLE)));
                    if (unmodifiableSet != null) {
                        hashMap.put(cVar3, new C0072c(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= S0.c.values().length) {
                            new HashMap();
                            return new C0071b(obj, hashMap);
                        }
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    @Override // t1.c
    public int h(Context context, String str, boolean z3) {
        return e.d(context, str, z3);
    }

    @Override // r2.m
    public void i(J j3, n nVar) {
        nVar.c(null);
    }

    @Override // w.o0
    public void b(Z z3) {
    }

    @Override // w.o0
    public void e(boolean z3) {
    }

    @Override // w.o0
    public void j(boolean z3) {
    }

    @Override // o.o
    public void a(j jVar, boolean z3) {
    }
}
