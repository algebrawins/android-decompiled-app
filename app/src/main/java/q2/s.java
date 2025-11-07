package q2;

import android.os.Build;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4836a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4837b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4838c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4839d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f4840e;

    /* renamed from: f  reason: collision with root package name */
    public final u f4841f;
    public final t g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f4842h;

    /* renamed from: i  reason: collision with root package name */
    public final String f4843i;

    /* renamed from: j  reason: collision with root package name */
    public final a1.i f4844j;

    /* renamed from: k  reason: collision with root package name */
    public final String[] f4845k;

    /* renamed from: l  reason: collision with root package name */
    public final s[] f4846l;

    public s(boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, u uVar, t tVar, Integer num, String str, a1.i iVar, String[] strArr, s[] sVarArr) {
        this.f4836a = z3;
        this.f4837b = z4;
        this.f4838c = z5;
        this.f4839d = z6;
        this.f4840e = z7;
        this.f4841f = uVar;
        this.g = tVar;
        this.f4842h = num;
        this.f4843i = str;
        this.f4844j = iVar;
        this.f4845k = strArr;
        this.f4846l = sVarArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static s a(JSONObject jSONObject) {
        Object obj;
        Object obj2;
        int r24;
        s[] sVarArr;
        char c4;
        Integer num;
        JSONArray jSONArray;
        String string;
        t tVar;
        a1.i iVar;
        Object obj3;
        Object obj4;
        String str;
        char c5;
        String str2 = "password";
        String string2 = jSONObject.getString("inputAction");
        if (string2 != null) {
            String str3 = null;
            if (jSONObject.isNull("fields")) {
                obj = "newPassword";
                obj2 = "creditCardExpirationMonth";
                r24 = 1;
                sVarArr = null;
            } else {
                JSONArray jSONArray2 = jSONObject.getJSONArray("fields");
                int length = jSONArray2.length();
                obj2 = "creditCardExpirationMonth";
                s[] sVarArr2 = new s[length];
                obj = "newPassword";
                for (int r10 = 0; r10 < length; r10++) {
                    sVarArr2[r10] = a(jSONArray2.getJSONObject(r10));
                }
                r24 = 1;
                sVarArr = sVarArr2;
            }
            int valueOf = Integer.valueOf(r24);
            switch (string2.hashCode()) {
                case -737377923:
                    if (string2.equals("TextInputAction.done")) {
                        c4 = 0;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -737089298:
                    if (string2.equals("TextInputAction.next")) {
                        c4 = 1;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -737080013:
                    if (string2.equals("TextInputAction.none")) {
                        c4 = 2;
                        break;
                    }
                    c4 = 65535;
                    break;
                case -736940669:
                    if (string2.equals("TextInputAction.send")) {
                        c4 = 3;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 469250275:
                    if (string2.equals("TextInputAction.search")) {
                        c4 = 4;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1241689507:
                    if (string2.equals("TextInputAction.go")) {
                        c4 = 5;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 1539450297:
                    if (string2.equals("TextInputAction.newline")) {
                        c4 = 6;
                        break;
                    }
                    c4 = 65535;
                    break;
                case 2110497650:
                    if (string2.equals("TextInputAction.previous")) {
                        c4 = 7;
                        break;
                    }
                    c4 = 65535;
                    break;
                default:
                    c4 = 65535;
                    break;
            }
            switch (c4) {
                case RecognitionOptions.UNRECOGNIZED /* 0 */:
                    valueOf = 6;
                    num = valueOf;
                    break;
                case 1:
                    valueOf = 5;
                    num = valueOf;
                    break;
                case 2:
                case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                    num = valueOf;
                    break;
                case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                    valueOf = 4;
                    num = valueOf;
                    break;
                case 4:
                    valueOf = 3;
                    num = valueOf;
                    break;
                case q0.k.STRING_FIELD_NUMBER /* 5 */:
                    valueOf = 2;
                    num = valueOf;
                    break;
                case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                    valueOf = 7;
                    num = valueOf;
                    break;
                default:
                    num = 0;
                    break;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONObject.isNull("contentCommitMimeTypes")) {
                jSONArray = null;
            } else {
                jSONArray = jSONObject.getJSONArray("contentCommitMimeTypes");
            }
            if (jSONArray != null) {
                for (int r14 = 0; r14 < jSONArray.length(); r14++) {
                    arrayList.add(jSONArray.optString(r14));
                }
            }
            boolean optBoolean = jSONObject.optBoolean("obscureText");
            boolean optBoolean2 = jSONObject.optBoolean("autocorrect", true);
            boolean optBoolean3 = jSONObject.optBoolean("enableSuggestions");
            boolean optBoolean4 = jSONObject.optBoolean("enableIMEPersonalizedLearning");
            boolean optBoolean5 = jSONObject.optBoolean("enableDeltaModel");
            u a4 = u.a(jSONObject.getString("textCapitalization"));
            JSONObject jSONObject2 = jSONObject.getJSONObject("inputType");
            int r102 = 0;
            Object obj5 = "creditCardSecurityCode";
            t tVar2 = new t(w.a(jSONObject2.getString("name")), jSONObject2.optBoolean("signed", false), jSONObject2.optBoolean("decimal", false));
            if (jSONObject.isNull("actionLabel")) {
                string = null;
            } else {
                string = jSONObject.getString("actionLabel");
            }
            if (jSONObject.isNull("autofill")) {
                tVar = tVar2;
                iVar = null;
            } else {
                JSONObject jSONObject3 = jSONObject.getJSONObject("autofill");
                String string3 = jSONObject3.getString("uniqueIdentifier");
                JSONArray jSONArray3 = jSONObject3.getJSONArray("hints");
                if (!jSONObject3.isNull("hintText")) {
                    str3 = jSONObject3.getString("hintText");
                }
                String str4 = str3;
                JSONObject jSONObject4 = jSONObject3.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray3.length()];
                tVar = tVar2;
                while (r102 < jSONArray3.length()) {
                    String string4 = jSONArray3.getString(r102);
                    JSONArray jSONArray4 = jSONArray3;
                    String str5 = string3;
                    if (Build.VERSION.SDK_INT < 26) {
                        obj3 = obj5;
                        obj4 = obj;
                        str = str2;
                    } else {
                        string4.getClass();
                        switch (string4.hashCode()) {
                            case -2058889126:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                if (string4.equals("birthdayYear")) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1917283616:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                if (string4.equals("oneTimeCode")) {
                                    c5 = 1;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1844815832:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                Object obj6 = obj2;
                                if (!string4.equals(obj6)) {
                                    obj2 = obj6;
                                    c5 = 65535;
                                    break;
                                } else {
                                    obj2 = obj6;
                                    c5 = 2;
                                    break;
                                }
                            case -1825589953:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                if (string4.equals("telephoneNumberNational")) {
                                    c5 = 3;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1821235109:
                                obj3 = obj5;
                                obj4 = obj;
                                if (string4.equals(obj4)) {
                                    str = str2;
                                    c5 = 4;
                                    break;
                                }
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1757573738:
                                obj3 = obj5;
                                str = str2;
                                obj4 = obj;
                                if (string4.equals(obj3)) {
                                    c5 = 5;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1682373820:
                                if (string4.equals("creditCardExpirationDay")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 6;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1658955742:
                                if (string4.equals("fullStreetAddress")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 7;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1567118045:
                                if (string4.equals("telephoneNumberDevice")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = '\b';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1476752575:
                                if (string4.equals("countryName")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = '\t';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1413737489:
                                if (string4.equals("middleInitial")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = '\n';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1377792129:
                                if (string4.equals("addressCity")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 11;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1249512767:
                                if (string4.equals("gender")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = '\f';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1186060294:
                                if (string4.equals("postalAddressExtendedPostalCode")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = '\r';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -1151034798:
                                if (string4.equals("creditCardNumber")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 14;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -835992323:
                                if (string4.equals("namePrefix")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 15;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -818219584:
                                if (string4.equals("middleName")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 16;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -747304516:
                                if (string4.equals("nameSuffix")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 17;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -613980922:
                                if (string4.equals("creditCardExpirationDate")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 18;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -613352043:
                                if (string4.equals("creditCardExpirationYear")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 19;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -549230602:
                                if (string4.equals("telephoneNumberCountryCode")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 20;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case -265713450:
                                if (string4.equals("username")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 21;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 3373707:
                                if (string4.equals("name")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 22;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 96619420:
                                if (string4.equals("email")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 23;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 253202685:
                                if (string4.equals("addressState")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 24;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 588174851:
                                if (string4.equals("birthdayMonth")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 25;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 798554127:
                                if (string4.equals("familyName")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 26;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 892233837:
                                if (string4.equals("telephoneNumber")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 27;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 991032982:
                                if (string4.equals("newUsername")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 28;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 1069376125:
                                if (string4.equals("birthday")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 29;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 1216985755:
                                if (string4.equals(str2)) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 30;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 1469046696:
                                if (string4.equals("givenName")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = 31;
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 1662667945:
                                if (string4.equals("postalAddress")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = ' ';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 1921869058:
                                if (string4.equals("postalAddressExtended")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = '!';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 2011152728:
                                if (string4.equals("postalCode")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = '\"';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            case 2011773919:
                                if (string4.equals("birthdayDay")) {
                                    obj3 = obj5;
                                    obj4 = obj;
                                    str = str2;
                                    c5 = '#';
                                    break;
                                }
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                            default:
                                obj3 = obj5;
                                obj4 = obj;
                                str = str2;
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case RecognitionOptions.UNRECOGNIZED /* 0 */:
                                string4 = "birthDateYear";
                                continue;
                            case 1:
                                string4 = "smsOTPCode";
                                continue;
                            case 2:
                                string4 = obj2;
                                continue;
                            case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                                string4 = "phoneNational";
                                continue;
                            case 4:
                                string4 = obj4;
                                continue;
                            case q0.k.STRING_FIELD_NUMBER /* 5 */:
                                string4 = obj3;
                                continue;
                            case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                                string4 = "creditCardExpirationDay";
                                continue;
                            case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                                string4 = "streetAddress";
                                continue;
                            case '\b':
                                string4 = "phoneNumberDevice";
                                continue;
                            case '\t':
                                string4 = "addressCountry";
                                continue;
                            case '\n':
                                string4 = "personMiddleInitial";
                                continue;
                            case 11:
                                string4 = "addressLocality";
                                continue;
                            case '\f':
                                string4 = "gender";
                                continue;
                            case '\r':
                                string4 = "extendedPostalCode";
                                continue;
                            case 14:
                                string4 = "creditCardNumber";
                                continue;
                            case 15:
                                string4 = "personNamePrefix";
                                continue;
                            case 16:
                                string4 = "personMiddleName";
                                continue;
                            case 17:
                                string4 = "personNameSuffix";
                                continue;
                            case 18:
                                string4 = "creditCardExpirationDate";
                                continue;
                            case 19:
                                string4 = "creditCardExpirationYear";
                                continue;
                            case 20:
                                string4 = "phoneCountryCode";
                                continue;
                            case 21:
                                string4 = "username";
                                continue;
                            case 22:
                                string4 = "personName";
                                continue;
                            case 23:
                                string4 = "emailAddress";
                                continue;
                            case 24:
                                string4 = "addressRegion";
                                continue;
                            case 25:
                                string4 = "birthDateMonth";
                                continue;
                            case 26:
                                string4 = "personFamilyName";
                                continue;
                            case 27:
                                string4 = "phoneNumber";
                                continue;
                            case 28:
                                string4 = "newUsername";
                                continue;
                            case 29:
                                string4 = "birthDateFull";
                                continue;
                            case 30:
                                string4 = str;
                                continue;
                            case 31:
                                string4 = "personGivenName";
                                continue;
                            case ' ':
                                string4 = "postalAddress";
                                continue;
                            case '!':
                                string4 = "extendedAddress";
                                continue;
                            case '\"':
                                string4 = "postalCode";
                                continue;
                            case '#':
                                string4 = "birthDateDay";
                                continue;
                        }
                    }
                    strArr[r102] = string4;
                    r102++;
                    obj = obj4;
                    str2 = str;
                    string3 = str5;
                    obj5 = obj3;
                    jSONArray3 = jSONArray4;
                }
                iVar = new a1.i(string3, strArr, str4, v.a(jSONObject4));
            }
            return new s(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, a4, tVar, num, string, iVar, (String[]) arrayList.toArray(new String[arrayList.size()]), sVarArr);
        }
        throw new JSONException("Configuration JSON missing 'inputAction' property.");
    }
}
