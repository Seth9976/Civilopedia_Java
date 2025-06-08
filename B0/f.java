package b0;

import Y.m;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import i0.h;
import i0.j;
import java.util.ArrayList;

public final class f implements Runnable {
    public final int i;
    public final g j;

    public f(g g0, int v) {
        this.i = v;
        this.j = g0;
        super();
    }

    private final void a() {
        synchronized(this.j.p) {
            this.j.q = (Intent)this.j.p.get(0);
        }
        Intent intent0 = this.j.q;
        if(intent0 != null) {
            String s = intent0.getAction();
            int v1 = this.j.q.getIntExtra("KEY_START_ID", 0);
            m.d().a("WM-SystemAlarmDispatche", String.format("Processing command %s, %s", this.j.q, v1), new Throwable[0]);
            PowerManager.WakeLock powerManager$WakeLock0 = j.a(this.j.i, s + " (" + v1 + ")");
            try {
                m.d().a("WM-SystemAlarmDispatche", "Acquiring operation wake lock (" + s + ") " + powerManager$WakeLock0, new Throwable[0]);
                powerManager$WakeLock0.acquire();
                this.j.n.e(this.j.q, v1, this.j);
            }
            catch(Throwable throwable0) {
                m.d().b("WM-SystemAlarmDispatche", "Unexpected error in onHandleIntent", new Throwable[]{throwable0});
            }
            finally {
                m.d().a("WM-SystemAlarmDispatche", "Releasing operation wake lock (" + s + ") " + powerManager$WakeLock0, new Throwable[0]);
                powerManager$WakeLock0.release();
                f f0 = new f(this.j, 1);
                this.j.f(f0);
            }
        }
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            g g0 = this.j;
            g0.getClass();
            m.d().a("WM-SystemAlarmDispatche", "Checking if commands are complete.", new Throwable[0]);
            g0.c();
            ArrayList arrayList0 = g0.p;
            synchronized(arrayList0) {
                if(g0.q != null) {
                    m.d().a("WM-SystemAlarmDispatche", String.format("Removing command %s", g0.q), new Throwable[0]);
                    if(!((Intent)g0.p.remove(0)).equals(g0.q)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    g0.q = null;
                }
                h h0 = (h)g0.j.j;
                if(!g0.n.d() && g0.p.isEmpty() && !h0.a()) {
                    m.d().a("WM-SystemAlarmDispatche", "No more commands & intents.", new Throwable[0]);
                    SystemAlarmService systemAlarmService0 = g0.r;
                    if(systemAlarmService0 != null) {
                        systemAlarmService0.a();
                    }
                }
                else if(!g0.p.isEmpty()) {
                    g0.g();
                }
            }
            return;
        }
        this.a();
    }
}

