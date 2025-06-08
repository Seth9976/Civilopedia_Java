package com.google.android.gms.internal.play_billing;

import A.f;
import android.support.v4.media.session.a;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public class zzq implements zzeu {
    public volatile Object i;
    public volatile K0 j;
    public volatile X0 k;
    public static final boolean l;
    public static final Logger m;
    public static final a n;
    public static final Object o;
    public static final int zzf;

    static {
        V0 v00;
        zzq.l = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        zzq.m = Logger.getLogger("com.google.android.gms.internal.play_billing.zzq");
        try {
            v00 = new V0(AtomicReferenceFieldUpdater.newUpdater(X0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(X0.class, X0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, X0.class, "k"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, K0.class, "j"), AtomicReferenceFieldUpdater.newUpdater(zzq.class, Object.class, "i"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            v00 = new W0();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        zzq.n = v00;
        if(throwable0 != null) {
            zzq.m.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "<clinit>", "SafeAtomicHelper is broken!", throwable0);
        }
        zzq.o = new Object();
    }

    // 去混淆评级： 低(20)
    public String a() {
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    public static void b(zzq zzq0) {
        K0 k02;
        K0 k01;
        K0 k00;
        X0 x00;
        do {
            x00 = zzq0.k;
        }
        while(!zzq.n.X(zzq0, x00, X0.c));
        while(true) {
            k00 = null;
            if(x00 == null) {
                break;
            }
            Thread thread0 = x00.a;
            if(thread0 != null) {
                x00.a = null;
                LockSupport.unpark(thread0);
            }
            x00 = x00.b;
        }
        do {
            k01 = zzq0.j;
        }
        while(!zzq.n.V(zzq0, k01, K0.d));
        while(true) {
            k02 = k00;
            k00 = k01;
            if(k00 == null) {
                break;
            }
            k01 = k00.c;
            k00.c = k02;
        }
        while(k02 != null) {
            K0 k03 = k02.c;
            zzq.d(k02.a, k02.b);
            k02 = k03;
        }
    }

    public final void c(StringBuilder stringBuilder0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = this.get();
                goto label_9;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                try {
                    if(z) {
                        Thread.currentThread().interrupt();
                    }
                    throw throwable0;
                label_9:
                    if(z) {
                        Thread.currentThread().interrupt();
                    }
                    stringBuilder0.append("SUCCESS, result=[");
                    stringBuilder0.append((object0 == this ? "this future" : String.valueOf(object0)));
                    stringBuilder0.append("]");
                    return;
                }
                catch(ExecutionException executionException0) {
                    break;
                }
                catch(CancellationException unused_ex) {
                    stringBuilder0.append("CANCELLED");
                    return;
                }
                catch(RuntimeException runtimeException0) {
                    stringBuilder0.append("UNKNOWN, cause=[");
                    stringBuilder0.append(runtimeException0.getClass());
                    stringBuilder0.append(" thrown from get()]");
                    return;
                }
            }
        }
        stringBuilder0.append("FAILURE, cause=[");
        stringBuilder0.append(executionException0.getCause());
        stringBuilder0.append("]");
    }

    @Override
    public final boolean cancel(boolean z) {
        e0 e00;
        if(this.i == null) {
            if(zzq.l) {
                e00 = new e0(new CancellationException("Future.cancel() was called."));
            }
            else {
                e00 = z ? e0.b : e0.c;
            }
            if(zzq.n.W(this, null, e00)) {
                zzq.b(this);
                return true;
            }
        }
        return false;
    }

    public static void d(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            zzq.m.logp(Level.SEVERE, "com.android.billingclient.util.concurrent.AbstractResolvableFuture", "executeListener", f.j("RuntimeException while executing runnable ", String.valueOf(runnable0), " with executor ", String.valueOf(executor0)), runtimeException0);
        }
    }

    public final void e(X0 x00) {
        x00.a = null;
    alab1:
        X0 x01;
        while((x01 = this.k) != X0.c) {
            X0 x02 = null;
            while(true) {
                if(x01 == null) {
                    break alab1;
                }
                X0 x03 = x01.b;
                if(x01.a != null) {
                    x02 = x01;
                }
                else if(x02 == null) {
                    if(zzq.n.X(this, x01, x03)) {
                        x01 = x03;
                        continue;
                    }
                    break;
                }
                else {
                    x02.b = x03;
                    if(x02.a == null) {
                        break;
                    }
                }
                x01 = x03;
            }
        }
    }

    public static final Object f(Object object0) {
        if(!(object0 instanceof e0)) {
            if(object0 instanceof u0) {
                throw new ExecutionException(((u0)object0).a);
            }
            return object0 == zzq.o ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((e0)object0).a);
        throw cancellationException0;
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.i;
        if(object0 != null) {
            return zzq.f(object0);
        }
        X0 x00 = this.k;
        X0 x01 = X0.c;
        if(x00 != x01) {
            X0 x02 = new X0();
            while(true) {
                zzq.n.S(x02, x00);
                if(zzq.n.X(this, x00, x02)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.i;
                        if(object1 != null) {
                            return zzq.f(object1);
                        }
                    }
                    this.e(x02);
                    throw new InterruptedException();
                }
                x00 = this.k;
                if(x00 == x01) {
                    break;
                }
            }
        }
        return zzq.f(this.i);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, TimeoutException, ExecutionException {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.i;
        if(object0 != null) {
            return zzq.f(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            X0 x00 = this.k;
            X0 x01 = X0.c;
            if(x00 != x01) {
                X0 x02 = new X0();
                while(true) {
                    zzq.n.S(x02, x00);
                    if(zzq.n.X(this, x00, x02)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.e(x02);
                                throw new InterruptedException();
                            }
                            Object object1 = this.i;
                            if(object1 != null) {
                                return zzq.f(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.e(x02);
                        goto label_27;
                    }
                    x00 = this.k;
                    if(x00 == x01) {
                        break;
                    }
                }
            }
            return zzq.f(this.i);
        }
    label_27:
        while(v1 > 0L) {
            Object object2 = this.i;
            if(object2 != null) {
                return zzq.f(object2);
            }
            if(Thread.interrupted()) {
                throw new InterruptedException();
            }
            v1 = v2 - System.nanoTime();
        }
        String s = this.toString();
        Locale locale0 = Locale.ROOT;
        String s1 = timeUnit0.toString().toLowerCase(locale0);
        String s2 = "Waited " + v + " " + timeUnit0.toString().toLowerCase(locale0);
        if(v1 + 1000L < 0L) {
            String s3 = s2 + " (plus ";
            long v3 = timeUnit0.convert(-v1, TimeUnit.NANOSECONDS);
            long v4 = -v1 - timeUnit0.toNanos(v3);
            boolean z = true;
            int v5 = Long.compare(v3, 0L);
            if(v5 != 0 && v4 <= 1000L) {
                z = false;
            }
            if(v5 > 0) {
                s3 = (z ? s3 + v3 + " " + s1 + "," : s3 + v3 + " " + s1) + " ";
            }
            if(z) {
                s3 = s3 + v4 + " nanoseconds ";
            }
            s2 = s3 + "delay)";
        }
        throw this.isDone() ? new TimeoutException(s2 + " but future completed as timeout expired") : new TimeoutException(f.i(s2, " for ", s));
    }

    @Override
    public final boolean isCancelled() {
        return this.i instanceof e0;
    }

    @Override
    public final boolean isDone() {
        return this.i != null;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append("[status=");
        if(this.i instanceof e0) {
            stringBuilder0.append("CANCELLED");
        }
        else if(this.isDone()) {
            this.c(stringBuilder0);
        }
        else {
            try {
                s = this.a();
            }
            catch(RuntimeException runtimeException0) {
                s = "Exception thrown from implementation: " + runtimeException0.getClass();
            }
            if(s != null && !s.isEmpty()) {
                stringBuilder0.append("PENDING, info=[");
                stringBuilder0.append(s);
                stringBuilder0.append("]");
            }
            else if(this.isDone()) {
                this.c(stringBuilder0);
            }
            else {
                stringBuilder0.append("PENDING");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable0, Executor executor0) {
        executor0.getClass();
        K0 k00 = this.j;
        K0 k01 = K0.d;
        if(k00 != k01) {
            K0 k02 = new K0(runnable0, executor0);
            while(true) {
                k02.c = k00;
                if(zzq.n.V(this, k00, k02)) {
                    return;
                }
                k00 = this.j;
                if(k00 == k01) {
                    break;
                }
            }
        }
        zzq.d(runnable0, executor0);
    }
}

