package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

public final class u8 extends TimeoutException {
    public final int i;

    public u8(String s, int v) {
        this.i = v;
        super(s);
    }

    private final Throwable a() {
        synchronized(this) {
            this.setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }

    private final Throwable b() {
        synchronized(this) {
            this.setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }

    @Override
    public final Throwable fillInStackTrace() {
        if(this.i != 0) {
            this.b();
            return this;
        }
        this.a();
        return this;
    }
}

