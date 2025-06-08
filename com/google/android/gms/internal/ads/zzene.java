package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.ScheduledExecutorService;

public final class zzene implements zzemx {
    public final zzfcb a;
    public final zzcnf b;
    public final Context c;
    public final zzemu d;
    public final zzfhu e;
    public zzcyl f;

    public zzene(zzcnf zzcnf0, Context context0, zzemu zzemu0, zzfcb zzfcb0) {
        this.b = zzcnf0;
        this.c = context0;
        this.d = zzemu0;
        this.a = zzfcb0;
        this.e = zzcnf0.zzy();
        zzfcb0.zzu(zzemu0.zzd());
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        return this.f != null && this.f.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzemx
    public final boolean zzb(zzl zzl0, String s, zzemv zzemv0, zzemw zzemw0) throws RemoteException {
        zzfhs zzfhs1;
        Context context0 = this.c;
        boolean z = zzs.zzD(context0);
        zzcnf zzcnf0 = this.b;
        if(z && zzl0.zzs == null) {
            zzcfi.zzg("Failed to load the ad because app ID is missing.");
            zzcnf0.zzA().execute(new zzemz(this));
            return false;
        }
        if(s == null) {
            zzcfi.zzg("Ad unit ID should not be null for NativeAdLoader.");
            zzcnf0.zzA().execute(new zzena(this));
            return false;
        }
        zzfcx.zza(context0, zzl0.zzf);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzl0.zzf) {
            zzcnf0.zzk().zzl(true);
        }
        this.a.zzE(zzl0);
        this.a.zzz(((zzemy)zzemv0).zza);
        zzfcd zzfcd0 = this.a.zzG();
        zzfhh zzfhh0 = zzfhg.zzb(context0, zzfhr.zzf(zzfcd0), 8, zzl0);
        zzbz zzbz0 = zzfcd0.zzn;
        zzemu zzemu0 = this.d;
        if(zzbz0 != null) {
            zzemu0.zzd().zzi(zzbz0);
        }
        zzdlt zzdlt0 = zzcnf0.zzh();
        zzdbd zzdbd0 = new zzdbd();
        zzdbd0.zzc(context0);
        zzdbd0.zzf(zzfcd0);
        zzdlt0.zzf(zzdbd0.zzg());
        zzdhd zzdhd0 = new zzdhd();
        zzdhd0.zzk(zzemu0.zzd(), zzcnf0.zzA());
        zzdlt0.zze(zzdhd0.zzn());
        zzdlt0.zzd(zzemu0.zzc());
        zzdlt0.zzc(new zzcvs(null));
        zzdlu zzdlu0 = zzdlt0.zzg();
        if(((Boolean)zzbji.zzc.zze()).booleanValue()) {
            zzfhs zzfhs0 = zzdlu0.zzf();
            zzfhs0.zzh(8);
            zzfhs0.zzb(zzl0.zzp);
            zzfhs1 = zzfhs0;
        }
        else {
            zzfhs1 = null;
        }
        zzcnf0.zzw().zzc(1);
        zzgrc.zzb(zzcfv.zza);
        ScheduledExecutorService scheduledExecutorService0 = zzcnf0.zzB();
        zzcza zzcza0 = zzdlu0.zza();
        zzfvl zzfvl0 = zzcza0.zzh(zzcza0.zzi());
        zzcyl zzcyl0 = new zzcyl(zzcfv.zza, scheduledExecutorService0, zzfvl0);
        this.f = zzcyl0;
        zzcyl0.zze(new z5(this, zzemw0, zzfhs1, zzfhh0, zzdlu0));
        return true;
    }
}

