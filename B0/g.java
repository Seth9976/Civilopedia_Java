package b0;

import Y.m;
import Z.a;
import Z.b;
import Z.k;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager.WakeLock;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import i0.j;
import i0.s;
import java.util.ArrayList;
import java.util.concurrent.ScheduledExecutorService;

public final class g implements a {
    public final Context i;
    public final B1.a j;
    public final s k;
    public final b l;
    public final k m;
    public final b0.b n;
    public final Handler o;
    public final ArrayList p;
    public Intent q;
    public SystemAlarmService r;
    public static final String s;

    static {
        g.s = "WM-SystemAlarmDispatche";
    }

    public g(SystemAlarmService systemAlarmService0) {
        Context context0 = systemAlarmService0.getApplicationContext();
        this.i = context0;
        this.n = new b0.b(context0);
        this.k = new s();
        k k0 = k.U(systemAlarmService0);
        this.m = k0;
        this.l = k0.p;
        this.j = k0.n;
        k0.p.b(this);
        this.p = new ArrayList();
        this.q = null;
        this.o = new Handler(Looper.getMainLooper());
    }

    @Override  // Z.a
    public final void a(String s, boolean z) {
        Intent intent0 = new Intent(this.i, SystemAlarmService.class);
        intent0.setAction("ACTION_EXECUTION_COMPLETED");
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        intent0.putExtra("KEY_NEEDS_RESCHEDULE", z);
        this.f(new androidx.activity.b(this, intent0, 0, 1));
    }

    public final void b(int v, Intent intent0) {
        m.d().a("WM-SystemAlarmDispatche", String.format("Adding command %s (%s)", intent0, v), new Throwable[0]);
        this.c();
        String s = intent0.getAction();
        if(TextUtils.isEmpty(s)) {
            m.d().g("WM-SystemAlarmDispatche", "Unknown command. Ignoring", new Throwable[0]);
            return;
        }
        if("ACTION_CONSTRAINTS_CHANGED".equals(s) && this.d()) {
            return;
        }
        intent0.putExtra("KEY_START_ID", v);
        synchronized(this.p) {
            this.p.add(intent0);
            if(this.p.isEmpty()) {
                this.g();
            }
        }
    }

    public final void c() {
        if(this.o.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final boolean d() {
        this.c();
        synchronized(this.p) {
            for(Object object0: this.p) {
                if("ACTION_CONSTRAINTS_CHANGED".equals(((Intent)object0).getAction())) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
            return false;
        }
    }

    public final void e() {
        m.d().a("WM-SystemAlarmDispatche", "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.l.f(this);
        ScheduledExecutorService scheduledExecutorService0 = this.k.a;
        if(!scheduledExecutorService0.isShutdown()) {
            scheduledExecutorService0.shutdownNow();
        }
        this.r = null;
    }

    public final void f(Runnable runnable0) {
        this.o.post(runnable0);
    }

    public final void g() {
        this.c();
        PowerManager.WakeLock powerManager$WakeLock0 = j.a(this.i, "ProcessCommand");
        try {
            powerManager$WakeLock0.acquire();
            f f0 = new f(this, 0);
            this.m.n.k(f0);
        }
        finally {
            powerManager$WakeLock0.release();
        }
    }
}

