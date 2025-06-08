package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

public final class v5 implements zzddc, zzfuy {
    public boolean i;
    public final Object j;
    public final Object k;

    public v5(zzefg zzefg0, zzcga zzcga0) {
        this.j = zzefg0;
        this.k = zzcga0;
        this.i = false;
    }

    public v5(zzfhs zzfhs0, zzfhh zzfhh0, boolean z) {
        this.j = zzfhs0;
        this.k = zzfhh0;
        this.i = z;
    }

    public void a(zze zze0) {
        int v = 1;
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzev)).booleanValue()) {
                v = 3;
            }
            zzefh zzefh0 = new zzefh(v, zze0);
            ((zzcga)this.k).zze(zzefh0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddc
    public void zza(int v) {
        synchronized(this) {
            if(this.i) {
                return;
            }
            this.i = true;
            this.a(new zze(v, "Error from: " + ((zzefg)this.j).zza + ", code: " + v, "undefined", null, null));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public void zza(Throwable throwable0) {
        zzfhh zzfhh0 = (zzfhh)this.k;
        if(zzfhh0.zzh()) {
            zzfhh0.zze(false);
            zzfhs zzfhs0 = (zzfhs)this.j;
            zzfhs0.zza(zzfhh0);
            if(this.i) {
                zzfhs0.zzg();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddc
    public void zzb(zze zze0) {
        synchronized(this) {
            if(this.i) {
                return;
            }
            this.i = true;
            this.a(zze0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfuy
    public void zzb(Object object0) {
        ((zzfhh)this.k).zze(true);
        zzfhs zzfhs0 = (zzfhs)this.j;
        zzfhs0.zza(((zzfhh)this.k));
        if(this.i) {
            zzfhs0.zzg();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddc
    public void zzc(int v, String s) {
        synchronized(this) {
            if(this.i) {
                return;
            }
            this.i = true;
            if(s == null) {
                s = "Error from: " + ((zzefg)this.j).zza + ", code: " + v;
            }
            this.a(new zze(v, s, "undefined", null, null));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddc
    public void zzd() {
        synchronized(this) {
            ((zzcga)this.k).zzd(null);
        }
    }
}

