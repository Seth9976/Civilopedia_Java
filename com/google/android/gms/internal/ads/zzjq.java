package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

public final class zzjq {
    public final zzjp a;
    public final zzjo b;
    public final zzcx c;
    public int d;
    public Object e;
    public final Looper f;
    public boolean g;
    public boolean h;
    public boolean i;

    public zzjq(zzjo zzjo0, zzjp zzjp0, zzci zzci0, int v, zzcx zzcx0, Looper looper0) {
        this.b = zzjo0;
        this.a = zzjp0;
        this.f = looper0;
        this.c = zzcx0;
    }

    public final int zza() {
        return this.d;
    }

    public final Looper zzb() {
        return this.f;
    }

    public final zzjp zzc() {
        return this.a;
    }

    public final zzjq zzd() {
        zzcw.zzf(!this.g);
        this.g = true;
        this.b.zzm(this);
        return this;
    }

    public final zzjq zze(Object object0) {
        zzcw.zzf(!this.g);
        this.e = object0;
        return this;
    }

    public final zzjq zzf(int v) {
        zzcw.zzf(!this.g);
        this.d = v;
        return this;
    }

    public final Object zzg() {
        return this.e;
    }

    public final void zzh(boolean z) {
        synchronized(this) {
            this.h |= z;
            this.i = true;
            this.notifyAll();
        }
    }

    public final boolean zzi(long v) throws InterruptedException, TimeoutException {
        synchronized(this) {
            zzcw.zzf(this.g);
            zzcw.zzf(this.f.getThread() != Thread.currentThread());
            long v2 = SystemClock.elapsedRealtime() + v;
            while(!this.i) {
                if(v <= 0L) {
                    throw new TimeoutException("Message delivery timed out.");
                }
                this.wait(v);
                v = v2 - SystemClock.elapsedRealtime();
            }
            return this.h;
        }
    }

    public final boolean zzj() [...] // Potential decryptor
}

