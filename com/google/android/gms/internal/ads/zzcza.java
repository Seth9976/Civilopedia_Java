package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

public final class zzcza {
    public final zzeat a;
    public final zzfcd b;
    public final zzfgf c;
    public final zzcsn d;
    public final zzeiv e;
    public final zzdgx f;
    public zzfbx g;
    public final zzebx h;
    public final zzdaz i;
    public final zzfvm j;
    public final zzebk k;
    public final zzefi l;

    public zzcza(zzeat zzeat0, zzfcd zzfcd0, zzfgf zzfgf0, zzcsn zzcsn0, zzeiv zzeiv0, zzdgx zzdgx0, zzfbx zzfbx0, zzebx zzebx0, zzdaz zzdaz0, zzfvm zzfvm0, zzebk zzebk0, zzefi zzefi0) {
        this.a = zzeat0;
        this.b = zzfcd0;
        this.c = zzfgf0;
        this.d = zzcsn0;
        this.e = zzeiv0;
        this.f = zzdgx0;
        this.g = zzfbx0;
        this.h = zzebx0;
        this.i = zzdaz0;
        this.j = zzfvm0;
        this.k = zzebk0;
        this.l = zzefi0;
    }

    public final zze zza(Throwable throwable0) {
        return zzfdc.zzb(throwable0, this.l);
    }

    public final zzdgx zzc() {
        return this.f;
    }

    public final zzfvl zze(zzfdv zzfdv0) {
        zzfvl zzfvl0 = this.i.zzc();
        zzfvl zzfvl1 = this.c.zzb(zzffz.zzu, zzfvl0).zzf(new zzcyx(this, zzfdv0)).zza();
        zzfvc.zzr(zzfvl1, new j4(this, 0), this.j);
        return zzfvl1;
    }

    public final zzfvl zzg(zzbzv zzbzv0) {
        zzfvl zzfvl0 = this.h.zzf(zzbzv0);
        zzfvl zzfvl1 = this.c.zzb(zzffz.zzv, zzfvl0).zza();
        zzfvc.zzr(zzfvl1, new j4(this, 1), this.j);
        return zzfvl1;
    }

    public final zzfvl zzh(zzfvl zzfvl0) {
        zzffw zzffw0 = this.c.zzb(zzffz.zzd, zzfvl0).zze(new zzcyw(this)).zzf(this.e);
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzex)).booleanValue()) {
            zzffw0 = zzffw0.zzi(((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzey)))))), TimeUnit.SECONDS);
        }
        return zzffw0.zza();
    }

    public final zzfvl zzi() {
        zzl zzl0 = this.b.zzd;
        return zzl0.zzx == null && zzl0.zzs == null ? this.zzj(this.i.zzc()) : zzffp.zzc(this.a.zza(), zzffz.zzx, this.c).zza();
    }

    public final zzfvl zzj(zzfvl zzfvl0) {
        zzfbx zzfbx0 = this.g;
        zzfgf zzfgf0 = this.c;
        if(zzfbx0 != null) {
            return zzffp.zzc(zzfvc.zzi(zzfbx0), zzffz.zzc, zzfgf0).zza();
        }
        zzt.zzc().zzj();
        return zzfgf0.zzb(zzffz.zzc, zzfvl0).zzf(new zzcyv(this.k)).zza();
    }

    public final void zzk(zzfbx zzfbx0) {
        this.g = zzfbx0;
    }
}

