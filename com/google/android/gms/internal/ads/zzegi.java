package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public final class zzegi implements zzefl {
    public final Context a;
    public final zzcws b;
    public final Executor c;

    public zzegi(Context context0, zzcws zzcws0, Executor executor0) {
        this.a = context0;
        this.b = zzcws0;
        this.c = executor0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final Object zza(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci, zzeit {
        View view0;
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl0.zzai) {
            view0 = ((zzfcy)zzefg0.zzb).zza();
        }
        else {
            zzbuj zzbuj0 = ((zzfcy)zzefg0.zzb).zzc();
            if(zzbuj0 == null) {
                zzcfi.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfci(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                view0 = (View)ObjectWrapper.unwrap(zzbuj0.zze());
                boolean z = zzbuj0.zzf();
            }
            catch(RemoteException remoteException0) {
                throw new zzfci(remoteException0);
            }
            if(view0 == null) {
                throw new zzfci(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
            }
            if(z) {
                zzfvl zzfvl0 = zzfvc.zzn(zzfvc.zzi(null), new zzegh(this, view0, zzfbl0), zzcfv.zze);
                try {
                    view0 = (View)zzfvl0.get();
                    goto label_19;
                }
                catch(InterruptedException | ExecutionException interruptedException0) {
                    throw new zzfci(interruptedException0);
                }
                throw new zzfci(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
            }
        }
    label_19:
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, zzefg0.zza);
        zzcwc zzcwc0 = new zzcwc(view0, null, new zzegg(((zzfcy)zzefg0.zzb)), ((zzfbm)zzfbl0.zzv.get(0)));
        zzcvw zzcvw0 = this.b.zza(zzcym0, zzcwc0);
        zzcvw0.zzg().zza(view0);
        zzcvw0.zzd().zzj(new zzctj(((zzfcy)zzefg0.zzb)), this.c);
        zzekf zzekf0 = zzcvw0.zzi();
        ((zzegz)zzefg0.zzc).zzc(zzekf0);
        return zzcvw0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzefl
    public final void zzb(zzfbx zzfbx0, zzfbl zzfbl0, zzefg zzefg0) throws zzfci {
        zzq zzq1;
        zzq zzq0 = zzfbx0.zza.zza.zze;
        Context context0 = this.a;
        if(zzq0.zzn) {
            zzq1 = new zzq(context0, zzb.zzd(zzq0.zze, zzq0.zzb));
        }
        else {
            zzq1 = !((Boolean)zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() || !zzfbl0.zzai ? zzfch.zza(context0, zzfbl0.zzv) : new zzq(context0, zzb.zze(zzq0.zze, zzq0.zzb));
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzgB)).booleanValue() && zzfbl0.zzai) {
            String s = zzbu.zzl(zzfbl0.zzt);
            ((zzfcy)zzefg0.zzb).zzm(this.a, zzq1, zzfbx0.zza.zza.zzd, zzfbl0.zzw.toString(), s, ((zzbug)zzefg0.zzc));
            return;
        }
        String s1 = zzbu.zzl(zzfbl0.zzt);
        ((zzfcy)zzefg0.zzb).zzl(this.a, zzq1, zzfbx0.zza.zza.zzd, zzfbl0.zzw.toString(), s1, ((zzbug)zzefg0.zzc));
    }
}

