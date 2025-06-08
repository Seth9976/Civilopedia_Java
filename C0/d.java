package c0;

import A.b;
import A.f;
import Y.m;
import Z.c;
import Z.k;
import android.app.job.JobInfo.Builder;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import h0.i;
import i0.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class d implements c {
    public final Context i;
    public final JobScheduler j;
    public final k k;
    public final c0.c l;
    public static final String m;

    static {
        d.m = "WM-SystemJobScheduler";
    }

    public d(Context context0, k k0) {
        JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
        c0.c c0 = new c0.c(context0);
        super();
        this.i = context0;
        this.k = k0;
        this.j = jobScheduler0;
        this.l = c0;
    }

    public static void a(JobScheduler jobScheduler0, int v) {
        try {
            jobScheduler0.cancel(v);
        }
        catch(Throwable throwable0) {
            m.d().b("WM-SystemJobScheduler", String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", v), new Throwable[]{throwable0});
        }
    }

    @Override  // Z.c
    public final void b(String s) {
        JobScheduler jobScheduler0 = this.j;
        ArrayList arrayList0 = d.c(this.i, jobScheduler0, s);
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(Object object0: arrayList0) {
                d.a(jobScheduler0, ((int)(((Integer)object0))));
            }
            this.k.m.k().D(s);
        }
    }

    public static ArrayList c(Context context0, JobScheduler jobScheduler0, String s) {
        String s1;
        ArrayList arrayList0 = d.e(context0, jobScheduler0);
        if(arrayList0 == null) {
            return null;
        }
        ArrayList arrayList1 = new ArrayList(2);
        for(Object object0: arrayList0) {
            JobInfo jobInfo0 = (JobInfo)object0;
            PersistableBundle persistableBundle0 = jobInfo0.getExtras();
            if(persistableBundle0 != null) {
                try {
                    if(persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID")) {
                        s1 = persistableBundle0.getString("EXTRA_WORK_SPEC_ID");
                        goto label_14;
                    }
                }
                catch(NullPointerException unused_ex) {
                }
            }
            s1 = null;
        label_14:
            if(s.equals(s1)) {
                arrayList1.add(jobInfo0.getId());
            }
        }
        return arrayList1;
    }

    @Override  // Z.c
    public final void d(i[] arr_i) {
        int v3;
        int v1;
        k k0 = this.k;
        WorkDatabase workDatabase0 = k0.m;
        e e0 = new e(workDatabase0);
        for(int v = 0; v < arr_i.length; ++v) {
            i i0 = arr_i[v];
            workDatabase0.c();
            try {
                i i1 = workDatabase0.n().l(i0.a);
                if(i1 == null) {
                    m.d().g("WM-SystemJobScheduler", "Skipping scheduling " + i0.a + " because it\'s no longer in the DB", new Throwable[0]);
                }
                else if(i1.b == 1) {
                    h0.d d0 = workDatabase0.k().s(i0.a);
                    if(d0 == null) {
                        k0.l.getClass();
                        v1 = e0.a(k0.l.g);
                    }
                    else {
                        v1 = d0.b;
                    }
                    if(d0 == null) {
                        h0.d d1 = new h0.d(i0.a, v1);
                        k0.m.k().y(d1);
                    }
                    this.g(i0, v1);
                    if(Build.VERSION.SDK_INT == 23) {
                        ArrayList arrayList0 = d.c(this.i, this.j, i0.a);
                        if(arrayList0 != null) {
                            int v2 = arrayList0.indexOf(v1);
                            if(v2 >= 0) {
                                arrayList0.remove(v2);
                            }
                            if(arrayList0.isEmpty()) {
                                k0.l.getClass();
                                v3 = e0.a(k0.l.g);
                            }
                            else {
                                v3 = (int)(((Integer)arrayList0.get(0)));
                            }
                            this.g(i0, v3);
                        }
                    }
                }
                else {
                    m.d().g("WM-SystemJobScheduler", "Skipping scheduling " + i0.a + " because it is no longer enqueued", new Throwable[0]);
                }
                workDatabase0.h();
            }
            catch(Throwable throwable0) {
                workDatabase0.f();
                throw throwable0;
            }
            workDatabase0.f();
        }
    }

    public static ArrayList e(Context context0, JobScheduler jobScheduler0) {
        List list0;
        try {
            list0 = jobScheduler0.getAllPendingJobs();
        }
        catch(Throwable throwable0) {
            m.d().b("WM-SystemJobScheduler", "getAllPendingJobs() is not reliable on this device.", new Throwable[]{throwable0});
            list0 = null;
        }
        if(list0 == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        ComponentName componentName0 = new ComponentName(context0, SystemJobService.class);
        for(Object object0: list0) {
            JobInfo jobInfo0 = (JobInfo)object0;
            if(componentName0.equals(jobInfo0.getService())) {
                arrayList0.add(jobInfo0);
            }
        }
        return arrayList0;
    }

    @Override  // Z.c
    public final boolean f() {
        return true;
    }

    public final void g(i i0, int v) {
        JobScheduler jobScheduler0 = this.j;
        this.l.getClass();
        Y.c c0 = i0.j;
        PersistableBundle persistableBundle0 = new PersistableBundle();
        persistableBundle0.putString("EXTRA_WORK_SPEC_ID", i0.a);
        a.b(persistableBundle0, i0.c());
        JobInfo.Builder jobInfo$Builder0 = new JobInfo.Builder(v, this.l.a).setRequiresCharging(c0.b).setRequiresDeviceIdle(c0.c).setExtras(persistableBundle0);
        int v1 = c0.a;
        int v2 = Build.VERSION.SDK_INT;
        if(v2 < 30 || v1 != 6) {
            int v3 = 4;
            switch(q.e.c(v1)) {
                case 0: {
                    v3 = 0;
                    break;
                }
                case 1: {
                    v3 = 1;
                    break;
                }
                case 2: {
                    v3 = 2;
                    break;
                }
                case 3: {
                    if(v2 >= 24) {
                        v3 = 3;
                    }
                    else {
                        m.d().a("WM-SystemJobInfoConvert", "API version too low. Cannot convert network type value " + f.w(v1), new Throwable[0]);
                        v3 = 1;
                    }
                    break;
                }
                case 4: {
                    if(v2 < 26) {
                        m.d().a("WM-SystemJobInfoConvert", "API version too low. Cannot convert network type value " + f.w(v1), new Throwable[0]);
                        v3 = 1;
                    }
                    break;
                }
                default: {
                    m.d().a("WM-SystemJobInfoConvert", "API version too low. Cannot convert network type value " + f.w(v1), new Throwable[0]);
                    v3 = 1;
                }
            }
            jobInfo$Builder0.setRequiredNetworkType(v3);
        }
        else {
            jobInfo$Builder0.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        if(!c0.c) {
            jobInfo$Builder0.setBackoffCriteria(i0.m, (i0.l == 2 ? 0 : 1));
        }
        long v4 = Math.max(i0.a() - System.currentTimeMillis(), 0L);
        if(v2 <= 28) {
            jobInfo$Builder0.setMinimumLatency(v4);
        }
        else if(v4 > 0L) {
            jobInfo$Builder0.setMinimumLatency(v4);
        }
        else if(!i0.q) {
            C.a.p(jobInfo$Builder0);
        }
        if(v2 >= 24 && c0.h.a.size() > 0) {
            for(Object object0: c0.h.a) {
                jobInfo$Builder0.addTriggerContentUri(b.b(((Y.d)object0).a, ((int)((Y.d)object0).b)));
            }
            jobInfo$Builder0.setTriggerContentUpdateDelay(c0.f);
            jobInfo$Builder0.setTriggerContentMaxDelay(c0.g);
        }
        jobInfo$Builder0.setPersisted(false);
        if(Build.VERSION.SDK_INT >= 26) {
            jobInfo$Builder0.setRequiresBatteryNotLow(c0.d);
            jobInfo$Builder0.setRequiresStorageNotLow(c0.e);
        }
        if(i0.q && i0.k <= 0) {
            P0.f.p(jobInfo$Builder0);
        }
        JobInfo jobInfo0 = jobInfo$Builder0.build();
        m.d().a("WM-SystemJobScheduler", "Scheduling work ID " + i0.a + " Job ID " + v, new Throwable[0]);
        try {
            if(jobScheduler0.schedule(jobInfo0) == 0) {
                m.d().g("WM-SystemJobScheduler", "Unable to schedule work ID " + i0.a, new Throwable[0]);
                if(i0.q && i0.r == 1) {
                    i0.q = false;
                    String s = i0.a;
                    m.d().a("WM-SystemJobScheduler", "Scheduling a non-expedited job (work ID " + s + ")", new Throwable[0]);
                    this.g(i0, v);
                }
            }
        }
        catch(IllegalStateException illegalStateException0) {
            ArrayList arrayList0 = d.e(this.i, jobScheduler0);
            String s1 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", ((int)(arrayList0 == null ? 0 : arrayList0.size())), this.k.m.n().h().size(), ((int)(Build.VERSION.SDK_INT == 23 ? this.k.l.h / 2 : this.k.l.h)));
            m.d().b("WM-SystemJobScheduler", s1, new Throwable[0]);
            throw new IllegalStateException(s1, illegalStateException0);
        }
        catch(Throwable throwable0) {
            m.d().b("WM-SystemJobScheduler", "Unable to schedule " + i0, new Throwable[]{throwable0});
        }
    }
}

