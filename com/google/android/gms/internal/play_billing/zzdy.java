package com.google.android.gms.internal.play_billing;

import A.f;
import O2.A;
import java.util.Locale;
import java.util.Objects;
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

public abstract class zzdy extends zzfi implements zzeu {
    public volatile Object i;
    public volatile D j;
    public volatile K k;
    public static final boolean l;
    public static final Q m;
    public static final A n;
    public static final Object o;

    static {
        Throwable throwable1;
        Throwable throwable0;
        J j0;
        Class class0 = K.class;
        zzdy.l = false;
        Class class1 = zzdy.class;
        zzdy.m = new Q(class1);
        try {
            j0 = new J();  // 初始化器: Ljava/lang/Object;-><init>()V
            throwable0 = null;
            throwable1 = null;
        }
        catch(Exception | Error exception0) {
            try {
                throwable1 = null;
                throwable0 = exception0;
                j0 = new E(AtomicReferenceFieldUpdater.newUpdater(class0, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(class0, class0, "b"), AtomicReferenceFieldUpdater.newUpdater(class1, class0, "k"), AtomicReferenceFieldUpdater.newUpdater(class1, D.class, "j"), AtomicReferenceFieldUpdater.newUpdater(class1, Object.class, "i"));
            }
            catch(Exception | Error exception1) {
                throwable1 = exception1;
                throwable0 = exception0;
                j0 = new G();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
        }
        zzdy.n = j0;
        if(throwable1 != null) {
            Logger logger0 = zzdy.m.a();
            Level level0 = Level.SEVERE;
            logger0.logp(level0, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", throwable0);
            zzdy.m.a().logp(level0, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", throwable1);
        }
        zzdy.o = new Object();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzfi
    public final Throwable a() {
        if(this instanceof H) {
            return this.i instanceof C ? ((C)this.i).a : null;
        }
        return null;
    }

    // 去混淆评级： 低(20)
    public String b() {
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    public void c() {
    }

    @Override
    public final boolean cancel(boolean z) {
        B b0;
        Object object0 = this.i;
        if((object0 instanceof F | object0 == null) != 0) {
            if(zzdy.l) {
                b0 = new B(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                b0 = z ? B.c : B.d;
                Objects.requireNonNull(b0);
            }
            boolean z1 = false;
            zzdy zzdy0 = this;
            while(true) {
                if(zzdy.n.r0(zzdy0, object0, b0)) {
                    zzdy.h(zzdy0);
                    if(object0 instanceof F) {
                        zzeu zzeu0 = ((F)object0).j;
                        if(!(zzeu0 instanceof H)) {
                            zzeu0.cancel(z);
                            return true;
                        }
                        zzdy0 = (zzdy)zzeu0;
                        object0 = zzdy0.i;
                        if((object0 == null | object0 instanceof F) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = zzdy0.i;
                if(!(object0 instanceof F)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    public final void d(Throwable throwable0) {
        C c0 = new C(throwable0);
        if(zzdy.n.r0(this, null, c0)) {
            zzdy.h(this);
        }
    }

    public static Object e(zzeu zzeu0) {
        if(zzeu0 instanceof H) {
            B b0 = ((zzdy)zzeu0).i;
            if(b0 instanceof B && b0.a) {
                b0 = b0.b == null ? B.d : new B(false, b0.b);
            }
            Objects.requireNonNull(b0);
            return b0;
        }
        if(zzeu0 instanceof zzfi) {
            Throwable throwable0 = ((zzfi)zzeu0).a();
            if(throwable0 != null) {
                return new C(throwable0);
            }
        }
        boolean z = zzeu0.isCancelled();
        if((!zzdy.l & z) != 0) {
            Objects.requireNonNull(B.d);
            return B.d;
        }
        try {
            Object object0 = zzdy.f(zzeu0);
            if(z) {
                return new B(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzeu0));
            }
            return object0 == null ? zzdy.o : object0;
        }
        catch(ExecutionException executionException0) {
            return z ? new B(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzeu0, executionException0)) : new C(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new C(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + zzeu0, cancellationException0)) : new B(false, cancellationException0);
        }
        catch(Exception exception0) {
            return new C(exception0);
        }
        catch(Error exception0) {
            return new C(exception0);
        }
        return new B(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzeu0, executionException0));
    }

    public static Object f(zzeu zzeu0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = zzeu0.get();
                break;
            }
            catch(InterruptedException unused_ex) {
                z = true;
            }
            catch(Throwable throwable0) {
                if(z) {
                    Thread.currentThread().interrupt();
                }
                throw throwable0;
            }
        }
        if(z) {
            Thread.currentThread().interrupt();
        }
        return object0;
    }

    public final void g(StringBuilder stringBuilder0) {
        try {
            Object object0 = zzdy.f(this);
            stringBuilder0.append("SUCCESS, result=[");
            if(object0 == null) {
                stringBuilder0.append("null");
            }
            else if(object0 == this) {
                stringBuilder0.append("this future");
            }
            else {
                stringBuilder0.append(object0.getClass().getName());
                stringBuilder0.append("@");
                stringBuilder0.append(Integer.toHexString(System.identityHashCode(object0)));
            }
            stringBuilder0.append("]");
            return;
        }
        catch(ExecutionException executionException0) {
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
            return;
        }
        catch(Exception exception0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(exception0.getClass());
            stringBuilder0.append(" thrown from get()]");
            return;
        }
        stringBuilder0.append("FAILURE, cause=[");
        stringBuilder0.append(executionException0.getCause());
        stringBuilder0.append("]");
    }

    @Override
    public final Object get() throws InterruptedException, ExecutionException {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.i;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof F)) != 0) {
            return zzdy.k(object0);
        }
        K k0 = this.k;
        K k1 = K.c;
        if(k0 != k1) {
            K k2 = new K();
            while(true) {
                zzdy.n.m0(k2, k0);
                if(zzdy.n.s0(this, k0, k2)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.i;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof F)) != 0) {
                            return zzdy.k(object1);
                        }
                    }
                    this.j(k2);
                    throw new InterruptedException();
                }
                k0 = this.k;
                if(k0 == k1) {
                    break;
                }
            }
        }
        Object object2 = this.i;
        Objects.requireNonNull(object2);
        return zzdy.k(object2);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) throws InterruptedException, TimeoutException, ExecutionException {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.i;
        boolean z = true;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof F)) != 0) {
            return zzdy.k(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            K k0 = this.k;
            K k1 = K.c;
            if(k0 != k1) {
                K k2 = new K();
                while(true) {
                    zzdy.n.m0(k2, k0);
                    if(zzdy.n.s0(this, k0, k2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(v1, 0x1DCD64FFFFFFFFFFL));
                            if(Thread.interrupted()) {
                                this.j(k2);
                                throw new InterruptedException();
                            }
                            Object object1 = this.i;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof F)) != 0) {
                                return zzdy.k(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.j(k2);
                        goto label_30;
                    }
                    k0 = this.k;
                    if(k0 == k1) {
                        break;
                    }
                }
            }
            Object object2 = this.i;
            Objects.requireNonNull(object2);
            return zzdy.k(object2);
        }
    label_30:
        while(v1 > 0L) {
            Object object3 = this.i;
            if(((object3 == null ? 0 : 1) & !(object3 instanceof F)) != 0) {
                return zzdy.k(object3);
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

    public static void h(zzdy zzdy0) {
        D d4;
        Runnable runnable0;
        D d2;
        D d0 = null;
        while(true) {
            for(K k0 = zzdy.n.j0(zzdy0); k0 != null; k0 = k0.b) {
                Thread thread0 = k0.a;
                if(thread0 != null) {
                    k0.a = null;
                    LockSupport.unpark(thread0);
                }
            }
            zzdy0.c();
            D d1 = zzdy.n.h0(zzdy0);
            d2 = d0;
            while(d1 != null) {
                D d3 = d1.c;
                d1.c = d2;
                d2 = d1;
                d1 = d3;
            }
        label_18:
            if(d2 != null) {
                runnable0 = d2.a;
                d4 = d2.c;
                Objects.requireNonNull(runnable0);
                if(runnable0 instanceof F) {
                    zzdy0 = ((F)runnable0).i;
                    if(zzdy0.i == ((F)runnable0)) {
                        Object object0 = zzdy.e(((F)runnable0).j);
                        if(zzdy.n.r0(zzdy0, ((F)runnable0), object0)) {
                            d0 = d4;
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
                d2 = d4;
                goto label_18;
            }
            return;
        }
        Objects.requireNonNull(d2.b);
        zzdy.i(runnable0, d2.b);
        d2 = d4;
        goto label_18;
    }

    public static void i(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(Exception exception0) {
            zzdy.m.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", f.j("RuntimeException while executing runnable ", String.valueOf(runnable0), " with executor ", String.valueOf(executor0)), exception0);
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.i instanceof B;
    }

    @Override
    public final boolean isDone() {
        return this.i == null ? 0 : 1 & !(this.i instanceof F);
    }

    public final void j(K k0) {
        k0.a = null;
    alab1:
        K k1;
        while((k1 = this.k) != K.c) {
            K k2 = null;
            while(true) {
                if(k1 == null) {
                    break alab1;
                }
                K k3 = k1.b;
                if(k1.a != null) {
                    k2 = k1;
                }
                else if(k2 == null) {
                    if(zzdy.n.s0(this, k1, k3)) {
                        k1 = k3;
                        continue;
                    }
                    break;
                }
                else {
                    k2.b = k3;
                    if(k2.a == null) {
                        break;
                    }
                }
                k1 = k3;
            }
        }
    }

    public static final Object k(Object object0) {
        if(!(object0 instanceof B)) {
            if(object0 instanceof C) {
                throw new ExecutionException(((C)object0).a);
            }
            return object0 == zzdy.o ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((B)object0).b);
        throw cancellationException0;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        if(this.getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            stringBuilder0.append(this.getClass().getSimpleName());
        }
        else {
            stringBuilder0.append(this.getClass().getName());
        }
        stringBuilder0.append('@');
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder0.append("[status=");
        if(this.i instanceof B) {
            stringBuilder0.append("CANCELLED");
        }
        else if(this.isDone()) {
            this.g(stringBuilder0);
        }
        else {
            int v = stringBuilder0.length();
            stringBuilder0.append("PENDING");
            Object object0 = this.i;
            if(object0 instanceof F) {
                stringBuilder0.append(", setFuture=[");
                zzeu zzeu0 = ((F)object0).j;
                try {
                    if(zzeu0 == this) {
                        stringBuilder0.append("this future");
                    }
                    else {
                        stringBuilder0.append(zzeu0);
                    }
                }
                catch(Exception | StackOverflowError exception0) {
                    stringBuilder0.append("Exception thrown from implementation: ");
                    stringBuilder0.append(exception0.getClass());
                }
                stringBuilder0.append("]");
            }
            else {
                try {
                    s = this.b();
                    if(s == null || s.isEmpty()) {
                        s = null;
                    }
                }
                catch(Exception | StackOverflowError exception1) {
                    s = "Exception thrown from implementation: " + exception1.getClass();
                }
                if(s != null) {
                    stringBuilder0.append(", info=[");
                    stringBuilder0.append(s);
                    stringBuilder0.append("]");
                }
            }
            if(this.isDone()) {
                stringBuilder0.delete(v, stringBuilder0.length());
                this.g(stringBuilder0);
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.play_billing.zzeu
    public final void zzb(Runnable runnable0, Executor executor0) {
        zzbe.zzc(executor0, "Executor was null.");
        if(!this.isDone()) {
            D d0 = this.j;
            D d1 = D.d;
            if(d0 != d1) {
                D d2 = new D(runnable0, executor0);
                while(true) {
                    d2.c = d0;
                    if(zzdy.n.q0(this, d0, d2)) {
                        return;
                    }
                    d0 = this.j;
                    if(d0 == d1) {
                        break;
                    }
                }
            }
        }
        zzdy.i(runnable0, executor0);
    }
}

