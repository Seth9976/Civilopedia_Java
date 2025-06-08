package i0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public final class p implements ThreadFactory {
    public int a;

    @Override
    public final Thread newThread(Runnable runnable0) {
        Thread thread0 = Executors.defaultThreadFactory().newThread(runnable0);
        thread0.setName("WorkManager-WorkTimer-thread-" + this.a);
        ++this.a;
        return thread0;
    }
}

