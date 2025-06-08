package i0;

import B.a;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class h implements Executor {
    public final ArrayDeque i;
    public final ExecutorService j;
    public final Object k;
    public volatile Runnable l;

    public h(ExecutorService executorService0) {
        this.j = executorService0;
        this.i = new ArrayDeque();
        this.k = new Object();
    }

    public final boolean a() {
        synchronized(this.k) {
        }
        return !this.i.isEmpty();
    }

    public final void b() {
        synchronized(this.k) {
            Runnable runnable0 = (Runnable)this.i.poll();
            this.l = runnable0;
            if(runnable0 != null) {
                this.j.execute(this.l);
            }
        }
    }

    @Override
    public final void execute(Runnable runnable0) {
        synchronized(this.k) {
            a a0 = new a(8, this, runnable0);
            this.i.add(a0);
            if(this.l == null) {
                this.b();
            }
        }
    }
}

