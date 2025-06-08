package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdpt implements Callable {
    public final zzdpu zza;
    public final zzfvl zzb;
    public final zzfvl zzc;
    public final zzfvl zzd;
    public final zzfvl zze;
    public final zzfvl zzf;
    public final JSONObject zzg;
    public final zzfvl zzh;
    public final zzfvl zzi;
    public final zzfvl zzj;
    public final zzfvl zzk;

    public zzdpt(zzdpu zzdpu0, zzfvl zzfvl0, zzfvl zzfvl1, zzfvl zzfvl2, zzfvl zzfvl3, zzfvl zzfvl4, JSONObject jSONObject0, zzfvl zzfvl5, zzfvl zzfvl6, zzfvl zzfvl7, zzfvl zzfvl8) {
        this.zza = zzdpu0;
        this.zzb = zzfvl0;
        this.zzc = zzfvl1;
        this.zzd = zzfvl2;
        this.zze = zzfvl3;
        this.zzf = zzfvl4;
        this.zzg = jSONObject0;
        this.zzh = zzfvl5;
        this.zzi = zzfvl6;
        this.zzj = zzfvl7;
        this.zzk = zzfvl8;
    }

    @Override
    public final Object call() {
        zzfvl zzfvl0 = this.zzi;
        zzfvl zzfvl1 = this.zzj;
        zzfvl zzfvl2 = this.zzk;
        zzdnh zzdnh0 = (zzdnh)this.zzb.get();
        zzdnh0.zzN(((List)this.zzc.get()));
        zzdnh0.zzK(((zzblb)this.zzd.get()));
        zzdnh0.zzO(((zzblb)this.zze.get()));
        zzdnh0.zzH(((zzbkt)this.zzf.get()));
        zzdnh0.zzQ(zzdqh.zzj(this.zzg));
        zzdnh0.zzJ(zzdqh.zzi(this.zzg));
        zzcli zzcli0 = (zzcli)this.zzh.get();
        if(zzcli0 != null) {
            zzdnh0.zzY(zzcli0);
            zzdnh0.zzX(zzcli0.zzH());
            zzdnh0.zzW(zzcli0.zzs());
        }
        zzcli zzcli1 = (zzcli)zzfvl0.get();
        if(zzcli1 != null) {
            zzdnh0.zzM(zzcli1);
            zzdnh0.zzZ(zzcli1.zzH());
        }
        zzcli zzcli2 = (zzcli)zzfvl1.get();
        if(zzcli2 != null) {
            zzdnh0.zzR(zzcli2);
        }
        for(Object object0: ((List)zzfvl2.get())) {
            zzdql zzdql0 = (zzdql)object0;
            if(zzdql0.zza == 1) {
                zzdnh0.zzU(zzdql0.zzb, zzdql0.zzc);
            }
            else {
                zzdnh0.zzL(zzdql0.zzb, zzdql0.zzd);
            }
        }
        return zzdnh0;
    }
}

