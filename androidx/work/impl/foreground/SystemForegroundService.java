package androidx.work.impl.foreground;

import B.o;
import Y.m;
import Z.k;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.q;
import g0.a;
import java.util.UUID;

public class SystemForegroundService extends q {
    public Handler j;
    public boolean k;
    public a l;
    public NotificationManager m;
    public static final String n;

    static {
        SystemForegroundService.n = "WM-SystemFgService";
    }

    public final void a() {
        this.j = new Handler(Looper.getMainLooper());
        this.m = (NotificationManager)this.getApplicationContext().getSystemService("notification");
        a a0 = new a(this.getApplicationContext());
        this.l = a0;
        if(a0.q != null) {
            m.d().b("WM-SystemFgDispatcher", "A callback already exists.", new Throwable[0]);
            return;
        }
        a0.q = this;
    }

    @Override  // androidx.lifecycle.q
    public final void onCreate() {
        super.onCreate();
        this.a();
    }

    @Override  // androidx.lifecycle.q
    public final void onDestroy() {
        super.onDestroy();
        this.l.g();
    }

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        super.onStartCommand(intent0, v, v1);
        if(this.k) {
            m.d().e("WM-SystemFgService", "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.l.g();
            this.a();
            this.k = false;
        }
        if(intent0 != null) {
            a a0 = this.l;
            a0.getClass();
            String s = intent0.getAction();
            k k0 = a0.i;
            if("ACTION_START_FOREGROUND".equals(s)) {
                m.d().e("WM-SystemFgDispatcher", String.format("Started foreground service %s", intent0), new Throwable[0]);
                String s1 = intent0.getStringExtra("KEY_WORKSPEC_ID");
                o o0 = new o(a0, k0.m, s1, 10);
                a0.j.k(o0);
                a0.f(intent0);
                return 3;
            }
            if("ACTION_NOTIFY".equals(s)) {
                a0.f(intent0);
                return 3;
            }
            if("ACTION_CANCEL_WORK".equals(s)) {
                m.d().e("WM-SystemFgDispatcher", String.format("Stopping foreground work for %s", intent0), new Throwable[0]);
                String s2 = intent0.getStringExtra("KEY_WORKSPEC_ID");
                if(s2 != null && !TextUtils.isEmpty(s2)) {
                    UUID uUID0 = UUID.fromString(s2);
                    k0.getClass();
                    i0.a a1 = new i0.a(k0, uUID0);
                    k0.n.k(a1);
                    return 3;
                }
            }
            else if("ACTION_STOP_FOREGROUND".equals(s)) {
                m.d().e("WM-SystemFgDispatcher", "Stopping foreground service", new Throwable[0]);
                SystemForegroundService systemForegroundService0 = a0.q;
                if(systemForegroundService0 != null) {
                    systemForegroundService0.k = true;
                    m.d().a("WM-SystemFgService", "All commands completed.", new Throwable[0]);
                    if(Build.VERSION.SDK_INT >= 26) {
                        systemForegroundService0.stopForeground(true);
                    }
                    systemForegroundService0.stopSelf();
                }
            }
        }
        return 3;
    }
}

