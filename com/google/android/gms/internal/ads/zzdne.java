package com.google.android.gms.internal.ads;

public final class zzdne {
    public zzbky a;

    public zzdne(zzdmt zzdmt0) {
        this.a = zzdmt0;
    }

    public final zzbky zza() {
        synchronized(this) {
        }
        return this.a;
    }

    public final void zzb(zzbky zzbky0) {
        synchronized(this) {
            this.a = zzbky0;
        }
    }
}

