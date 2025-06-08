package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

public final class n0 implements Executor {
    public final int i;
    public final Handler j;

    public n0() {
        this.i = 1;
        super();
        this.j = new zzf(Looper.getMainLooper());
    }

    public n0(Handler handler0) {
        this.i = 0;
        super();
        this.j = handler0;
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(this.i != 0) {
            if(Looper.getMainLooper().getThread() == Thread.currentThread()) {
                try {
                    runnable0.run();
                    return;
                }
                catch(Throwable throwable0) {
                    zzs.zzH(zzt.zzo().zzc(), throwable0);
                    throw throwable0;
                }
            }
            ((zzf)this.j).post(runnable0);
            return;
        }
        this.j.post(runnable0);
    }
}

