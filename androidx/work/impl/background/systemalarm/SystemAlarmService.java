package androidx.work.impl.background.systemalarm;

import Y.m;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import androidx.lifecycle.q;
import b0.g;
import i0.j;
import java.util.HashMap;

public class SystemAlarmService extends q {
    public g j;
    public boolean k;
    public static final String l;

    static {
        SystemAlarmService.l = "WM-SystemAlarmService";
    }

    public final void a() {
        this.k = true;
        m.d().a("WM-SystemAlarmService", "All commands completed in dispatcher", new Throwable[0]);
        HashMap hashMap0 = new HashMap();
        synchronized(j.b) {
            hashMap0.putAll(j.b);
        }
        for(Object object0: hashMap0.keySet()) {
            PowerManager.WakeLock powerManager$WakeLock0 = (PowerManager.WakeLock)object0;
            if(powerManager$WakeLock0 != null && powerManager$WakeLock0.isHeld()) {
                Object[] arr_object = {hashMap0.get(powerManager$WakeLock0)};
                m.d().g("WM-WakeLocks", String.format("WakeLock held for %s", arr_object), new Throwable[0]);
            }
        }
        this.stopSelf();
    }

    @Override  // androidx.lifecycle.q
    public final void onCreate() {
        super.onCreate();
        g g0 = new g(this);
        this.j = g0;
        if(g0.r == null) {
            g0.r = this;
        }
        else {
            m.d().b("WM-SystemAlarmDispatche", "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        }
        this.k = false;
    }

    @Override  // androidx.lifecycle.q
    public final void onDestroy() {
        super.onDestroy();
        this.k = true;
        this.j.e();
    }

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        if(this.k) {
            m.d().e("WM-SystemAlarmService", "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.j.e();
            g g0 = new g(this);
            this.j = g0;
            if(g0.r == null) {
                g0.r = this;
            }
            else {
                m.d().b("WM-SystemAlarmDispatche", "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            }
            this.k = false;
        }
        if(intent0 != null) {
            this.j.b(v1, intent0);
        }
        return 3;
    }
}

