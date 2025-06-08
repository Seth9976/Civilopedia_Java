package i0;

import B1.a;
import E.l;
import S.f;
import Y.b;
import Y.m;
import Z.j;
import Z.k;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver;
import f0.g;
import h0.c;
import h0.e;
import h0.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class d implements Runnable {
    public final Context i;
    public final k j;
    public int k;
    public static final String l;
    public static final long m;

    static {
        d.l = "WM-ForceStopRunnable";
        d.m = TimeUnit.DAYS.toMillis(3650L);
    }

    public d(Context context0, k k0) {
        this.i = context0.getApplicationContext();
        this.j = k0;
        this.k = 0;
    }

    public final void a() {
        boolean z;
        String s;
        Context context0 = this.i;
        k k0 = this.j;
        if(Build.VERSION.SDK_INT >= 23) {
            JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
            ArrayList arrayList0 = c0.d.e(context0, jobScheduler0);
            a a0 = k0.m.k();
            a0.getClass();
            O.k k1 = O.k.c(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
            WorkDatabase_Impl workDatabase_Impl0 = (WorkDatabase_Impl)a0.j;
            workDatabase_Impl0.b();
            Cursor cursor0 = workDatabase_Impl0.g(k1);
            try {
                ArrayList arrayList1 = new ArrayList(cursor0.getCount());
                while(cursor0.moveToNext()) {
                    arrayList1.add(cursor0.getString(0));
                }
            }
            finally {
                cursor0.close();
                k1.release();
            }
            HashSet hashSet0 = new HashSet((arrayList0 == null ? 0 : arrayList0.size()));
            if(arrayList0 != null && !arrayList0.isEmpty()) {
                for(Object object0: arrayList0) {
                    JobInfo jobInfo0 = (JobInfo)object0;
                    PersistableBundle persistableBundle0 = jobInfo0.getExtras();
                    if(persistableBundle0 != null) {
                        try {
                            if(persistableBundle0.containsKey("EXTRA_WORK_SPEC_ID")) {
                                s = persistableBundle0.getString("EXTRA_WORK_SPEC_ID");
                                goto label_32;
                            }
                        }
                        catch(NullPointerException unused_ex) {
                        }
                    }
                    s = null;
                label_32:
                    if(TextUtils.isEmpty(s)) {
                        c0.d.a(jobScheduler0, jobInfo0.getId());
                    }
                    else {
                        hashSet0.add(s);
                    }
                }
            }
            z = false;
            for(Object object1: arrayList1) {
                if(!hashSet0.contains(((String)object1))) {
                    m.d().a("WM-SystemJobScheduler", "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            }
            if(z) {
                WorkDatabase workDatabase0 = k0.m;
                workDatabase0.c();
                try {
                    E1.d d0 = workDatabase0.n();
                    for(Object object2: arrayList1) {
                        d0.o(((String)object2), -1L);
                    }
                    workDatabase0.h();
                }
                finally {
                    workDatabase0.f();
                }
            }
        }
        else {
            z = false;
        }
        WorkDatabase workDatabase1 = k0.m;
        E1.d d1 = workDatabase1.n();
        g g0 = workDatabase1.m();
        workDatabase1.c();
        try {
            ArrayList arrayList2 = d1.g();
            boolean z1 = arrayList2.isEmpty();
            if(!z1) {
                for(Object object3: arrayList2) {
                    d1.s(1, new String[]{((i)object3).a});
                    d1.o(((i)object3).a, -1L);
                }
            }
            WorkDatabase_Impl workDatabase_Impl1 = (WorkDatabase_Impl)g0.j;
            workDatabase_Impl1.b();
            e e0 = (e)g0.m;
            f f0 = e0.a();
            workDatabase_Impl1.c();
            try {
                f0.l();
                workDatabase_Impl1.h();
            }
            catch(Throwable throwable0) {
                workDatabase_Impl1.f();
                e0.c(f0);
                throw throwable0;
            }
            workDatabase_Impl1.f();
            e0.c(f0);
            workDatabase1.h();
        }
        finally {
            workDatabase1.f();
        }
        Long long0 = k0.q.a.j().j("reschedule_needed");
        if(long0 != null && ((long)long0) == 1L) {
            m.d().a("WM-ForceStopRunnable", "Rescheduling Workers.", new Throwable[0]);
            k0.X();
            k0.q.getClass();
            c c0 = new c("reschedule_needed", 0L);
            k0.q.a.j().m(c0);
            return;
        }
        try {
            Intent intent0 = new Intent();
            intent0.setComponent(new ComponentName(context0, ForceStopRunnable.BroadcastReceiver.class));
            intent0.setAction("ACTION_FORCE_STOP_RESCHEDULE");
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, -1, intent0, 0x22000000);
            if(Build.VERSION.SDK_INT >= 30) {
                if(pendingIntent0 != null) {
                    pendingIntent0.cancel();
                }
                List list0 = l.l(((ActivityManager)context0.getSystemService("activity")));
                if(list0 != null && !list0.isEmpty()) {
                    int v3 = 0;
                    while(true) {
                        if(v3 >= list0.size()) {
                            break;
                        }
                        if(l.d(list0.get(v3)).getReason() == 10) {
                            goto label_115;
                        }
                        ++v3;
                    }
                }
            }
            else {
                goto label_119;
            }
            goto label_127;
        }
        catch(SecurityException | IllegalArgumentException securityException0) {
            m.d().g("WM-ForceStopRunnable", "Ignoring exception", new Throwable[]{securityException0});
            m.d().a("WM-ForceStopRunnable", "Application was force-stopped, rescheduling.", new Throwable[0]);
            k0.X();
            return;
        }
    label_115:
        m.d().a("WM-ForceStopRunnable", "Application was force-stopped, rescheduling.", new Throwable[0]);
        k0.X();
        return;
        try {
        label_119:
            if(pendingIntent0 == null) {
                d.c(context0);
                goto label_124;
            }
            goto label_127;
        }
        catch(SecurityException | IllegalArgumentException securityException0) {
        }
        m.d().g("WM-ForceStopRunnable", "Ignoring exception", new Throwable[]{securityException0});
    label_124:
        m.d().a("WM-ForceStopRunnable", "Application was force-stopped, rescheduling.", new Throwable[0]);
        k0.X();
        return;
    label_127:
        if(!z1 || z) {
            m.d().a("WM-ForceStopRunnable", "Found unfinished work, scheduling it.", new Throwable[0]);
            Z.d.a(k0.l, k0.m, k0.o);
        }
    }

    public final boolean b() {
        b b0 = this.j.l;
        b0.getClass();
        if(TextUtils.isEmpty(null)) {
            m.d().a("WM-ForceStopRunnable", "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean z = i0.g.a(this.i, b0);
        m.d().a("WM-ForceStopRunnable", "Is default app process = " + z, new Throwable[0]);
        return z;
    }

    public static void c(Context context0) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        Intent intent0 = new Intent();
        intent0.setComponent(new ComponentName(context0, ForceStopRunnable.BroadcastReceiver.class));
        intent0.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, -1, intent0, 0xA000000);
        long v = System.currentTimeMillis() + d.m;
        if(alarmManager0 != null) {
            alarmManager0.setExact(0, v, pendingIntent0);
        }
    }

    @Override
    public final void run() {
        IllegalStateException illegalStateException0;
        k k0;
        try {
            String s = d.l;
            k0 = this.j;
            if(!this.b()) {
                return;
            }
            while(true) {
                j.a(this.i);
                m.d().a(s, "Performing cleanup operations.", new Throwable[0]);
                try {
                    this.a();
                    return;
                }
                catch(SQLiteCantOpenDatabaseException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException | SQLiteConstraintException | SQLiteAccessPermException sQLiteCantOpenDatabaseException0) {
                }
                int v1 = this.k + 1;
                this.k = v1;
                if(v1 >= 3) {
                    break;
                }
                m.d().a(s, "Retrying after " + ((long)v1) * 300L, new Throwable[]{sQLiteCantOpenDatabaseException0});
                try {
                    Thread.sleep(((long)this.k) * 300L);
                }
                catch(InterruptedException unused_ex) {
                }
            }
            m.d().b(s, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store.", new Throwable[]{sQLiteCantOpenDatabaseException0});
            illegalStateException0 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store.", sQLiteCantOpenDatabaseException0);
            k0.l.getClass();
        }
        finally {
            k0.W();
        }
        throw illegalStateException0;
    }
}

