package com.google.android.gms.internal.ads;

public final class zzdjw extends zzdhc {
    public boolean j;

    public final void zza() {
        this.a(zzdjs.zza);
    }

    public final void zzb() {
        this.a(zzdju.zza);
    }

    public final void zzc() {
        synchronized(this) {
            if(!this.j) {
                this.a(zzdjt.zza);
                this.j = true;
            }
            this.a(zzdjv.zza);
        }
    }

    public final void zzd() {
        synchronized(this) {
            this.a(zzdjt.zza);
            this.j = true;
        }
    }
}

