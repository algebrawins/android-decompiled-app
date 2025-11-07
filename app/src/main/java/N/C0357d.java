package n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.google.android.libraries.barhopper.RecognitionOptions;
import java.io.IOException;
import o.j;
import org.xmlpull.v1.XmlPullParserException;
import p.AbstractC0426z;

/* renamed from: n.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0357d extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f4152e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class[] f4153f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f4154a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f4155b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f4156c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4157d;

    static {
        Class[] clsArr = {Context.class};
        f4152e = clsArr;
        f4153f = clsArr;
    }

    public C0357d(Context context) {
        super(context);
        this.f4156c = context;
        Object[] objArr = {context};
        this.f4154a = objArr;
        this.f4155b = objArr;
    }

    public static Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int r6;
        char charAt;
        char charAt2;
        boolean z3;
        ColorStateList colorStateList;
        int resourceId;
        C0356c c0356c = new C0356c(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            r6 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        String str = null;
        while (!z4) {
            if (eventType != r4) {
                if (eventType != r6) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z5 && name2.equals(str)) {
                            z5 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            c0356c.f4128b = 0;
                            c0356c.f4129c = 0;
                            c0356c.f4130d = 0;
                            c0356c.f4131e = 0;
                            c0356c.f4132f = r4;
                            c0356c.g = r4;
                        } else if (name2.equals("item")) {
                            if (!c0356c.f4133h) {
                                c0356c.f4133h = r4;
                                c0356c.b(c0356c.f4127a.add(c0356c.f4128b, c0356c.f4134i, c0356c.f4135j, c0356c.f4136k));
                            }
                        } else if (name2.equals("menu")) {
                            z4 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = 1;
                        r6 = 2;
                    }
                } else if (!z5) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C0357d c0357d = c0356c.f4126D;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c0357d.f4156c.obtainStyledAttributes(attributeSet, i.a.f3394l);
                        c0356c.f4128b = obtainStyledAttributes.getResourceId(r4, 0);
                        c0356c.f4129c = obtainStyledAttributes.getInt(3, 0);
                        c0356c.f4130d = obtainStyledAttributes.getInt(4, 0);
                        c0356c.f4131e = obtainStyledAttributes.getInt(5, 0);
                        c0356c.f4132f = obtainStyledAttributes.getBoolean(2, r4);
                        c0356c.g = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = c0357d.f4156c;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, i.a.f3395m);
                        c0356c.f4134i = obtainStyledAttributes2.getResourceId(2, 0);
                        c0356c.f4135j = (obtainStyledAttributes2.getInt(5, c0356c.f4129c) & (-65536)) | (obtainStyledAttributes2.getInt(6, c0356c.f4130d) & 65535);
                        c0356c.f4136k = obtainStyledAttributes2.getText(7);
                        c0356c.f4137l = obtainStyledAttributes2.getText(8);
                        c0356c.f4138m = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        if (string == null) {
                            charAt = 0;
                        } else {
                            charAt = string.charAt(0);
                        }
                        c0356c.f4139n = charAt;
                        c0356c.f4140o = obtainStyledAttributes2.getInt(16, RecognitionOptions.AZTEC);
                        String string2 = obtainStyledAttributes2.getString(10);
                        if (string2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = string2.charAt(0);
                        }
                        c0356c.f4141p = charAt2;
                        c0356c.f4142q = obtainStyledAttributes2.getInt(20, RecognitionOptions.AZTEC);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            c0356c.f4143r = obtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            c0356c.f4143r = c0356c.f4131e;
                        }
                        c0356c.f4144s = obtainStyledAttributes2.getBoolean(3, false);
                        c0356c.f4145t = obtainStyledAttributes2.getBoolean(4, c0356c.f4132f);
                        c0356c.f4146u = obtainStyledAttributes2.getBoolean(1, c0356c.g);
                        c0356c.f4147v = obtainStyledAttributes2.getInt(21, -1);
                        c0356c.f4150y = obtainStyledAttributes2.getString(12);
                        c0356c.f4148w = obtainStyledAttributes2.getResourceId(13, 0);
                        c0356c.f4149x = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        if (string3 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3 && c0356c.f4148w == 0 && c0356c.f4149x == null) {
                            if (c0356c.a(string3, f4153f, c0357d.f4155b) != null) {
                                throw new ClassCastException();
                            }
                        } else if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        c0356c.f4151z = obtainStyledAttributes2.getText(17);
                        c0356c.f4123A = obtainStyledAttributes2.getText(22);
                        if (obtainStyledAttributes2.hasValue(19)) {
                            c0356c.f4125C = AbstractC0426z.d(obtainStyledAttributes2.getInt(19, -1), c0356c.f4125C);
                        } else {
                            c0356c.f4125C = null;
                        }
                        if (obtainStyledAttributes2.hasValue(18)) {
                            if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = j.b.b(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                            }
                            c0356c.f4124B = colorStateList;
                        } else {
                            c0356c.f4124B = null;
                        }
                        obtainStyledAttributes2.recycle();
                        c0356c.f4133h = false;
                    } else {
                        if (name3.equals("menu")) {
                            c0356c.f4133h = true;
                            SubMenu addSubMenu = c0356c.f4127a.addSubMenu(c0356c.f4128b, c0356c.f4134i, c0356c.f4135j, c0356c.f4136k);
                            c0356c.b(addSubMenu.getItem());
                            b(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            str = name3;
                            z5 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = 1;
                        r6 = 2;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = 1;
                r6 = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int r4, Menu menu) {
        if (!(menu instanceof j)) {
            super.inflate(r4, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f4156c.getResources().getLayout(r4);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e4) {
                    throw new InflateException("Error inflating menu XML", e4);
                }
            } catch (IOException e5) {
                throw new InflateException("Error inflating menu XML", e5);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
