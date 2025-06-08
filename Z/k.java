package Z;

import B.o;
import B1.a;
import J3.d;
import O.h;
import O.j;
import O.l;
import Y.b;
import Y.m;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import i0.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import z1.a0;

public final class k extends a0 {
    public final Context k;
    public final b l;
    public final WorkDatabase m;
    public final a n;
    public final List o;
    public final Z.b p;
    public final e q;
    public boolean r;
    public BroadcastReceiver.PendingResult s;
    public static k t;
    public static k u;
    public static final Object v;

    static {
        new String("WM-WorkManagerImpl");
        k.t = null;
        k.u = null;
        k.v = new Object();
    }

    public k(Context context0, b b0, a a0) {
        c c1;
        Object object0;
        h h1;
        boolean z = context0.getResources().getBoolean(0x7F030006);  // bool:workmanager_test_configuration
        Context context1 = context0.getApplicationContext();
        i0.h h0 = (i0.h)a0.j;
        if(z) {
            h1 = new h(context1, null);
            h1.g = true;
        }
        else {
            h1 = new h(context1, "androidx.work.workdb");
            h1.f = new D3.b(context1, 10);
        }
        h1.d = h0;
        f f0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        if(h1.c == null) {
            h1.c = new ArrayList();
        }
        h1.c.add(f0);
        h1.a(new P.a[]{i.a});
        h1.a(new P.a[]{new Z.h(context1, 2, 3)});
        h1.a(new P.a[]{i.b});
        h1.a(new P.a[]{i.c});
        h1.a(new P.a[]{new Z.h(context1, 5, 6)});
        h1.a(new P.a[]{i.d});
        h1.a(new P.a[]{i.e});
        h1.a(new P.a[]{i.f});
        h1.a(new P.a[]{new Z.h(context1)});
        h1.a(new P.a[]{new Z.h(context1, 10, 11)});
        h1.a(new P.a[]{i.g});
        h1.h = false;
        h1.i = true;
        Context context2 = h1.b;
        if(context2 == null) {
            throw new IllegalArgumentException("Cannot provide null context for the database.");
        }
        Class class0 = WorkDatabase.class;
        Executor executor0 = h1.d;
        if(executor0 == null && h1.e == null) {
            h1.e = m.a.e;
            h1.d = m.a.e;
        }
        else if(executor0 != null && h1.e == null) {
            h1.e = executor0;
        }
        else if(executor0 == null) {
            Executor executor1 = h1.e;
            if(executor1 != null) {
                h1.d = executor1;
            }
        }
        if(h1.f == null) {
            h1.f = new d(6);
        }
        R.b b1 = h1.f;
        ArrayList arrayList0 = h1.c;
        boolean z1 = h1.g;
        ActivityManager activityManager0 = (ActivityManager)context2.getSystemService("activity");
        int v = activityManager0 == null || activityManager0.isLowRamDevice() ? 2 : 3;
        Executor executor2 = h1.d;
        O.a a1 = new O.a(context2, h1.a, b1, h1.j, arrayList0, z1, v, executor2, h1.e, h1.h, h1.i);
        String s = class0.getPackage().getName();
        String s1 = (s.isEmpty() ? class0.getCanonicalName() : class0.getCanonicalName().substring(s.length() + 1)).replace('.', '_') + "_Impl";
        try {
            object0 = Class.forName((s.isEmpty() ? s1 : s + "." + s1)).newInstance();
        }
        catch(ClassNotFoundException unused_ex) {
            throw new RuntimeException("cannot find implementation for " + class0.getCanonicalName() + ". " + s1 + " does not exist");
        }
        catch(IllegalAccessException unused_ex) {
            throw new RuntimeException("Cannot access the constructor" + class0.getCanonicalName());
        }
        catch(InstantiationException unused_ex) {
            throw new RuntimeException("Failed to create an instance of " + class0.getCanonicalName());
        }
        R.c c0 = ((j)object0).e(a1);
        ((j)object0).c = c0;
        if(c0 instanceof l) {
            ((l)c0).getClass();
        }
        c0.setWriteAheadLoggingEnabled(v == 3);
        ((j)object0).g = arrayList0;
        ((j)object0).b = executor2;
        new ArrayDeque();
        ((j)object0).e = z1;
        ((j)object0).f = v == 3;
        super();
        Context context3 = context0.getApplicationContext();
        m m0 = new m(b0.f, 0);
        __monitor_enter(m.class);
        m.k = m0;
        __monitor_exit(m.class);
        if(Build.VERSION.SDK_INT >= 23) {
            c1 = new c0.d(context3, this);
            i0.f.a(context3, SystemJobService.class, true);
            m.d().a("WM-Schedulers", "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        }
        else {
            try {
                c1 = (c)Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context3);
                m.d().a("WM-Schedulers", "Created androidx.work.impl.background.gcm.GcmScheduler", new Throwable[0]);
            }
            catch(Throwable throwable0) {
                m.d().a("WM-Schedulers", "Unable to create GCM Scheduler", new Throwable[]{throwable0});
                c1 = null;
            }
            if(c1 == null) {
                c1 = new b0.h(context3);
                i0.f.a(context3, SystemAlarmService.class, true);
                m.d().a("WM-Schedulers", "Created SystemAlarmScheduler", new Throwable[0]);
            }
        }
        List list0 = Arrays.asList(new c[]{c1, new a0.b(context3, b0, a0, this)});
        Z.b b2 = new Z.b(context0, b0, a0, ((WorkDatabase)(((j)object0))), list0);
        Context context4 = context0.getApplicationContext();
        this.k = context4;
        this.l = b0;
        this.n = a0;
        this.m = (WorkDatabase)(((j)object0));
        this.o = list0;
        this.p = b2;
        this.q = new e(((WorkDatabase)(((j)object0))));
        this.r = false;
        if(Build.VERSION.SDK_INT >= 24 && context4.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        i0.d d0 = new i0.d(context4, this);
        this.n.k(d0);
    }

    public static k T() {
        synchronized(k.v) {
            k k0 = k.t;
            if(k0 != null) {
                return k0;
            }
        }
        return k.u;
    }

    public static k U(Context context0) {
        synchronized(k.v) {
            k k0 = k.T();
            if(k0 != null) {
                return k0;
            }
            context0.getApplicationContext();
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void V(Context context0, b b0) {
        synchronized(k.v) {
            k k0 = k.t;
            if(k0 != null && k.u != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if(k0 == null) {
                Context context1 = context0.getApplicationContext();
                if(k.u == null) {
                    k.u = new k(context1, b0, new a(b0.b));
                }
                k.t = k.u;
            }
        }
    }

    public final void W() {
        synchronized(k.v) {
            this.r = true;
            BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.s;
            if(broadcastReceiver$PendingResult0 != null) {
                broadcastReceiver$PendingResult0.finish();
                this.s = null;
            }
        }
    }

    public final void X() {
        WorkDatabase workDatabase0 = this.m;
        if(Build.VERSION.SDK_INT >= 23) {
            Context context0 = this.k;
            JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
            if(jobScheduler0 != null) {
                ArrayList arrayList0 = c0.d.e(context0, jobScheduler0);
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    for(Object object0: arrayList0) {
                        c0.d.a(jobScheduler0, ((JobInfo)object0).getId());
                    }
                }
            }
        }
        E1.d d0 = workDatabase0.n();
        WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)d0.i;
        workDatabase_Impl0.b();
        h0.e e0 = (h0.e)d0.q;
        S.f f0 = e0.a();
        workDatabase_Impl0.c();
        try {
            f0.l.executeUpdateDelete();
            workDatabase_Impl0.h();
        }
        finally {
            workDatabase_Impl0.f();
            e0.c(f0);
        }
        Z.d.a(this.l, workDatabase0, this.o);
    }

    public final void Y(String s, a a0) {
        o o0 = new o(11);
        o0.j = this;
        o0.k = s;
        o0.l = a0;
        this.n.k(o0);
    }

    public final void Z(String s) {
        i0.i i0 = new i0.i(this, s, false);
        this.n.k(i0);
    }
}

