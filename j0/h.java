package j0;

import O2.A;
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
import n1.a;

public abstract class h implements a {
    public volatile Object i;
    public volatile c j;
    public volatile g k;
    public static final boolean l;
    public static final Logger m;
    public static final A n;
    public static final Object o;

    static {
        d d0;
        h.l = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        h.m = Logger.getLogger("j0.h");
        try {
            d0 = new d(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "k"), AtomicReferenceFieldUpdater.newUpdater(h.class, c.class, "j"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "i"));
            throwable0 = null;
        }
        catch(Throwable throwable0) {
            d0 = new f();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        h.n = d0;
        if(throwable0 != null) {
            h.m.log(Level.SEVERE, "SafeAtomicHelper is broken!", throwable0);
        }
        h.o = new Object();
    }

    public final void a(StringBuilder stringBuilder0) {
        try {
            Object object0 = h.g(this);
            stringBuilder0.append("SUCCESS, result=[");
            stringBuilder0.append((object0 == this ? "this future" : String.valueOf(object0)));
            stringBuilder0.append("]");
        }
        catch(ExecutionException executionException0) {
            stringBuilder0.append("FAILURE, cause=[");
            stringBuilder0.append(executionException0.getCause());
            stringBuilder0.append("]");
        }
        catch(CancellationException unused_ex) {
            stringBuilder0.append("CANCELLED");
        }
        catch(RuntimeException runtimeException0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(runtimeException0.getClass());
            stringBuilder0.append(" thrown from get()]");
        }
    }

    public final void b(Runnable runnable0, Executor executor0) {
        executor0.getClass();
        c c0 = this.j;
        c c1 = c.d;
        if(c0 != c1) {
            c c2 = new c(runnable0, executor0);
            while(true) {
                c2.c = c0;
                if(h.n.h(this, c0, c2)) {
                    return;
                }
                c0 = this.j;
                if(c0 == c1) {
                    break;
                }
            }
        }
        h.d(runnable0, executor0);
    }

