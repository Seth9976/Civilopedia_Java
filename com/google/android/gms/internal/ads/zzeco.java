package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

public final class zzeco extends zzbzm {
    public final Context i;
    public final Executor j;
    public final zzfvm k;
    public final zzcag l;
    public final zzcsm m;
    public final ArrayDeque n;
    public final zzfhu o;
    public final zzcah p;

    public zzeco(Context context0, Executor executor0, zzfvm zzfvm0, zzcah zzcah0, zzcsm zzcsm0, zzcag zzcag0, ArrayDeque arrayDeque0, zzect zzect0, zzfhu zzfhu0, byte[] arr_b) {
        zzbhz.zzc(context0);
        this.i = context0;
        this.j = executor0;
        this.k = zzfvm0;
        this.p = zzcah0;
        this.l = zzcag0;
        this.m = zzcsm0;
        this.n = arrayDeque0;
        this.o = zzfhu0;
    }

    public final zzecl b(String s) {
        synchronized(this) {
            Iterator iterator0 = this.n.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zzecl zzecl0 = (zzecl)object0;
                if(zzecl0.zzd.equals(s)) {
                    iterator0.remove();
                    return zzecl0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    public final zzecl c(String s) {
        synchronized(this) {
            Iterator iterator0 = this.n.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                zzecl zzecl0 = (zzecl)object0;
                if(zzecl0.zzc.equals(s)) {
                    iterator0.remove();
                    return zzecl0;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
    }

    public final void d() {
        synchronized(this) {
            int v1 = ((Long)zzbjv.zzc.zze()).intValue();
            while(this.n.size() >= v1) {
                this.n.removeFirst();
            }
        }
    }

    public final void e(zzfvl zzfvl0, zzbzr zzbzr0) {
        zzfvc.zzr(zzfvc.zzn(zzfvl0, new zzeci(this), zzcfv.zza), new E9(zzbzr0, 23), zzcfv.zzf);
    }

    public final zzfvl zzb(zzbzv zzbzv0, int v) {
        if(!((Boolean)zzbjv.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Split request is disabled."));
        }
        zzfdv zzfdv0 = zzbzv0.zzi;
        if(zzfdv0 == null) {
            return zzfvc.zzh(new Exception("Pool configuration missing from request."));
        }
        if(zzfdv0.zzc != 0 && zzfdv0.zzd != 0) {
            zzcfo zzcfo0 = zzcfo.zza();
            zzbta zzbta0 = zzt.zzf().zzb(this.i, zzcfo0, this.o);
            zzety zzety0 = this.m.zzp(zzbzv0, v);
            zzfgf zzfgf0 = zzety0.zzc();
            zzebz zzebz0 = new zzebz(zzety0);
            zzfvl zzfvl0 = zzfvc.zzi(zzbzv0.zza);
            zzffk zzffk0 = zzfgf0.zzb(zzffz.zze, zzfvl0).zzf(zzebz0).zze(zzeca.zza).zza();
            zzfhs zzfhs0 = zzety0.zzd();
            zzfhh zzfhh0 = zzfhg.zza(this.i, 9);
            zzbsq zzbsq0 = zzbta0.zza("AFMA_getAdDictionary", zzbsx.zza, zzecf.zza);
            zzfhr.zzd(zzffk0, zzfhh0);
            zzffk zzffk1 = zzfgf0.zzb(zzffz.zzg, zzffk0).zzf(zzbsq0).zza();
            zzfhr.zzc(zzffk1, zzfhs0, zzfhh0);
            return zzfgf0.zza(zzffz.zzw, new zzfvl[]{zzffk0, zzffk1}).zza(new zzece(this, zzffk1, zzffk0, zzbzv0, zzfhh0)).zza();
        }
        return zzfvc.zzh(new Exception("Caching is disabled."));
    }

    public final zzfvl zzc(zzbzv zzbzv0, int v) {
        zzfvl zzfvl1;
        zzcfo zzcfo0 = zzcfo.zza();
        Context context0 = this.i;
        zzbta zzbta0 = zzt.zzf().zzb(context0, zzcfo0, this.o);
        zzety zzety0 = this.m.zzp(zzbzv0, v);
        zzbsq zzbsq0 = zzbta0.zza("google.afma.response.normalize", zzecn.zza, zzbsx.zzb);
        zzecl zzecl0 = null;
        if(((Boolean)zzbjv.zza.zze()).booleanValue()) {
            if(((Boolean)zzbjv.zzd.zze()).booleanValue()) {
                zzecl0 = this.c(zzbzv0.zzh);
            }
            else if(!TextUtils.isEmpty(zzbzv0.zzj)) {
                zzecl0 = this.b(zzbzv0.zzj);
            }
            if(zzecl0 == null) {
                zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        }
        else if(zzbzv0.zzj != null && !zzbzv0.zzj.isEmpty()) {
            zze.zza("Request contained a PoolKey but split request is disabled.");
        }
        zzfhh zzfhh0 = zzecl0 == null ? zzfhg.zza(context0, 9) : zzecl0.zze;
        zzfhs zzfhs0 = zzety0.zzd();
        zzfhs0.zzd(zzbzv0.zza.getStringArrayList("ad_types"));
        zzecv zzecv0 = new zzecv(zzbzv0.zzg, zzfhs0, zzfhh0);
        new zzecs(this.i, zzbzv0.zzb.zza, this.p, v, null);
        zzfgf zzfgf0 = zzety0.zzc();
        zzfhh zzfhh1 = zzfhg.zza(context0, 11);
        if(zzecl0 == null) {
            zzebz zzebz0 = new zzebz(zzety0);
            zzfvl zzfvl0 = zzfvc.zzi(zzbzv0.zza);
            zzffk zzffk0 = zzfgf0.zzb(zzffz.zze, zzfvl0).zzf(zzebz0).zze(zzeca.zza).zza();
            zzbsq zzbsq1 = zzbta0.zza("AFMA_getAdDictionary", zzbsx.zza, zzecf.zza);
            zzfhr.zzd(zzffk0, zzfhh0);
            zzffk zzffk1 = zzfgf0.zzb(zzffz.zzg, zzffk0).zzf(zzbsq1).zza();
            zzfhr.zzc(zzffk1, zzfhs0, zzfhh0);
            zzfhh zzfhh2 = zzfhg.zza(context0, 10);
            zzffk zzffk2 = zzfgf0.zza(zzffz.zzh, new zzfvl[]{zzffk1, zzffk0}).zza(new zzecc(zzffk0, zzffk1)).zze(zzecv0).zze(new zzfhn(zzfhh2)).zze(null).zza();
            zzfhr.zza(zzffk2, zzfhs0, zzfhh2);
            zzfhr.zzd(zzffk2, zzfhh1);
            zzfvl1 = zzfgf0.zza(zzffz.zzi, new zzfvl[]{zzffk0, zzffk1, zzffk2}).zza(new zzecd(zzffk2, zzffk0, zzffk1)).zzf(zzbsq0).zza();
        }
        else {
            zzecu zzecu0 = new zzecu(zzecl0.zzb, zzecl0.zza);
            zzfhh zzfhh3 = zzfhg.zza(context0, 10);
            zzfvl zzfvl2 = zzfvc.zzi(zzecu0);
            zzffk zzffk3 = zzfgf0.zzb(zzffz.zzh, zzfvl2).zze(zzecv0).zze(new zzfhn(zzfhh3)).zze(null).zza();
            zzfhr.zza(zzffk3, zzfhs0, zzfhh3);
            zzfvl zzfvl3 = zzfvc.zzi(zzecl0);
            zzfhr.zzd(zzffk3, zzfhh1);
            zzfvl1 = zzfgf0.zza(zzffz.zzi, new zzfvl[]{zzffk3, zzfvl3}).zza(new zzech(zzffk3, zzfvl3)).zzf(zzbsq0).zza();
        }
        zzfhr.zza(zzfvl1, zzfhs0, zzfhh1);
        return zzfvl1;
    }

    public final zzfvl zzd(zzbzv zzbzv0, int v) {
        zzcfo zzcfo0 = zzcfo.zza();
        Context context0 = this.i;
        zzbta zzbta0 = zzt.zzf().zzb(context0, zzcfo0, this.o);
        if(!((Boolean)zzbka.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Signal collection disabled."));
        }
        zzety zzety0 = this.m.zzp(zzbzv0, v);
        zzetj zzetj0 = zzety0.zza();
        zzbsq zzbsq0 = zzbta0.zza("google.afma.request.getSignals", zzbsx.zza, zzbsx.zzb);
        zzfhh zzfhh0 = zzfhg.zza(context0, 22);
        zzfgf zzfgf0 = zzety0.zzc();
        zzfvl zzfvl0 = zzfvc.zzi(zzbzv0.zza);
        zzfvl zzfvl1 = zzfgf0.zzb(zzffz.zzj, zzfvl0).zze(new zzfhn(zzfhh0)).zzf(new zzecg(zzetj0)).zzb(zzffz.zzk).zzf(zzbsq0).zza();
        zzfhs zzfhs0 = zzety0.zzd();
        zzfhs0.zzd(zzbzv0.zza.getStringArrayList("ad_types"));
        zzfhr.zzb(zzfvl1, zzfhs0, zzfhh0);
        return zzfvl1;
    }

    @Override  // com.google.android.gms.internal.ads.zzbzn
    public final void zze(zzbzv zzbzv0, zzbzr zzbzr0) {
        this.e(this.zzb(zzbzv0, Binder.getCallingUid()), zzbzr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbzn
    public final void zzf(zzbzv zzbzv0, zzbzr zzbzr0) {
        this.e(this.zzd(zzbzv0, Binder.getCallingUid()), zzbzr0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbzn
    public final void zzg(zzbzv zzbzv0, zzbzr zzbzr0) {
        zzfvl zzfvl0 = this.zzc(zzbzv0, Binder.getCallingUid());
        this.e(zzfvl0, zzbzr0);
        if(((Boolean)zzbjn.zzg.zze()).booleanValue()) {
            zzfvl0.zzc(() -> zzcfy.zza(this.l.zza(), "persistFlags"), this.k);
            return;
        }
        zzfvl0.zzc(() -> zzcfy.zza(this.l.zza(), "persistFlags"), this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzbzn
    public final void zzh(String s, zzbzr zzbzr0) {
        this.e(this.zzi(s), zzbzr0);
    }

    public final zzfvl zzi(String s) {
        if(!((Boolean)zzbjv.zza.zze()).booleanValue()) {
            return zzfvc.zzh(new Exception("Split request is disabled."));
        }
        c5 c50 = new c5();  // 初始化器: Ljava/io/InputStream;-><init>()V
        return (((Boolean)zzbjv.zzd.zze()).booleanValue() ? this.c(s) : this.b(s)) == null ? zzfvc.zzh(new Exception("URL to be removed not found for cache key: " + s)) : zzfvc.zzi(c50);
    }
}

