package b0;

import Y.m;
import Z.c;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import h0.i;

public final class h implements c {
    public final Context i;
    public static final String j;

    static {
        h.j = "WM-SystemAlarmScheduler";
    }

    public h(Context context0) {
        this.i = context0.getApplicationContext();
    }

    @Override  // Z.c
    public final void b(String s) {
        Intent intent0 = new Intent(this.i, SystemAlarmService.class);
        intent0.setAction("ACTION_STOP_WORK");
        intent0.putExtra("KEY_WORKSPEC_ID", s);
        this.i.startService(intent0);
    }

    @Override  // Z.c
    public final void d(i[] arr_i) {
        for(int v = 0; v < arr_i.length; ++v) {
            i i0 = arr_i[v];
            m.d().a("WM-SystemAlarmScheduler", "Scheduling work with workSpecId " + i0.a, new Throwable[0]);
            Intent intent0 = b.c(this.i, i0.a);
            this.i.startService(intent0);
        }
    }

    @Override  // Z.c
    public final boolean f() {
        return true;
    }
}

