package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzcuw {
    public final zzfgp a;
    public final zzdwh b;
    public final zzfbx c;

    public zzcuw(zzdwh zzdwh0, zzfbx zzfbx0, zzfgp zzfgp0) {
        this.a = zzfgp0;
        this.b = zzdwh0;
        this.c = zzfbx0;
    }

    public static String a(int v) {
        switch(v - 1) {
            case 0: {
                return "h";
            }
            case 1: {
                return "bb";
            }
            case 2: {
                return "cc";
            }
            case 3: {
                return "cb";
            }
            case 4: {
                return "ac";
            }
            default: {
                return "u";
            }
        }
    }

    public final void zza(long v, int v1) {
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue();
        zzfbx zzfbx0 = this.c;
        if(z) {
            zzfgo zzfgo0 = zzfgo.zzb("ad_closed");
            zzfgo0.zzg(zzfbx0.zzb.zzb);
            zzfgo0.zza("show_time", String.valueOf(v));
            zzfgo0.zza("ad_format", "app_open_ad");
            zzfgo0.zza("acr", zzcuw.a(v1));
            this.a.zzb(zzfgo0);
            return;
        }
        zzdwg zzdwg0 = this.b.zza();
        zzdwg0.zze(zzfbx0.zzb.zzb);
        zzdwg0.zzb("action", "ad_closed");
        zzdwg0.zzb("show_time", String.valueOf(v));
        zzdwg0.zzb("ad_format", "app_open_ad");
        zzdwg0.zzb("acr", zzcuw.a(v1));
        zzdwg0.zzg();
    }
}

