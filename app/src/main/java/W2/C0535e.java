package w2;

import c2.C0164c;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.util.List;
import r2.InterfaceC0445b;
import x1.AbstractC0609f5;

/* renamed from: w2.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0535e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C0535e f5368a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final B2.f f5369b = new B2.f(new C0164c(1));

    public static r2.l a() {
        return (r2.l) f5369b.a();
    }

    public static void b(r2.f fVar, final InterfaceC0536f interfaceC0536f, String str) {
        String str2;
        N2.g.e(fVar, "binaryMessenger");
        if (str.length() > 0) {
            str2 = ".".concat(str);
        } else {
            str2 = "";
        }
        R1.a j3 = fVar.j();
        a1.i iVar = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setBool", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar.l(null);
        }
        a1.i iVar2 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setString", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar2.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar2.l(null);
        }
        a1.i iVar3 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setInt", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar3.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar3.l(null);
        }
        a1.i iVar4 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDouble", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar4.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar4.l(null);
        }
        a1.i iVar5 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setEncodedStringList", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar5.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar5.l(null);
        }
        a1.i iVar6 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.setDeprecatedStringList", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar6.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar6.l(null);
        }
        a1.i iVar7 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getString", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar7.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar7.l(null);
        }
        a1.i iVar8 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getBool", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar8.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar8.l(null);
        }
        a1.i iVar9 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getDouble", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar9.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar9.l(null);
        }
        a1.i iVar10 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getInt", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar10.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar10.l(null);
        }
        a1.i iVar11 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getPlatformEncodedStringList", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar11.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar11.l(null);
        }
        a1.i iVar12 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getStringList", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar12.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar12.l(null);
        }
        a1.i iVar13 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.clear", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar13.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar13.l(null);
        }
        a1.i iVar14 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getAll", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar14.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar14.l(null);
        }
        a1.i iVar15 = new a1.i(fVar, D.C.I("dev.flutter.pigeon.shared_preferences_android.SharedPreferencesAsyncApi.getKeys", str2), a(), j3);
        if (interfaceC0536f != null) {
            iVar15.l(new InterfaceC0445b() { // from class: w2.d
                @Override // r2.InterfaceC0445b
                public final void c(Object obj, h2.J j4) {
                    List a4;
                    List a5;
                    List a6;
                    List a7;
                    List a8;
                    List a9;
                    List a10;
                    List a11;
                    List a12;
                    List a13;
                    List a14;
                    List a15;
                    List a16;
                    List a17;
                    List a18;
                    switch (r2) {
                        case RecognitionOptions.UNRECOGNIZED /* 0 */:
                            InterfaceC0536f interfaceC0536f2 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list = (List) obj;
                            Object obj2 = list.get(0);
                            N2.g.c(obj2, "null cannot be cast to non-null type kotlin.String");
                            String str3 = (String) obj2;
                            Object obj3 = list.get(1);
                            N2.g.c(obj3, "null cannot be cast to non-null type kotlin.String");
                            String str4 = (String) obj3;
                            Object obj4 = list.get(2);
                            N2.g.c(obj4, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f2.a(str3, str4, (C0537g) obj4);
                                a4 = C2.j.b(null);
                            } catch (Throwable th) {
                                a4 = AbstractC0609f5.a(th);
                            }
                            j4.h(a4);
                            return;
                        case 1:
                            InterfaceC0536f interfaceC0536f3 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list2 = (List) obj;
                            Object obj5 = list2.get(0);
                            N2.g.c(obj5, "null cannot be cast to non-null type kotlin.String");
                            String str5 = (String) obj5;
                            Object obj6 = list2.get(1);
                            N2.g.c(obj6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            List list3 = (List) obj6;
                            Object obj7 = list2.get(2);
                            N2.g.c(obj7, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f3.p(str5, list3, (C0537g) obj7);
                                a5 = C2.j.b(null);
                            } catch (Throwable th2) {
                                a5 = AbstractC0609f5.a(th2);
                            }
                            j4.h(a5);
                            return;
                        case 2:
                            InterfaceC0536f interfaceC0536f4 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list4 = (List) obj;
                            Object obj8 = list4.get(0);
                            N2.g.c(obj8, "null cannot be cast to non-null type kotlin.String");
                            String str6 = (String) obj8;
                            Object obj9 = list4.get(1);
                            N2.g.c(obj9, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a6 = C2.j.b(interfaceC0536f4.g(str6, (C0537g) obj9));
                            } catch (Throwable th3) {
                                a6 = AbstractC0609f5.a(th3);
                            }
                            j4.h(a6);
                            return;
                        case q0.k.INTEGER_FIELD_NUMBER /* 3 */:
                            InterfaceC0536f interfaceC0536f5 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list5 = (List) obj;
                            Object obj10 = list5.get(0);
                            N2.g.c(obj10, "null cannot be cast to non-null type kotlin.String");
                            String str7 = (String) obj10;
                            Object obj11 = list5.get(1);
                            N2.g.c(obj11, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a7 = C2.j.b(interfaceC0536f5.d(str7, (C0537g) obj11));
                            } catch (Throwable th4) {
                                a7 = AbstractC0609f5.a(th4);
                            }
                            j4.h(a7);
                            return;
                        case 4:
                            InterfaceC0536f interfaceC0536f6 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list6 = (List) obj;
                            Object obj12 = list6.get(0);
                            N2.g.c(obj12, "null cannot be cast to non-null type kotlin.String");
                            String str8 = (String) obj12;
                            Object obj13 = list6.get(1);
                            N2.g.c(obj13, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a8 = C2.j.b(interfaceC0536f6.k(str8, (C0537g) obj13));
                            } catch (Throwable th5) {
                                a8 = AbstractC0609f5.a(th5);
                            }
                            j4.h(a8);
                            return;
                        case q0.k.STRING_FIELD_NUMBER /* 5 */:
                            InterfaceC0536f interfaceC0536f7 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list7 = (List) obj;
                            Object obj14 = list7.get(0);
                            N2.g.c(obj14, "null cannot be cast to non-null type kotlin.String");
                            String str9 = (String) obj14;
                            Object obj15 = list7.get(1);
                            N2.g.c(obj15, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a9 = C2.j.b(interfaceC0536f7.j(str9, (C0537g) obj15));
                            } catch (Throwable th6) {
                                a9 = AbstractC0609f5.a(th6);
                            }
                            j4.h(a9);
                            return;
                        case q0.k.STRING_SET_FIELD_NUMBER /* 6 */:
                            InterfaceC0536f interfaceC0536f8 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list8 = (List) obj;
                            Object obj16 = list8.get(0);
                            N2.g.c(obj16, "null cannot be cast to non-null type kotlin.String");
                            String str10 = (String) obj16;
                            Object obj17 = list8.get(1);
                            N2.g.c(obj17, "null cannot be cast to non-null type kotlin.Boolean");
                            boolean booleanValue = ((Boolean) obj17).booleanValue();
                            Object obj18 = list8.get(2);
                            N2.g.c(obj18, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f8.e(str10, booleanValue, (C0537g) obj18);
                                a10 = C2.j.b(null);
                            } catch (Throwable th7) {
                                a10 = AbstractC0609f5.a(th7);
                            }
                            j4.h(a10);
                            return;
                        case q0.k.DOUBLE_FIELD_NUMBER /* 7 */:
                            InterfaceC0536f interfaceC0536f9 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list9 = (List) obj;
                            Object obj19 = list9.get(0);
                            N2.g.c(obj19, "null cannot be cast to non-null type kotlin.String");
                            String str11 = (String) obj19;
                            Object obj20 = list9.get(1);
                            N2.g.c(obj20, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a11 = C2.j.b(interfaceC0536f9.s(str11, (C0537g) obj20));
                            } catch (Throwable th8) {
                                a11 = AbstractC0609f5.a(th8);
                            }
                            j4.h(a11);
                            return;
                        case 8:
                            InterfaceC0536f interfaceC0536f10 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list10 = (List) obj;
                            Object obj21 = list10.get(0);
                            N2.g.c(obj21, "null cannot be cast to non-null type kotlin.String");
                            String str12 = (String) obj21;
                            Object obj22 = list10.get(1);
                            N2.g.c(obj22, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a12 = C2.j.b(interfaceC0536f10.l(str12, (C0537g) obj22));
                            } catch (Throwable th9) {
                                a12 = AbstractC0609f5.a(th9);
                            }
                            j4.h(a12);
                            return;
                        case 9:
                            InterfaceC0536f interfaceC0536f11 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list11 = (List) obj;
                            List list12 = (List) list11.get(0);
                            Object obj23 = list11.get(1);
                            N2.g.c(obj23, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f11.r(list12, (C0537g) obj23);
                                a13 = C2.j.b(null);
                            } catch (Throwable th10) {
                                a13 = AbstractC0609f5.a(th10);
                            }
                            j4.h(a13);
                            return;
                        case 10:
                            InterfaceC0536f interfaceC0536f12 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list13 = (List) obj;
                            List list14 = (List) list13.get(0);
                            Object obj24 = list13.get(1);
                            N2.g.c(obj24, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a14 = C2.j.b(interfaceC0536f12.n(list14, (C0537g) obj24));
                            } catch (Throwable th11) {
                                a14 = AbstractC0609f5.a(th11);
                            }
                            j4.h(a14);
                            return;
                        case 11:
                            InterfaceC0536f interfaceC0536f13 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list15 = (List) obj;
                            List list16 = (List) list15.get(0);
                            Object obj25 = list15.get(1);
                            N2.g.c(obj25, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                a15 = C2.j.b(interfaceC0536f13.i(list16, (C0537g) obj25));
                            } catch (Throwable th12) {
                                a15 = AbstractC0609f5.a(th12);
                            }
                            j4.h(a15);
                            return;
                        case 12:
                            InterfaceC0536f interfaceC0536f14 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list17 = (List) obj;
                            Object obj26 = list17.get(0);
                            N2.g.c(obj26, "null cannot be cast to non-null type kotlin.String");
                            String str13 = (String) obj26;
                            Object obj27 = list17.get(1);
                            N2.g.c(obj27, "null cannot be cast to non-null type kotlin.String");
                            String str14 = (String) obj27;
                            Object obj28 = list17.get(2);
                            N2.g.c(obj28, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f14.m(str13, str14, (C0537g) obj28);
                                a16 = C2.j.b(null);
                            } catch (Throwable th13) {
                                a16 = AbstractC0609f5.a(th13);
                            }
                            j4.h(a16);
                            return;
                        case 13:
                            InterfaceC0536f interfaceC0536f15 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list18 = (List) obj;
                            Object obj29 = list18.get(0);
                            N2.g.c(obj29, "null cannot be cast to non-null type kotlin.String");
                            String str15 = (String) obj29;
                            Object obj30 = list18.get(1);
                            N2.g.c(obj30, "null cannot be cast to non-null type kotlin.Long");
                            long longValue = ((Long) obj30).longValue();
                            Object obj31 = list18.get(2);
                            N2.g.c(obj31, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f15.q(str15, longValue, (C0537g) obj31);
                                a17 = C2.j.b(null);
                            } catch (Throwable th14) {
                                a17 = AbstractC0609f5.a(th14);
                            }
                            j4.h(a17);
                            return;
                        default:
                            InterfaceC0536f interfaceC0536f16 = interfaceC0536f;
                            N2.g.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            List list19 = (List) obj;
                            Object obj32 = list19.get(0);
                            N2.g.c(obj32, "null cannot be cast to non-null type kotlin.String");
                            String str16 = (String) obj32;
                            Object obj33 = list19.get(1);
                            N2.g.c(obj33, "null cannot be cast to non-null type kotlin.Double");
                            double doubleValue = ((Double) obj33).doubleValue();
                            Object obj34 = list19.get(2);
                            N2.g.c(obj34, "null cannot be cast to non-null type io.flutter.plugins.sharedpreferences.SharedPreferencesPigeonOptions");
                            try {
                                interfaceC0536f16.c(str16, doubleValue, (C0537g) obj34);
                                a18 = C2.j.b(null);
                            } catch (Throwable th15) {
                                a18 = AbstractC0609f5.a(th15);
                            }
                            j4.h(a18);
                            return;
                    }
                }
            });
        } else {
            iVar15.l(null);
        }
    }
}
