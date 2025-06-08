package x1;

import C1.d;
import E1.c;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import f0.g;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import m0.A;
import m0.B;
import o1.f;
import t1.a;
import u1.b;
import w3.k;

public final class l {
    public final Context a;
    public final A b;
    public final k c;
    public final long d;
    public k e;
    public k f;
    public i g;
    public final q h;
    public final d i;
    public final a j;
    public final a k;
    public final ExecutorService l;
    public final g m;
    public final b n;

    public l(f f0, q q0, b b0, A a0, a a1, a a2, d d0, ExecutorService executorService0) {
        this.b = a0;
        f0.a();
        this.a = f0.a;
        this.h = q0;
        this.n = b0;
        this.j = a1;
        this.k = a2;
        this.l = executorService0;
        this.i = d0;
        this.m = new g(executorService0);
        this.d = System.currentTimeMillis();
        this.c = new k();
    }

    public static Task a(l l0, E1.d d0) {
        Task task0;
        g g0 = l0.m;
        Object object0 = ((ThreadLocal)l0.m.m).get();
        if(!Boolean.TRUE.equals(object0)) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
        l0.e.l0();
        if(Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            j j0 = new j(l0);
            l0.j.a(j0);
            if(((c)((AtomicReference)d0.p).get()).b.a) {
                if(!l0.g.d(d0)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                task0 = l0.g.e(((TaskCompletionSource)((AtomicReference)d0.q).get()).getTask());
            }
            else {
                if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                }
                task0 = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
        }
        catch(Exception exception0) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", exception0);
            task0 = Tasks.forException(exception0);
        }
        finally {
            g0.q(new x1.k(l0, 0));
        }
        return task0;
    }

    public final void b(E1.d d0) {
        B b0 = new B(this, d0, 5, false);
        Future future0 = this.l.submit(b0);
        if(Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            future0.get(4L, TimeUnit.SECONDS);
        }
        catch(InterruptedException interruptedException0) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", interruptedException0);
        }
        catch(ExecutionException executionException0) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", executionException0);
        }
        catch(TimeoutException timeoutException0) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", timeoutException0);
        }
    }
}

