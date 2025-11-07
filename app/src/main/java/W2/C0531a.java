package w2;

import A0.C0001b;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n2.InterfaceC0394a;

/* renamed from: w2.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0531a implements InterfaceC0394a {

    /* renamed from: J  reason: collision with root package name */
    public SharedPreferences f5360J;

    /* renamed from: K  reason: collision with root package name */
    public final w1.u f5361K = new Object();

    public final Boolean a(String str, List list) {
        SharedPreferences.Editor edit = this.f5360J.edit();
        Map<String, ?> all = this.f5360J.getAll();
        ArrayList arrayList = new ArrayList();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (list == null || list.contains(str2))) {
                arrayList.add(str2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        return Boolean.valueOf(edit.commit());
    }

    public final HashMap b(String str, List list) {
        HashSet hashSet;
        Object obj;
        if (list == null) {
            hashSet = null;
        } else {
            hashSet = new HashSet(list);
        }
        Map<String, ?> all = this.f5360J.getAll();
        HashMap hashMap = new HashMap();
        for (String str2 : all.keySet()) {
            if (str2.startsWith(str) && (hashSet == null || hashSet.contains(str2))) {
                Object obj2 = all.get(str2);
                Objects.requireNonNull(obj2);
                boolean z3 = obj2 instanceof String;
                w1.u uVar = this.f5361K;
                if (z3) {
                    String str3 = (String) obj2;
                    if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu")) {
                        if (!str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!")) {
                            String substring = str3.substring(40);
                            uVar.getClass();
                            try {
                                obj2 = (List) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(substring, 0))).readObject();
                            } catch (IOException | ClassNotFoundException e4) {
                                throw new RuntimeException(e4);
                            }
                        }
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy")) {
                        obj = new BigInteger(str3.substring(44), 36);
                        obj2 = obj;
                    } else if (str3.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
                        obj2 = Double.valueOf(str3.substring(40));
                    }
                    hashMap.put(str2, obj2);
                } else {
                    if (obj2 instanceof Set) {
                        ArrayList arrayList = new ArrayList((Set) obj2);
                        SharedPreferences.Editor remove = this.f5360J.edit().remove(str2);
                        remove.putString(str2, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + uVar.o(arrayList)).apply();
                        obj = arrayList;
                        obj2 = obj;
                    }
                    hashMap.put(str2, obj2);
                }
            }
        }
        return hashMap;
    }

    public final Boolean c(String str, String str2) {
        if (!str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBCaWdJbnRlZ2Vy") && !str2.startsWith("VGhpcyBpcyB0aGUgcHJlZml4IGZvciBEb3VibGUu")) {
            return Boolean.valueOf(this.f5360J.edit().putString(str, str2).commit());
        }
        throw new RuntimeException("StorageError: This string cannot be stored as it clashes with special identifier prefixes");
    }

    @Override // n2.InterfaceC0394a
    public final void f(C0001b c0001b) {
        D.C.N((r2.f) c0001b.f84K, null);
    }

    @Override // n2.InterfaceC0394a
    public final void h(C0001b c0001b) {
        r2.f fVar = (r2.f) c0001b.f84K;
        this.f5360J = ((Context) c0001b.f85L).getSharedPreferences("FlutterSharedPreferences", 0);
        try {
            D.C.N(fVar, this);
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
    }
}
