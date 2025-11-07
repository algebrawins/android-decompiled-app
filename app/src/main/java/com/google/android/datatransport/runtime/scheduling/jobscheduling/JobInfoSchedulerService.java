package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import A0.C0001b;
import H.e;
import V0.c;
import V0.i;
import a1.f;
import a1.g;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import e1.AbstractC0248a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: J  reason: collision with root package name */
    public static final /* synthetic */ int f2709J = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int r22 = jobParameters.getExtras().getInt("priority");
        int r3 = jobParameters.getExtras().getInt("attemptNumber");
        i.b(getApplicationContext());
        C0001b a4 = c.a();
        if (string != null) {
            a4.f85L = string;
            a4.f86M = AbstractC0248a.b(r22);
            if (string2 != null) {
                a4.f84K = Base64.decode(string2, 0);
            }
            g gVar = i.a().f1387d;
            c h3 = a4.h();
            e eVar = new e(12, this, jobParameters);
            gVar.getClass();
            gVar.f1826e.execute(new f(gVar, h3, r3, eVar));
            return true;
        }
        throw new NullPointerException("Null backendName");
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
