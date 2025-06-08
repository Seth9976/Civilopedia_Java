package Y;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ThreadFactory {
    public final AtomicInteger a;
    public final boolean b;

    public a(boolean z) {
        this.b = z;
        this.a = new AtomicInteger(0);
    }

    // 去混淆评级： 低(20)
    @Override
    public final Thread newThread(Runnable runnable0) {
        return this.b ? new Thread(runnable0, "WM.task-" + this.a.incrementAndGet()) : new Thread(runnable0, "androidx.work-" + this.a.incrementAndGet());
    }
}

