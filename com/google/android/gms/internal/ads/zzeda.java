package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

public final class zzeda implements zzdim {
    public boolean i;
    public boolean j;
    public final String k;
    public final zzfgp l;
    public final zzg m;

    public zzeda(String s, zzfgp zzfgp0) {
        this.i = false;
        this.j = false;
        this.k = s;
        this.l = zzfgp0;
        this.m = zzt.zzo().zzh();
    }

    public final zzfgo a(String s) {
        String s1 = this.m.zzP() ? "" : this.k;
        zzfgo zzfgo0 = zzfgo.zzb(s);
        zzfgo0.zza("tms", Long.toString(zzt.zzA().elapsedRealtime(), 10));
        zzfgo0.zza("tid", s1);
        return zzfgo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zza(String s) {
        zzfgo zzfgo0 = this.a("aaia");
        zzfgo0.zza("aair", "MalformedJson");
        this.l.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zzb(String s, String s1) {
        zzfgo zzfgo0 = this.a("adapter_init_finished");
        zzfgo0.zza("ancn", s);
        zzfgo0.zza("rqe", s1);
        this.l.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zzc(String s) {
        zzfgo zzfgo0 = this.a("adapter_init_started");
        zzfgo0.zza("ancn", s);
        this.l.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zzd(String s) {
        zzfgo zzfgo0 = this.a("adapter_init_finished");
        zzfgo0.zza("ancn", s);
        this.l.zzb(zzfgo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zze() {
        synchronized(this) {
            if(!this.j) {
                zzfgo zzfgo0 = this.a("init_finished");
                this.l.zzb(zzfgo0);
                this.j = true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdim
    public final void zzf() {
        synchronized(this) {
            if(!this.i) {
                zzfgo zzfgo0 = this.a("init_started");
                this.l.zzb(zzfgo0);
                this.i = true;
            }
        }
    }
}

