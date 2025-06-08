package g0;

import android.app.Notification;
import android.os.Build.VERSION;
import androidx.work.impl.foreground.SystemForegroundService;

public final class b implements Runnable {
    public final int i;
    public final Notification j;
    public final int k;
    public final SystemForegroundService l;

    public b(SystemForegroundService systemForegroundService0, int v, Notification notification0, int v1) {
        this.l = systemForegroundService0;
        this.i = v;
        this.j = notification0;
        this.k = v1;
    }

    @Override
    public final void run() {
        Notification notification0 = this.j;
        int v = this.i;
        SystemForegroundService systemForegroundService0 = this.l;
        if(Build.VERSION.SDK_INT >= 29) {
            systemForegroundService0.startForeground(v, notification0, this.k);
            return;
        }
        systemForegroundService0.startForeground(v, notification0);
    }
}

