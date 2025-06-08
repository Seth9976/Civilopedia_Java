package com.google.android.gms.internal.measurement;

public abstract class u implements Runnable {
    public final long i;
    public final long j;
    public final boolean k;
    public final zzee l;

    public u(zzee zzee0, boolean z) {
        this.l = zzee0;
        this.i = zzee0.a.currentTimeMillis();
        this.j = zzee0.a.elapsedRealtime();
        this.k = z;
    }

    public abstract void a();

    public void b() {
    }

    @Override
    public final void run() {
        zzee zzee0 = this.l;
        if(zzee0.f) {
            this.b();
            return;
        }
        try {
            this.a();
        }
        catch(Exception exception0) {
            zzee0.a(exception0, false, this.k);
            this.b();
        }
    }
}

