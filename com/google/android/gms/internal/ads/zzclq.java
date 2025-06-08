package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;

public final class zzclq implements zzfpj {
    public final Context zza;
    public final zzcmx zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final zzaoc zzf;
    public final zzbiy zzg;
    public final zzcfo zzh;
    public final zzl zzi;
    public final zza zzj;
    public final zzbdm zzk;
    public final zzfbl zzl;
    public final zzfbo zzm;

    public zzclq(Context context0, zzcmx zzcmx0, String s, boolean z, boolean z1, zzaoc zzaoc0, zzbiy zzbiy0, zzcfo zzcfo0, zzbio zzbio0, zzl zzl0, zza zza0, zzbdm zzbdm0, zzfbl zzfbl0, zzfbo zzfbo0) {
        this.zza = context0;
        this.zzb = zzcmx0;
        this.zzc = s;
        this.zzd = z;
        this.zze = z1;
        this.zzf = zzaoc0;
        this.zzg = zzbiy0;
        this.zzh = zzcfo0;
        this.zzi = zzl0;
        this.zzj = zza0;
        this.zzk = zzbdm0;
        this.zzl = zzfbl0;
        this.zzm = zzfbo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfpj
    public final Object zza() {
        try {
            TrafficStats.setThreadStatsTag(0x108);
            zzclx zzclx0 = new zzclx(new o3(new zzcmw(this.zza), this.zzb, this.zzc, this.zzd, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm));
            zzclx0.setWebViewClient(zzt.zzq().zzd(zzclx0, this.zzk, this.zze));
            zzclx0.setWebChromeClient(new zzclh(zzclx0));
            return zzclx0;
        }
        finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}

