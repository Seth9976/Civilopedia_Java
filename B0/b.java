package b0;

import A.f;
import Y.m;
import Z.a;
import Z.k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d0.c;
import h0.i;
import i3.e;
import java.util.ArrayList;
import java.util.HashMap;

public final class b implements a {
    public final Context i;
    public final HashMap j;
    public final Object k;
    public static final String l;

    static {
        b.l = "WM-CommandHandler";
    }

    public b(Context context0) {
        this.i = context0;
        this.j = new HashMap();
        this.k = new Object();
    }

    @Override  // Z.a
    public final void a(String s, boolean z) {
        synchronized(this.k) {
            a a0 = (a)this.j.remove(s);
            if(a0 != null) {
                a0.a(s, z);
            }
        }
    }

    public static Intent b(Context context0, String s) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_DELAY_MET");
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        return intent0;
    }

    public static Intent c(Context context0, String s) {
        Intent intent0 = new Intent(context0, SystemAlarmService.class);
        intent0.setAction("ACTION_SCHEDULE_WORK");
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        return intent0;
    }

    public final boolean d() {
        synchronized(this.k) {
        }
        return !this.j.isEmpty();
    }

    public final void e(Intent intent0, int v, g g0) {
        String s = intent0.getAction();
        if("ACTION_CONSTRAINTS_CHANGED".equals(s)) {
            m.d().a("WM-CommandHandler", String.format("Handling constraints changed %s", intent0), new Throwable[0]);
            d d0 = new d(this.i, v, g0);
            ArrayList arrayList0 = g0.m.m.n().h();
            boolean z = false;
            boolean z1 = false;
            boolean z2 = false;
            boolean z3 = false;
            for(Object object0: arrayList0) {
                z |= ((i)object0).j.d;
                z1 |= ((i)object0).j.b;
                z2 |= ((i)object0).j.e;
                z3 |= ((i)object0).j.a != 1;
                if(z && z1 && z2 && z3) {
                    break;
                }
            }
            Intent intent1 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context0 = d0.a;
            intent1.setComponent(new ComponentName(context0, ConstraintProxyUpdateReceiver.class));
            intent1.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z1).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z3);
            context0.sendBroadcast(intent1);
            c c0 = d0.c;
            c0.c(arrayList0);
            ArrayList arrayList1 = new ArrayList(arrayList0.size());
            long v1 = System.currentTimeMillis();
            for(Object object1: arrayList0) {
                i i0 = (i)object1;
                String s1 = i0.a;
                if(v1 >= i0.a() && (!i0.b() || c0.a(s1))) {
                    arrayList1.add(i0);
                }
            }
            for(Object object2: arrayList1) {
                String s2 = ((i)object2).a;
                Intent intent2 = b.b(context0, s2);
                m.d().a("WM-ConstraintsCmdHandle", e.f("Creating a delay_met command for workSpec with id (", s2, ")"), new Throwable[0]);
                g0.f(new androidx.activity.b(g0, intent2, d0.b, 1));
            }
            c0.d();
            return;
        }
        if("ACTION_RESCHEDULE".equals(s)) {
            m.d().a("WM-CommandHandler", String.format("Handling reschedule %s, %s", intent0, v), new Throwable[0]);
            g0.m.X();
            return;
        }
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 != null && !bundle0.isEmpty() && bundle0.get("KEY_WORKSPEC_ID") != null) {
            if("ACTION_SCHEDULE_WORK".equals(s)) {
                String s3 = intent0.getExtras().getString("KEY_WORKSPEC_ID");
                m.d().a("WM-CommandHandler", "Handling schedule work for " + s3, new Throwable[0]);
                WorkDatabase workDatabase0 = g0.m.m;
                workDatabase0.c();
                try {
                    i i1 = workDatabase0.n().l(s3);
                    if(i1 == null) {
                        m.d().g("WM-CommandHandler", "Skipping scheduling " + s3 + " because it\'s no longer in the DB", new Throwable[0]);
                    }
                    else if(f.a(i1.b)) {
                        m.d().g("WM-CommandHandler", "Skipping scheduling " + s3 + "because it is finished.", new Throwable[0]);
                    }
                    else {
                        long v3 = i1.a();
                        boolean z4 = i1.b();
                        Context context1 = this.i;
                        k k0 = g0.m;
                        if(z4) {
                            m.d().a("WM-CommandHandler", "Opportunistically setting an alarm for " + s3 + " at " + v3, new Throwable[0]);
                            b0.a.b(context1, k0, s3, v3);
                            Intent intent3 = new Intent(context1, SystemAlarmService.class);
                            intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                            g0.f(new androidx.activity.b(g0, intent3, v, 1));
                        }
                        else {
                            m.d().a("WM-CommandHandler", "Setting up Alarms for " + s3 + " at " + v3, new Throwable[0]);
                            b0.a.b(context1, k0, s3, v3);
                        }
                        workDatabase0.h();
                    }
                }
                finally {
                    workDatabase0.f();
                }
                return;
            }
            if("ACTION_DELAY_MET".equals(s)) {
                Bundle bundle1 = intent0.getExtras();
                synchronized(this.k) {
                    String s4 = bundle1.getString("KEY_WORKSPEC_ID");
                    m.d().a("WM-CommandHandler", "Handing delay met for " + s4, new Throwable[0]);
                    if(this.j.containsKey(s4)) {
                        m.d().a("WM-CommandHandler", "WorkSpec " + s4 + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                    }
                    else {
                        b0.e e0 = new b0.e(this.i, v, s4, g0);
                        this.j.put(s4, e0);
                        e0.d();
                    }
                }
                return;
            }
            if("ACTION_STOP_WORK".equals(s)) {
                String s5 = intent0.getExtras().getString("KEY_WORKSPEC_ID");
                m.d().a("WM-CommandHandler", "Handing stopWork work for " + s5, new Throwable[0]);
                g0.m.Z(s5);
                B1.a a0 = g0.m.m.k();
                h0.d d1 = a0.s(s5);
                if(d1 != null) {
                    b0.a.a(this.i, d1.b, s5);
                    m.d().a("WM-Alarms", e.f("Removing SystemIdInfo for workSpecId (", s5, ")"), new Throwable[0]);
                    a0.D(s5);
                }
                g0.a(s5, false);
                return;
            }
            if("ACTION_EXECUTION_COMPLETED".equals(s)) {
                Bundle bundle2 = intent0.getExtras();
                String s6 = bundle2.getString("KEY_WORKSPEC_ID");
                boolean z5 = bundle2.getBoolean("KEY_NEEDS_RESCHEDULE");
                m.d().a("WM-CommandHandler", String.format("Handling onExecutionCompleted %s, %s", intent0, v), new Throwable[0]);
                this.a(s6, z5);
                return;
            }
            m.d().g("WM-CommandHandler", String.format("Ignoring intent %s", intent0), new Throwable[0]);
            return;
        }
        m.d().b("WM-CommandHandler", e.f("Invalid request for ", s, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
    }
}

