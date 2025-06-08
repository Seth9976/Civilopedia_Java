package androidx.work.impl.diagnostics;

import B1.a;
import Y.m;
import Z.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a;

    static {
        DiagnosticsReceiver.a = "WM-DiagnosticsRcvr";
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        m.d().a("WM-DiagnosticsRcvr", "Requesting diagnostics", new Throwable[0]);
        try {
            k.U(context0).o(new a(DiagnosticsWorker.class).d());
        }
        catch(IllegalStateException illegalStateException0) {
            m.d().b("WM-DiagnosticsRcvr", "WorkManager is not initialized", new Throwable[]{illegalStateException0});
        }
    }
}

