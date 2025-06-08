package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Map;

public final class zzdwq {
    public final zzg a;
    public final ArrayList b;
    public boolean c;
    public boolean d;
    public final String e;
    public final zzdwm f;

    public zzdwq(String s, zzdwm zzdwm0) {
        this.b = new ArrayList();
        this.c = false;
        this.d = false;
        this.e = s;
        this.f = zzdwm0;
        this.a = zzt.zzo().zzh();
    }

    public final Map a() {
        Map map0 = this.f.zza();
        map0.put("tms", Long.toString(zzt.zzA().elapsedRealtime(), 10));
        map0.put("tid", (this.a.zzP() ? "" : this.e));
        return map0;
    }

    public final void zza(String s) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbL)).booleanValue() && !((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                Map map0 = this.a();
                map0.put("action", "aaia");
                map0.put("aair", "MalformedJson");
                this.b.add(map0);
            }
        }
    }

    public final void zzb(String s, String s1) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbL)).booleanValue() && !((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                Map map0 = this.a();
                map0.put("action", "adapter_init_finished");
                map0.put("ancn", s);
                map0.put("rqe", s1);
                this.b.add(map0);
            }
        }
    }

    public final void zzc(String s) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbL)).booleanValue() && !((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                Map map0 = this.a();
                map0.put("action", "adapter_init_started");
                map0.put("ancn", s);
                this.b.add(map0);
            }
        }
    }

    public final void zzd(String s) {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbL)).booleanValue() && !((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
                Map map0 = this.a();
                map0.put("action", "adapter_init_finished");
                map0.put("ancn", s);
                this.b.add(map0);
            }
        }
    }

    public final void zze() {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbL)).booleanValue() && !((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue() && !this.d) {
                Map map0 = this.a();
                map0.put("action", "init_finished");
                this.b.add(map0);
                for(Object object0: this.b) {
                    this.f.zze(((Map)object0));
                }
                this.d = true;
            }
        }
    }

    public final void zzf() {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbL)).booleanValue() && !((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue() && !this.c) {
                Map map0 = this.a();
                map0.put("action", "init_started");
                this.b.add(map0);
                this.c = true;
            }
        }
    }
}