    public static void c(h h0) {
        Runnable runnable0;
        c c2;
        c c1;
        c c0 = null;
        while(true) {
            g g0 = h0.k;
            if(!h.n.j(h0, g0, g.c)) {
                continue;
            }
            while(g0 != null) {
                Thread thread0 = g0.a;
                if(thread0 != null) {
                    g0.a = null;
                    LockSupport.unpark(thread0);
                }
                g0 = g0.b;
            }
            do {
                c1 = h0.j;
            }
            while(!h.n.h(h0, c1, c.d));
            while(true) {
                c2 = c0;
                c0 = c1;
                if(c0 == null) {
                    break;
                }
                c1 = c0.c;
                c0.c = c2;
            }
        label_18:
            if(c2 != null) {
                c0 = c2.c;
                runnable0 = c2.a;
                if(runnable0 instanceof e) {
                    h0 = ((e)runnable0).i;
                    if(h0.i == ((e)runnable0)) {
                        Object object0 = h.f(((e)runnable0).j);
                        if(h.n.i(h0, ((e)runnable0), object0)) {
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
                c2 = c0;
                goto label_18;
            }
            return;
        }
        h.d(runnable0, c2.b);
        c2 = c0;
        goto label_18;
    }

    @Override
    public final boolean cancel(boolean z) {
        j0.a a0;
        Object object0 = this.i;
        if((object0 == null | object0 instanceof e) != 0) {
            if(h.l) {
                a0 = new j0.a(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                a0 = z ? j0.a.c : j0.a.d;
            }
            boolean z1 = false;
            h h0 = this;
            while(true) {
                if(h.n.i(h0, object0, a0)) {
                    h.c(h0);
                    if(object0 instanceof e) {
                        a a1 = ((e)object0).j;
                        if(!(a1 instanceof h)) {
                            ((h)a1).cancel(z);
                            return true;
                        }
                        h0 = (h)a1;
                        object0 = h0.i;
                        if((object0 == null | object0 instanceof e) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = h0.i;
                if(!(object0 instanceof e)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    public static void d(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            h.m.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    public static Object e(Object object0) {
        if(!(object0 instanceof j0.a)) {
            if(object0 instanceof b) {
                throw new ExecutionException(((b)object0).a);
            }
            return object0 == h.o ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((j0.a)object0).b);
        throw cancellationException0;
    }

    public static Object f(a a0) {
        if(a0 instanceof h) {
            j0.a a1 = ((h)a0).i;
            if(a1 instanceof j0.a && a1.a) {
                return a1.b == null ? j0.a.d : new j0.a(false, a1.b);
            }
            return a1;
        }
        boolean z = ((h)a0).i instanceof j0.a;
        if((!h.l & z) != 0) {
            return j0.a.d;
        }
        try {
            Object object0 = h.g(a0);
            return object0 == null ? h.o : object0;
        }
        catch(ExecutionException executionException0) {
            return new b(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + a0, cancellationException0)) : new j0.a(false, cancellationException0);
        }
        catch(Throwable throwable0) {
            return new b(throwable0);
        }
    }

    public static Object g(a a0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = ((h)a0).get();
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

    @Override
    public final Object get() {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.i;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof e)) != 0) {
            return h.e(object0);
        }
        g g0 = this.k;
        g g1 = g.c;
        if(g0 != g1) {
            g g2 = new g();
            while(true) {
                h.n.V(g2, g0);
                if(h.n.j(this, g0, g2)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.i;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof e)) != 0) {
                            return h.e(object1);
                        }
                    }
                    this.i(g2);
                    throw new InterruptedException();
                }
                g0 = this.k;
                if(g0 == g1) {
                    break;
                }
            }
        }
        return h.e(this.i);
    }

    @Override
    public final Object get(long v, TimeUnit timeUnit0) {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.i;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof e)) != 0) {
            return h.e(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            g g0 = this.k;
            g g1 = g.c;
            if(g0 != g1) {
                g g2 = new g();
                while(true) {
                    h.n.V(g2, g0);
                    if(h.n.j(this, g0, g2)) {
                        do {
                            LockSupport.parkNanos(this, v1);
                            if(Thread.interrupted()) {
                                this.i(g2);
                                throw new InterruptedException();
                            }
                            Object object1 = this.i;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof e)) != 0) {
                                return h.e(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.i(g2);
                        goto label_27;
                    }
                    g0 = this.k;
                    if(g0 == g1) {
                        break;
                    }
                }
            }
            return h.e(this.i);
        }
    label_27:
        while(v1 > 0L) {
            Object object2 = this.i;
            if(((object2 == null ? 0 : 1) & !(object2 instanceof e)) != 0) {
                return h.e(object2);
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
            String s3 = q.e.b(s2, " (plus ");
            long v3 = timeUnit0.convert(-v1, TimeUnit.NANOSECONDS);
            long v4 = -v1 - timeUnit0.toNanos(v3);
            int v5 = Long.compare(v3, 0L);
            boolean z = v5 == 0 || v4 > 1000L;
            if(v5 > 0) {
                s3 = q.e.b((z ? q.e.b((s3 + v3 + " " + s1), ",") : s3 + v3 + " " + s1), " ");
            }
            if(z) {
                s3 = s3 + v4 + " nanoseconds ";
            }
            s2 = q.e.b(s3, "delay)");
        }
        throw this.isDone() ? new TimeoutException(q.e.b(s2, " but future completed as timeout expired")) : new TimeoutException(A.f.i(s2, " for ", s));
    }

    public final String h() {
        Object object0 = this.i;
        if(object0 instanceof e) {
            StringBuilder stringBuilder0 = new StringBuilder("setFuture=[");
            a a0 = ((e)object0).j;
            return a0 == this ? i3.e.h(stringBuilder0, "this future", "]") : i3.e.h(stringBuilder0, String.valueOf(a0), "]");
        }
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    public final void i(g g0) {
        g0.a = null;
    alab1:
        while(true) {
            g g1 = this.k;
            if(g1 == g.c) {
                return;
            }
            g g2 = null;
            while(true) {
                if(g1 == null) {
                    break alab1;
                }
                g g3 = g1.b;
                if(g1.a != null) {
                    g2 = g1;
                }
                else if(g2 == null) {
                    if(h.n.j(this, g1, g3)) {
                        g1 = g3;
                        continue;
                    }
                    break;
                }
                else {
                    g2.b = g3;
                    if(g2.a == null) {
                        break;
                    }
                }
                g1 = g3;
            }
        }
    }

    @Override
    public final boolean isCancelled() {
        return this.i instanceof j0.a;
    }

    @Override
    public final boolean isDone() {
        return this.i == null ? 0 : !(this.i instanceof e) & 1;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append("[status=");
        if(this.i instanceof j0.a) {
            stringBuilder0.append("CANCELLED");
        }
        else if(this.isDone()) {
            this.a(stringBuilder0);
        }
        else {
            try {
                s = this.h();
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
                this.a(stringBuilder0);
            }
            else {
                stringBuilder0.append("PENDING");
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

