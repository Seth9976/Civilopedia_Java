package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import javax.annotation.Nullable;

public final class zzeir {
    public final zzfcs a;
    public final zzdtz b;
    public final zzdwh c;
    public final zzfgp d;

    public zzeir(zzfcs zzfcs0, zzdtz zzdtz0, zzdwh zzdwh0, zzfgp zzfgp0) {
        this.a = zzfcs0;
        this.b = zzdtz0;
        this.c = zzdwh0;
        this.d = zzfgp0;
    }

    public final void zza(zzfbo zzfbo0, zzfbl zzfbl0, int v, @Nullable zzefh zzefh0, long v1) {
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue();
        zzdtz zzdtz0 = this.b;
        zzfcs zzfcs0 = this.a;
        if(z) {
            zzfgo zzfgo0 = zzfgo.zzb("adapter_status");
            zzfgo0.zzg(zzfbo0);
            zzfgo0.zzf(zzfbl0);
            zzfgo0.zza("adapter_l", String.valueOf(v1));
            zzfgo0.zza("sc", Integer.toString(v));
            if(zzefh0 != null) {
                zzfgo0.zza("arec", Integer.toString(zzefh0.zzb().zza));
                String s = zzfcs0.zza(zzefh0.getMessage());
                if(s != null) {
                    zzfgo0.zza("areec", s);
                }
            }
            zzdty zzdty0 = zzdtz0.zzb(zzfbl0.zzu);
            if(zzdty0 != null) {
                zzfgo0.zza("ancn", zzdty0.zza);
                zzbwg zzbwg0 = zzdty0.zzb;
                if(zzbwg0 != null) {
                    zzfgo0.zza("adapter_v", zzbwg0.toString());
                }
                zzbwg zzbwg1 = zzdty0.zzc;
                if(zzbwg1 != null) {
                    zzfgo0.zza("adapter_sv", zzbwg1.toString());
                }
            }
            this.d.zzb(zzfgo0);
            return;
        }
        zzdwg zzdwg0 = this.c.zza();
        zzdwg0.zze(zzfbo0);
        zzdwg0.zzd(zzfbl0);
        zzdwg0.zzb("action", "adapter_status");
        zzdwg0.zzb("adapter_l", String.valueOf(v1));
        zzdwg0.zzb("sc", Integer.toString(v));
        if(zzefh0 != null) {
            zzdwg0.zzb("arec", Integer.toString(zzefh0.zzb().zza));
            String s1 = zzfcs0.zza(zzefh0.getMessage());
            if(s1 != null) {
                zzdwg0.zzb("areec", s1);
            }
        }
        zzdty zzdty1 = zzdtz0.zzb(zzfbl0.zzu);
        if(zzdty1 != null) {
            zzdwg0.zzb("ancn", zzdty1.zza);
            zzbwg zzbwg2 = zzdty1.zzb;
            if(zzbwg2 != null) {
                zzdwg0.zzb("adapter_v", zzbwg2.toString());
            }
            zzbwg zzbwg3 = zzdty1.zzc;
            if(zzbwg3 != null) {
                zzdwg0.zzb("adapter_sv", zzbwg3.toString());
            }
        }
        zzdwg0.zzg();
    }
}

