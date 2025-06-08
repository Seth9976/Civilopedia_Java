package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbop {
    public boolean a;
    public boolean b;
    public float c;
    public final AtomicBoolean d;

    public zzbop() {
        this.a = false;
        this.b = false;
        this.c = 0.0f;
        this.d = new AtomicBoolean(false);
    }

    public final float zza() {
        synchronized(this) {
        }
        return this.c;
    }

    public final void zzb(boolean z, float f) {
        synchronized(this) {
            this.b = z;
            this.c = f;
        }
    }

    public final void zzc(boolean z) {
        synchronized(this) {
            this.a = z;
            this.d.set(true);
        }
    }

    public final boolean zzd() {
        synchronized(this) {
        }
        return this.b;
    }

    public final boolean zze(boolean z) {
        synchronized(this) {
            return this.d.get() ? this.a : z;
        }
    }
}

