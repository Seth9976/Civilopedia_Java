package com.google.android.gms.internal.ads;

import A.f;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzftt extends zzfwd implements zzfvl {
    public volatile Object i;
    public volatile O7 j;
    public volatile W7 k;
    public static final boolean l;
    public static final Logger m;
    public static final h n;
    public static final Object o;

    static {
        Throwable throwable1;
        Throwable throwable0;
        V7 v70;
        Class class0 = W7.class;
        zzftt.l = false;
        Class class1 = zzftt.class;
        zzftt.m = Logger.getLogger(class1.getName());
        try {
            v70 = new V7();  // 初始化器: Ljava/lang/Object;-><init>()V
            throwable0 = null;
            throwable1 = null;
        }
        catch(RuntimeException | Error runtimeException0) {
            try {
                throwable1 = null;
                throwable0 = runtimeException0;
                v70 = new P7(AtomicReferenceFieldUpdater.newUpdater(class0, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(class0, class0, "b"), AtomicReferenceFieldUpdater.newUpdater(class1, class0, "k"), AtomicReferenceFieldUpdater.newUpdater(class1, O7.class, "j"), AtomicReferenceFieldUpdater.newUpdater(class1, Object.class, "i"));
            }
            catch(RuntimeException | Error runtimeException1) {
                throwable1 = runtimeException1;
                throwable0 = runtimeException0;
                v70 = new R7();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
        }
        zzftt.n = v70;
        if(throwable1 != null) {
            Level level0 = Level.SEVERE;
            zzftt.m.logp(level0, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", throwable0);
            zzftt.m.logp(level0, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", throwable1);
        }
        zzftt.o = new Object();
    }

    @Override  // com.google.android.gms.internal.ads.zzfwd
    public final Throwable a() {
        if(this instanceof S7) {
            return this.i instanceof N7 ? ((N7)this.i).a : null;
        }
        return null;
    }

    public final void b(W7 w70) {
        w70.a = null;
    alab1:
        W7 w71;
        while((w71 = this.k) != W7.c) {
            W7 w72 = null;
            while(true) {
                if(w71 == null) {
                    break alab1;
                }
                W7 w73 = w71.b;
                if(w71.a != null) {
                    w72 = w71;
                }
                else if(w72 == null) {
                    if(zzftt.n.Z(this, w71, w73)) {
                        w71 = w73;
                        continue;
                    }
                    break;
                }
                else {
                    w72.b = w73;
                    if(w72.a == null) {
                        break;
                    }
                }
                w71 = w73;
            }
        }
    }

    public static final Object c(Object object0) {
        if(!(object0 instanceof L7)) {
            if(object0 instanceof N7) {
                throw new ExecutionException(((N7)object0).a);
            }
            return object0 == zzftt.o ? null : object0;
        }
        CancellationException cancellationException0 = new CancellationException("Task was cancelled.");
        cancellationException0.initCause(((L7)object0).b);
        throw cancellationException0;
    }

    @Override
    public boolean cancel(boolean z) {
        L7 l70;
        Object object0 = this.i;
        if((object0 == null | object0 instanceof Q7) != 0) {
            if(zzftt.l) {
                l70 = new L7(z, new CancellationException("Future.cancel() was called."));
            }
            else {
                l70 = z ? L7.c : L7.d;
                l70.getClass();
            }
            boolean z1 = false;
            zzftt zzftt0 = this;
            while(true) {
                if(zzftt.n.V(zzftt0, object0, l70)) {
                    if(z) {
                        zzftt0.h();
                    }
                    zzftt.m(zzftt0);
                    if(object0 instanceof Q7) {
                        zzfvl zzfvl0 = ((Q7)object0).j;
                        if(!(zzfvl0 instanceof S7)) {
                            zzfvl0.cancel(z);
                            return true;
                        }
                        zzftt0 = (zzftt)zzfvl0;
                        object0 = zzftt0.i;
                        if((object0 == null | object0 instanceof Q7) != 0) {
                            z1 = true;
                            continue;
                        }
                    }
                    return true;
                }
                object0 = zzftt0.i;
                if(!(object0 instanceof Q7)) {
                    break;
                }
            }
            return z1;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    public String d() {
        return this instanceof ScheduledFuture ? "remaining delay=[" + ((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS) + " ms]" : null;
    }

    public void e() {
    }

    public static Object f(zzfvl zzfvl0) {
        if(zzfvl0 instanceof S7) {
            L7 l70 = ((zzftt)zzfvl0).i;
            if(l70 instanceof L7 && l70.a) {
                l70 = l70.b == null ? L7.d : new L7(false, l70.b);
            }
            l70.getClass();
            return l70;
        }
        if(zzfvl0 instanceof zzfwd) {
            Throwable throwable0 = ((zzfwd)zzfvl0).a();
            if(throwable0 != null) {
                return new N7(throwable0);
            }
        }
        boolean z = zzfvl0.isCancelled();
        if((!zzftt.l & z) != 0) {
            L7.d.getClass();
            return L7.d;
        }
        try {
            Object object0 = zzftt.g(zzfvl0);
            if(z) {
                return new L7(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzfvl0));
            }
            return object0 == null ? zzftt.o : object0;
        }
        catch(ExecutionException executionException0) {
            return z ? new L7(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzfvl0, executionException0)) : new N7(executionException0.getCause());
        }
        catch(CancellationException cancellationException0) {
            return !z ? new N7(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + zzfvl0, cancellationException0)) : new L7(false, cancellationException0);
        }
        catch(RuntimeException runtimeException0) {
            return new N7(runtimeException0);
        }
        catch(Error runtimeException0) {
            return new N7(runtimeException0);
        }
        return new L7(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzfvl0, executionException0));
    }

    public static Object g(zzfvl zzfvl0) {
        Object object0;
        boolean z = false;
        while(true) {
            try {
                object0 = zzfvl0.get();
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
    public Object get() throws InterruptedException, ExecutionException {
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.i;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof Q7)) != 0) {
            return zzftt.c(object0);
        }
        W7 w70 = this.k;
        W7 w71 = W7.c;
        if(w70 != w71) {
            W7 w72 = new W7();
            while(true) {
                zzftt.n.E(w72, w70);
                if(zzftt.n.Z(this, w70, w72)) {
                    while(true) {
                        LockSupport.park(this);
                        if(Thread.interrupted()) {
                            break;
                        }
                        Object object1 = this.i;
                        if(((object1 == null ? 0 : 1) & !(object1 instanceof Q7)) != 0) {
                            return zzftt.c(object1);
                        }
                    }
                    this.b(w72);
                    throw new InterruptedException();
                }
                w70 = this.k;
                if(w70 == w71) {
                    break;
                }
            }
        }
        Object object2 = this.i;
        object2.getClass();
        return zzftt.c(object2);
    }

    @Override
    public Object get(long v, TimeUnit timeUnit0) throws InterruptedException, TimeoutException, ExecutionException {
        long v1 = timeUnit0.toNanos(v);
        if(Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object object0 = this.i;
        boolean z = true;
        if(((object0 == null ? 0 : 1) & !(object0 instanceof Q7)) != 0) {
            return zzftt.c(object0);
        }
        long v2 = v1 <= 0L ? 0L : System.nanoTime() + v1;
        if(v1 >= 1000L) {
            W7 w70 = this.k;
            W7 w71 = W7.c;
            if(w70 != w71) {
                W7 w72 = new W7();
                while(true) {
                    zzftt.n.E(w72, w70);
                    if(zzftt.n.Z(this, w70, w72)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(v1, 0x1DCD64FFFFFFFFFFL));
                            if(Thread.interrupted()) {
                                this.b(w72);
                                throw new InterruptedException();
                            }
                            Object object1 = this.i;
                            if(((object1 == null ? 0 : 1) & !(object1 instanceof Q7)) != 0) {
                                return zzftt.c(object1);
                            }
                            v1 = v2 - System.nanoTime();
                        }
                        while(v1 >= 1000L);
                        this.b(w72);
                        goto label_30;
                    }
                    w70 = this.k;
                    if(w70 == w71) {
                        break;
                    }
                }
            }
            Object object2 = this.i;
            object2.getClass();
            return zzftt.c(object2);
        }
    label_30:
        while(v1 > 0L) {
            Object object3 = this.i;
            if(((object3 == null ? 0 : 1) & !(object3 instanceof Q7)) != 0) {
                return zzftt.c(object3);
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

    public void h() {
    }

    public final void i(Future future0) {
        if((future0 != null & this.isCancelled()) != 0) {
            future0.cancel(this.k());
        }
    }

    @Override
    public boolean isCancelled() {
        return this.i instanceof L7;
    }

    @Override
    public boolean isDone() {
        return this.i == null ? 0 : !(this.i instanceof Q7) & 1;
    }

    public final void j(zzfvl zzfvl0) {
        N7 n70;
        zzfvl0.getClass();
        Object object0 = this.i;
        if(object0 == null) {
            if(zzfvl0.isDone()) {
                Object object1 = zzftt.f(zzfvl0);
                if(zzftt.n.V(this, null, object1)) {
                    zzftt.m(this);
                }
                return;
            }
            Q7 q70 = new Q7(this, zzfvl0);
            if(zzftt.n.V(this, null, q70)) {
                try {
                    zzfvl0.zzc(q70, j8.i);
                }
                catch(RuntimeException | Error runtimeException0) {
                    try {
                        n70 = new N7(runtimeException0);
                    }
                    catch(RuntimeException | Error unused_ex) {
                        n70 = N7.b;
                    }
                    zzftt.n.V(this, q70, n70);
                }
                return;
            }
            object0 = this.i;
        }
        if(object0 instanceof L7) {
            zzfvl0.cancel(((L7)object0).a);
        }
    }

    // 去混淆评级： 低(20)
    public final boolean k() {
        return this.i instanceof L7 && ((L7)this.i).a;
    }

    public final void l(StringBuilder stringBuilder0) {
        try {
            Object object0 = zzftt.g(this);
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
        catch(RuntimeException runtimeException0) {
            stringBuilder0.append("UNKNOWN, cause=[");
            stringBuilder0.append(runtimeException0.getClass());
            stringBuilder0.append(" thrown from get()]");
            return;
        }
        stringBuilder0.append("FAILURE, cause=[");
        stringBuilder0.append(executionException0.getCause());
        stringBuilder0.append("]");
    }

    public static void m(zzftt zzftt0) {
        Runnable runnable0;
        O7 o72;
        O7 o70 = null;
        while(true) {
            for(W7 w70 = zzftt.n.r(zzftt0); w70 != null; w70 = w70.b) {
                Thread thread0 = w70.a;
                if(thread0 != null) {
                    w70.a = null;
                    LockSupport.unpark(thread0);
                }
            }
            zzftt0.e();
            O7 o71 = zzftt.n.d(zzftt0);
            o72 = o70;
            while(o71 != null) {
                O7 o73 = o71.c;
                o71.c = o72;
                o72 = o71;
                o71 = o73;
            }
        label_18:
            if(o72 != null) {
                o70 = o72.c;
                runnable0 = o72.a;
                runnable0.getClass();
                if(runnable0 instanceof Q7) {
                    zzftt0 = ((Q7)runnable0).i;
                    if(zzftt0.i == ((Q7)runnable0)) {
                        Object object0 = zzftt.f(((Q7)runnable0).j);
                        if(zzftt.n.V(zzftt0, ((Q7)runnable0), object0)) {
                            continue;
                        }
                    }
                }
                else {
                    break;
                }
                o72 = o70;
                goto label_18;
            }
            return;
        }
        o72.b.getClass();
        zzftt.n(runnable0, o72.b);
        o72 = o70;
        goto label_18;
    }

    public static void n(Runnable runnable0, Executor executor0) {
        try {
            executor0.execute(runnable0);
        }
        catch(RuntimeException runtimeException0) {
            zzftt.m.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable0 + " with executor " + executor0, runtimeException0);
        }
    }

    @Override
    public String toString() {
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
        if(this.isCancelled()) {
            stringBuilder0.append("CANCELLED");
        }
        else if(this.isDone()) {
            this.l(stringBuilder0);
        }
        else {
            int v = stringBuilder0.length();
            stringBuilder0.append("PENDING");
            Object object0 = this.i;
            if(object0 instanceof Q7) {
                stringBuilder0.append(", setFuture=[");
                zzfvl zzfvl0 = ((Q7)object0).j;
                try {
                    if(zzfvl0 == this) {
                        stringBuilder0.append("this future");
                    }
                    else {
                        stringBuilder0.append(zzfvl0);
                    }
                }
                catch(RuntimeException | StackOverflowError runtimeException0) {
                    stringBuilder0.append("Exception thrown from implementation: ");
                    stringBuilder0.append(runtimeException0.getClass());
                }
                stringBuilder0.append("]");
            }
            else {
                try {
                    s = zzfpi.zza(this.d());
                }
                catch(RuntimeException | StackOverflowError runtimeException1) {
                    Class class0 = runtimeException1.getClass();
                    class0.toString();
                    s = "Exception thrown from implementation: " + class0;
                }
                if(s != null) {
                    stringBuilder0.append(", info=[");
                    stringBuilder0.append(s);
                    stringBuilder0.append("]");
                }
            }
            if(this.isDone()) {
                stringBuilder0.delete(v, stringBuilder0.length());
                this.l(stringBuilder0);
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfvl
    public void zzc(Runnable runnable0, Executor executor0) {
        zzfou.zzc(runnable0, "Runnable was null.");
        zzfou.zzc(executor0, "Executor was null.");
        if(!this.isDone()) {
            O7 o70 = this.j;
            O7 o71 = O7.d;
            if(o70 != o71) {
                O7 o72 = new O7(runnable0, executor0);
                while(true) {
                    o72.c = o70;
                    if(zzftt.n.T(this, o70, o72)) {
                        return;
                    }
                    o70 = this.j;
                    if(o70 == o71) {
                        break;
                    }
                }
            }
        }
        zzftt.n(runnable0, executor0);
    }

    public boolean zzd(Object object0) {
        if(object0 == null) {
            object0 = zzftt.o;
        }
        if(zzftt.n.V(this, null, object0)) {
            zzftt.m(this);
            return true;
        }
        return false;
    }

    public boolean zze(Throwable throwable0) {
        throwable0.getClass();
        N7 n70 = new N7(throwable0);
        if(zzftt.n.V(this, null, n70)) {
            zzftt.m(this);
            return true;
        }
        return false;
    }
}

