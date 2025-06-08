package androidx.work.impl.background.systemalarm;

import Y.m;
import Z.k;
import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a;

    static {
        RescheduleReceiver.a = "WM-RescheduleReceiver";
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        m.d().a(RescheduleReceiver.a, String.format("Received intent %s", intent0), new Throwable[0]);
        if(Build.VERSION.SDK_INT >= 23) {
            try {
                k k0 = k.U(context0);
                BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
                Object object0 = k.v;
                synchronized(object0) {
                    k0.s = broadcastReceiver$PendingResult0;
                    if(k0.r) {
                        broadcastReceiver$PendingResult0.finish();
                        k0.s = null;
                    }
                }
            }
            catch(IllegalStateException illegalStateException0) {
                m.d().b("WM-RescheduleReceiver", "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[]{illegalStateException0});
            }
            return;
        }
        Intent intent1 = new Intent(context0, SystemAlarmService.class);
        intent1.setAction("ACTION_RESCHEDULE");
        context0.startService(intent1);
    }
}

