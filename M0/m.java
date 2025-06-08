package m0;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import x1.o;

public final class m implements ThreadFactory {
    public final int a;
    public final Object b;
    public final Number c;

    public m() {
        this.a = 0;
        super();
        this.b = Executors.defaultThreadFactory();
        this.c = new AtomicInteger(1);
    }

    public m(String s, AtomicLong atomicLong0) {
        this.a = 1;
        super();
        this.b = s;
        this.c = atomicLong0;
    }

    @Override
    public final Thread newThread(Runnable runnable0) {
        if(this.a != 0) {
            Thread thread0 = Executors.defaultThreadFactory().newThread(new o(runnable0));
            thread0.setName(((String)this.b) + ((AtomicLong)this.c).getAndIncrement());
            return thread0;
        }
        Thread thread1 = ((ThreadFactory)this.b).newThread(runnable0);
        thread1.setName("PlayBillingLibrary-" + ((AtomicInteger)this.c).getAndIncrement());
        return thread1;
    }
}

