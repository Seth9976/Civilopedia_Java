package androidx.lifecycle;

import B1.a;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class q extends Service implements n {
    public final a i;

    public q() {
        this.i = new a(this);
    }

    @Override  // androidx.lifecycle.n
    public final i getLifecycle() {
        return (p)this.i.j;
    }

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        this.i.B(g.ON_START);
        return null;
    }

    @Override  // android.app.Service
    public void onCreate() {
        this.i.B(g.ON_CREATE);
        super.onCreate();
    }

    @Override  // android.app.Service
    public void onDestroy() {
        this.i.B(g.ON_STOP);
        this.i.B(g.ON_DESTROY);
        super.onDestroy();
    }

    @Override  // android.app.Service
    public final void onStart(Intent intent0, int v) {
        this.i.B(g.ON_START);
        super.onStart(intent0, v);
    }
}

