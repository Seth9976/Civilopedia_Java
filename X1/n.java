package x1;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import k.d;
import u1.b;

public final class n implements Thread.UncaughtExceptionHandler {
    public final d a;
    public final E1.d b;
    public final Thread.UncaughtExceptionHandler c;
    public final b d;
    public final AtomicBoolean e;

    public n(d d0, E1.d d1, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0, b b0) {
        this.a = d0;
        this.b = d1;
        this.c = thread$UncaughtExceptionHandler0;
        this.e = new AtomicBoolean(false);
        this.d = b0;
    }

    public final boolean a(Thread thread0, Throwable throwable0) {
        if(thread0 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if(throwable0 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if(this.d.b()) {
            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        }
        return true;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.c;
        AtomicBoolean atomicBoolean0 = this.e;
        atomicBoolean0.set(true);
        try {
            try {
                if(this.a(thread0, throwable0)) {
                    this.a.h(this.b, thread0, throwable0);
                }
                else if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                goto label_21;
            }
            catch(Exception exception0) {
            }
            Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", exception0);
        }
        catch(Throwable throwable1) {
            goto label_16;
        }
        if(Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
            atomicBoolean0.set(false);
            return;
        label_16:
            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
            thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
            atomicBoolean0.set(false);
            throw throwable1;
        label_21:
            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
            }
        }
        thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
        atomicBoolean0.set(false);
    }
}

