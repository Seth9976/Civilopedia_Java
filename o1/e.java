package o1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicReference;
import p.j;

public final class e extends BroadcastReceiver {
    public final Context a;
    public static final AtomicReference b;

    static {
        e.b = new AtomicReference();
    }

    public e(Context context0) {
        this.a = context0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        synchronized(f.j) {
            for(Object object1: ((j)f.l.values())) {
                ((f)object1).d();
            }
        }
        this.a.unregisterReceiver(this);
    }
}

