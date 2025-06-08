package d1;

import com.google.android.gms.internal.consent_sdk.zzcb;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class h implements Executor {
    public final AtomicInteger i;
    public final ThreadPoolExecutor j;
    public WeakReference k;

    public h() {
        this.i = new AtomicInteger(1);
        this.k = new WeakReference(null);
        zzcb zzcb0 = new zzcb(this, "Google consent worker");
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcb0);
        this.j = threadPoolExecutor0;
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(Thread.currentThread() == this.k.get()) {
            runnable0.run();
            return;
        }
        this.j.execute(runnable0);
    }
}

