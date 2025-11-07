package com.google.android.gms.auth.api.signin;

import A0.C0015q;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import k1.w;
import l1.AbstractC0347a;
import org.json.JSONArray;
import org.json.JSONObject;
import x1.G4;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC0347a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0015q(8);

    /* renamed from: a  reason: collision with root package name */
    public final int f2710a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2711b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2712c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2713d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2714e;

    /* renamed from: f  reason: collision with root package name */
    public final Uri f2715f;
    public String g;

    /* renamed from: h  reason: collision with root package name */
    public final long f2716h;

    /* renamed from: i  reason: collision with root package name */
    public final String f2717i;

    /* renamed from: j  reason: collision with root package name */
    public final ArrayList f2718j;

    /* renamed from: k  reason: collision with root package name */
    public final String f2719k;

    /* renamed from: l  reason: collision with root package name */
    public final String f2720l;

    /* renamed from: m  reason: collision with root package name */
    public final HashSet f2721m = new HashSet();

    public GoogleSignInAccount(int r22, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.f2710a = r22;
        this.f2711b = str;
        this.f2712c = str2;
        this.f2713d = str3;
        this.f2714e = str4;
        this.f2715f = uri;
        this.g = str5;
        this.f2716h = j3;
        this.f2717i = str6;
        this.f2718j = arrayList;
        this.f2719k = str7;
        this.f2720l = str8;
    }

    public static GoogleSignInAccount a(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int r5 = 0; r5 < length; r5++) {
            hashSet.add(new Scope(jSONArray.getString(r5), 1));
        }
        String optString2 = jSONObject.optString("id");
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        w.c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.g = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f2717i.equals(this.f2717i)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f2718j);
            hashSet.addAll(googleSignInAccount.f2721m);
            HashSet hashSet2 = new HashSet(this.f2718j);
            hashSet2.addAll(this.f2721m);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        HashSet hashSet = new HashSet(this.f2718j);
        hashSet.addAll(this.f2721m);
        return hashSet.hashCode() + ((this.f2717i.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int g = G4.g(parcel, 20293);
        G4.i(parcel, 1, 4);
        parcel.writeInt(this.f2710a);
        G4.c(parcel, 2, this.f2711b);
        G4.c(parcel, 3, this.f2712c);
        G4.c(parcel, 4, this.f2713d);
        G4.c(parcel, 5, this.f2714e);
        G4.b(parcel, 6, this.f2715f, r6);
        G4.c(parcel, 7, this.g);
        G4.i(parcel, 8, 8);
        parcel.writeLong(this.f2716h);
        G4.c(parcel, 9, this.f2717i);
        G4.f(parcel, 10, this.f2718j);
        G4.c(parcel, 11, this.f2719k);
        G4.c(parcel, 12, this.f2720l);
        G4.h(parcel, g);
    }
}
