package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import i1.B;
import i1.t;
import i1.u;
import i1.v;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgb extends B {
    public v c;
    public v d;
    public final PriorityBlockingQueue e;
    public final LinkedBlockingQueue f;
    public final t g;
    public final t h;
    public final Object i;
    public final Semaphore j;
    public static final AtomicLong k;

    static {
        zzgb.k = new AtomicLong(0x8000000000000000L);
    }

    public zzgb(zzge zzge0) {
        super(zzge0);
        this.i = new Object();
        this.j = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f = new LinkedBlockingQueue();
        this.g = new t(this, "Thread death: Uncaught exception on worker thread");
        this.h = new t(this, "Thread death: Uncaught exception on network thread");
    }

    @Override  // i1.B
    public final boolean b() {
        return false;
    }

    public final Object d(AtomicReference atomicReference0, long v, String s, Runnable runnable0) {
        synchronized(atomicReference0) {
            this.a.zzaz().zzp(runnable0);
            try {
                atomicReference0.wait(v);
            }
            catch(InterruptedException unused_ex) {
                this.a.zzay().zzk().zza("Interrupted waiting for " + s);
                return null;
            }
        }
        Object object0 = atomicReference0.get();
        if(object0 == null) {
            this.a.zzay().zzk().zza("Timed out waiting for " + s);
        }
        return object0;
    }

    public final void e(u u0) {
        synchronized(this.i) {
            this.e.add(u0);
            v v1 = this.c;
            if(v1 == null) {
                v v2 = new v(this, "Measurement Worker", this.e);
                this.c = v2;
                v2.setUncaughtExceptionHandler(this.g);
                this.c.start();
            }
            else {
                v1.a();
            }
        }
    }

    @Override  // i1.A
    public final void zzax() {
        if(Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override  // i1.A
    public final void zzg() {
        if(Thread.currentThread() != this.c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final Future zzh(Callable callable0) throws IllegalStateException {
        this.c();
        Preconditions.checkNotNull(callable0);
        Future future0 = new u(this, callable0, false);
        if(Thread.currentThread() == this.c) {
            if(!this.e.isEmpty()) {
                this.a.zzay().zzk().zza("Callable skipped the worker queue.");
            }
            ((FutureTask)future0).run();
            return future0;
        }
        this.e(((u)future0));
        return future0;
    }

    public final Future zzi(Callable callable0) throws IllegalStateException {
        this.c();
        Preconditions.checkNotNull(callable0);
        Future future0 = new u(this, callable0, true);
        if(Thread.currentThread() == this.c) {
            ((FutureTask)future0).run();
            return future0;
        }
        this.e(((u)future0));
        return future0;
    }

    public final void zzo(Runnable runnable0) throws IllegalStateException {
        this.c();
        Preconditions.checkNotNull(runnable0);
        u u0 = new u(this, runnable0, false, "Task exception on network thread");
        synchronized(this.i) {
            this.f.add(u0);
            v v1 = this.d;
            if(v1 == null) {
                v v2 = new v(this, "Measurement Network", this.f);
                this.d = v2;
                v2.setUncaughtExceptionHandler(this.h);
                this.d.start();
            }
            else {
                v1.a();
            }
        }
    }

    public final void zzp(Runnable runnable0) throws IllegalStateException {
        this.c();
        Preconditions.checkNotNull(runnable0);
        this.e(new u(this, runnable0, false, "Task exception on worker thread"));
    }

    public final void zzq(Runnable runnable0) throws IllegalStateException {
        this.c();
        Preconditions.checkNotNull(runnable0);
        this.e(new u(this, runnable0, true, "Task exception on worker thread"));
    }

    public final boolean zzs() {
        return Thread.currentThread() == this.c;
    }
}

