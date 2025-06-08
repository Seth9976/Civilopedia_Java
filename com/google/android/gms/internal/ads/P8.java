package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

public abstract class p8 extends AtomicReference implements Runnable {
    public static final x0 i;
    public static final x0 j;

    static {
        p8.i = new x0(10);
        p8.j = new x0(10);
    }

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread0) {
        Runnable runnable0 = (Runnable)this.get();
        o8 o80 = null;
        boolean z = false;
        int v = 0;
        while(true) {
            x0 x00 = p8.j;
            if(runnable0 instanceof o8) {
                o80 = (o8)runnable0;
            }
            else if(runnable0 != x00) {
                break;
            }
            ++v;
            if(v <= 1000) {
                Thread.yield();
            }
            else if(runnable0 == x00 || this.compareAndSet(runnable0, x00)) {
                z = Thread.interrupted() || z;
                LockSupport.park(o80);
            }
            runnable0 = (Runnable)this.get();
        }
        if(z) {
            thread0.interrupt();
        }
    }

    public abstract void d(Throwable arg1);

    public abstract void e(Object arg1);

    public abstract boolean f();

    public final void g() {
        Thread thread0;
        x0 x00 = p8.j;
        x0 x01 = p8.i;
        Runnable runnable0 = (Runnable)this.get();
        if(runnable0 instanceof Thread) {
            o8 o80 = new o8(this);
            o8.a(o80, Thread.currentThread());
            if(this.compareAndSet(runnable0, o80)) {
                try {
                    thread0 = (Thread)runnable0;
                    thread0.interrupt();
                }
                catch(Throwable throwable0) {
                    if(((Runnable)this.getAndSet(x01)) == x00) {
                        LockSupport.unpark(((Thread)runnable0));
                    }
                    throw throwable0;
                }
                if(((Runnable)this.getAndSet(x01)) == x00) {
                    LockSupport.unpark(thread0);
                }
            }
        }
    }

    @Override
    public final void run() {
        Thread thread0 = Thread.currentThread();
        Object object0 = null;
        if(!this.compareAndSet(null, thread0)) {
            return;
        }
        boolean z = this.f();
        x0 x00 = p8.i;
        if(!z) {
            try {
                object0 = this.a();
            }
            catch(Throwable throwable0) {
                if(!this.compareAndSet(thread0, x00)) {
                    this.c(thread0);
                }
                this.d(throwable0);
                return;
            }
        }
        if(!this.compareAndSet(thread0, x00)) {
            this.c(thread0);
        }
        if(!z) {
            this.e(object0);
        }
    }

    @Override
    public final String toString() {
        Runnable runnable0 = (Runnable)this.get();
        if(runnable0 == p8.i) {
            return "running=[DONE], " + this.b();
        }
        if(runnable0 instanceof o8) {
            return "running=[INTERRUPTED], " + this.b();
        }
        return runnable0 instanceof Thread ? "running=[RUNNING ON " + ((Thread)runnable0).getName() + "]" + ", " + this.b() : "running=[NOT STARTED YET], " + this.b();
    }
}

