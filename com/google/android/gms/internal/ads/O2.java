package com.google.android.gms.internal.ads;

public final class o2 implements Thread.UncaughtExceptionHandler {
    public final int a;
    public final Thread.UncaughtExceptionHandler b;
    public final zzbyy c;

    public o2(zzbyy zzbyy0, Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0, int v) {
        this.a = v;
        this.c = zzbyy0;
        this.b = thread$UncaughtExceptionHandler0;
        super();
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler1;
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0;
        if(this.a != 0) {
            try {
                thread$UncaughtExceptionHandler0 = this.b;
                this.c.a(throwable0);
            }
            catch(Throwable unused_ex) {
                try {
                    zzcfi.zzg("AdMob exception reporter failed reporting the exception.");
                }
                catch(Throwable throwable1) {
                    if(thread$UncaughtExceptionHandler0 != null) {
                        thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
                    }
                    throw throwable1;
                }
                if(thread$UncaughtExceptionHandler0 != null) {
                    thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
                    return;
                }
                return;
            }
            if(thread$UncaughtExceptionHandler0 != null) {
                thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
                return;
            }
            return;
        }
        try {
            thread$UncaughtExceptionHandler1 = this.b;
            this.c.a(throwable0);
        }
        catch(Throwable unused_ex) {
            try {
                zzcfi.zzg("AdMob exception reporter failed reporting the exception.");
            }
            catch(Throwable throwable2) {
                if(thread$UncaughtExceptionHandler1 != null) {
                    thread$UncaughtExceptionHandler1.uncaughtException(thread0, throwable0);
                }
                throw throwable2;
            }
            if(thread$UncaughtExceptionHandler1 != null) {
                thread$UncaughtExceptionHandler1.uncaughtException(thread0, throwable0);
                return;
            }
            return;
        }
        if(thread$UncaughtExceptionHandler1 != null) {
            thread$UncaughtExceptionHandler1.uncaughtException(thread0, throwable0);
        }
    }
}

