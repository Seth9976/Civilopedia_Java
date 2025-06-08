package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import B1.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import q0.i;
import q0.o;
import q2.b;
import w0.f;

public class JobInfoSchedulerService extends JobService {
    public static final int i;

    @Override  // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters0) {
        String s = jobParameters0.getExtras().getString("backendName");
        String s1 = jobParameters0.getExtras().getString("extras");
        int v = jobParameters0.getExtras().getInt("priority");
        int v1 = jobParameters0.getExtras().getInt("attemptNumber");
        o.b(this.getApplicationContext());
        a a0 = i.a();
        a0.E(s);
        a0.l = A0.a.b(v);
        if(s1 != null) {
            a0.k = Base64.decode(s1, 0);
        }
        o o0 = o.a();
        i i0 = a0.e();
        b b0 = new b(3, this, jobParameters0);
        o0.d.getClass();
        f f0 = new f(o0.d, i0, v1, b0);
        o0.d.e.execute(f0);
        return true;
    }

    @Override  // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters0) {
        return true;
    }
}

