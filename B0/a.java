package b0;

import A.f;
import Y.m;
import Z.k;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.impl.WorkDatabase;
import h0.c;
import h0.d;
import i0.e;

public abstract class a {
    public static final String a;

    static {
        a.a = "WM-Alarms";
    }

    public static void a(Context context0, int v, String s) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, v, b.b(context0, s), (Build.VERSION.SDK_INT < 23 ? 0x20000000 : 0x24000000));
        if(pendingIntent0 != null && alarmManager0 != null) {
            m.d().a("WM-Alarms", f.f(v, "Cancelling existing alarm with (workSpecId, systemId) (", s, ", ", ")"), new Throwable[0]);
            alarmManager0.cancel(pendingIntent0);
        }
    }

    public static void b(Context context0, k k0, String s, long v) {
        int v4;
        WorkDatabase workDatabase0 = k0.m;
        B1.a a0 = workDatabase0.k();
        d d0 = a0.s(s);
        if(d0 != null) {
            a.a(context0, d0.b, s);
            a.c(context0, s, d0.b, v);
            return;
        }
        synchronized(e.class) {
            workDatabase0.c();
            try {
                Long long0 = workDatabase0.j().j("next_alarm_manager_id");
                int v3 = 0;
                v4 = long0 == null ? 0 : long0.intValue();
                if(v4 != 0x7FFFFFFF) {
                    v3 = v4 + 1;
                }
                workDatabase0.j().m(new c("next_alarm_manager_id", ((long)v3)));
                workDatabase0.h();
            }
            finally {
                workDatabase0.f();
            }
        }
        a0.y(new d(s, v4));
        a.c(context0, s, v4, v);
    }

    public static void c(Context context0, String s, int v, long v1) {
        AlarmManager alarmManager0 = (AlarmManager)context0.getSystemService("alarm");
        int v2 = Build.VERSION.SDK_INT < 23 ? 0x8000000 : 0xC000000;
        PendingIntent pendingIntent0 = PendingIntent.getService(context0, v, b.b(context0, s), v2);
        if(alarmManager0 != null) {
            alarmManager0.setExact(0, v1, pendingIntent0);
        }
    }
}

