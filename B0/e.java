package b0;

import Y.m;
import Z.a;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d0.b;
import d0.c;
import h0.i;
import i0.j;
import i0.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class e implements a, b, q {
    public final Context i;
    public final int j;
    public final String k;
    public final g l;
    public final c m;
    public final Object n;
    public int o;
    public PowerManager.WakeLock p;
    public boolean q;
    public static final String r;

    static {
        e.r = "WM-DelayMetCommandHandl";
    }

    public e(Context context0, int v, String s, g g0) {
        this.i = context0;
        this.j = v;
        this.l = g0;
        this.k = s;
        this.m = new c(context0, g0.j, this);
        this.q = false;
        this.o = 0;
        this.n = new Object();
    }

    @Override  // Z.a
    public final void a(String s, boolean z) {
        m.d().a(e.r, "onExecuted " + s + ", " + z, new Throwable[0]);
        this.b();
        int v = this.j;
        g g0 = this.l;
        Context context0 = this.i;
        if(z) {
            g0.f(new androidx.activity.b(g0, b0.b.c(context0, this.k), v, 1));
        }
        if(this.q) {
            Intent intent0 = new Intent(context0, SystemAlarmService.class);
            intent0.setAction("ACTION_CONSTRAINTS_CHANGED");
            g0.f(new androidx.activity.b(g0, intent0, v, 1));
        }
    }

    public final void b() {
        synchronized(this.n) {
            this.m.d();
            this.l.k.b(this.k);
            if(this.p != null && this.p.isHeld()) {
                m.d().a("WM-DelayMetCommandHandl", "Releasing wakelock " + this.p + " for WorkSpec " + this.k, new Throwable[0]);
                this.p.release();
            }
        }
    }

    @Override  // d0.b
    public final void c(ArrayList arrayList0) {
        this.f();
    }

    public final void d() {
        StringBuilder stringBuilder0 = new StringBuilder();
        String s = this.k;
        stringBuilder0.append(s);
        stringBuilder0.append(" (");
        String s1 = i3.e.g(stringBuilder0, this.j, ")");
        this.p = j.a(this.i, s1);
        m m0 = m.d();
        PowerManager.WakeLock powerManager$WakeLock0 = this.p;
        m0.a("WM-DelayMetCommandHandl", "Acquiring wakelock " + powerManager$WakeLock0 + " for WorkSpec " + s, new Throwable[0]);
        this.p.acquire();
        i i0 = this.l.m.m.n().l(s);
        if(i0 == null) {
            this.f();
            return;
        }
        boolean z = i0.b();
        this.q = z;
        if(!z) {
            m.d().a("WM-DelayMetCommandHandl", "No constraints for " + s, new Throwable[0]);
            this.e(Collections.singletonList(s));
            return;
        }
        Collection collection0 = Collections.singletonList(i0);
        this.m.c(collection0);
    }

    @Override  // d0.b
    public final void e(List list0) {
        if(!list0.contains(this.k)) {
            return;
        }
        synchronized(this.n) {
            if(this.o == 0) {
                this.o = 1;
                m.d().a("WM-DelayMetCommandHandl", "onAllConstraintsMet for " + this.k, new Throwable[0]);
                if(this.l.l.h(this.k, null)) {
                    this.l.k.a(this.k, this);
                }
                else {
                    this.b();
                }
            }
            else {
                m.d().a("WM-DelayMetCommandHandl", "Already started work for " + this.k, new Throwable[0]);
            }
        }
    }

    public final void f() {
        synchronized(this.n) {
            if(this.o < 2) {
                this.o = 2;
                m.d().a("WM-DelayMetCommandHandl", "Stopping work for WorkSpec " + this.k, new Throwable[0]);
                Intent intent0 = new Intent(this.i, SystemAlarmService.class);
                intent0.setAction("ACTION_STOP_WORK");
                intent0.putExtra("KEY_WORKSPEC_ID", this.k);
                androidx.activity.b b0 = new androidx.activity.b(this.l, intent0, this.j, 1);
                this.l.f(b0);
                if(this.l.l.e(this.k)) {
                    m.d().a("WM-DelayMetCommandHandl", "WorkSpec " + this.k + " needs to be rescheduled", new Throwable[0]);
                    Intent intent1 = b0.b.c(this.i, this.k);
                    androidx.activity.b b1 = new androidx.activity.b(this.l, intent1, this.j, 1);
                    this.l.f(b1);
                }
                else {
                    m.d().a("WM-DelayMetCommandHandl", "Processor does not have WorkSpec " + this.k + ". No need to reschedule ", new Throwable[0]);
                }
            }
            else {
                m.d().a("WM-DelayMetCommandHandl", "Already stopped work for " + this.k, new Throwable[0]);
            }
        }
    }
}

