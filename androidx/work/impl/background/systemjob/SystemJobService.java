package androidx.work.impl.background.systemjob;

import Y.m;
import Z.a;
import Z.k;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import q.e;

public class SystemJobService extends JobService implements a {
    public k i;
    public final HashMap j;
    public static final String k;

    static {
        SystemJobService.k = "WM-SystemJobService";
    }

    public SystemJobService() {
        this.j = new HashMap();
    }

    @Override  // Z.a
    public final void a(String s, boolean z) {
        JobParameters jobParameters0;
        m.d().a("WM-SystemJobService", e.b(s, " executed on JobScheduler"), new Throwable[0]);
        synchronized(this.j) {
            jobParameters0 = (JobParameters)this.j.remove(s);
        }
        if(jobParameters0 != null) {
            this.jobFinished(jobParameters0, z);
        }
    }

    @Override  // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k k0 = k.U(this.getApplicationContext());
            this.i = k0;
            k0.p.b(this);
        }
        catch(IllegalStateException unused_ex) {
            Class class0 = this.getApplication().getClass();
            if(!Application.class.equals(class0)) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            m.d().g("WM-SystemJobService", "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override  // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k k0 = this.i;
        if(k0 != null) {
            k0.p.f(this);
        }
    }

    @Override  // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters0) {
        String s;
        B1.a a0;
        if(this.i == null) {
            m.d().a("WM-SystemJobService", "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            this.jobFinished(jobParameters0, true);
            return false;
        }
        try {
            a0 = null;
            PersistableBundle persistableBundle0 = jobParameters0.getExtras();
            s = null;
            if(persistableBundle0 != null && persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID")) {
                s = persistableBundle0.getString("EXTRA_WORK_SPEC_ID");
            }
        }
        catch(NullPointerException unused_ex) {
        }
        if(TextUtils.isEmpty(s)) {
            m.d().b("WM-SystemJobService", "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized(this.j) {
            if(this.j.containsKey(s)) {
                m.d().a("WM-SystemJobService", "Job is already being executed by SystemJobService: " + s, new Throwable[0]);
                return false;
            }
            m.d().a("WM-SystemJobService", "onStartJob for " + s, new Throwable[0]);
            this.j.put(s, jobParameters0);
        }
        int v1 = Build.VERSION.SDK_INT;
        if(v1 >= 24) {
            a0 = new B1.a();
            if(jobParameters0.getTriggeredContentUris() != null) {
                a0.k = Arrays.asList(jobParameters0.getTriggeredContentUris());
            }
            if(jobParameters0.getTriggeredContentAuthorities() != null) {
                a0.j = Arrays.asList(jobParameters0.getTriggeredContentAuthorities());
            }
            if(v1 >= 28) {
                a0.l = jobParameters0.getNetwork();
            }
        }
        this.i.Y(s, a0);
        return true;
    }

    @Override  // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters0) {
        String s;
        if(this.i == null) {
            m.d().a("WM-SystemJobService", "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle persistableBundle0 = jobParameters0.getExtras();
            s = null;
            if(persistableBundle0 != null && persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID")) {
                s = persistableBundle0.getString("EXTRA_WORK_SPEC_ID");
            }
        }
        catch(NullPointerException unused_ex) {
        }
        if(TextUtils.isEmpty(s)) {
            m.d().b("WM-SystemJobService", "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        m.d().a("WM-SystemJobService", "onStopJob for " + s, new Throwable[0]);
        synchronized(this.j) {
            this.j.remove(s);
        }
        this.i.Z(s);
        return !this.i.p.d(s);
    }
}

