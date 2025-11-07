package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A0.C0001b;
import V0.c;
import V0.i;
import a1.RunnableC0070a;
import a1.f;
import a1.g;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import e1.AbstractC0248a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2708a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int r6 = intent.getExtras().getInt("attemptNumber");
        i.b(context);
        C0001b a4 = c.a();
        if (queryParameter != null) {
            a4.f85L = queryParameter;
            a4.f86M = AbstractC0248a.b(intValue);
            if (queryParameter2 != null) {
                a4.f84K = Base64.decode(queryParameter2, 0);
            }
            g gVar = i.a().f1387d;
            c h3 = a4.h();
            RunnableC0070a runnableC0070a = RunnableC0070a.f1809J;
            gVar.getClass();
            gVar.f1826e.execute(new f(gVar, h3, r6, runnableC0070a));
            return;
        }
        throw new NullPointerException("Null backendName");
    }
}
