package androidx.work.impl.background.systemalarm;

import B.o;
import Y.m;
import Z.k;
import android.content.BroadcastReceiver.PendingResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a;

    static {
        ConstraintProxyUpdateReceiver.a = "WM-ConstrntProxyUpdtRec";
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        String s = intent0 == null ? null : intent0.getAction();
        if(!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(s)) {
            m.d().a("WM-ConstrntProxyUpdtRec", "Ignoring unknown action " + s, new Throwable[0]);
            return;
        }
        BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
        k k0 = k.U(context0);
        o o0 = new o(intent0, context0, broadcastReceiver$PendingResult0, 8, false);
        k0.n.k(o0);
    }
}

