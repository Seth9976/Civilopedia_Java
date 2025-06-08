package com.google.android.gms.internal.ads;

public final class zziu {
    public boolean a;
    public Fa zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;

    public zziu(Fa fa0) {
        this.zza = fa0;
    }

    public final void zza(int v) {
        this.a = 1 == (this.a | v);
        this.zzb += v;
    }

    public final void zzb(int v) {
        this.a = true;
        this.zze = true;
        this.zzf = v;
    }

    public final void zzc(Fa fa0) {
        this.a |= this.zza != fa0;
        this.zza = fa0;
    }

    public final void zzd(int v) {
        boolean z = true;
        if(this.zzc && this.zzd != 5) {
            if(v != 5) {
                z = false;
            }
            zzcw.zzd(z);
            return;
        }
        this.a = true;
        this.zzc = true;
        this.zzd = v;
    }
}

