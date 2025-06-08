package com.google.android.gms.internal.ads;

public final class zzee {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d;

    public zzee(long v) {
        this.d = new ThreadLocal();
        this.zzf(0L);
    }

    public final long zza(long v) {
        synchronized(this) {
            if(this.b == 0x8000000000000001L) {
                long v2 = this.a;
                if(v2 == 0x7FFFFFFFFFFFFFFEL) {
                    Long long0 = (Long)this.d.get();
                    if(long0 == null) {
                        throw null;
                    }
                    v2 = (long)long0;
                }
                this.b = v2 - v;
                this.notifyAll();
            }
            this.c = v;
            return v + this.b;
        }
    }

    public final long zzb(long v) {
        synchronized(this) {
            return v == 0x8000000000000001L ? 0x8000000000000001L : this.zza(v * 1000000L / 90000L);
        }
    }

    public final long zzc() {
        synchronized(this) {
            long v = this.a;
            if(v != 0x7FFFFFFFFFFFFFFFL && v != 0x7FFFFFFFFFFFFFFEL) {
                return v;
            }
        }
        return 0x8000000000000001L;
    }

    public final long zzd() {
        synchronized(this) {
            long v1 = this.c;
            return v1 == 0x8000000000000001L ? this.zzc() : v1 + this.b;
        }
    }

    public final long zze() {
        synchronized(this) {
        }
        return this.b;
    }

    public final void zzf(long v) {
        synchronized(this) {
            this.a = v;
            this.b = v == 0x7FFFFFFFFFFFFFFFL ? 0L : 0x8000000000000001L;
            this.c = 0x8000000000000001L;
        }
    }
}

