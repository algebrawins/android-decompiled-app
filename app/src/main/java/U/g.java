package U;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public Context f1233a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f1234b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f1235c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f1236d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f1237e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f1238f;
    public PendingIntent g;

    /* renamed from: h  reason: collision with root package name */
    public int f1239h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1240i;

    /* renamed from: j  reason: collision with root package name */
    public A.f f1241j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1242k;

    /* renamed from: l  reason: collision with root package name */
    public Bundle f1243l;

    /* renamed from: m  reason: collision with root package name */
    public String f1244m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1245n;

    /* renamed from: o  reason: collision with root package name */
    public Notification f1246o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList f1247p;

    public static CharSequence a(String str) {
        if (str == null) {
            return str;
        }
        if (str.length() > 5120) {
            return str.subSequence(0, 5120);
        }
        return str;
    }

    public final void b(A.f fVar) {
        if (this.f1241j != fVar) {
            this.f1241j = fVar;
            if (((g) fVar.f10K) != this) {
                fVar.f10K = this;
                b(fVar);
            }
        }
    }
}
