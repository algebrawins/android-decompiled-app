package a1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import b1.InterfaceC0147c;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e1.AbstractC0248a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import x1.A0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1815a;

    /* renamed from: b  reason: collision with root package name */
    public final InterfaceC0147c f1816b;

    /* renamed from: c  reason: collision with root package name */
    public final C0071b f1817c;

    public d(Context context, InterfaceC0147c interfaceC0147c, C0071b c0071b) {
        this.f1815a = context;
        this.f1816b = interfaceC0147c;
        this.f1817c = c0071b;
    }

    public final void a(V0.c cVar, int r20, boolean z3) {
        Long l3;
        Context context = this.f1815a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(cVar.f1368a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        S0.c cVar2 = cVar.f1370c;
        adler32.update(allocate.putInt(AbstractC0248a.a(cVar2)).array());
        byte[] bArr = cVar.f1369b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int r6 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (r6 >= r20) {
                        A0.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", cVar);
                        return;
                    }
                }
            }
        }
        SQLiteDatabase a4 = ((b1.h) this.f1816b).a();
        String valueOf = String.valueOf(AbstractC0248a.a(cVar2));
        String str = cVar.f1368a;
        Cursor rawQuery = a4.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, valueOf});
        try {
            if (rawQuery.moveToNext()) {
                l3 = Long.valueOf(rawQuery.getLong(0));
            } else {
                l3 = 0L;
            }
            rawQuery.close();
            long longValue = l3.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C0071b c0071b = this.f1817c;
            Long l4 = l3;
            builder.setMinimumLatency(c0071b.a(cVar2, longValue, r20));
            Set set = ((C0072c) c0071b.f1811b.get(cVar2)).f1814c;
            if (set.contains(e.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(e.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(e.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", r20);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC0248a.a(cVar2));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Log.d("TransportRuntime.".concat("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", cVar, Integer.valueOf(value), Long.valueOf(c0071b.a(cVar2, longValue, r20)), l4, Integer.valueOf(r20)));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }
}
